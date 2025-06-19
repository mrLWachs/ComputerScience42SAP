
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
     */
    public APUnit04Iteration() {
        if (Simulator.check("AP: Unit 4 (Iteration)")) return; 
        
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
        
        System.out.print("The word \"Iteration\" is another word for ");
        System.out.println("\"Loop\" or \"Looping\" which is a control ");
        System.out.print("struture to have code statements \"repeat\". ");
        System.out.println("Like conditional (\"if\") statements, iteration ");
        System.out.print("statements control the flow of a program's logic. ");
        System.out.println("Also like if statements, iteration ");
        System.out.print("statements are controlled by a Boolean expression ");
        System.out.println("(true or false). The result of the Boolean ");
        System.out.print("expression will result in the code executing ");
        System.out.println("zero or mulitple times (until the expression ");
        System.out.print("evaluates to false). The expression is evaluated ");
        System.out.println("each time through an iteration of the loop. ");
        System.out.print("A loop is called an \"infinite\" loop if the ");
        System.out.println("Boolean expression never evaluates to false ");
        System.out.print("(thus the loop never stops looping - or never ");
        System.out.println("stops running). It is possible a loop will ");
        System.out.print("never run if it evaluates to false before the ");
        System.out.println("body (block) of the loop. If you use the ");
        System.out.print("keyword \"return\" inside a loop body (block) ");
        System.out.println("then the loop will terminate (end) early and ");
        System.out.print("potentially exit any method the loop is written ");
        System.out.println("inside. The \"while\" loop is a event loop or ");
        System.out.print("non-deterministic loop, which means it is ");
        System.out.println("not usually used for counting but when you do ");
        System.out.print("not know how many times the loop needs to ");
        System.out.println("run (a certain event can cause the loop to ");
        System.out.print("end). Loops are used for a variety of reasons ");
        System.out.println("such as: repeating instructions, travelling ");
        System.out.print("(traversing) arrays and lists, and searching ");
        System.out.println("and sorting values. For example:");
        
        // Example of a simple while loop
        int counter = 0;
        while (counter < 10) {
            counter++; 
        }
        
        Simulator.comment("Example of a simple while loop");
        Simulator.code("int counter = 0;");
        Simulator.code("while (counter < 10) {");
        Simulator.code("    counter++;");
        Simulator.code("}");
        
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
             
        System.out.print("The \"for\" loop is another looping form. The for ");
        System.out.println("loop is a count controlled loop that ");
        System.out.print("generally is used when a loop needs to run a ");
        System.out.println("specific number of times. There are three ");
        System.out.print("parts to the for loop, that seperate the parts ");
        System.out.println("with two semi-colons. The 3 parts represent ");
        System.out.print("the starting, ending, and change of the loop. ");
        System.out.println("In a for loop a counting variable is ");
        System.out.print("generally declared right inside the loop to ");
        System.out.println("a starting value, then the Boolean condition ");
        System.out.print("to end the loop, then the change value ");
        System.out.println("increasing (increment) or decreasing (decrement) ");
        System.out.print("that value. A \"for\" loop can be rewritten ");
        System.out.println("as a \"while\" loop and vice versa. A \"off ");
        System.out.print("by one\" error occurs when a loop runs one too ");
        System.out.println("many or one too few times. For Example:");
        
        // Example of a for loop
        for (int i = 0; i < 10; i++) {
            // potential code body...
        }     
                
        Simulator.comment("Example of a for loop");
        Simulator.code("for (int i = 0; i < 10; i++) {");
        Simulator.code("    // potential code body...");
        Simulator.code("}");
        
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
        
        System.out.print("The String class allows for several \"built-in\" ");
        System.out.println("methods of the String class to manipulate ");
        System.out.print("the string and the value it stores. Several of ");
        System.out.println("these methods could apply to the A.P. exam ");
        System.out.print("including travelling (traversing) string ");
        System.out.println("characters, pulling out substrings (parts ");
        System.out.print("of the string), reversing a string, etc. For ");
        System.out.println("example:");
        
        // Example of string methods with a loop
        String word   = "completion";
        String parts1 = word.substring(3);   // Pull out from character 3 on
        String parts2 = word.substring(1,7); // Pull out character 1 to before 7
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
        }
        
        Simulator.comment("Example of string methods with a loop");
        Simulator.code("String word   = \"completion\";");
        Simulator.code("String parts1 = word.substring(3);");
        Simulator.code("String parts2 = word.substring(1,7);");
        Simulator.code("for (int i = 0; i < word.length(); i++) {");
        Simulator.code("    char character = word.charAt(i);");
        Simulator.code("}");      
        
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
        
        System.out.print("Like conditional (\"if\") statements, looping ");
        System.out.println("(\"iteration\") statments can be \"nested\", ");
        System.out.print("This means you can place a iteration statement ");
        System.out.println("inside the block of another iteration ");
        System.out.print("statement. The inner loop must complete all ");
        System.out.println("of its iterations before the outer loop ");
        System.out.println("can continue. For example:"); 
        
        // Example of nested loops
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int k = 10;
                while (k < 10) {
                    // potential code body...
                }
            }
        }
                   
        Simulator.comment("Example of nested loops");
        Simulator.code("for (int i = 0; i < 10; i++) {");
        Simulator.code("    for (int j = 0; j < 10; j++) {");
        Simulator.code("        int k = 10;");
        Simulator.code("        while (k < 10) {");
        Simulator.code("            // potential code body...");
        Simulator.code("        }");
        Simulator.code("    }");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,5);
        // 4.5 Informal Code Analysis
        // (4.5.1) Compute statement execution counts and informal check-time 
        //         comparison of iterative statements
            // (4.5.1.1) A statement execution count indicates the number of 
            //           times a statement is executed by the program
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Expect to \"trace\" loop values in A.P. exam ");
        System.out.println("questions. Examining, computing, and tracing ");
        System.out.print("loops are typical A.P. exam questions. You ");
        System.out.println("should practice these types of questions.");
                
        ////////////////////////////////////////////////////////////////////////
    }
    
}