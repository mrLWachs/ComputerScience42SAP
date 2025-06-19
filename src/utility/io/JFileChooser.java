
/** Required package class namespace */
package utility.io;

/** Required API imports */
import java.awt.Window;
import java.io.File;
import testing.Tester;

 
/**
 * JFileChooser.java - this class simulates the java.swing class that does the 
 * dialogs and user interfaces and redirects the outputs to a custom output
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class JFileChooser 
{
    
    private static javax.swing.JFileChooser actual;

    /**
     * Default constructor for the class
     */
    public JFileChooser() {
        actual = new javax.swing.JFileChooser();
    }

    /**
     * Constructor, set class properties
     * 
     * @param title the title of this dialog
     */
    public JFileChooser(String title) { 
        this();
    }
    
    /**
     * Re-directs the dialog to custom output
     * 
     * @param parent the parent component of the dialog 
     */
    public void showSaveDialog(Window parent) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.showSaveDialog(parent);
        }
        else {
            actual.showSaveDialog(parent);
        }
    }
    
    /**
     * Re-directs the dialog to custom output
     * 
     * @param parent the parent component of the dialog 
     */
    public void showOpenDialog(Window parent) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.showOpenDialog(parent);
        }
        else {
            actual.showOpenDialog(parent);
        }
    }
        
    /**
     * Uses a simulated user selected file
     * 
     * @return a simulated file object
     */
    public File getSelectedFile() {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.getFile();
        }
        else {
            return actual.getSelectedFile();
        }
    }

}
