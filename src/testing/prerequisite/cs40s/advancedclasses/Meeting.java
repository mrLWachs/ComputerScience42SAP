/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since May 2, 2025, 10:09:29 a.m.
 */
public class Meeting 
{
    
    // The modifier words "private" encapsulates, "int" defines the data type
    // of this name (or "variable", "property", "field")
    private int count;      // How many people are attending
    
    // The modifier "final" turns the field into a constant
    private final int MAX;  // The maximum the meeting can hold
    
    // Array (because of the square brackets) of class level objects, the
    // Meeting "has a" (associated with) Person (an array of them)
    private Person[] members;   // All the people at the meeting
    
    
    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX   = 500;
        count = 0;
        // Need to "build" (construct, instantiate) our array
        members = new Person[MAX];
        // However, although the array has its size now set up, all the index 
        // values (spots in the array) are filled with "nulls" (no Person 
        // objects/instances are yet in the array)
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person a Person object to attend the meeting
     */
    public void attend(Person person) {
        // Assign (put, place) the person object (instance of the Person class)
        // passed into this method's parameter into the first empty (unassigned)
        // index (spot, element, location, subscript) of the array property
        // of the Meeting class (global variable)        
        members[count] = person;
        
        // Now advance the count
        count++;
                
        // Potential out of bounds ("range") error with count, we fix with
        if (count >= MAX) {
            // Potentially we could make the array bigger (resize, 
            // re-dimension) - however, whenever you do this it wipes out
            // (recreates, re-dimensions) all array content. So let's just
            // reassign the count
            count = 0;
        }
    }
    
    /**
     * Hold the meeting for all members
     */
    public void hold() {
        // Make a variable to hold a bunch of potential output data
        String message = "Meeting is about to begin...\n";
        
        // Now we loop through the entire array ("traverse" means to travel to 
        // or visit every spot) from start (index zero) to the finish (index of 
        // the length minus one) - using a NEW type of loop (a new "for" loop)
        // called the "enhanced for loop". To create the enhanced for loop 
        // use the shortcut: type "for" then CTRL + SPACE and pick the fourth 
        // option that appears from the top, or type "fore" and TAB 
        
        // Another example of an enhanced for loop...
        // String dogs[] = { "golden", "lab", "poodle", "shitzu" };
        // for (String dog : dogs) {
            //// "for every dog in dogs"
        // }
        
        // For comparison, a regular for loop would be code like this:
        // for (int i = 0; i < members.length; i++) {
        //    Person member = members[i];
        // }  
        
        for (Person member : members) {
            // The enhanced for loop should be read as:
            // "for every member in members"
            // The "member" object of type "Person" automatically goes through
            // (traverses) from the start to the end of the array automatically
            // changing "person" each time through the loop to the next element
            // in order...
            
            // Only going to count people (Person objects) that "exist"
            // (that are not a "null")  
            if (member != null) {
                
                message += "\n";
                
                // The "instanceof" operator takes an object (instance) on the
                // left hand side (LHS) and the class type on the right hand
                // side (RHS) and it is true if the object 'comes from' that
                // class (is a instance of that class type)  
                
                if (member instanceof Person)     message += "\t Person ->";
                if (member instanceof Student)    message += "\t Student ->";
                if (member instanceof Teacher)    message += "\t Teacher ->";
                if (member instanceof Doctor)     message += "\t Doctor ->";
                if (member instanceof DiskJockey) message += "\t DiskJockey ->";
                if (member instanceof MrWachs)    message += "\t MrWachs ->";
                if (member instanceof HighSchool) message += "\t HighSchool ->";
                if (member instanceof Husky)      message += "\t Husky ->";
                if (member instanceof Piper)      message += "\t Piper ->";
                if (member instanceof Athlete)    message += "\t Athlete ->";
                
                message += "\t" + member.toString();
            }     
        }
        
        // And display the static variable value...
        message += "\n\nWith " + Student.total + " students present!";
        
        // Finally output that message
        message += "\n\nMeeting is complete!";
        System.out.println(message);
    }
     
}