
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import io.Simulator;

 
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
     */
    public APUnit03BooleanExpressionsAndIfStatements() {
        Simulator.header("AP: Unit 3 (Boolean Expressions And If Statements) started...");
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.1 Boolean Expressions");  
        // (3.1.1) Evaluate Boolean expressions that use relational operators 
        //         in program code
            // (3.1.1.1) Primitive values and reference values can be compared
            //           using relational operators (i.e., == and !=)
            // (3.1.1.2) Arithmetic expression values can be compared using 
            //           relational operators (i.e., <, >, <=, >=)
            // (3.1.1.3) An expression involving relational operators evaluates
            //           to a Boolean value
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("When comparing two primitive values,\n== can be"
                + " used to check if they are equal and\n!= can check if the"
                + " two values are not equal");
        System.out.println("You can also compare values by using symbols such"
                + " as\n< : lesser than\n> : greater than\n<= : lesser than"
                + " or equal to\n>= : greater than or equal to");
        System.out.println("The result of the comparison will be a boolean"
                + " expression - either true or false");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.2 if Statements and Control Flow");  
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
        
        boolean condition = true;
        
        if (condition) {
            // code
        }
        
        System.out.println("if statements will only run their code if their "
                + "conditions are met. This gives the ability\nfor the code to "
                + "make choices");
        System.out.println("This 'choice' is made with a boolean expression"
                + " that displays the conditions of the statement.\nIf the"
                + " conditions are met, the boolean expression will be true"
                + " and will run the code. If any\nof the conditions are not"
                + " met, the boolean will be determined to be false and will"
                + " skip over\nthe section of code within the if statement");

        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.3 if-else Statements");  
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
        
        if (condition) {
            // boolean is true code
        }
        else {
            // boolean is false code
        }
        
        System.out.println("An else statement can be written after an if"
                + " statement so that different code will run if the\nboolean"
                + " of the if statement is false.");
        System.out.println("This code of the else statement will not be run at"
                + " all if the boolean of the if statement is true.");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.4 else if Statements");  
        // (3.4.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.4.1.1) A multi-way selection is written when there are a 
            //           series of conditions with different statements for 
            //           each condition. Multi-way selection is performed 
            //           using if-else-if statements such that exactly one 
            //           section of code is executed based on the first
            //           condition that evaluates to true
        ////////////////////////////////////////////////////////////////////////
        
        boolean condition2 = false;
        
        if (condition) {
            // condition is true code
        }
        else if (condition2) {
            // condition2 is true code
        }
        else {
            // neither condition is true code
        }
        
        System.out.println("One or multiple else if statements can be written"
                + " after an if statement to give the code\nmultiple choices"
                + " for a decision. Each else if statement will have it's own"
                + " conditions to be\nable to run. The statement that is chosen"
                + " to run will be the first if or else if statment\nwho's"
                + " conditions are true");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.5 Compound Boolean Expressions");  
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
        
        boolean condition3 = true;
        boolean condition4 = true;
        
        if (condition) {
            // condition is true code
            if (condition4) {
                // condition4 is true code
            }
            else {
                // condition4 is not true code
            }
        }
        else if (condition2 && condition3) {
            // condition2 and condition 3 are true code
        }
        else if (!condition3) {
            // condition3 is false code
        }
        else if (condition2 || condition4) {
            // condition2 or condition4 is true code
        }
        else {
            // none of the conditions are true code
        }
        
        System.out.println("Nested if statements are when an if statement is"
                + " inside of another if statement. The code\ninside of the"
                + " nested if statement will only run if the conditions of the"
                + " original if statement\nand the conditions of the nested if"
                + " statement are both true.");
        System.out.println("To give multiple conditions for one if statement"
                + " or to have the if statement only run if the\nconditions are"
                + " false, you can use operators such as:\n!(not)\n&&(and)\n"
                + "||(or)");
        System.out.println("When using && or ||, if the result of the boolean"
                + " expression can be determined with only the\nfirst"
                + " condition, it will not look at the next condition. This is"
                + " called short-circuited evaluation");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.6 Equivalent Boolean Expressions");  
        // (3.6.1) Compare and contrast equivalent Boolean expressions
            // (3.6.1.1) De Morgan’s Laws can be applied to Boolean expressions
            // (3.6.1.2) Truth tables can be used to prove Boolean identities
            // (3.6.1.3) Equivalent Boolean expressions will evaluate to the 
            //           same value in all cases
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("The boolean expressions of if statements have"
                + " specific rules to follow such as the order of\noperations"
                + " when determining if it should run the block of code or"
                + " not");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("3.7 Comparing Objects");  
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
        
        String s1 = "abc";
        String s2 = "ABC";
        
        if (s1.equals(s2)) {
            // code if s1 = s2
        }
        
        System.out.println("Objects cannot be compared using symbols such as"
                + " ==, !=, <, >. Instead they have their own\nequals methods"
                + " that compare specific traits of the object to determine"
                + " their equality");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("AP: Unit 3 (Boolean Expressions And If Statements) completed!");
    }
     
}