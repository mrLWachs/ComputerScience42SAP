
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Sports.java - the interface for "sports". An interface is a "category" of 
 * abstract concepts. Even more abstract than a abstract class, it can be 
 * thought of as "a set of rules". It is a bit like a class, except it
 * can only contain method signatures (no method body, only the name, 
 * return type, and any parameters) and properties marked as final. 
 * They use the 'interface' modifier keyword instead of 'class'. You 
 * cannot create instances of an interface by itself, you must always 
 * create an instance of some class that 'implements' the interface. This 
 * means the other class "follows the rules" of that interface.
 *
 * @author Mr. Wachs
 * @since May 9, 2025, 10:05:59 a.m.
 */
public interface Sports 
{
    
    /**
     * Mutator method, setting the name of the player. Interface method 
     * signatures do not need a public/private/protected modifier (if you don't
     * want to state it) they are by default public. They contain no method
     * body (no curly brackets or code) only the name, and return type (or void)
     * and parameters (if needed). Like abstract methods (without the word
     * "abstract")
     * 
     * @param name setting the name of the player
     */
    void setName(String name);    
    
    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    void setOpponent(String name);    
    
    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    boolean didIWin();
    
}
