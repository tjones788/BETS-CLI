package org.usd.edu.btl.cli;

/**
 *
 * @author Bill Conn <Bill.Conn@usd.edu>
 */
public class RunlCLI {

    private static String inputFormat = null;
    private static String outputFormat = null;
    private static String inputFilename = null;
    private static String outputFilename = null;
    private static Boolean interactiveMode = false;
    
    public enum formats {iplant, bets, galaxy, seq, bld, bioextract};

//    public static void main(String[] args) {
    public static void main(String[] args) {
        //System.err.println("Run Bets-CLI");
        //if there are no arguments, ask the user for them
        if (args == null || args.length < 1) {
            System.err.println("You have not entered any arguments.");
            System.err.println("Type -h or --help for help menu.");
            System.err.println("Exiting...");
            System.exit(1);
        }

        //check to see if the user wants help first
        if (userWantsHelp(args)) {
            printHelp();
            System.exit(1);
        }
        
        //check if interactive mode
        interactiveMode = interactiveMode(args);
        if(interactiveMode) {
            //normally we would do this, but I don't know that it's implemented
            // so we will die and print help telling them it's disabled.
            System.err.println("Interactive Prompt is currently disabled");
            printHelp();
            System.exit(1);
        }

        //need four things, input/output formats and files
        //need to get -I and --inputformat
        if(inputFormat == null) {
            inputFormat = getArgValue("-I", args);
        }
        if (inputFormat == null) {
            inputFormat = getArgValue("--inputformat", args);
        }
        //need to get -O and --outputformat
        if(outputFormat == null) {
            outputFormat = getArgValue("-O", args);
        }
        if (outputFormat == null) {
            outputFormat = getArgValue("--outputformat", args);
        }
        //need to get -i and --infile
        if(inputFilename == null){
            inputFilename = getArgValue("-i", args);
        }
        if (inputFilename == null) {
            inputFilename = getArgValue("--infile", args);
        }
        //need to get -o and --outfile
        if(outputFilename == null) {
            outputFilename = getArgValue("-o", args);
        }
        if (outputFilename == null) {
            outputFilename = getArgValue("--outfile", args);
        }

        //check to see we have everything. outputFilename can be null, we will
        // write to STDOUT then
        if (inputFormat == null || outputFormat == null || inputFilename == null ) {
            printHelp();
            System.exit(1);
        }

        //print out what our values are
        System.err.println("This is what we are working with:");
        System.err.println("inputFormat    = " + inputFormat);
        System.err.println("outputFormat   = " + outputFormat);
        System.err.println("inputFilename  = " + inputFilename);
        if(outputFilename != null) {
            System.err.println("outputFilename = " + outputFilename);
        }

        //pick the correct conversion, and call that
        doConversion();

        System.err.println("Finished.");
        System.exit(0);

    }

    private static String getArgValue(String toFind, String[] args) {
        for (int i = 0; i < args.length; i++) {
            //if this is the string we want and we have another token
            if (args[i].equals(toFind) && i + 1 < args.length) {
                return args[i + 1].toString();
            }
        }
        return null;
    }
    
    private static Boolean interactiveMode(String[] args) {
        for(String s : args) {
            if(s.equals("-p") || s.equals("--prompt")) {
                return true;
            }
        }
        return false;
    }

    private static Boolean userWantsHelp(String[] args) {
        for (String s : args) {
            if (s.equals("-h") || s.equals("--help")) {
                return true;
            }
        }
        return false;
    }

    private static void printHelp() {
        System.err.println("=== BETS CONVERTER HELP ===\n");
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
    }

    private static void doConversion() {
        switch (inputFormat) {
            case "iplant":
                ConvertIplant cvIplant = new ConvertIplant();
                if (outputFormat.equals("bets")) {
                    cvIplant.toBets(inputFilename, outputFilename);
                }
                break;  //valid        
            case "bets":
                ConvertBets cvBets = new ConvertBets();
                if (outputFormat.equals("iplant")) {
                    cvBets.toIplant(inputFilename, outputFilename);
                }
                if (outputFormat.equals("galaxy")) {
                    cvBets.toGalaxy(inputFilename, outputFilename);
                }
                if (outputFormat.equals("seq")) {
                    cvBets.toSeq(inputFilename, outputFilename);
                }
                if (outputFormat.equals("bld")) {
                    cvBets.toBld(inputFilename, outputFilename);
                }
                if (outputFormat.equals("bioextract")) {
                    cvBets.toBioextract(inputFilename, outputFilename);
                }
                break; //valid
            case "galaxy":
                ConvertGalaxy cvGalaxy = new ConvertGalaxy();
                if (outputFormat.equals("bets")) {
                    cvGalaxy.toBets(inputFilename, outputFilename);
                }
                break; //valid
            case "seq":
                ConvertSeq cvSeq = new ConvertSeq();
                if (outputFormat.equals("bets")) {
                    cvSeq.toBets(inputFilename, outputFilename);
                }
                break; //valid
            case "bld":
                ConvertBld cvBld = new ConvertBld();
                if(outputFormat.equals("bets")) {
                    cvBld.toBets(inputFilename, outputFilename);
                }
                break; //valid
            case "bioextract":
                ConvertBioextract cvBioextract = new ConvertBioextract();
                if(outputFormat.equals("bets")) {
                    cvBioextract.toBets(inputFilename, outputFilename);
                }
                break;
            default: //catch all invalid input formats
                //System.out.println("Should not reach this.");
                System.err.println("Converting from '" + inputFormat + "' to '"
                        + outputFormat + "' is not supported.");
                System.err.println("Plese see help by using the -h or --help "
                        + "flags");
                System.exit(-1);
        }

    }
}
