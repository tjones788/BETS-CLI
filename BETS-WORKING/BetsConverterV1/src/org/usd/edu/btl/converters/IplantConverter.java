package org.usd.edu.btl.converters;

import java.util.ArrayList;
import java.util.List;
import org.usd.edu.btl.betsconverter.BETSV1.Availability;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BETSV1.Category;
import org.usd.edu.btl.betsconverter.BETSV1.Constraint;
import org.usd.edu.btl.betsconverter.BETSV1.Iplant_specific;
import org.usd.edu.btl.betsconverter.BETSV1.Link;
import org.usd.edu.btl.betsconverter.iPlantV1.IplantV1;

/**
 *
 * @author Tyler.Jones
 */
public class IplantConverter {
    
    //to BETS

    /**
     *
     * @param iplant
     * @return
     */
        public static BETSV1 toBETS(IplantV1 iplant) {
        System.out.println("== IN iplantToBets() ==");
        BETSV1 bets = new BETSV1();
        bets.setName(iplant.getName());
        bets.setParallelism(iplant.getParallelism()); 
        bets.setDisplay_name(iplant.getLabel());
        bets.setVersion(iplant.getVersion());

        List<Link> linkArray = new ArrayList<>();
        Link link = new Link();
        link.setName("Helpful Links 123");
        link.setUrl(iplant.getHelpURI());
        link.setType("iPlant");
        link.setDescription("HelpURI");
        linkArray.add(link);

        bets.setLinks(linkArray);

        bets.setSummary(iplant.getShortDescription());
        bets.setDescription(iplant.getLongDescription());

        Category tagCategory = new Category();

        
        tagCategory.setTags(iplant.getTags());

        
        bets.setCategory(tagCategory);

        Iplant_specific iplantSpec = new Iplant_specific();

        iplantSpec.setDefaultprocessors(iplant.getDefaultprocessors());
        iplantSpec.setDefaultmemory(iplant.getDefaultmemory());
        iplantSpec.setDefaultrequestedtime(iplant.getDefaultrequestedtime());
        iplantSpec.setOntology(iplant.getOntology());
        iplantSpec.setExecutionType(iplant.getExecutionType());
        iplantSpec.setExecutionHost(iplant.getExecutionHost());
        iplantSpec.setDeploymentPath(iplant.getDeploymentPath());
        iplantSpec.setTemplatePath(iplant.getTemplatePath());
        iplantSpec.setTestPath(iplant.getTestPath());
        iplantSpec.setCheckpointable(iplant.getCheckpointable());
        iplantSpec.setModules(iplant.getModules());

        bets.setIplant_specific(iplantSpec);

        List<Availability> availableList = new ArrayList<>();
        Availability available = new Availability();
        available.setStatus(iplant.getAvailable());
        availableList.add(available);
        bets.setAvailability(availableList);

//iplant inputs to bets
        List<org.usd.edu.btl.betsconverter.iPlantV1.Input> inputListFromIp = new ArrayList<>();
        inputListFromIp = iplant.getInputs();

        List<org.usd.edu.btl.betsconverter.BETSV1.Input> inputListToBets = new ArrayList<>();

        for (int i = 0; i < inputListFromIp.size(); i++) {
            org.usd.edu.btl.betsconverter.iPlantV1.Input ipl = inputListFromIp.get(i);
            org.usd.edu.btl.betsconverter.BETSV1.Input betsl = new org.usd.edu.btl.betsconverter.BETSV1.Input();

            betsl.setType("iPlant"); //

            betsl.setName(ipl.getId());
            betsl.setLabel(ipl.getDetails().getLabel());
            betsl.setDescription(ipl.getDetails().getDescription());
            betsl.setVisible(ipl.getDetails().getVisible());

            List<org.usd.edu.btl.betsconverter.BETSV1.Constraint> constraints = new ArrayList<>();
            List<String> ontologies = ipl.getSemantics().getOntology();
            List<String> filetypes = ipl.getSemantics().getFiletypes();
            for (int j = 0; j < ontologies.size(); j++) {
                Constraint ontCon = new Constraint();
                ontCon.setLabel("Ontology");
                ontCon.setValue(ontologies.get(j));
                constraints.add(ontCon);
            }
            for (int k = 0; k < filetypes.size(); k++) {
                Constraint fileCon = new Constraint();
                fileCon.setLabel("Filetype");
                fileCon.setValue(filetypes.get(k));
                constraints.add(fileCon);
            }
            Constraint minCon = new Constraint();
            minCon.setLabel("MinCardinality");
            minCon.setValue(ipl.getSemantics().getMincardinality().toString());  //note that this an int
            constraints.add(minCon);

            Constraint maxCon = new Constraint();
            maxCon.setLabel("MaxCardinality");
            maxCon.setValue(ipl.getSemantics().getMincardinality().toString());  //note that this an int
            constraints.add(maxCon);

            betsl.setDefault(ipl.getDefaultvalue());

            Constraint valueDefCon = new Constraint();
            valueDefCon.setLabel("Default");
            valueDefCon.setValue(ipl.getValue().getDefault());
            constraints.add(valueDefCon);

            Constraint valueVisibleCon = new Constraint();
            valueVisibleCon.setLabel("Visible");
            valueVisibleCon.setValue(ipl.getValue().getVisible().toString());
            constraints.add(valueVisibleCon);

            betsl.setConstraint(constraints);
//
            betsl.setRequired(ipl.getValue().getRequired());
            betsl.setValidator(ipl.getValue().getValidator());
//
            inputListToBets.add(betsl); //added inputs to betsList
        }

        bets.setInputs(inputListToBets); //sets iplant inputs arrayList to BETS spec

//iplant parameters to bets
        List<org.usd.edu.btl.betsconverter.iPlantV1.Parameter> paramListIp;
        List<org.usd.edu.btl.betsconverter.BETSV1.Parameter> paramListToBets = new ArrayList<>();
        paramListIp = iplant.getParameters();

        for (int i = 0; i < paramListIp.size(); i++) {
            org.usd.edu.btl.betsconverter.iPlantV1.Parameter ipl = paramListIp.get(i); //get ith parameter from list of iplant parameters
            org.usd.edu.btl.betsconverter.BETSV1.Parameter betsl = new org.usd.edu.btl.betsconverter.BETSV1.Parameter(); //create new bets parameter object

            //set attributes of the bets parameter object
            betsl.setType(ipl.getValue().getType()); //gets value-type from iplant and sets to 
            betsl.setName(ipl.getId()); //sets BETS parameter-name to iPlant parameter-id
            betsl.setLabel(ipl.getDetails().getLabel()); //sets BETS parameter-lable to iPlant details-label
            betsl.setDescription(ipl.getDetails().getDescription());
            betsl.setValidator(ipl.getValue().getValidator());
            betsl.setVisible(ipl.getValue().getVisible().toString());
            betsl.setRequired(ipl.getValue().getRequired().toString());
            betsl.setDefault(ipl.getDefaultvalue());

            List<org.usd.edu.btl.betsconverter.BETSV1.Constraint> paramCons = new ArrayList<>();
            List<String> paramOntols = ipl.getSemantics().getOntology();
            for (int j = 0; j < paramOntols.size(); j++) {

                Constraint paramCon = new Constraint();
                paramCon.setLabel("Ontology");
                paramCon.setValue(paramOntols.get(j));
                paramCons.add(paramCon);

            }

            //sets value-default to a parameter constraint object
            //label = Value-Default
            Constraint valueDefaultCon = new Constraint();
            valueDefaultCon.setLabel("Value-Default");
            valueDefaultCon.setValue(ipl.getValue().getDefault());
            paramCons.add(valueDefaultCon);

            betsl.setConstraint(paramCons);

            paramListToBets.add(betsl); //add bets to list of Bets parameters
            //add semantics from iplant parameter;

        }

        bets.setParameters(paramListToBets); //set list of bets parameters

//set bets outputs from iplant outputs
        List<org.usd.edu.btl.betsconverter.iPlantV1.Output> outputListIp;
        List<org.usd.edu.btl.betsconverter.BETSV1.Output> outputListToBets = new ArrayList<>();
        outputListIp = iplant.getOutputs();

        for (int i = 0; i < outputListIp.size(); i++) {
            org.usd.edu.btl.betsconverter.iPlantV1.Output ipl = outputListIp.get(i); //get ith parameter from list of iplant parameters
            org.usd.edu.btl.betsconverter.BETSV1.Output betsl = new org.usd.edu.btl.betsconverter.BETSV1.Output(); //create new bets ouput

            betsl.setName(ipl.getId());
            betsl.setValue(ipl.getDefaultvalue());  //THIS IS NOT WORKING

            List<org.usd.edu.btl.betsconverter.BETSV1.Constraint> outputCons = new ArrayList<>();
            List<String> outputFileTypes = ipl.getSemantics().getFileTypes();
            List<String> outputOnts = ipl.getSemantics().getOntology();
            for (int j = 0; j < outputFileTypes.size(); j++) {
                Constraint outputCon = new Constraint();
                outputCon.setLabel("Filetype");
                outputCon.setValue(outputFileTypes.get(j));
                outputCons.add(outputCon);

            }

            for (int k = 0; k < outputOnts.size(); k++) {
                Constraint outputCon = new Constraint();
                outputCon.setLabel("Ontology");
                outputCon.setValue(outputOnts.get(k));
                outputCons.add(outputCon);
            }

            Constraint minCon = new Constraint();
            minCon.setLabel("MinCardinality");
            minCon.setValue(ipl.getSemantics().getMinCardinality().toString());  //note that this an int
            outputCons.add(minCon);

            Constraint maxCon = new Constraint();
            maxCon.setLabel("MaxCardinality");
            maxCon.setValue(ipl.getSemantics().getMaxCardinality().toString());  //note that this an int
            outputCons.add(maxCon);

            Constraint validatorCon = new Constraint();
            validatorCon.setLabel("Validator");
            validatorCon.setValue(ipl.getValue().getValidator());
            outputCons.add(validatorCon);

            Constraint valueDefaultCon = new Constraint();
            valueDefaultCon.setLabel("Default");
            valueDefaultCon.setValue(ipl.getValue().getDefault());
            outputCons.add(valueDefaultCon);

            Constraint detailsDesc = new Constraint();
            detailsDesc.setLabel("Description");
            detailsDesc.setValue(ipl.getDetails().getDescription());
            outputCons.add(detailsDesc);

            Constraint detailsLabel = new Constraint();
            detailsLabel.setLabel("Label");
            detailsLabel.setValue(ipl.getDetails().getLabel());
            outputCons.add(detailsLabel);

            betsl.setConstraint(outputCons);

            outputListToBets.add(betsl);
        }
        bets.setOutputs(outputListToBets);

        return bets;
    }
    
}
