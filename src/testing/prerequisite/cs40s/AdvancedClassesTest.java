
/** Required package class namespace */
package testing.prerequisite.cs40s;

/** Required API imports */
//import javax.swing.JOptionPane;
import utility.io.JOptionPane;
import utility.io.System;
import testing.prerequisite.cs40s.advancedclasses.Apple;
import testing.prerequisite.cs40s.advancedclasses.Athlete;
import testing.prerequisite.cs40s.advancedclasses.Box;
import testing.prerequisite.cs40s.advancedclasses.DiskJockey;
import testing.prerequisite.cs40s.advancedclasses.Doctor;
import testing.prerequisite.cs40s.advancedclasses.Food;
import testing.prerequisite.cs40s.advancedclasses.House;
import testing.prerequisite.cs40s.advancedclasses.Husky;
import testing.prerequisite.cs40s.advancedclasses.Meeting;
import testing.prerequisite.cs40s.advancedclasses.MrWachs;
import testing.prerequisite.cs40s.advancedclasses.Person;
import testing.prerequisite.cs40s.advancedclasses.Piper;
import testing.prerequisite.cs40s.advancedclasses.Steak;
import testing.prerequisite.cs40s.advancedclasses.Student;
import testing.prerequisite.cs40s.advancedclasses.Teacher;


