
/** Required package class namespace */
package utility.io;

/** Required API imports */
import utility.collections.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


/**
 * FileHandler.java - a collection of useful methods for working with files
 *
 * @author Mr. Wachs 
 * @param <T> the generic data type to use
 * @since June 2023
 */
public class FileHandler <T>
{
    
    private Dialogs dialog;                     // dialogs used for errors
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param dialog the Dialog object to associate with
     */
    public FileHandler(Dialogs dialog) {
        this.dialog = dialog;
    }

    /**
     * Default constructor for the class sets class properties
     */
    public FileHandler() {
        this.dialog = new Dialogs("");
    }

    /**
     * Saves the passed text to the passed file name
     * 
     * @param text the text to save
     * @param fileName the name of the file to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(String text, String fileName) {
        try {            
            FileWriter stream = new FileWriter(fileName);
            PrintWriter file  = new PrintWriter(stream);
            file.print(text);
            file.close();
            return true;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return false;
        }
        catch (IOException error) {
            System.out.println("File save: " + error.toString());
            return false;
        }
    }
    
    /**
     * Saves the passed text to the passed file 
     * 
     * @param text the text to save
     * @param file the File object to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(String text, File file) {
        try {
            return save(text,file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
    }
       
    /**
     * Saves the passed array of text to the passed file name
     * 
     * @param array the array of text to save
     * @param fileName the name of the file to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(String[] array, String fileName) {
        try {            
            FileWriter stream = new FileWriter(fileName);
            PrintWriter file  = new PrintWriter(stream);            
            for (String string : array) {
                file.println(string);
            }
            file.close();
            return true;
        }
        catch (ArrayIndexOutOfBoundsException |
               ArrayStoreException error) {
            System.out.println("Array type: " + error.toString());
            return false;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return false;
        }
        catch (IOException error) {
            System.out.println("File save: " + error.toString());
            return false;
        }
    }
    
    /**
     * Saves the passed text to the passed file 
     * 
     * @param array the array of text to save
     * @param file the File object to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(String[] array, File file) {
        try {
            return save(array,file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
    }
        
    /**
     * Saves the passed list of text to the passed file name
     * 
     * @param list a LinkedList of text to save
     * @param fileName the name of the file to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(LinkedList<String> list, String fileName) {
        try {            
            FileWriter stream = new FileWriter(fileName);
            PrintWriter file  = new PrintWriter(stream);              
            for (int i = 0; i < list.size(); i++) {
                file.println(list.get(i));
            }            
            file.close();
            return true;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return false;
        }
        catch (IOException error) {
            System.out.println("File save: " + error.toString());
            return false;
        }
    }
    
    /**
     * Saves the passed text to the passed file 
     * 
     * @param list a LinkedList of text to save
     * @param file the File object to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean save(LinkedList<String> list, File file) {
        try {
            return save(list,file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
    }
        
    /**
     * Appends the passed text to the passed file name
     * 
     * @param line the line of text to append to the end of the file
     * @param fileName the name of the file to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean append(String line, String fileName) {
        try {            
            FileWriter stream = new FileWriter(fileName,true);
            PrintWriter file  = new PrintWriter(stream);
            file.println(line);
            file.close();
            return true;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return false;
        }
        catch (IOException error) {
            System.out.println("File save: " + error.toString());
            return false;
        }
    }
    
    /**
     * Appends the passed text to the passed file 
     * 
     * @param line the line of text to append to the end of the file
     * @param file the File object to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean append(String line, File file) {
        try {
            return append(line,file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
    }
        
    /**
     * Opens the passed file name and returns the contents as a single string
     * 
     * @param fileName the name of the file to open
     * @return a string of the contents of the file (or null)
     */
    public String open(String fileName) {
        try {            
            FileReader stream   = new FileReader(fileName);
            BufferedReader file = new BufferedReader(stream);
            String line = file.readLine();
            file.close();
            return line;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return null;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return null;
        }
    }

