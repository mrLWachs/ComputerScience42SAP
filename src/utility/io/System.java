
/** Required package class namespace */
package utility.io;

/** Required API imports */
import testing.Tester;


/**
 * System.java - this class simulates the java.lang class that does the 
 * standard outputs and redirects those outputs to a custom simulator
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class System 
{

    /** The output stream class */
    public static Out out;
    
    /**
     * Default constructor for the class
     */
    public System() {  }

    /**
     * Exits the application
     * 
     * @param status the exit status
     */
    public static void exit(int status) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.exit(status);
        }
        else {
            java.lang.System.exit(status);
        }
    }
    
    /**
     * Simulates the method from System to copy an array from the specified 
     * source array, beginning at the specified position, to the specified 
     * position of the destination array.
     * 
     * @param src the source array
     * @param srcPos starting position in the source array
     * @param dest the destination array
     * @param destPos starting position in the destination data
     * @param length the number of array elements to be copied
     */
    public static void arraycopy(
            Object src,
            int srcPos,    
            Object dest,    
            int destPos,    
            int length) {
        java.lang.System.arraycopy(src,srcPos,dest,destPos,length);
    }

}
