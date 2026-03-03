/** Required package class namespace */
package testing.cs42sap.additional;

/** Required API imports */
import utility.io.Simulator;


/*
 * ArrayListExamples - This class is an example of some of the new 
 * additional content added to the CS42SAP course. This will entail Mr. Wachs 
 * leading students in direct instruction (lessons) in materials that fills any 
 * gaps in knowledge from the course work done with Mr. Wachs (CS20S, CS30S, 
 * and CS40S) as it relates to the AP Computer Science curriculum by having 
 * presentations, doing examples, and making notes. 
 *
 * DESCRIPTION:
 * ============
 * 
 * An ArrayList in Java is a resizable array from the java.util package that 
 * can dynamically grow or shrink as elements are added or removed, unlike a 
 * standard array whose size is fixed at creation. It stores objects (not 
 * primitives) and provides built-in methods such as add(), remove(), get(), 
 * and size() to efficiently manage data. In AP Computer Science, ArrayList is 
 * especially useful when the number of elements is unknown in advance, making 
 * it a flexible way to store and manipulate collections of objects.
 *
 * SPECIFICALLY FROM THE AP COMPUTER SCIENCE CURRICULUM:
 * =====================================================
 * 
 * See: https://bit.ly/3ONCRCY (section 4.8, 4.9, and 4.10)
 * 
 * Learning Objective: Develop code for collections of related objects using 
 *                     ArrayList objects and determine the result of calling 
 *                     methods on these objects.
 * Learning Objective: Develop code used to traverse the elements of an 
 *                     ArrayList and determine the results of these traversals.
 * Learning Objective: Develop code for standard and original algorithms for a 
 *                     particular context or specification that involve 
 *                     ArrayList objects and determine the result of these 
 *                     algorithms.
 * 
 * Specifics: An ArrayList object is mutable in size and contains object 
 * references. The ArrayList constructor ArrayList() constructs an empty list. 
 * Java allows the generic type ArrayList<E>, where the type parameter E 
 * specifies the type of the elements. When ArrayList<E> is specified, the 
 * types of the reference parameters and return type when using the ArrayList 
 * methods are type E. ArrayList<E> is preferred over ArrayList. For example, 
 * ArrayList<String> names = new ArrayList<String>(); allows the compiler to 
 * find errors that would otherwise be found at run-time. The ArrayList class 
 * is part of the java.util package. An import statement must be used to make 
 * this class available for use in the program. The following ArrayList methods
 * — including what they do and when they are used — are part of the Java 
 * Quick Reference: • int size() returns the number of elements in the list. 
 * • boolean add(E obj) appends obj to end of list; returns true. 
 * • void add(int index, E obj) inserts obj at position 
 * index (0 <= index <= size), moving elements at position index and higher to 
 * the right (adds 1 to their indices) and adds 1 to size. • E get(int index) 
 * returns the element at position index in the list. • E set(int index, E obj) 
 * replaces the element at position index with obj; returns the element 
 * formerly at position index. • E remove(int index) removes element from 
 * position index, moving elements at position index + 1 and higher to the left 
 * (subtracts 1 from their indices) and subtracts 1 from size; returns the 
 * element formerly at position index. The indices for an ArrayList start at 0 
 * and end at the number of elements - 1. Traversing an ArrayList is when 
 * iteration or recursive statements are used to access all or an ordered 
 * sequence of the elements in an ArrayList. Deleting elements during a 
 * traversal of an ArrayList requires the use of special techniques to avoid 
 * skipping elements. Attempting to access an index value outside of its range 
 * will result in an IndexOutOfBoundsException. Changing the size of an 
 * ArrayList while traversing it using an enhanced for loop can result in a 
 * ConcurrentModificationException. Therefore, when using an enhanced for loop 
 * to traverse an ArrayList, you should not add or remove elements. There are 
 * standard ArrayList algorithms that utilize traversals to: • determine a 
 * minimum or maximum value • compute a sum or average • determine if at least 
 * one element has a particular property • determine if all elements have a 
 * particular property • determine the number of elements having a particular 
 * property • access all consecutive pairs of elements • determine the presence 
 * or absence of duplicate elements • shift or rotate elements left or right 
 * • reverse the order of the elements • insert elements • delete elements Some 
 * algorithms require multiple String, array, or ArrayList objects to be 
 * traversed simultaneously. Linear search algorithms are standard algorithms 
 * that check each element in order until the desired value is found or all 
 * elements in the array or ArrayList have been checked. Linear search 
 * algorithms can begin the search process from either end of the array or 
 * ArrayList. Selection sort and insertion sort are iterative sorting 
 * algorithms that can be used to sort elements in an array or ArrayList. 
 * Recursion can be used to traverse String objects, arrays, and ArrayList 
 * objects.
 * 
 * @author Mr. Wachs
 * @since Mar 3, 2026
*/
public class ArrayListExamples
{

    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting ArrayList Examples");
        new ArrayListExamples();
        Simulator.title("\nCompleted ArrayList Examples");
    }

    /**
     * Default constructor, set class properties
     */
    public ArrayListExamples() {  
        System.out.println("Learn about ArrayList............................");
        
        
        
        System.out.println("Completed Learning about ArrayList...............");
    }
    

}