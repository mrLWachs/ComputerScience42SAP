
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package testing.prerequisite.cs30s;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code
 */
import utility.io.JOptionPane;
import utility.io.Simulator;
import utility.io.System;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import testing.Tester;

 
/**
 * ComputerScience30s.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code example that might come up over the course.
 * 
 * @author Mr. Wachs
 * @since June 2023
 */
public class ComputerScience30S {        // Curly brackets DO NOT remove

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
//    public static void main(String[] args) { 
                
    /**
     * Default class constructor, runs on instantiation
     * 
     * @param state state the run state of this code module
     */
    public ComputerScience30S(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 30S course content not running");
            return;
        }
        else if (state == Tester.RUN_SIMULATED) {
            Simulator.title("Computer Science 30S Course:");
            learnIntroToJava();
            learnMethods();
            learnArrays();
            learnClasses();
            new LearnGraphics(state);
        }
        else if (state == Tester.RUN_NORMAL) {
            Simulator.title("Computer Science 30S Course:");
    //        System.out.println("\nComputer Science 30S Example started...\n");
            ////////////////////////////////////////////////////////////////////////
            // Other code added later in the course to provide a menu of choices
            // to the user to see which unit of examples...
            // Present the user with options
            final String[] OPTIONS = {
                "See the example of learning basic Java code (unit 1)",
                "See the example of methods (unit 2)",
                "See the example of arrays (unit 3)",
                "See the example of classes (unit 4)",
                "See the example of graphics and user interfaces (bonus unit)",
                "See all the examples (all units and bonus)"                
            };
            // Get the user's choice
            String choice = JOptionPane.showInputDialog(
                    null,
                    "Select the unit to view examples of...",
                    "Computer Science with Mr. Wachs",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    OPTIONS,
                    OPTIONS[0]).toString();
            // Choose which to see
            if      (choice.equals(OPTIONS[0])) learnIntroToJava();
            else if (choice.equals(OPTIONS[1])) learnMethods();
            else if (choice.equals(OPTIONS[2])) learnArrays();
            else if (choice.equals(OPTIONS[3])) learnClasses();
            else if (choice.equals(OPTIONS[4])) new LearnGraphics(state);
            else {
                learnIntroToJava();
                learnMethods();
                learnArrays();
                learnClasses();
                new LearnGraphics(state);
            }          
            ////////////////////////////////////////////////////////////////////////
            // Below is the original code (before the graphics unit) that we wrote 
            // as we learned each unit before it was replaced with the code above

            // The line below "calls" a method (by its name) like making a 
            // "phone call" it uses two round brackets "( )" like functions in
            // math - when you see two round brackets, it is a clue that a 
            // method is being called (or it is the method itself)
    //        learnIntroductionToJava();
    //        learnMethods();     // Calling another method (that may not yet exist)
            // If you call upon a method that does not yet exist, NetBeans can help
            // you create it (write it) by clicking on the lightbulb icon on the 
            // left side of NetBeans...
    //        learnArrays();
    //        learnClasses();
    //        LearnGraphics learnGraphics = new LearnGraphics();

    //        System.out.println("\nComputer Science 30S Example complete!\n");
        }
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnIntroToJava() {
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // This is a comment all typing after "//" until the line ends        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output
        System.out.println("Hello World");  // Comments can be on code lines
        
        // Use print without the "ln", does not add a line break at the end        
        System.out.print("I'm in");
        System.out.println(" the world");
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");             // \" makes quote
        System.out.println("Make a slash \\ ");             // \\ makes slash
        System.out.println("Make a \t tab ");               // \t makes tab
        System.out.println("Make a new line \n break ");    // \n makes new line
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Make a "fancier" output with a dialog box
        
        JOptionPane.showMessageDialog(null, "Hi");
        
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
                
        // However, these OPTIONS (not needed, but cool) for other
        // dialog output message boxes below...
        
        // Code could span multiple lines until it reaches a semi colon ";"
        // The light red line on the far right -------------------------------->
        // can be thought of as a "barrier" and you should try not to code too
        // much past this line
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs...
        
        // The simpliest version is the one you will need to know:
        
        JOptionPane.showInputDialog("Enter Something");
        
        // There is a little more to using this input dialog that we will 
        // cover after learning variables
        
        // Some other optional input dialogs...
        
        JOptionPane.showInputDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 3",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 4",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 5",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to
        // store (or "remember") information (or "data")
        
        // This is an example of the simpliest variable type:
        
        boolean a = true;
        
        // type name = value ; 
        
        // When you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // Variables can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        // Output our variables when outputted it always outputs the 
        // value stored in the variable not the name of it
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // The "char" is short for "character" it holds (remembers) ONE
        // character
        
        System.out.println("d = " + d);
        
        // The boolean ("bool" in C#), integer (int), double, and character
        // (char) are all simple (primitive) data types, now a "complex" data
        // type....
        
        String e = "apple";
        
        System.out.println("e = " + e);
        
        // Manipulate ("use") our variables:
        
        int x = 10;
        
        System.out.println("x = " + x);
        
        x = 20;
        
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        System.out.println("y = " + y);
        
        // Optional ("you don't have to use this code") shorthand...
        
        y++;    // Means the same as y = y + 1;
        y--;    // Means the same as y = y - 1;
        
        // Even more optional shorthand (less recommended)
        
        y += 10;    // Means the same as y = y + 10;
        y -= 10;    // Means the same as y = y - 10;
        y *= 10;    // Means the same as y = y * 10;
        y /= 10;    // Means the same as y = y / 10;
        
        System.out.println("y = " + y);
        
        // Modulus (mod) division gives you the remainder of a division
        // (not the normal answer) - in Java it uses the percentage "%"
        // symbol for this
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;        
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change (they stay "constant"),
        // and constants are written in ALL_CAPITAL_LETTERS with underscores
        // to seperate words
        
        // They also start with the keyword "final" (in C# it was "const")
        
        final double  PI       = 3.141592658389;
        final int     PROBLEMS = 99;
        final char    YES      = 'Y';
        final boolean FOUND    = true;
        final String  TEACHER  = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " + 
                           YES      + ", " +
                           FOUND    + ", " +
                           TEACHER);
        
