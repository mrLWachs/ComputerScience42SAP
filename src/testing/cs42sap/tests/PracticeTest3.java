/** Required package class namespace */
package testing.cs42sap.tests;

/** Required API imports */
//import java.util.ArrayList;
import utility.io.Simulator;
import utility.io.System;

/**
 * PracticeTest3 - a set of practice test questions and solutions for the 
 * A.P. Computer Science exam
 * 
 * @author Mr. Wachs
 * @since Mar 5, 2024
*/
public class PracticeTest3
{

    /**
     * Default constructor, set class properties
     */
    public PracticeTest3() {
        if (Simulator.check("AP Practice Test 3")) return;
        section1();
        question1();     
        question2();    
        section2();
        question3();     
        question4();     
        question5();                   
    }
    
    /**
     * A practice test section
     */
    private void section1() {
        Simulator.comment("Section 1...");        
        System.out.println("For the next two Free response questions, ");
        System.out.println("refer to the description below...");
        
        System.out.println("A travel agency maintains a list of information ");
        System.out.println("about airline flights. Flight information ");
        System.out.println("includes a departure time and an arrival time.");
        System.out.println("You may assume that the two times occur on the ");
        System.out.println("same day. These times are represented by ");
        System.out.println("objects of the Time class. The declaration for");
        System.out.println("the Time class is shown below. It includes a ");
        System.out.println("method which returns the difference (in minutes)");
        System.out.println("between the current Time object and another Time");
        System.out.println("object. ");
        Simulator.code("public class Time {");  
        Simulator.code("");
        Simulator.code("     /** "); 
        Simulator.code("      * @return difference, in minutes, between this");   
        Simulator.code("      * time and other; difference is negative");   
        Simulator.code("      * if other is earlier than this time");
        Simulator.code("      */");
        Simulator.code("     public int minutesUntil(Time other) {");   
        Simulator.code("          /* implementation not shown */");   
        Simulator.code("     }");   
        Simulator.code("");
        Simulator.code("     // There may be instance variables, constructors,");   
        Simulator.code("     // and methods that are not shown.");   
        Simulator.code("}");
        System.out.println("For example, assume that t1 and t2 are Time ");
        System.out.println("objects where t1 represents 1:00 p.m. and t2 ");
        System.out.println("represents 2:15 p.m. The call t1.minutesUntil(t2) ");
        System.out.println("will return 75 and the call t2.minutesUntil(t1) ");
        System.out.println("will return -75. The declaration for the Flight class ");
        System.out.println("is shown below. It has methods to access the ");
        System.out.println("departure time and the arrival time of a flight. ");
        System.out.println("You may assume that the departure time of a ");
        System.out.println("flight is earlier than its arrival time.");
        Simulator.code("public class Flight {");
        Simulator.code("");
        Simulator.code("      /** @return time at which the flight departs */");
        Simulator.code("      public Time getDepartureTime() {");
        Simulator.code("           /* implementation not shown */ ");
        Simulator.code("      }");
        Simulator.code("");
        Simulator.code("      /** @return time at which the flight arrives */");
        Simulator.code("      public Time getArrivalTime() {");
        Simulator.code("           /* implementation not shown */ ");
        Simulator.code("      }");
        Simulator.code("");
        Simulator.code("      // There may be instance variables, constructors, ");
        Simulator.code("      // and methods that are not shown.");
        Simulator.code("}");
        System.out.println("A trip consists of a sequence of flights and is ");
        System.out.println("represented by the Trip class. The Trip class ");
        System.out.println("contains a List of Flight objects that are stored ");
        System.out.println("in chronological order. You may assume that for ");
        System.out.println("each flight after the first flight in the list, ");
        System.out.println("the departure time of the flight is later than ");
        System.out.println("the arrival time of the preceding flight in the ");
        System.out.println("list. A partial declaration of the Trip class is ");
        System.out.println("shown below. You will write two methods for the ");
        System.out.println("Trip class.");
        Simulator.code("public class Trip {");
        Simulator.code("");
        Simulator.code("     /** ");
        Simulator.code("       * The list of flights (if any) that make up ");
        Simulator.code("       * this trip, stored in chronological order");
        Simulator.code("       */");
        Simulator.code("     private List<Flight> flights;");
        Simulator.code("");
        Simulator.code("     /** ");
        Simulator.code("       * @return the number of minutes from the ");
        Simulator.code("       * departure of the first flight to the arrival ");
        Simulator.code("       * of the last flight if there are one or more ");
        Simulator.code("       * flights in the trip; 0, if there are no ");
        Simulator.code("       * flights in the trip");
        Simulator.code("       */");
        Simulator.code("     public int getDuration() {");
        Simulator.code("          /* to be implemented in part (a) */ ");
        Simulator.code("     }");
        Simulator.code("");
        Simulator.code("     /** ");
        Simulator.code("       * Precondition: the departure time for each ");
        Simulator.code("       * flight is later than the arrival time of its ");
        Simulator.code("       * preceding flight");
        Simulator.code("       * @return the smallest number of minutes ");
        Simulator.code("       * between the arrival of a flight and the ");
        Simulator.code("       * departure of the flight immediately after it, ");
        Simulator.code("       * if there are two or more flights in the ");
        Simulator.code("       * trip; -1, if there are fewer than two flights ");
        Simulator.code("       * in the trip");
        Simulator.code("       */");
        Simulator.code("     public int getShortestLayover() {");
        Simulator.code("          /* to be implemented in part (b) */");
        Simulator.code("     }");
        Simulator.code("");
        Simulator.code("       // There may be instance variables, constructors,");
        Simulator.code("       // and methods that are not shown");
        Simulator.code("}");
    }
    
//    public class Time {
//        /**
//         * @return difference, in minutes, between this time and other;
//         * difference is negative if other is earlier than this time
//         */
//        public int minutesUntil(Time other) {
//            return 10;
//        } 
//    }
//    
//    public class Flight {
//        /**
//         * @return time at which the flight departs
//         */
//        public Time getDepartureTime() {
//            return null;
//        }
//        /**
//         * @return time at which the flight arrives
//         */
//        public Time getArrivalTime() {
//            return null;
//        }
//    }
//    
//    public class Trip {
//        /**
//         * The list of flights (if any) that make up this trip, stored in
//         * chronological order
//         */
//        private ArrayList<Flight> flights;
//
//        /**
//         * @return the number of minutes from the departure of the first flight
//         * to the arrival of the last flight if there are one or more flights in
//         * the trip; 0, if there are no flights in the trip
//         */
//        public int getDuration() {
//            int totalDuration = 0;
//            for (Flight flight : flights) {
//                Time departure = flight.getDepartureTime();
//                Time arrival   = flight.getArrivalTime();
//                int  duration  = departure.minutesUntil(arrival);
//                totalDuration  = totalDuration + duration;
//            }
//            return totalDuration;
//        }
//
//        /**
//         * Precondition: the departure time for each flight is later than the
//         * arrival time of its preceding flight
//         *
//         * @return the smallest number of minutes between the arrival of a
//         * flight and the departure of the flight immediately after it, if there
//         * are two or more flights in the trip; -1, if there are fewer than two
//         * flights in the trip
//         */
//        public int getShortestLayover() {
//            if (flights.isEmpty()) return -1;
//            int shortestLayover = Integer.MAX_VALUE;
//            int i = 0;
//            while (i < flights.size()) {
//                Flight currentFlight = flights.get(i);
//                i++;
//                Flight nextFlight    = flights.get(i);
//                Time arrival         = currentFlight.getArrivalTime();
//                Time departure       = nextFlight.getDepartureTime();
//                int layover = Math.abs(arrival.minutesUntil(departure));
//                if (layover < shortestLayover) {
//                    shortestLayover = layover;
//                }
//                i++;
//            }
//            return shortestLayover;
//        }
//    }
    
