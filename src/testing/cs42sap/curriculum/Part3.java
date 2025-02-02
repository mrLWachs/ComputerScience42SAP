
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import testing.cs42sap.curriculum.units.APUnit06Arrays;
import testing.cs42sap.curriculum.units.APUnit082DArrays;

 
/**
 * Part3.java - Part 3 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Arrays - AP Unit 6
 *      (2) 2D Arrays - AP Unit 8
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part3 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Part3(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP curriculum - Part 3 not running");
            return;
        }
        Simulator.title("AP curriculum - Part 3");
        new APUnit06Arrays(state);
        new APUnit082DArrays(state);        
    }
        
}