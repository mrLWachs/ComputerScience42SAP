/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * CheeseRolling.java - follows the rules of British Cheese Rolling - see:
 * https://www.youtube.com/watch?v=iRKuT2fBnzg
 *
 * @author Mr. Wachs
 * @since May 9, 2025, 10:12:54 a.m.
 */
public interface CheeseRolling extends Sports
{
    void start(int seconds);
    void violenceLevel(String level);
}
