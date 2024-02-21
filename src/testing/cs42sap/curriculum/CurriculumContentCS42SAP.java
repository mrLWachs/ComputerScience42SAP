
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import io.Simulator;

 
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
     */
    public CurriculumContentCS42SAP() {
        Simulator.title("Computer Science 42SAP curriculum content");         
        new Part1();
        new Part2();
        new Part3();
        new Part4();
    }
    
}