    /**
     * A practice test question
     */
    private void question1() {
        Simulator.comment("Question 1...");          
        System.out.println("Complete method getDuration below.  ");        
        Simulator.comment("An answer could be..."); 
        Simulator.code("public int getDuration() {");
        Simulator.code("    int totalDuration = 0;");
        Simulator.code("    for (Flight flight : flights) {");
        Simulator.code("        Time departure = flight.getDepartureTime();");
        Simulator.code("        Time arrival   = flight.getArrivalTime();");
        Simulator.code("        int  duration  = departure.minutesUntil(arrival);");
        Simulator.code("        totalDuration  = totalDuration + duration;");
        Simulator.code("    }");
        Simulator.code("    return totalDuration;");
        Simulator.code("}");        
    }
    
    /**
     * A practice test question
     */
    private void question2() {
        Simulator.comment("Question 2...");        
        System.out.println("Write the Trip method getShortestLayover. A ");
        System.out.println("layover is the number of minutes from the arrival ");
        System.out.println("of one flight in a trip to the departure of the ");
        System.out.println("flight immediately after it. If there are two or ");
        System.out.println("more flights in the trip, the method should return ");
        System.out.println("the shortest layover of the trip; otherwise, it ");
        System.out.println("should return -1. For example, assume that the ");
        System.out.println("instance variable flights of a Trip object vacation ");
        System.out.println("contains the following flight information.");
        Simulator.code("          Departure   Arrival   Layover");
        Simulator.code("            Time      Time     (minutes)");
        Simulator.code("         +---------+----------+");
        Simulator.code("Flight 0 | 11:30am |  12:15pm |");
        Simulator.code("         +---------+----------+ }  60");
        Simulator.code("Flight 1 |  1:15pm |   3:45pm |");
        Simulator.code("         +---------+----------+ }  15");
        Simulator.code("Flight 2 |  4:00pm |   6:45pm |");
        Simulator.code("         +---------+----------+ }  210");
        Simulator.code("Flight 3 | 10:15pm |  11:00pm |");
        Simulator.code("         +---------+----------+");
        System.out.println("The call vacation.getShortestLayover() should ");
        System.out.println("return 15. Complete method getShortestLayover() ");
        System.out.println("below.");
        Simulator.code("public int getShortestLayover()");
        Simulator.comment("An answer could be..."); 
        Simulator.code("public int getShortestLayover() {");
        Simulator.code("    if (flights.isEmpty()) return -1;");
        Simulator.code("    int shortestLayover = Integer.MAX_VALUE;");
        Simulator.code("    int i = 0;");
        Simulator.code("    while (i < flights.size()) {");
        Simulator.code("        Flight currentFlight = flights.get(i);");
        Simulator.code("        i++;");
        Simulator.code("        Flight nextFlight    = flights.get(i);");
        Simulator.code("        Time arrival         = currentFlight.getArrivalTime();");
        Simulator.code("        Time departure       = nextFlight.getDepartureTime();");
        Simulator.code("        int layover = Math.abs(arrival.minutesUntil(departure));");
        Simulator.code("        if (layover < shortestLayover) {");
        Simulator.code("            shortestLayover = layover;");
        Simulator.code("        }");
        Simulator.code("        i++;");
        Simulator.code("    }");
        Simulator.code("    return shortestLayover;");
        Simulator.code("}");
    }
        
