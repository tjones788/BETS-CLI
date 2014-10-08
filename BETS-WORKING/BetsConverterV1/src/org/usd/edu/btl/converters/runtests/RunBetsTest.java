
package org.usd.edu.btl.converters.runtests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import org.usd.edu.btl.betsconverter.BETSV1.BETSV1;

/**
 *
 * @author billconn
 */
public class RunBetsTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        File betsInput = new File("test_bets.json");

        //System.out.println("Read first line: "+input.);
        ObjectMapper mapper = new ObjectMapper(); //create new Jackson Mapper

        try {
            BETSV1 testBets = mapper.readValue(betsInput, BETSV1.class);
            ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
            String betsJson = ow.writeValueAsString(testBets);
            System.out.println(betsJson);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}