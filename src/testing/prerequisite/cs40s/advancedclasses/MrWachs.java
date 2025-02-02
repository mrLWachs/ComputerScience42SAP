
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;

 
/**
 * MrWachs.java - represents a MrWachs Teacher Person
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class MrWachs extends Teacher
{

    /**
     * Default constructor, set class properties
     */
    public MrWachs() {
       super("Mr. Lawrence Wachs"); 
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "MrWachs: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public MrWachs clone() {
        return this;
    }
    
}