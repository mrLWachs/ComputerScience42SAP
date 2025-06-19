
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
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
     */
    public Part3() {
        if (Simulator.check("AP curriculum - Part 3")) return;
        new APUnit06Arrays();
        new APUnit082DArrays();        
    }
        
}