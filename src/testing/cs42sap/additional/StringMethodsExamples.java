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
        
        ////////////////////////////////////////////////////////////////////////
        // Let us start learning about String methods...
        ////////////////////////////////////////////////////////////////////////
        
        /**
         * Some in-class research summaries done on Strings...
         * ===================================================
         * 
         * These resources provide a comprehensive guide to Java String 
         * manipulation specifically tailored for the AP Computer Science A 
         * examination. They detail essential String methods such as length(), 
         * indexOf(), equals(), and compareTo(), alongside the critical concept 
         * of immutability, which ensures that strings remain unchanged after 
         * creation. The documentation highlights common programming pitfalls, 
         * including off-by-one errors in substring() calls and the incorrect 
         * use of the == operator for content comparison. Furthermore, the 
         * texts offer algorithmic strategies for processing text, such as 
         * using loops for character-by-character analysis and the accumulator 
         * pattern for building new strings. Practical exam preparation is also 
         * included, featuring FRQ practice problems, code tracing tips, and a 
         * breakdown of the 2026 exam format. Through code examples and 
         * technical definitions, these sources equip students with the 
         * necessary tools to handle complex text-based data in a Java 
         * environment. 
         */
                
        ////////////////////////////////////////////////////////////////////////
        // (1) Create some string objects with a constant and then using the
        //     String constructor        
        ////////////////////////////////////////////////////////////////////////
        
        final String TEXT = "collection of characters";
        System.out.println("TEXT    = " + TEXT);
        String string = new String(TEXT);
        System.out.println("string  = " + string);
        System.out.println("indices: '012345678901234567890123'");
        
        ////////////////////////////////////////////////////////////////////////
        // (2) The length String method which gives you the number of characters 
        //     in the string
        ////////////////////////////////////////////////////////////////////////
        
        int length = string.length();
        System.out.println("length = " + length);
        
        ////////////////////////////////////////////////////////////////////////
        // (3)  The subString String method draws out a string from the existing  
        //      string from a starting index to a finishing index (not including  
        //      that index character)
        ////////////////////////////////////////////////////////////////////////        
        
        String subString1 = string.substring(11, 18);
        System.out.println("subString(11,18) = '" + subString1 + "'");
        
        ////////////////////////////////////////////////////////////////////////
        // (4) Overloaded subString String method takes the sub-string from the  
        //     string from the passed index to the end of the string
        ////////////////////////////////////////////////////////////////////////
        
        String subString2 = string.substring(11);
        System.out.println("subString(11) = '" + subString2 + "'");
        
        ////////////////////////////////////////////////////////////////////////
        // (5) The indexOf String method searches the string for the first  
        //     occurance of the passed string and returns the index it starts 
        //     at or a -1 if not found
        ////////////////////////////////////////////////////////////////////////
        
        int index = string.indexOf("of");
        System.out.println("indexOf('of') = " + index);
        
        ////////////////////////////////////////////////////////////////////////
        // (6) The equals String method compares two string lexographically and 
        //     determines if they are equal or not
        ////////////////////////////////////////////////////////////////////////
        
        String letter1 = "aaa";
        String letter2 = "bbb";
        String letter3 = "ccc";
        System.out.println("letter1 = " + letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        boolean equals1 = letter1.equals(letter2);
        boolean equals2 = letter1.equals(letter1);
        System.out.println("letter1.equals(letter2) = " + equals1);
        System.out.println("letter1.equals(letter1) = " + equals2);
        
        ////////////////////////////////////////////////////////////////////////
        // (7) The compareTo String method examines the two strings   
        //     lexographically and determines if the strings are equal, less  
        //     than, or greater than each other
        ////////////////////////////////////////////////////////////////////////
        
        int compare1 = letter1.compareTo(letter1);
        int compare2 = letter1.compareTo(letter2);
        int compare3 = letter2.compareTo(letter1);
                      // bbb            // aaa
        
        System.out.println("letter1.compareTo(letter1) = " + compare1);
        System.out.println("letter1.compareTo(letter2) = " + compare2);
        System.out.println("letter2.compareTo(letter1) = " + compare3);
        
        ////////////////////////////////////////////////////////////////////////
        // (8) The split String method returns a string array where each element
        //     is a substring of this string, which has been split around
        //     matches of the given expression parameter
        ////////////////////////////////////////////////////////////////////////
        
        String split1 = "supercalifragilisticexpialidocious";
        String[] array1 = split1.split("a");
        System.out.println("Example 1: " + split1 + " -> .split('a')");
        for (String string1 : array1) {
            System.out.println("->" + string1 + "<-");
        }
        
        String[] array2 = split1.split("fragil");
        System.out.println("Example 2: " + split1 + " -> .split('fragil')");
        for (String string1 : array2) {
            System.out.println("->" + string1 + "<-");
        }
        
        String[] array3 = split1.split("[a,i]");
        System.out.println("Example 3: " + split1 + " -> .split([a,i])");
        for (String string1 : array3) {
            System.out.println("->" + string1 + "<-");
        }
        String split2 = "The fat cat, sat on a red mat. That cat, is PHAT!";
        String[] array4 = split2.split("[ ,.!]");
        System.out.println("Example 4: " + split2 + " -> .split([ ,.!])");
        for (String string1 : array4) {
            System.out.println("->" + string1 + "<-");
        }
        
        System.out.println("Completed String Methods.........................");
    }

}