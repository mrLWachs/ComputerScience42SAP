
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
import testing.prerequisite.cs40s.advancedclasses.Athlete;
import utility.collections.LinkedList;
import utility.io.Dialogs;
import utility.io.FileHandler;
import utility.io.Simulator;
import utility.io.System;
import utility.tools.Numbers;
import utility.tools.Text;


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
 * SPECIFICALLY FROM THE AP COMPUTER SCIENCE CURRICULUM:
 * =====================================================
 * 
 * See: https://bit.ly/3ONCRCY
 * 
 * Learning Objective: Develop code to read data from a text file.
 * 
 * Specifics: A file is storage for data that persists when the program is not 
 * running. The data in a file can be retrieved during program execution. A 
 * file can be connected to the program using the File and Scanner classes. A 
 * file can be opened by creating a File object, using the name of the file as 
 * the argument of the constructor. File(String str) is the File constructor 
 * that accepts a String file name to open for reading, where str is the 
 * pathname for the file. When using the File class, it is required to indicate
 * what to do if the file with the provided name cannot be opened. One way to 
 * accomplish this is to add throws IOException to the header of the method 
 * that uses the file. If the file name is invalid, the program will terminate.
 * The File and IOException classes are part of the java.io package. An import 
 * statement must be used to make these classes available for use in the 
 * program. The following Scanner methods and constructor - including what they
 * do and when they are used - are part of the Java Quick Reference: 
 * (1) Scanner(File f) is the Scanner constructor that accepts a File for 
 * reading. (2) int nextInt() returns the next int read from the file or input
 * source if available. If the next int does not exist or is out of range, it 
 * will result in an InputMismatchException. (3) double nextDouble() returns
 * the next double read from the file or input source. If the next double does 
 * not exist, it will result in an InputMismatchException. 
 * (4) boolean nextBoolean() returns the next boolean read from the file or 
 * input source. If the next boolean does not exist, it will result in an 
 * InputMismatchException. (5) String nextLine() returns the next line of text 
 * as a String read from the file or input source; can return the empty string 
 * if called immediately after another Scanner method that is reading from the 
 * file or input source. (6) String next() returns the next String read from 
 * the file or input source. (7) boolean hasNext() returns true if there is a 
 * next item to read in the file or input source; returns false otherwise.
 * (8) void close() closes this scanner. Using nextLine and the other Scanner 
 * methods together on the same input source sometimes requires code to adjust
 * for the methods’ different ways of handling whitespace. The following 
 * additional String method - including what it does and when it is used - is
 * part of the Java Quick Reference: String[] split(String del) returns a 
 * String array where each element is a substring of this String, which has 
 * been split around matches of the given expression del. A while loop can be 
 * used to detect if the file still contains elements to read by using the 
 * hasNext method as the condition of the loop. A file should be closed when 
 * the program is finished using it. The close method from Scanner is called 
 * to close the file. 
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
        // Learn about "error traps"............................................   
        System.out.println("Learn about File Handling........................");

        ////////////////////////////////////////////////////////////////////////
        // ERROR TRAPS (necessary for working with files)
        ////////////////////////////////////////////////////////////////////////        
        
        // Learn about the "try catch" blocks...................................
        System.out.println("Learn about the 'try catch' blocks...............");  
        
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
            System.out.println("Divide by zero error -> " + error.toString());
        }
        catch (ArrayIndexOutOfBoundsException error) {
            // You can add multiple "catch" blocks............................. 
            System.out.println("Array out of bounds -> " + error.toString());
        }
        
        ////////////////////////////////////////////////////////////////////////
        // DATA (to use with the files)
        ////////////////////////////////////////////////////////////////////////
        
        // Create data to "save" and "open" from a file.........................
        System.out.println("Create data to 'save' and 'open' from a file.....");
        
        // A single "piece" of data (in this casee a string
        String word = "WachsAvoidant";
        
        // A "collection" of pieces of data (in this case an array)
        String[] poem = {
            "He strolls in, hoodie up, coding brain on airplane mode  ",
            "Dodges Mr. Wachs like it's part of the syllabus ",
            "Speaks fluent Java but not good morning ",
            "Keyboard clacks louder than his social skills",
            "Too cool, too chill, too Gen Z to ever look up from the screen"
        };
        
        // A more advanced collection of data (in this case a LinkedList)
        LinkedList<String> verses = new LinkedList(poem);
        
        // Create a file name (proper, full) to read and write (data)...........        
        String first  = "C:\\1\\";       // File "PATH" (e.g. "c:/my docs...")
        String middle = "data";          // File NAME (e.g. "essay")
        String last   = ".txt";          // File EXTENSION (e.g. ".docx" ".txt")
        String name   = first + middle + last; // Full name (parts concatinated)
        
        // Could have done this all on one line like:
        // String name = "C:\\1\\data.txt";
        
        ////////////////////////////////////////////////////////////////////////
        // WRITING TO A FILE
        ////////////////////////////////////////////////////////////////////////        
        
        // Write ONE piece of data (the word) to a permanent file...............
        System.out.println("Save ONE piece of data to a permanent file.......");  
        
        try {
            // Create instance (object) of the classes needed and connect the 
            // 2 classes with the file name we just made........................
            FileWriter  writer  = new FileWriter(name);             // Link file
            PrintWriter printer = new PrintWriter(writer);         // and writer
            // Now write to the file............................................
            printer.print(word);        // Call class method to write to file...   
            // Sever (disconnect) from the file.................................
            printer.close();                              // Close connection...
        } 
        catch (IOException error) {                            // Catch error...
            System.out.println("File write error");         // Output message...
        }
        
        ////////////////////////////////////////////////////////////////////////
        // READING FROM A FILE
        ////////////////////////////////////////////////////////////////////////
        
        // Read ONE piece of data (word) from file..............................
        System.out.println("Read ONE piece of data (word) from file..........");  
        
        // Actual reading of the data ("streaming") out of the file.............            
        try {
            // Create instance (object) of the classes needed and connect the 
            // 2 classes with the same file name we wrote to....................
            FileReader     reader = new FileReader(name);           // Link file
            BufferedReader buffer = new BufferedReader(reader);    // and buffer
            // Now read from the file...........................................
            String line = buffer.readLine();                   // Read a line...
            System.out.println("line read was " + line);       // Output line...
            // Sever (disconnect) from the file.................................
            buffer.close();                               // Close connection...
        }            
        catch (IOException error) {                            // Catch error...
            System.out.println("File read error");          // Output message...
        }
        
        ////////////////////////////////////////////////////////////////////////
        // USER INTERACTION (involve the user in saving and opening file)
        ////////////////////////////////////////////////////////////////////////
        
        // Now involve the user in naming of a file.............................        
        System.out.println("Now involve the user in naming of a file.........");
        
        // We could get file name input from the user using simple input like 
        // Scanner or a simple JOptionPane input dialog like this...............
        
        // Scanner scanner = new Scanner(System.in);
        // name = scanner.nextLine();
        // or....
        // name = JOptionPane.showInputDialog("Enter name");  
        // or....
        // We could build a GUI and use a textbox, but instead, we will use
        // something new that is already built for ths..........................
        
        // This swing class dialog will allow for opening and saving files......
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(null);             // Showing a dialog to user...        
        
        // Save an ARRAY of data to a user created file.........................
        System.out.println("Save an ARRAY of data to a user created file.....");
        
        // We will also use a "File" class object to work with as well..........
        File file = chooser.getSelectedFile();  // Get the name from the user...
        
        // Check the file the user just selected................................
        if (file == null) {                        // Error check on the file...  
            // Means the user hit cancel or ok without selecting, etc...........
            System.out.println("Please select and/or name a file");
        }
        else {
            if (!file.exists()) { // The file does not exist, so we create it...
                try {                    
                    file.createNewFile();       // Built-in File class method...
                    // Now we can "save" data to the file the user created (in  
                    // a directory) and "stream" our data into that file........                    
                    FileWriter  writer  = new FileWriter(file);     // Link file
                    PrintWriter printer = new PrintWriter(writer); // and writer       
                    // Use the enhanced for loop - which you can read as...
                    // "for every line in poem"
                    for (String line : poem) { // Enhanced loop through array...  
                        printer.println(line);     // Writing one array index...
                    }
                    printer.close();         // Sever (close) file connection...
                } 
                catch (IOException error) {                    // Catch error...
                    System.out.println("File save error");
                }
            }
            else {                  // File already exists, do not over write...
                System.out.println("File already exists!");
            }
        }
        
        ////////////////////////////////////////////////////////////////////////
        // BASIC EXAMPLE (simple, stripped down reading froma file)
        ////////////////////////////////////////////////////////////////////////
        
        try {            
            // Read in one line of a file...
            FileReader     reader = new FileReader("C:\\1\\file.xyz");
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            java.lang.System.out.println(line);
            buffer.close();

            // What if the file had multiple lines?
            reader = new FileReader("C:\\1\\multiple.txt");
            buffer = new BufferedReader(reader);
            line = buffer.readLine();
            while (line != null) {
                java.lang.System.out.println(line);
                line = buffer.readLine();
            }            
            buffer.close();                   
        } catch (IOException e) {         }
        
        ////////////////////////////////////////////////////////////////////////
        // MORE FILE CONTENT (extra stuff for those who want to learn)
        ////////////////////////////////////////////////////////////////////////
        
        // Do it again with the array (multiple lines).........................
        System.out.println("Open file with multiple lines (user picks file)");
        
        try {
            chooser.showOpenDialog(null);
            file = chooser.getSelectedFile();
            FileReader     reader = new FileReader(file);       // Connect.....
            BufferedReader buffer = new BufferedReader(reader); // Connect.....            
            String line = buffer.readLine();                    // Read line...       
            while (line != null) {                  // Loop until no inputs left
                System.out.println("This line read was " + line); // Output....
                line = buffer.readLine();                       // Read again..
            }
            buffer.close();                                     // Close connect  
        } 
        catch (IOException e) { }    // You do not need to respond to the error
        
        // We can use a pre-built class (from Mr. Wachs but you can modify it
        // or not use it) to do the same thing (save and open).................
        Simulator.comment("Class to save/open one line (no user)");
        
        // Instantiate (make an object) the file handler....................... 
        FileHandler fileHandler = new FileHandler();
        
        // We can call any of the methods to do what we need...................  
        fileHandler.save(word, name);
        String newWord = fileHandler.open(name);
        
        // Compare the before and after........................................        
        System.out.println("Before: " + word);
        System.out.println("After : " + newWord);
                
        // Now with the array of data, we create a save dialog (using another 
        // class available to you).............................................  
        Simulator.comment("Class to save/open multiple lines (with user)");
        
        Dialogs dialog = new Dialogs();
        file = dialog.saveFile(null);
        fileHandler.save(poem, file);
        file = dialog.openFile(null);
        String[] newPoem = fileHandler.openArray(file);
        
        // Compare the before and after (and use another class "tool" to help).  
        Text text = new Text();
        System.out.println("Before: " + text.toString(poem));
        System.out.println("After:  " + text.toString(newPoem));
        
        // Now we want to save "anything" to a file (for save and open)........
        Simulator.comment("Now save/open on a complex data type");
        
        
        // Make a variable of "anything", or array of ("anythings", or a 
        // collection (LinkedList) of "anythings"..............................
        
        // Create an Athlete object............................................
        Athlete athlete = new Athlete();
        
        // Save this class object data to a file, open it, and compare......... 
        fileHandler.saveObject(athlete, name);
        Athlete newAthlete = (Athlete)fileHandler.openObject(name);
        System.out.println("Before: " + athlete.toString());        
        if (newAthlete != null) {
            System.out.println("After:  " + newAthlete.toString());
        }
        
        // Now take it up to an entire collection of class level objects all 
        // put into a linked list collection and then dave the entire list to
        // a file, open the entire list, and compare the two lists.............   
        LinkedList<Athlete> athletes = new LinkedList<>();
        
        Numbers numbers = new Numbers();
        
        // Traverse up to 100 athlete objects (instances), creating Athlete 
        // objects, assign them random names and ages, and then adding that 
        // instance to the list................................................
        for (int i = 0; i < 100; i++) {
            String athleteName     = text.randomWord();
            Athlete athleteForList = new Athlete(athleteName);
            athletes.add(athleteForList);
        }
        
        // Save the list to the file, open the list, and compare...............  
        fileHandler.saveObject(athletes, file);
        LinkedList<Athlete> newAthletes = 
                (LinkedList<Athlete>)fileHandler.openObject(file);
        System.out.println("Before: " + athletes);
        System.out.println("After:  " + newAthletes);
        
        System.out.println("Completed Learning about File Handling...........");
    }
     
}