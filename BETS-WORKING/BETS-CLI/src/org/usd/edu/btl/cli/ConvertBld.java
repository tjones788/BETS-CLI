/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usd.edu.btl.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.IOException;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BLDV1.BLDV1;
import org.usd.edu.btl.converters.BLDConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertBld {
    public ConvertBld() {
        
    }
    
    public void toBets(String inputS, String output)  {
        ObjectMapper bldMapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);

        BLDV1 bldTool; //create new seqTool
        ObjectWriter oW = bldMapper.writer().withDefaultPrettyPrinter();
        try {
            //map input json files to iplant class
            bldTool = bldMapper.readValue(input, BLDV1.class);
//            String seqInputJson = oW.writeValueAsString(bldTool); //write Json as String
//            System.out.println("=====BLD INPUT FILE =====");
//            System.out.println(seqInputJson);

            BETSV1 betsOutput = BLDConverter.toBETS(bldTool);
            String betsOutputJson = oW.writeValueAsString(betsOutput); //write Json as String
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.err.println("************************************************\n"
                        + "*********PRINTING OUT FIRST CONVERSION************\n"
                        + "--------------Seq --> BETS--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.err.println("=== BLD TO BETS JSON - OUTPUT === \n");
                System.out.println( betsOutputJson);
            } else {
                System.err.println("Writing to file...");
                //write to files
                oW.writeValue(new File(output), betsOutput);
                System.err.println(output + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
