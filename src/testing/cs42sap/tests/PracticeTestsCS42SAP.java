/** Required package class namespace */
package testing.cs42sap.tests;

/** Required API imports */
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
     */
    public PracticeTestsCS42SAP() {
        if (Simulator.check("Practice Tests")) return;          
        new PracticeTest1(); 
        new PracticeTest2(); 
        new PracticeTest3(); 
        new PracticeTest4();         
    }

}