        // Constants are used for things like: easier code to maintain,
        // easier to read/understand (especially for other programmers)
        
        // Converting between variable data types...
        
        int f = 25;
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.999999999999;
        
        System.out.println("g = " + g);
        
        int h = (int) g;
        
        System.out.println("h = " + h);
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        double k = 2.99999999;
        int    l = (int)k;
        double m = (double)l;
        
        // Casting can happen with other data types...
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)70;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // Use dialog boxes (specifically the input) with variables...
        
        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
        // at the front of the line that makes the input dialog (code above is
        // wrong, always make a string variable then the input dialog)
        
        String q = JOptionPane.showInputDialog("Enter");
        
        // The variable (always has to start as a string) stores what the 
        // user types in the input dialog box
        
        JOptionPane.showMessageDialog(null, q);
                
        // With numbers, you HAVE to start off with a string, and then convert
        // it to a number. This is like Convert.ToInt32(text); in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We convert using code to "parse" (means "to read")
        
        int s = Integer.parseInt(r);
        
        // Always use a capital "I" and whole word "Integer" for this parsing
        // the string into a number
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example but with a double...
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char (single character)...
        
        String v = JOptionPane.showInputDialog("Enter char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
                
        // String have MANY built-in "actions" ("powers", functions, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        int length = word.length();
        
        System.out.println("Word " + word + " is length " + length);
        
        String upper = word.toUpperCase();
        
        System.out.println("Word " + word + " in upper case is " + upper);
        
        // Many more string functions to explore (could use CTRL+SPACE)
        
        // Another useful "library" of code is the "Math" library which is
        // also "built-in" (you can easily use it) to Java. It comes with 
        // its own functions (actions, methods)
        
        double answer1 = Math.PI;
        double answer2 = Math.cos(0.5);
        double answer3 = Math.abs(-1);
        double answer4 = Math.pow(5,3);
        double answer5 = Math.sqrt(9);
        double answer6 = Math.log(0.5);
                
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);
        
        // Math library also includes the ability to make random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        
        System.out.println("seed = " + seed);
        
        // The "seed" is the starting point - generates a random number between
        // zero and one (never gets to zero or one)
        
        // You can now use a formula for generating random numbers in a range
        // between a low and high value (e.g between 1 and 10 and an integer)
        
        // Start off with some constants to define the LOW and HIGH
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula...
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        System.out.println("low    = " + LOW);
        System.out.println("high   = " + HIGH);        
        System.out.println("number = " + number);
        
        // Now convert to int
        
        int value = (int)number;
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int)( (53 - 2 + 1) * Math.random() + 2);
        System.out.println("card is " + card);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code inside the block
        
        int value1 = 10;
        int value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with "else" (an option) for both true and false, check 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.print("The example is ");
            System.out.println("less than");
        }
        else {
            System.out.println("Greater than");
        }
        
        // You can have as many lines of code as you want in a "block"
        
        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement
        
        char value5 = 'A';
        char value6 = 'a';
        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        // NOTE: with strings NEVER use "==" ALWAYS use ".equals()"
        
        String word1 = "edgy";
        String word2 = "edGy";
        
        if (word1.equals(word2)) {
            System.out.println("W1==W2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("W1 kind of == W2");
        }
        else {
            System.out.println("W1!=W2");
        }
        
        // As an optional way to combine logic using: "and" "or" "not"
        // "and" means BOTH   must be true - uses the symbol "&&"
        // "or"  means EITHER can  be true - uses the symbol "||"
        // "not" reverse logic (so false)  - uses the symbol "!" 
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 18 && iq > 90) {
            // with "and" ("&&") BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0) {
            // with "or" ("||") EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Loops ARE just like conditional statements (like "if") BUT the code
        // keeps repeating while something is TRUE...
        
        // Simple loop
                
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;  // Shorthand for "counter = counter + 1"
        }
        
        // Loop with a string...
        
        String password = JOptionPane.showInputDialog("Create a password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            password = JOptionPane.showInputDialog("Create another password");
        }
        
        JOptionPane.showMessageDialog(null, "Ok, continue...");
        
        // The next type of loop is rarely used (you may never need it)
        // it tests for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";        
        
        do {            
            choice = JOptionPane.showInputDialog("Enter password");
        } while (choice.equalsIgnoreCase(password) == false);
        
        JOptionPane.showMessageDialog(null, "You got it");
        
        // The "for" loop is used for counting (and for the upcoming unit 
        // called "arrays"). It is a much more technical ("codey") looking loop
        // The inside of the round brackets means: ( start ; end ; change)        
        // The for loop creates its own variable (by default NetBeans calls
        // it "i") - short for "iteration"
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // start at 100
            // end (stop) at zero (including zero)
            // count down (not up)
            // count by 10s (not 1s)

        for (int counting = 100; counting >= 0; counting -= 10) {
            System.out.println("counting = " + counting);
        }
        
        // After you autocomplete a for loop (by typing "for" then tab),
        // you can immediately rename the varaible "i" (which is highlighted)
        // to whatever you want, if you press tab a second time, it will 
        // highlight the ending value of the loop

        // One more for "fun"

        for (double i = 99.789; i > 15.6; i/=5.25) {
            System.out.println("i = " + i);
        }

        ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // Create welcome screen for the user (message dialog box)
        JOptionPane.showMessageDialog(null, 
                         "You are an intern at radio station, C-RAP, The \n"
                       + "disk jockeys announce the current temperature \n"
                       + "in both Fahrenheit and Celsius every half-hour.\n"
                       + "They would like an easy way to display both the \n"
                       + "Fahrenheit and Celsius temperatures quickly and \n"
                       + "at the same time. The local airport phones in \n"
                       + "the temperature (but only in Celsius). They \n"
                       + "have requested that you develop an application \n"
                       + "that will display both temperatures after the \n"
                       + "Celsius temperature is inputted. Note: Use \n"
                       + "this conversion formula F = (C ∗ 1.8) + 32"); 
        
        // Get user input (temperature in celcius) - dialog
        String userInput = JOptionPane.showInputDialog("Enter temperature "
                + "in Celcius");

        // Convert this to a number I can do math with
        double celcius = Double.parseDouble(userInput);
        
        // Apply a formula  (F = (C ∗ 1.8) + 32 )
        double fahrenheit = (celcius * 1.8) + 32;
        
        // Show the user the results (fahrenheit) in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        
        // Show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        // When preparing this for hand in, you should first:
            // Make sure all comments are done
            // Clean up your code (see tip 13 below)
            // Watch out for long code lines (beyond the border)
            // Set NetBeans for printing a PDF (see tip 14 below)
            // Create as many screen captures as needed to prove it works
        
        // This line terminates any running java program at any point
        // System.exit(0);
        
        // Curly brackets (braces, parenthesis) { and } are important - all 
        // code goes between these two brackets     
    }

    /**
    * Learn the content of the methods unit (unit 2)
    */
    private static void learnMethods() {
        System.out.println("Starting to Learn methods...");
        
        // Methods (functions, procedures, actions) are named in a style like 
        // variables are named (lowercase then camel casing), but use verb
        // type words starting with lowercase then using camel casing the
        // presense of round brackets ( ) indicate a method. We make methods
        // for: (1) to break up a problem (2) reusability (3) to avoid 
        // repeating code
        
        // Code to "jump" to a method, is "calling" the method (method call)
        writeStar();
        
        // Call it again...
        writeStar();
                
        // When we call a method, we place "data" (information) inside the
        // round brackets and that data is "passed" (sending) over to the 
        // method. The data being passed is technically called the "argument"
        // and the data being received is called the "parameter(s)". You can
        // always change the arguement.
        
        write("Phenakistoscope");
        write("Volleywood");
        write("pancakes");
        write("Spider-man");
        write("Batman");
        
        // You can have more than one, multiple parameters/arguments in a
        // method which are seperated with commas ","
        
        writeLotsOf("Dalmations", 101);
        
        writeLotsOf("Problems", 99);
        
        // You can make methods that "send back" (output) information, the 
        // previous methods needed information (inputs) as parameters or 
        // empty brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        // Overloaded methods are methods with the same name, BUT different
        // parameters / arguments
        
        output("Hello");
        
        output("Good-bye", "Learning Methods");
        
        System.out.println("Completed Learning Methods!"); 
    }
    
    /**
     * Writes a star on the screen
     */
    private static void writeStar() {
        System.out.println("*");
    }

    /**
     * Writes something on the screen
     * 
     * @param thing the something to write
     */
    private static void write(String thing) {
        // Information (data) "passed" to this method is called the parameter,
        // if you use the lightbulb to write this method, you should (do this 
        // first) rewrite the name of that parameter
        System.out.println(thing);
    }

    /**
     * Writes something on the screen multiple times
     * 
     * @param thing the something to write
     * @param times how many times to write it
     */
    private static void writeLotsOf(String thing, int times) {
        // Methods can have no parameters, one parameter, or lots of parameters,
        // if it has more than one parameter, they are separated by commas
        for (int i = 0; i < times; i++) {
            write(thing);
        }
    }

    /**
     * Gives you a random number
     * 
     * @return a random number between 1 and 10
     */
    private static int giveMeNumber() {
        // Methods can have no outputs (the word "void") or they can have
        // ONE output which means the method will "return" (the keyword to use)
        // that data type defined in the method signature line
        return random(1, 10);
    }
    
    /**
     * Generates a random number in range between two numbers
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number less than or equal to the low and greater than
     * or equal to the high
     */
    private static int random(int low, int high) {
        double seed   = Math.random();                  // Seed value (random)
        double L      = (double)low;                    // Casting in to double
        double H      = (double)high;                   
        double number = (H - L + 1) * seed + L;         // Formula
        return (int)number;                             // Cast back to int
    }

    /**
     * Display text in a dialog
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Displays text in a dialog with a title at the top of that dialog
     * 
     * @param text the text to display
     * @param title what to show at the top (title) of the dialog
     */
    private static void output(String text, String title) {
        // Overloaded methods are methods with the same name, BUT diferent 
        // parameter(s) / arguement(s) so we know which version of the 
        // method to call
        JOptionPane.showMessageDialog(null, text, title, 
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Learn the content of the arrays unit (unit 3)
    */
    private static void learnArrays() {
        System.out.println("Start learning arrays...");
        
        // Create (declare) a variable for comparison
        int variable = 5;
        
        // E.g. in memory a variable could "look" like...
        //
        //          +-------+
        // variable |   5   | (type integer)
        //          +-------+
        // Now declare (create) an array:
        
        int array[] = new int[5];
        
        // type name [square brackets] = new type [size of the array];
        // array names are usually "plural" words
        // E.g. in memory an array could "look" like...
        //
        //       +-------+-------+-------+-------+-------+
        // array |       |       |       |       |       | (a length of 5)
        //       +-------+-------+-------+-------+-------+
        //
        //
        // The square brackets "[  ]" in code indicate we are using an array, 
        // the word "new" is used because arrays (they are technically 
        // "advanced" data types) are more complicated than variables (which 
        // are "simple" or "primitive" data types) then you repeat the data 
        // type ("int" in this case) and the square brackets are also repeated 
        // with a number (or a variable) inside - this number represents the 
        // SIZE of the array. When arrays are first created, they are EMPTY.
        // The array has now 5 "spots" (or "index", "elements", "subscript")
        // which automatically numbers them - BUT the first spot is ALWAYS
        // numbered as spot zero and the rest and numbered in order:
        //
        //       +-------+-------+-------+-------+-------+
        // array |       |       |       |       |       | (indexed)
        //       +-------+-------+-------+-------+-------+
        //           0       1       2       3       4
        
        // Now we assign values to all individual spots (indices):
        array[0] = 25;
        array[1] = 250;
        array[2] = 2;
        array[3] = -25;
        array[4] = 0;
        
        //       +-------+-------+-------+-------+-------+
        // array |   25  |  250  |   2   |  -25  |   0   | (now filled)
        //       +-------+-------+-------+-------+-------+
        //           0       1       2       3       4
        
        // These next lines would be errors when the code runs:
        // array[5] = 25;
        // array[-1] = 25;
        // They would be "out of bounds" errors (or "range" error)
        
        // Declare an array (a little different) of NO size...  
        double[] a;
        
        // In memory...
        //
        // a
        //
        
        // Later on (in the code) you can re-create (re-declare, re-dimension, 
        // or resize) using the same array but now giving it some size (but 
        // still empty)
        a = new double[3];
        
        // In memory....
        //
        //   +----------+----------+----------+
        // a |          |          |          | (now has size of 3, but empty)
        //   +----------+----------+----------+
        //        0          1          2
        
        // Now fill the content
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;

        //   +----------+----------+----------+
        // a |   1.1    |   2.2    |   3.3    | (now it is filled with content)
        //   +----------+----------+----------+
        //        0          1          2
        
        // You can re-dimension (resize) an array multiple times, BUT
        // every time it wipes out any content stored in the array
        a = new double[5];
        
        //   +----------+----------+----------+----------+----------+
        // a |          |          |          |          |          | (size 5)
        //   +----------+----------+----------+----------+----------+
        //        0          1          2          3          4
        
        // Another way to declare arrays, but this way creates the array of
        // a set size, BUT with pre-filled values inside (make and fill at the
        // same time - on the same ONE line of code) - you can as an option,
        // put the "[]" beside the data type OR the array name
        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
        
        //       +------+------+------+------+------+
        // coins | 0.05 | 0.10 | 0.25 | 1.00 | 2.00 |  (has a length of 5)
        //       +------+------+------+------+------+
        //          0      1      2      3      4  
        
        // You can also create CONSTANT arrays that are pre-filled, the name
        // we gives array should be a plural word (e.g. 'scores' (array name)
        // not 'score' (variable name), 'names' not 'name', etc.)   
        
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Quit"
        };
        
        // When using arrays, use individual elements (spots, indices - the 
        // plural of "index") of the array like regular variables, for example
        
        int[] numbers = new int[100];
        
        // Change (assign) a index (spot) a value...
        numbers[99] = 333;
        
        //         +-----+-----+-----+
        // numbers |  ?  | ... | 333 | (length is 100)
        //         +-----+-----+-----+
        //            0    ...   99
        // Remember, the last index is always ONE LESS than the length
        
        // Output that spot
        System.out.println(numbers[99]);
        
        // Perform equations with array indices like variables
        numbers[0] = numbers[99] + numbers[99];
        System.out.println(numbers[0]);
        
        // To work with, and to "travel" (means to "visit" every spot) the 
        // entire array, we use a loop!
        
        // Specifically, the FOR loop!
        
        // for loops were literally built for arrays        
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }        
        // The for loop is perfect because it automatically (when I type "for"
        // and TAB) starts at 0, goes up by 1, is "less than" then ending 
        // number (which can be the length)
        
        // When using the for loop with arrays, it is even BETTER to use a
        // built-in feature of all arrays! All arrays have a ".length" feature
        // for example
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = " + numbers[i]);
        }
        // Tip: if type "for" TAB, then TAB AGAIN it jump to the ending value
        // So if the array size changes, the loop adapts to it
        
        // Array can easily work with methods, the arrays can be sent into a 
        // method (as one of multiple parameters, or the only parameter), and 
        // arrays can be outputted (returned) from a method - in other words:
        // Arrays can be INPUT(s) or OUTPUT from a method
        
        output(array);      // Send a array to a method as a parameter
        output(numbers);    // Call the method with a different argument
        output(coins);      // Overload the "output" method again
        
        int[] randoms = random(1, 10, 50);    // Overload "random" method
        output(randoms);
        
        // Multi-dimensional array (also known as a "array of arrays", or a 
        // array filled with other arrays, 2D, etc.) - and also known as a 
        // table, grid, or a MATRIX
        
        // not necessary but...
        
        // Create some constants to use when building the matrix (these are
        // not needed to declare a matrix, but they might help in understanding 
        // it) - we make contants as a way to "visualize" what we are building
        
        final int ROWS    = 30; // "dimension" going "down" (also like "y" axis)
        final int COLUMNS = 40; // "dimension" going "across" (also like "x")
        
        // We declare (create) a matrix , by adding multiple sets of square
        // brackets (a set of brackets for each dimension)
        
        char[][] matrix = new char[COLUMNS][ROWS];
        
        // If we "visualize this as a 3 by 4 matrix (3 rows by 4 columns), or 
        // y = 3 and x = 4, or a "height" of 3 and a "width" of 4, then it
        // could be "seen" as...
        //
        //               (columns, width, x axis is 4, meaning 0-3)
        //
        //                     0         1         2         3
        //                +---------+---------+---------+---------+
        // (rows,       0 |         |         |         |         |
        //  height,       +---------+---------+---------+---------+
        //  y axis      1 |         |         |         |         |
        //  is 3,         +---------+---------+---------+---------+
        //  meaning     2 |         |         |         |         |
        //  0-2)          +---------+---------+---------+---------+
        // 
        // A matrix "row" can also be "visualized" as the matrix "height"
        // A matrix "column" can also be "visualized" as the matrix "width"
        
        // Fill the matrix with random characters...
        // (using a method for random characters)
        
        final char LOW  = '!';
        final char HIGH = '~';
        
        // Test our method first...
        char character = random(LOW, HIGH);
        System.out.println("Random character was " + character);
        
        // Fill our matrix (meaning put content in every location/index/spot
        // in the matrix) by traversing (travelling, 'visit' every spot) the
        // matrix and adding random characters (our method) - when traversing
        // matricies (plural of matrix) we use multiple nested for loops
        
        // We might rename looping variables to better understand what the 
        // nested for loops are refering to (e.g. like row, column, x, y)
        // With Netbeans, when you rename a loop variable it renames all 3
        
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[column][row] = random(LOW, HIGH);
            }
        }
        
        // Ouptut the matrix, by turning the matrix into a single string (using
        // a new method) we can then output that string
        String text1 = toString(matrix);
        System.out.println(text1);
        
        // Optional graphical code...
        // (for adding images, changing fonts, font sizes, font colors, and 
        // background colors - it is not needed for most assignments or 
        // final projects)
        
        // Put this optional graphical code in a method, testing it first
        // with a simple string of text
        
        // Using arguments for the method: text, title, name of a image file
        
        // Images (pictures) have a longer name than most think they do...
        
        // For example the file named "cat" is really "cat.gif" and the
        // ".gif" is considered the "last" name (or extention) of the file.
        // "cat" is considered the "middle" name (the part the user types in)
        // The first name is the "path" (or location, folder, etc.)
        
        // TIP: save an image, then right click and go to "Properties" to 
        // get all the file name information you need 
        
        String text      = "Hello World";
        String title     = "Testing";
        String first     = "C:\\Users\\lawrence.wachs\\"
                         + "OneDrive - St. James-Assiniboia School Division\\"
                         + "Documents\\2022-2023\\Projects\\Java\\"
                         + "ComputerScience30S\\";
        String middle    = "cat";
        String last      = ".gif";
        String imageName = first + middle + last;
        
        // Now call the method to test it...
        message(text, title, imageName);
        
        // Now use the method again with our matrix...
        imageName = first + "matrix" + last;
        message(text1, "The Matrix", imageName);
        
        // One more optional way to create (declare) matrices is to make them
        // with pre-set values (like regular arrays)        
        final char[][] TIC_TAC_TOE = {
            { 'X', 'O', 'X' },
            { 'O', 'X', 'O' },
            { 'X', 'O', 'X' }
        };        
        String text2 = toString(TIC_TAC_TOE);
        System.out.println(text2);
        imageName = first + "TicTacToe" + last;
        message(text2,"Tic-tac-Toe",imageName);
        
        System.out.println("Completed learning arrays!");
    }

    /**
     * Outputs an array of integers in a dialog
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        // Array can be a parameter (or one of the parameters) of a method
        String text = "[";
        // Loop (traverse) through the array and add the contents to the string
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + ",";
        }
        text = text + "]";
        output(text);           // Outputs it by calling an overloaded method
    }

    /**
     * Convert all the doubles into integers and then output the array in a 
     * dialog
     * 
     * @param array the array of doubles
     */
    private static void output(double[] array) {
        int[] a = convert(array);   // Create int array of converted doubles        
        output(a);                  // Now output the converted array
    }
    
    /**
     * Converts an array of doubles into an array of integers
     * 
     * @param array the array of doubles
     * @return an array of integers
     */
    private static int[] convert(double[] array) {
        // Methods can return (output) entire arrays
        int[] a = new int[array.length];      // Create empty array (same size)
        for (int i = 0; i < a.length; i++) {  // Traverse the array
            a[i] = (int)array[i];             // Cast the double into a int
        }        
        return a;
    }
    
    /**
     * Generates an array of a set size filled with random integers in the 
     * range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    private static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // Create empty array of passed size
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low, high); // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }

    /**
     * Generates a random character between tow low and high characters
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    private static char random(char low, char high) {
        return (char)random((int)low, (int)high);     // cast to int and back  
    }
        
    /**
     * Change the matrix into a single string (for outputting)
     * 
     * @param matrix the 2D array of characters
     * @return a single string representing the matrix
     */
    private static String toString(char[][] matrix) {
        String text = "";   // Create string variable to store all values
        // Use the nested for loops (with simplier varaibles names) and
        // use the ".length" but also in the nested loop, we will use 
        // the ".length" of that particular array
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                // Means the length of "this row"  
                text = text + matrix[r][c] + " ";
            }     
            text = text + "\n";     // Add a line break after each row
        }     
        return text;            // Return the filled up string
    }

    /**
     * Displays a 'graphical' version of the message dialog (for JOptionPane)
     * to the user, including a custom image, colors (background / foreground),
     * new font (includes the type of font and the size) along with text and 
     * title.
     * 
     * @param text what text to show in the dialog
     * @param title the title at the top of the dialog
     * @param imageName the full (first, middle, last) name of the image 
     */
    private static void message(String text, String title, String imageName) {
        // We set up some 'graphical' "things" to make the dialog more 
        // interesting by 'importing' the code that does this (we are not 
        // writing that specific code, we are 'using' others code)
        
        // Using capital letters and importing (using the lightbulb) and a line
        // similar to the way we declare arrays, and using round brackets 
        // (implies a method? - we will study in the next unit 'classes') 
        
        Color background = new Color(0,0,0);
        // The three numbers in "Color" are for red, green and blue values 
        // from 0 (no amount) up to 255 (the maximum amount of that color)         
        Color foreground = new Color(0,255,0);
        
        // Fonts are done the same way (import, declare them) 
        Font font = new Font("Consolas", Font.PLAIN, 14);        
        // Inside the bracket we put the font name (must be installed on this 
        // computer), style (e.g. plain, bold, underline, etc.) - uses a 
        // CONSTANT style, and finally the font size (in points)
        
        // For image, we need an image file downloaded onto the computer and we  
        // need the NAME of that image (name includes the ending part or 
        // extension, and I also need the path to get to that image / folder).
        // To do this, right click and go to properties and "Location" and 
        // copy/paste. It will change the "\" to two "\\" and also type two of 
        // those at the end...
        
        // Create a "icon" for the image (icon is like a picturebox) and also 
        // use "ImageIcon" - connected to the image name (which is the actual 
        // image on our computer) 
        
        Icon image = new ImageIcon(imageName);
        
        // Now need something that can display the fonts and colors - called a 
        // "text area" (can use intellisense, with CTRL + SPACE, which 
        // automatically imports it)           
        JTextArea area = new JTextArea();
        
        // Now we add things into the area, using methods built into the text 
        // area object
        area.setText(text);
        area.setBackground(background);
        area.setForeground(foreground);
        area.setFont(font);
        
        // Now we finally display the dialog box, BUT we USE the text area and 
        // the image in the dialog as parameters
        JOptionPane.showMessageDialog(
                null,
                area,
                title,
                JOptionPane.PLAIN_MESSAGE,
                image
        ); 
    }

    /**
     * Learn the content of the classes unit (unit 4)
     */
    private static void learnClasses() {
        System.out.println("Start Learning classes...");
        
        // Create a "person" (add a class called "Person" to this Java project)
        // To do this:
        // (1) Click on the menu: File -> New File (or the icon on the toolbar)
        // (2) A dialog box will appear and you select "Java" and "Java Class"
        // (3) Then Next...
        // (4) Then name it (starts with a capital letter and camel casing)
        // (5) Then click Finish!
        
        // We use a line of code like this:
        // Random random = new Random();
        
        Person person = new Person();
        
        // Class object = new Class() <--- implies a method?
        // (that is the call to the constructor method)
        
        // We "call" (invoke) a method within the object
        person.talk();
        
        // Use (call,invoke) other methods and change properties        
        // person.born(); --> we removed this method
        person.name   = "John Smith";
        person.gender = "male";
        person.talk();
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Create (instantiate) another object with a different (overloaded) 
        // constructor...
        Person other = new Person("Another name");
        other.birthday();
        other.talk();
        
        // Another instance using the 3rd constructor option...
        Person third = new Person("Ghostface",53,"monster");
        third.birthday();
        third.talk();
        // Try to change a property that we have marked (modified) to
        // be private (meaning it is "encapsulated")
        // third.age = 10;
        
        // Create a student object and change properties, and call methods...
        Student student = new Student("Student Person",15,"Student",100);
        // The next line is no longer needed...
        // student.name = "Student Person";
        
        student.talk();     // A method inherited from Person (the super class)
        student.study();    // A method created just inside Student
        student.talk();
        student.slackOff();
        student.talk();
        student.birthday();
        student.talk();
        student.die();
        student.talk();
        
        // Create a Teacher object and call it's methods...
        Teacher teacher = new Teacher("Ms. McTeacherson");
        teacher.students[0] = student;
        // Creating "annonymous" student objects to add to the teacher
        teacher.students[1] = new Student("Flash Thompson", 16, "male", 101);
        teacher.students[2] = new Student("MJ Watson", 16, "female", 102);
        teacher.students[3] = new Student("Ned Leeds", 16, "male", 103);
        teacher.teach();
                
        // Create husky object
        Husky husky = new Husky("Havoc",18,"Dog",2665);
        husky.talk();           // Inherited but doubly over-ridden method
        husky.study();          // Method inherited from Student
        husky.talk();
        husky.birthday();       // Method inherited from Person
        husky.talk();
        
        // Create meeting object
        Meeting meeting = new Meeting();
        meeting.attend(person);
        meeting.attend(other);
        meeting.attend(third);
        meeting.attend(student);
        meeting.attend(teacher);
        meeting.attend(husky);
        meeting.hold();
        
        System.out.println("Complete Learning classes");
    }
    
}


