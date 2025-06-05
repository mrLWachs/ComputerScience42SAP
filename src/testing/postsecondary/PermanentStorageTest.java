
/** Required package class namespace */
package testing.postsecondary;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.Dialogs;
import utility.io.FileHandler;
import utility.io.JFileChooser;
import utility.io.Simulator;
import utility.io.System;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import testing.Tester;
import testing.prerequisite.cs40s.advancedclasses.Athlete;
import utility.tools.Numbers;
import utility.tools.Text;


/**
 * PermanentStorageTest.java - tests the concepts learned in this unit. Apps 
 * you have previously created stored data in memory as primitive data 
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
 * @since June 2023
 */
public class PermanentStorageTest 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public PermanentStorageTest(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Permanent Storage Post Secondary Content not running");
            return;
        }
        Simulator.title("Permanent Storage Post Secondary Content:");

        // Learn about "error traps"...........................................   
        Simulator.comment("Learn about 'error traps'");
                
        try {
            // Opening the "try" block (means "try this code"), this is the 
            // "trap" we set to "try" some code, and if an error occurs (of 
            // the type we are catching for) we "catch" that error and the  
            // program keeps running.......................................... 
            double number = 3 / 0;
            int[] a = { 1, 2, 3 };
            a[5] = 0;
        }
        catch (ArithmeticException error) {
            // Open the "catch" block, so if an error occurs in the "try" block
            // of the type we defined (divide by zero..) the program will 
            // not shut down, instead it will jump (branch) to this block (the 
            // catch block).................................................... 
            System.out.println("Divide by zero -> " + error.toString());
        }
        catch (ArrayIndexOutOfBoundsException error) {
            // You can add multiple "catch" blocks.............................    
            System.out.println("Array was out of bounds -> " + error.toString());
        }       
                
        // Now some file handling..............................................
               
        // Create data to use.................................................. 
        Simulator.comment("Create sample data to use");
        
        String[] poem = {
            "I look at my watch for the hour",
            "But I find it has run out of power",
            "I yell out Oh No!",
            "I have got to go!",
            "For I fear that the milk has gone sour"
        };                                                  // Student poem....
        String word = "Defenestration";                     // Student word....     
                
        // Let's create a proper file NAME.....................................
        String first  = "C:\\temp\\";   // File "Path" (e.g. "c:/my docs...")
        String middle = "data";         // File name (e.g. "essay")
        String last   = ".txt";         // File extention (e.g. ".doc" ".txt")
        String name   = first + middle + last; // Full Name (parts concatinated)
        
        // Write ONE piece of data (the word) to that permanent file............        
        Simulator.comment("Save ONE piece of data to that permanent file");
        
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
        
        // Now involve the user in naming of a file.............................        
        Simulator.comment("Now involve the user to get a file name");
        
        // We could get input from the user using very simple input like 
        // Scanner or a simple JOptionPane input dialog like this...............
        
        // Scanner scanner = new Scanner(System.in);
        // name = scanner.nextLine();
        // name = JOptionPane.showInputDialog("Enter name");
                
        // Or we could build a GUI and use a textbox, but instead, we will use
        // something new that is already built for ths..........................
        
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(null);           // Showing a dialog to user....
        
        // We will also use a "File" class object to work with as well.........
        File file = chooser.getSelectedFile();  // Get the name from the user
                
        // Check the file the user just selected...............................
        if (file == null) {                     // Error check on the file.....   
            // Means the user hit cancel or ok without selecting, etc..........
            System.out.println("Please name a file");
        }
        else {
            if (!file.exists()) {
                // The file does not exist so we create it......................
                try {
                    FileWriter  writer  = new FileWriter(file);    // Link file
                    PrintWriter printer = new PrintWriter(writer); // and writer
                    // Use the enhanced for loop - which you can read as...
                    // "for every line in poem"
                    for (String line : poem) {  // Enhanced loop through array..  
                        printer.println(line);      // Writing one array index..
                    }
                    printer.close();            // Sever (close) file connection  
                } 
                catch (IOException error) {                 // Catch error.....
                    System.out.println("File save error");  // Message user....
                }
            }
            else {
                // The file already does exist.................................    
                System.out.println("File already exists!");
            }
        }     
                
        // Now open the files (for the one with one line)...................... 
        Simulator.comment("Open file with one line (no user involvment)");
        
        try {
            // Use of similar classes form similar APIs to read from files as 
            // we used to write to files
            FileReader     reader = new FileReader(name);       // Connect.....
            BufferedReader buffer = new BufferedReader(reader); // Connect..... 
            String line = buffer.readLine();                    // Read line...
            System.out.println("line read was " + line);        // Output line.
            buffer.close();                                     // Close connect
        } 
        catch (IOException e) { }    // You do not need to respond to the error 
        
        // Do it again with the array (multiple lines).........................         
        Simulator.comment("Open file with multiple lines (user picks file)");
        
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
//        file = dialog.saveFile(null);
        fileHandler.save(poem, file);
//        file = dialog.openFile(null);
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
        System.out.println("Before: " + athletes.toString());
        System.out.println("After:  " + newAthletes.toString());
        
        // End of file handling................................................
    }   

}
