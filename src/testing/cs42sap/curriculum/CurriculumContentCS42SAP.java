
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;

 
/**
 * CurriculumContentCS42SAP.java - the curriculum content from the advanced
 * placement (AP) Computer Science curriculum.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class CurriculumContentCS42SAP 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public CurriculumContentCS42SAP(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP curriculum content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP curriculum content");         
        new Part1(state);
        new Part2(state);
        new Part3(state);
        new Part4(state);
    }
    
}