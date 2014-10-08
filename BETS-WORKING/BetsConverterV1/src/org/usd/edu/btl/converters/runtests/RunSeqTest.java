package org.usd.edu.btl.converters.runtests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;
import org.usd.edu.btl.converters.SeqConverter;

/**
 *
 * @author Tyler.Jones
 */
public class RunSeqTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        File seqInput = new File("test_seq.json"); //iPlantInput

        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper

        SeqV1 seqTool; //create new seqTool
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        try {
            //map input json files to iplant class
            seqTool = mapper.readValue(seqInput, SeqV1.class);
            String seqInputJson = ow.writeValueAsString(seqTool); //write Json as String
            System.out.println("=====SEQ INPUT FILE =====");
            System.out.println(seqInputJson.toString());

            BETSV1 betsOutput = new BETSV1();
            betsOutput = SeqConverter.toBETS(seqTool);

            /*===============PRINT JSON TO CONSOLE AND FILES =================== */
            System.out.println("************************************************\n"
                    + "*********PRINTING OUT FIRST CONVERSION************\n"
                    + "--------------Seq --> BETS--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson

            String betsOutputJson = ow.writeValueAsString(betsOutput); //write Json as String

            System.out.println("=== SEQ TO BETS JSON - OUTPUT === \n" + betsOutputJson);

            //write to files
            //ow.writeValue(new File("bets_Converted_toIplant.json"), betsJson);
            //ow.writeValue(new File("iPlant_OUTPUT.json"), iPlantJson);
            
           /**
            * BETS TO SEQ CONVERSION
            */
            //seqTool = SeqConverter.toSeq(betsOutput);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
