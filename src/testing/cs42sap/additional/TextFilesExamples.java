
/** Required package class namespace */
package testing.cs42sap.additional;
 
/** Required API imports */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import utility.io.Simulator;
import utility.io.System;


/**
 * TextFilesExamples.java - This class is an example of some of the new 
 * additional content added to the CS42SAP course. This will entail Mr. Wachs 
 * leading students in direct instruction (lessons) in materials that fills any 
 * gaps in knowledge from the course work done with Mr. Wachs (CS20S, CS30S, 
 * and CS40S) as it relates to the AP Computer Science curriculum by having 
 * presentations, doing examples, and making notes. 
 * 
 * Apps you have previously created stored data in memory as primitive data 
 * structures (e.g. variables and arrays), more advanced data structures 
 * (e.g. classes), or even abstract dynamic data structures (e.g. 
 * collections). Problem with this is that they are only temporary (once the 
 * device’s power is off the data is lost - called “volatile” data). To save 
 * permanently, we need to create or open a file on the device’s file system 
 * and write data from data structures into that file (called “non-volatile” 
 * data). Once your app restarts, it opens the file and reads the data out 
 * and back into the memory data structures of the app. Every computing 
 * device (e.g. desktop, laptop, tablet, smart phone, game console, smart 
 * car, etc.) has a file system which is organized and controlled by that 
 * device’s operating system (OS). Most of these OS file systems access a 
 * permanent (non-volatile) medium (like a hard drive, etc.) which can store 
 * non-volatile data. Although each OS has unique qualities, many of the 
 * protocols (rules) used are similar. For example, the way files are named 
 * must be unique. Files are separate from your application but connected 
 * to it (to read/write data to/from the file). Complex apps can be 
 * associated with multiple files that might be reading and/or writing to 
 * multiple files at the same time – and, multiple applications might access 
 * the same file(s). 
 *
 * @author Mr. Wachs
 * @since February 2026
 */
public class TextFilesExamples 
{
    
    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting Text Files Examples");
        new TextFilesExamples();
        Simulator.title("\nCompleted Text Files Examples");
    }

    /**
     * Default constructor, set class properties
     */
    public TextFilesExamples() {
        // Learn about "error traps"...........................................   
        System.out.println("Learn about File Handling");

        ////////////////////////////////////////////////////////////////////////
        // ERROR TRAPS (necessary for working with files)
        ////////////////////////////////////////////////////////////////////////        
        
        // Learn about the "try catch" blocks..................................
        try {
            // Opening the "try" block (means "try this code"), this is the 
            // "trap" we set to "try" some code, and if an error occurs (of 
            // the type we are catching for) we "catch" that error and the  
            // program keeps running........................................... 
            double number = 3 / 0; 
            int[] a = { 1, 2, 3 };
            a[5] = 0;
        }
        catch (ArithmeticException error) {
            // Open the "catch" block, so if an error occurs in the "try" block
            // of the type we defined (divide by zero..) the program will 
            // not shut down, instead it will jump (branch) to this block (the 
            // catch block).................................................... 
            System.out.println("Divide by zero error caught");
            System.out.println("\t -> " + error.toString());
        }
        catch (ArrayIndexOutOfBoundsException error) {
            // You can add multiple "catch" blocks............................. 
            System.out.println("Array was out of bounds -> " + error.toString());
        }
        
        ////////////////////////////////////////////////////////////////////////
        // DATA (to use with the files)
        ////////////////////////////////////////////////////////////////////////
        
        // Create some data to "save" and "open" from a file....................
        System.out.println("Create sample data...");
        
        String word = "WachsAvoidant";
        String[] poem = {
            "He strolls in, hoodie up, coding brain on airplane mode  ",
            "Dodges Mr. Wachs like it’s part of the syllabus ",
            "Speaks fluent Java but not good morning ",
            "Keyboard clacks louder than his social skills",
            "Too cool, too chill, too Gen Z to ever look up from the screen"
        };
        
        // Create a file name (proper, full) to save and open to and from.......
        
        String first  = "C:\\1\\";  // File "PATH" (e.g. "c:/my docs...")
        String middle = "data";     // File NAME (e.g. "essay")
        String last  = ".txt";      // File EXTENSION (e.g. ".docx" ".txt")
        String name = first + middle + last;   // Full name (parts concatinated)
        
        // Could have done this all on one line like:
        // String name = "C:\\1\\data.txt";
        
        ////////////////////////////////////////////////////////////////////////
        // WRITING TO A FILE
        ////////////////////////////////////////////////////////////////////////        
        
        // Write ONE piece of data (the word) to that permanent file............
        System.out.println("Save ONE piece of data to that permanent file");  
        
        try {
            // Create instance (object) of the classes needed and connect the 
            // 2 classes with the file name we just made........................
            FileWriter  writer  = new FileWriter(name);   // First object
            PrintWriter printer = new PrintWriter(writer);
            // Now write to the file............................................
            printer.print(word);        // Call class method to write to file..   
            // Sever (disconnect) from the file.................................
            printer.close();                                // Close connection
        } 
        catch (IOException error) {                         // catch error.....
            System.out.println("File write error");        // output message..
        }
        
        ////////////////////////////////////////////////////////////////////////
        // READING FROM A FILE
        ////////////////////////////////////////////////////////////////////////
        
        // Now involve the user in naming of a file.............................        
        System.out.println("Now involve the user to get a file name");
        
        // We could get input from the user using very simple input like 
        // Scanner or a simple JOptionPane input dialog like this...............
        
        // Scanner scanner = new Scanner(System.in);
        // name = scanner.nextLine();
        // name = JOptionPane.showInputDialog("Enter name");
                
        // Or we could build a GUI and use a textbox, but instead, we will use
        // something new that is already built for ths..........................
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);           // Showing a dialog to user....
        
        // We will also use a "File" class object to work with as well.........
        File file = chooser.getSelectedFile();  // Get the name from the user
        
        // Check the file the user just selected...............................
        if (file == null) {                     // Error check on the file.....   
            // Means the user hit cancel or ok without selecting, etc..........
            System.out.println("Please select a file");
        }
        else {
            if (!file.exists()) {
                // The file does not exist, we create it
                try {
                    file.createNewFile();
                } 
                catch (IOException e) {
                    System.out.println("File create error");
                }
            }
            // Actual reading of the data ("streaming") out of the file...            
            try {
                FileReader     reader = new FileReader(file);       // Connect..
                BufferedReader buffer = new BufferedReader(reader); // Connect..
                String line = buffer.readLine();                 // Read line...
                System.out.println("line read was " + line);      // Output line
                buffer.close();                                 // Close connect
            }            
            catch (IOException e) {
                System.out.println("Error reading data");
            }
            
            
            
            
        }
        
        
        
        
        
        System.out.println("Completed Learning about File Handling");
    }
     
}