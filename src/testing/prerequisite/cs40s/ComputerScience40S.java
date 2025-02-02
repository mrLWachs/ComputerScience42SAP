
/** Required package class namespace */
package testing.prerequisite.cs40s;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;


/**
 * ComputerScience40S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course. It also introduces the concept of Unit testing. This is 
 * a larger concept in Computer Science, but it basically a way of testing a 
 * unit (which tries to be the smallest piece of code that you can isolate). 
 * It relates to larger concepts like "TDD" (test driven development), 
 * "JUnit" (testing for the Java programming language), etc. More can be 
 * researched here:
 * https://en.wikipedia.org/wiki/Unit_testing
 * And it will come up more if you continue your studies in Computer Science 
 * beyond high school.
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class ComputerScience40S 
{

    /**
     * Default class constructor, runs on instantiation
     * 
     * @param state state the run state of this code module
     */
    public ComputerScience40S(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 40S course content not running");
            return;
        } 
        Simulator.title("Computer Science 40S Course:"); 
        RecursionTest       unit1 = new RecursionTest(); 
        AdvancedClassesTest unit2 = new AdvancedClassesTest(); 
        CollectionsTest     unit3 = new CollectionsTest();   
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
// (16) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (17) If you hold down the CTRL key, method calls become links with the
//      mouse to jump to the method (even ones we don't write)
// (18) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 10) will help you write it
// (19) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (20) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
// (21) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make
// (22) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line
// (23) All arrays have a ".length" feature built in that you can have NetBeans
//      autocomplete for you by typing the name of your array, then dot length
//      (".length") which automatically gives you how many elements are in
//      the array
// (24) When writing for loops with array, if you type "for" then press TAB, 
//      and then press TAB AGAIN it jump to the ending value (which should be 
//      the ".length" of the array (so if the array size changes, the loop 
//      adapts to it) - the loop variable "i" also represents the array "index"
// (25) To view the same code editing window with two different views, go to
//      the menu View -> Split -> Vertical (or Horizontal) and Clear when done
// (26) To modify the template of all new classes, Tools -> Templates, scroll 
//      down and click on the "+" beside "Java", select "Java Class" and use 
//      ALL the code (uncommented) below:
//
///** Required package class namespace */
//<#if package?? && package != "">
//package ${package};
//
//</#if>
// 
///**
// * ${name}.java - description
// *
// * @author Mr. Wachs
// * @since ${date}, ${time}
// */
//public class ${name} 
//{
//
//    /**
//     * Default constructor, set class properties
//     */
//    public ${name}() {
//        
//    }
//     
//    /**
//     * String representation of this object
//     *
//     * @return The object represented as a String
//     */
//    @Override
//    public String toString() {
//        return "${name}: " + super.toString();
//    }
//   
//    /**
//     * Deep comparison, determines if two objects are "equal" in this context
//     *
//     * @param object the object to compare to
//     * @return the objects are "equal" (true) or not (false)
//     */
//    @Override
//    public boolean equals(Object object) {
//        return super.equals(object);
//    }
//       
//    /**
//     * a Deep clone, creates a duplicate object using new memory
//     *
//     * @return a "clone" of the object using new memory
//     */
//    @Override
//    public ${name} clone() {
//        return this;
//    }
//    
//}

// </editor-fold>