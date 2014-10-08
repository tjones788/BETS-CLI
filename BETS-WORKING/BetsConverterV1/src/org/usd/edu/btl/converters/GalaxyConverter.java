package org.usd.edu.btl.converters;

import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.GalaxyV1.Tool;

/**
 *
 * @author Tyler.Jones
 */
public class GalaxyConverter {

    /**
     *
     * @param galaxy
     * @return
     */
    public static BETSV1 toBETS(Tool galaxy) {
        BETSV1 bets = new BETSV1();

        bets.setName(galaxy.getId());
        bets.setDisplay_name(galaxy.getName());
        bets.setVersion(galaxy.getVersion());
        bets.setSummary(galaxy.getHelp());
        bets.setDescription(galaxy.getDescription());
        //bets.setOwner(galaxy.geto);

        //GET AND SET GALAXY SPECIFIC STUFF
//        Galaxy_specific galSpec = new Galaxy_specific();
//        ToolTypeType toolType = galaxy.getToolType();
//
//        galSpec.setTool_type(toolType.value()); //.value to get
//        
//        bets.setGalaxy_specific(galSpec);
        

        return bets;
    }

}
