
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

 
/**
 * APUnit02UsingObjects.java - In the first unit, students used primitive 
 * types to represent real-world data and determined how to use them in 
 * arithmetic expressions to solve problems. This unit introduces a new type 
 * of data: reference data. Reference data allows real-world objects to be 
 * represented in varying degrees specific to a programmer’s purpose. This 
 * unit builds on students’ ability to write expressions by introducing them 
 * to Math class methods to write expressions for generating random numbers 
 * and other more complex operations. In addition, strings and the existing 
 * methods within the String class are an important topic within this unit. 
 * Knowing how to declare variables or call methods on objects is necessary 
 * throughout the course but will be very important in Units 5 and 9 when 
 * teaching students how to write their own classes and about inheritance 
 * relationships.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit02UsingObjects 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit02UsingObjects(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 2 (Using Objects)");
            return;
        }
        
        Simulator.title("AP: Unit 2 (Using Objects)");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.1 Objects: Instances of Classes");  
        // (2.1.1) Explain the relationship between a class and an object
            // (2.1.1.1) An object is a specific instance of a class with 
            //           defined attributes
            // (2.1.1.2) A class is the formal implementation, or blueprint, 
            //           of the attributes and behaviors of an object
        ////////////////////////////////////////////////////////////////////////
            
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.2 Creating and Storing Objects (Instantiation)");  
        // (2.2.1) Identify, using its signature, the correct constructor 
        //         being called
            // (2.2.1.1) A signature consists of the constructor name and the 
            //           parameter list
            // (2.2.1.2) The parameter list, in the header of a constructor, 
            //           lists the types of the values that are passed and 
            //           their variable names. These are often referred to as 
            //           formal parameters
            // (2.2.1.3) A parameter is a value that is passed into a 
            //           constructor. These are often referred to as actual 
            //           parameters
            // (2.2.1.4) Constructors are said to be overloaded when there 
            //           are multiple constructors with the same name but a 
            //           different signature
            // (2.2.1.5) The actual parameters passed to a constructor must 
            //           be compatible with the types identified in the formal
            //           parameter list
            // (2.2.1.6) Parameters are passed using call by value. Call by 
            //           value initializes the formal parameters with copies 
            //           of the actual parameters
        // (2.2.2) For creating objects: a. Create objects by calling 
        //         constructors without parameters. b. Create objects by 
        //         calling constructors with parameters
            // (2.2.2.1) Every object is created using the keyword new 
            //           followed by a call to one of the class’s constructors
            // (2.2.2.2) A class contains constructors that are invoked to 
            //           create objects. They have the same name as the class
            // (2.2.2.3) Existing classes and class libraries can be utilized 
            //           as appropriate to create objects
            // (2.2.2.4) Parameters allow values to be passed to the constructor
            //           to establish the initial state of the object
        // (2.2.3) Define variables of the correct types to represent 
        //         reference data
            // (2.2.3.1) The keyword null is a special value used to indicate 
            //           that a reference is not associated with any object
            // (2.2.3.2) The memory associated with a variable of a reference 
            //           type holds an object reference value or, if there is 
            //           no object, null. This value is the memory address of 
            //           the referenced object
        ////////////////////////////////////////////////////////////////////////
                
        System.out.println("...");    
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.3 Calling a Void Method");  
        // (2.3.1) Call non-static void methods without parameters
            // (2.3.1.1) An object’s behavior refers to what the object can do
            //           (or what can be done to it) and is defined by methods
            // (2.3.1.2) Procedural abstraction allows a programmer to use a 
            //           method by knowing what the method does even if they do
            //           not know how the method was written
            // (2.3.1.3) A method signature for a method without parameters 
            //           consists of the method name and an empty parameter list
            // (2.3.1.4) A method or constructor call interrupts the sequential
            //           execution of statements, causing the program to first
            //           execute the statements in the method or constructor 
            //           before continuing. Once the last statement in the 
            //           method or constructor has executed or a return 
            //           statement is executed, flow of control is returned to 
            //           the point immediately following where the method or 
            //           constructor was called
            // (2.3.1.5) Non-static methods are called through objects of the 
            //           class
            // (2.3.1.6) The dot operator is used along with the object name 
            //           to call non-static methods
            // (2.3.1.7) Void methods do not have return values and are 
            //           therefore not called as part of an expression
            // (2.3.1.8) Using a null reference to call a method or access an
            //           instance variable causes a NullPointerException to 
            //           be thrown
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.4 Calling a Void Method with Parameters"); 
        // (2.4.1) Call non-static void methods with parameters
            // (2.4.1.1) A method signature for a method with parameters 
            //           consists of the method name and the ordered list of 
            //           parameter types
            // (2.4.1.2) Values provided in the parameter list need to 
            //           correspond to the order and type in the method 
            //           signature
            // (2.4.1.3) Methods are said to be overloaded when there are 
            //           multiple methods with the same name but a different
            //           signature
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.5 Calling a Non-void Method");  
        // (2.5.1) Call non-static non-void methods with or without parameters
            // (2.5.1.1) Non-void methods return a value that is the same type 
            //           as the return type in the signature. To use the return
            //           value when calling a non-void method, it must be 
            //           stored in a variable or used as part of an expression
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.6 String Objects: Concatenation, Literals, and More");  
        // (2.6.1) For String class: a. Create String objects. b. Call String 
        //         methods
            // (2.6.1.1) String objects can be created by using string literals
            //           or by calling the String class constructor
            // (2.6.1.2) String objects are immutable, meaning that String 
            //           methods do not change the String object
            // (2.6.1.3) String objects can be concatenated using the + or += 
            //           operator, resulting in a new String object
            // (2.6.1.4) Primitive values can be concatenated with a String 
            //           object. This causes implicit conversion of the values 
            //           to String objects
            // (2.6.1.5) Escape sequences start with a \ and have a special 
            //           meaning in Java. Escape sequences used in this course
            //           include \", \\, and \n
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");   
                
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.7 String Methods");  
        // (2.7.1) For String class: a. Create String objects. b. Call String methods
            // (2.7.1.1) Application program interfaces (APIs) and libraries 
            //           simplify complex programming tasks
            // (2.7.1.2) Documentation for APIs and libraries are essential to 
            //           understanding the attributes and behaviors of an 
            //           object of a class
            // (2.7.1.3) Classes in the APIs and libraries are grouped into 
            //           packages
            // (2.7.1.4) The String class is part of the java.lang package. 
            //           Classes in the java.lang package are available by 
            //           default
            // (2.7.1.5) A String object has index values from 0 to length – 1.
            //           Attempting to access indices outside this range will 
            //           result in an IndexOutOfBoundsException
            // (2.7.1.6) A String object can be concatenated with an object 
            //           reference, which implicitly calls the referenced 
            //           object's toString method
            // (2.7.1.7) The following String methods and constructors—
            //           including what they do and when they are used—are 
            //           part of the Java Quick Reference: (A) String(String 
            //           str) — Constructs a new String object that represents 
            //           the same sequence of characters as str (B) int 
            //           length() — Returns the number of characters in a 
            //           String object (C) String substring(int from) — 
            //           Returns substring(from, length()) (D) int 
            //           indexOf(String str) — Returns the index of the first 
            //           occurrence of str; returns -1 if not found (E) boolean
            //           equals(String other) — Returns true if this is equal 
            //           to other; returns false otherwise (F) int 
            //           compareTo(String other) — Returns a value < 0 if this
            //           is less than other; returns zero if this is equal to 
            //           other; returns a value > 0 if this is greater than 
            //           other 
            // (2.7.1.8) A string identical to the single element substring at
            //           position index can be created by calling 
            //           substring(index, index + 1)
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.8 Wrapper Classes: Integer and Double");  
        // (2.8.1) For wrapper classes: a. Create Integer objects, b. Call 
        //         Integer methods, c. Create Double objects, d. Call Double 
        //         methods
            // (2.8.1.1) The Integer class and Double class are part of the 
            //           java.lang package
            // (2.8.1.2) The following Integer methods and constructors—
            //           including what they do and when they are used—are 
            //           part of the Java Quick Reference: (A) Integer(int 
            //           value) — Constructs a new Integer object that 
            //           represents the specified int value (B) 
            //           Integer.MIN_VALUE — The minimum value represented by
            //           an int or Integer (C) Integer.MAX_VALUE — The maximum
            //           value represented by an int or Integer (D) int 
            //           intValue() — Returns the value of this Integer as an
            //           int
            // (2.8.1.3) The following Double methods and constructors—
            //           including what they do and when they are used—are 
            //           part of the Java Quick Reference: (A) double 
            //           doubleValue() — Returns the value of this Double as 
            //           a double
            // (2.8.1.4) Autoboxing is the automatic conversion that the Java 
            //           compiler makes between primitive types and their 
            //           corresponding object wrapper classes. This includes 
            //           converting an int to an Integer and a double to a 
            //           Double
            // (2.8.1.5) The Java compiler applies autoboxing when a primitive
            //           value is: (A) Passed as a parameter to a method that
            //           expects an object of the corresponding wrapper class.
            //           (B) Assigned to a variable of the corresponding
            //           wrapper class
            // (2.8.1.6) Unboxing is the automatic conversion that the Java 
            //           compiler makes from the wrapper class to the primitive
            //           type. This includes converting an Integer to an int 
            //           and a Double to a double
            // (2.8.1.7) The Java compiler applies unboxing when a wrapper 
            //           class object is: (A) Passed as a parameter to a method
            //           that expects a value of the corresponding primitive 
            //           type (B) Assigned to a variable of the corresponding
            //           primitive type
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
                
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("2.9 Using the Math Class");  
        // (2.9.1) Call static methods
            // (2.9.1.1) Static methods are called using the dot operator 
            //           along with the class name unless they are defined in 
            //           the enclosing class
        // (2.9.2) Evaluate expressions that use the Math class methods
            // (2.9.2.1) The Math class is part of the java.lang package
            // (2.9.2.2) The Math class contains only static methods
            // (2.9.2.3) The following static Math methods—including what 
            //           they do and when they are used—are part of the Java 
            //           Quick Reference: (A) int abs(int x) — Returns the 
            //           absolute value of an int value (B) double 
            //           abs(double x) — Returns the absolute value of a 
            //           double value (C) double pow(double base, 
            //           double exponent) — Returns the value of the first 
            //           parameter raised to the power of the second parameter
            //           (D) double sqrt(double x) — Returns the positive 
            //           square root of a double value (E) double random() — 
            //           Returns a double value greater than or equal to 0.0 
            //           and less than 1.0
            // (2.9.2.4) The values returned from Math.random can be 
            //           manipulated to produce a random int or double in a 
            //           defined range
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("...");
        
        ////////////////////////////////////////////////////////////////////////
    }
    
}