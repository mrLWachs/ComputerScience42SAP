
/** Required package class namespace */
package utility.io;

import utility.tools.WebPage;


/**
 * System.java - this class simulates the java.lang class that does the 
 * standard outputs and redirects those outputs to a custom simulator
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class System 
{

    
    /**
     * Internal class to properly simulate the java.lang.System.out class
     */
    public static class out 
    {
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(Object object) {
            Simulator.output(object,true);
            
            if (object == null) object = new String("null");
            String text = object.toString();
            WebPage.addNewLine(text);
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
            Simulator.output(object,false);

            if (object == null) object = new String("null");
            String text = object.toString();
            WebPage.addLine(text);
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
    
    /**
     * Exits the application
     * 
     * @param status the exit status
     */
    public static void exit(int status) {
        Simulator.exit(status);
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
