
package org.usd.edu.btl.converters;

import java.util.ArrayList;
import java.util.List;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BETSV1.BLD_tags;
import org.usd.edu.btl.betsconverter.BETSV1.Bld_specific;
import org.usd.edu.btl.betsconverter.BETSV1.Link;
import org.usd.edu.btl.betsconverter.BETSV1.Reference;
import org.usd.edu.btl.betsconverter.BETSV1.Related_link;
import org.usd.edu.btl.betsconverter.BLDV1.BLDV1;
import org.usd.edu.btl.betsconverter.BLDV1.Journal;
import org.usd.edu.btl.betsconverter.BLDV1.Set;
import org.usd.edu.btl.betsconverter.BLDV1.Tag;

/**
 *
 * @author Tyler_000
 */
public class BLDConverter {

    /**
     *
     * @param bld
     * @return
     */
    public static BETSV1 toBETS(BLDV1 bld) {
        BETSV1 bets = new BETSV1();

        bets.setDisplay_name(bld.getTitle());
        bets.setDescription(bld.getDescription());
            //bld type set to bets .....?
        bets.setVersion(bld.getType());//set to version for now
        
        //get BLD urls and set to BETS links object
        List<Link> betsLinksList = new ArrayList<>();
        String bldUrl = bld.getUrl(); 
        Link betsLink = new Link();
        //set link attributes
        betsLink.setName("BLD Url of Tool");
        betsLink.setType("BLD");
        betsLink.setDescription("URL link to this tool.");
        betsLink.setUrl(bldUrl);
        betsLinksList.add(betsLink);

        //get 2nd url
        String bld_linksDir = bld.getUrl_linksdir();
        Link betsLinkDir = new Link();
        betsLinkDir.setName("BLD Link of Tool");
        betsLinkDir.setType("BLD_LinksDir");
        betsLinkDir.setDescription("Link to tool in BLD");
        betsLinkDir.setUrl(bld_linksDir);
        betsLinksList.add(betsLinkDir);

        //get twitter Link
        String twitter = bld.getTwitter();
        Link betsTwtrLink = new Link();
        betsTwtrLink.setName("Twitter Link");
        betsTwtrLink.setType("BLD_Twitter");
        betsTwtrLink.setDescription("Link to Twitter");
        betsTwtrLink.setUrl(twitter);
        betsLinksList.add(betsTwtrLink);

        //get wiki link
        String wiki = bld.getWikipedia();
        Link betsWikiLink = new Link();
        betsWikiLink.setName("Wikipedia Link");
        betsWikiLink.setType("BLD_Wikipedia");
        betsWikiLink.setDescription("Link to Wikipedia");
        betsWikiLink.setUrl(wiki);
        betsLinksList.add(betsWikiLink);

        bets.setLinks(betsLinksList);

        //twitter and wikipedia urls too
        //set BLD pmids to Bets references
        List<String> pmids = bld.getPmids();
        List<Reference> betsRefs = new ArrayList<>();
        Reference betsRefObj = new Reference();

        for (int i = 0; i < pmids.size(); i++) {
            String id = pmids.get(i);
            betsRefObj.setId(id);
            betsRefs.add(betsRefObj);

        }
        bets.setReferences(betsRefs);

        //get BLD categories, set bets category
        //list of bld cats and bets cats
        List<org.usd.edu.btl.betsconverter.BLDV1.Category> bldCatList = bld.getCategories();
        List<org.usd.edu.btl.betsconverter.BETSV1.BLD_categories> betsCatList = new ArrayList<>();
        //set BLD Specific 
        Bld_specific bldSpec = new Bld_specific();
        //for each bld category, create new bets category and set id, name, path
        for (int i = 0; i < bldCatList.size(); i++) {
            //gets ith bld cat 
            org.usd.edu.btl.betsconverter.BLDV1.Category bldCat = bldCatList.get(i);
            //creates bets Category object.
            org.usd.edu.btl.betsconverter.BETSV1.BLD_categories betsCat = new org.usd.edu.btl.betsconverter.BETSV1.BLD_categories();
            betsCat.setId(bldCat.getCategory_id());
            betsCat.setName(bldCat.getCategory_name());
            betsCat.setPath(bldCat.getCategory_path());
            //add to list
            betsCatList.add(betsCat);
        }

        bldSpec.setCategories(betsCatList);

        //get tags and add to bets category list
        List<Tag> bldTags = bld.getTags();
        List<BLD_tags> betsCatTags = new ArrayList<>();
        
        for (int i = 0; i < bldTags.size(); i++) {
            org.usd.edu.btl.betsconverter.BETSV1.BLD_tags betsTag = new org.usd.edu.btl.betsconverter.BETSV1.BLD_tags();
            Tag bldTag = bldTags.get(i);
            betsTag.setId(Integer.parseInt(bldTag.getTag_id()));
            betsTag.setName(bldTag.getTag_name());
            betsCatTags.add(betsTag);
        }
        
        bldSpec.setTags(betsCatTags);
        
        
        //get BLD journals, set 
        List<Journal> bldJournals = bld.getJournals();
        List<Journal> bldSpecJournals = new ArrayList<>();

        for (int i = 0; i < bldJournals.size(); i++) {
            Journal journal = bldJournals.get(i);
            Journal bldSpecJournal = new Journal();
            bldSpecJournal.setId(journal.getId());
            bldSpecJournal.setName(journal.getName());
            bldSpecJournals.add(bldSpecJournal);
        }

        bldSpec.setJournals(bldSpecJournals);

        List<String> relatedLinks = bld.getRelated_links();
        List<Related_link> bldSpecRelLinks = new ArrayList<>();

        for (int i = 0; i < relatedLinks.size(); i++) {
            Related_link relLink = new Related_link();
            String linkId = relatedLinks.get(i);
            relLink.setType("BLD");
            relLink.setName(linkId);
            relLink.setDescription("BLD Related link ID to article?");
            bldSpecRelLinks.add(relLink);
        }
        bldSpec.setRelated_links(bldSpecRelLinks);

        //set Bld_specific sets
        List<Set> sets = bld.getSets();
        List<Set> bldSpecSets = new ArrayList<>();

        for (int i = 0; i < sets.size(); i++) {
            Set set = sets.get(i);
            set.setSet_id(set.getSet_id());
            set.setSet_name(set.getSet_name());
            bldSpecSets.add(set);
        }
        bldSpec.setSets(bldSpecSets);

        bets.setBld_specific(bldSpec);

        return bets;
    }

}
