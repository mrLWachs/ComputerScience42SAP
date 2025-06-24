/** Required package class namespace */
package testing.cs42sap;
 
/** Required API imports */
import utility.io.Simulator;
import utility.io.System;


/**
 * APUnit2SelectionAndIteration.java - Algorithms are composed of three 
 * building blocks: sequencing, selection, and iteration. While Unit 1 
 * introduced sequencing, this unit focuses on selection and iteration. 
 * Selection is important to a computer program because it gives the 
 * programmer the ability to make a decision and respond to that decision 
 * using conditional statements. These allow programmers to incorporate choice
 * into their programs: to create games that react to user interactions, to 
 * develop simulations that are more real world by allowing for variability, 
 * or to discover new knowledge in a sea of information by filtering out 
 * irrelevant data. Iteration is a form of repetition and changes the flow of 
 * control by repeating a segment of code. It is represented by while and for 
 * loops. In addition, students will build on the introduction of Boolean 
 * variables in Unit 1 by writing Boolean expressions with relational and 
 * logical operators. This unit also introduces several standard algorithms 
 * that use iteration. Knowledge of standard algorithms makes solving similar 
 * problems easier, as algorithms can be modified or combined to suit new 
 * situations.
 *
 * @author Mr. Wachs
 * @since June 2025
 */
public class APUnit2SelectionAndIteration 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit2SelectionAndIteration() {
        final int UNIT = 2;
        final String TITLE = "AP curriculum - Unit 2: Selection and Iteration ";
        if (Simulator.check(TITLE)) return; 
                
        ComputerScience42SAP.showUnit(UNIT);
        ////////////////////////////////////////////////////////////////////////
        // Unit 2 - Selection and Iteration
        ////////////////////////////////////////////////////////////////////////
                
