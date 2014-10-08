/*
 * This Class handles all conversions from BETS to other specifications.
 * Convert methods for BETS to: iPLant, BioExtract, Galaxy, Seq, BLD
 * 
 */
package org.usd.edu.btl.converters;

import java.util.ArrayList;
import java.util.List;
import org.usd.edu.btl.betsconverter.BETSV1.Application;
import org.usd.edu.btl.betsconverter.BETSV1.Availability;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BETSV1.BLD_categories;
import org.usd.edu.btl.betsconverter.BETSV1.BLD_tags;
import org.usd.edu.btl.betsconverter.BETSV1.Bld_specific;
import org.usd.edu.btl.betsconverter.BETSV1.Category;
import org.usd.edu.btl.betsconverter.BETSV1.Constraint;
import org.usd.edu.btl.betsconverter.BETSV1.Input;
import org.usd.edu.btl.betsconverter.BETSV1.Iplant_specific;
import org.usd.edu.btl.betsconverter.BETSV1.Link;
import org.usd.edu.btl.betsconverter.BETSV1.Method;
import org.usd.edu.btl.betsconverter.BETSV1.Operating_system;
import org.usd.edu.btl.betsconverter.BETSV1.Output;
import org.usd.edu.btl.betsconverter.BETSV1.Programming_language;
import org.usd.edu.btl.betsconverter.BETSV1.Reference;
import org.usd.edu.btl.betsconverter.BETSV1.Related_link;
import org.usd.edu.btl.betsconverter.BETSV1.Seq_specific;
import org.usd.edu.btl.betsconverter.BLDV1.BLDV1;
import org.usd.edu.btl.betsconverter.BLDV1.Journal;
import org.usd.edu.btl.betsconverter.BLDV1.Set;
import org.usd.edu.btl.betsconverter.BLDV1.Tag;
import org.usd.edu.btl.betsconverter.BioExtV1.BioExtV1;
import org.usd.edu.btl.betsconverter.BioExtV1.Inputs;
import org.usd.edu.btl.betsconverter.BioExtV1.Outputs;
import org.usd.edu.btl.betsconverter.GalaxyV1.Tool;
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;
import org.usd.edu.btl.betsconverter.iPlantV1.Details;
import org.usd.edu.btl.betsconverter.iPlantV1.Details_;
import org.usd.edu.btl.betsconverter.iPlantV1.Details__;
import org.usd.edu.btl.betsconverter.iPlantV1.IplantV1;
import org.usd.edu.btl.betsconverter.iPlantV1.Semantics;
import org.usd.edu.btl.betsconverter.iPlantV1.Semantics_;
import org.usd.edu.btl.betsconverter.iPlantV1.Semantics__;
import org.usd.edu.btl.betsconverter.iPlantV1.Value;
import org.usd.edu.btl.betsconverter.iPlantV1.Value_;
import org.usd.edu.btl.betsconverter.iPlantV1.Value__;

/**
 *
 * @author Tyler.Jones
 */
public class BETSConverter {

