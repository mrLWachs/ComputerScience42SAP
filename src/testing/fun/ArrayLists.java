/** Required package class namespace */
package testing.fun;

/** Required API imports */
import java.util.ArrayList;


/**
 * ArrayLists.java - the student requested review of the ArrayList concepts as 
 * needed for the AP exam (from the AP Computer Science curriculum). 
 * 
 * In the A.P. Computer Science A curriculum in Unit 6, students learn that 
 * data structures are helpful when storing multiple related data values. 
 * Arrays have a static size, which causes limitations related to the number 
 * of elements stored, and it can be challenging to reorder elements stored 
 * in arrays. The ArrayList object has a dynamic size, and the class contains 
 * methods for insertion and deletion of elements, making reordering and 
 * shifting items easier. Deciding which data structure to select becomes 
 * increasingly important as the size of the data set grows, such as when 
 * using a large real-world data set. In this unit, students will also learn 
 * about privacy concerns related to storing large amounts of personal data 
 * and about what can happen if such information is compromised.
 * 
 * ArrayLists are imported from the Java core library (API framework) "util" 
 * (utility) and can be seen in this top-down diagram below...
 * 
 *            +------------+
 *            | Collection |
 *            +------------+
 *           /      |      \
 *          /       |       \
 *   +-----+    +------+    +-------+
 *   | Set |    | List |    | Queue |
 *   +-----+    +------+    +-------+
 *             /    |   \           \
 *            /     |    +-----+     +----+
 *           /      |           \          \
 * +-----------+ +------------+ +--------+ +---------------+    
 * | ArrayList | | LinkedList | | Vector | | PriorityQueue |
 * +-----------+ +------------+ +--------+ +---------------+
 *                                  | 
 *                              +-------+
 *                              | Stack |
 *                              +-------+
 * 
 * From this: "Collection", "Set", "Queue", and "List" are interfaces that are 
 * implemented by the classes: "ArrayList", "LinkedList", "Vector", and 
 * "PriorityQueue" and the class "Stack" inherits from the "Vector" class.
 * 
 * @author Mr. Wachs
 * @since Feb 27, 2025
 */
public class ArrayLists
{

    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        // Let us begin to start learning about ArrayLists...
        ////////////////////////////////////////////////////////////////////////
        // The A.P. curriculum unit 7.1 starts by stating that ArrayLists
        // represent collections of related object reference data using 
        // ArrayList objects. An ArrayList object is mutable and contains object
        // references. The ArrayList constructor ArrayList() constructs an 
        // empty list. Java allows the generic type ArrayList<E>, where the
        // generic type E specifies the type of the elements. When ArrayList<E>
        // is specified, the types of the reference parameters and return type
        // when using the methods are type E. ArrayList<E> is preferred over 
        // ArrayList because it allows the compiler to find errors that would
        // otherwise be found at run-time.
        
        // Create (declare) an ArrayList object...
        ArrayList<Integer> list = new ArrayList<>();
        
        ////////////////////////////////////////////////////////////////////////
        // Now some ArrayList methods of that imported class. The A.P. 
        // reference document you will have for the exam outlines the required 
        // methods to know from the ArrayList (you do not need to know ALL the
        // methods that the ArrayList class has). This document can be found
        // here: https://bit.ly/4gZyXiH - And these are the 6 methods to know:
        // int size(), boolean add(T), boolean add(int, T), T get(int), 
        // T set(int, T), and T remove(int)
        //
        // The A.P. curriculum unit 7.2 states this as: represent collections 
        // of related object reference data using ArrayList objects. The 
        // ArrayList class is part of the java.util package. An import 
        // statement can be used to make this class available for use in the 
        // program. The following ArrayList methods—including what they do 
        // and when they are used—are part of the Java Quick Reference: 
        // (1) int size() - Returns the number of elements in the list
        // (2) boolean add(E obj) - Appends obj to end of list; returns true 
        // (3) void add(int index, E obj) - Inserts obj at position index 
        //     (0 <= index <= size), moving elements at position index and 
        //     higher to the right (adds 1 to their indices) and adds 1 to size
        // (4) E get(int index) - Returns the element at position index in the 
        //     list
        // (5) E set(int index, E obj) — Replaces the element at position 
        //     index with obj; returns the element formerly at position index 
        // (6) E remove(int index) — Removes element from position index, 
        //     moving elements at position index + 1 and higher to the left 
        //     (subtracts 1 from their indices) and subtracts 1 from size;  
        //     returns the element formerly at position index
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        // (1) The "size()" method is used to get the size of the ArrayList  
        //     (note: with arrays, we use ".length" instead)
        ////////////////////////////////////////////////////////////////////////
        
