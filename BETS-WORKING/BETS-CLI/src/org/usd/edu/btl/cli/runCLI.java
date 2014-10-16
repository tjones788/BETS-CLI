package org.usd.edu.btl.cli;

import java.io.File;
import java.util.Scanner;
import static org.usd.edu.btl.cli.Conversion.betsInput;
import static org.usd.edu.btl.cli.Conversion.bioExtractInput;
import static org.usd.edu.btl.cli.Conversion.bldInput;
import static org.usd.edu.btl.cli.Conversion.galaxyInput;
import static org.usd.edu.btl.cli.Conversion.iplantInput;
import static org.usd.edu.btl.cli.Conversion.seqInput;
import static org.usd.edu.btl.cli.InteractiveMode.userPrompts;

/**
 *
 * @author Tyler.Jones
 */
public class runCLI {

    static String inputFormat = null;
    private static String outputFormat = null;
    static String inputFile = null;
    static String outputFile = null;

    String[] options = new String[10]; //array of options

    public static void main(String[] args) {
        System.out.println("Run Bets-CLI");
        System.out.println("ARGS OUPUT FORMAT = " + args[3]);
        //if there are no arguments, ask the user for them
        if (args.length < 1) {
            System.out.println("You have not entered any arguments.");
            System.out.println("Type -h or --help for help menu.");
            System.out.println("Exiting...");
            System.exit(1);
        }

        //Pre: Args have been entered, read them, get info
        //Post: Values for conversion have been set
        for (int i = 0; i < args.length; i++) { //for each argument
            try {
                String arg = args[i]; //get first argument, i-th index
                if (arg.equals("-I") || arg.equals("--inputformat")) { //if arg == -I or --inputformat                
                    inputFormat = args[++i]; //set the format of the specified input file
                    switch (inputFormat) {
                        case "iplant":
                            break;  //valid        
                        case "bets":
                            break; //valid
                        case "galaxy":
                            break; //valid
                        case "seq":
                            break; //valid
                        case "bld":
                            break; //valid
                        case "bioextract":
                            break; //valid
                        default: //catch all invalid input formats
                            throw new InvalidInputException("You Have Entered an Invalid Input Format\n"
                                    + "  Valid Options: iplant, bets, galaxy, seq, bld");
                    }
                } else if (arg.equals("-O") || arg.equals("--outputformat")) {
                    outputFormat = args[++i];
                    System.out.println("OUTPUT FORMAT!!!!!!!! = " + outputFormat);
                    if (outputFormat == null) {
                        throw new InvalidInputException("You have not entered an Output Format.");
                    }
                    switch (outputFormat) {
                        case "iplant":
                            break;  //valid        
                        case "bets":
                            break; //valid
                        case "galaxy":
                            break; //valid
                        case "bioextract":
                            break;
                        case "seq":
                            break;
                        case "bld":
                            break;
                        default: //catch all invalid input formats
                            throw new InvalidInputException("You Have Entered an Invalid Output Format\n"
                                    + "  Valid Options: iplant, bets, galaxy");
                    }
                } else if (arg.equals("-i") || arg.equals("--infile")) {
                    inputFile = args[++i];
                    if (inputFile == null) {
                        throw new InvalidConversionException("No Input File Entered.");
                    }
                } else if (arg.equals("-o") || arg.equals("--outfile")) {
                    outputFile = args[++i];
                    //if null, send to screen
                } else if (arg.equals("-h") || arg.equals("--help")) {
                    System.out.println("=== BETS CONVERTER HELP ===\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Input Format: -I --inputformat; [ -I iplant] [--inputformat bets]\n");
                    sb.append("  Desc: Format of Input File\n");
                    sb.append("  Options: iplant, bets, galaxy, seq, bld, bioextract\n\n");
                    sb.append("Ouput Format: -O --outputformat; [-O galaxy] [--outputformat bets]\n"); //or xml || or json?
                    sb.append("  Desc: Format to Convert to\n");
                    sb.append("  Options: iplant, bets, galaxy, bioextract, seq\n\n");
                    sb.append("Input File: -i --infile; [-i test_iplant.json]\n");
                    sb.append("  Desc: Specified Input File\n\n");
                    sb.append("Output File Name: -o --outfile; [-o test] [--outfile test]\n");
                    sb.append("  Desc: Name of the output file\n\n");
                    sb.append("Help Menu: -h --help\n");
                    sb.append("  Desc: Print Help Menu\n\n");
                    sb.append("Interactive Prompts: -p --prompt\n");
                    sb.append("  Desc: Starts interactive mode, where user is prompted for arguments.\n");
                    sb.append("--------------------------\n");
                    sb.append("Example: java -jar dist/BETS-CLI.jar  -I iplant -O bets -i test.json -o output1");
                    System.out.println(sb);
                    System.exit(0);
                } else if ((arg.equals("-p") || arg.equals("--prompt"))) {
                    //userPrompts();
                    System.out.println("Starting Interactive Mode\n");
                    Scanner promptSc = new Scanner(System.in);

                    System.out.println("What format are you converting from?");
                    System.out.println("1 - iPlant");
                    System.out.println("2 - BETS");
                    System.out.println("3 - Galaxy");
                    System.out.println("4 - Bio Link Directory");
                    System.out.println("5 - Seq");
                    System.out.println("6 - Bio Extract Server");
                    String inputFormatSelect = promptSc.next();
                    System.out.println("");
                    switch (inputFormatSelect) {
                        case "1":
                            System.out.println("You HAVE an Iplant file.");
                            inputFormat = "iplant";
                            break;
                        case "2":
                            System.out.println("You HAVE a BETS file.");
                            inputFormat = "bets";
                            break;
                        case "3":
                            System.out.println("You HAVE a Galaxy file.");
                            inputFormat = "galaxy";
                            break;
                        case "4":
                            System.out.println("You HAVE a BLD file.");
                            inputFormat = "bld";
                            break;
                        case "5":
                            System.out.println("You HAVE a Seq file.");
                            inputFormat = "seq";
                            break;
                        case "6":
                            System.out.println("You HAVE a Bio Extract file.");
                            inputFormat = "bioextract";
                            break;
                        default:
                            System.out.println("INVALID INPUT FORMAT");
                    }
                    /**
                     * Get the Output Format
                     */
                    System.out.println("\nWhat format do you want to convert to?");
                    System.out.println("1 - iPlant");
                    System.out.println("2 - BETS");
                    System.out.println("3 - Galaxy");
                    System.out.println("4 - Bio Link Directory");
                    System.out.println("5 - Seq");
                    System.out.println("6 - Bio Extract Server");
                    String outputFormatSelect = promptSc.next();
                    System.out.println("");
                    
                    switch (outputFormatSelect) {
                        case "1":
                            System.out.println("You HAVE an Iplant file.");
                            outputFormat = "iplant";
                            break;
                        case "2":
                            System.out.println("You HAVE a BETS file.");
                            outputFormat = "bets";
                            break;
                        case "3":
                            System.out.println("You HAVE a Galaxy file.");
                            break;
                        case "4":
                            System.out.println("You HAVE a BLD file.");
                            outputFormat = "bld";
                            break;
                        case "5":
                            System.out.println("You HAVE a Seq file.");
                            outputFormat = "seq";
                            break;
                        case "6":
                            System.out.println("You HAVE a Bio Extract file.");
                            outputFormat = "bioextract";
                            break;
                        default:
                            System.out.println("INVALID INPUT FORMAT");
                    }

                    System.out.println("\nPlease type the full input file name.");
                    inputFile = promptSc.next();

                    System.out.println("\nPlease type your desired output file name.");
                    outputFile = promptSc.next();
                    promptSc.close();
                } else {
                    System.out.println("You have entered an invalid argument.");
                    System.out.println("Type -h or --help for help menu.");
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
            //if all 8 required args have been entered
            System.out.println("\n ===Printing Arguments===");
            printArgs(); //print the entered arguments
            try {
                checkConversion();
            } catch (InvalidConversionException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }

    /* *************
     Helper Methods
     *************
     */
    /**
     * Print the arguments.
     */
    public static void printArgs() {
        System.out.println(
                "Input Format = " + inputFormat);
        System.out.println(
                "Output Format= " + outputFormat);
        System.out.println(
                "Input File = " + inputFile);
        System.out.println(
                "Output Name = " + outputFile);
        System.out.println("----------------");
        System.out.println(
                "Converting " + inputFormat + " --> " + outputFormat);
        System.out.println(
                "Output File: " + outputFile + "\n");
    }

    /**
     *
     * @throws InvalidConversionException
     */
    public static void checkConversion() throws InvalidConversionException {
        System.out.println("Checking Conversion...");
        //Check if Conversion can be done.
        //Invalid Conversions: seq --> iplant, bld --> iplant
        if (inputFormat.equalsIgnoreCase("seq") && outputFormat.equalsIgnoreCase("iplant")) {
            throw new InvalidConversionException("Sorry, conversion cannot be done.");
        } else {
            System.out.println("Success - Performing Conversion...");
            performConversion(inputFormat, outputFormat, outputFile);
        }
    }

    /**
     *
     * @param inputFormat
     * @param outputFormat
     * @param outputFile
     */
    public static void performConversion(String inputFormat, String outputFormat, String outputFile) {
        File input = new File("./test_inputs/" + inputFile); //iPlantInput

        switch (inputFormat) {
            case "iplant":
                iplantInput(input, outputFormat, outputFile);
                break;  //valid        
            case "bets":
                betsInput(input, outputFormat, outputFile);
                System.out.println("!!!!!!!!!!!!!! " + outputFormat);
                break; //valid
            case "galaxy":
                galaxyInput(input, outputFormat, outputFile);
                break; //valid
            case "seq":
                seqInput(input, outputFormat, outputFile);
                break; //valid
            case "bld":
                bldInput(input, outputFormat, outputFile);
                break; //valid
            case "bioextract":
                bioExtractInput(input, outputFormat, outputFile);
                break;
            default: //catch all invalid input formats
                System.out.println("Should not reach this.");
        }
    }
}
//print to screen only when there is no ouput file name specified
