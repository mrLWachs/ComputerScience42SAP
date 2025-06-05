/** Required package class namespace */
package testing.prerequisite.cs30s;
 
/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since May 2025
 */
public class Person {

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global variable) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    public String name;
    
    private int age;
    
    public String gender;
    
    private boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    /**
     * Constructor method is a special method that has:
     *    (1) the same name as the class
     *    (2) the name starts with a capital letter
     *    (3) it has NO return type (not even the word "void")
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object. We previously had a "born()" method that did 
     * this, that we changed it into this constructor method. This method 
     * "brings the person to life" meaning it is used when the class is used to  
     * create a Person object. The method sets all the class properties (global 
     * variables) to their starting values ("defaults").
     */
    public Person() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    // This method was originally written and then deleted (commented out)
    // because the new constructor method performs the same purpose....
    
    // void born() {
    //     alive  = true;
    //     age    = 0;
    //     name   = "undefined";
    //     gender = "undefined";        
    // }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public
     * 
     * @param newName the new name for this person
     */
    public Person(String newName) {
        alive  = true;
        age    = 0;
        name   = newName;
        gender = "undefined";
    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties. Constructor methods with
     * NO parameters are called default constructors
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {
        alive  = true;
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.age    = age;
        this.name   = name;
        this.gender = gender;
    }
    
    /**
     * The person dies (changing/modifying) the property (alive) through 
     * this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else {
            System.out.println("Boooooooo!");
        }
    }
    
    /**
     * This method is a private method means it can be called (invoked)
     * inside the class by other methods of the class. Private methods are
     * rare and sometimes called "helper" or "utility" methods as they just 
     * help other methods.
     * 
     * Gives the person a birthday
     */
    private void birthday() {
        age++;
    }    
    
    /**
     * Gives the person a birthday, changes the encapsulated property (age).
     * This is a overloaded method meaning multiple methods with the same 
     * name but different parameters.
     * 
     * @param age home many birthdays to give the person
     */
    public void birthday(int age) {
        for (int i = 0; i < age; i++) {
            birthday();
        }
        // or you could just write...
        // this.age = age;
    }
    
}