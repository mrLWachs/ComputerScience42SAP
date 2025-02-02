
/** Required package class namespace */
package utility.io;

/** Required API imports */
import java.awt.Window;
import java.io.File;

 
/**
 * JFileChooser.java - this class simulates the java.swing class that does the 
 * dialogs and user interfaces and redirects the outputs to a custom output
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class JFileChooser 
{

    /**
     * Default constructor, set class properties
     */
    public JFileChooser() { }

    /**
     * Constructor, set class properties
     * 
     * @param title the title of this dialog
     */
    public JFileChooser(String title) { }
    
    /**
     * Re-directs the dialog to custom output
     * 
     * @param parent the parent component of the dialog 
     */
    public void showSaveDialog(Window parent) {
        Simulator.showSaveDialog(parent);
    }
    
    /**
     * Re-directs the dialog to custom output
     * 
     * @param parent the parent component of the dialog 
     */
    public void showOpenDialog(Window parent) {
        Simulator.showOpenDialog(parent);
    }
        
    /**
     * Uses a simulated user selected file
     * 
     * @return a simulated file object
     */
    public File getSelectedFile() {
        return Simulator.getFile();
    }

}
