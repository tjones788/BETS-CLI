package org.usd.edu.btl.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.IOException;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;
import org.usd.edu.btl.betsconverter.iPlantV1.IplantV1;
import org.usd.edu.btl.converters.IplantConverter;
import org.usd.edu.btl.converters.SeqConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertIplant {
    public ConvertIplant() {
    }
    
    public void toBets(String inputS, String outFile) {
        ObjectMapper iPlantmapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);

        IplantV1 ipTool; //create new seqTool
        ObjectWriter iplantWriter = iPlantmapper.writer().withDefaultPrettyPrinter();
        try {
            //map input json files to iplant class
            ipTool = iPlantmapper.readValue(input, IplantV1.class);
            System.out.println("Reading from " + input);
            //prints input file
//            String seqInputJson = iplantWriter.writeValueAsString(ipTool); //write Json as String
//            System.out.println("=====iPlant INPUT FILE =====");
//            System.out.println(seqInputJson);

            BETSV1 betsOutput = IplantConverter.toBETS(ipTool);
            String betsOutputJson = iplantWriter.writeValueAsString(betsOutput); //write Json as String

            //If there is no ouput file name specified, print the conversion to console
            if (outFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.out.println("************************************************\n"
                        + "*********PRINTING OUT FIRST CONVERSION************\n"
                        + "--------------iPLant--> BETS--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.out.println("=== iPlant TO BETS JSON - OUTPUT === \n" + betsOutputJson);
            } else {
                System.out.println("Writing to file...");
                //write to files
                iplantWriter.writeValue(new File(outFile), ipTool);
                System.out.println(outFile + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
