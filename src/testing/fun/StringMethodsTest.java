/** Required package class namespace */
package testing.fun;

/** Required API imports */
import java.util.ArrayList;


/*
 * StringMethodsTest - useful methods for working with the String class and the
 * various methods built-into the String class that are references in the AP
 * Computer Science curriculum. This is the student requested review of those 
 * String methods as needed for the AP exam (from the AP Computer Science 
 * curriculum). 
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
 * @author Mr. Wachs
 * @since Mar 20, 2025
*/
public class StringMethodsTest
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new StringMethodsTest();
    }
    
    /**
     * Class constructor, sets class properties
     */
    public StringMethodsTest() {        
        System.out.println("Let us start learning about String methods...");
        
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
        
    }
    

}