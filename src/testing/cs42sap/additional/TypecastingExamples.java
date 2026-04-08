
/** Required package class namespace */
package testing.cs42sap.additional;
 
/** Required API imports */
import utility.io.Simulator;


/*
 * TypecastingExamples - This class is an example of Java Typecasting. 
 * Typecasting objects in Java lets you switch how you view an object within 
 * an inheritance hierarchy, either safely (upcasting) or carefully 
 * (downcasting). Typecasting objects in Java means treating an object of one 
 * reference type as if it were another type, as long as both types are related 
 * through inheritance. It does not change the actual object in memory - only 
 * how the reference "views" it. Object typecasting changes the reference type, 
 * not the object itself. Think of it like swapping remote controls: the object 
 * stays the same, but the buttons (methods you can access) change.
 *
 * Why Typecast Objects?
 * - To use polymorphism effectively
 * - To access subclass-specific methods after upcasting
 * - To write flexible, reusable code that works with general types but can
 *   specialize when needed        
 * - Work with collections: List<Animal> animals = new ArrayList<>();
 * - Method parameters accepting superclass but need subclass behavior
 * 
 * @author Mr. Wachs
 * @since Apr 7, 2026, 2:23:33 PM
 */
public class TypecastingExamples 
{
    
    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting Typecasting Examples");
        new TypecastingExamples();
        Simulator.title("\nCompleted Typecasting Examples");
    }
    
    /**
     * Default constructor, set class properties
     */
    public TypecastingExamples() {
        System.out.println("Learn about Typecasting..........................");
        
        ////////////////////////////////////////////////////////////////////////
        // Upcasting (Child -> Parent) - Automatic (The Safe Bet)
        ////////////////////////////////////////////////////////////////////////
        // Converting a subclass reference to a superclass type. Always safe, 
        // done implicitly. Upcasting is casting a Subclass type to a 
        // Superclass type.
        //
        //  - Direction: Moving up the inheritance hierarchy (Child to Parent)
        //  - Automatic: Java does this automatically because a child is always 
        //               an instance of its parent
        //  - Trade-off: You lose access to specific methods defined only in 
        //               the subclass
        //
        // Why use Upcasting?
        //  - To achieve polymorphism (method overriding)
        //  - To store different subclass objects in a single superclass 
        //    reference (e.g., in arrays or lists)
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Example 1: Upcasting.............................");
        
        Animal animal1 = new Dog();  // Dog object treated as Animal
        animal1.eat();               // Animal method called
        animal1.sound();             // Dog override method called
        // animal1.wag();            // Compile error: Animal cannot call wag()
        // After upcasting, you only access methods defined in the parent class

        ////////////////////////////////////////////////////////////////////////
        // Downcasting (Parent -> Child) - Manual (The Risky Move)
        ////////////////////////////////////////////////////////////////////////
        // Converting a superclass reference back to a subclass type. Must be 
        // done explicitly. Downcasting is casting a Superclass type back to a 
        // Subclass type.
        //
        //  - Direction:   Moving down the hierarchy (Parent to Child)
        //  - Manual:      You must explicitly tell the compiler you know what 
        //                 you're doing using parentheses: (Child)
        //  - Requirement: The object being cast must actually be an instance 
        //                 of that subclass at runtime
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Example 2: Downcasting...........................");
        
        Animal animal2 = new Dog();   // Upcast first
        Dog dog2 = (Dog)animal2;      // Downcast explicitly
        dog2.eat();                   // Call Animal method
        dog2.sound();                 // Call override Dog method
        dog2.wag();                   // Now you can access Dog methods
        
        // Dangerous downcast (ClassCastException):
        Animal animal3 = new Animal();  // NOT a Dog object
        // Dog dog3 = (Dog)animal3;     // Throws ClassCastException at runtime!
       
        ////////////////////////////////////////////////////////////////////////
        // Safe Casting with instanceof
        ////////////////////////////////////////////////////////////////////////
        // If you try to downcast an object to a type it doesn't actually belong
        // belong to, Java will throw a ClassCastException and crash your 
        // program. To stay safe, always use the instanceof operator first.
        // Always check before downcasting to avoid ClassCastException.
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Example 3: Safe Casting with instanceof..........");
        
        Animal animal4 = new Dog();     // Upcast
        if (animal4 instanceof Dog) {   // Error check with instanceof
            Dog dog4 = (Dog)animal4;    // Downcast
            dog4.sound();               // Safe call override Dog method
        }
        
        System.out.println("Example 4: Typecasting with array................");
                
        Animal[] animals = { new Dog(), new Cat(), new Animal() };  // Upcasting
        for (Animal animal : animals) {     // Enhanced for loop
            animal.eat();                   // Method works for all
            if (animal instanceof Dog) {    // Error check
                ((Dog)animal).sound();      // Downcast override Dog method
            } 
            else if (animal instanceof Cat) {
                ((Cat)animal).sound();
            } 
            else {
                animal.sound();
            }
        }        
        
        /*          
        +===============+======================+===============================+
        | Summary Table                                                        |
        +===============+======================+===============================+
        | Feature       | Upcasting            | Downcasting                   |
        +===============+======================+===============================+
        | Direction     | Child -> Parent      | Parent -> Child               |
        +---------------+----------------------+-------------------------------+
        | Done          | Automatically        | Manually with (Type)          |
        +---------------+----------------------+-------------------------------+
        | Syntax        | Implicit (Automatic) | Explicit (Manual)             |
        +---------------+----------------------+-------------------------------+
        | Safety        | Always safe          | Risky (can throw Exception)   |
        +---------------+----------------------+-------------------------------+
        | Access        | Parent methods only  | All child methods             |
        +---------------+----------------------+-------------------------------+
        | Best practice |           -          | Use instanceof before casting |
        +---------------+----------------------+-------------------------------+
        | Purpose       | To treat different   | To access specific subclass   |
        |               | objects generally    | behaviors                     |
        +===============+======================+===============================+
        */

        System.out.println("Completed Typecasting............................");
    }
    
    public class Animal {
        void eat() { 
            System.out.println("Animal eats"); 
        }        
        void sound() {
            System.out.println("Animal sound");
        }
    }

    public class Dog extends Animal {
        void sound() { 
            System.out.println("Dog barks"); 
        }        
        void wag() {
            System.out.println("Dog wags tail");
        }
    }
    
    public class Cat extends Animal {
        void sound() { 
            System.out.println("Cat meows"); 
        }        
        void scratch() {
            System.out.println("Cat scratches");
        }
    }
    
}
