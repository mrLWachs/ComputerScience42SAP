/** Required package class namespace */
package testing.fun;


/*
 * StringMethodsTest - useful methods for working with the String class and the
 * various methods built-into the String class that are references in the AP
 * Computer Science curriculum. This is the student requested review of those 
 * String methods as needed for the AP exam (from the AP Computer Science 
 * curriculum). 
 *
 * In the A.P. Computer Science A curriculum in Unit 2, students will notice
 * that the term "searching" comes up as something potentially they can be 
 * tested on. For example the curriculum states: "String objects can be created
 * by calling the String class constructor", "String objects are immutable, 
 * meaning that String methods do not change the String object", "String 
 * objects can be concatenated using the + or += operator, resulting in a new 
 * String object", "Primitive values can be concatenated with a String object. 
 * This causes implicit conversion of the values to String objects", and "The 
 * toString method is an overridden method that is included in classes to 
 * provide a description of a specific object". More so, the Java Quick
 * Reference Sheet (see: https://bit.ly/4kNITPG ) that you will have available
 * at the AP exam is specific which methods for the String class should be
 * known. In addition, the Integer and Double wrapper classes along with the 
 * Math class methods are referenced on this sheet. This example will go over
 * all those methods below...
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
        
        final String TEXT = "collection of characters";
        
        System.out.println("TEXT = " + TEXT);
        
        String string = new String(TEXT);
        
        System.out.println("String = '" + string + "'");
        System.out.println("indices: '012345678901234567890123'");
        
        int length = string.length();
        
        System.out.println("length = " + length);
        
        String subString1 = string.substring(11, 18);
        
        System.out.println("subString(11,18) = '" + subString1 + "'");
        
        String subString2 = string.substring(11);
        
        System.out.println("subString(11) = '" + subString2 + "'");
        
        int index = string.indexOf("of");
        
        System.out.println("indexOf('of') = " + index);
        
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
        
        
        int compare1 = letter1.compareTo(letter1);
        int compare2 = letter1.compareTo(letter2);
        int compare3 = letter2.compareTo(letter1);
        
        System.out.println("letter1.compareTo(letter1) = " + compare1);
        System.out.println("letter1.compareTo(letter2) = " + compare2);
        System.out.println("letter2.compareTo(letter1) = " + compare3);
        
        
        
        
    }
    

}