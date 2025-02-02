
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

 
/**
 * APUnit04Iteration.java - This unit focuses on iteration using while and for
 * loops. As you saw in Unit 3, Boolean expressions are useful when a program
 * needs to perform different operations under different conditions. Boolean
 * expressions are also one of the main components in iteration. This unit
 * introduces several standard algorithms that use iteration. Knowledge of
 * standard algorithms makes solving similar problems easier, as algorithms
 * can be modified or combined to suit new situations. Iteration is used when
 * traversing data structures such as arrays, ArrayLists, and 2D arrays. In
 * addition, it is a necessary component of several standard algorithms,
 * including searching and sorting, which will be covered in later units
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit04Iteration 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit04Iteration(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 4 (Iteration) not running");
            return;
        }
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4);
        // AP: Unit 4 (Iteration)
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,1);
        // 4.1 while Loops" 
        // (4.1.1) Represent iterative processes using a while loop
            // (4.1.1.1) Iteration statements change the flow of control by 
            //           repeating a set of statements zero or more times until
            //           a condition is met
            // (4.1.1.2) In loops, the Boolean expression is evaluated before
            //           each iteration of the loop body, including the first. 
            //           When the expression evaluates to true, the loop body
            //           is executed. This continues until the expression 
            //           evaluates to false, whereupon the iteration ceases
            // (4.1.1.3) A loop is an infinite loop when the Boolean 
            //           expression always evaluates to true
            // (4.1.1.4) If the Boolean expression evaluates to false 
            //           initially, the loop body is not executed at all
            // (4.1.1.5) Executing a return statement inside an iteration 
            //           statement will halt the loop and exit the method or 
            //           constructor
        // (4.1.2) For algorithms in the context of a particular specification 
        //         that does not require the use of traversals: (A) Identify
        //         standard algorithms, (B) Modify standard algorithms, (C) 
        //         Develop an algorithm
            // (4.1.2.1) There are standard algorithms to: (A) Identify if an
            //           integer is or is not evenly divisible by another 
            //           integer, (B) Identify the individual digits in an 
            //           integer, (C) Determine the frequency with which a 
            //           specific criterion is met
            // (4.1.2.2) There are standard algorithms to: (A) Determine a 
            //           minimum or maximum value, (B) Compute a sum, average,
            //           or mode
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,2);
        // 4.2 for Loops 
        // (4.2.1) Represent iterative processes using a for loop
            // (4.2.1.1) There are three parts in a for loop header: the 
            //           initialization, the Boolean expression, and the 
            //           increment. The increment statement can also be a 
            //           decrement statement
            // (4.2.1.2) In a for loop, the initialization statement is only
            //           executed once before the first Boolean expression 
            //           evaluation. The variable being initialized is referred 
            //           to as a loop control variable
            // (4.2.1.3) In each iteration of a for loop, the increment 
            //           statement is executed after the entire loop body is 
            //           executed and before the Boolean expression is 
            //           evaluated again
            // (4.2.1.4) A for loop can be rewritten into an equivalent while
            //           loop and vice versa
            // (4.2.1.5) “Off by one” errors occur when the iteration statement
            //           loops one time too many or one time too few
        ////////////////////////////////////////////////////////////////////////
             
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,3);
        // 4.3 Developing Algorithms Using Strings
        // (4.3.1) For algorithms in the context of a particular specification
        //         that involves String objects: (A) Identify standard 
        //         algorithms, (B) Modify standard algorithms, (C) Develop an 
        //         algorithm
            // (4.3.1.1) There are standard algorithms that utilize String 
            //           traversals to: (A) Find if one or more substrings has 
            //           a particular property, (B) Determine the number of 
            //           substrings that meet specific criteria, (C) Create a
            //           new string with the characters reversed
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,4);
        // 4.4 Nested Iteration
        // (4.4.1) Represent nested iterative processes
            // (4.4.1.1) Nested iteration statements are iteration statements 
            //           that appear in the body of another iteration statement
            // (4.4.1.2) When a loop is nested inside another loop, the inner
            //           loop must complete all its iterations before the outer
            //           loop can continue
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,5);
        // 4.5 Informal Code Analysis
        // (4.5.1) Compute statement execution counts and informal run-time 
        //         comparison of iterative statements
            // (4.5.1.1) A statement execution count indicates the number of 
            //           times a statement is executed by the program
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
                
        ////////////////////////////////////////////////////////////////////////
    }
    
}