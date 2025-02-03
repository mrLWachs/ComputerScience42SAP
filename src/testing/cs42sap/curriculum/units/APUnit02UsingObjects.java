
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
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
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2);
        // AP: Unit 2 (Using Objects)
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,1);
        // 2.1 Objects: Instances of Classes
        // (2.1.1) Explain the relationship between a class and an object
            // (2.1.1.1) An object is a specific instance of a class with 
            //           defined attributes
            // (2.1.1.2) A class is the formal implementation, or blueprint, 
            //           of the attributes and behaviors of an object
        ////////////////////////////////////////////////////////////////////////
            
        System.out.print("A \"class\" is the \"blueprint\" for creating ");
        System.out.println("an \"object\". In Java, the class is a way to ");
        System.out.print("use code to model \"things\" using properties ");
        System.out.println("and methods. The object is what the class ");
        System.out.print("\"creates\" when the class is made into a ");
        System.out.println("specific \"object\" of that class. The various ");
        System.out.print("terms used for this vary but all revolve around ");
        System.out.println("the same concepts. The term \"object\" ");
        System.out.print("can also be called a \"instance\" of the class. ");
        System.out.println("The term \"properties\" can also be ");
        System.out.print("called \"things about the class\", or ");
        System.out.println("\"descriptors\", or \"adjectives\", or ");
        System.out.print("\"fields\". The term \"methods\" could also ");
        System.out.println("be called \"what the class can do\", or ");
        System.out.println("\"actions\", or \"verbs\", or \"functions\". ");
               
        // Example of a simple class with properties and methods
        // class Person {
        //     String name;
        //     int age;
        //     void walk() {
        //         // code logic could go here
        //     }     
        //     void talk() {
        //         // code logic could go here
        //     }            
        // }
        
        Simulator.comment("Example of a simple class with properties and methods");
        Simulator.code("class Person {");
        Simulator.code("    String name;");
        Simulator.code("    int age;");
        Simulator.code("    void walk() {");
        Simulator.code("        // code logic could go here");
        Simulator.code("    }");
        Simulator.code("    void talk() {");
        Simulator.code("        // code logic could go here");
        Simulator.code("    }");
        Simulator.code("}");        
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,2);
        // 2.2 Creating and Storing Objects (Instantiation) 
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
                
        System.out.print("Methods are a way to break up code into logic ");
        System.out.println("modules and it also provides a way to avoid ");
        System.out.print("repeating code and be able to reuse sections of ");
        System.out.println("code logic. You can think of methods as ");
        System.out.print("analogous to \"machines\" that perform \"actions\" ");
        System.out.println("and you can reuse. They are also analogous to ");
        System.out.print("\"functions\" in math that may take a variable ");
        System.out.println("\"input\" and generate an \"answer\".  The term ");
        System.out.print("\"parameter\" (and you may have zero, one, or more ");
        System.out.println("than one) is the \"input\" (if needed) to a ");
        System.out.print("method that is passed to the method. The value(s) ");
        System.out.println("passed are called \"argument(s)\". When you ");
        System.out.print("define the method in the method \"signature\" ");
        System.out.println("line, the round brackets can contain ");
        System.out.print("parameters separated by comma (if needed). A ");
        System.out.println("method may also give an \"output\" in the form ");
        System.out.print("of its \"return\" value (which also might not ");
        System.out.println("be needed, in which case it is a \"void\" method).");        
        System.out.print("A method is \"overloaded\" if you have more ");
        System.out.println("than one method with the exact same name but ");
        System.out.print("different parameters. Classes have ");
        System.out.println("\"constructor\" methods that are called when ");
        System.out.print("a class is instantiated into an object. ");
        System.out.println("Constructor methods do not have a return type ");
        System.out.print("(not even the keyword \"void\"). They must have ");
        System.out.println("the exact same name as the class (including a ");
        System.out.print("capital letter). They are used to set the ");
        System.out.println("properties of the class to starting (or ");
        System.out.print("\"default\") values. If a class has multiple ");
        System.out.println("constructor methods, they are said to be ");
        System.out.print("overloaded constructors. When a line of code ");
        System.out.println("is used to instantiate a class into an instance ");
        System.out.print("of that class, the line includes the name of ");
        System.out.println("the class, the identifier name of the object, ");
        System.out.print("then an equals (\"=\"), then the keyword ");
        System.out.println("\"new\" (which allots new memory for this ");
        System.out.print("advanced data type), then a call to a ");
        System.out.println("constructor method. If not constructor method ");
        System.out.print("is called, then the object references a \"null\" ");
        System.out.println("value until such time it is given a value to ");
        System.out.println("reference.");
        
        // Example of a class with constructors and instantiation
        // class Person {
        //     Person() {
        //         // code logic
        //     }
        //     Person(int age) {
        //         // code logic
        //     }
        // }
        // 
        // Person person1 = new Person();
        // Person person2 = new Person(5);
        
        Simulator.comment("Example of a class with constructors and instantiation");
        Simulator.code("class Person {");
        Simulator.code("    Person() {");
        Simulator.code("        // code logic");
        Simulator.code("    }");
        Simulator.code("    Person(int age) {");
        Simulator.code("        // code logic");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("Person person1 = new Person();");
        Simulator.code("Person person2 = new Person(5);");     
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,3);
        // 2.3 Calling a Void Method
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
        
        System.out.print("A \"non-static\" method is a method (meaning a ");
        System.out.println("\"action\", \"behaviour\", \"procedure\", ");
        System.out.print("or \"verb\") that does not use the \"static\" ");
        System.out.println("modifier word in the method signature line. ");
        System.out.print("A method with no prameters (or \"inputs\") ");
        System.out.println("means the method is defined with empty round ");
        System.out.print("brackets \"( )\". The \"behavior\" or action ");
        System.out.println("the method performs is defined in the body ");
        System.out.print("block of the method (between the two curly ");
        System.out.println("\"{ }\" brackets). The A.P. term \"procedural ");
        System.out.print("abstraction\" refers to a programmer being able ");
        System.out.println("to call a method without knowing how the ");
        System.out.print("method was written (also known as \"black box\" ");
        System.out.println("programming). When methods are \"called\" ");
        System.out.print("the execution flow stops, jumps and runs all ");
        System.out.println("the method body (or until a \"return\" ");
        System.out.print("statement) and then returns to the next line ");
        System.out.println("of execution after the method call line ");
        System.out.print("(or part of a code expression line). Methods ");
        System.out.println("can also be called from objects (or ");
        System.out.print("\"instances\") of a class using the dot \".\" ");
        System.out.println("operator. Void method do not return anthing ");
        System.out.print("(no \"outputs\") and use the keyword modifier ");
        System.out.println("\"void\" in the method signature in place of ");
        System.out.println("the return type.");
        
        // Examples of methods, parameters, return, and calling
        // public void show() {
        //     System.out.println("*");
        // }        
        // public void show(char value) {
        //     System.out.println(value);
        // }        
        // public int double(int number) {
        //     return number * 2;
        // }        
        // show();
        // show('A');
        // int answer = double(5);
                
        Simulator.comment("Examples of methods, parameters, return, and calling");
        Simulator.code("public void show() {");  
        Simulator.code("    System.out.println(\"*\")");  
        Simulator.code("}");  
        Simulator.code("public void show(char value) {");  
        Simulator.code("    System.out.println(value);");  
        Simulator.code("}");  
        Simulator.code("public int double(int number) {");  
        Simulator.code("    return number * 2;");  
        Simulator.code("} ");  
        Simulator.code("show();");  
        Simulator.code("show('A');");  
        Simulator.code("int answer = double(5);");  
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,4);
        // 2.4 Calling a Void Method with Parameters
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
        
        System.out.print("A \"non-static void\" methods with parameters ");
        System.out.println("is a method with no outputs, but has input(s). ");
        System.out.print("This means the method signature has defined ");
        System.out.println("parameter(s) within the round brackets \"( )\" ");
        System.out.print("seperated by commas (if necessary). When this ");
        System.out.println("type of method is called, the \"arguments\" ");
        System.out.print("passed to this method must be in the same ");
        System.out.println("order in terms of data type. A method is ");
        System.out.print("\"overloaded\" when you have two or more ");
        System.out.println("methods with the same name but different and ");
        System.out.println("distinct parameter lists.");
        
        // Examples of method overloading
        // public void show() {
        //     System.out.println("*");
        // }        
        // public void show(char value) {
        //     System.out.println(value);
        // } 
        // public void show(int value) {
        //     System.out.println(value);
        // } 
        
        Simulator.comment("Examples of method overloading");
        Simulator.code("public void show() {");  
        Simulator.code("    System.out.println(\"*\")");  
        Simulator.code("}");  
        Simulator.code("public void show(char value) {");  
        Simulator.code("    System.out.println(value);");  
        Simulator.code("}");
        Simulator.code("public void show(int value) {");  
        Simulator.code("    System.out.println(value);");  
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,5);
        // 2.5 Calling a Non-void Method
        // (2.5.1) Call non-static non-void methods with or without parameters
            // (2.5.1.1) Non-void methods return a value that is the same type 
            //           as the return type in the signature. To use the return
            //           value when calling a non-void method, it must be 
            //           stored in a variable or used as part of an expression
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("A method that does return a value, defines the ");
        System.out.println("return \"type\" in the method signature and ");
        System.out.print("the keyword \"return\" somewhere in the method ");
        System.out.println("body (at least once). When calling a return ");
        System.out.print("method, the value returned must be stored (in ");
        System.out.println("a variable) or used as part of an expression.");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,6);
        // 2.6 String Objects: Concatenation, Literals, and More
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
        
        System.out.print("The \"String\" class allows you to create ");
        System.out.println("String variables, concatenate them (join) ");
        System.out.print("together and use \"built-in\" methods of the ");
        System.out.println("String class. String literals (contained in ");
        System.out.print("quotes \"\") can be assigned to String variables ");
        System.out.println("or concatenated with Strings. String methods ");
        System.out.print("do not change the String (\"immutable\") object. ");
        System.out.println("The \"+\" or the \"+=\" operators can be used ");
        System.out.print("to concatenate Strings (resulting in a new ");
        System.out.println("String object). Primitives (like int, double, ");
        System.out.print("etc.) can also be concatenated with String ");
        System.out.println("objects. Those are now automatically converted ");
        System.out.print("to Strings and then concatenated. Escape ");
        System.out.println("sequences is the character \"\\\" followed ");
        System.out.print("by another character to make certain outputs ");
        System.out.println("or changes to a String object. These include: ");
        System.out.print("\\\" for a quote, \\\\ for a slash, and \\n ");
        System.out.println("for a new line.");
        
        // Examples of Strings and escape sequences
        String str1 = "cat";
        String str2 = str1 + "ty";
        str1 += str2;
        str2 = "\n" + str1 + "\\" + "\" dog";
        
        Simulator.comment("Examples of Strings and escape sequences");
        Simulator.code("String str1 = \"cat\";");    
        Simulator.code("String str2 = str1 + \"ty\";");    
        Simulator.code("str1 += str2;");    
        Simulator.code("str2 = \"\\n\" + str1 + \"\\\\\" + \"\\\" dog\";");    
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,7);
        // 2.7 String Methods
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
        
        System.out.print("The \"API\" or Application Program Interface is ");
        System.out.println("a \"library\" of code that could be imported ");
        System.out.print("into a Java project or it could automatically ");
        System.out.println("be part of every Java project without needing ");
        System.out.print("an import. Classes and libraries are organized ");
        System.out.println("into \"packages\" in Java (also known as ");
        System.out.print("\"namespaces\"). The String class is in the ");
        System.out.println("\"java.lang\" package. Strings are collections ");
        System.out.print("of \"char\" values index from 0 up to the ");
        System.out.println("length of the String minus 1 (just like arrays ");
        System.out.print("are indexed). String methods used are: the ");
        System.out.println("String constructor \"String s = new String();\", ");
        System.out.print("the \"length()\" method, the \"substring(int)\" ");
        System.out.println("and \"substring(int,int)\" methods, the ");
        System.out.print("\"indexOf(String)\" method, the ");
        System.out.println("\"equals(String)\" method, and the ");
        System.out.println("\"compareTo(String)\" method.");
        
        // Examples of String methods
        String str3 = new String("chatty"); 
        // Constructs object with same sequence of characters as str3
        int length = str3.length();
        // Returns the number of characters in a String object
        String str4 = str3.substring(1);
        // Returns substring(from) starting at index "from" to the end
        String str5 = str3.substring(1,3);
        // Returns substring(from, to) starting at index "from" to index "to"
        int index = str3.indexOf("hat");
        // Returns the index of the first occurrence (returns -1 if not found)
        boolean result1 = str3.equals(str4);
        // Returns true if this is equal to other (returns false otherwise)
        int result2 = str3.compareTo(str5);
        // Returns value < 0 if less than other, returns 0 if equal to other, 
        // and returns value > 0 if greater than other 
        
        Simulator.comment("Examples of String methods");
        Simulator.code("String str3 = new String(\"chatty\");");   
        Simulator.comment("Constructs object with same sequence of characters as str3");
        Simulator.code("int length = str3.length();");   
        Simulator.comment("Returns the number of characters in a String object");
        Simulator.code("String str4 = str3.substring(1);");   
        Simulator.comment("Returns substring(from) starting at index \"from\" to the end");
        Simulator.code("String str5 = str3.substring(1,3);");   
        Simulator.comment("Returns substring(from, to) starting at index \"from\" to index \"to\"");
        Simulator.code("int index = str3.indexOf(\"hat\");");   
        Simulator.comment("Returns the index of the first occurrence (returns -1 if not found)");
        Simulator.code("boolean result1 = str3.equals(str4);");   
        Simulator.comment("Returns true if this is equal to other (returns false otherwise)");
        Simulator.code("int result2 = str3.compareTo(str5);");   
        Simulator.comment("Returns value < 0 if less than other, returns 0 if equal to other,");   
        Simulator.comment("and returns value > 0 if greater than other");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,8);
        // 2.8 Wrapper Classes: Integer and Double
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
        
        System.out.print("A \"wrapper class\" is a class type that is based ");
        System.out.println("in a primitive data type. For example the ");
        System.out.print("primitive data type \"int\" has the wrapper ");
        System.out.println("class \"Integer\". Similarily, the \"Double\" ");
        System.out.print("wrapper class, wraps around the \"double\" ");
        System.out.println("primitive type. The wrapper classes (using a ");
        System.out.print("capital letter) are part of java.lang and have ");
        System.out.println("built-in methods like \"parseInt()\" and ");
        System.out.print("\"parseDouble()\". Other methods include: ");
        System.out.println("\"Integer(int)\" a constructor, ");
        System.out.print("\"Double(double)\" a constructor, \"MIN_VALUE\" ");
        System.out.println("a constant, \"MAX_VALUE\", \"intValue()\", and ");
        System.out.print("\"doubleValue()\". Boxing and unboxing can be ");
        System.out.println("done between the wrapper classes and the ");
        System.out.print("primitive types (known as \"autoboxing\"). The ");
        System.out.println("term \"boxing\" means the conversion between ");
        System.out.print("primitive types and corresponding wrapper. ");
        System.out.println("The term \"unboxing\" means the conversion ");
        System.out.println("from the wrapper class to the primitive type.");
                
        // Example of wrapper classes and methods...
        int     integerPrimitive1 = Integer.parseInt("10");
        double  doublePrimitive1  = Double.parseDouble("1.2");
        Integer integerObject1    = new Integer("10");
        Double  doubleObject1     = new Double("1.2");
        int     integerPrimitive2 = integerObject1.intValue();
        double  doublePrimitive2  = doubleObject1.doubleValue();
        int     minInteger        = Integer.MIN_VALUE;
        int     maxInteger        = Integer.MAX_VALUE;
        double  minDouble         = Double.MIN_VALUE;
        double  maxDouble         = Double.MAX_VALUE;
        // Boxing and unboxing...
        int     integerPrimitive3 = integerObject1;
        double  doublePrimitive3  = doubleObject1;
        Integer integerObject2    = integerPrimitive3;
        Double  doubleObject2     = doublePrimitive3;
        
        Simulator.comment("Example of wrapper classes and methods...");
        Simulator.code("int     integerPrimitive1 = Integer.parseInt(\"10\");");
        Simulator.code("double  doublePrimitive1  = Double.parseDouble(\"1.2\");");
        Simulator.code("Integer integerObject     = new Integer(\"10\");");
        Simulator.code("Double  doubleObject      = new Double(\"1.2\");");
        Simulator.code("int     integerPrimitive2 = integerObject.intValue();");
        Simulator.code("double  doublePrimitive2  = doubleObject.doubleValue();");
        Simulator.code("int     minInteger        = Integer.MIN_VALUE;");
        Simulator.code("int     maxInteger        = Integer.MAX_VALUE;");
        Simulator.code("double  minDouble         = Double.MIN_VALUE;");
        Simulator.code("double  maxDouble         = Double.MAX_VALUE;"); 
        Simulator.comment("Boxing and unboxing...");
        Simulator.code("int     integerPrimitive3 = integerObject1;"); 
        Simulator.code("double  doublePrimitive3  = doubleObject1;"); 
        Simulator.code("Integer integerObject2    = integerPrimitive3;"); 
        Simulator.code("Double  doubleObject2     = doublePrimitive3;"); 
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(2,9);
        // 2.9 Using the Math Class
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
        
        System.out.print("The \"Math\" class is part of the java.lang ");
        System.out.println("package and has built-in static methods that can ");
        System.out.print("be called. Useful methods include: abs, pow, ");
        System.out.println("sqrt, and random. Including manipulating the ");
        System.out.print("random method in a formula to define random ");
        System.out.println("numbers in a range. Examples of this follow...");
        
        // Examples of the Math class methods and randoms...
        int    value1 = Math.abs(-1);
        double value2 = Math.abs(-1.2);
        double value3 = Math.pow(2,3);
        double value4 = Math.sqrt(9);
        double value5 = Math.random();
        final double HIGH = 10.9d;
        final double LOW  = 5.5d;
        double value6 = (HIGH - LOW + 1.0d) * Math.random() + LOW;
        
        Simulator.comment("Examples of the Math class methods and randoms...");
        Simulator.code("int    value1 = Math.abs(-1);");
        Simulator.code("double value2 = Math.abs(-1.2);");
        Simulator.code("double value3 = Math.pow(2,3);");
        Simulator.code("double value4 = Math.sqrt(9);");
        Simulator.code("double value5 = Math.random();");
        Simulator.code("final double HIGH = 10.9d;");
        Simulator.code("final double LOW  = 5.5d;");
        Simulator.code("double value6 = (HIGH - LOW + 1.0d) * Math.random() + LOW;");   
        
        ////////////////////////////////////////////////////////////////////////
    }
    
}