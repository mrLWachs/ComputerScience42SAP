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
                
        
    }

}