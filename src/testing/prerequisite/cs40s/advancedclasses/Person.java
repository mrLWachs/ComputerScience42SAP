
/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;

/** Required API imports */
import utility.io.System;


/** 
 * Person.java - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 *
 * @author Mr. Wachs 
 * @since June 2023
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
    private String gender;
    
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean alive;          // Encapsulated property
    protected int age;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {     
        alive  = true;
        age    = 0;
        gender = "unidentified";
        name   = "unidentified";
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
     * The person dies (changing/modifying) the private, encapsulated 
     * property (alive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies as " + gender);
        }
        else {
            System.out.println("Booooo!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        // This method over-rides the toSting method inherited from the object 
        // class. As well, all children of this class will inherit this method
        // unless they also over-ride the method themselves
        return "Person";
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // SHALLOW equals method could be a simple comparison like this:
        // return true;
        
        // DEEP equals method could be a "deeper" comparison like this:
        
        // First need to "cast" the object parameter into a "Person" object
        Person that = (Person)object;
        
        // Compare the things (properties) we want to compare
        if (this.alive != that.alive)         return false;
        if (this.age   != that.age)           return false;
        if (!this.name.equals(that.name))     return false;
        if (!this.gender.equals(that.gender)) return false;
                
        // We made it through all the above "if" checks, so they are equal
        return true;
    }
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        // Shallow clone method could be something like:
        // return this;
        
        // Deep clone method could be something like:
        // First create new memory (do not use the same memory)
        Person that = new Person();
        // To go even deeper, we need to duplicate (clone) the properties
        that.name   = this.name;
        that.age    = this.age;
        that.gender = this.gender;
        that.alive  = this.alive; 
        // Finally return the copied (cloned) new object
        return that;        
    }
    
    /**
     * Accessor method (or "getter" method) that give you (or "reads") the age
     * of this person object (which is a private property of this class which
     * normally cannot be read outside the class). Sometimes you write a 
     * accessor method so user outside the class can "read only" that property
     * without the ability to change that property
     * 
     * @return the person's current age value to "see" (access)
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Another accessor method. Sometimes, we also write a "mutator" method to
     * go with the accessor method. Sometimes we write a mutator without a  
     * accessor.
     * 
     * @return the person's gender
     */
    public String getGender() {
        return gender;
    }
        
    /**
     * Mutator method (or "setters") that 'changes' the encapsulated (private)
     * property of this person (which is a private property of this class which  
     * cannot be changed outside the class). Often programmers write error 
     * checking code into mutator methods so the property cannot just be "set"
     * to anything - but is error checked first
     * 
     * @param gender the new gender to set (mutate) the property into
     */
    public void setGender(String gender) {
        // A programmer could potentially write error checking code here..
        this.gender = gender;
    }
    
    /**
     * A "static" method means the method is "shared" by all objects of the 
     * class - it can also be called from the class itself, you can use the 
     * class name then a dot to call static methods
     */
    public static void endTheWorld() {
        System.out.println("Boom!!!");
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

