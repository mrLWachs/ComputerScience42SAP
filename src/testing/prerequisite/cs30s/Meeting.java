/** Required package class namespace */
package testing.prerequisite.cs30s;

/**
 * Meeting.java - represents a meeting. This class associates ("has a") with
 * objects of the Person class (through an array). It uses the concept of 
 * polymorphism to allow any Person objects or children (sub-classes) of the 
 * Person class to be added to the array.
 *
 * @author Mr. Wachs
 * @since May 2025
 */
public class Meeting 
{
    
    private Person[] members;       // associate array of Person objects
    private int index;              // encapsulated counter for the array
    private final int MAX = 500;    // constants maximum members
    
    
    /**
     * Default constructor, set the class properties to default values
     */
    public Meeting() { 
        index = 0;                  // initializing (set to default value)
        members = new Person[MAX];  // initializing the array
    }
    
    /**
     * Adds a person to the members (the encapsulated array) of the meeting
     * 
     * @param person the Person object to add
     */
    public void attend(Person person) { 
        members[index] = person;    // assigning the parameter to the array
        index++;                    // advance index to the next array location
        if (index >= MAX) index = 0;    // Error check the bounds of the array
    }
    
    /**
     * Has all of the active members of the meeting talk
     */
    public void hold() { 
        System.out.println("Meeting will now begin...");
        for (int i = 0; i < index; i++) {               // Loop through
            members[i].talk();                          // Have member talk
        }
    }
    
}