    /**
     * Converts BETS to iPlant
     * @param bets
     * @return
     */
    public static IplantV1 toIplant(BETSV1 bets) {
        System.out.println("== IN betsToIplant() ==");
        IplantV1 iplant = new IplantV1();

        iplant.setName(bets.getName());
        iplant.setParallelism(bets.getParallelism());
        iplant.setVersion(bets.getVersion());

//bets link to iplant helpURI
        List<Link> linksFromBets = new ArrayList<>();

        linksFromBets = bets.getLinks();
        for (int i = 0; i < linksFromBets.size(); i++) {
            Link betsLink = linksFromBets.get(i);
            if (betsLink.getType().equalsIgnoreCase("iPlant")) {
                iplant.setHelpURI(betsLink.getUrl());
            }
        }

        iplant.setLabel(bets.getDisplay_name());

        //get some iPlant specific stuff
        Iplant_specific ipSpec = new Iplant_specific();
        ipSpec = bets.getIplant_specific();

        iplant.setDefaultprocessors(ipSpec.getDefaultprocessors());
        iplant.setDefaultmemory(ipSpec.getDefaultmemory());
        iplant.setDefaultrequestedtime(ipSpec.getDefaultrequestedtime());

        iplant.setExecutionType(ipSpec.getExecutionType());
        iplant.setExecutionHost(ipSpec.getExecutionHost());
        iplant.setDeploymentPath(ipSpec.getDeploymentPath());
        iplant.setTemplatePath(ipSpec.getTemplatePath());
        iplant.setTestPath(ipSpec.getTestPath());
        iplant.setCheckpointable(ipSpec.getCheckpointable());
        iplant.setModules(ipSpec.getModules());
        iplant.setOntology(ipSpec.getOntology());
        iplant.setShortDescription(bets.getSummary());
        iplant.setLongDescription(bets.getDescription());
        iplant.setAuthor(bets.getAuthor());
        //iplant.setTags(bets.);

        Category obj = bets.getCategory();

        iplant.setTags(obj.getTags());

//available string ...check
        List<Availability> betsAvail = new ArrayList<>();
        betsAvail = bets.getAvailability();
        Availability avail = betsAvail.get(0);

        iplant.setAvailable(avail.getStatus());

        //BETS inputs to IPLANT inputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Input> betsInputs; //a list of BETS inputs
        List<org.usd.edu.btl.betsconverter.iPlantV1.Input> iplantInput = new ArrayList<>();

        betsInputs = bets.getInputs(); //get the array of BETS inputs from BETS

        for (int i = 0; i < betsInputs.size(); i++) { //for each betsInput
            org.usd.edu.btl.betsconverter.BETSV1.Input betsInput = betsInputs.get(i);  //get the ith input
            org.usd.edu.btl.betsconverter.iPlantV1.Input ipInput = new org.usd.edu.btl.betsconverter.iPlantV1.Input();  //create an iPlant Input object

            ipInput.setId(betsInput.getName()); //set the input id to the bets input Name
            ipInput.setDefaultvalue(betsInput.getDefault()); //check

            //set iplant input details
            Details ipInputDetails = new Details();
            ipInputDetails.setLabel(betsInput.getLabel());
            ipInputDetails.setDescription(betsInput.getDescription());
            ipInputDetails.setVisible(betsInput.getVisible());
            ipInput.setDetails(ipInputDetails);

            //set ip Input Values
            Value ipInputValue = new Value();
            ipInputValue.setValidator(betsInput.getValidator());
            ipInputValue.setRequired(betsInput.getRequired());
            //NO, need to get from contraint with Label Default

            //run through constraints
            List<Constraint> betsInputCons = new ArrayList<>();
            betsInputCons = betsInput.getConstraint();

            Semantics ipInputSemantics = new Semantics();
            List<String> ipOnts = new ArrayList<>(); //create new List of Ontologies
            List<String> ipSemFileTypes = new ArrayList<>();
            for (int j = 0; j < betsInputCons.size(); j++) {
                Constraint betsInputCon = betsInputCons.get(j);
                String label = betsInputCon.getLabel();

                if (label.equals("MinCardinality")) {
                    ipInputSemantics.setMincardinality(Integer.parseInt(betsInputCon.getValue()));
                } else if (label.equals("MaxCardinality")) {
                    ipInputSemantics.setMaxcardinality(Integer.parseInt(betsInputCon.getValue()));
                } else if (label.equalsIgnoreCase("Ontology")) {
                    ipOnts.add(betsInputCon.getValue()); //get ontology value
                    //set jth ontology                  
                } else if (label.equals("Filetype")) {
                    ipSemFileTypes.add(betsInputCon.getValue());
                } else if (label.equals("Default")) {
                    ipInputValue.setDefault(betsInputCon.getValue());

                } else {
                    ipInputValue.setVisible(Boolean.valueOf(betsInputCon.getValue()));
                }

            }
            ipInputSemantics.setOntology(ipOnts); //set ontologies of ipInput Semantics Object
            ipInputSemantics.setFiletypes(ipSemFileTypes); //set filetypes of ipInput Semantics Object

            ipInput.setValue(ipInputValue); //set ipInput VALUE object
            ipInput.setSemantics(ipInputSemantics); //set ipInput Semantics

            iplantInput.add(ipInput);
        }

        iplant.setInputs(iplantInput);

//bets to iplant parameters
        List<org.usd.edu.btl.betsconverter.BETSV1.Parameter> betsParams = bets.getParameters();
        List<org.usd.edu.btl.betsconverter.iPlantV1.Parameter> ipParams = new ArrayList<>();

        for (int i = 0; i < betsParams.size(); i++) {
            org.usd.edu.btl.betsconverter.BETSV1.Parameter betsParam = betsParams.get(i);
            org.usd.edu.btl.betsconverter.iPlantV1.Parameter ipParam = new org.usd.edu.btl.betsconverter.iPlantV1.Parameter();

            Semantics_ ipParamSemantics = new Semantics_();
            List<String> ipParamOnts = new ArrayList<>(); //create new List of Ontologies

            ipParam.setId(betsParam.getName());
            ipParam.setDefaultvalue(betsParam.getDefault());

            Value_ ipParamValue = new Value_();
            ipParamValue.setValidator(betsParam.getValidator());
            ipParamValue.setVisible(Boolean.valueOf(betsParam.getVisible()));
            ipParamValue.setRequired(Boolean.valueOf(betsParam.getRequired()));
            ipParamValue.setType(betsParam.getType());

            Details_ ipParamDetail = new Details_();
            ipParamDetail.setLabel(betsParam.getLabel());
            ipParamDetail.setDescription(betsParam.getDescription());

            //get bets parameter constraints and set Iplant according to how it's mapped
            List<Constraint> paramConstraints = betsParam.getConstraint();
            for (int j = 0; j < paramConstraints.size(); j++) {
                Constraint paramCon = paramConstraints.get(j);
                String label = paramCon.getLabel();

                if (label.equals("Value-Default")) {
                    ipParamValue.setDefault(paramCon.getValue());
                } else if (label.equals("Ontology")) {
                    ipParamOnts.add(paramCon.getValue());
                }

            }
            ipParamSemantics.setOntology(ipParamOnts);
            ipParam.setValue(ipParamValue);
            ipParam.setDetails(ipParamDetail);
            ipParam.setSemantics(ipParamSemantics);
            ipParams.add(ipParam);

        }

        iplant.setParameters(ipParams);

//bets to iplant outputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Output> betsOutputs = bets.getOutputs();
        List<org.usd.edu.btl.betsconverter.iPlantV1.Output> iplantOutputs = new ArrayList<>();

        for (int i = 0; i < betsOutputs.size(); i++) {
            org.usd.edu.btl.betsconverter.BETSV1.Output betsOutput = betsOutputs.get(i);
            org.usd.edu.btl.betsconverter.iPlantV1.Output ipOutput = new org.usd.edu.btl.betsconverter.iPlantV1.Output();

            List<String> ipOutOnts = new ArrayList<>(); //create new List of Ontologies
            List<String> ipOutFileTypes = new ArrayList<>();

            Details__ ipOutDetails = new Details__();
            Value__ ipOutValue = new Value__();
            Semantics__ ipOutSemantics = new Semantics__();

            ipOutput.setId(betsOutput.getName());
            ipOutput.setDefaultvalue(betsOutput.getValue());
            //get bets parameter constraints and set Iplant according to how it's mapped
            List<Constraint> outputConstraints = betsOutput.getConstraint();
            for (int j = 0; j < outputConstraints.size(); j++) {

                Constraint outputCon = outputConstraints.get(j);
                String label = outputCon.getLabel();

                if (label.equals("Filetype")) {
                    ipOutFileTypes.add(outputCon.getValue());
                } else if (label.equals("Ontology")) {
                    ipOutOnts.add(outputCon.getValue());
                } else if (label.equals("MinCardinality")) {
                    ipOutSemantics.setMinCardinality(Integer.parseInt(outputCon.getValue()));
                } else if (label.equals("MaxCardinality")) {
                    ipOutSemantics.setMaxCardinality(Integer.parseInt(outputCon.getValue()));
                } else if (label.equals("Validator")) {
                    ipOutValue.setValidator(outputCon.getValue());
                } else if (label.equals("Default")) {
                    ipOutValue.setDefault(outputCon.getValue());
                } else if (label.equals("Description")) {
                    ipOutDetails.setDescription(outputCon.getValue());
                } else {
                    //label.equals("Label");
                    ipOutDetails.setLabel(outputCon.getValue());
                }

            }

            ipOutput.setDetails(ipOutDetails);
            ipOutSemantics.setFileTypes(ipOutFileTypes);
            ipOutSemantics.setOntology(ipOutOnts);
            ipOutput.setSemantics(ipOutSemantics);

            ipOutput.setValue(ipOutValue);

            iplantOutputs.add(ipOutput);

        }
        iplant.setOutputs(iplantOutputs);

        return iplant;
    }
    /**
     * Converts BETS to Galaxy
     * @param bets
     */
    public static Tool toGalaxy(BETSV1 bets) {
        Tool galaxyTool = new Tool();
        galaxyTool.setId(bets.getName());
        galaxyTool.setName(bets.getDisplay_name());
        galaxyTool.setVersion(bets.getVersion());
        galaxyTool.setDescription(bets.getDescription());
        galaxyTool.setHelp(bets.getSummary());
        
        return galaxyTool;
    }
    
    
    /**
     * Converts BETS TO BIO EXTRACT
     *
     * @param bets
     * @return
     */
    public static BioExtV1 toBioExtract(BETSV1 bets) {
        BioExtV1 bioExt = new BioExtV1();

        //get name and id for BioExt from bets Name.  Name = *Name*-*id*

        bioExt.setName(bets.getName()); //set the name to index 0 - (indexOfDash - 1) 
        //bioExt.setId(Integer.parseInt(toolName.substring(dash + 1))); //Get substring from dash + 1 to end of string, parseInt
        bioExt.setId(Integer.parseInt(bets.getVersion()));
        bioExt.setDescription(bets.getDescription());

        //set inputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Input> betsInputs = bets.getInputs();
        List<org.usd.edu.btl.betsconverter.BioExtV1.Inputs> bioExtInputs = new ArrayList<>();

        for (int i = 0; i < betsInputs.size(); i++) {
            Input betsInput = betsInputs.get(i); //get first bets input
            Inputs bExtInput = new Inputs(); //create new bExtinput
            bExtInput.setName(betsInput.getName());
            bExtInput.setDescription(betsInput.getDescription());
            bExtInput.setRequired(betsInput.getRequired());
            List<Constraint> bExtInCons = betsInput.getConstraint(); //get the list of constraints for this input
            for (int j = 0; j < bExtInCons.size(); j++) {
                Constraint inCon = bExtInCons.get(j);
                String conLabel = inCon.getLabel();

                switch (conLabel) {
                    case "ID":
                        bExtInput.setId(Integer.parseInt(inCon.getValue()));
                        break;
                    case "Namespace":
                        bExtInput.setNamespace(inCon.getValue());
                        break;
                    default:
                        System.out.println("default");
                }

            }

            bioExtInputs.add(bExtInput);
        }

        bioExt.setInputs(bioExtInputs);

        //set outputs
        //set inputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Output> betsOutputs = bets.getOutputs();
        List<org.usd.edu.btl.betsconverter.BioExtV1.Outputs> bioExtOutputs = new ArrayList<>();

        for (int i = 0; i < betsOutputs.size(); i++) {
            Output betsOutput = betsOutputs.get(i); //get first bets input
            Outputs bExtOutput = new Outputs(); //create new bExtinput

            bExtOutput.setName(betsOutput.getName());

            List<Constraint> bExtOutCons = betsOutput.getConstraint(); //get the list of constraints for this input
            for (int j = 0; j < bExtOutCons.size(); j++) {
                Constraint outCon = bExtOutCons.get(j);
                String conLabel = outCon.getLabel();

                switch (conLabel) {
                    case "ID":
                        bExtOutput.setId(Integer.parseInt(outCon.getValue()));
                        break;
                    case "Namespace":
                        bExtOutput.setNamespace(outCon.getValue());
                        break;
                    case "Description":
                        bExtOutput.setDescription(outCon.getValue());
                        break;
                    default:
                        System.out.println("default");
                }

            }

            bioExtOutputs.add(bExtOutput);
        }

        bioExt.setOutputs(bioExtOutputs);

        return bioExt;
    }
    /**
     * Converts BETS to Seq Answers Specs.
     * Not necessary, will never convert back to SEQ, but proves concept.
     * @param bets
     * @return 
     */
    public static SeqV1 toSeq(BETSV1 bets) {
        SeqV1 seqTool = new SeqV1();
        bets.getSummary();
        seqTool.setLabel("TEST LABEL");

        //set summary
        List<String> betsSummary = new ArrayList<>();
        betsSummary.add(bets.getSummary());
        // List<Summary>
        seqTool.setSummary(betsSummary);

        //get bio_tags
        Category betsCat = bets.getCategory();
        List<Application> betsCatApps = betsCat.getApplication();
        List<String> seqBioTags = new ArrayList<>();
        //for each category application
        for (int i = 0; i < betsCatApps.size(); i++) {
            Application betsApp = betsCatApps.get(i);
            seqBioTags.add(betsApp.getName()); //add the name of the app to list of bio tags       
        }
        seqTool.setBio_tags(seqBioTags); //set bio_tags

        //set method tags
        List<Method> betsCatMeths = betsCat.getMethod();
        List<String> seqMethTags = new ArrayList<>();
        //for each category method
        for (int j = 0; j < betsCatMeths.size(); j++) {
            Method betsMeth = betsCatMeths.get(j);
            seqMethTags.add(betsMeth.getName());
        }
        seqTool.setMeth_tags(seqMethTags);

        //set seq language from bets pgm lang
        List<Programming_language> betsLangs = bets.getProgramming_language();
        List<String> seqLangs = new ArrayList<>();
        for (int i = 0; i < betsLangs.size(); i++) {
            Programming_language betsLang = betsLangs.get(i);
            seqLangs.add(betsLang.getName());
        }

        seqTool.setLanguage(seqLangs);

        //set OS 
        List<Operating_system> betsOSList = bets.getOperating_system();
        List<String> seqOSList = new ArrayList<>();
        for (int i = 0; i < betsOSList.size(); i++) {
            Operating_system betsOS = betsOSList.get(i);
            seqOSList.add(betsOS.getName());
        }

        seqTool.setOs(seqOSList);

        //get and set seq specific
        Seq_specific betsSeqSpec = bets.getSeq_specific();
        seqTool.setHits(betsSeqSpec.getHits());
        seqTool.setCited(betsSeqSpec.getCited());
        seqTool.setReferences(betsSeqSpec.getReferences());
        seqTool.setArt_size(betsSeqSpec.getArt_size());
        seqTool.setArt_score(betsSeqSpec.getArt_score());

        return seqTool;
    }
    /**
     * Converts BETS to Bio Link Directory
     * Not Necessary, proves concept.
     * @param bets
     * @return 
     */
    public static BLDV1 toBld(BETSV1 bets) {
        System.out.println("IN toBLD");
        BLDV1 bldTool = new BLDV1();

        bldTool.setTitle(bets.getDisplay_name());  //bets display name to bld Title
        bldTool.setDescription(bets.getDescription()); //bets desc to bld desc
        bldTool.setType(bets.getVersion()); //!!!! setting bld type to bets version for now

        //get BETS link objects and set to BLD
        List<Link> betsLinks = bets.getLinks();
        for (int i = 0; i < betsLinks.size(); i++) {
            Link betsLink = betsLinks.get(i);
            String linkType = betsLink.getType();

            switch (linkType) {
                case "BLD":
                    System.out.println("Link Type = " + linkType);
                    bldTool.setUrl(betsLink.getUrl());
                    break;
                case "BLD_LinksDir":
                    System.out.println("Link Type = " + linkType);
                    bldTool.setUrl_linksdir(betsLink.getUrl());
                    break;
                case "BLD_Twitter":
                    System.out.println("Link Type = " + linkType);
                    bldTool.setTwitter(betsLink.getUrl());
                    break;
                case "BLD_Wikipedia":
                    System.out.println("Link Type = " + linkType);
                    bldTool.setWikipedia(betsLink.getUrl());
                    break;
                default:
                    System.out.println("No recognized BETS Link Object");
                    break;
            }
        }
        //set PMIDS
        /**
         * BETS Reference Object.ID BLD PMID array of strings
         */
        List<Reference> betsRefs = bets.getReferences();
        List<String> bldPMIDList = new ArrayList<>();
        for (int i = 0; i < betsRefs.size(); i++) {
            Reference betsRef = betsRefs.get(i);
            bldPMIDList.add(betsRef.getId());
        }
        bldTool.setPmids(bldPMIDList);

        //set categories
        Bld_specific bldSpec = bets.getBld_specific();
        List<BLD_categories> betsBLDCats = bldSpec.getCategories();
        List<org.usd.edu.btl.betsconverter.BLDV1.Category> bldCats = new ArrayList<>();

        for (int i = 0; i < betsBLDCats.size(); i++) {
            BLD_categories betsBLDCat = betsBLDCats.get(i);
            org.usd.edu.btl.betsconverter.BLDV1.Category bldCat = new org.usd.edu.btl.betsconverter.BLDV1.Category();

            bldCat.setCategory_id(betsBLDCat.getId());
            bldCat.setCategory_name(betsBLDCat.getName());
            bldCat.setCategory_path(betsBLDCat.getPath());
            bldCats.add(bldCat);
        }
        bldTool.setCategories(bldCats);

        //get journals from BETS BLD_specific object
        List<Journal> bldSpecJournals = bldSpec.getJournals();
        List<Journal> bldJournals = new ArrayList<>();
        for (int i = 0; i < bldSpecJournals.size(); i++) {
            Journal betsJourn = bldSpecJournals.get(i);
            Journal bldJourn = new Journal();

            bldJourn.setId(betsJourn.getId());
            bldJourn.setName(betsJourn.getName());
            bldJournals.add(bldJourn);
        }
        bldTool.setJournals(bldJournals);

        //get BLD_spec related links, set to BLD related links
        List<Related_link> bldSpecRelLinks = bldSpec.getRelated_links();
        List<String> bldRelLinks = new ArrayList<>();
        for (int i = 0; i < bldSpecRelLinks.size(); i++) {
            Related_link betsLink = bldSpecRelLinks.get(i);
            //Related_link bldLink = new Related_link();

            bldRelLinks.add(betsLink.getName());
        }
        bldTool.setRelated_links(bldRelLinks);

        //get tags
        List<BLD_tags> bldSpecTags = bldSpec.getTags();
        List<Tag> bldTags = new ArrayList<>();
        for (int i = 0; i < bldSpecTags.size(); i++) {
            BLD_tags betsTag = bldSpecTags.get(i);
            Tag bldTag = new Tag();

            //bldTag.setTag_id(betsTag.getId());  //NEED FIXED
            bldTag.setTag_name(betsTag.getName());
            bldTags.add(bldTag);
        }

        bldTool.setTags(bldTags);

        //get sets
        List<Set> bldSpecSets = bldSpec.getSets();
        List<Set> bldSets = new ArrayList<>();
        System.out.println(bldSpecSets.size());
        for (int i = 0; i < bldSpecSets.size(); i++) {
            Set betsSet = bldSpecSets.get(i);
            Set bldSet = new Set();
            bldSet.setSet_id(betsSet.getSet_id());
            bldSet.setSet_name(betsSet.getSet_name());

            bldSets.add(bldSet);
        }
        bldTool.setSets(bldSets);

        return bldTool;

        //get bld_specific from BETS and set to bld 
    }
}
