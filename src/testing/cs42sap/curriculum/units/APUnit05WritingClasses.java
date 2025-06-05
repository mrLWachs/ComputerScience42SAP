
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;
 
 
/**
 * APUnit05WritingClasses.java - This unit will pull together information from 
 * all previous units to create new, user-defined reference data types in the 
 * form of classes. The ability to accurately model real-world entities in a 
 * computer program is a large part of what makes computer science so 
 * powerful. This unit focuses on identifying appropriate behaviors and 
 * attributes of real-world entities and organizing these into classes. 
 * Students will build on what they learn in this unit to represent 
 * relationships between classes through hierarchies, which appear in Unit 9. 
 * The creation of computer programs can have extensive impacts on societies, 
 * economies, and cultures. The legal and ethical concerns that come with 
 * programs and the  responsibilities of programmers are also addressed in 
 * this unit.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:14:04 PM
 */
public class APUnit05WritingClasses 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public APUnit05WritingClasses(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP: Unit 5 (Writing Classes) not running");
            return;
        }
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5);
        // AP: Unit 5 (Writing Classes)
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,1);
        // 5.1 Anatomy of a Class
        // (5.1.1) Designate access and visibility constraints to classes, 
        //         data, constructors, and methods
            // (5.1.1.1) The keywords public and private affect the access of
            //           classes, data,  constructors, and methods
            // (5.1.1.2) The keyword private restricts access to the 
            //           declaring class, while the keyword public allows 
            //           access from classes outside the declaring class
            // (5.1.1.3) Classes are designated public
            // (5.1.1.4) Access to attributes should be kept internal to the
            //           class. Therefore, instance variables are designated 
            //           as private
            // (5.1.1.5) Constructors are designated public
            // (5.1.1.6) Access to behaviors can be internal or external to 
            //           the class. Therefore, methods can be designated as 
            //           either public or private
        // (5.1.2) Designate private visibility of instance variables to 
        //         encapsulate the attributes of an object
            // (5.1.2.1) Data encapsulation is a technique in which the 
            //           implementation details of a class are kept hidden
            //           from the user
            // (5.1.2.2) When designing a class, programmers make decisions 
            //           about what data to make accessible and modifiable 
            //           from an external class. Data can be either accessible
            //           or modifiable, or it can be both or neithe
            // (5.1.2.3) Instance variables are encapsulated by using the 
            //           private access modifier
            // (5.1.2.4) The provided accessor and mutator methods in a class
            //           allow client code to use and modify data
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The properties (attributes) and methods (actions) ");
        System.out.println("of a class can be defined in terms of ");
        System.out.print("visibility. This means that the keywords ");
        System.out.println("\"public\" and \"private\" can be used as a ");
        System.out.print("modifier in the front of a method signature or at ");
        System.out.println("the front of a property declaration line ");
        System.out.print("to define the encapsulation level. The public ");
        System.out.println("keyword means the property can be accessed (and ");
        System.out.print("modified) both inside the class and from other ");
        System.out.println("classes outside the class. In terms of methods ");
        System.out.print("it means the method can be called within the ");
        System.out.println("class (by other methods) and outside the class ");
        System.out.print("from other classes using the dot \".\" ");
        System.out.println("operator. Classes and constructor methods are ");
        System.out.print("designated public. The concept of \"encapsulation\" ");
        System.out.println("is used to make certain data and actions ");
        System.out.print("private and protect them from outside classes and ");
        System.out.println("perhaps only allow access through accessor ");
        System.out.println("and modifier (\"getter\" and \"setter\") methods.");
        
        // Class example private/public properties and methods
        // class Apple {            
        //     public int number;
        //     private double price;            
        //     public void eat() {
        //         // logic here
        //     }            
        //     private void spoil() {
        //         // logic here
        //     }            
        // }
        
        Simulator.comment("Class example private/public properties and methods");
        Simulator.code("class Apple { ");
        Simulator.code("    public int number;");
        Simulator.code("    private double price;");
        Simulator.code("    public void eat() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("    private void spoil() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,2);
        // 5.2 Constructors
        // (5.2.1) Define instance variables for the attributes to be 
        //         initialized through the constructors of a class
            // (5.2.1.1) An object’s state refers to its attributes and their 
            //           values at a given time and is defined by instance 
            //           variables belonging to the object. This creates a 
            //           "has-a" relationship between the object and its 
            //           instance variables
            // (5.2.1.2) Constructors are used to set the initial state of an 
            //           object, which should include initial values for all 
            //           instance variables
            // (5.2.1.3) Constructor parameters are local variables to the 
            //           constructor and provide data to initialize instance 
            //           variables
            // (5.2.1.4) When a mutable object is a constructor parameter, the
            //           instance variable should be initialized with a copy 
            //           of the referenced object. In this way, the instance 
            //           variable is not an alias of the original object, and 
            //           methods are prevented from modifying the state of the
            //           original object
            // (5.2.1.5) When no constructor is written, Java provides a 
            //           no-argument constructor, and the instance variables 
            //           are set to default values
        ////////////////////////////////////////////////////////////////////////
                
        System.out.print("A constructor method is a special method defined ");
        System.out.println("in a class that is called when a class is ");
        System.out.print("instantiated into an instance (or \"object\") of ");
        System.out.println("that class. The constructor method has to have ");
        System.out.print("the exact same name as the class (including ");
        System.out.println("letter case) and no return type (not even the ");
        System.out.print("word void). Constructors are usually used to set ");
        System.out.println("the initial (or \"default\") values for the ");
        System.out.print("class properties. This can be said to be setting ");
        System.out.println("the \"state\" of the object. If any of the ");
        System.out.print("properties (attributes) are another class level ");
        System.out.println("instance variable (not a primitive type), ");
        System.out.print("then this class is said to have a \"has-a\" ");
        System.out.println("relationship with that class. This can also be ");
        System.out.print("called \"association\" or \"composition\" ");
        System.out.println("between the classes. Constructors can have ");
        System.out.print("parameters passed to the class that can be used ");
        System.out.println("in setting the initial state. When no ");
        System.out.print("constructor is written, Java provides a ");
        System.out.println("no-argument constructor, and the instance ");
        System.out.println("variables are set to default values.");
        
        // Class example association and constructors
        // class Basket {            
        //     public Apple apple;            
        //     public Basket() {
        //         // logic here
        //     }            
        //     public Basket(Apple apple) {
        //         // logic here
        //     }            
        // }
        
        Simulator.comment("Class example association and constructors");
        Simulator.code("class Basket {");
        Simulator.code("    public Apple apple;");
        Simulator.code("    public Basket() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("    public Basket(Apple apple) {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("}");         
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,3);
        // 5.3 Documentation with Comments  
        // (5.3.1) Describe the functionality and use of program code through 
        //         comments
            // (5.3.1.1) Comments are ignored by the compiler and are not 
            //           executed when the program is run
            // (5.3.1.2) Three types of comments in Java include /* */, which 
            //           generates a block of comments, //, which generates a 
            //           comment on one line, and /** */, which are Javadoc 
            //           comments and are used to create API documentation
            // (5.3.1.3) A precondition is a condition that must be true just 
            //           prior to the execution of a section of program code 
            //           in order for the method to behave as expected. There 
            //           is no expectation that the method will check to 
            //           ensure preconditions are satisfied
            // (5.3.1.4) A postcondition is a condition that must always be 
            //           true after the execution of a section of program 
            //           code. Postconditions describe the outcome of the 
            //           execution in terms of what is being returned or the 
            //           state of an object
            // (5.3.1.5) Programmers write method code to satisfy the 
            //           postconditions when preconditions are met          
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Comments are a documentation system that allows ");
        System.out.println("programmers to leave notes for themselves or ");
        System.out.print("other programmers. This can serve several ");
        System.out.println("purposes including (but not limited to) ");
        System.out.print("documenting names and dates, explaining code ");
        System.out.println("logic, working through problem solving logic, ");
        System.out.print("and others. In Java, the two forward slashes // ");
        System.out.println("allows a comment at the end of a line of code or ");
        System.out.print("on its own line. A slash and a star /* opens a ");
        System.out.println("comment block which will continue until a star ");
        System.out.print("and slash */ closes the comment block. The slash ");
        System.out.println("and two stars /** open the JavaDoc style of ");
        System.out.print("comment block which many IDEs (e.g. NetBeans) ");
        System.out.println("recognize and help with commenting and to create ");
        System.out.print("API documentation. Methods should be commented ");
        System.out.println("with the method's purpose (a brief description), ");
        System.out.print("any pre-conditions (the parameters if any), and ");
        System.out.println("post-conditions (the return type if any) of the ");
        System.out.println("method.");
        
        Simulator.comment("Comments...");
        Simulator.code("// a standard comment");
        Simulator.code("/* opens a comment block */");
        Simulator.code("/** JavaDoc comment block */");
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,4);
        // 5.4 Accessor Methods
        // (5.4.1) Define behaviors of an object through non-void methods 
        //         without parameters written in a class
            // (5.4.1.1) An accessor method allows other objects to obtain the
            //           value of instance variables or static variables
            // (5.4.1.2) A non-void method returns a single value. Its header 
            //           includes the return type in place of the keyword void
            // (5.4.1.3) In non-void methods, a return expression compatible 
            //           with the return type is evaluated, and a copy of that
            //           value is returned. This is referred to as "return by
            //           value." 
            // (5.4.1.4) When the return expression is a reference to an 
            //           object, a copy of that reference is returned, not a 
            //           copy of the object
            // (5.4.1.5) The return keyword is used to return the flow of 
            //           control to the point immediately following where the
            //           method or constructor was called
            // (5.4.1.6) The toString method is an overridden method that is 
            //           included in classes to provide a description of a 
            //           specific object. It generally includes what values 
            //           are stored in the instance data of the object
            // (5.4.1.7) If System.out.print or System.out. println is passed
            //           an object, that object’s toString method is called, 
            //           and the returned string is printed
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Accessor methods are the names given to methods ");
        System.out.println("in a class that \"access\" data. this usually ");
        System.out.print("means properties of the class that are ");
        System.out.println("encapsulated (private). Other names for ");
        System.out.print("accessors are \"getters\" or \"get\" methods. ");
        System.out.println("The method (behaviours, actions, functions, ");
        System.out.print("procedures) of a class are accessed with the ");
        System.out.println("dot operator (\".\") after the name of the ");
        System.out.print("object (instance of the class). Non-void ");
        System.out.println("methods that return a value can then be used as ");
        System.out.print("part of a code line expression. The return ");
        System.out.println("type of the method must be compatible with any ");
        System.out.print("data types (e.g. variables) being used in the ");
        System.out.println("expression. If the return type is a class level ");
        System.out.print("type then the method returns a reference to ");
        System.out.println("the actual object (\"return by reference\") not a ");
        System.out.print("reference to a copy (\"return by value\") of ");
        System.out.println("the actual object. If the \"System.out.print\" ");
        System.out.print("or \"System.out.println\" methods are called ");
        System.out.println("and an object is passed to those methods, the ");
        System.out.println("object's \"toString()\" method is automatically ");
        System.out.println("invoked (called) in the output.");
        
        // Examples of calling accessor methods in a class
        // class Fighter {
        //     private int health;
        //     private Weapon weapon;            
        //     public int getHealth() {
        //         return health;
        //     }
        //     public Weapon getWeapon() {
        //         return weapon;
        //     }
        // }
        // 
        // Fighter fighter = new Fighter();
        // int hp = fighter.health;
        // Weapon club = fighter.getWeapon();
            
        Simulator.comment("Examples of calling methods in a class");
        Simulator.code("class Fighter {");
        Simulator.code("    private int health;");
        Simulator.code("    private Weapon weapon;");
        Simulator.code("    public int getHealth() {");
        Simulator.code("        return health;");
        Simulator.code("    }");
        Simulator.code("    public Weapon getWeapon() {");
        Simulator.code("        return weapon;");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("");
        Simulator.code("Fighter fighter = new Fighter();");
        Simulator.code("int hp = fighter.health;");
        Simulator.code("Weapon club = fighter.getWeapon();");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,5);
        // 5.5 Mutator Methods
        // (5.5.1) Define behaviors of an object through void methods with or 
        //         without parameters written in a class
            // (5.5.1.1) A void method does not return a value. Its header 
            //           contains the keyword void before the method name
            // (5.5.1.2) A mutator (modifier) method is often a void method 
            //           that changes the values of instance variables or 
            //           static variables
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Mutator methods are the name given to methods ");
        System.out.println("that \"change\" a property of a class (usually ");
        System.out.print("an encapsulated property). These can be void ");
        System.out.println("methods (but are sometimes boolean methods to ");
        System.out.println("indicate success or not).");
        
        // Examples of calling mutator methods in a class
        // class Fighter {
        //     private int health;            
        //     public int setHealth(int health) {
        //         this.health = health;
        //     }
        // }
        // Fighter fighter = new Fighter();
        // fighter.setHealth(10);
        
        Simulator.comment("Examples of calling mutator methods in a class");
        Simulator.code("class Fighter {");
        Simulator.code("    private int health;");
        Simulator.code("    public int setHealth(int health) {");
        Simulator.code("        this.health = health;");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("Fighter fighter = new Fighter();");
        Simulator.code("fighter.setHealth(10);");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,6);
        // 5.6 Writing Methods
        // (5.6.1) Define behaviors of an object through non-void methods 
        //         with parameters written in a class
            // (5.6.1.1) Methods can only access the private data and methods 
            //           of a parameter that is a reference to an object when
            //           the parameter is the same type as the method’s 
            //           enclosing class
            // (5.6.1.2) Non-void methods with parameters receive values 
            //           through parameters, use those values, and return a 
            //           computed value of the specified type
            // (5.6.1.3) It is good programming practice to not modify mutable
            //           objects that are passed as parameters unless required
            //           in the specification
            // (5.6.1.4) When an actual parameter is a primitive value, the 
            //           formal parameter is initialized with a copy of that 
            //           value. Changes to the formal parameter have no effect
            //           on the corresponding actual parameter
            // (5.6.1.5) When an actual parameter is a reference to an object,
            //           the formal parameter is initialized with a copy of 
            //           that reference, not a copy of the object. If the 
            //           reference is to a mutable object, the method or 
            //           constructor can use this reference to alter the state
            //           of the object
            // (5.6.1.6) Passing a reference parameter results in the formal 
            //           parameter and the actual parameter being aliases. 
            //           They both refer to the same object
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Methods are written to model an \"action\". Also ");
        System.out.println("known as functions or procedures, methods may ");
        System.out.print("or may not have zero, one, or more than one ");
        System.out.println("\"input(s)\" called \"parameters\" (or empty round ");
        System.out.print("brackets if no inputs are required). Methods may ");
        System.out.println("have zero (a \"void\" method) or one \"output\" ");
        System.out.print("known as the return type. If the parameter is a ");
        System.out.println("primitive data type, then a copy of the data ");
        System.out.print("from the original primitive type is passed to ");
        System.out.println("the method (\"pass by value\"). If the parameter ");
        System.out.print("is an advanced data type (\"class\" level data) ");
        System.out.println("then a reference to that object is passed. This ");
        System.out.print("means that any changes the method makes to the ");
        System.out.println("object will be reflected (unless the object ");
        System.out.print("was an immutable object). Because the passed ");
        System.out.println("reference object parameter and the original ");
        System.out.print("argument object are \"linked\" they can be ");
        System.out.println("referred to as \"aliases\".");

        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,7);
        // 5.7 Static Variables and Methods
        // (5.7.1) Define behaviors of a class through static methods
            // (5.7.1.1) Static methods are associated with the class, not 
            //           objects of the class
            // (5.7.1.2) Static methods include the keyword static in the 
            //           header before the method name
            // (5.7.1.3) Static methods cannot access or change the values of 
            //           instance variables
            // (5.7.1.4) Static methods can access or change the values of 
            //           static variables
            // (5.7.1.5) Static methods do not have a this reference and are 
            //           unable to use the class’s instance variables or call
            //           non-static methods
        // (5.7.2) Define the static variables that belong to the class
            // (5.7.2.1) Static variables belong to the class, with all objects
            //           of a class sharing a single static variable
            // (5.7.2.2) Static variables can be designated as either public
            //           or private and are designated with the static keyword
            //           before the variable type
            // (5.7.2.3) Static variables are used with the class name and the
            //           dot operator, since they are associated with a class,
            //           not objects of a class
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Although they can be called from an object of a ");
        System.out.println("class, \"static\" methods are generally called ");
        System.out.print("from the class name itself. Static methods ");
        System.out.println("\"belong\" to the class itself and therefore ");
        System.out.print("do not require you to instantiate an object to ");
        System.out.println("call a method from that class. The keyword ");
        System.out.print("\"static\" is included as a modifier word in ");
        System.out.println("the method signature line. Static methods ");
        System.out.print("cannot access or change the values of instance ");
        System.out.println("properties of a class but can change/access ");
        System.out.print("static properties. Static properties ");
        System.out.println("(variables) also \"belong\" to the class itself ");
        System.out.print("and are \"shared\" by all objects of the class. ");
        System.out.println("Static properties can be either public or ");
        System.out.print("private and are also declared using the ");
        System.out.println("\"static\" keyword as a modifier for the ");
        System.out.print("property. Static properties are used with the ");
        System.out.println("class name and then the dot operator and then ");
        System.out.print("the name of the property (although they can ");
        System.out.println("also be accessed from an object name). ");
        
        // Static properties and methods
        // class Fighter {
        //     public static int number;
        //     public static void attack() {
        //         // logic here
        //     }
        // }
        // Fighter.number = 10;
        // Fighter.attack();
                
        Simulator.comment("Static properties and methods");
        Simulator.code("class Fighter {");
        Simulator.code("    public static int number;");
        Simulator.code("    public static void attack() {");
        Simulator.code("        // logic here");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("Fighter.number = 10;");
        Simulator.code("Fighter.attack();");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,8);
        // 5.8 Scope and Access
        // (5.8.1) Explain where variables can be used in the program code
            // (5.8.1.1) Local variables can be declared in the body of 
            //           constructors and methods. These variables may only be
            //           used within the constructor or method and cannot be 
            //           declared to be public or private
            // (5.8.1.2) When there is a local variable with the same name as
            //           an instance variable, the variable name will refer to
            //           the local variable instead of the instance variable
            // (5.8.1.3) Formal parameters and variables declared in a method
            //           or constructor can only be used within that method or 
            //           constructor
            // (5.8.1.4) Through method decomposition, a programmer breaks 
            //           down a large problem into smaller subproblems by 
            //           creating methods to solve each individual subproblem
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Variables can be used throughout code in classes ");
        System.out.println("and methods and have a \"scope\" defining where ");
        System.out.print("the variable can be accessed and modified. A ");
        System.out.println("\"local\" variable is one which is defined in a ");
        System.out.print("code block like a control structure (a loop or ");
        System.out.println("if statement) or a method. The scope of that ");
        System.out.print("variable is that internal code block and no ");
        System.out.println("other variables can have the same name within ");
        System.out.print("that scope. A \"global\" variable is one ");
        System.out.println("declared at the class level and its scope is ");
        System.out.print("the entire code module (class). When there is ");
        System.out.println("a local variable with the same name as a global ");
        System.out.print("variable, the variable name will reference the ");
        System.out.println("local variable over the global variable. This ");
        System.out.print("could be a potential name conflict. The keyword ");
        System.out.println("\"this\" with the dot operator can make an ");
        System.out.print("explicit reference to the global variable over ");
        System.out.println("the local variable. ");
        
        // Local and global variable scopes
        // class Fighter {
        //     public int number;
        //     public void attack(int number) {
        //         this.number = number;
        //     }
        // }
        
        Simulator.comment("Local and global variable scopes");
        Simulator.code("class Fighter {");
        Simulator.code("    public int number;");
        Simulator.code("    public void attack(int number) {");
        Simulator.code("        this.number = number;");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,9);
        // 5.9 this Keyword
        // (5.9.1) Evaluate object reference expressions that use the keyword
        //         this
            // (5.9.1.1) Within a non-static method or a constructor, the 
            //           keyword this is a reference to the current object 
            //           the object whose method or constructor is being called
            // (5.9.1.2) The keyword this can be used to pass the current 
            //           object as an actual parameter in a method call
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The keyword \"this\" is an explicit reference ");
        System.out.println("to the (eventual) object within a class. It ");
        System.out.print("refers to the name of an object that will later ");
        System.out.println("be instantiated by the class the word this ");
        System.out.print("is used within. The word \"this\" can be used to ");
        System.out.println("give explicit control to a global variable ");
        System.out.print("or call a class method. The keyword \"this\" ");
        System.out.println("can also be used to pass the current object ");
        System.out.println("as an actual parameter in a method call.");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(5,10);
        // 5.10 Ethical and Social Implications of Computing Systems
        // (5.10.1) Explain the ethical and social implications of computing 
        //          systems
            // (5.10.1.1) System reliability is limited. Programmers should 
            //            make an effort to maximize system reliability
            // (5.10.1.2) Legal issues and intellectual property concerns 
            //            arise when creating programs
            // (5.10.1.3) The creation of programs has impacts on society, 
            //            economies, and culture. These impacts can be 
            //            beneficial and/or harmful
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The social and ethical considerations of ");
        System.out.println("computing and Computer Science are things as ");
        System.out.print("an A.P. student you should be aware of. These ");
        System.out.println("are not necessarily testable concepts on the ");
        System.out.print("A.P. exam. The general ideas of legality, ");
        System.out.println("impact, and reliability of computing systems ");
        System.out.print("and software should always be considered by ");
        System.out.println("programers and Computer Scientists.");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}