
/** Required package class namespace */
package testing;

/** Required API imports */
import utility.io.Simulator;
import testing.prerequisite.cs20s.ComputerScience20S;
import testing.prerequisite.cs30s.ComputerScience30S;
import testing.prerequisite.cs40s.ComputerScience40S;

 
/**
 * PreCourseContent.java - this outlines the content of the Computer Science 
 * courses offered by Mr. Wachs prior to taking the A.P. Computer Science 
 * course.
 *
 * @author Mr. Wachs
 * @since Feb 12, 2024, 2:25:50 p.m.
 */
public class PrerequisiteContent 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public PrerequisiteContent(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP Prerequisite content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP Prerequisite Content:"); 
        new ComputerScience20S(Tester.RUN_SIMULATED);
        new ComputerScience30S(Tester.RUN_SIMULATED);
        new ComputerScience40S(state);
    }
     
}
