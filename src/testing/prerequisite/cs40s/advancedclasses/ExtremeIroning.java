
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;


/**
 * ExtremeIroning.java - enforcing "the rules" of Extreme Ironing (and sports).
 * It is an extreme sport in which people take ironing boards to remote 
 * locations and iron items of clothing.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public interface ExtremeIroning extends Sports
{
    
    /**
     * Determines if the participant meets the requirements to participate
     * 
     * @param boardLength the length of the ironing board must be 1 meter
     * @param boardWidth the width of the ironing board must be 30 centimeters
     * @return true/yes (they can participate) or no/false
     */
    boolean metRequirements(int boardLength, int boardWidth);
    
    /**
     * Judge the participant on how well they did and how extreme they were
     * 
     * @return a judgment of the style of extreme ironing
     */
    String judge(); 

}
