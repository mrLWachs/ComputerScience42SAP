/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;


/*
 * Person - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 * 
 * @author Mr. Wachs
 * @since Mar 17, 2025
*/
public class Person
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We can add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global variable) is encapsulated
    // or not. Meaning: is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public String name;    
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */ 
    private int age;
    
    public String gender;
        
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean alive;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties by assigning the passed
     * parameter value into the object's (class) property (global variable) of
     * the same name using the keyword "this"
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {
        alive = true;           // Could have also written "this.alive = true;"
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.name   = name;
        this.age    = age;
        this.gender = gender;  
    }
    
    /**
     * A "private" method (also sometimes called a "utility" or "helper" method)
     * can only be called by other methods inside this class - not by any other
     * classes
     */
    private void born() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (alive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person Over-riding from: " + super.toString();
    }
    
    /**
     * Equals comparison, determines if two objects are "equal" in this context
     * 
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // The simpliest version of this over-ride method just makes all objects
        // of type "Person" equal with no logical check of anything. Usually,
        // over-riding this method means the programmer writes in custom logic
        // usually examing class properties to determine "equality" or not
        return true;
    }
    
    /**
     * Method clone, create a copy object 
     * 
     * @return a "clone" of the object 
     */
    @Override
    public Person clone() {
        // The process of "cloning" means to create a "duplicate", or to "copy"
        return this;
        // This is a useless, and very shallow clone
    }
    
    /**
     * A "static" method means the method is "shared" by all objects of the 
     * class - it can also be called from the class itself, you can use the 
     * class name then a dot to call static methods
     */
    public static void endTheWorld() {
        System.out.println("Boom!!!!");
    }
    
    /**
     * Accessor method (or "getter" method) that give you (or "reads") the 
     * gender of this person object (which is a private property of this class 
     * which normally cannot be read outside the class). Sometimes you write a 
     * accessor method so user outside the class can "read only" that property
     * without the ability to change that property
     * 
     * @return the person's gender (to "see" or "access" it)
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Another accessor method. Sometimes, we also write a "mutator" method to
     * go with the accessor method. Sometimes we write a mutator without a  
     * accessor.
     * 
     * @return the person's alive state
     */
    public boolean getAlive() {
        return alive;
    }
    
    /**
     * Mutator method (or "setters") that 'changes' the encapsulated (protected)
     * property of this person (which is a protected property of this class 
     * which cannot be changed outside the class). Often programmers write error 
     * checking code into mutator methods so the property cannot just be "set"
     * to anything - but is error checked first
     * 
     * @param alive the new alive state to set (mutate) the property into
     */
    public void setAlive(boolean alive) {
        // A programmer could potentially write error checking code here..
        this.alive = alive;
    }
    
    /**
     * Consumes the passed food object (it will be a child of the Food class 
     * object) by outputting it to the screen
     * 
     * @param food the abstract food object to consume
     */
    public void consume(Food food) {
        System.out.println(name + " is eating " + food.eat());
    }
        
}