    /**
     * Opens the passed file and returns the contents as a single string
     * 
     * @param file the file to open
     * @return a string of the contents of the file (or null)
     */
    public String open(File file) {
        try {
            return open(file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
    }
    
    /**
     * Opens the passed file name and returns the contents as a string array
     * 
     * @param fileName the name of the file to open
     * @return a string array of the contents of the file (or null)
     */
    public String[] openArray(String fileName) {
        try {            
            FileReader stream   = new FileReader(fileName);
            BufferedReader file = new BufferedReader(stream);
            String line = file.readLine();            
            LinkedList<String> list = new LinkedList<>();            
            while (line != null) {
                list.add(line);
                line = file.readLine();
            }
            String[] array = new String[0];
            array = list.toArray(array);            
            file.close();
            return array;
        }
        catch (ArrayIndexOutOfBoundsException  |
               ArrayStoreException error) {
            System.out.println("Array: " + error.toString());
            return null;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return null;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return null;
        }
    }

    /**
     * Opens the passed file and returns the contents as a string array
     * 
     * @param file the file to open
     * @return a string array of the contents of the file (or null)
     */
    public String[] openArray(File file) {
        try {
            return openArray(file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
    }
        
    /**
     * Opens the passed file name and returns the contents as a string list
     * 
     * @param fileName the name of the file to open
     * @return a string LinkedList of the contents of the file (or null)
     */
    public LinkedList<String> openList(String fileName) {
        try {            
            FileReader stream   = new FileReader(fileName);
            BufferedReader file = new BufferedReader(stream);
            String line = file.readLine();            
            LinkedList<String> list = new LinkedList<>();            
            while (line != null) {
                list.add(line);
                line = file.readLine();
            }          
            file.close();
            return list;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return null;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return null;
        }
    }

    /**
     * Opens the passed file and returns the contents as a string list
     * 
     * @param file the file to open
     * @return a string LinkedList of the contents of the file (or null)
     */
    public LinkedList<String> openList(File file) {
        try {
            return openList(file.getAbsolutePath());
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
    }
    
    /**
     * Opens the passed file and returns the contents as a LinkedList of
     * ACSII integers
     * 
     * @param file the file to open
     * @return a LinkedList of integers (ASCII) contents or null
     */
    public LinkedList<Integer> openASCIICollection(File file) {
        try {            
            FileReader stream   = new FileReader(file);
            BufferedReader reader = new BufferedReader(stream);
            LinkedList<Integer> tokens = new LinkedList<>();            
            int token = reader.read();
            while (token != -1) {
                tokens.add(token);
                token = reader.read();
            }
            reader.close();
            return tokens;
        }
        catch (NullPointerException error) {
            System.out.println("Null: " + error.toString());
            return null;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return null;
        }
    }
    
    /**
     * Opens the passed file and returns the contents as a LinkedList of
     * ACSII integers
     * 
     * @param fileName the name of the file to open
     * @return a LinkedList of integers (ASCII) contents or null
     */
    public LinkedList<Integer> openASCIICollection(String fileName) {
        try {
            return openASCIICollection(new File(fileName));
        }
        catch (NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
    }
    
    /**
     * Opens the passed file and returns the contents as a LinkedList of
     * Characters
     * 
     * @param file the file object to open
     * @return a LinkedList of Character contents or null
     */
    public LinkedList<Character> openCharCollection(File file) {
        LinkedList<Integer>   list       = openASCIICollection(file);
        LinkedList<Character> characters = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            int       value1 = list.get(i).intValue();
            char      value2 = (char)value1;
            Character value3 = new Character(value2);
            characters.add(value3);
        }
        return characters;
    }
        
    /**
     * Saves the generic object to the passed filename
     * 
     * @param data the generic object to save
     * @param filename the filename to save it to
     * @return the operation was successful (true) or not (false)
     */
    public boolean saveObject(T data, String filename) {
        try {
            FileOutputStream   stream = new FileOutputStream(filename);
            ObjectOutputStream output = new ObjectOutputStream(stream);
            output.writeObject(data);
            output.close();
            return true;
        }
        catch(NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return false;
        }
    }
        
    /**
     * Saves the generic object to the passed file
     * 
     * @param data the generic object to save
     * @param file the file object to save to
     * @return the operation was successful (true) or not (false)
     */
    public boolean saveObject(T data, File file) {
        try {
            return saveObject(data, file.getAbsolutePath());
        }
        catch(NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return false;
        }
    }
        
    /**
     * Opens the passed filename and reads the generic object from it
     * 
     * @param filename the filename to open
     * @return the generic data type in the file
     */
    public T openObject(String filename) {
        
        try {
            FileInputStream   stream = new FileInputStream(filename);
            ObjectInputStream input  = new ObjectInputStream(stream);
            T object = (T)input.readObject();
            input.close();
            return object;            
        }
        catch (ClassCastException e) {
            System.out.println("Class casting: " + e.toString());
            return null;
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.toString());
            return null;
        }
        catch(NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
        catch (StackOverflowError error) {
            System.out.println("Stack Over flow: " + error.toString());
            return null;
        }
        catch (IOException error) {
            System.out.println("File open: " + error.toString());
            return null;
        }
    }
    
    /**
     * Opens the passed file object and reads the generic object from it
     * 
     * @param file the file object to open
     * @return the generic data type in the file
     */
    public T openObject(File file) {
        try {
            return openObject(file.getAbsolutePath());
        }
        catch(NullPointerException e) {
            System.out.println("Null: " + e.toString());
            return null;
        }
    }    
    
}