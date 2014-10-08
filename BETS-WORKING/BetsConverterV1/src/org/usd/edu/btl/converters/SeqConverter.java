package org.usd.edu.btl.converters;

import java.util.ArrayList;
import java.util.List;
import org.usd.edu.btl.betsconverter.BETSV1.Application;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BETSV1.Category;
import org.usd.edu.btl.betsconverter.BETSV1.Method;
import org.usd.edu.btl.betsconverter.BETSV1.Operating_system;
import org.usd.edu.btl.betsconverter.BETSV1.Programming_language;
import org.usd.edu.btl.betsconverter.BETSV1.Seq_specific;
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;

/**
 *
 * @author Tyler.Jones
 */
public class SeqConverter {

    /**
     *
     * @param seqTool
     * @return
     */
    public static BETSV1 toBETS(SeqV1 seqTool) {
        BETSV1 bets = new BETSV1();
        bets.setName(seqTool.getLabel());

        //Seq summary ARRAY OF SUMMARY STRINGS to BETS STRING
        //NEED TO LOOK AT !!!!!!!!!!!!!!!!!!! 
        List<String> summaryList = seqTool.getSummary();
        bets.setSummary(summaryList.get(0));

        //set bets Category
        //List<Category> betsCatList = new ArrayList<>();
        Category betsCategory = new Category();

        //Seq bio_tags to BETS category.application
        List<Application> betsApps = new ArrayList<>();
        List<String> bioTagStrings = seqTool.getBio_tags();

        for (int i = 0; i < bioTagStrings.size(); i++) {
            Application betsApp = new Application();
            String bioTagStr = bioTagStrings.get(i);
            betsApp.setName(bioTagStr);
            betsApps.add(betsApp);
        }

        betsCategory.setApplication(betsApps);

        //set method
        //Seq meth_tags to BETS Catgory.method[]
        List<Method> betsMeths = new ArrayList<>();
        List<String> methStrings = seqTool.getMeth_tags();

        //for each method, add it to the method object
        for (int i = 0; i < methStrings.size(); i++) {
            Method betsMeth = new Method();
            String methStr = methStrings.get(i);
            betsMeth.setName(methStr);
            betsMeths.add(betsMeth);
        }
        //add the meths list to category.method
        betsCategory.setMethod(betsMeths);
        
       // betsCatList.add(betsCategory);

        bets.setCategory(betsCategory); 

        //seq language to BETS Programming_language
        List<Programming_language> pgmLangs = new ArrayList<>();
        //get array of pgmLang name STRINGS
        List<String> pgmLangStrings = seqTool.getLanguage(); //get array of strings

        for (int i = 0; i < pgmLangStrings.size(); i++) {
            String pgmLangName = pgmLangStrings.get(i); //get first pgmLang Name
            Programming_language betsPgmLang = new Programming_language(); //create new BETS pgmLang obj
            betsPgmLang.setName(pgmLangName); //set name of BETS obj
            pgmLangs.add(betsPgmLang); //add BETS pgmLang Object to pgmLang List
        }
        bets.setProgramming_language(pgmLangs);

        //Seq os to Bets Operating_system
        List<Operating_system> betsOSList = new ArrayList<>();
        List<String> osStrings = seqTool.getOs();
        for (int i = 0; i < osStrings.size(); i++) {
            String osName = osStrings.get(i);
            Operating_system os = new Operating_system();
            os.setName(osName);
            betsOSList.add(os);
        }
        bets.setOperating_system(betsOSList);

        //seq hits, cited, references, art_size, art_score to BETS seq_specific
        Seq_specific seqSpec = new Seq_specific();
        seqSpec.setHits(seqTool.getHits());
        seqSpec.setCited(seqTool.getCited());
        seqSpec.setReferences(seqTool.getReferences());
        seqSpec.setArt_size(seqTool.getArt_size());
        seqSpec.setArt_score(seqTool.getArt_score());

        bets.setSeq_specific(seqSpec);

        //return the bets tool
        return bets;
    }

}