/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor method, it sets class properties.
     * 
     * Special Methods that have the same name as the class (including a
     * capital at the start of the name) and NO return type (not even "void")
     * are called "constructor" methods these methods are called when the class
     * is created (or constructed), it makes an object from the class, or it
     * instantiates the class (creates an "instance")
     */
    public AdvancedClassesTest() {
        System.out.println("Advanced Classes Test started...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Per Soney";
        
        // The code below would generate errors because of encapsulation......        
        // person.gender = "non-binary";
        // person.age = 17;
        // person.alive = false;
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Instantiate (means create an "instance of") a student object        
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Stu Denty";
        // We can also change some of the porperties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        student.die();      // Inherited method from Person (parent/super) class
        student.talk();
        
        // Instantiate (means "create") a second Student object (instance)
        Student stewie = new Student("Stewie Griffin", 2, "cat");
        stewie.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Mr. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.talk();                 // Call again (to see any changes)
        teacher.teach();                // Effect the associated objects
        teacher.talk();                 // See the results from the teacher
        student.talk();                 // and the 2 students
        stewie.talk();
        
        // The Object class (parent class of all classes)
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes  
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: 
        //      toString()
        //      equals()
        //      clone()
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory         
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // The method (toString) is inherited by ALL sub classes (children)
        // of the Object class - remember the Object class is the parent or
        // super class of ALL classes - so they all inherit toString, including
        // classes we write...
        System.out.println("Person  as string = " + person.toString());
        System.out.println("Student as string = " + student.toString());
        System.out.println("Teacher as string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...        
        String string = new String("squirrel");
        System.out.println("String  as string = " + string.toString());
        
        // Another example of "built-into" Java class level object that inherits
        // all the methods (including toString) from the Object class...        
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as string = " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        // Now we will test the "over-loaded" equals method in the Person class
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Now reinstantiate (recreate) the 3 person object with new properties
        person1 = new Person("1", 0, "1");
        person2 = new Person("1", 0, "2");
        person3 = new Person("1", 0, "2");
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Have over-ridden the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // objec1t version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        // Now we also over-rode the clone method
        
        // Testing the clone() method:
        Person clone = person.clone();
        System.out.println("Person is " + person.toString());
        System.out.println("Clone  is " + clone.toString());
        if (person.equals(clone)) System.out.println("Clone is ==");
        
        // Change one of the properties of our second object
        clone.birthday();
        if (person.equals(clone)) System.out.println("Clone is still ==");
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        // Now output the static variable of each object and you will notice
        // how we get the same output for each student instance as they all
        // "share" the same access to the same static variable        
        System.out.println("S1 total = " + student.total);
        System.out.println("S2 total = " + stewie.total);
        
        // We create (instantiate) 2 more Student objects...
        Student student3 = new Student();
        Student student4 = new Student("4", 4, "4");
        
        // And output the shared/static property of those new instances
        System.out.println("S3 total = " + student3.total);
        System.out.println("S4 total = " + student4.total);
        
        // Mutate (change) that static variable directly (in one instance)
        stewie.total = 9;
        
        // Output the static variable again - showing that it changed (mutated) 
        // ALL the instances (all the student obejcts) since that varaible is
        // modified to be static        
        System.out.println("S3 total = " + student3.total);
        System.out.println("S4 total = " + student4.total);
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        // Instantiate some other classes:
        Doctor     doctor     = new Doctor();
        DiskJockey diskJockey = new DiskJockey();
        MrWachs    mrWachs    = new MrWachs();
        Piper      piper      = new Piper();
        Husky      husky      = new Husky();
        Athlete    athlete    = new Athlete();
                
        // And output those objects (remember the "toString() method is called
        // automaitcally by the println() method)
        System.out.println(doctor);
        System.out.println(diskJockey);
        System.out.println(mrWachs);
        System.out.println(piper);
        System.out.println(husky);
        System.out.println(athlete);
                
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
           
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        meeting.attend(person);
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);
        meeting.attend(clone);
        meeting.attend(student);
        meeting.attend(stewie);
        meeting.attend(student3);
        meeting.attend(student4);
        meeting.attend(teacher);
        meeting.attend(doctor);
        meeting.attend(diskJockey);
        meeting.attend(mrWachs);
        meeting.attend(piper);
        meeting.attend(husky);
        meeting.attend(athlete);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food();
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class 
        
        Apple apple = new Apple();
        apple.smell(2);
        
        Steak steak = new Steak();
        steak.smell(6);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. Since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
                
        mrWachs.consume(steak);
        husky.consume(apple);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules").
        
        Athlete jock = new Athlete();
        // Set our opponent 
        jock.setOpponent("St. Pauls");
        // Have our athlete compete in four rounds of athletics
        for (int round = 1; round <= 4; round++) {
            System.out.println("Round " + round + "...");
            if (jock.haveYouGotItSigned()) {            // Check if can play?
                jock.score("Jock");                     // Play hockey
                jock.score("Jock");
                jock.score("St. Pauls");
                jock.endOfPeriod(round);                // See the scores...
                if (jock.metRequirements(4, 40) && round == 4) {      
                    System.out.println(jock.judge());   // Extreme ironing
                }    
                if (round == 2) {
                    jock.slap("Jock", "St. Pauls");
                    if (jock.isKnockedOut()) {
                        System.out.println("KO");
                    }
                }
            }
            else {
                jock.sign();        // Sign so they can play
            }
        }
        // Check if we won
        if (jock.didIWin()) jock.consume(steak);
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let us start by creating simple ("primitive") data types        
        boolean b = true;
        char    c = 'a';
        int     i = 0;
        double  d = 3.14;
        
        // Now use the primatives with a more complex data type (class)
        // called a 'wrapper' class from the primatives and use the 
        // constructor methods of those wrapper classes passing the 
        // primatives through the constructor methods  
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Also String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("test");
        
        // Now call a generic method on the variety of 'generic' items
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(athlete);        // Even objects of classes we created
        
        // Test the generic method on another "complex" object (that we don't
        // create)...
        JOptionPane jOptionPane = new JOptionPane();
        output(jOptionPane);
        
        // This line uses "annonymous" object..
        output(new Object());
        
        // When using a class with a generic inside of it, and that
        // class is being instantiated (creating an object), then 
        // you define what type the generic is by using the angle 
        // brackets "< >" with the data type (which must be a 
        // 'class' type not a primitive) inside the brackets beside 
        // the class name on the left hand side of the equals sign. 
        // This is repeated on the right hand side of the equals 
        // sign as well (but you can leave these angle brackets 
        // empty - which is called the "diamond") before the round 
        // brackets of the constructor method.
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(athlete);
        
        // Peek in all the boxes..  
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // Open all the boxes...        
        Boolean   newBoolean   = box1.open();
        Integer   newInteger   = box2.open();
        Double    newDouble    = box3.open();
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Athlete   newAthlete   = box6.open();
        
        // Output all the newly returned data type objects...
        output(newBoolean);
        output(newInteger);
        output(newDouble);
        output(newCharacter);
        output(newString);
        output(newAthlete);
        
        // A generic class with multiple generic types, a generic method, the
        // enhanced for loop, restricted generics 
        House<MrWachs,Meeting> house = new House<>();
        
        // Associate the objects that match with the generics
        house.homeOwner = mrWachs;
        house.contents  = meeting;
        
        // Create an array of Food object
        Food[] fridge = { apple, steak };
        
        // Test our generic method
        house.party(fridge);
        
        System.out.println("Advanced Classes Test complete!");
    }   

    /**
     * Outputs a generic item with information about the data type.
     * Generic methods use 'generic' references rather than specific
     * references. You do not define the data type (the parameter) 
     * when the method is created. Instead of defining the data
     * type, a set of angle brackets "< >" is used with a single
     * letter (usually capital "T") inside which acts as a 
     * 'placeholder' for the data type which will be defined in
     * the argument when the method is later called
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class name: ";
        text += item.getClass().getSimpleName();
        text += ", Hash Code: " + item.hashCode();
        text += ", To String: " + item.toString();
        System.out.println(text);
    }

}