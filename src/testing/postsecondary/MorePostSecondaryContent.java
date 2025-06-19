/** Required package class namespace */
package testing.postsecondary;
 
/** Required API imports */
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
     */
    public MorePostSecondaryContent() {
        if (Simulator.check("More Post Secondary")) return;
        new PermanentStorageTest();
        new StacksQueuesTest();
        new SearchSortTest();   
        new TreesTest(); 
    }
     
}