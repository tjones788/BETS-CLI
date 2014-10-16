
package org.usd.edu.btl.converters.runtests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.util.Map;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.iPlantV1.IplantV1;
import org.usd.edu.btl.converters.BETSConverter;
import org.usd.edu.btl.converters.IplantConverter;


/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class RunIplantTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        File ipInput = new File("test_inputs/test_iplant.json"); //iPlantInput
        File ipSampleInput = new File("test_inputs/test_iplant_FULL.json");
        File betsInput = new File("test_inputs/test_bets.json");

        //System.out.println("Read first line: "+input.);
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        
        IplantV1 ipTool;
        //BETSV1 betsTool;

        try {
            //map input json files to iplant class
            ipTool = mapper.readValue(ipSampleInput, IplantV1.class);

            //map input json file to Bets class
            //betsTool = mapper.readValue(betsInput, BETSV1.class);

            //call iplantToBets()
            BETSV1 bets = IplantConverter.toBETS(ipTool); //pass the iplant tool spec, convert to bets
            
            //call betsToIplant()
            //Pre: Bets is filled with the values from the iPlant Input tool
            //Post: Bets has been converted back to iplant, should match the original ipInput file.
            IplantV1 iplant = BETSConverter.toIplant(bets);
            

            Map<String, Object> map = iplant.getAdditionalProperties();
            System.out.println("Addtl Props = " + map.isEmpty());

            /*===============PRINT JSON TO CONSOLE AND FILES =================== */
            System.out.println("************************************************\n"
                    + "*********PRINTING OUT FIRST CONVERSION************\n"
                    + "----------iPlant --> Bets --> iPlant--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bets); //write Json as String
            String iPlantJson = ow.writeValueAsString(iplant); //write Json as String

            System.out.println("=== IPLANT TO BETS JSON === \n"
                    + betsJson);
            System.out.println("=== BETS TO IPLANT JSON === \n"
                    + iPlantJson);

            //write to files
            //ow.writeValue(new File("bets_Converted_toIplant.json"), betsJson);
            //ow.writeValue(new File("iPlant_OUTPUT.json"), iPlantJson);

        } catch (Exception e) {
            
        }
    }

}
