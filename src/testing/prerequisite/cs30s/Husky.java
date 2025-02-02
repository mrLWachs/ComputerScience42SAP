
/** Required package class namespace */
package testing.prerequisite.cs30s;

/**
 * Husky.java - represents a Husky. This class uses inheritance to inherit
 * the properties and methods from the Students class, which was already 
 * inheriting (extending) from the Person class. Therefore, this class 
 * inherits from both (a double inheritance).
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Husky extends Student
{

    private boolean pride;                          // encapsulated property
    
    
    /**
     * Constructor for the class, sets the class properties to the default 
     * values or the passed parameters
     * 
     * @param name the name of this Husky "is a" Student "is a" Person
     * @param age the age of this Husky "is a" Student "is a" Person
     * @param gender the gender of this Husky "is a" Student "is a" Person
     * @param number the number of this Husky "is a" Student 
     */
    public Husky(String name, int age, String gender, int number) {
        super(name, age, gender, number);        // Calling super constructor
        pride = true;                           // Set internal property
    }
    
    /**
     * Talking overrides the same talk method of the parent class (Student)
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();   // Call to super talk(), it calls super talk() also
        System.out.println("\t Pride is " + pride);
    }
    
}