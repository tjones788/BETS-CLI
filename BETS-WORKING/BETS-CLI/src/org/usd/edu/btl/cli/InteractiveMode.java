package org.usd.edu.btl.cli;

import java.util.Scanner;
import static org.usd.edu.btl.cli.runCLI.performConversion;

/**
 *
 * @author Tyler_000
 */
public class InteractiveMode {

    private static String inputFormat = null;
    private static String outputFormat = null;
   // private static String inputFile = null;
    private static String outputFile = null;

    public static void userPrompts() {
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
                break;
            case "3":
                System.out.println("You HAVE a Galaxy file.");
                break;
            case "4":
                System.out.println("You HAVE a BLD file.");
                break;
            case "5":
                System.out.println("You HAVE a Seq file.");
                break;
            case "6":
                System.out.println("You HAVE a Bio Extract file.");
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
                break;
            case "2":
                System.out.println("You HAVE a BETS file.");
                break;
            case "3":
                System.out.println("You HAVE a Galaxy file.");
                break;
            case "4":
                System.out.println("You HAVE a BLD file.");
                break;
            case "5":
                System.out.println("You HAVE a Seq file.");
                break;
            case "6":
                System.out.println("You HAVE a Bio Extract file.");
                break;
            default:
                System.out.println("INVALID INPUT FORMAT");
        }
        
        System.out.println("\nPlease type the full input file name.");
        String inputFile = promptSc.next();
       
        System.out.println("\nPlease type your desired output file name.");
        String outputFile = promptSc.next();
        System.out.println(outputFile);
        
        promptSc.close();
        performConversion(inputFormat, outputFormat, outputFile);
    }
}