    /**
     * A practice test section
     */
    private void section2() {
        Simulator.comment("Section 1...");  
        System.out.println("For the next three Free response questions, refer ");
        System.out.println("to the description below...");
        System.out.println("Consider the hierarchy of classes shown in the ");
        System.out.println("following diagram");
        Simulator.code("         +----------+ ");
        Simulator.code("         |    Pet   |");
        Simulator.code("         +----------+");
        Simulator.code("            /    \\");
        Simulator.code(" +----------+    +----------+");
        Simulator.code(" |    Cat   |    |    Dog   |");
        Simulator.code(" +----------+    +----------+");
        Simulator.code("                       \\");
        Simulator.code("                       +----------+");
        Simulator.code("                       | Loud Dog |");
        Simulator.code("                       +----------+");
        System.out.println("Note that a Cat 'is-a' Pet, a Dog 'is-a' Pet, and ");
        System.out.println("a LoudDog 'is-a' Dog. The class Pet is specified ");
        System.out.println("as an abstract class as shown in the following ");
        System.out.println("declaration. Each Pet has a name that is ");
        System.out.println("specified when it is constructed.");
        Simulator.code("public abstract class Pet {");
        Simulator.code("");
        Simulator.code("    private String name;");
        Simulator.code("");
        Simulator.code("    public Pet(String petName) {");
        Simulator.code("        name = petName;");
        Simulator.code("    }");
        Simulator.code("");
        Simulator.code("    public String getName() {");
        Simulator.code("        return name;");
        Simulator.code("    }");
        Simulator.code("");
        Simulator.code("    public abstract String speak();");
        Simulator.code("");
        Simulator.code("}");
        System.out.println("The subclass Dog has the partial class ");
        System.out.println("declaration shown below.");
        Simulator.code("public class Dog extends Pet {");
        Simulator.code("");
        Simulator.code("    public Dog(String petName) {");
        Simulator.code("        /* implementation not shown */");
        Simulator.code("    }");
        Simulator.code("");
        Simulator.code("    public String speak() {");
        Simulator.code("        /* implementation not shown */");
        Simulator.code("    }");
        Simulator.code("");
        Simulator.code("}");
    }
    
//    public abstract class Pet {
//
//        private String name;
//
//        public Pet(String petName) {
//            name = petName;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public abstract String speak();
//    }
//    
//    public class Dog extends Pet {
//
//        public Dog(String petName) {
//            super(petName);
//        }
//
//        public String speak() {
//            String dogSound = "woof";
//            return dogSound;
//        }
//    }
//    
//    public class Cat extends Pet {
//
//        public Cat(String petName) {
//            super(petName);
//        }
//
//        public String speak() {
//            return "meow";
//        }
//    }
//    
//    public class LoudDog extends Dog {
//
//        public LoudDog(String petName) {
//            super(petName);
//        }
//
//        public String speak() {
//            return super.speak() + super.speak();
//        }
//    }
//    
//    public class Kennel { 
//        
//        private ArrayList<Pet> petList;
//        
//         /** 
//          * For every Pet in the kennel, prints the name followed by    
//          *  the result of a call to its speak method, one line per Pet.   
//          */ 
//        public void allSpeak() {
//            for (Pet pet : petList) {
//                System.out.println(pet.getName() + pet.speak());
//            }
//        }
//    
//        // There may be instance variables, constructors, and methods that are   
//        // not shown.
//    }
    
