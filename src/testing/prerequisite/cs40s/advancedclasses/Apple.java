/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Apple.java - represents an apple. This class inherits from the abstract 
 * class (Food) all its properties and methods. However, the abstract methods  
 * are FORCED to be over-ridden in this class (now we move from the 'abstract' 
 * to the 'concrete') and the methods MUST now be given a method body (now you
 * define HOW for this particular food object). Regular methods can still be
 * over-ridden as well.
 *
 * @author Mr. Wachs
 * @since May 7, 2025, 10:30:55 a.m.
 */
public class Apple extends Food
{
    
    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(3);                   // Call super-constructor, passing the group
        super.flavour = "Sweet";    // Modifying our protected property
    }

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Wash it first");
    }

    /**
     * Determines if this 'apple' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;       // Access public property
    }

    /**
     * Smell the 'apple' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 3) super.eatable = false;
        else             super.eatable = true;
    }
    
    /**
     * You still can over-ride methods from an abstract class that are not 
     * abstract methods (concrete methods) as an option. This method defines
     * how to eat an apple specifically
     * 
     * @return 
     */
    @Override
    public String eat() {
        return "Apple from " + super.eat();
    }

}