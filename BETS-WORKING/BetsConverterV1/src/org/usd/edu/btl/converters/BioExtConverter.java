
package org.usd.edu.btl.converters;

import java.util.ArrayList;
import java.util.List;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;
import org.usd.edu.btl.betsconverter.BETSV1.Constraint;
import org.usd.edu.btl.betsconverter.BioExtV1.BioExtV1;

/**
 *
 * @author Tyler.Jones
 */
public class BioExtConverter {

    public static BETSV1 toBETS(BioExtV1 bioExt) {
        BETSV1 bets = new BETSV1();
//        StringBuilder sb = new StringBuilder();
//        sb.append(bioExt.getName());
//        sb.append("-");
//        sb.append(bioExt.getId().toString());
        bets.setName(bioExt.getName()); //name = tool name-id
        // set Bets version to BE id?
        bets.setVersion(bioExt.getId().toString());
        bets.setDescription(bioExt.getDescription());

        List<org.usd.edu.btl.betsconverter.BioExtV1.Inputs> bExtInputs = bioExt.getInputs(); //get be inputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Input> betsInputs = new ArrayList<>();
        //for each be input, create a bets input and add it to the bets list
        for (int i = 0; i < bExtInputs.size(); i++) {
            //get the first bExt input
            org.usd.edu.btl.betsconverter.BioExtV1.Inputs bExtInput = bExtInputs.get(i);
            //create a new bets input
            org.usd.edu.btl.betsconverter.BETSV1.Input betsInput = new org.usd.edu.btl.betsconverter.BETSV1.Input();
            List<Constraint> inputCons = new ArrayList<>();

            betsInput.setName(bExtInput.getName());
            betsInput.setDescription(bExtInput.getDescription());
            betsInput.setRequired(bExtInput.isRequired());

            Constraint idCon = new Constraint(); //constraint for input ID
            idCon.setLabel("ID");
            idCon.setValue(bExtInput.getId().toString());
            inputCons.add(idCon);

            Constraint nameSpCon = new Constraint();
            nameSpCon.setLabel("Namespace");
            nameSpCon.setValue(bExtInput.getNamespace());
            inputCons.add(nameSpCon);

            betsInput.setConstraint(inputCons);

            betsInputs.add(betsInput);
        }
        bets.setInputs(betsInputs);

        //get outputs
        List<org.usd.edu.btl.betsconverter.BioExtV1.Outputs> bExtOutputs = bioExt.getOutputs(); //get be inputs
        List<org.usd.edu.btl.betsconverter.BETSV1.Output> betsOutputs = new ArrayList<>();
        //for each be input, create a bets input and add it to the bets list
        for (int i = 0; i < bExtOutputs.size(); i++) {
            //get the first bExt input
            org.usd.edu.btl.betsconverter.BioExtV1.Outputs bExtOutput = bExtOutputs.get(i);
            //create a new bets input
            org.usd.edu.btl.betsconverter.BETSV1.Output betsOutput = new org.usd.edu.btl.betsconverter.BETSV1.Output();
            List<Constraint> outputCons = new ArrayList<>();

            betsOutput.setName(bExtOutput.getName());
            //get outputID
            Constraint idCon = new Constraint(); //constraint for input ID
            idCon.setLabel("ID");
            idCon.setValue(bExtOutput.getId().toString());
            outputCons.add(idCon);
            //get output namespace
            Constraint nameSpConOut = new Constraint();
            nameSpConOut.setLabel("Namespace");
            nameSpConOut.setValue(bExtOutput.getNamespace());
            outputCons.add(nameSpConOut);
            //get output description
            Constraint descCon = new Constraint();
            descCon.setLabel("Description");
            descCon.setValue(bExtOutput.getDescription());
            outputCons.add(descCon);

            betsOutput.setConstraint(outputCons); //set the output constraints

            betsOutputs.add(betsOutput); //add output to bets output list
        }
        bets.setOutputs(betsOutputs); //set bets outputs

        return bets;
    }
}
