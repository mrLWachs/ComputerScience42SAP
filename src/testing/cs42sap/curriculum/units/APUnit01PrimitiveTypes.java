/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/**
 * Required API imports
 */
import io.Simulator;

/**
 * APUnit01PrimitiveTypes.java - This unit introduces students to the Java
 * programming language and the use of classes, providing students with a firm
 * foundation of concepts that will be leveraged and built upon in all future
 * units. Students will focus on writing the main method and will start to call
 * preexisting methods to produce output. The use of preexisting methods for
 * input is not prescribed in the course; however, input is a necessary part of
 * any computer science course so teachers will need to determine how they will
 * address this in their classrooms. Students will start to learn about three
 * built-in data types and learn how to create variables, store values, and
 * interact with those variables using basic operations. The ability to write
 * expressions is essential to representing the variability of the real world in
 * a program and will be used in all future units. Primitive data is one of two
 * categories of variables covered in this course. The other category, reference
 * data, will be covered in Unit 2.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit01PrimitiveTypes {

    /**
     * Default constructor, set class properties
     */
    public APUnit01PrimitiveTypes() {
        Simulator.header("AP: Unit 1 (Primitive Types) started...");

        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("1.1 Why Programming? Why Java?");
        // (1.1.1) Call System class methods to generate output to the console
        // (1.1.1.1) System.out.print and System.out.println display 
        //           information on the computer monitor
        // (1.1.1.2) System.out.println moves the cursor to a new line after 
        //           the information has been displayed, while 
        //           System.out.print does not        
        // (1.1.2) Create string literals
        // (1.1.2.1) A string literal is enclosed in double quotes        
        ////////////////////////////////////////////////////////////////////////

        Simulator.output("I am a string literal!");

        System.out.print("using print() doens't create a new line");
        System.out.println("so these two print statements will be shoved together awkwardly!");

        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("1.2 Variables and Data Types");
        // (1.2.1) Identify the most appropriate data type category for a 
        //         particular specification
        // (1.2.1.1) A type is a set of values (a domain) and a set of 
        //           operations on them
        // (1.2.1.2) Data types can be categorized as either primitive or
        //           reference
        // (1.2.1.3) The primitive data types used in this course define 
        //           the set of operations for numbers and Boolean values        
        // (1.2.1) Declare variables of the correct types to represent 
        //         primitive data
        // (1.2.1.1) The three primitive data types used in this course 
        //           are int, double, and booleanS
        // (1.2.1.2) Each variable has associated memory that is used to 
        //           hold its value
        // (1.2.1.3) The memory associated with a variable of a primitive 
        //           type holds an actual primitive value
        // (1.2.1.4) When a variable is declared final, its value cannot 
        //           be changed once it is initialized
        ////////////////////////////////////////////////////////////////////////

        Simulator.comment("Java automatically allocates memory and creates these variables \n");

        Simulator.comment("Let's Model a Person! we can model thier traits using vairables");
        Simulator.comment("this person has three important traits, thier age, net worth, and weather they are rich");
        // bracket here so i can use these names later, if needed
        {
            int age = 32;
            Simulator.output("age: " + age);
            double dollars = 0.02;
            Simulator.output("dollars: " + dollars);
            boolean isRich = false;
            Simulator.output("isRich: " + isRich);

            System.out.println("This person also has one trait that doesn't change, thier eye color");
            // this may seem like a strange way to encode the color, but it's perfectally valid
            // i could've done this with a string, like "blue", but this section only talks about
            // value types and not refrence types, so i decided against it
            final int EYE_COLOR = 0x505cc4;
            System.out.println("eye color: " + EYE_COLOR);
        }
        //////////////////////////////////////////////////////////////////////// 
        Simulator.comment("1.3 Expressions and Assignment Statements");
        // (1.3.1) Evaluate arithmetic expressions in a program code
        // (1.3.1.1) A literal is the source code representation of a 
        //           fixed value
        // (1.3.1.2) Arithmetic expressions include expressions of type 
        //           int and double.
        // (1.3.1.3) The arithmetic operators consist of +, −, *, /, and %.
        // (1.3.1.4) An arithmetic operation that uses two int values 
        //           will evaluate to an int value
        // (1.3.1.5) An arithmetic operation that uses a double value 
        //           will evaluate to a double value.
        // (1.3.1.6) Operators can be used to construct compound 
        //           expressions
        // (1.3.1.7) During evaluation, operands are associated with 
        //           operators according to operator precedence to 
        //           determine how they are grouped
        // (1.3.1.8) An attempt to divide an integer by zero will result 
        //           in an ArithmeticException to occur            
        // (1.3.2) Evaluate what is stored in a variable as a result of an 
        //         expression with an assignment statement
        // (1.3.2.1) The assignment operator (=) allows a program to 
        //           initialize or change the value stored in a variable. 
        //           The value of the expression on the right is stored 
        //           in the variable on the left.
        // (1.3.2.2) During execution, expressions are evaluated to 
        //           produce a single value
        // (1.3.2.3) The value of an expression has a type based on the 
        //           evaluation of the expression
        ////////////////////////////////////////////////////////////////////////
        {
            // (1.3.1.1)  &  (1.3.1.2) 
            double a = 2d;
            int b = 7;
            int c = 4;
            // (1.3.1.3)
            Simulator.comment("you can use arithmetic operators to do math!");
            Simulator.comment("let a = 2, b = 7;");
            Simulator.output("b + c: " + (b + c)); // (1.3.1.4)
            Simulator.output("a - b: " + (a - b));
            Simulator.output("a * b: " + (a * b));
            Simulator.output("a / b: " + (a / b));  //  (1.3.1.5)
            Simulator.output("a % b: " + (a % b));
            Simulator.comment("you can even combine many to do more complex operations!");
            Simulator.output("(a%b)/ c + (b*a)) = " + (a % b) / c + (b * a)); // (1.3.1.6)
            Simulator.comment("these follow the order of operations!"); //(1.3.1.7)
            
            Simulator.comment("Just like with real math, you can't devide by zero!");
            Simulator.output("b / 0 = ");
            //(1.3.1.8)
            try
            {
                Simulator.output(b / 0);
            }
            catch (ArithmeticException ae) // catches erorrs, not covered by AP
            {
               Simulator.output("\033[0;31m" + ae.toString());
            }   
            
            // (1.3.2)
            Simulator.comment("Once variables are created, they can be changed");
            Simulator.output("a = " + a);
            // (1.3.2.1)
            Simulator.comment("let a = b"); a = b;        
            Simulator.output("a = " + a);
            // (1.3.2.2)
            Simulator.comment("You can do complex assingments, like before!");
            Simulator.comment("let a = 5 + ((a*a) + b/c)");
            a = 5 + ((a*a) + b/c);
            Simulator.output(a);
            // (1.3.2.3) 
            Simulator.comment("Notice how the value turned out to be a Double, "
                    + "the value of the expression has a type based on the "
                    + "evaluation of the expression ");
        }
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("1.4 Compound Assignment Operators");
        // (1.4.1) Evaluate what is stored in a variable as a result of an 
        //         expression with an assignment statement
        // (1.4.1.1) Compound assignment operators (+=, −=, *=, /=, %=) 
        //           can be used in place of the assignment operator
        // (1.4.1.2) The increment operator (++) and decrement operator 
        //           (−−) are used to add 1 or subtract 1 from the stored 
        //           value of a variable or an array element. The new 
        //           value is assigned to the variable or array element
        ////////////////////////////////////////////////////////////////////////    

        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("1.5 Casting and Ranges of Variables");
        // (1.5.1) Evaluate arithmetic expressions that use casting
        // (1.5.1.1) The casting operators (int) and (double) can be used 
        //           to create a temporary value converted to a different 
        //           data type
        // (1.5.1.2) Casting a double value to an int causes the digits 
        //           to the right of the decimal point to be truncated
        // (1.5.1.3) Some programming code causes int values to be 
        //           automatically cast (widened) to double values
        // (1.5.1.4) Values of type double can be rounded to the nearest
        //           integer by (int)(x + 0.5) or (int)(x – 0.5) for 
        //           negative numbers
        // (1.5.1.5) Integer values in Java are represented by values of 
        //           type int, which are stored using a finite amount 
        //           (4 bytes) of memory. Therefore, an int value must be
        //           in the range from Integer.MIN_VALUE to 
        //           Integer.MAX_VALUE inclusive
        // (1.5.1.6) If an expression would evaluate to an int value 
        //           outside of the allowed range, an integer overflow 
        //           occurs. This could result in an incorrect value 
        //           within the allowed range
        ////////////////////////////////////////////////////////////////////////    

        ////////////////////////////////////////////////////////////////////////
        Simulator.header("AP: Unit 1 (Primitive Types) completed!");
    }

}