        int size = list.size();
        System.out.println("ArrayList size: " + size);
        System.out.println("ArrayList: " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // (2) The "add(T)" method is used to add values dynamically into the 
        //     ArrayList. Note: it will always append the item to the end of 
        //     the ArrayList
        ////////////////////////////////////////////////////////////////////////
        
        Integer value = 20;
        boolean success = list.add(value);
        System.out.println("Method add(T) success: " + success);
        System.out.println("ArrayList: " + list.toString());
        
        System.out.println("Repeating the add() method...");
        for (int i = 0; i < 5; i++) {
            value = i * 10 + 30;
            success = list.add(value);
            System.out.println("Method add(T) success: " + success);
            System.out.println("ArrayList: " + list.toString());
        }
              
        ////////////////////////////////////////////////////////////////////////
        // (3) The "add(int,T)" method is a variation (overloaded) method used  
        //     with another parameter to indicate an index value (which will  
        //     add the value and shift all the preceeding values after the 
        //     index over)
        ////////////////////////////////////////////////////////////////////////
        
        int index = 3;
        value = 99;
        list.add(index,value);
        System.out.println("Method add(int,T) ArrayList: " + list.toString());
        
        index = 0;
        value = 98;
        list.add(index, value);
        System.out.println("Method add(int,T) ArrayList: " + list.toString());
        
        index = list.size();
        value = 97;
        list.add(index, value);
        System.out.println("Method add(int,T) ArrayList: " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // (4) The "get(int)" accessor method is used like accessing array like
        //     "int value = array[index];" which retrieves the value at the 
        //     passed index
        ////////////////////////////////////////////////////////////////////////
        
        index = 3;
        System.out.println("Method get(3) = " + list.get(index));
        
        index = 0;
        System.out.println("Method get(0) = " + list.get(index));
        
        index = list.size()-1;
        System.out.println("Method get(list.size()-1) = " + list.get(index));
        
        ////////////////////////////////////////////////////////////////////////
        // (5) The "set(int,T)" mutator method is used like changing an array
        //     like: "array[index] = value;" mutates (changes) the value at the 
        //     passed index and returns the previous value at that index
        ////////////////////////////////////////////////////////////////////////
        
        index = 3;
        value = 1;
        System.out.println("Method set(3,1) was " + list.set(index, value));
        System.out.println("ArrayList: " + list.toString());
        
        index = 0;
        value = 2;
        System.out.println("Method set(0,2) was " + list.set(index,value));
        System.out.println("ArrayList: " + list.toString());
        
        index = list.size()-1;
        value = 3;
        System.out.println("Method set(list.size()-1,3) was " + list.set(index,value));
        System.out.println("ArrayList: " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // (6) The "remove(int)" mutator method removes the index value from
        //     the ArrayList and adjusts the list to now have one less 
        //     element. It also returns the item it removes
        ////////////////////////////////////////////////////////////////////////
        
        index = 2;
        System.out.println("Method remove(2) removed " + list.remove(index));
        System.out.println("ArrayList: " + list.toString());
        
        index = 0;
        System.out.println("Method list.remove(0) removed " + list.remove(index));
        System.out.println("ArrayList: " + list.toString());
        
        index = list.size()-1;
        System.out.println("Method list.remove(list.size()-1) removed " + list.remove(index));
        System.out.println("ArrayList: " + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // Traversing an ArrayList with a standard for loop and an enhanced 
        // for loop.
        //
        // The A.P. curriculum unit 7.3 states this as: for ArrayList 
        // objects: (a) Traverse using a for or while loop, (b) Traverse using
        // an enhanced for loop. Iteration statements can be used to access 
        // all the elements in an ArrayList. This is called traversing the 
        // ArrayList. Deleting elements during a traversal of an ArrayList
        // requires using special techniques to avoid skipping elements. 
        // Since the indices for an ArrayList start at 0 and end at the 
        // number of elements − 1, accessing an index value outside of this 
        // range will result in an ArrayIndexOutOfBoundsException being thrown.
        // Changing the size of an ArrayList while traversing it using an 
        // enhanced for loop can result in a ConcurrentModificationException 
        // being thrown. Therefore, when using an enhanced for loop to traverse
        // an ArrayList, you should not add or remove elements
        ////////////////////////////////////////////////////////////////////////
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("'for' loop ArrayList: " + list.get(i));
            // If we compare with arrays, we would use code like: 
            // array[i] and array.length, etc...
        }
        
        for (Integer integer : list) {
            System.out.println("'enhanced for' loop ArrayList = " + integer.toString());
            // The enhanced for loop cannot be used with primitive data types
        }
        
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Comparing ArrayList to arrays...");
        System.out.println("All array operations: ");
        System.out.println(" - declaring:  int a[] = new int[5];");
        System.out.println(" - mutating:   a[2] = 5;");
        System.out.println(" - accessing:  int x = a[2];");
        System.out.println(" - traversing: for (int i = 0; i < a.length; i++)");
        System.out.println("Can also be performed with ArrayList:");
        System.out.println(" - declaring:  ArrayList<Integer> a = new ArrayList<>();");
        System.out.println(" - mutating:   a.set(2,5);");
        System.out.println(" - accessing:  int x = a.get(2);");
        System.out.println(" - traversing: for (int i = 0; i < a.size(); i++)");  
        System.out.println("           or: for (Integer integer : list)");
        
        ////////////////////////////////////////////////////////////////////////
        // NOTE: further resources for ArrayLists can be found here:
        //  - A video reviewing this AP specific content: https://bit.ly/4h2uYlN
        //  - Similar web page/presentation/PDF content: https://bit.ly/3QzsYGR
        //  - The AP classroom site on unit 7: https://bit.ly/3DbsrYs
        //  - Some other websites that go over the ArrayList in Java:
        //     - https://bit.ly/3EV4Dsl
        //     - https://bit.ly/3QDJPs8
        //     - https://bit.ly/3F0OBNF
        ////////////////////////////////////////////////////////////////////////
    }

}