
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;

/** Required API imports */
import utility.io.System;


/**
 * House.java - represents a house, and has a homeowner property who 
 * generically restricted to be a person object or any children of the person
 * class. Also it contains contents (a property) which can be generically
 * anything. To add another generic, use a comma "," in the class signature
 * inside the angle brackets "< >" and another letter (a different letter) to 
 * act as another placeholder.
 *
 * @author Mr. Wachs
 * @param <T> the generic type of home owner (restricted to type Person and all
 * its children)
 * @param <U> the generic type for the contents of this house (unrestricted)
 * @since June 2023
 */
public class House <T extends Person, U>
{
    
    /**
     * The generic owner of this house (must be a Person object or any children
     * of that class)
     */
    public T homeOwner;
    
    /**
     * The generic contents in this house. Since this is a different generic 
     * object, a different letter is used (again it can be any letter you want)
     */
    public U contents;
    
    
    /**
     * Generic method that has the home owner consume all the generic 
     * restricted Food (all all Food children) items that are passed in an 
     * array
     *
     * @param <V> Food objects (or children of the Food class)
     * @param items the array of generic items that are Food
     * objects or children of the Food class
     */
    public <V extends Food> void party(V[] items) {
        System.out.println("Home Owner:");
        System.out.println(homeOwner.name);
        System.out.println("And the contents...");
        System.out.println(contents.toString());
        // Enhanced for loop ("For every item in items")
        for (V item : items) {
            homeOwner.consume(item);
        }
    }
    
}