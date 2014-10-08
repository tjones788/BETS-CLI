#BETS-Command Line Interface README

This command line tool is designed to convert bioinformatics tool specifications from various platforms to BETS(Bioinformatics Elaborated Tool Specifiation)
This tool allows a user to specify a valid .json or .xml input file and easily convert it to a specific tool specification and write to a file or print to the screen.

**To run the project from the command line, go to the dist folder and
type the following:**

java -jar "BETS-CLI.jar" 

**In Windows:**
* Shift + Right Click on dist folder --> "Open command window here"

* Type: java -jar BETS-CLI.jar \*arguments go here\*

**Example:** java -jar BETS-CLI.jar  -I iplant -O bets -i test_iplant.json -o betsOutput

To view help: java -jar BETS-CLI.jar -h

---
#BETS-CLI HELP
 
Lists the valid arguments, input formats, output formats, and other options. 

**Input Format:** -I --inputformat; [ -I iplant] [--inputformat bets]
  * Desc: Format of Input File
  * Options: iplant, bets, galaxy, seq, bld, bioextract

**Output Format:** -O --outputformat; [-O galaxy] [--outputformat bets]
  * Desc: Format to Convert to
  * Options: iplant, bets, galaxy, bioextract, seq, bld

**Input File:** -i --infile; [-i test_iplant.json]
  * Desc: Specified Input File  (Some example test files are located in the "dist/test_inputs" folder)
  * **Input File MUST be located in dist/test_inputs**
  
**Output File Name:** -o --outfile; [-o test] [--outfile test]
  * Desc: Name of the output file to be written.
  * Omitting this option will print the output to the screen.

**Help Menu:** -h --help
  * Desc: Print Help Menu

**Interactive Prompts:** -p --prompt
  * Desc: Starts interactive mode, where user is prompted for arguments.

**Example:** java -jar BETS-CLI.jar  -I iplant -O bets -i test.json -o output1

---
