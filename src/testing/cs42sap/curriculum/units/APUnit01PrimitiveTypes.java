
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

 
/**
 * APUnit01PrimitiveTypes.java - This unit introduces students to the Java 
 * programming language and the use of classes, providing students with a firm 
 * foundation of concepts that will be leveraged and built upon in all future 
 * units. Students will focus on writing the main method and will start to 
 * call preexisting methods to produce output. The use of preexisting methods 
 * for input is not prescribed in the course; however, input is a necessary 
 * part of any computer science course so teachers will need to determine 
 * how they will address this in their classrooms. Students will start to 
 * learn about three built-in data types and learn how to create variables, 
 * store values, and interact with those variables using basic operations. 
 * The ability to write expressions is essential to representing the 
 * variability of the real world in a program and will be used in all future 
 * units. Primitive data is one of two categories of variables covered in 
 * this course. The other category, reference data, will be covered in Unit 2.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit01PrimitiveTypes 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit01PrimitiveTypes(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 1 (Primitive Types) not running");
            return;
        }
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(1);
        // AP: Unit 1 (Primitive Types)
        ////////////////////////////////////////////////////////////////////////
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(1,1);
        // 1.1 Why Programming? Why Java? 
        // (1.1.1) Call System class methods to generate output to the console
            // (1.1.1.1) System.out.print and System.out.println display 
             //           information on the computer monitor 
            // (1.1.1.2) System.out.println moves the cursor to a new line after 
            //           the information has been displayed, while 
            //           System.out.print does not        
        // (1.1.2) Create string literals
            // (1.1.2.1) A string literal is enclosed in double quotes        
        ////////////////////////////////////////////////////////////////////////
         
        System.out.print("System.out.print outputs text to the screen and ");
        System.out.println("System.out.println outputs with a line break");
        System.out.print("More specifically, the code word \"System\" ");
        System.out.println("refers to the \"computer system\" and the ");
        System.out.print("word \"out\" refers to outputting, and finally ");
        System.out.println("the word \"print\" or \"println\" are calls to ");
        System.out.print("methods (or \"actions\") that take the string ");
        System.out.println("literal (which is the word or words in between ");
        System.out.print("the quotation marks) and outputs it. So the ");
        System.out.println("command \"System.out.println(\"literal\");\" ");
        System.out.print("will take the string literal and output it to ");
        System.out.println("the default output device - that being the ");
        System.out.println("computer screen.");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(1,2);
        // 1.2 Variables and Data Types        
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
            //           are int, double, and boolean
            // (1.2.1.2) Each variable has associated memory that is used to 
            //           hold its value
            // (1.2.1.3) The memory associated with a variable of a primitive 
            //           type holds an actual primitive value
            // (1.2.1.4) When a variable is declared final, its value cannot 
            //           be changed once it is initialized
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Data/information refers to the \"kind\" of data ");
        System.out.println("being stored (or \"remembered\") by the program ");
        System.out.print("in a \"variable\". A variable is a piece of the ");
        System.out.println("computer's memory (storage) that has a \"name\" ");
        System.out.print("(or \"address\") so that the programmer can refer ");
        System.out.println("to it by that name. The \"type\" refers to the ");
        System.out.print("\"kind\" of data that you are storing (e.g. text, ");
        System.out.println("numbers, true/false, etc.). The type must be ");
        System.out.print("specified at the time you write a line of code to ");
        System.out.println("\"create\" (or \"declare\") the variable. A ");
        System.out.print("variable can only be one type and only store that ");
        System.out.println("specified type of data. However, the data ");
        System.out.print("itself can change (or \"vary\") after the initial ");
        System.out.println("declaration. Examples of this are below...");
        
        // Variables declared and assigned initial ("starting") values:
        boolean a = true;
        int     b = 0;
        double  c = 1.0;
        char    d = 'A';
        
        // Variables content changes ("reassigned"):
        a = false;
        b = 1;
        c = 1.1;
        d = 'B';
        
        Simulator.comment("Variables declared and assigned initial (\"starting\") values:");
        Simulator.code("boolean a = true;");
        Simulator.code("int     b = 0;");
        Simulator.code("double  c = 1.0;");
        Simulator.code("char    d = 'A';");
        Simulator.comment("Variables content changes (\"reassigned\"):");
        Simulator.code("a = false;");
        Simulator.code("b = 1;");
        Simulator.code("c = 1.1;");
        Simulator.code("d = 'B';");  
        
        System.out.print("A \"final\" (or a \"constant\") is a variable ");
        System.out.println("in which the stored value does NOT change ");
        System.out.print("(it stays \"constant\") and it locked at that ");
        System.out.println("value. Final (or constant) variables are ");
        System.out.print("given the initial value when declared (or ");
        System.out.println("initialized) and that value stays locked. These ");
        System.out.print("types of values are written in ALL_CAPS with the ");
        System.out.println("underscore value used to seperate words in ");
        System.out.print("the name. Final variables are more efficient for ");
        System.out.println("a number of reasons including ease of code ");
        System.out.print("understanding, speed (faster code), easier to ");
        System.out.println("update code, and others. Examples of finals ");
        System.out.println("are below");
        
        // Constants (finals) declared (initialized)
        final boolean FOUND  = true;
        final int     VALUE  = 1;
        final double  AMOUNT = 2.5;
        final char    CODE   = 'X';
        
        Simulator.comment("Constants (finals) declared (initialized)");
        Simulator.code("final boolean FOUND  = true;");
        Simulator.code("final int     VALUE  = 1;");
        Simulator.code("final double  AMOUNT = 2.5;");
        Simulator.code("final char    CODE   = 'X';");
        
        //////////////////////////////////////////////////////////////////////// 
        CurriculumContentCS42SAP.showUnit(1,3);
        // 1.3 Expressions and Assignment Statements
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
        
        System.out.print("Arithmetic (or \"math\") statements in code ");
        System.out.println("are lines of code (or \"statements\") that are ");
        System.out.print("written to evaluate (or \"solve\") an equation ");
        System.out.println("of logic the program needs to solve. In this ");
        System.out.print("context, the word \"literal\" can also mean a ");
        System.out.println("number (like \"5\"). This usually involves ");
        System.out.print("variable types int and double (the number types) ");
        System.out.println("used in a math expression or equation. This ");
        System.out.print("can involve math operations like +, -, *, / and ");
        System.out.println("% (modulus). When multiple int values are ");
        System.out.print("evaluated in a formula, they always evaluate ");
        System.out.println("to an int answer (solution) and double values ");
        System.out.print("will evaluate to a double. Complex (or ");
        System.out.println("\"compound\" expressions can be formed in which ");
        System.out.print("the order of operations (or precedence order). ");
        System.out.println("This means multiplication and division are ");
        System.out.print("evaluated before addition and subtraction. If ");
        System.out.println("operations are at the same precedence level, ");
        System.out.print("then they are evaluated from left to right.");
        System.out.println("When you try and divide by zero, an error ");
        System.out.print("(the \"ArithmeticException\" error) will occur ");
        System.out.println("and the program will stop running. Examples:"); 
        
        // Arithmetic evaluations using variables
        int    v1 = 5;
        int    v2 = 3;
        int    v3 = (v1 + 5 * v2 / (1 + 2)) % 2;
        double v4 = 5.2;
        double v5 = 3.3;
        double v6 = (v4 + 5.1 * v5 / (1.2 + 2.3)) % 2.2;
        
        Simulator.comment("Arithmetic evaluations using variables");
        Simulator.code("int    v1 = 5;");
        Simulator.code("int    v2 = 3;");
        Simulator.code("int    v3 = (v1 + 5 * v2 / (1 + 2)) % 2;");   
        Simulator.code("double v4 = 5.2;");  
        Simulator.code("double v5 = 3.3;");  
        Simulator.code("double v6 = (v4 + 5.1 * v5 / (1.2 + 2.3)) % 2.2;");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(1,4);
        // 1.4 Compound Assignment Operators
        // (1.4.1) Evaluate what is stored in a variable as a result of an 
        //         expression with an assignment statement
            // (1.4.1.1) Compound assignment operators (+=, −=, *=, /=, %=) 
            //           can be used in place of the assignment operator
            // (1.4.1.2) The increment operator (++) and decrement operator 
            //           (−−) are used to add 1 or subtract 1 from the stored 
            //           value of a variable or an array element. The new 
            //           value is assigned to the variable or array element
        ////////////////////////////////////////////////////////////////////////    
        
        System.out.print("Compound statements in this context refers to ");
        System.out.println("using shortcuts to quickly add or subtract one ");
        System.out.print("(increment or decrement) to a variable. You ");
        System.out.println("can also use more complex shorthand compound ");
        System.out.print("statements to quickly multiply, divide, even ");
        System.out.println("modulus a variable with itself or other ");
        System.out.println("variables. For example:");
        
        // Shorthand Compound Arithmetic expressions
        int value = 5;
        value++;    // is the same as "value = value + 1;"
        value--;    // is the same as "value = value + 1;"
        value += 5; // is the same as "value = value + 5;"
        value -= 5; // is the same as "value = value - 5;"
        value *= 5; // is the same as "value = value * 5;"
        value /= 5; // is the same as "value = value / 5;"
        value %= 5; // is the same as "value = value % 5;"
                        
        Simulator.comment("Shorthand Compound Arithmetic expressions");
        Simulator.code("int value = 5;");
        Simulator.code("value++;    // is the same as \"value = value + 1;\"");
        Simulator.code("value--;    // is the same as \"value = value + 1;\"");
        Simulator.code("value += 5; // is the same as \"value = value + 5;\"");
        Simulator.code("value -= 5; // is the same as \"value = value - 5;\"");
        Simulator.code("value *= 5; // is the same as \"value = value * 5;\"");
        Simulator.code("value /= 5; // is the same as \"value = value / 5;\"");
        Simulator.code("value %= 5; // is the same as \"value = value % 5;\"");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(1,5);
        // 1.5 Casting and Ranges of Variables
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
        
        System.out.print("Casting is the process of \"converting\" one ");
        System.out.println("data type into another data type. When casting ");
        System.out.print("an double to a int, the decimal portion of the ");
        System.out.println("double is truncated (cut off) and not rounded ");
        System.out.print("off. When a int is cast to a double, the int ");
        System.out.println("is \"widened\" to now accomodate any decimals. ");
        System.out.print("A char when cast will turn into it's ASCII ");
        System.out.println("value. The process of casting involves putting ");
        System.out.print("variable to be cast with the type being cast ");
        System.out.println("into in round brackets to the left of that ");
        System.out.print("variable. Integer values hold a finite amount ");
        System.out.println("of number space (4 bytes) and the built-in ");
        System.out.print("constants Integer.MAX_VALUE and MIN_VALUE are ");
        System.out.println("the limits of the int. If an expression ");
        System.out.print("evaluates an int outside that range, an error ");
        System.out.println("will occur (overflow error). For example:");
        
        // Casting data types
        int integer = Integer.MAX_VALUE;
        double doub = Double.MIN_VALUE;
        doub        = (int)integer;
        integer     = (int)doub;
        char letter = 'A';
        integer     = (int)letter;
                                
        Simulator.comment("Casting data types");
        Simulator.code("int integer = Integer.MAX_VALUE;");
        Simulator.code("double doub = Double.MIN_VALUE;");
        Simulator.code("doub        = (int)integer;");
        Simulator.code("integer     = (int)doub;");
        Simulator.code("char letter = 'A';");
        Simulator.code("integer     = (int)letter;"); 
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}