
/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import io.Simulator;
import testing.cs42sap.bonus.PermanentStorageTest;
import testing.cs42sap.bonus.SearchSortTest;
import testing.cs42sap.bonus.StacksQueuesTest;
import testing.cs42sap.bonus.TreesTest;

 
/**
 * BonusContentCS42SAP.java - some bonus Computer Science content used to 
 * enhance the curricular content (covered if time permits and may change to 
 * be tailored to student needs) and to better prepare students for specific 
 * post-secondary Computer Science programs. 
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class PostCourseContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public PostCourseContent(boolean shouldRun) {
        if (shouldRun) {
            Simulator.title("Computer Science 42SAP bonus content");         
            new PermanentStorageTest();
            new StacksQueuesTest();
            new SearchSortTest();   
            new TreesTest();  
        }
    }
     
}