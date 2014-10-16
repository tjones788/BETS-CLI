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
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BLDV1.BLDV1;
import org.usd.edu.btl.betsconverter.BioExtV1.BioExtV1;
import org.usd.edu.btl.betsconverter.GalaxyV1.Tool;
import org.usd.edu.btl.betsconverter.SeqV1.SeqV1;
import org.usd.edu.btl.betsconverter.iPlantV1.IplantV1;
import org.usd.edu.btl.converters.BETSConverter;
import org.usd.edu.btl.converters.GalaxyConverter;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class ConvertBets {
    public ConvertBets() {
        
    }
    
    public void toIplant(String inputS, String output) {
        ObjectMapper betsMapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);

        BETSV1 betsTool; //create new seqTool
        ObjectWriter iplantWriter = betsMapper.writer().withDefaultPrettyPrinter();

        //map input json files to iplant class
        try {
            betsTool = betsMapper.readValue(input, BETSV1.class);

            IplantV1 iplantOutput = BETSConverter.toIplant(betsTool);
            String iplantOutputJson = iplantWriter.writeValueAsString(iplantOutput); //write Json as String
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.err.println("************************************************\n"
                        + "*********PRINTING OUT CONVERSION************\n"
                        + "--------------BETS --> Iplant--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.err.println("=== iPlant TO BETS JSON - OUTPUT === \n" + iplantOutputJson);
            } else {
                System.err.println("Writing to file...");
                //write to files
                iplantWriter.writeValue(new File(output), iplantOutput);
                System.err.println(output + " has been created successfully");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void toGalaxy(String input, String output) {
        InputStream infile = null;
        Tool myTool = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Tool.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); //Unmarshalling – Convert XML content into a Java Object.
            infile = new FileInputStream("./test_inputs/test_galaxy.xml");
            Tool test_tool = (Tool) unmarshaller.unmarshal(infile);
            myTool = test_tool;
            //System.out.println(test_tool.toString()); //print the test_tool 

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (JAXBException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (infile != null) {
                    infile.close();
                }
            } catch (IOException e) {
                System.err.println("You're rubbish, you can't even close a file");
                System.err.println(e.getMessage());
            }
        }

        //JAXB-Marshall Java back to XML
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Tool.class);
            Marshaller marshaller = jaxbContext.createMarshaller(); //Marshalling – Convert a Java object into a XML file.
            marshaller.marshal(myTool, System.out); //print XML out
        } catch (JAXBException e) {
            System.err.println("JAXB dun goofed");
            System.err.println(e.getMessage());
        }
        // RUN GALAXY TO BETS CONVERSION
        BETSV1 betsOutput = GalaxyConverter.toBETS(myTool);
        try {
            System.err.println("************************************************\n"
                    + "*********PRINTING OUT CONVERSION************\n"
                    + "----------Galaxy --> Bets--------------\n"
                    + "************************************************\n");
            //print objects as Json using jackson
            System.err.println("=== BLD TO BETS JSON === \n");
            System.out.println(betsOutput);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void toSeq(String inputS, String output) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);
        
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            SeqV1 bExtOutput = BETSConverter.toSeq(betsTool); //pass the iplant tool spec, convert to bets

            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
          
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.err.println("=== BETS TO SEQ JSON === \n");
                System.out.println(bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(output), bExtOutput);
                System.err.println(output + " has been created successfully");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void toBld(String inputS, String output) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            BLDV1 bExtOutput = BETSConverter.toBld(betsTool); //pass the iplant tool spec, convert to bets

            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.err.println("=== BETS TO BLD JSON === \n");
                System.out.println(bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(output), bExtOutput);
                System.err.println(output + " has been created successfully");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void toBioextract(String inputS, String output) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        File input = new File(inputS);
        
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            BioExtV1 bExtOutput = BETSConverter.toBioExtract(betsTool); //pass the iplant tool spec, convert to bets
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            
            if (output == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.err.println("=== BETS TO BioExtract JSON === \n");
                System.out.println(bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(output), bExtOutput);
                System.err.println(output + " has been created successfully");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
