/** Required package class namespace */
package testing.cs42sap.additional;

/** Required API imports */
import java.util.ArrayList;
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
        
        
        ////////////////////////////////////////////////////////////////////////
        // (1) Create some string objects with a constant and then using the
        //     String constructor        
        ////////////////////////////////////////////////////////////////////////
        
        final String TEXT = "collection of characters";
        System.out.println("TEXT = " + TEXT);
        String string = new String(TEXT);
        System.out.println("String = '" + string + "'");
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
        boolean equals1 = letter1.equals(letter1);
        boolean equals2 = letter1.equals(letter2);
        System.out.println("letter1.equals(letter1) = " + equals1);
        System.out.println("letter1.equals(letter2) = " + equals2);
        
        ////////////////////////////////////////////////////////////////////////
        // (7) The compareTo String method examines the two strings   
        //     lexographically and determines if the strings are equal, less  
        //     than, or greater than each other
        ////////////////////////////////////////////////////////////////////////
        
        int compare1 = letter1.compareTo(letter1);
        int compare2 = letter1.compareTo(letter2);
        int compare3 = letter2.compareTo(letter1);        
        System.out.println("letter1.compareTo(letter1) = " + compare1);
        System.out.println("letter1.compareTo(letter2) = " + compare2);
        System.out.println("letter2.compareTo(letter1) = " + compare3);
        
        ////////////////////////////////////////////////////////////////////////
        // (8) The Integer constructor builds a Integer object from a primitive
        //     int value
        ////////////////////////////////////////////////////////////////////////
        
        final int VALUE = 42;        
        Integer integer = new Integer(VALUE);   
        System.out.println("Integer = " + integer);
        
        ////////////////////////////////////////////////////////////////////////
        // (9) The constants MIN_VALUE and MAX_VALUE retrieve the integer 
        //     limits
        ////////////////////////////////////////////////////////////////////////
        
        Integer minValue = Integer.MIN_VALUE;
        Integer maxValue = Integer.MAX_VALUE;        
        System.out.println("Integer.MIN_VALUE = " + minValue);
        System.out.println("Integer.MAX_VALUE = " + maxValue);
        
        ////////////////////////////////////////////////////////////////////////
        // (10) The intValue method pulls the primitive integer value from the 
        //      wrapper class Integer object
        ////////////////////////////////////////////////////////////////////////
        
        int value1 = integer.intValue();  
        System.out.println("integer.intValue() = " + value1);
        
        ////////////////////////////////////////////////////////////////////////
        // (11) The Double constructor builds a Double object from a primitive
        //      double value
        ////////////////////////////////////////////////////////////////////////
        
        final double DECIMAL = 3.14;        
        Double doub = new Double(DECIMAL);  
        System.out.println("Double = " + doub);
        
        ////////////////////////////////////////////////////////////////////////
        // (12) The doubleValue method pulls the primitive double value from the 
        //      wrapper class Double object
        ////////////////////////////////////////////////////////////////////////
        
        double value2 = doub.doubleValue();
        System.out.println("doub.doubleValue() = " + value2);
        
        ////////////////////////////////////////////////////////////////////////
        // (13) The Math abs method draws the absolute value from both an 
        //      integer and a double
        ////////////////////////////////////////////////////////////////////////
        
        final int    NEGATIVE_INT    = -42;
        final double NEGATIVE_DOUBLE = -3.14;        
        int absoluteValue1    = Math.abs(NEGATIVE_INT);
        double absoluteValue2 = Math.abs(NEGATIVE_DOUBLE);
        System.out.println("Math.abs(NEGATIVE_INT) = " + absoluteValue1);
        System.out.println("Math.abs(NEGATIVE_INT) = " + absoluteValue2);
        
        ////////////////////////////////////////////////////////////////////////
        // (14) The Math pow method calculates the power fromthe passed base and 
        //      exponent
        ////////////////////////////////////////////////////////////////////////
        
        double power = Math.pow(5, 3);
        System.out.println("Math.pow(5, 3) = " + power);
        
        ////////////////////////////////////////////////////////////////////////
        // (15) The Math sqrt emthod calculates the square root of the passed 
        //      value
        ////////////////////////////////////////////////////////////////////////
        
        double squareRoot = Math.sqrt(100);
        System.out.println("Math.sqrt(100) = " + squareRoot);
        
        ////////////////////////////////////////////////////////////////////////
        // (16) The Math random method generates a random double between 0 and 1
        ////////////////////////////////////////////////////////////////////////
        
        double random = Math.random();
        System.out.println("random = " + random);
        
        ////////////////////////////////////////////////////////////////////////
        // (17) The ArrayList size method returns the number of itmes in the 
        //      list
        ////////////////////////////////////////////////////////////////////////
        
        ArrayList<Integer> list = new ArrayList<>();
        int size = list.size();
        System.out.println("List size = " + size);
        
        ////////////////////////////////////////////////////////////////////////
        // (18) The ArrayList add method adds an item to the end of the list and
        //      returns true if successful (false otherwise)
        ////////////////////////////////////////////////////////////////////////
        
        for (int i = 10; i <= 50; i+=10) {
            boolean result = list.add(i);
            System.out.println("add(" + i + ") = " + result);
        }
        
        ////////////////////////////////////////////////////////////////////////
        // (19) The ArrayList overloaded add method adds an item into the list 
        //      at the passed index moving the item at that position over to 
        //      the right 
        ////////////////////////////////////////////////////////////////////////
        
        list.add(3,66);
        System.out.println(list.toString());
                
        ////////////////////////////////////////////////////////////////////////
        // (20) The ArrayList get method retrieves the item stored at the 
        //      passed index (or a null if invalid index)
        ////////////////////////////////////////////////////////////////////////
        
        Integer i = list.get(3);
        System.out.println("get(3) = " + i);
        
        ////////////////////////////////////////////////////////////////////////
        // (21) The ArrayList set method replaces the item at the passed index 
        //      with the passed item and returns the previous item at that 
        //      index (or a null if the operation was invalid)
        ////////////////////////////////////////////////////////////////////////
        
        Integer prev = list.set(3, 99);
        System.out.println("set(3,99) = " + prev + " of list " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // (22) The ArrayList remove method removes the passed index item and 
        //      changes the list, and it returns the item it removed
        ////////////////////////////////////////////////////////////////////////
        
        Integer remove = list.remove(3);
        System.out.println("remove(3) = " + remove + " of list " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // (23) The Object equals method compares two objects to determine 
        //      equality and returns true if equal (false otherwise)
        ////////////////////////////////////////////////////////////////////////
        
        Object o1 = new Object();
        Object o2 = new Object();
        boolean equals = o1.equals(o2);
        System.out.println("Object equals method = " + equals);
                
        ////////////////////////////////////////////////////////////////////////
        // (24) The Object toString method returns the string representation
        //      of the object
        ////////////////////////////////////////////////////////////////////////
        
        String toString = o1.toString();
        System.out.println("Object toString method = " + toString);
        
        System.out.println("Completed String Methods.........................");
    }

}