// <editor-fold>


// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5)  Click the green triangle on the top toolbar to run code
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)
// (8) To "comment out" chunks of code, select the code with your mouse or 
//     your keyboard, then click on one of the two buttons under the code tab
//     (on the right)
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click the lightbulb)
// (11) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (12) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (13) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (14) To have NetBeans automate code comments for assignments, select the 
//      code below this tip, and uncomment it (see tip 8) and then copy the 
//      same (uncommented) code. Then go to the menu: Tools -> Templates, and
//      scroll down and click on the "+" beside "Java", and select 
//      "Java Main Class", and "Open in Editor" and the enter (paste) this into
//      the template (instead of the text that is already there). Then close 
//      and save the Template so it now applies to every new project you make...
//
///** Required package class namespace */
//package ${package};
//
//
///*
// * ${name} - description
// * 
// * @author Your Name
// * @since ${date}
//*/
//public class ${name}
//{
//
//    /**
//     * Main method for the project
//     * 
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
//
//}
//
// (15) When preparing code for hand in: I would suggest the first option, but
//      you can also do the second: (A) Go to the menu File -> Print to HTML...
//      click Browse to select a location and name the file (end the name with
//      ".html") to save a HTML file with all your code (it will already be
//      properly formatted. (B) Alternatively, you can "print" your code to a
//      PDF file but first you need to set NetBeans (this only needs to be done
//      once), by clicking on "Print Options" and uncheck everything previously
//      checked off, and then check off "Print as in Editor", then either print
//      it to a PDF (which means select "Microsoft Print to PDF" on the next 
//      screen), or cancel and resize the code to fit better (see tip #1) and 
//      then print again
// (16) The + and - signs and gray lines along the left side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (17) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 10) will help you write it
// (18) If you hold down the CTRL key, method calls become links with the
//      mouse to jump to the method (even ones we don't write)
// (19) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (20) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
// (21) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line
// (22) NetBeans can auto comment methods if you type "/**" above the method
//      signature line, it will add the comment and define what needs to be
//      commented for the method (using the "JavaDoc" commenting style)
// (23) All arrays have a ".length" feature built in that you can have NetBeans
//      autocomplete for you by typing the name of your array, then dot length
//      (".length") which automatically gives you how many elements are in
//      the array
// (24) When writing for loops with array, if you type "for" then press TAB, 
//      and then press TAB AGAIN it jump to the ending value (which should be 
//      the ".length" of the array (so if the array size changes, the loop 
//      adapts to it) - the loop variable "i" also represents the array "index"
// (25) To look at code in two places at once, go to the menu: View -> Split
//      to split the screen and View -> clear to reset it

// </editor-fold>

