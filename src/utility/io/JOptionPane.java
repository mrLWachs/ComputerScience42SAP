
/** Required package class namespace */
package utility.io;

/** Required API imports */
import java.awt.Component;
import javax.swing.Icon;
import testing.Tester;


/**
 * JOptionPane.java - this class simulates the java.swing class that does the 
 * dialogs and user interfaces and redirects the outputs to a custom output
 *
 * @author Mr. Wachs 
 * @since June 2023
 */
public class JOptionPane
{
    /**
     * Type meaning Look and Feel should not supply any options -- only
     * use the options from the <code>JOptionPane</code>.
     */
    public static final int DEFAULT_OPTION = -1;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int YES_NO_OPTION = 0;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int YES_NO_CANCEL_OPTION = 1;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int OK_CANCEL_OPTION = 2;
    /** Return value from class method if YES is chosen. */
    public static final int YES_OPTION = 0;
    /** Return value from class method if NO is chosen. */
    public static final int NO_OPTION = 1;
    /** Return value from class method if CANCEL is chosen. */
    public static final int CANCEL_OPTION = 2;
    /** Return value form class method if OK is chosen. */
    public static final int OK_OPTION = 0;
    /** 
     * Return value from class method if user closes window without selecting
     * anything, more than likely this should be treated as either a
     * <code>CANCEL_OPTION</code> or <code>NO_OPTION</code>. 
     */
    public static final int CLOSED_OPTION = -1;
    /** Used for error messages. */
    public static final int ERROR_MESSAGE = 0;
    /** Used for information messages. */
    public static final int INFORMATION_MESSAGE = 1;
    /** Used for warning messages. */
    public static final int WARNING_MESSAGE = 2;
    /** Used for questions. */
    public static final int QUESTION_MESSAGE = 3;
    /** No icon is used. */
    public static final int PLAIN_MESSAGE = -1;
    
    /**
     * Default constructor for the class
     */
    public JOptionPane() {  }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     */
    public static void showMessageDialog(Component parentComponent, 
            Object message) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.dialog(parentComponent,message,Simulator.MESSAGE_DIALOG);
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(parentComponent, message);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     */
    public static void showMessageDialog(Component parentComponent, 
            Object message, String title, int messageType) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.dialog(parentComponent,message,title,
                    Simulator.MESSAGE_DIALOG);
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(parentComponent, message,
                    title, javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     */
    public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            Simulator.dialog(parentComponent,message,title,messageType,icon,
                    Simulator.MESSAGE_DIALOG);
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(parentComponent, message, 
                    title, messageType, icon);
        }
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(parentComponent,message,
                    Simulator.CONFIRM_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showConfirmDialog(parentComponent, 
                    message);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(parentComponent,message,title,optionType,
                    Simulator.CONFIRM_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showConfirmDialog(parentComponent, 
                    message, title, optionType);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(parentComponent,message,title,optionType,
                    messageType,Simulator.CONFIRM_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showConfirmDialog(parentComponent, 
                    message, title, optionType, messageType);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType,
        int messageType, Icon icon) { 
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(parentComponent,message,title,optionType,
                    messageType,icon,Simulator.CONFIRM_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showConfirmDialog(parentComponent, 
                    message, title, optionType, messageType, icon);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param options will not apply!
     * @param initialValue will not apply!
     * @return will not apply!
     */
    public static int showOptionDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType,
        Icon icon, Object[] options, Object initialValue) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(parentComponent,message,title,optionType,
                    messageType,icon,options,initialValue,Simulator.OPTION_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showOptionDialog(parentComponent,
                    message, title, optionType, messageType, icon, options, 
                    initialValue);
        }
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static String showInputDialog(Object message) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return Simulator.dialog(message,Simulator.INPUT_DIALOG);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(message);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Object message, 
            Object initialSelectionValue) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return showInputDialog(message);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(message, 
                    initialSelectionValue);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent,
        Object message) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return showInputDialog(message);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(parentComponent, 
                    message);
        }
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent, 
            Object message, Object initialSelectionValue) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return showInputDialog(message);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(parentComponent, 
                    message, initialSelectionValue);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent,
        Object message, String title, int messageType) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return showInputDialog(message);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(parentComponent, 
                    message, title, messageType);
        }
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param selectionValues will not apply!
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static Object showInputDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon,
        Object[] selectionValues, Object initialSelectionValue) {
        if (Tester.state == Tester.RUN_SIMULATED) {
            return showInputDialog(message);
        }
        else {
            return javax.swing.JOptionPane.showInputDialog(parentComponent, 
                    message, title, messageType, icon, selectionValues, 
                    initialSelectionValue);
        }
    }

}
