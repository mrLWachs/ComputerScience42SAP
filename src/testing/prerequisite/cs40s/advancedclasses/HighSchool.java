/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * HighSchool.java - represents a high school student person. Before creating
 * this class we altered the NetBeans template (Tools - Templates) for a 
 * Java class so that the toString(), clone(), and equals() methods are now 
 * always part of any new class we create (whether or not we choose to over-ride
 * those methods). 
 * 
 * This class was later marked as a "abstract class" by adding the "abstract"
 * modifier word to the class signature line (below). An abstract class is a 
 * class which cannot be instantiated – in other words, you define it as a 
 * class but cannot use it to create an object. The purpose of doing this is 
 * to create a class which acts as a parent class (base class) for 
 * subclasses (child classes) but will not be needed to be instantiated 
 * in itself – it must be extended and its methods implemented. Once you 
 * have a abstract class, you can create abstract methods within the 
 * abstract class
 *
 * @author Mr. Wachs
 * @since May 2, 2025, 10:08:46 a.m.
 */
public abstract class HighSchool extends Student
{

    /**
     * Default constructor, set class properties
     */
    public HighSchool() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
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
    public HighSchool clone() {
        return this;
    }
    
}