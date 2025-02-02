
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;
 

/**
 * APUnit10Recursion.java - Sometimes a problem can be solved by solving 
 * smaller or simpler versions of the same problem rather than attempting an 
 * iterative solution. This is called recursion, and it is a powerful math 
 * and computer science idea. In this unit, students will revisit how control
 * is passed when methods are called, which is necessary knowledge when 
 * working with recursion. Tracing skills introduced in Unit 2 are helpful 
 * for determining the purpose or output of a recursive method. In this unit,
 * students will learn how to write simple recursive methods and determine 
 * the purpose or output of a recursive method by tracing.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:16:35 PM
 */
public class APUnit10Recursion 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit10Recursion(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 10 (Recursion) not running");
            return;
        }
        
        Simulator.title("AP: Unit 10 (Recursion)");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("10.1 Recursion");  
        // (10.1.1) Determine the result of executing recursive methods
            // (10.1.1.1) A recursive method is a method that calls itself
            // (10.1.1.2) Recursive methods contain at least one base case, 
            //            which halts the recursion, and at least one recursive
            //            call
            // (10.1.1.3) Each recursive call has its own set of local 
            //            variables, including the formal parameters
            // (10.1.1.4) Parameter values capture the progress of a recursive
            //            process, much like loop control variable values 
            //            capture the progress of a loop
            // (10.1.1.5) Any recursive solution can be replicated through the
            //            use of an iterative approach
            // (10.1.1.6) Recursion can be used to traverse String, array, and
            //            ArrayList objects
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("10.2 Recursive Searching and Sorting");  
        // (10.2.1) Apply recursive search algorithms to information in String,
        //          1D array, or ArrayList objects
            // (10.2.1.1) Data must be in sorted order to use the binary 
            //            search algorithm
            // (10.2.1.2) The binary search algorithm starts at the middle of
            //            a sorted array or ArrayList and eliminates half of 
            //            the array or ArrayList in each iteration until the 
            //            desired value is found or all elements have been 
            //            eliminated
            // (10.2.1.3) Binary search can be more efficient than 
            //            sequential/linear search
            // (10.2.1.4) The binary search algorithm can be written either
            //            iteratively or recursively
        // (10.2.2) Apply recursive algorithms to sort elements of array or
        //                ArrayList objects
            // (10.2.2.1) Merge sort is a recursive sorting algorithm that 
            //            can be used to sort elements in an array or ArrayList 
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}