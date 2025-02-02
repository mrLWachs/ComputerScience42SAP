
/** Required package class namespace */
package testing;

/** Required API imports */
import utility.io.Simulator;


/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class Tester 
{

    public static final int DO_NOT_RUN    = 0;
    public static final int RUN_SIMULATED = 1;
    public static final int RUN_NORMAL    = 2;
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Tester() {
        this(RUN_NORMAL);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param state the run state of this code module
     */
    public Tester(int state) {
        if (state == DO_NOT_RUN) return;
        Simulator.initialize();
        Simulator.title("Mr. Wachs' Computer Science Classes");
        new PrerequisiteContent(DO_NOT_RUN); //state);      
        new ComputerScience42SAP(state); 
        new PostSecondaryContent(DO_NOT_RUN); //state); 
        Simulator.saveOutput();
    }
    
}
