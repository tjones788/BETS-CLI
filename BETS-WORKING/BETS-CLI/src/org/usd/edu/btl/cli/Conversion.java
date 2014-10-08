/**
 * This Class handles all the conversions based on the inputFormat argument
 * passed to the command line. Valid Inputs = BETS, iPlant, Galaxy, BioExtract,
 * BLD, Seq
 *
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
import static org.usd.edu.btl.converters.BETSConverter.toIplant;
import org.usd.edu.btl.converters.BLDConverter;
import org.usd.edu.btl.converters.BioExtConverter;
import org.usd.edu.btl.converters.GalaxyConverter;
import org.usd.edu.btl.converters.IplantConverter;
import org.usd.edu.btl.converters.SeqConverter;

/**
 *
 * @author Tyler.Jones
 */
public class Conversion {

    /**
     * Runs iPlant to BETS conversion. Input = iPlant Output = BETS
     *
     * @param input
     * @param outFormat
     * @param outFile
     */
    public static void iplantInput(File input, String outFormat, String outFile) {
        ObjectMapper iPlantmapper = new ObjectMapper(); //create new Jackson Mapper

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
                iplantWriter.writeValue(new File(outFile + ".json"), betsOutputJson);
                System.out.println(outFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Runs Seq to BETS Conversion Input = Seq Output = BETS
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void seqInput(File input, String outFormat, String outputFile) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper

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
            if (outputFile == null) {
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
                ow.writeValue(new File(outputFile + ".json"), betsOutputJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Runs BioLink Directory to BETS Conversion Inputs = BLD Output = BETS
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void bldInput(File input, String outFormat, String outputFile) {
        ObjectMapper bldMapper = new ObjectMapper(); //create new Jackson Mapper

        BLDV1 bldTool; //create new seqTool
        ObjectWriter bldWriter = bldMapper.writer().withDefaultPrettyPrinter();
        try {
            //map input json files to iplant class
            bldTool = bldMapper.readValue(input, BLDV1.class);
//            String seqInputJson = bldWriter.writeValueAsString(bldTool); //write Json as String
//            System.out.println("=====BLD INPUT FILE =====");
//            System.out.println(seqInputJson);

            BETSV1 betsOutput = betsOutput = BLDConverter.toBETS(bldTool);
            String betsOutputJson = bldWriter.writeValueAsString(betsOutput); //write Json as String
            if (outputFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.out.println("************************************************\n"
                        + "*********PRINTING OUT FIRST CONVERSION************\n"
                        + "--------------Seq --> BETS--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.out.println("=== BLD TO BETS JSON - OUTPUT === \n" + betsOutputJson);
            } else {
                System.out.println("Writing to file...");
                //write to files
                bldWriter.writeValue(new File(outputFile + ".json"), betsOutputJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Runs Galaxy to BETS conversion. Input = Galaxy Output = BETS
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void galaxyInput(File input, String outFormat, String outputFile) {
        System.out.println("Converting from GALAXY TO BETS");

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

    /**
     * Runs BioExtract to BETS conversion. Input = BioExtract Output = BETS
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void bioExtractInput(File input, String outFormat, String outputFile) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper

        BioExtV1 bioExtTool;

        try {
            //map input json files to iplant class
            bioExtTool = mapper.readValue(input, BioExtV1.class);

            BETSV1 bets = BioExtConverter.toBETS(bioExtTool); //pass the iplant tool spec, convert to bets
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bets); //write Json as String
            if (outputFile == null) {
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
                ow.writeValue(new File(outputFile + ".json"), betsJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Determines which format to convert the BETS input to. Options: iplant,
     * galaxy, bioextract, seq, bld
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void betsInput(File input, String outFormat, String outputFile) {
        System.out.println("Converting from BETS to... " + outFormat);

        switch (outFormat) {
            case "iplant":
                betsToIplant(input, outFormat, outputFile);
                break;  //valid        
            case "bets":
                System.out.println("Unnecessary Conversion, you already have a BETS file.");
                break; //valid
            case "galaxy":
                //NEED TO ADD BETS TO GALAXY
                break; //valid
            case "bioextract":
                betsToBioExt(input, outFormat, outputFile);
                break;
            case "seq":
                betsToSeq(input, outFormat, outputFile);
                break; //valid
            case "bld":
                betsToBld(input, outFormat, outputFile);
                break; //valid
            default: //catch all invalid input formats
                System.out.println("Should not reach this.");
        }
    }

    /**
     * BETS INPUT TO IPLANT HELPER METHOD
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void betsToIplant(File input, String outFormat, String outputFile) {
        ObjectMapper betsMapper = new ObjectMapper(); //create new Jackson Mapper

        BETSV1 betsTool; //create new seqTool
        ObjectWriter iplantWriter = betsMapper.writer().withDefaultPrettyPrinter();

        //map input json files to iplant class
        try {
            betsTool = betsMapper.readValue(input, BETSV1.class);
            System.out.println("Reading from " + input);

            IplantV1 iplantOutput = toIplant(betsTool);
            String iplantOutputJson = iplantWriter.writeValueAsString(iplantOutput); //write Json as String
            if (outputFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                System.out.println("************************************************\n"
                        + "*********PRINTING OUT CONVERSION************\n"
                        + "--------------BETS --> Iplant--------------\n"
                        + "************************************************\n");
                //print objects as Json using jackson

                System.out.println("=== iPlant TO BETS JSON - OUTPUT === \n" + iplantOutputJson);
            } else {
                System.out.println("Writing to file...");
                //write to files
                iplantWriter.writeValue(new File(outputFile + ".json"), iplantOutputJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Runs BETS to Galaxy Converter. Writes Galaxy XML to file or prints to
     * console if no output file entered.
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void betsToGalaxy(File input, String outFormat, String outputFile) {
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
            System.out.println(e.getMessage());
        } catch (JAXBException e) {
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
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Tool.class);
            Marshaller marshaller = jaxbContext.createMarshaller(); //Marshalling – Convert a Java object into a XML file.
            marshaller.marshal(myTool, System.out); //print XML out
        } catch (JAXBException e) {
            System.out.println("JAXB dun goofed");
            System.out.println(e.getMessage());
        }
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
            System.out.println("=== BLD TO BETS JSON === \n"
                    + betsJson);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * Runs BETS to Bio Extract Conversion
     *
     * @param input
     * @param outFormat
     * @param outputFile 
     */
    public static void betsToBioExt(File input, String outFormat, String outputFile) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            BioExtV1 bExtOutput = BETSConverter.toBioExtract(betsTool); //pass the iplant tool spec, convert to bets
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bExtOutput); //write Json as String
            if (outputFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.out.println("=== BETS TO BioExtract JSON === \n"
                        + bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(outputFile + ".json"), betsJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Runs BETS to Seq Answers conversion. Writes to file or prints to console.
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void betsToSeq(File input, String outFormat, String outputFile) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            SeqV1 bExtOutput = BETSConverter.toSeq(betsTool); //pass the iplant tool spec, convert to bets

            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bExtOutput); //write Json as String
            if (outputFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.out.println("=== BETS TO SEQ JSON === \n"
                        + bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(outputFile + ".json"), betsJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Runs BETS to Bio Link Directory Conversion. Writes to file or prints to
     * console.
     *
     * @param input
     * @param outFormat
     * @param outputFile
     */
    public static void betsToBld(File input, String outFormat, String outputFile) {
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore the extra BETS fields
        BETSV1 betsTool;

        try {
            //map input json files to iplant class
            betsTool = mapper.readValue(input, BETSV1.class);

            //convert bets to BioExtract
            BLDV1 bExtOutput = BETSConverter.toBld(betsTool); //pass the iplant tool spec, convert to bets

            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(bExtOutput); //write Json as String
            if (outputFile == null) {
                /*===============PRINT JSON TO CONSOLE AND FILES =================== */
                ObjectWriter bExtWriter = mapper.writer().withDefaultPrettyPrinter();
                String bExtJson = bExtWriter.writeValueAsString(bExtOutput); //write Json as String

                System.out.println("=== BETS TO BLD JSON === \n"
                        + bExtJson);
            } else {
                //write to files
                ow.writeValue(new File(outputFile + ".json"), betsJson);
                System.out.println(outputFile + ".json" + " has been created successfully");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
