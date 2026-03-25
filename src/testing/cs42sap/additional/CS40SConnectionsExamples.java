/** Required package class namespace */
package testing.cs42sap.additional;

/** Required API imports */
import utility.io.Simulator;

/*
 * CS40SConnectionsExamples - This class is an example of how the content we 
 * learned in the Computer Science 40S course overlaps and connects with the
 * curriculum content (i.e. the content that will be on the AP exam) of the AP
 * Computer Science A course. Specifically any overlap in the recursion, 
 * advanced classes, and collections units.
 *  
 * DESCRIPTION:
 * ============
 * 
 * By going through the A.P. Computer Science A curriculum and the lessons that
 * Mr. Wachs taught in the recursion, advanced classes, and collections units - 
 * along with some A.I. assistance to parse through the content the following 
 * connections can be made. See: https://bit.ly/3ONCRCY for the AP curriculum.
 * 
 * Recursion:
 * ==========
 * Recursive Structure: Both courses define recursion as a method that calls 
 * itself. Base and Recursive Cases: Both curricula emphasize that a recursive 
 * method must have at least one base case to halt the recursion and one 
 * recursive case 
 * 
 * SPECIFICS FROM THE CURRICULUM....
 * 
 *   - 4.16.A.1 A recursive method is a method that calls itself. Recursive 
 *              methods contain at least one base case, which halts the 
 *              recursion, and at least one recursive call. Recursion is another 
 *              form of repetition.
 *   - 4.16.A.2 Each recursive call has its own set of local variables, 
 *              including the parameters. Parameter values capture the progress 
 *              of a recursive process, much like loop control variable values 
 *              capture the progress of a loop.
 *   - 4.16.A.3 Any recursive solution can be replicated through the use of an 
 *              iterative approach and vice versa.
 *
 * Advanced Classes:
 * =================
 * Anatomy of a Class: Both curricula define classes as blueprints containing 
 * attributes (properties/variables) and behaviors (methods). Encapsulation: 
 * Both courses teach the use of private and public access modifiers to enforce 
 * data hiding and encapsulation. Constructors: The use of constructors to 
 * initialize an object's state is a core concept in both courses. They both 
 * highlight overloaded constructors that differ by their parameter lists. 
 * Accessors and Mutators: Both curricula identify accessor methods (getters) 
 * for retrieving private data and mutator methods (setters) for modifying it. 
 * The static Keyword: Both courses utilize the static keyword for memory 
 * management, defining class variables and methods that belong to the class 
 * rather than individual instances. The this Keyword: Both courses use the 
 * this keyword as a reference to the current instance of an object. 
 * Inheritance: Both curricula cover the "is-a" relationship, where a subclass 
 * (child) inherits properties and methods from a superclass (parent). The 
 * Object Class: Both courses note that every class in Java automatically 
 * inherits from the built-in Object class. Method Overriding: Both courses 
 * teach students to override inherited methods, such as toString() and 
 * equals(), to provide class-specific functionality. Enhanced for Loop: The 
 * use of the for-each loop for traversing arrays or collections is featured in 
 * both courses. 
 * 
 * SPECIFICS FROM THE CURRICULUM....
 * 
 *   - 1.12.A.1 An object is a specific instance of a class with defined 
 *              attributes. A class is the formal implementation, or blueprint, 
 *              of the attributes and behaviors of an object. 
 *   - 1.12.A.2 A class hierarchy can be developed by putting common attributes 
 *              and behaviors of related classes into a single class called a 
 *              superclass. Classes that extend a superclass, called subclasses, 
 *              can draw upon the existing attributes and behaviors of the 
 *              superclass without replacing these in the code. This creates an 
 *              inheritance relationship from the subclasses to the superclass.
 *   - 1.12.A.3 All classes in Java are subclasses of the Object class. 
 *   - 1.13.A.2 A constructor signature consists of the constructor’s name, 
 *              which is the same as the class name, and the ordered list of 
 *              parameter types. The parameter list, in the header of a 
 *              constructor, lists the types of the values that are passed and 
 *              their variable names.
 *   - 1.13.A.3 Constructors are said to be overloaded when there are multiple 
 *              constructors with different signatures.
 *   - 3.3.A.1 Data encapsulation is a technique in which the implementation 
 *             details of a class are kept hidden from external classes. The 
 *             keywords public and private affect the access of classes, data, 
 *             constructors, and methods. The keyword private restricts access 
 *             to the declaring class, while the keyword public allows access 
 *             from classes outside the declaring class.
 *   - 3.4.A.1 An object’s state refers to its attributes and their values at a 
 *             given time and is defined by instance variables belonging to the 
 *             object. This defines a has-a relationship between the object and 
 *             its instance variables.
 *   - 3.4.A.4 When no constructor is written, Java provides a no-parameter 
 *             constructor, and the instance variables are set to default values 
 *             according to the data type of the attribute. This constructor is 
 *             called the default constructor.
 *   - 3.9.A.1 Within an instance method or a constructor, the keyword this acts 
 *             as a special variable that holds a reference to the current 
 *             object - the object whose method or constructor is being called.
 *   - 4.4.A.3 An enhanced for loop header includes a variable, referred to as 
 *             the enhanced for loop variable. For each iteration of the 
 *             enhanced for loop, the enhanced for loop variable is assigned a 
 *             copy of an element without using its index.
 *
 * Collections:
 * ============
 * ArrayLists: Both curricula introduce the ArrayList class from the Java 
 * Collections framework for managing dynamic data that can grow or shrink. 
 * Arrays: Both courses cover one-dimensional and two-dimensional arrays, 
 * focusing on creation, access, and traversal. Standard Algorithms: Both 
 * courses require implementing algorithms to find minimum/maximum values, 
 * calculate sums or averages, and search or sort data. Searching and Sorting: 
 * Specifically, both courses include linear search and common sorting methods 
 * like selection sort - which we will look at in detail in a upcoming example. 
 * 
 * SPECIFICS FROM THE CURRICULUM....
 * 
 *   - 4.8.A.1 An ArrayList object is mutable in size and contains object 
 *             references. 
 *   - 4.8.A.2 The ArrayList constructor ArrayList() constructs an empty list. 
 *   - 4.8.A.3 Java allows the generic type ArrayList<E>, where the type 
 *             parameter E specifies the type of the elements. When 
 *             ArrayList<E> is specified, the types of the reference parameters 
 *             and return type when using the ArrayList methods are type E. 
 *             ArrayList<E> is preferred over ArrayList. For example, 
 *             ArrayList<String> names = new ArrayList<String>(); allows the 
 *             compiler to find errors that would otherwise be found at run-time
 *   - 4.8.A.4 The ArrayList class is part of the java.util package. An import 
 *             statement must be used to make this class available for use in 
 *             the program.
 *   - 4.8.A.5 The following ArrayList methods - including what they do and when 
 *             they are used - are part of the Java Quick Reference: 
 *             int size(), boolean add(E obj), void add(int index, E obj), 
 *             E get(int index), E set(int index, E obj), E remove(int index)
 *             NOTE: These are covered in more detail in this example:
 *                   https://bit.ly/4uQE10W
 *   - 4.8.A.6 The indices for an ArrayList start at 0 and end at the number of 
 *             elements - 1.
 *   - 4.9.A.1 Traversing an ArrayList is when iteration or recursive statements 
 *             are used to access all or an ordered sequence of the elements in 
 *             an ArrayList.
 *   - 4.9.A.2 Deleting elements during a traversal of an ArrayList requires the 
 *             use of special techniques to avoid skipping elements.
 *   - 4.9.A.3 Attempting to access an index value outside of its range will 
 *             result in an IndexOutOfBoundsException.
 *   - 4.9.A.4 Changing the size of an ArrayList while traversing it using an 
 *             enhanced for loop can result in a 
 *             ConcurrentModificationException. Therefore, when using an 
 *             enhanced for loop to traverse an ArrayList, you should not add or 
 *             remove elements.
 * 
 * @author Mr. Wachs
 * @since Mar 24, 2026
*/
public class CS40SConnectionsExamples
{

    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting CS40S Connections Examples");
        new CS40SConnectionsExamples();
        Simulator.title("\nCompleted CS40S Connections Examples");
    }
    
    /**
     * Default constructor, set class properties
     */
    public CS40SConnectionsExamples() {  
        System.out.println("Learn about CS40S Connections....................");
        
        ////////////////////////////////////////////////////////////////////////
        // (1) RECURSION:
        ////////////////////////////////////////////////////////////////////////
        //
        // - A recursive method is a method that calls itself. Recursive 
        //   methods contain at least one base case, which halts the 
        //   recursion, and at least one recursive call. Recursion is another 
        //   form of repetition.
        // - Each recursive call has its own set of local variables, 
        //   including the parameters. Parameter values capture the progress 
        //   of a recursive process, much like loop control variable values 
        //   capture the progress of a loop.
        // - Any recursive solution can be replicated through the use of an 
        //   iterative approach and vice versa.
        //
        // A recursive method with a base case and recursive case and how it
        // would have been implemented iteratively (with a loop)
        ////////////////////////////////////////////////////////////////////////
        
        String s1 = "This is a string of characters.";
        String s2 = reverse(s1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
        int[] array = { 10, 20, 30, 40 };
        int sum = sum(array, 0);
        System.out.println("Sum = " + sum);
        
        ////////////////////////////////////////////////////////////////////////
        // (2) ADVANCED CLASSES:
        ////////////////////////////////////////////////////////////////////////
        // - An object is a specific instance of a class with defined 
        //   attributes. A class is the formal implementation, or blueprint, 
        //   of the attributes and behaviors of an object. 
        ////////////////////////////////////////////////////////////////////////
        
        Animal animal = new Animal();
        animal.type  = "Horse";
        animal.sound = "neigh...";
        animal.makeNoise();
        
        ////////////////////////////////////////////////////////////////////////
        // - A class hierarchy can be developed by putting common attributes 
        //   and behaviors of related classes into a single class called a 
        //   superclass. Classes that extend a superclass, called subclasses, 
        //   can draw upon the existing attributes and behaviors of the 
        //   superclass without replacing these in the code. This creates an 
        //   inheritance relationship from the subclasses to the superclass.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // - All classes in Java are subclasses of the Object class. 
        //   A constructor signature consists of the constructor’s name, 
        //   which is the same as the class name, and the ordered list of 
        //   parameter types. The parameter list, in the header of a 
        //   constructor, lists the types of the values that are passed and 
        //   their variable names.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // - Constructors are said to be overloaded when there are multiple 
        //   constructors with different signatures.
        // - Within an instance method or a constructor, the keyword this acts 
        //   as a special variable that holds a reference to the current 
        //   object - the object whose method or constructor is being called.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // - Data encapsulation is a technique in which the implementation 
        //   details of a class are kept hidden from external classes. The 
        //   keywords public and private affect the access of classes, data, 
        //   constructors, and methods. The keyword private restricts access 
        //   to the declaring class, while the keyword public allows access 
        //   from classes outside the declaring class.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // - An object’s state refers to its attributes and their values at a 
        //   given time and is defined by instance variables belonging to the 
        //   object. This defines a has-a relationship between the object and 
        //   its instance variables.
        // - When no constructor is written, Java provides a no-parameter 
        //   constructor, and the instance variables are set to default values 
        //   according to the data type of the attribute. This constructor is 
        //   called the default constructor.
        ////////////////////////////////////////////////////////////////////////
        
                
        
        ////////////////////////////////////////////////////////////////////////
        // - An enhanced for loop header includes a variable, referred to as 
        //   the enhanced for loop variable. For each iteration of the 
        //   enhanced for loop, the enhanced for loop variable is assigned a 
        //   copy of an element without using its index.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // (3) COLLECTIONS:
        ////////////////////////////////////////////////////////////////////////
        // - An ArrayList object is mutable in size and contains object 
        //   references. 
        // - The ArrayList constructor ArrayList() constructs an empty list. 
        // - Java allows the generic type ArrayList<E>, where the type 
        //   parameter E specifies the type of the elements. When 
        //   ArrayList<E> is specified, the types of the reference parameters 
        //   and return type when using the ArrayList methods are type E. 
        //   ArrayList<E> is preferred over ArrayList. For example, 
        //   ArrayList<String> names = new ArrayList<String>(); allows the 
        //   compiler to find errors that would otherwise be found at run-time
        // - The ArrayList class is part of the java.util package. An import 
        //   statement must be used to make this class available for use in 
        //   the program.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
        // - The following ArrayList methods - including what they do and when 
        //   they are used - are part of the Java Quick Reference: 
        //   int size(), boolean add(E obj), void add(int index, E obj), 
        //   E get(int index), E set(int index, E obj), E remove(int index)
        //   NOTE: These are covered in more detail in this example:
        //   https://bit.ly/4uQE10W
        // - The indices for an ArrayList start at 0 and end at the number of 
        //   elements - 1.
        // - Traversing an ArrayList is when iteration or recursive statements 
        //   are used to access all or an ordered sequence of the elements in 
        //   an ArrayList.
        // - Deleting elements during a traversal of an ArrayList requires the 
        //   use of special techniques to avoid skipping elements.
        // - Attempting to access an index value outside of its range will 
        //   result in an IndexOutOfBoundsException.
        // - Changing the size of an ArrayList while traversing it using an 
        //   enhanced for loop can result in a 
        //   ConcurrentModificationException. Therefore, when using an 
        //   enhanced for loop to traverse an ArrayList, you should not add or 
        //   remove elements.
        ////////////////////////////////////////////////////////////////////////
        
        
        
        
        System.out.println("Completed CS40S Connections......................");
    }

    /**
     * Reverses the order of characters in a given string using a 
     * recursive process.
     *
     * @param string The String to be reversed
     * @return A new String with the characters in reverse order
     */
    private String reverse(String string) {
        if (string == null || string.length() <= 1) {        
            // Base Case:If the string is empty or one char, it's already 
            // "reversed"
            return string;
        }
        else {
            // Recursive Case: Take the last char and put it in front of 
            // the result of reversing the rest of the string
            int    index = string.length() - 1;
            String last  = string.substring(index);
            String rest  = string.substring(0, index);
            return last + reverse(rest);
        }
    }
    
    /**
     * Recursively calculates the sum of all integers in an array starting 
     * from a given index.
     *
     * @param array The array of integers to be summed
     * @param index The current starting position in the array
     * @return The sum of the element at the current index plus the sum of all 
     * subsequent elements
     */
    private int sum(int[] array, int index) {
        if (index == array.length) {
            // Base Case: We've reached the end of the array (stop recursion)
            return 0;
        }
        else {
            // Recursive Case: Add current element to the sum of the remaining 
            // elements (the 'index + 1' captures the progress of the recursion)
            // recursion is the method calling itself
            return array[index] + sum(array, index + 1);
        }
    }
    
    
    public class Animal 
    {
        // Properties/Attributes: defined characteristics
        String type;
        String sound;
        
        // Methods/Behaviours: defined actions
        public void makeNoise() {
            System.out.println(type + " says " + sound);
        }
    }

}