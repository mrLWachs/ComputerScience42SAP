
/** Required package class namespace */
package testing.prerequisite.cs20s;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;

 
/**
 * ComputerScience20S.java - these are Java based adaptations of the examples 
 * done in the introductory Computer Science 20S course. Those example were 
 * done in Visual Studio in C# so they are adapted to Java with JFrames instead
 * of Windows Forms. The code is adapted as best as possible.
 *
 * @author Mr. Wachs
 * @since Feb 22, 2024, 2:09:54 p.m.
 */
public class ComputerScience20S 
{

    /**
     * Default class constructor, runs on instantiation
     * 
     * @param state the run state of this code module
     */
    public ComputerScience20S(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 20S course content not running");
            return;
        }
        else if (state == Tester.RUN_SIMULATED) {
            Simulator.title("Computer Science 20S Course:");
            Simulator.showFrame(null,"unit2Introduction");
            Simulator.showFrame(null,"unit3Variables1");
            Simulator.showFrame(null,"unit3Variables2");
            Simulator.showFrame(null,"unit4Conditionals1");
            Simulator.showFrame(null,"unit4Conditionals2");
            Simulator.showFrame(null,"unit5Looping1");
            Simulator.showFrame(null,"unit5Looping2");
        }
        else if (state == Tester.RUN_NORMAL) {        
            Unit2Introduction  unit2Introduction  = new Unit2Introduction();
            Unit3Variables1    unit3Variables1    = new Unit3Variables1();
            Unit3Variables2    unit3Variables2    = new Unit3Variables2();
            Unit4Conditionals1 unit4Conditionals1 = new Unit4Conditionals1();
            Unit4Conditionals2 unit4Conditionals2 = new Unit4Conditionals2();
            Unit5Looping1      unit5Looping1      = new Unit5Looping1();
            Unit5Looping2      unit5Looping2      = new Unit5Looping2(); 
        }
    }
     
}
