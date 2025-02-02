
/** Required package class namespace */
package testing.prerequisite.cs30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    
    public String name;
    
    private int age;        // Encapsulated this property
    
    public String gender;
    
    private boolean alive;  // Can be change through a method
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
       
    /**
     * Constructor method is a method that has:
     * (1) The same name as the class,
     * (2) The name starts with a capital letter
     * (3) Has NO return type (not even the word "void")
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object. Constructor methods with NO parameters are 
     * called "default" constructor methods
     */
    public Person() {
        alive  = true;
        age    = 0;
        name   = "unidentified";
        gender = "unidentified";
    }
    
    /**
     * A second Constructor method, that sets the class properties, This   
     * constructor method is an overloaded constructor method (remember: that   
     * overloaded methods are methods with the same name, but different 
     * parameters) 
     * 
     * @param newName the new name for this person
     */
    public Person(String newName) {
        alive  = true;
        age    = 0;
        name   = newName;
        gender = "unidentified";
    }
    
    /**
     * A third Constructor method, that sets the class properties. The keyword  
     * "this" is used as a "placeholder" to refer to the object that will  
     * (eventually) be created. Often used in constructor methods or other 
     * methods to refer to the class properties. Often used to avoid confusion 
     * with any method parameters that have the "same name" as the properties. 
     * It can also be used to implicitly call (invoke) methods within a class 
     * as the word "this" makes that implicit reference to the object itself
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {
        alive  = true;
        // Assign the parameter ("age") to the property "age" (global variable 
        // of this class) To do this, we use the keyword "this" which acts as 
        // a placeholder for the name of the object (which will be created at 
        // a later time)
        this.age    = age;
        this.name   = name;
        this.gender = gender;
    }
        
//    /**
//     * "Creates" a person - we deleted (by commenting out) this method as 
//     * The constructor method does what this method previous did!
//     */
//    void born() {
//        alive  = true;
//        age    = 0;
//        name   = "unidentified";
//        gender = "unidentified";
//    }
    
    /**
     * The person dies 
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Booo!");
        }
    }
    
    /**
     * Gives the person a birthday
     */
    public void birthday() {
        age++;
    }
        
}