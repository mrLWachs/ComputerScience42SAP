
/** Required package class namespace */
package testing.prerequisite.cs30s;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;

 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     * 
     * @param state state the run state of this code module
     */
    public LearnGraphics(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Learn Graphics content not running");
            return;
        }
        else if (state == Tester.RUN_SIMULATED) {
            Simulator.showFrame(null,"Graphics1");
            Simulator.showFrame(null,"Graphics2");
            Simulator.showFrame(null,"Graphics3");
        }
        else if (state == Tester.RUN_NORMAL) {
            System.out.println("Start learning Graphics and User Interfaces (UI)");
            // Create (instatitate) class object for the different graphics examples      
            // Create class objects for different examples
            Graphics1 graphics1 = new Graphics1();
            Graphics2 graphics2 = new Graphics2();
            Graphics3 graphics3 = new Graphics3();   
            // To add a class that uses the NetBeans visual editor (WYSIWYG) to 
            // create a User Interface (UI). You can add a "JFrame Form" to the 
            // project. The easiest way is to right click on the "package" in the
            // NetBeans Projects window, go to "New" and select "JFrame Form" and 
            // then name it. When using the WYSIWYG NetBeans UI editor to switch
            // over to code, there are small tabs under the tab for this class. 
            // One tab for "Source" (the code) and one for "Design" (visual
            // editor)       
            System.out.println("Completed Learning Graphics and UI!");
        }
    }

}