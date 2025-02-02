
/** Required package class namespace */
package testing;

/** Required API imports */
import testing.fun.FunFridaysCode;
import testing.postsecondary.MorePostSecondaryContent;
import utility.io.Simulator;

 
/**
 * BonusContentCS42SAP.java - some bonus Computer Science content used to 
 * enhance the curricular content (covered if time permits and may change to 
 * be tailored to student needs) and to better prepare students for specific 
 * post-secondary Computer Science programs. 
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class PostSecondaryContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public PostSecondaryContent(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP Post Secondary content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP Post Secondary Content:");   
        new FunFridaysCode(state); 
        new MorePostSecondaryContent(state);  
    }
     
}