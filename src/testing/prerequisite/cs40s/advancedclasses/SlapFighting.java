
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;


/**
 * SlapFighting.java - enforcing "the rules" of slap fighting (and sports)
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public interface SlapFighting extends Sports
{
    
    /**
     * A player slaps another player
     * 
     * @param slapper the person doing the slapping
     * @param slapie the person who got slapped
     */
    void slap(String slapper, String slapie);
    
    /**
     * Checks if the game is over
     * 
     * @return they are knocked out (true) or not (false)
     */
    boolean isKnockedOut();

}
