package org.usd.edu.btl.converters.runtests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BLDV1.BLDV1;
import org.usd.edu.btl.converters.BLDConverter;

/**
 *
 * @author Tyler_000
 */
public class RunBLDTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        File BLDinput = new File("test_BLD.json"); //iPlantInput


        //System.out.println("Read first line: "+input.);
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        
        BLDV1 bldTool;


        try {
            //map input json files to iplant class
            bldTool = mapper.readValue(BLDinput, BLDV1.class);

            //map input json file to Bets class
            //betsTool = mapper.readValue(betsInput, BETSV1.class);

            //call iplantToBets()
            BETSV1 bets = BLDConverter.toBETS(bldTool); //pass the iplant tool spec, convert to bets


            /*===============PRINT JSON TO CONSOLE AND FILES =================== */
            System.out.println("************************************************\n"
                    + "*********PRINTING OUT CONVERSION************\n"
                    + "----------BioLinkDirectory --> Bets--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bets); //write Json as String


            System.out.println("=== BLD TO BETS JSON === \n"
                    + betsJson);


            //write to files
            //ow.writeValue(new File("bets_Converted_toIplant.json"), betsJson);
            //ow.writeValue(new File("iPlant_OUTPUT.json"), iPlantJson);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
