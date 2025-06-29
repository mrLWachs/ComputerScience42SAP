/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Piper.java - represents a Piper HighSchool Student Person 
 *
 * @author Mr. Wachs
 * @since May 2, 2025, 10:09:14 a.m.
 */
public class Piper extends HighSchool
{

    /**
     * Default constructor, set class properties
     */
    public Piper() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Piper: " + super.toString();
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
    public Piper clone() {
        return this;
    }
    
}