package org.usd.edu.btl.converters.runtests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BioExtV1.BioExtV1;
import org.usd.edu.btl.converters.BETSConverter;
import org.usd.edu.btl.converters.BioExtConverter;

/**
 *
 * @author Tyler.Jones
 */
public class RunBioExtTest {

    public static void main(String[] args) {
        File BioExtinput = new File("test_bioextract.json"); //iPlantInput

        //System.out.println("Read first line: "+input.);
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper

        BioExtV1 bioExtTool;

        try {
            //map input json files to iplant class
            bioExtTool = mapper.readValue(BioExtinput, BioExtV1.class);

            //map input json file to Bets class
            //betsTool = mapper.readValue(betsInput, BETSV1.class);
            //call iplantToBets()
            BETSV1 bets = BioExtConverter.toBETS(bioExtTool); //pass the iplant tool spec, convert to bets


            /*===============PRINT JSON TO CONSOLE AND FILES =================== */
            System.out.println("************************************************\n"
                    + "*********PRINTING OUT CONVERSION************\n"
                    + "----------BioExtract --> Bets--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bets); //write Json as String

            System.out.println("=== BioExt TO BETS JSON === \n"
                    + betsJson);

            //write to files
            //ow.writeValue(new File("bets_Converted_toIplant.json"), betsJson);
            //ow.writeValue(new File("iPlant_OUTPUT.json"), iPlantJson);
            //convert bets to BioExtract
            System.out.println("============================= \n==================================\n");
            BioExtV1 bExtOutput = BETSConverter.toBioExtract(bets);

            ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
            String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

            System.out.println("=== BETS TO BioExtract JSON === \n"
                    + bExtJson);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
