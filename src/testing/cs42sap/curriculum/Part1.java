
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import testing.cs42sap.curriculum.units.APUnit01PrimitiveTypes;
import testing.cs42sap.curriculum.units.APUnit03BooleanExpressionsAndIfStatements;
import testing.cs42sap.curriculum.units.APUnit04Iteration;

 
/**
 * Part1.java - Part 1 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) Primitive Types - AP Unit 1
 *      (2) Boolean Expressions and if Statements - AP Unit 3
 *      (3) Iteration - AP Unit 4
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part1 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Part1(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP curriculum - Part 1 not running");
            return;
        }
        Simulator.title("AP curriculum - Part 1");
        new APUnit01PrimitiveTypes(state);
        new APUnit03BooleanExpressionsAndIfStatements(state);
        new APUnit04Iteration(state);
    }
        
}