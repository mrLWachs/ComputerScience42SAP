
/** Required package class namespace */
package utility.io;

/** Required API imports */
import utility.tools.Numbers;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * Dialogs.java - a collection of useful methods for working with dialogs
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Dialogs
{

    private static final Font      DEFAULT_FONT             = new 
        javax.swing.JOptionPane().getFont();
    private static final Color     DEFAULT_BACKGROUND_COLOR = new 
        javax.swing.JOptionPane().getBackground();
    private static final Color     DEFAULT_FOREGROUND_COLOR = new 
        javax.swing.JOptionPane().getForeground();
    private static final String    DEFAULT_TITLE            = "";
    private static final Component DEFAULT_COMPONENT        = null;
    private static final ImageIcon DEFAULT_ICON             = null;
    private static final int       DEFAULT_TYPE             = 
            javax.swing.JOptionPane.PLAIN_MESSAGE;
    private static final int       DEFAULT_OPTION_TYPE      = 
            javax.swing.JOptionPane.YES_NO_OPTION;
    
    private final static String[] FONT_NAMES = {        
        "Consolas",
        "Courier New",
        "Trebuchet MS",
        "Tahoma",
        "Bookman Old Style",
        DEFAULT_FONT.getName()
    };
    
    private final String ERROR_1 = "Error, please enter again\n\n";
    private final String ERROR_2 = "Error, invalid number\n\n";
    private final String ERROR_3 = "Error, number not inside range\n\n";
    
    private final int DIALOG_FONT_SIZE              = 14;
    private final int DIALOG_BACKGROUND_COLOR_RED   = 238;
    private final int DIALOG_BACKGROUND_COLOR_GREEN = 238;
    private final int DIALOG_BACKGROUND_COLOR_BLUE  = 238;
    private final int DIALOG_WIDTH                  = 1000;
    private final int DIALOG_HEIGHT                 = 800;
        
    private final Font      DIALOG_FONT             = new 
        Font(FONT_NAMES[0], DEFAULT_TYPE, DIALOG_FONT_SIZE);
    private final Color     DIALOG_BACKGROUND_COLOR = new 
        Color(DIALOG_BACKGROUND_COLOR_RED, 
              DIALOG_BACKGROUND_COLOR_GREEN, 
              DIALOG_BACKGROUND_COLOR_BLUE);
    private final Dimension DIALOG_DIMENSION        = new 
        Dimension(DIALOG_WIDTH, DIALOG_HEIGHT);
       
    private JTextArea   area;
    private JScrollPane scrollPane;
    private Numbers     numbers;

    /** Font used for displaying in the dialogs */
    public Font font;
    /** Background color used for displaying in the dialogs */
    public Color background;
    /** Foreground (text) color used for displaying in the dialogs */
    public Color foreground;
    /** Top dialog title used */
    public String title;
    /** Frame or other component the dialog parents (centers) with */
    public Component parent;
    /** Type of icon used in the dialogs */
    public int messageType;
    /** Type of button options used in the dialogs */
    public int optionType;
    /** Custom icon (image) used in the dialogs */
    public Icon icon;

    /**
     * Default class constructor sets class properties
     */
    public Dialogs() {
        defaults();
    }
    
    /**
     * Class constructor sets class properties
     *
     * @param title The title used on any dialog in the class
     */
    public Dialogs(String title) {
        defaults();
        this.title = title;
    }

    /**
     * Class constructor sets class properties
     *
     * @param title The title used on any dialog in the class
     * @param parent the component to parent the dialogs to
     */
    public Dialogs(String title, Component parent) {
        defaults();
        this.title  = title;
        this.parent = parent;
    }

    /**
     * Class constructor sets passed properties
     * 
     * @param title top dialog title used
     * @param parent the component to parent the dialogs to
     * @param font font used in dialogs
     */
    public Dialogs(String title, Component parent, Font font) {
        defaults();
        this.font  = font;
        this.title = title;
        init();
    }
    
    /**
     * Class constructor sets passed properties
     * 
     * @param title top dialog title used
     * @param parent the component to parent the dialogs to
     * @param font font used in dialogs
     * @param background background color used in dialogs
     * @param foreground foreground (text) color used in dialogs
     */
    public Dialogs(String title, Component parent, Font font, Color background, 
                   Color foreground) {
        defaults();
        this.font       = font;
        this.background = background;
        this.foreground = foreground;
        this.title      = title;
        init();
    }

    /**
     * Class constructor sets passed properties
     * 
     * @param title top dialog title used
     * @param parent frame the dialog parents (centers) with
     * @param font font used in dialogs 
     * @param background background color used in dialogs
     * @param foreground foreground (text) color used in dialogs 
     * @param messageType type of icon used in the dialogs
     * @param icon custom icon (image) used in the dialogs
     */
    public Dialogs(String title, Component parent, Font font, Color background,
                   Color foreground, int messageType, Icon icon) {
        defaults();
        this.parent      = parent;
        this.messageType = messageType;
        this.icon        = icon;
        this.font        = font;
        this.background  = background;
        this.foreground  = foreground;
        this.title       = title;
        init();
    }

    /**
     * Sets the image icon for the dialog methods invoked
     * 
     * @param imageFilePath the name of the image to display
     */
    public void setImage(String imageFilePath) {
        this.icon = new ImageIcon(imageFilePath);
    }
    
    /**
     * Outputs the passed text in a dialog
     *
     * @param text the text to display
     */
    public void output(String text) {
        area.setText(text);     
        JOptionPane.showMessageDialog(parent, area, title, messageType, icon);
    }

    /**
     * Outputs the passed text in a dialog
     *
     * @param text the text to display
     * @param width the set width of the dialog
     * @param height the set height of the dialog
     */
    public void output(String text, int width, int height) {
        area.setText(text);        
        scrollPane.setViewportView(area);
        scrollPane.setPreferredSize(new Dimension(width,height));
        JOptionPane.showMessageDialog(parent, scrollPane, title, messageType, 
                icon);
    }
    
    /**
     * Outputs the passed text in a dialog, and gets typed user input
     *
     * @param text the text to display
     * @return the text the user types in
     */
    public String input(String text) {
        area.setText(text);
        Object object = JOptionPane.showInputDialog(parent, area,
                title, messageType, icon, null, null);
        if (object == null) return null;
        return object.toString();
    }
    
    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    public int inputInteger(String text) {
        String value = input(text);
        while (!numbers.isInteger(value)) {
            value = input(ERROR_1 + text);
        }
        return Integer.parseInt(value);        
    }
    
    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @param minimum the lowest value in the input range
     * @param maximum the highest value in the input range
     * @return a valid integer
     */
    public int inputInteger(String text, int minimum, int maximum) {
        String value = input(text);
        int number = 0;
        boolean done = false;
        while (!done) {
            if (!numbers.isInteger(value)) value = input(ERROR_2 + text);
            else {
                number = Integer.parseInt(value);
                if (numbers.inRange(number, minimum, maximum)) done = true;
                else value = input(ERROR_3 + text);
            }            
        }
        return number;        
    }
    
    /**
     * Asks the user for a number (double) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    public double inputDouble(String text) {
        String value = input(text);
        while (!numbers.isDouble(value)) {
            value = input(ERROR_1 + text);
        }
        return Double.parseDouble(value);        
    }

    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @param minimum the lowest value in the input range
     * @param maximum the highest value in the input range
     * @return a valid double
     */
    public double inputDouble(String text, int minimum, int maximum) {
        String value = input(text);
        double number = 0d;
        boolean done = false;
        while (!done) {
            if (!numbers.isDouble(value)) value = input(ERROR_2 + text);
            else {
                number = Double.parseDouble(value);
                if (numbers.inRange(number, minimum, maximum)) done = true;
                else value = input(ERROR_3 + text);
            }            
        }
        return number;        
    }
    
    /**
     * Ask the user a yes and no question, in a confirm dialog box
     * 
     * @param text the yes no question to ask in the dialog
     * @return true (yes), false (no)
     */
    public boolean yesNo(String text) {
        area.setText(text);
        int response = JOptionPane.showConfirmDialog(parent, area, title,
                optionType, JOptionPane.QUESTION_MESSAGE, icon);
        if (response == JOptionPane.YES_OPTION) return true;
        else                                    return false;
    }

    /**
     * Outputs the passed text in a dialog and creates buttons with the text
     * from the choices on each for the user to click on
     * 
     * @param text the text to display
     * @param choices the text choices for each button
     * @return the text on which button the user clicked on
     */
    public String buttons(String text, String[] choices) {
        area.setText(text);
        int value = JOptionPane.showOptionDialog(parent, area, title, 
                optionType, messageType, icon, choices, choices[0]);
        return choices[value];
    }

    /**
     * Presents an input dialog with a drop down selection of options
     * 
     * @param text the text to show in the dialog
     * @param options the array of option to have in the drop down
     * @return the option they choose
     */
    public String choices(String text, String[] options) {
        area.setText(text);
        Object object = JOptionPane.showInputDialog(parent, area, title, 
                JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        if (object == null)  return "";
        else                 return object.toString();
    }
    
    /**
     * Ask the user if they want to play again, in a dialog box
     * 
     * @return true (yes, play again), false (no)
     */
    public boolean playAgain() {
        final String PLAY_AGAIN = "Do you want to play again?";
        return yesNo(PLAY_AGAIN);
    }
    
    /**
     * Open file dialog parented to the passed frame
     *
     * @param frame the frame to parent to
     * @return the file object selected (or a null)
     */
    public File openFile(JFrame frame) {
        JFileChooser chooser = new JFileChooser(title);
        chooser.showOpenDialog(frame);
        return chooser.getSelectedFile();
    }

    /**
     * Save file dialog parented to the passed frame
     *
     * @param frame the frame to parent to
     * @return the file object selected (or a null)
     */
    public File saveFile(JFrame frame) {
        JFileChooser chooser = new JFileChooser(title);
        chooser.showSaveDialog(frame);
        return chooser.getSelectedFile();
    }

    /**
     * Open file dialog parented to the passed frame
     *
     * @param frame the frame to parent to
     * @return the file object selected (or a null)
     */
    public File openFileFrame(JDialog frame) {
        JFileChooser chooser = new JFileChooser(title);
        chooser.showOpenDialog(frame);
        return chooser.getSelectedFile();
    }

    /**
     * Save file dialog parented to the passed frame
     *
     * @param frame the frame to parent to
     * @return the file object selected (or a null)
     */
    public File saveFileFrame(JDialog frame) {
        JFileChooser chooser = new JFileChooser(title);
        chooser.showSaveDialog(frame);
        return chooser.getSelectedFile();
    }
    
    /**
     * Sets class properties to default values
     */
    private void defaults() {
        this.parent      = null;
        this.font        = DIALOG_FONT;
        this.background  = DIALOG_BACKGROUND_COLOR;
        this.foreground  = DEFAULT_FOREGROUND_COLOR;
        this.title       = DEFAULT_TITLE;
        this.parent      = DEFAULT_COMPONENT;
        this.messageType = DEFAULT_TYPE;
        this.optionType  = DEFAULT_OPTION_TYPE;
        this.icon        = DEFAULT_ICON;
        this.numbers     = new Numbers();
        this.area        = new JTextArea();
        this.scrollPane  = new JScrollPane();
    }

    /**
     * Initializes the display objects
     */
    private void init() {
        area.setFont(font);
        area.setBackground(background);
        area.setForeground(foreground);  
        scrollPane.setViewportView(area);
        scrollPane.setPreferredSize(DIALOG_DIMENSION);
        scrollPane.setBorder(null);
    }
    
}