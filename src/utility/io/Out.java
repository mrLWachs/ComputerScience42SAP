/** Required package class namespace */
package utility.io;
 
/** Required API imports */
import testing.Tester;
import utility.tools.WebPage;


/**
 * Out.java - class to properly simulate the java.lang.System.out class
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Out 
{
    
    /**
     * Default constructor, set class properties
     */
    public Out() { }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(Object object) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.output(object, true);
            if (object == null) {
                object = new String("null");
            }
            String text = object.toString();
            WebPage.addNewLine(text);
        }
        else {
            java.lang.System.out.println(object);
        }
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(boolean object) {
        println(new Boolean(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(int object) {
        println(new Integer(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(long object) {
        println(new Long(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(float object) {
        println(new Float(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void println(double object) {
        println(new Double(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(Object object) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.output(object, false);
            if (object == null) {
                object = new String("null");
            }
            String text = object.toString();
            WebPage.addLine(text);
        }
        else {
            java.lang.System.out.print(object);
        }
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(boolean object) {
        print(new Boolean(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(int object) {
        print(new Integer(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(long object) {
        print(new Long(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(float object) {
        print(new Float(object));
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public static void print(double object) {
        print(new Double(object));
    }

}