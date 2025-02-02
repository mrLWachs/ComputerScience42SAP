
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import testing.cs42sap.curriculum.units.APUnit02UsingObjects;
import testing.cs42sap.curriculum.units.APUnit05WritingClasses;
import testing.cs42sap.curriculum.units.APUnit09Inheritance;

 
/**
 * Part2.java - Part 2 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Using Objects - AP Unit 2
 *      (2) Writing Classes - AP Unit 5
 *      (3) Inheritance - AP Unit 9
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part2 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Part2(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP curriculum - Part 2 not running");
            return;
        }
        Simulator.title("AP curriculum - Part 2");
        new APUnit02UsingObjects(state);
        new APUnit05WritingClasses(state);
        new APUnit09Inheritance(state);        
    }
        
}