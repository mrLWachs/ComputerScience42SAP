/** Required package class namespace */
package io;

/**
 * Required API imports
 */
import collections.LinkedList;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JFrame;

/**
 * Simulator.java - simulates inputs and outputs to standards like the java.lang
 * class and redirects those outputs to customs
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Simulator {

    public static final String MESSAGE_DIALOG = "Message";
    public static final String CONFIRM_DIALOG = "Confirm";
    public static final String OPTION_DIALOG = "Option";
    public static final String INPUT_DIALOG = "Input";
    public static final String FILE_CHOOSER_DIALOG = "File Chooser";
    public static final String FRAME = "GUI Frame";

    private static final String SIMULATED_DIALOG_1 = "~~~ SIMULATED {";
    private static final String SIMULATED_DIALOG_2 = "} DIALOG: ";
    private static final int FLAG_INTEGER = -1;
    private static final int MAX_LINE_LENGTH = 200;

    private static final String FLAG_STRING = "-1";
    private static final String FLAG_FILENAME = "simulatedFile.txt";
    private static final String FLAG_INPUT = "simulated input line";
    private static final String DATA_FILENAME = "outputTestData.txt";

    private static final File FLAG_FILE = new File(FLAG_FILENAME);
    private static final File DATA_FILE = new File(DATA_FILENAME);

    private static final String NEW_LINE = "\n";
    private static final String COMMENT = "// ";
    private static final String NULL = "null";

    private static final String RESET = "\033[0m";
    private static final String BLACK = "\033[0;30m";
    private static final String RED = "\033[0;31m";
    private static final String GREEN = "\033[0;32m";
    private static final String YELLOW = "\033[0;33m";
    private static final String BLUE = "\033[0;34m";
    private static final String PURPLE = "\033[0;35m";
    private static final String CYAN = "\033[0;36m";
    private static final String WHITE = "\033[0;37m";
    private static final String BLACK_BOLD = "\033[1;30m";
    private static final String RED_BOLD = "\033[1;31m";
    private static final String GREEN_BOLD = "\033[1;32m";
    private static final String YELLOW_BOLD = "\033[1;33m";
    private static final String BLUE_BOLD = "\033[1;34m";
    private static final String PURPLE_BOLD = "\033[1;35m";
    private static final String CYAN_BOLD = "\033[1;36m";
    private static final String WHITE_BOLD = "\033[1;37m";
    private static final String BLACK_UNDERLINED = "\033[4;30m";
    private static final String RED_UNDERLINED = "\033[4;31m";
    private static final String GREEN_UNDERLINED = "\033[4;32m";
    private static final String YELLOW_UNDERLINED = "\033[4;33m";
    private static final String BLUE_UNDERLINED = "\033[4;34m";
    private static final String PURPLE_UNDERLINED = "\033[4;35m";
    private static final String CYAN_UNDERLINED = "\033[4;36m";
    private static final String WHITE_UNDERLINED = "\033[4;37m";
    private static final String BLACK_BACKGROUND = "\033[40m";
    private static final String RED_BACKGROUND = "\033[41m";
    private static final String GREEN_BACKGROUND = "\033[42m";
    private static final String YELLOW_BACKGROUND = "\033[43m";
    private static final String BLUE_BACKGROUND = "\033[44m";
    private static final String PURPLE_BACKGROUND = "\033[45m";
    private static final String CYAN_BACKGROUND = "\033[46m";
    private static final String WHITE_BACKGROUND = "\033[47m";
    private static final String BLACK_BRIGHT = "\033[0;90m";
    private static final String RED_BRIGHT = "\033[0;91m";
    private static final String GREEN_BRIGHT = "\033[0;92m";
    private static final String YELLOW_BRIGHT = "\033[0;93m";
    private static final String BLUE_BRIGHT = "\033[0;94m";
    private static final String PURPLE_BRIGHT = "\033[0;95m";
    private static final String CYAN_BRIGHT = "\033[0;96m";
    private static final String WHITE_BRIGHT = "\033[0;97m";
    private static final String BLACK_BOLD_BRIGHT = "\033[1;90m";
    private static final String RED_BOLD_BRIGHT = "\033[1;91m";
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    private static final String CYAN_BOLD_BRIGHT = "\033[1;96m";
    private static final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    private static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
    private static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";
    private static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
    private static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
    private static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
    private static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m";
    private static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";
    private static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";

    private static final String[] COLOR_CODES = {
        RESET, BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE, BLACK_BOLD,
        RED_BOLD, GREEN_BOLD, YELLOW_BOLD, BLUE_BOLD, PURPLE_BOLD, CYAN_BOLD,
        WHITE_BOLD, BLACK_UNDERLINED, RED_UNDERLINED, GREEN_UNDERLINED,
        YELLOW_UNDERLINED, BLUE_UNDERLINED, PURPLE_UNDERLINED, CYAN_UNDERLINED,
        WHITE_UNDERLINED, BLACK_BACKGROUND, RED_BACKGROUND, GREEN_BACKGROUND,
        YELLOW_BACKGROUND, BLUE_BACKGROUND, PURPLE_BACKGROUND, CYAN_BACKGROUND,
        WHITE_BACKGROUND, BLACK_BRIGHT, RED_BRIGHT, GREEN_BRIGHT, YELLOW_BRIGHT,
        BLUE_BRIGHT, PURPLE_BRIGHT, CYAN_BRIGHT, WHITE_BRIGHT, BLACK_BOLD_BRIGHT,
        RED_BOLD_BRIGHT, GREEN_BOLD_BRIGHT, YELLOW_BOLD_BRIGHT, BLUE_BOLD_BRIGHT,
        PURPLE_BOLD_BRIGHT, CYAN_BOLD_BRIGHT, WHITE_BOLD_BRIGHT,
        BLACK_BACKGROUND_BRIGHT, RED_BACKGROUND_BRIGHT, GREEN_BACKGROUND_BRIGHT,
        YELLOW_BACKGROUND_BRIGHT, BLUE_BACKGROUND_BRIGHT,
        PURPLE_BACKGROUND_BRIGHT, CYAN_BACKGROUND_BRIGHT, WHITE_BACKGROUND_BRIGHT
    };

    private static LinkedList<String> allOutput;

    private static int lineCount = 0;

    /**
     * Does a simple output with the passed message
     *
     * @param message the message to output
     */
    private static void simpleOutput(String message, String original) {
        java.lang.System.out.print(message);
        // Save all the output messages to a running list 
        if (allOutput == null) {
            allOutput = new LinkedList();
        }
        if (original != null && !original.equals("")) {
            lineCount++;
            if (original.length() > MAX_LINE_LENGTH) {
                original = original.substring(0, MAX_LINE_LENGTH)
                        + " ... (line shortened) ...";
            }
            allOutput.add(lineCount + ":\t" + original);
        }
    }

    /**
     * Does a simple output with the passed message combined with other textual
     * data
     *
     * @param message the message to output
     * @param colorCode the starting color code
     * @param resetCode the color reset code
     */
    private static void colorOutput(String message, String colorCode,
            String resetCode) {
        simpleOutput("", "");
        simpleOutput(colorCode + message + resetCode, message);
        simpleOutput(NEW_LINE, "");
    }

    /**
     * Creates a line of 50 '.' dots to add to an output
     *
     * @return a text line of 50 dots
     */
    private static String line() {
        return ".".repeat(50);
    }

    /**
     * Exits the application
     *
     * @param status the exit status
     */
    public static void exit(int status) {
        java.lang.System.exit(status);
    }

    /**
     * Simulates the 'Printing' of an object but uses a header style of
     * formatting
     *
     * @param object The Object type to be 'printed'
     */
    public static void header(Object object) {
        if (object == null) {
            return;
        }
        String text = object.toString() + line();
        colorOutput(text, BLUE, RESET);
    }

    /**
     * Simulates the 'Printing' of an object but uses a header style of
     * formatting
     *
     * @param object The Object type to be 'printed'
     */
    public static void headerSpaced(Object object) {
        if (object == null) {
            return;
        }
        String text = object.toString() + line();
        simpleOutput(NEW_LINE, "");
        colorOutput(text, BLUE, RESET);
        simpleOutput(NEW_LINE, "");
    }

    /**
     * Simulates the 'Printing' of an object but uses a comment style of
     * formatting
     *
     * @param object The Object type to be 'printed'
     */
    public static void comment(Object object) {
        if (object == null) {
            object = NULL;
        }
        colorOutput(COMMENT + object, YELLOW, RESET);
    }

    /**
     * Adds this object to the dynamic list of outputs with or without a new
     * line
     *
     * @param object the object (as a string) to add to output
     * @param newLine adds a new line (true) or not (false)
     */
    public static void output(Object object, boolean newLine) {
        if (object == null) {
            object = NULL;
        }
        String text = object.toString();
        simpleOutput(newLine ? text + NEW_LINE : text, text);
    }

    /**
     *
     * @param object
     * @param newLine
     */
    public static void forestOutput(Object object, boolean newLine) {
        if (object == null) {
            object = NULL;
        }
        colorOutput(object.toString(), GREEN, RESET);
    }

    /**
     *
     * @param fString
     * @param values
     */
    public static void forestOutput(String fString, LinkedList<Object> values) {
        final String formattedString = String.format(fString, values.toArray(new Object[0]));
        colorOutput(formattedString, GREEN, RESET);
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param message The Object type to be 'printed'
     * @param dialogType the style of dialog that was called
     * @return returns the simulator flag
     */
    public static String dialog(Object message, String dialogType) {
        dialog(null, message, null, 0, 0, null, null, null, dialogType);
        return FLAG_STRING;
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param dialogType the style of dialog that was called
     * @return will not apply!
     */
    public static int dialog(Component parentComponent, Object message, String dialogType) {
        dialog(parentComponent, message, null, 0, 0, null, null, null, dialogType);
        return FLAG_INTEGER;
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param dialogType the style of dialog that was called
     */
    public static void dialog(Component parentComponent, Object message,
            String title, String dialogType) {
        dialog(parentComponent, message, title, 0, 0, null, null, null,
                dialogType);
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param dialogType the style of dialog that was called
     */
    public static void dialog(Component parentComponent, Object message,
            String title, int messageType, Icon icon,
            String dialogType) {
        dialog(parentComponent, message, title, 0, messageType, icon, null,
                null, dialogType);
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param dialogType the style of dialog that was called
     * @return will not apply!
     */
    public static int dialog(Component parentComponent, Object message,
            String title, int optionType, String dialogType) {
        dialog(parentComponent, message, title, optionType, 0, null, null,
                null, dialogType);
        return FLAG_INTEGER;
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param dialogType the style of dialog that was called
     * @return will not apply!
     */
    public static int dialog(Component parentComponent, Object message,
            String title, int optionType, int messageType,
            String dialogType) {
        dialog(parentComponent, message, title, optionType, messageType,
                null, null, null, dialogType);
        return FLAG_INTEGER;
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param dialogType the style of dialog that was called
     * @return will not apply!
     */
    public static int dialog(Component parentComponent, Object message,
            String title, int optionType, int messageType,
            Icon icon, String dialogType) {
        dialog(parentComponent, message, title, optionType, messageType,
                icon, null, null, dialogType);
        return FLAG_INTEGER;
    }

    /**
     * Simulates a 'dialog' by 'printing' an object but uses a marker in the
     * output to indicate the dialog is being simulated
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param options will not apply!
     * @param initialValue will not apply!
     * @param dialogType the style of dialog that was called
     * @return will not apply!
     */
    public static int dialog(Component parentComponent, Object message,
            String title, int optionType, int messageType,
            Icon icon, Object[] options, Object initialValue,
            String dialogType) {
        String text = SIMULATED_DIALOG_1 + dialogType
                + SIMULATED_DIALOG_2;
        if (message == null) {
            text += NULL;
        } else {
            text += message.toString();
        }
        text += " ~~~ ";
        if (parentComponent != null) {
            text += "{ parent: "
                    + parentComponent.toString() + " },";
        }
        if (title != null) {
            text += "{ title: "
                    + title + " },";
        }
        if (optionType != 0) {
            text += "{ optionType: "
                    + optionType + " },";
        }
        if (messageType != 0) {
            text += "{ messageType: "
                    + messageType + " },";
        }
        if (icon != null) {
            text += "{ icon: "
                    + icon.toString() + " },";
        }
        if (options != null) {
            text += "{ options: [";
            for (int i = 0; i < options.length - 1; i++) {
                text += options[i].toString() + ",";
            }
            text += options[options.length - 1].toString() + "] },";
        }
        if (initialValue != null) {
            text += "{ initialValue: "
                    + initialValue.toString() + " }";
        }
        colorOutput(text, GREEN, RESET);
        return FLAG_INTEGER;
    }

    /**
     * Simulates the "Open File" file chooser dialog
     *
     * @param frame the parent component of the dialog
     * @return the file chosen by user
     */
    public static File showOpenDialog(Window frame) {
        dialog(frame, null, null, 0, 0, null, null, null, FILE_CHOOSER_DIALOG);
        return FLAG_FILE;
    }

    /**
     * Simulates the "Save File" file chooser dialog
     *
     * @param frame the parent component of the dialog
     * @return the file chosen by user
     */
    public static File showSaveDialog(Window frame) {
        dialog(frame, null, null, 0, 0, null, null, null, FILE_CHOOSER_DIALOG);
        return FLAG_FILE;
    }

    /**
     * Simulates a JFrame graphical user interface
     *
     * @param frame the frame to simulate
     */
    public static void showFrame(JFrame frame) {
        dialog(frame, null, null, 0, 0, null, null, null, FRAME);
    }

    /**
     * Simulates a JFrame graphical user interface
     *
     * @param frame the frame to simulate
     * @param message the <code>Object</code> to display
     */
    public static void showFrame(JFrame frame, String message) {
        dialog(frame, message, null, 0, 0, null, null, null, FRAME);
    }

    /**
     *
     * @return
     */
    public static String scannerInput() {
        return FLAG_INPUT;
    }

    /**
     *
     * @return
     */
    public static File getFile() {
        return FLAG_FILE;
    }

    /**
     *
     */
    public static void saveOutput() {
        FileHandler<LinkedList> handler = new FileHandler<>();
        handler.save(allOutput, DATA_FILE);
    }

}
