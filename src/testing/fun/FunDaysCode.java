/** Required package class namespace */
package testing.fun;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;


/**
 * FunDays - this is some of the "extra" learning we have done in our
 * course for both "Fun days" and "new content days"
 * 
 * @author Mr. Wachs
 * @since Mar 4, 2025
*/
public class FunDaysCode
{
    
    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public FunDaysCode(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Fun days content not running");
            return;
        }
        Simulator.title("AP Student Driven 'fun' Days Learning:");
        ArrayListTest     sesson1 = new ArrayListTest();
        SearchingTest     sesson2 = new SearchingTest();
        SortingTest       sesson3 = new SortingTest();
        StringMethodsTest sesson4 = new StringMethodsTest();
    }

}