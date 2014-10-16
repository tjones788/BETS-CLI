/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usd.edu.btl.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.GalaxyV1.Tool;
import org.usd.edu.btl.converters.GalaxyConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertGalaxy {

    public ConvertGalaxy() {

    }

    public void toBets(String inputS, String output) {
        System.out.println("Converting from GALAXY TO BETS");
        File input = new File(inputS);

        InputStream infile = null;
        Tool myTool = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Tool.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); //Unmarshalling – Conversion XML content into a Java Object.
            infile = new FileInputStream(input);
            Tool test_tool = (Tool) unmarshaller.unmarshal(infile);
            myTool = test_tool;
            //System.out.println(test_tool.toString()); //print the test_tool 

        } catch (FileNotFoundException | JAXBException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (infile != null) {
                    infile.close();
                }
            } catch (IOException e) {
                System.out.println("You're rubbish, you can't even close a file");
                System.out.println(e.getMessage());
            }
        }

        //JAXB-Marshall Java back to XML
//        try {
//            JAXBContext jaxbContext = JAXBContext.newInstance(Tool.class);
//            Marshaller marshaller = jaxbContext.createMarshaller(); //Marshalling – Conversion a Java object into a XML file.
//            marshaller.marshal(myTool, System.out); //print XML out
//        } catch (JAXBException e) {
//            System.out.println("JAXB dun goofed");
//            System.out.println(e.getMessage());
//        }
        // RUN GALAXY TO BETS CONVERSION
        BETSV1 betsOutput = GalaxyConverter.toBETS(myTool);
        try {
            ObjectMapper mapper = new ObjectMapper();
            System.out.println("************************************************\n"
                    + "*********PRINTING OUT CONVERSION************\n"
                    + "----------Galaxy --> Bets--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(betsOutput); //write Json as String
            System.out.println("=== GALAXY TO BETS JSON === \n"
                    + betsJson);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
