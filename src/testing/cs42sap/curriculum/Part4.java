
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import utility.io.Simulator;
import testing.cs42sap.curriculum.units.APUnit10Recursion;
import testing.cs42sap.curriculum.units.APUnit07ArrayList;

 
/**
 * Part4.java - Part 4 of the Advanced Placement (AP) curriculum content which
 * covers the following topics from the curriculum:
 *      (1) ArrayList - AP Unit 7
 *      (2) Recursion - AP Unit 10
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Part4 
{

    /**
     * Default constructor, set class properties
     */
    public Part4() {
        if (Simulator.check("AP curriculum - Part 4")) return;
        new APUnit07ArrayList();
        new APUnit10Recursion();        
    }
        
}