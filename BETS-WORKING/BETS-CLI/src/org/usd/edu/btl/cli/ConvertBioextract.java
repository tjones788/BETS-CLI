/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usd.edu.btl.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BioExtV1.BioExtV1;
import org.usd.edu.btl.converters.BioExtConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertBioextract {
    public ConvertBioextract() {
        
    }
    
    public void toBets(String inputS, String output) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);

        BioExtV1 bioExtTool;

        try {
            //map input json files to iplant class
            bioExtTool = mapper.readValue(input, BioExtV1.class);

            BETSV1 bets = BioExtConverter.toBETS(bioExtTool); //pass the iplant tool spec, convert to bets
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bets); //write Json as String
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.out.println("************************************************\n"
                        + "*********PRINTING OUT CONVERSION************\n"
                        + "----------BioExtract --> Bets--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.out.println("=== BioExt TO BETS JSON === \n"
                        + betsJson);

            } else {
                //write to files
                ow.writeValue(new File(output), betsJson);
                System.out.println(output + " has been created successfully");
                System.exit(1);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
