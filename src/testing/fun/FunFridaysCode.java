/** Required package class namespace */
package testing.fun;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;


/**
 * FunFridaysCode - this is some of the "extra" learning we have done in our
 * course for both "Fun Fridays" and "new content Thursdays"
 * 
 * @author Mr. Wachs
 * @since Mar 4, 2024
*/
public class FunFridaysCode
{
    
    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public FunFridaysCode(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Fun Friday (and Thursday) content not running");
            return;
        }
        Simulator.title("Fun Friday (and Thursday) Content:"); 
    }

}