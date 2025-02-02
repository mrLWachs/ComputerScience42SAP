
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;
 
 
/**
 * APUnit07ArrayList.java - As students learned in Unit 6, data structures are
 * helpful when storing multiple related data values. Arrays have a static 
 * size, which causes limitations related to the number of elements stored, 
 * and it can be challenging to reorder elements stored in arrays. The 
 * ArrayList object has a dynamic size, and the class contains methods for 
 * insertion and deletion of elements, making reordering and shifting items 
 * easier. Deciding which data structure to select becomes increasingly 
 * important as the size of the data set grows, such as when using a large 
 * real-world data set. In this unit, students will also learn about privacy
 * concerns related to storing large amounts of personal data and about what
 * can happen if such information is compromised.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:16:28 PM
 */
public class APUnit07ArrayList 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit07ArrayList(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 7 (Array List) not running");
            return;
        }
        
        Simulator.title("AP: Unit 7 (Array List)");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.1 Introduction to ArrayList");  
        // (7.1.1) Represent collections of related object reference data 
        //         using ArrayList objects
            // (7.1.1.1) An ArrayList object is mutable and contains object 
            //           references
            // (7.1.1.2) The ArrayList constructor ArrayList() constructs an 
            //           empty list
            // (7.1.1.3) Java allows the generic type ArrayList<E>, where the
            //           generic type E specifies the type of the elements
            // (7.1.1.4) When ArrayList<E> is specified, the types of the 
            //           reference parameters and return type when using the 
            //           methods are type E
            // (7.1.1.5) ArrayList<E> is preferred over ArrayList because it 
            //           allows the compiler to find errors that would 
            //           otherwise be found at run-time
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.2 ArrayList Methods");  
        // (7.2.1) Represent collections of related object reference data 
        //         using ArrayList objects
            // (7.2.1.1) The ArrayList class is part of the java.util package.
            //           An import statement can be used to make this class 
            //           available for use in the program
            // (7.2.1.2) The following ArrayList methods—including what they
            //           do and when they are used—are part of the Java Quick
            //           Reference: (a) int size() - Returns the number of 
            //           elements in the list, (b) boolean add(E obj) - Appends 
            //           obj to end of list; returns true, 
            //           (c) void add(int index, E obj) - Inserts obj at 
            //           position index (0 <= index <= size), moving elements 
            //           at position index and higher to the right (adds 1 to
            //           their indices) and adds 1 to size, 
            //           (d) E get(int index) - Returns the element at 
            //           position index in the list, 
            //           (e) E set(int index, E obj) — Replaces the element 
            //           at position index with obj; returns the element 
            //           formerly at position index E remove(int index) — 
            //           Removes element from position index, moving elements 
            //           at position index + 1 and higher to the left 
            //           (subtracts 1 from their indices) and subtracts 1 from
            //           size;  returns the element formerly at position index
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.3 Traversing ArrayLists");  
        // (7.3.1) For ArrayList objects: (a) Traverse using a for or while 
        //         loop, (b) Traverse using an enhanced for loop
            // (7.3.1.1) Iteration statements can be used to access all the
            //           elements in an ArrayList. This is called traversing 
            //           the ArrayList
            // (7.3.1.2) Deleting elements during a traversal of an ArrayList
            //           requires using special techniques to avoid skipping
            //           elements
            // (7.3.1.3) Since the indices for an ArrayList start at 0 and 
            //           end at the number of elements − 1, accessing an index
            //           value outside of this range will result in an 
            //           ArrayIndexOutOfBoundsException being thrown
            // (7.3.1.4) Changing the size of an ArrayList while traversing it
            //           using an enhanced for loop can result in a 
            //           ConcurrentModificationException being thrown. 
            //           Therefore, when using an enhanced for loop to 
            //           traverse an ArrayList, you should not add or remove 
            //           elements
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.4 Developing Algorithms Using ArrayLists");  
        // (7.4.1) For algorithms in the context of a particular specification
        //         that requires the use of ArrayList traversals: (a) Identify
        //         standard algorithms, (b) Modify standard algorithms, 
        //         (c) Develop an algorithm
            // (7.4.1.1) There are standard ArrayList algorithms that utilize
            //           traversals to: (a) Insert elements, (b) Delete 
            //           elements, (c) Apply the same standard algorithms that
            //           are used with 1D arrays 
            // (7.4.1.2) Some algorithms require multiple String, array, or 
            //           ArrayList objects to be traversed simultaneously
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.5 Searching");  
        // (7.5.1) Apply sequential/linear search algorithms to search for
        //         specific information in array or ArrayList objects
            // (7.5.1.1) There are standard algorithms for searching
            // (7.5.1.2) Sequential/linear search algorithms check each 
            //           element in order until the desired value is found or
            //           all elements in the array or ArrayList have been 
            //           checked
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.6 Sorting");  
        // (7.6.1) Apply selection sort and insertion sort algorithms to sort
        //         the elements of array or ArrayList objects
            // (7.6.1.1) Selection sort and insertion sort are iterative 
            //           sorting algorithms that can be used to sort elements 
            //           in an array or ArrayList
        // (7.6.2) Compute statement execution counts and informal run-time 
        //         comparison of sorting algorithms
            // (7.6.2.1) Informal run-time comparisons of program code segments
            //           can be made using statement execution counts
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("7.7 Ethical Issues Around Data Collection");  
        // (7.7.1) Explain the risks to privacy from collecting and storing 
        //         personal data on computer systems
            // (7.7.1.1) When using the computer, personal privacy is at risk.
            //           Programmers should attempt to safeguard personal 
            //           privacy
            // (7.7.1.2) Computer use and the creation of programs have an 
            //           impact on personal security. These impacts can be 
            //           beneficial and/or harmful
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}