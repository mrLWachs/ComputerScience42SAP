
/** Required package class namespace */
package testing;

/** Required API imports */
import utility.io.Simulator;
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.cs42sap.tests.PracticeTestsCS42SAP;


/**
 * ComputerScience42SAP.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class ComputerScience42SAP 
{

    /**
     * Default constructor for the class, sets class properties
     * 
     * @param state the run state of this code module
     */
    public ComputerScience42SAP(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP course content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP Course:");         
        new CurriculumContentCS42SAP(state); 
        new PracticeTestsCS42SAP(state);
    }
    
}