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
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;
import org.usd.edu.btl.converters.SeqConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertSeq {
    public ConvertSeq() {
        
    }
    public void toBets(String inputS, String output) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);

        SeqV1 seqTool; //create new seqTool
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        try {
            //map input json files to iplant class
            seqTool = mapper.readValue(input, SeqV1.class);
//            String seqInputJson = ow.writeValueAsString(seqTool); //write Json as String
//            System.out.println("=====SEQ INPUT FILE =====");
//            System.out.println(seqInputJson);

            BETSV1 betsOutput = SeqConverter.toBETS(seqTool);

            String betsOutputJson = ow.writeValueAsString(betsOutput); //write Json as String
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.out.println("************************************************\n"
                        + "*********PRINTING OUT CONVERSION************\n"
                        + "--------------Seq --> BETS--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.out.println("=== SEQ TO BETS JSON - OUTPUT === \n" + betsOutputJson);
            } else {
                System.out.println("Writing to file...");
                //write to files
                ow.writeValue(new File(output), seqTool);
                System.out.println(output + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
