
/** Required package class namespace */
package mainpackage;

/** Required API imports */
import testing.Tester;


/**
 * MainClass.java - the main class for this project
 *
 * @author Mr. Wachs
 * @since February 2026
 */
public class MainClass 
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Tester();  
        //new Tester(Tester.TEST_CS42SAP_CURRICULUM);          
    }
    
}

// <editor-fold> 

// NETBEANS TIPS:
// ==============
//
// UNIT 1: Introduction To Java.................................................
//
// (1)  To build a new Java coding project in NetBeans, start Netbeans
//      then click "File -> New Project..." and choose "Java with Ant" 
//      and "Java Application", then click "Next >" give your project
//      a name that makes sense and in a location you can remember
//      then click "Finish" ... start coding!
// (2)  To zoom in and out on the code, hold ALT and roll the mouse
// (3)  Double click the top of a tab to hide side windows or show them
// (4)  The curly brackets (braces, parenthesis) are important "{" and "}" so
//      do not remove them or an error may occur
// (5)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (6)  Click the green triangle on the top toolbar to run code
// (7)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (8)  The word "null" means "nothing" and can often act as a placeholder for 
//      code you often do not need (right now)
// (9)  To "comment out" chunks of code, select the code with your mouse or 
//      your keyboard, then click on one of the two buttons under the code tab
//      (on the right)
// (10) To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (11) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
// (12) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (13) To make projects easier and automate some tasks, go to 
//      Tools -> Templates, scroll down and click on the ">" beside "Java", 
//      select "Java Main Class", and "Open in Editor" and the enter 
//      the text below (by uncommenting it, then copying it, and pasting it 
//      into the temple (first delete all the text in the template and then 
//      replace what is there with this by pasting it):
//
///** Required package class namespace */
//package ${package};
//
//
///*
// * ${name} - description
// * 
// * @author YOUR NAME
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
// (14) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (15) When preparing a solution for hand in, when in NetBeans (after the  
//      code is cleaned up and ready - see tip 13) go to:
//      "File -> Print to HTML..." and then use the dialog box that appears
//      to select a location you can find the HTML file, and give the file  
//      you are saving a good name (with your name in the file name). Do 
//      not forget to also create a file (a Microsoft Word file is 
//      recommended) that has screen captures (pictures) to prove your 
//      program ran. Make as many or few to prove your solutions works 
//      (this is part of the mark). Note: when naming both files (outputs and
//      code files) make sure you include YOUR NAME in the file name itself.
//      Then hand in both the code file (html) and the outputs file (Word file)
//      on Mr. Wachs' hand in page here: https://bit.ly/3iiTvbu
// (16) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      button at the top of this dialog, then click on the "Formatting" Tab.
//      Then under "Language" select "Java" and under "Category" choose 
//      various categories and make adjustments to your preferred style (see 
//      Mr. Wachs if you cannot find the style change you want)
//
// UNIT 2: Methods..............................................................
//
// (17) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (18) If you hold down the CTRL key, method calls become links with the
//      mouse to jump to the method (even ones we don't write)
// (19) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip #11) will help you write it
// (20) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line
// (21) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (22) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make
// (23) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
//
// UNIT 3: Arrays...............................................................
//
// (24) When your code "crashes" and an error takes place (run-time error) try
//      to READ what the error says down in the output window of NetBeans as
//      it may offer clues on how to debug the error (and click on the links)
// (25) When writing for loops with array, if you type "for" then press TAB, 
//      and then press TAB AGAIN it jump to the ending value (which should be 
//      the ".length" of the array (so if the array size changes, the loop 
//      adapts to it) - the loop variable "i" also represents the array "index"
// (26) To view the same code editing window with two different views, go to
//      the menu View -> Split -> Vertical (or Horizontal) and Clear when done
//
// UNIT 4: Classes..............................................................
//
// (27) To add a new class to a project, you can: (1) Click on File -> New File,
//      and a dialog will appear and you select "Java" and "Java Class", click 
//      next, give it a name (start with a capital letter and then use camel 
//      casing), then click finish, (2)Click on the first button on the Toolbar 
//      to the left and then follow the same instructions as #1, (3) Right 
//      click in "Projects" left side window in NetBeans on the "package" name
//      (e.g. "computerscience30s") and then select "New" and "Java Class..." 
//      from the flyout menus and then give the class a name and click finish
// (28) The "Navigator" left side window when looking at classes uses custom
//      colors and icons to identify specific pasts of the class at a glance. 
//      For example, methods use a red circle, properties use a blue square, 
//      constructor methods use a orange diamond, private properties or methods
//      use a "lock" icon, etc.
//
// UNIT 5: Graphics and User Interfaces (GUI)...................................
//
// (29) To have NetBeans help you build a user interface (UI) with a visual 
//      designer similar to the one used in Visual Studio, you go to 
//      "File -> New File" and  select "JFrame Form" and the UI editor will 
//      appear
// (30) To switch between code and the designer, use the buttons under the 
//      name of the file with the tabs named "Source" and "Design"
// (31) Use the editor's "Palette" and "Properties" windows to build and change
//      the design and then adding code as needed by either double clicking the
//      object you want to add code to, or right clicking the object and 
//      selecting "Events" and then the action event you want
// (32) To "name" all the objects in NetBeans (although in this course that is
//      not required) right click on each object and selecting "Change Variable
//      Name..." and then type in a new name
// (33) The NetBeans visual designer adds a constructor method with a call to
//      a method called "initComponents()" - do not erase this line as it sets
//      up the UI for you
// (34) The NetBeans WYSIWYG visual designer also adds a version of the "main"
//      method to this class of code (each JFrame form when added also adds a 
//      main method for each JFrame form (just like the original class file 
//      when you build a project). You can certainly delete that original 
//      project class file, and then the project will use a JFrame version of 
//      main when the project runs (when you click the green triangle on the
//      toolbar) or you can delete the main method and have other code call 
//      this class's constructor to show the form
//
// UNIT: CS40S................................................................
//
// (35) To modify the template of all new classes, Tools -> Templates, scroll 
//      down and click on the "+" beside "Java", select "Java Class" and use 
//      ALL the code (uncommented) below:
//
///** Required package class namespace */
//package ${package};
// 
///**
// * ${name}.java - description
// *
// * @author YOUR NAME
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
