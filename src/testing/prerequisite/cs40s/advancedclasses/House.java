/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;


/**
 * House.java - represents a House. This class uses two different 'generic' 
 * objects as properties of the class. The two are separated in the class
 * signature line with a comma. Also, the first generic "T" is a restricted
 * generic. this means you can use any data type as long as it fits the 
 * restrictions. This means you can use any Person object, or any of the 
 * children of the Person class. 
 *
 * @author Mr. Wachs
 * @since May 12, 2025
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
     * @param items the array of generic items that are restricted to Food
     * objects or children of the Food class
     */
    public <V extends Food> void party(V[] items) {
        System.out.print("Home owner: ");
        System.out.print(homeOwner.name);
        System.out.print(" and the contents of the house are: ");
        System.out.println(contents.toString());
        // Enhanced for loop ("For every item in items")
        for (V item : items) {
            homeOwner.consume(item);
        }        
    }
    
}