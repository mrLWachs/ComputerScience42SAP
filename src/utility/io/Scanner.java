
/** Required package class namespace */
package utility.io;

/** Required API imports */
import java.io.InputStream;
import testing.Tester;

 
/**
 * Scanner.java - this class simulates the java.swing class that does the 
 * dialogs and user interfaces and redirects the outputs to a custom output
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Scanner 
{

    private static java.util.Scanner actual;
    
    /**
     * Default constructor for the class
     */
    public Scanner() { }

    /**
     * Constructor, set class properties 
     * 
     * @param in this simulator does nothing with the parameter
     */
    public Scanner(InputStream in) { 
        actual = new java.util.Scanner(in);
    }

    /**
     * Re-directs the console input to custom input
     * 
     * @return a simulated scanner input
     */
    public String nextLine() {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.scannerInput();
        }
        else {
            return actual.nextLine();
        }
    }

}
