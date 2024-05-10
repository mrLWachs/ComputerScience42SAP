
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;
 
 
/**
 * APUnit09Inheritance.java - Creating objects, calling methods on the objects
 * created, and being able to define a new data type by creating a class are
 * essential understandings before moving into this unit. One of the strongest
 * advantages of Java is the ability to categorize classes into hierarchies 
 * through inheritance. Certain existing classes can be extended to include 
 * new behaviors and attributes without altering existing code. These newly 
 * created classes are called subclasses. In this unit, students will learn 
 * how to recognize common attributes and behaviors that can be used in a 
 * superclass and will then create a hierarchy by writing subclasses to extend
 * a superclass. Recognizing and utilizing existing hierarchies will help 
 * students create more readable and maintainable programs.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:14:15 PM
 */
public class APUnit09Inheritance 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit09Inheritance(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 9 (Inheritance) not running");
            return;
        }
        
        Simulator.title("AP: Unit 9 (Inheritance)");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.1 Creating Superclasses and Subclasses");  
        // (9.1.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.1.1.1) A class hierarchy can be developed by putting common 
            //           attributes and behaviors of related classes into a 
            //           single class called a superclass
            // (9.1.1.2) Classes that extend a superclass, called subclasses,
            //           can draw upon the existing attributes and behaviors 
            //           of the superclass without repeating these in the code
            // (9.1.1.3) Extending a subclass from a superclass creates an 
            //           "is-a" relationship from the subclass to the superclass
            // (9.1.1.4) The keyword extends is used to establish an 
            //           inheritance relationship between a subclass and a 
            //           superclass. A class can extend only one superclass
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("When working with the relationships between ");
        System.out.println("classes, inheritance is the relationship whereas ");
        System.out.print("one class inherits the properties and methods ");
        System.out.println("from another class. This means one class acts ");
        System.out.print("as the \"parent\" or \"super\" class and the ");
        System.out.println("other class acts as the \"child\" or \"sub\" ");
        System.out.print("class. In Java the keyword \"extends\" is ");
        System.out.println("used to initiate inheritance by putting that ");
        System.out.print("keyword in the class signature line. This is ");
        System.out.println("also called a \"is-a\" relationship between ");
        System.out.print("classes. In other words, a child (sub) class ");
        System.out.println("\"is-a\" parent (super) class. A class can ");
        System.out.println("extend only one superclass.");
        
        // Example of class inheritance...
        // class Parent {
        //     String name;
        // }

        // class Child extends Parent {        
        //     int age;
        // }
        
        Simulator.comment("Example of class inheritance");
        Simulator.code("class Parent {");
        Simulator.code("    String name;");
        Simulator.code("}");
        Simulator.code("");
        Simulator.code("class Child extends Parent {");
        Simulator.code("    int age;");
        Simulator.code("}");      
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.2 Writing Constructors for Subclasses");  
        // (9.2.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.2.1.1) Constructors are not inherited
            // (9.2.1.2) The superclass constructor can be called from the 
            //           first line of a subclass constructor by using the 
            //           keyword super and passing appropriate parameters
            // (9.2.1.3) The actual parameters passed in the call to the 
            //           superclass constructor provide values that the 
            //           constructor can use to initialize the object’s 
            //           instance variables
            // (9.2.1.4) When a subclass’s constructor does not explicitly 
            //           call a superclass’s constructor using super, Java 
            //           inserts a call to the superclass’s no-argument 
            //           constructor
            // (9.2.1.5) Regardless of whether the superclass constructor is 
            //           called implicitly or explicitly, the process of 
            //           calling superclass constructors continues until the 
            //           Object constructor is called. At this  point, all of 
            //           the constructors within the hierarchy execute 
            //           beginning with the Object constructor
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Constructor methods are not inherited by ");
        System.out.println("subclasses from the superclass. However, you ");
        System.out.print("can call the constructor of a superclass using ");
        System.out.println("the keyword \"super()\" and round brackets. ");
        System.out.print("This is called a call to the super-constructor. ");
        System.out.println("This call can also include any parameters the ");
        System.out.print("constructor/super-constructor needs. This can ");
        System.out.println("occur over multiple \"levels\" of inheritance ");
        System.out.print("between classes. When a subclass’s constructor ");
        System.out.println("does not explicitly call a superclass’s ");
        System.out.print("constructor, Java will call the ");
        System.out.println("super-constructor method.");
                
        // Example class constructors and super-constructors...
        // class Parent {
        //     String name;
        //     public Parent() {
        //          name = "";
        //     }
        // }

        // class Child extends Parent {        
        //     int age;
        //     public Child() {
        //          super();
        //          age = 0;
        //     }
        // }
                
        Simulator.comment("Example class constructors and super-constructors");
        Simulator.code("class Parent {");
        Simulator.code("    String name;");
        Simulator.code("    public Parent() {");
        Simulator.code("         name = \"\";");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("");
        Simulator.code("class Child extends Parent {");
        Simulator.code("    int age;");
        Simulator.code("    public Child() {");
        Simulator.code("         super();");
        Simulator.code("         age = 0;");
        Simulator.code("    }");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.3 Overriding Methods");  
        // (9.3.1) Create an inheritance relationship from a subclass to the 
        //         superclass
            // (9.3.1.1) Method overriding occurs when a public method in a 
            //           subclass has the same method signature as a public 
            //           method in the superclass
            // (9.3.1.2) Any method that is called must be defined within its
            //           own class or its superclass
            // (9.3.1.3) A subclass is usually designed to have modified 
            //           (overridden) or additional methods or instance 
            //           variables
            // (9.3.1.4) A subclass will inherit all public methods from the 
            //           superclass; these methods remain public in the subclass
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("When you have one class inheriting from another ");
        System.out.println("class (parent and child classes), method ");
        System.out.print("overriding can occur. A method is an override ");
        System.out.println("method if it has the same method signature ");
        System.out.print("(meaning the same name, return type, and ");
        System.out.println("possible parameters) as a method (a public ");
        System.out.print("method) in the superclass. When this method ");
        System.out.println("is called from the child class, then this ");
        System.out.print("method \"over-rides\" the method it inherited ");
        System.out.println("from its parent class. You can still call ");
        System.out.print("the originally inherited method from inside ");
        System.out.println("the override emthod by using the line ");
        System.out.print("of code \"super.methodName()\" with the ");
        System.out.println("\"methodName\" and any parameters/return ");
        System.out.println("values also being used.");
        
        Simulator.comment("Example of override methods");
        Simulator.code("class Parent {");
        Simulator.code("    public void talk() {");
        Simulator.code("        // code here...");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("");
        Simulator.code("class Child extends Parent ");
        Simulator.code("    // the override method");
        Simulator.code("    public void talk() {");
        Simulator.code("        // Calling the super class method");
        Simulator.code("        super.talk();");
        Simulator.code("        // code here...");
        Simulator.code("    }");
        Simulator.code("}");
                
        // Example of override methods...
        // class Parent {
        //     public void talk() {
        //         // code here...
        //     }
        // }

        // class Child extends Parent {
        //     // the override method
        //     public void talk() {
        //         // Calling the super class method
        //         super.talk();
        //         // code here...
        //     }
        // }
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.4 super Keyword");  
        // (9.4.1) Create an inheritance relationship from a subclass to the superclass
            // (9.4.1.1) The keyword super can be used to call a superclass's 
            //           constructors and methods
            // (9.4.1.2) The superclass method can be called in a subclass by 
            //           using the keyword super with the method name and 
            //           passing appropriate parameters
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The keyword \"super\" makes a reference to the ");
        System.out.println("\"super-class\" when you have an inheritance ");
        System.out.print("relationship between a parent and child class. ");
        System.out.println("By using the super keyword in a child class, ");
        System.out.print("you can call methods from the super class by ");
        System.out.println("typing \"super.methodName();\" or change ");
        System.out.print("properties (not encapsulated) for example: ");
        System.out.println("\"super.name = \"\";\" You can even call a ");
        System.out.print("super-constructor method from the super class, ");
        System.out.println("for example: \"super();\".");
        
        Simulator.comment("Example of super keyword");
        Simulator.code("class Parent {");
        Simulator.code("    int number;");
        Simulator.code("    public Parent() {");
        Simulator.code("        // code");
        Simulator.code("    }");
        Simulator.code("    public void action(int x) {");
        Simulator.code("        // code");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("");
        Simulator.code("class Child extends Parent {");
        Simulator.code("    public Child() {");
        Simulator.code("        super();");
        Simulator.code("    }");
        Simulator.code("    public void event() {");
        Simulator.code("        super.number = 5;");
        Simulator.code("        super.action(5);");
        Simulator.code("    }");
        Simulator.code("}");
        
    // class Parent {
    //     int number;
    //     public Parent() {
    //         // code
    //     }        
    //     public void action(int x) {
    //         // code
    //     }        
    // }
    // 
    // class Child extends Parent {
    //     public Child() {
    //         super();
    //     }
    //     public void event() {
    //         super.number = 5;
    //         super.action(5);
    //     } 
    // }
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.5 Creating References Using Inheritance Hierarchies");  
        // (9.5.1) Define reference variables of a superclass to be assigned to
        //         an object of a subclass in the same hierarchy
            // (9.5.1.1) When a class S “is-a” class T, T is referred to as a 
            //           superclass, and S is referred to as a subclass
            // (9.5.1.2) If S is a subclass of T, then assigning an object of 
            //           type S to a reference of type T facilitates 
            //           polymorphism
            // (9.5.1.3) If S is a subclass of T, then a reference of type T 
            //           can be used to refer to an object of type T or S
            // (9.5.1.4) Declaring references of type T, when S is a subclass 
            //           of T, is useful in the following declarations: 
            //           (a) Formal method parameters, 
            //           (b) arrays — T[] var ArrayList<T> var
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Simulator.comment("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        Simulator.code("");
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.6 Polymorphism");  
        // (9.6.1) Call methods in an inheritance relationship
            // (9.6.1.1) Utilize the Object class through inheritance
            // (9.6.1.2) At compile time, methods in or inherited by the 
            //           declared type determine the correctness of a 
            //           non-static method call
            // (9.6.1.3) At run-time, the method in the actual object type is 
            //           executed for a non-static method call
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("");
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.header("9.7 Object Superclass");  
        // (9.7.1) Call Object class methods through inheritance
            // (9.7.1.1) The Object class is the superclass of all other 
            //           classes in Java
            // (9.7.1.2) The Object class is part of the java.lang package
            // (9.7.1.3) The following Object class methods and 
            //           constructors—including what they do and when they are
            //           used—are part of the Java Quick Reference: 
            //           (a) boolean equals(Object other), (b) String toString()
            // (9.7.1.4) Subclasses of Object often override the equals and 
            //           toString methods with classspecific implementations
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("");
        Simulator.comment("");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
    }   
    
}