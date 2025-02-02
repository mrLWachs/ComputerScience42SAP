/** Required package class namespace */
package testing.postsecondary;
 
/** Required API imports */
import testing.Tester;
import utility.io.Simulator;

/**
 * MorePostSecondaryContent.java - this is Computer Science content that goes
 * beyond the CS20S, CS30S, CS40S, and even the CS42SAP Computer Science 
 * curriculum. It is useful content for post-secondary studies in Computer 
 * Science at the university of college level Computer Science programs.
 *
 * @author Mr. Wachs
 * @since Apr 12, 2024, 2:03:21 p.m.
 */
public class MorePostSecondaryContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public MorePostSecondaryContent(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("More post secondary content not running");
            return;
        }
        Simulator.title("More post secondary content:"); 
        new PermanentStorageTest(state);
        new StacksQueuesTest(state);
        new SearchSortTest(state);   
        new TreesTest(state); 
    }
     
}