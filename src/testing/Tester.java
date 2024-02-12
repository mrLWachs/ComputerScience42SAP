
/** Required package class namespace */
package testing;

/** Required API imports */
import io.Simulator;
import testing.cs30s.ComputerScience30S;
import testing.cs40s.ComputerScience40S;
import testing.cs42sap.ComputerScience42SAP;
import testing.cs42sap.bonus.BonusContentCS42SAP;


/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class Tester 
{

    /**
     * Default class constructor, runs on instantiation
     */
    public Tester() {
        Simulator.header("Mr. Wachs Computer Science testing started...");
        //new ComputerScience30S();
        //new ComputerScience40S();        
        new ComputerScience42SAP();        
        //new BonusContentCS42SAP();
        Simulator.saveOutput();
        Simulator.header("Mr. Wachs Computer Science testing complete!");
    }
    
}