        ComputerScience42SAP.showUnit(UNIT,1);
        ////////////////////////////////////////////////////////////////////////
        // 2.1 - Algorithms with Selection and Repetition
        //     2.1.1 - Represent patterns and algorithms that involve 
        //             selection and repetition found in everyday life using 
        //             written language or diagrams.
        //         2.1.1.1 - The building blocks of algorithms include 
        //                   sequencing, selection, and repetition. 
        //         2.1.1.2 - Algorithms can contain selection, through 
        //                   decision making, and repetition, via looping.
        //         2.1.1.3 - Selection occurs when a choice of how the 
        //                   execution of an algorithm will proceed is based 
        //                   on a true or false decision.
        //         2.1.1.4 - Repetition is when a process repeats itself until
        //                   a desired outcome is reached.
        //         2.1.1.5 - The order in which sequencing, selection, and 
        //                   repetition are used contributes to the outcome 
        //                   of the algorithm.    
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,2);
        ////////////////////////////////////////////////////////////////////////
        // 2.2 - Boolean Expressions
        //     2.2.1 - Develop code to create Boolean expressions with 
        //             relational operators and determine the result of these 
        //             expressions.
        //         2.2.1.1 - Values can be compared using the relational 
        //                   operators == and != to determine whether the 
        //                   values are the same. With primitive types, this 
        //                   compares the actual primitive values. With 
        //                   reference types, this compares the object 
        //                   references.
        //         2.2.1.2 - Numeric values can be compared using the 
        //                   relational operators <, >, <=, and >= to 
        //                   determine the relationship between the values.
        //         2.2.1.3 - An expression involving relational operators 
        //                   evaluates to a Boolean value.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,3);
        ////////////////////////////////////////////////////////////////////////
        // 2.3 - if Statements
        //     2.3.1 - Develop code to represent branching logical processes 
        //             by using selection statements and determine the result 
        //             of these processes.
        //         2.3.1.1 - Selection statements change the sequential 
        //                   execution of statements.
        //         2.3.1.2 - An if statement is a type of selection statement 
        //                   that affects the flow of control by executing 
        //                   different segments of code based on the value of 
        //                   a Boolean expression.
        //         2.3.1.3 - A one-way selection (if statement) is used when 
        //                   there is a segment of code to execute under a 
        //                   certain condition. In this case, the body is 
        //                   executed only when the Boolean expression is true.
        //         2.3.1.4 - A two-way selection (if-else statement) is used 
        //                   when there are two segments of code - one to be 
        //                   executed when the Boolean expression is true and 
        //                   another segment for when the Boolean expression 
        //                   is false. In this case, the body of the if is 
        //                   executed when the Boolean expression is true, 
        //                   and the body of the else is executed when the 
        //                   Boolean expression is false.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,4);
        ////////////////////////////////////////////////////////////////////////
        // 2.4 - Nested if Statements
        //     2.4.1 - Develop code to represent nested branching logical 
        //             processes and determine the result of these processes.
        //         2.4.1.1 - Nested if statements consist of if, if-else, or 
        //                   if-else-if statements within if, if-else, or 
        //                   if-else-if statements.
        //         2.4.1.2 - The Boolean expression of the inner nested if 
        //                   statement is evaluated only if the Boolean 
        //                   expression of the outer if statement evaluates 
        //                   to true.
        //         2.4.1.3 - A multiway selection (if-else-if) is used when 
        //                   there are a series of expressions with different
        //                   segments of code for each condition. Multiway 
        //                   selection is performed such that no more than one
        //                   segment of code is executed based on the first 
        //                   expression that evaluates to true. If no 
        //                   expression evaluates to true and there is a 
        //                   trailing else statement, then the body of the 
        //                   else is executed.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,5);
        ////////////////////////////////////////////////////////////////////////
        // 2.5 - Compound Boolean Expressions
        //     2.5.1 - Develop code to represent compound Boolean expressions 
        //             and determine the result of these expressions.
        //         2.5.1.1 - Logical operators ! (not), && (and), and || (or)
        //                   are used with Boolean expressions. The expression
        //                   !a evaluates to true if a is false and evaluates 
        //                   to false otherwise. The expression a && b 
        //                   evaluates to true if both a and b are true and 
        //                   evaluates to false otherwise. The expression 
        //                   a || b evaluates to true if a is true, b is true,
        //                   or both, and evaluates to false otherwise. The 
        //                   order of precedence for evaluating logical 
        //                   operators is ! (not), && (and), then || (or). An
        //                   expression involving logical operators evaluates 
        //                   to a Boolean value. 
        //         2.5.1.2 - Short-circuit evaluation occurs when the result 
        //                   of a logical operation using && or || can be 
        //                   determined by evaluating only the first Boolean 
        //                   expression. In this case, the second Boolean 
        //                   expression is not evaluated.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,6);
        ////////////////////////////////////////////////////////////////////////
        // 2.6 - Comparing Boolean Expressions
        //     2.6.1 - Compare equivalent Boolean expressions.
        //         2.6.1.1 - Two Boolean expressions are equivalent if they 
        //                   evaluate to the same value in all cases. Truth 
        //                   tables can be used to prove Boolean expressions 
        //                   are equivalent.
        //         2.6.1.2 - De Morgan's law can be applied to Boolean 
        //                   expressions to create equivalent Boolean 
        //                   expressions. Under De Morgan's law, the Boolean 
        //                   expression !(a && b) is equivalent to !a || !b 
        //                   and the Boolean expression !(a || b) is 
        //                   equivalent to !a && !b. 
        //     2.6.2 - Develop code to compare object references using 
        //             Boolean expressions and determine the result of these 
        //             expressions.
        //         2.6.2.1 - Two different variables can hold references to 
        //                   the same object. Object references can be 
        //                   compared using == and !=. 
        //         2.6.2.2 - An object reference can be compared with null, 
        //                   using == or !=, to determine if the reference 
        //                   actually references an object. 
        //         2.6.2.3 - Classes often define their own equals method, 
        //                   which can be used to specify the criteria for 
        //                   equivalency for two objects of the class. The 
        //                   equivalency of two objects is most often 
        //                   determined using attributes from the two 
        //                   objects. Note: Overriding the equals method is 
        //                   outside the scope of the AP Computer Science A 
        //                   course and exam.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,7);
        ////////////////////////////////////////////////////////////////////////
        // 2.7 - while Loops
        //     2.7.1 - Identify when an iterative process is required to 
        //             achieve a desired result.
        //         2.7.1.1 - Iteration is a form of repetition. Iteration 
        //                   statements change the flow of control by repeating
        //                   a segment of code zero or more times as long as 
        //                   the Boolean expression controlling the loop
        //                   evaluates to true. 
        //         2.7.1.2 - An infinite loop occurs when the Boolean 
        //                   expression in an iterative statement always 
        //                   evaluates to true.
        //         2.7.1.3 - The loop body of an iterative statement will not
        //                   execute if the Boolean expression initially
        //                   evaluates to false.
        //         2.7.1.4 - Off by one errors occur when the iteration 
        //                   statement loops one time too many or one time 
        //                   too few.
        //     2.7.2 - Develop code to represent iterative processes using 
        //             while loops and determine the result of these processes.
        //         2.7.2.1 - A while loop is a type of iterative statement. 
        //                   In while loops, the Boolean expression is
        //                   evaluated before each iteration of the loop body,
        //                   including the first. When the expression 
        //                   evaluates to true, the loop body is executed.
        //                   This continues until the Boolean expression 
        //                   evaluates to false, whereupon the iteration 
        //                   terminates.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,8);
        ////////////////////////////////////////////////////////////////////////
        // 2.8 - for Loops
        //     2.8.1 - Develop code to represent iterative processes using for 
        //             loops and determine the result of these processes.
        //         2.8.1.1 - A for loop is a type of iterative statement. 
        //                   There are three parts in a for loop header: the 
        //                   initialization, the Boolean expression, and the 
        //                   update.
        //         2.8.1.2 - In a for loop, the initialization statement is 
        //                   only executed once before the first Boolean 
        //                   expression evaluation. The variable being 
        //                   initialized is referred to as a loop control
        //                   variable. The Boolean expression is evaluated 
        //                   immediately after the loop control variable is
        //                   initialized and then following each execution of 
        //                   the increment statement until it is false. In each
        //                   iteration, the update is executed after the entire
        //                   loop body is executed and before the Boolean 
        //                   expression is evaluated again.
        //         2.8.1.3 - A for loop can be rewritten into an equivalent 
        //                   while loop (and vice versa).
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,9);
        ////////////////////////////////////////////////////////////////////////
        // 2.9 - Implementing Selection and Iteration Algorithms
        //     2.9.1 - Develop code for standard and original algorithms 
        //             (without data structures) and determine the result of 
        //             these algorithms.
        //         2.9.1.1 - There are standard algorithms to: (a) identify 
        //                   if an integer is or is not evenly divisible by 
        //                   another integer (b)  identify the individual 
        //                   digits in an integer, (c) determine the frequency 
        //                   with which a specific criterion is met (d) 
        //                   determine a minimum or maximum value, and (e) 
        //                   compute a sum or average
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,10);
        ////////////////////////////////////////////////////////////////////////
        // 2.10 - Implementing String Algorithms
        //     2.10.1 - Develop code for standard and original algorithms that
        //              involve strings and determine the result of these 
        //              algorithms. 
        //         2.10.1.1 - There are standard string algorithms to: (a) 
        //                    find if one or more substrings have a particular
        //                    property, (b)  determine the number of substrings
        //                    that meet specific criteria, (c) create a new 
        //                    string with the characters reversed
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,11);
        ////////////////////////////////////////////////////////////////////////
        // 2.11 - Nested Iteration
        //     2.11.1 - Develop code to represent nested iterative processes 
        //              and determine the result of these processes.
        //         2.11.1.1 - Nested iteration statements are iteration 
        //                    statements that appear in the body of another 
        //                    iteration statement. When a loop is nested inside
        //                    another loop, the inner loop must complete all 
        //                    its iterations before the outer loop can continue
        //                    to its next iteration.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,12);
        ////////////////////////////////////////////////////////////////////////
        // 2.12 - Informal Run-Time Analysis
        //     2.12.1 - Calculate statement execution counts and informal 
        //              run-time comparison of iterative statements.
        //         2.12.1.1 - A statement execution count indicates the number
        //                    of times a statement is executed by the program. 
        //                    Statement execution counts are often calculated 
        //                    informally through tracing and analysis of the 
        //                    iterative statements.
        ////////////////////////////////////////////////////////////////////////
        Simulator.example(true);
        
        
        
        Simulator.example(false); 
        ////////////////////////////////////////////////////////////////////////
    }
    
}