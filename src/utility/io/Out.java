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
    public void println(Object object) {
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
    public void println(boolean object) {
        Object o = (Object)object;
        println(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void println(int object) {
        Object o = (Object)object;
        println(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void println(long object) {
        Object o = (Object)object;
        println(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void println(float object) {
        Object o = (Object)object;
        println(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void println(double object) {
        Object o = (Object)object;
        println(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void print(Object object) {
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
    public void print(boolean object) {
        Object o = (Object)object;
        print(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void print(int object) {
        Object o = (Object)object;
        print(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void print(long object) {
        Object o = (Object)object;
        print(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void print(float object) {
        Object o = (Object)object;
        print(o);
    }

    /**
     * Simulates the 'Printing' of an object
     *
     * @param object The Object type to be 'printed'
     */
    public void print(double object) {
        Object o = (Object)object;
        print(o);
    }

}