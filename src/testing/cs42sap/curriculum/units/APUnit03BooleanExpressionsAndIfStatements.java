
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

 
/**
 * APUnit03BooleanExpressionsAndIfStatements.java - Algorithms are composed of
 * three building blocks: sequencing, selection, and iteration. This unit
 * focuses on selection, which is represented in a program by using conditional
 * statements. Conditional statements give the program the ability to decide
 * and respond appropriately and are a critical aspect of any nontrivial
 * computer program. In addition to learning the syntax and proper use of
 * conditional statements, students will build on the introduction of Boolean
 * variables by writing Boolean expressions with relational and logical
 * operators. The third building block of all algorithms is iteration, which
 * you will cover in Unit 4. Selection and iteration work together to solve
 * problems
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit03BooleanExpressionsAndIfStatements 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit03BooleanExpressionsAndIfStatements(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 3 (Boolean Expressions And If Statements) not running");
            return;
        }
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3);
        // AP: Unit 3 (Boolean Expressions And If Statements)
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,1);
        // 3.1 Boolean Expressions
        // (3.1.1) Evaluate Boolean expressions that use relational operators 
        //         in program code
            // (3.1.1.1) Primitive values and reference values can be compared
            //           using relational operators (i.e., == and !=)
            // (3.1.1.2) Arithmetic expression values can be compared using 
            //           relational operators (i.e., <, >, <=, >=)
            // (3.1.1.3) An expression involving relational operators evaluates
            //           to a Boolean value
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,2);
        // 3.2 if Statements and Control Flow
        // (3.2.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.2.1.1) Conditional statements interrupt the sequential 
            //           execution of statements
            // (3.2.1.2) if statements affect the flow of control by executing
            //           different statements based on the value of a Boolean
            //           expression
            // (3.2.1.3) A one-way selection (if statement) is written when
            //           there is a set of statements to execute under a 
            //           certain condition. In this case, the body is executed
            //           only when the Boolean condition is true
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,3);
        // 3.3 if-else Statements
        // (3.3.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.3.1.1) A two-way selection is written when there are two 
            //           sets of statements— one to be executed when the 
            //           Boolean condition is true, and another set for when 
            //           the Boolean condition is false. In this case, the 
            //           body of the "if" is executed when the Boolean 
            //           condition is true, and the body of the "else" is 
            //           executed when the Boolean condition is false
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,4);
        // 3.4 else if Statements
        // (3.4.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.4.1.1) A multi-way selection is written when there are a 
            //           series of conditions with different statements for 
            //           each condition. Multi-way selection is performed 
            //           using if-else-if statements such that exactly one 
            //           section of code is executed based on the first
            //           condition that evaluates to true
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,5);
        // 3.5 Compound Boolean Expressions
        // (3.5.1) Represent branching logical processes by using nested 
        //         conditional statements
            // (3.5.1.1) Nested if statements consist of if statements within
            //           if statements
        // (3.5.2) Evaluate compound Boolean expressions in program code
            // (3.5.2.1) Logical operators !(not), &&(and), and ||(or) are 
            //           used with Boolean values. This represents the order 
            //           these operators will be evaluated
            // (3.5.2.2) An expression involving logical operators evaluates 
            //           to a Boolean value
            // (3.5.2.3) When the result of a logical expression using && or
            //           || can be determined by evaluating only the first 
            //           Boolean operand, the second is not evaluated. This is
            //           known as short-circuited evaluation
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,6);
        // 3.6 Equivalent Boolean Expressions
        // (3.6.1) Compare and contrast equivalent Boolean expressions
            // (3.6.1.1) De Morgan’s Laws can be applied to Boolean expressions
            // (3.6.1.2) Truth tables can be used to prove Boolean identities
            // (3.6.1.3) Equivalent Boolean expressions will evaluate to the 
            //           same value in all cases
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,7);
        // 3.7 Comparing Objects
        // (3.7.1) Compare object references using Boolean expressions in 
        //         program code
            // (3.7.1.1) Two object references are considered aliases when 
            //           they both reference the same object
            // (3.7.1.2) Object reference values can be compared, using == 
            //           and !=, to identify aliases
            // (3.7.1.3) A reference value can be compared with null, using 
            //           == or !=, to determine if the reference actually 
            //           references an object
            // (3.7.1.4) Often classes have their own equals method, which can
            //           be used to determine whether two objects of the class 
            //           are equivalent
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Add your own example(s) here...");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}