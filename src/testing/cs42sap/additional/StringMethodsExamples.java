/** Required package class namespace */
package testing.cs42sap.additional;

/** Required API imports */
import utility.io.Simulator;

/*
 * StringMethodsExamples - This class is an example of some of the new 
 * additional content added to the CS42SAP course. This will entail Mr. Wachs 
 * leading students in direct instruction (lessons) in materials that fills any 
 * gaps in knowledge from the course work done with Mr. Wachs (CS20S, CS30S, 
 * and CS40S) as it relates to the AP Computer Science curriculum by having 
 * presentations, doing examples, and making notes. 
 *
 * DESCRIPTION:
 * ============
 * 
 * In the A.P. Computer Science A curriculum it states: "String objects can be
 * created by calling the String class constructor", "String objects are 
 * immutable, meaning that String methods do not change the String object", 
 * "String objects can be concatenated using the + or += operator, resulting 
 * in a new String object", "Primitive values can be concatenated with a 
 * String object. This causes implicit conversion of the values to String
 * objects", and "The toString method is an overridden method that is included
 * in classes to provide a description of a specific object". More so, the 
 * Java Quick Reference Sheet (see: https://bit.ly/4kNITPG ) that you will 
 * have available at the AP exam is specific which methods for the String 
 * class should be known. In addition, the Integer and Double wrapper classes
 * along with the Math class methods are referenced on this sheet. This example
 * will go over all those methods below...
 * 
 * NOTE: Some other websites that go over String methods include:
 *       - https://bit.ly/4kKZ404
 *       - https://bit.ly/4kJris5
 *       - https://bit.ly/4ipVZRA
 *       - https://bit.ly/4iq4cVT
 *
 * SPECIFICALLY FROM THE AP COMPUTER SCIENCE CURRICULUM:
 * =====================================================
 * 
 * See: https://bit.ly/3ONCRCY (section 1.15 and 2.10)
 * 
 * Learning Objective: Develop code to create string objects and determine the 
 *                     result of creating and combining strings
 * Learning Objective: Develop code to call methods on string objects and 
 *                     determine the result of calling these methods
 * Learning Objective: Develop code for standard and original algorithms that 
 *                     involve strings and determine the result of these 
 *                     algorithms
 * 
 * Specifics: A String object represents a sequence of characters and can be 
 * created by using a string literal or by calling the String class 
 * constructor. The String class is part of the java.lang package. Classes in 
 * the java.lang package are available by default. A String object is 
 * immutable, meaning once a String object is created, its attributes cannot 
 * be changed. Methods called on a String object do not change the content of 
 * the String object. Two String objects can be concatenated together or 
 * combined using the + or += operator, resulting in a new String object. A 
 * primitive value can be concatenated with a String object. This causes the 
 * implicit conversion of the primitive value to a String object. A String 
 * object can be concatenated with any object, which implicitly calls the 
 * object’s toString method (a behavior that is guaranteed to exist by the 
 * inheritance relationship every class has with the Object class). An 
 * object’s toString method returns a string value representing the object. 
 * Subclasses of Object often override the toString method with class - 
 * specific implementation. Method overriding occurs when a public method in 
 * a subclass has the same method signature as a public method in the 
 * superclass, but the behavior of the method is specific tothe subclass. A 
 * String object has index values from 0 to one less than the length of the 
 * string. Attempting to access indices outside this range will result in an 
 * IndexOutOfBoundsException. The following String methods—including what 
 * they do and whenthey are used — are part of the Java Quick Reference: 
 * • int length() returns the number of characters in a String object. 
 * • String substring(int from, int to) returns the substring beginning at 
 * index from and ending at index to - 1. • String substring(int from) 
 * returns substring(from, length()). • int indexOf(String str) returns the 
 * index of the first occurrence of str; returns -1 if not found. • boolean 
 * equals(Object other) returns true if this corresponds to the same sequence 
 * of characters as other; returns false otherwise. • int compareTo(String 
 * other) returns a value < 0 if this is less than other; returnszeroif this 
 * is equal to other; returns a value > 0 if this is greater than other. 
 * Strings are ordered based upon the alphabet. A string identical to the 
 * single element substring at position index can be created by calling 
 * substring(index, index + 1). 
 * 
 * @author Mr. Wachs
 * @since Mar 11, 2026
*/
public class StringMethodsExamples
{

    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting String Methods Examples");
        new StringMethodsExamples();
        Simulator.title("\nCompleted String Methods Examples");
    }

    /**
     * Default constructor, set class properties
     */
    public StringMethodsExamples() {  
        System.out.println("Learn about String Methods.......................");
        
        
        
        System.out.println("Completed String Methods.........................");
    }

}