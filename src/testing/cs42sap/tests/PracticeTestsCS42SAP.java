/** Required package class namespace */
package testing.cs42sap.tests;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;


/**
 * PracticeTestsCS42SAP - these are practice test to practice the types 
 * of multiple choice questions on the A.P. Computer Science exam
 * 
 * @author Mr. Wachs
 * @since Feb 28, 2024
*/
public class PracticeTestsCS42SAP
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public PracticeTestsCS42SAP(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP practice tests not running");
            return;
        }
        Simulator.title("Computer Science 42SAP practice tests");         
        new PracticeTest1(state); 
        new PracticeTest2(state); 
        new PracticeTest3(state); 
        new PracticeTest4(Tester.DO_NOT_RUN);         
    }

}