
/** Required package class namespace */
package testing.cs42sap.additional;
 
/** Required API imports */
import utility.io.Simulator;


/*
 * UpCastingDownCastingExamples - This class is an example 
 * 
 * SPECIFICS FROM THE CURRICULUM....
 * 
 *   - 4.16.A.1 A recursive method is a method that calls itself. Recursive 
 *              methods contain at least one base case, which halts the 
 *              recursion, and at least one recursive call. Recursion is another 
 *              form of repetition.
 * 
 * @author Mr. Wachs
 * @since Apr 7, 2026, 2:23:33 PM
 */
public class UpCastingDownCastingExamples 
{
    
    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting Upcasting and Downcasting Examples");
        new UpCastingDownCastingExamples();
        Simulator.title("\nCompleted Upcasting and Downcasting Examples");
    }
    
    /**
     * Default constructor, set class properties
     */
    public UpCastingDownCastingExamples() {
        System.out.println("Learn about Upcasting and Downcasting............");
        
        ////////////////////////////////////////////////////////////////////////
        // (1) RECURSION:
        ////////////////////////////////////////////////////////////////////////
        //
        // - A recursive method is a method that calls itself. Recursive 
        //   methods contain at least one base case, which halts the 
        //   recursion, and at least one recursive call. Recursion is another 
        //   form of repetition.
        // - Each recursive call has its own set of local variables, 
        //   including the parameters. Parameter values capture the progress 
        //   of a recursive process, much like loop control variable values 
        //   capture the progress of a loop.
        // - Any recursive solution can be replicated through the use of an 
        //   iterative approach and vice versa.
        //
        // A recursive method with a base case and recursive case and how it
        // would have been implemented iteratively (with a loop)
        ////////////////////////////////////////////////////////////////////////        
        
        System.out.println("Completed Upcasting and Downcasting..............");
    }
    
}