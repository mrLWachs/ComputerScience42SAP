
/** Required package class namespace */
package testing.prerequisite.cs30s;

/**
 * Meeting.java - represents a meeting. This class associates ("has a") with
 * objects of the Person class (through an array). It uses the concept of 
 * polymorphism to allow any Person objects or children (sub-classes) of the 
 * Person class to be added to the array.
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class Meeting 
{

    private int count;          // Stores count of people (and array index)
    private final int MAX;      // The maximium for the array
    private Person[] members;   // Associate array of Person object
    
    
    /**
     * Default constructor, set the class properties to default values
     */
    public Meeting() {
        MAX     = 500;              // Maximum number of people who can attend
        members = new Person[MAX];  // Initializing the array
        count   = 0;                // No one yet at the meeting
    }
    
    /**
     * Adds a person to the members (the encapsulated array) of the meeting
     * 
     * @param person the Person object to add
     */
    public void attend(Person person) {
        members[count] = person;        // Assigning the parameter to the array
        count++;                        // Advance index to next array location
        if (count >= MAX) count = 0;    // Error check the bounds of the array
    }
    
    /**
     * Has all of the active members of the meeting talk
     */
    public void hold() {
        System.out.println("Meeting will now begin with " + count + " members");
        for (int i = 0; i < count; i++) {       // Loop through
            members[i].talk();                  // Have a member talk
        }
    }    
   
}