    /**
     * A practice test question
     */
    private void question3() {
        Simulator.comment("Question 3...");        
        System.out.println("Given the class hierarchy shown above, write a ");
        System.out.println("complete class declaration for the class Cat, ");
        System.out.println("including implementations of its constructor ");
        System.out.println("and method(s). The Cat method speak returns ");
        System.out.println("'meow' when it is invoked.");             
        Simulator.comment("An answer could be..."); 
        Simulator.code("public class Cat extends Pet {"); 
        Simulator.code(""); 
        Simulator.code("    public Cat(String petName) {"); 
        Simulator.code("        super(petName);"); 
        Simulator.code("    }"); 
        Simulator.code(""); 
        Simulator.code("    public String speak() {"); 
        Simulator.code("        return \"meow\";"); 
        Simulator.code("    }"); 
        Simulator.code(""); 
        Simulator.code("}"); 
    }
    
    /**
     * A practice test question
     */
    private void question4() {
        Simulator.comment("Question 4...");        
        System.out.println("Assume that class Dog has been declared as shown ");
        System.out.println("at the beginning of the question. If the String ");
        System.out.println("dog-sound is returned by the Dog method speak, ");
        System.out.println("then the LoudDog method method speak returns a ");
        System.out.println("String containing dog-sound repeated two times. ");
        System.out.println("Given the class hierarchy shown previously, ");
        System.out.println("write a complete class declaration for the class ");
        System.out.println("LoudDog including implementations of its ");
        System.out.println("constructor and method(s).");             
        Simulator.comment("An answer could be..."); 
        Simulator.code("public class LoudDog extends Dog {");
        Simulator.code("");
        Simulator.code("    public LoudDog(String petName) {");
        Simulator.code("        super(petName);");
        Simulator.code("    }");
        Simulator.code("");
        Simulator.code("    public String speak() {");
        Simulator.code("        return super.speak() + super.speak();");
        Simulator.code("    }");
        Simulator.code("}");
    }
    
    /**
     * A practice test question
     */
    private void question5() {
        Simulator.comment("Question 5...");        
        System.out.println("Consider the following partial declaration of ");
        System.out.println("class Kennel");
        Simulator.code("public class Kennel {");
        Simulator.code("");
        Simulator.code("    private ArrayList<Pet> petList;");
        Simulator.code("");
        Simulator.code("     /**");
        Simulator.code("      * For every Pet in the kennel, prints the name ");
        Simulator.code("      * followed by the result of a call to its speak ");
        Simulator.code("      * method, one line per Pet");
        Simulator.code("      */");
        Simulator.code("     public void allSpeak() {");
        Simulator.code("        /* to be implemented */");
        Simulator.code("     }");
        Simulator.code("");
        Simulator.code("     // There may be instance variables, constructors, ");
        Simulator.code("     // and methods that are not shown");
        Simulator.code("}");        
        System.out.println("Write the Kennel method allSpeak For each Pet in ");
        System.out.println("the kennel, allSpeak prints a line with the name ");
        System.out.println("of the Pet followed by the result of a call to ");
        System.out.println("its speak method. In writing allSpeak you may use ");
        System.out.println("any of the methods defined for any of the classes ");
        System.out.println("specified for this problem. Assume that these ");
        System.out.println("methods work as specified, regardless of what ");
        System.out.println("you wrote in previous questions. Complete method");
        System.out.println("allSpeak below");
        Simulator.code("public void allSpeak()");
        Simulator.comment("An answer could be..."); 
        Simulator.code("public void allSpeak() {");
        Simulator.code("    for (Pet pet : petList) {");
        Simulator.code("        System.out.println(pet.getName() + pet.speak());");
        Simulator.code("    }");
        Simulator.code("}");
    }
    
}