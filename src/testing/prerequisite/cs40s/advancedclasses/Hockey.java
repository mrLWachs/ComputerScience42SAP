
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;


/**
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public interface Hockey extends Sports
{
    
    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    void score(String name);
    
    /**
     * The passed period of hockey is over
	 *
     * @param period the period number
     */
    void endOfPeriod(int period);
    
}
