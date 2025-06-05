
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.FileHandler;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


/**
 * Text.java - a collection of useful methods for working with text
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Text 
{
    
    // Encapsulated global class properties below..............................
    
    private final char   ALPHA_LOW       = 'a';
    private final char   ALPHA_HIGH      = 'z';
    private final String ARRAY_START     = "[";
    private final String ARRAY_DIVIDE    = ",";
    private final String ARRAY_END       = "]";
    private final String MATRIX_DIVIDE   = "\t"; 
    private final String NEW_LINE        = "\n";     
    private final String DICTIONARY_FILE = "/utility/tools/dictionary.txt";
         
    private        FileHandler<String> fileHandler;
    private        Numbers             numbers;
    private static LinkedList<String>  words;
    
    /** The longest word (in characters) in the dictionary of words */
    public static int longestWord;
    
    
    /**
     * Default class constructor sets class properties
     */
    public Text() {
        final String ERROR = "URI Syntax Error: ";
        numbers = new Numbers();
        if (words == null) {
            try {
                URL  url    = getClass().getResource(DICTIONARY_FILE);
                if (url == null) return;
                URI  uri    = url.toURI();
                File file   = new File(uri);        
                fileHandler = new FileHandler<>();
                words       = fileHandler.openList(file);
                longestWord = words.longestWord;
            }
            catch (URISyntaxException error) {
                System.out.println(ERROR + error.getMessage());
            }
        }
    }
     
    /**
     * Generates a random character
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    public char random(char low, char high) {
        return (char)(numbers.random((int)low,(int)high));     
    }
        
    /**
     * Generate a random string of alphabetical characters
     * 
     * @param length the length of the string to generate
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return a random string of characters
     */
    public String random(int length, char low, char high) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += random(low, high);
        }
        return text;
    }
    
    /**
     * Generate a random string of alphabetical characters
     * 
     * @param length the length of the string to generate
     * @return a random string of characters
     */
    public String random(int length) {
        return random(length, ALPHA_LOW, ALPHA_HIGH);
    }    
    
    /**
     * Retrieves a random word from a dictionary file
     * 
     * @return a random word from a dictionary file
     */
    public String randomWord() {
        if (words == null) return "word";
        int low   = 0;
        int high  = words.size()-1;
        int index = numbers.random(low, high);
        return words.get(index);
    }
    
    /**
     * Retrieves a random word from a dictionary file
     * 
     * @param length the length (in characters) of the word to generate
     * @return a random word from a dictionary file
     */
    public String randomWord(int length) {
        String word = randomWord();
        while (word.length() != length) {
            word = randomWord();
        }
        return word;
    }
    
    /**
     * Generates an array of random characters in the range between low and high
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param size the size to make the array
     * @return an array of random characters
     */
    public char[] random(char low, char high, int size) {
        char[] characters = new char[size];     // create empty array 
        for (int i = 0; i < size; i++) {        // traverse array size
            characters[i] = random(low,high);   // assign random value to each index
        }
        return characters;                      // return completed array
    }
    
    /**
     * Generates an array of random strings of alphabetical characters
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param length the length of the string to generate
     * @param size the size to make the array
     * @return an array of random strings
     */
    public String[] random(char low, char high, int length, int size) {
        String[] strings = new String[size]; // create empty array 
        for (int i = 0; i < size; i++) {     // traverse array size
            strings[i] = random(length);     // assign random value to index
        }
        return strings;                      // return completed array
    }       
    
    /**
     * Generates an array of random words from a dictionary file
     * 
     * @param size the size to make the array
     * @return an array of random words
     */
    public String[] randomWords(int size) {
        String[] strings = new String[size];    // create empty array 
        for (int i = 0; i < size; i++) {        // traverse array size
            strings[i] = randomWord();          // assign random value to index
        }
        return strings;                         // return completed array
    }
    
    /**
     * Generates an array of random words from a dictionary file
     * 
     * @param size the size to make the array
     * @param length the length (in characters) of the word to generate
     * @return an array of random words
     */
    public String[] randomWordSize(int size, int length) {
        String[] strings = new String[size];    // create empty array 
        for (int i = 0; i < size; i++) {        // traverse array size
            strings[i] = randomWord(length);    // assign random value to index
        }
        return strings;                         // return completed array
    }
    
    /**
     * Generates an array of random words from a dictionary file
     * 
     * @param size the size to make the array
     * @param length the length (in characters) of the word to generate
     * @param toLower flag for lowercase (true) or uppercase (false) letters
     * @return an array of random words
     */
    public String[] randomWordSize(int size, int length, boolean toLower) {
        String[] strings = randomWordSize(size, length);
        for (int i = 0; i < strings.length; i++) {
            if (toLower) strings[i] = strings[i].toLowerCase();
            else         strings[i] = strings[i].toUpperCase();
        }        
        return strings;
    }    
    
    /**
     * Generates a matrix of random characters in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random characters
     */
    public char[][] random(int rows, int columns, char low, char high) {
        char[][] matrix = new char[rows][columns];      // create empty matrix
        for (int row = 0; row < rows; row++) {          // traverse rows
            matrix[row] = random(low, high, columns);   // create random row
        }
        return matrix;                              // return completed matrix
    }
    
    /**
     * Generates a matrix of random characters in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param length the size to make the random string
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random characters
     */
    public String[][] random(int rows, int columns, int length, char low, 
                             char high) {
        String[][] matrix = new String[rows][columns];  // create empty matrix
        for (int row = 0; row < rows; row++) {          // traverse rows
            matrix[row] = random(low, high, length, columns);   // create row
        }
        return matrix;                              // return completed matrix
    }
    
    /**
     * Generates a matrix of random words from a dictionary file
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @return a matrix of random words
     */
    public String[][] randomWords(int rows, int columns) {
        String[][] matrix = new String[rows][columns];  // create empty matrix
        for (int row = 0; row < rows; row++) {          // traverse rows
            matrix[row] = randomWords(columns);         // create row
        }
        return matrix;                              // return completed matrix
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param <T> the generic data type used
     * @param array the array to format
     * @return a string of formatted text
     */
    public <T> String toString(T[] array) {
        if (array == null)     return "null";
        if (array.length == 0) return "Empty array";
        String text = ARRAY_START;
        for (int i = 0; i < array.length-1; i++) {
            text += array[i].toString() + ARRAY_DIVIDE;
        }
        return text + array[array.length-1] + ARRAY_END;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public String toString(int[] array) {
        if (array == null)     return "null array";
        if (array.length == 0) return "Empty array";
        String text = ARRAY_START;
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ARRAY_DIVIDE;
        }
        return text + array[array.length-1] + ARRAY_END;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public String toString(double[] array) {
        if (array == null)     return "null array";
        if (array.length == 0) return "Empty array";
        String text = ARRAY_START;
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ARRAY_DIVIDE;
        }
        return text + array[array.length-1] + ARRAY_END;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public String toString(char[] array) {
        if (array == null)     return "null array";
        if (array.length == 0) return "Empty array";
        String text = ARRAY_START;
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ARRAY_DIVIDE;
        }
        return text + array[array.length-1] + ARRAY_END;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public String toString(int[][] matrix) {
        if (matrix == null)     return "null matrix";
        if (matrix.length == 0) return "Empty matrix";
        String text = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;
            }
            text += NEW_LINE;
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public String toString(double[][] matrix) {
        if (matrix == null)     return "null matrix";
        if (matrix.length == 0) return "Empty matrix";
        String text = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;
            }
            text += NEW_LINE;
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public String toString(char[][] matrix) {
        if (matrix == null)     return "null matrix";
        if (matrix.length == 0) return "Empty matrix";
        String text = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;
            }
            text += NEW_LINE;
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param <T> the generic type used
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public <T> String toString(T[][] matrix) {
        if (matrix == null)     return "null matrix";
        if (matrix.length == 0) return "Empty matrix";
        String text = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column].toString() + MATRIX_DIVIDE;
            }
            text += NEW_LINE;
        }
        return text;
    }
        
    /**
     * Pad the string with trailing spaces to make sure it is the length
     * of the parameter
     * 
     * @param <T> the generic data type used
     * @param original the string to pad
     * @param length the length to pad it to
     * @return the original string with padding of spaces at the end
     */
    public <T> String padSpaces(T original, int length) {
        final String SPACE = " ";
        String newWord = original.toString();
        if (newWord.length() < length) {
            for (int i = newWord.length(); i <= length; i++) {
                newWord = newWord + SPACE;
            }
        }
        return newWord;
    }
    
    /**
     * Pad all the array spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param array the array of values to pad
     * @param length the length to pad it to
     * @return the original array with padding of spaces at the ends
     */
    public <T> String[] padSpaces(T[] array, int length) {
        if (array == null)     return null;
        if (array.length == 0) return null;
        String[] a = new String[array.length];
        for (int i = 0; i < a.length; i++) {
            String word = padSpaces(array[i], length);
            a[i] = word;
        }
        return a;
    }

    /**
     * Pad all the matrix spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param matrix the matrix of values to pad
     * @param length the length to pad it to
     * @return the original matrix with padding of spaces at the ends
     */
    public <T> String[][] padSpaces(T[][] matrix, int length) {
        if (matrix == null)     return null;
        if (matrix.length == 0) return null;
        String[][] m = new String[matrix.length][matrix[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                String word = padSpaces(matrix[row][column], length);
                m[row][column] = word;
            }
        }
        return m;
    }    
    
    /**
     * Pad all the LinkedList spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param list the LinkedList of values to pad
     * @param length the length to pad it to
     * @return the original LinkedList with padding of spaces at the ends
     */
    public <T> LinkedList padSpaces(LinkedList list, int length) {
        if (list == null)     return null;
        LinkedList l = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            String word = padSpaces(list.get(i), length);
            l.add(word);
        }
        return l;
    }
        
    /**
     * Pad all the array spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param array the array of values to pad
     * @return the original array with padding of spaces at the ends
     */
    public <T> String[] padSpaces(T[] array) {
        if (array == null)     return null;
        if (array.length == 0) return null;
        int length = findLongest(array);
        String[] a = new String[array.length];
        for (int i = 0; i < a.length; i++) {
            String word = padSpaces(array[i], length);
            a[i] = word;
        }
        return a;
    }

    /**
     * Pad all the matrix spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param matrix the matrix of values to pad
     * @return the original matrix with padding of spaces at the ends
     */
    public <T> String[][] padSpaces(T[][] matrix) {
        if (matrix == null)     return null;
        if (matrix.length == 0) return null;
        int length = findLongest(matrix);
        String[][] m = new String[matrix.length][matrix[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                String word = padSpaces(matrix[row][column], length);
                m[row][column] = word;
            }
        }
        return m;
    }    
    
    /**
     * Pad all the LinkedList spots with trailing spaces to make sure it is the 
     * length of the parameter
     * 
     * @param <T> the generic data type used
     * @param list the LinkedList of values to pad
     * @return the original LinkedList with padding of spaces at the ends
     */
    public <T> LinkedList padSpaces(LinkedList list) {
        if (list == null)     return null;
        int length = findLongest(list);
        LinkedList l = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            String word = padSpaces(list.get(i), length);
            l.add(word);
        }
        return l;
    }
        
    /**
     * Finds the longest (most characters) string value in the matrix
     * 
     * @param <T> the generic type used
     * @param matrix the matrix to use
     * @return the longest value of the longest in the matrix
     */
    public <T> int findLongest(T[][] matrix) {
        if (matrix == null)     return -1;
        if (matrix.length == 0) return -1;
        int longest = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column].toString().length() > longest) {
                    longest = matrix[row][column].toString().length();
                }
            }
        }
        return longest;
    }

    /**
     * Finds the longest (most characters) string value in the array
     * 
     * @param <T> the generic type used
     * @param array the array to use
     * @return the longest value of the longest in the array
     */
    public <T> int findLongest(T[] array) {
        if (array == null)     return -1;
        if (array.length == 0) return -1;
        int longest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].toString().length() > longest) {
                longest = array[i].toString().length();
            }
        }
        return longest;
    }
    
    /**
     * Finds the longest (most characters) string value in the LinkedList
     * 
     * @param <T> the generic type used
     * @param list the LinkedList to use
     * @return the longest value of the longest in the LinkedList
     */
    public <T> int findLongest(LinkedList list) {
        if (list == null)     return -1;
        int longest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().length() > longest) {
                longest = list.get(i).toString().length();
            }
        }
        return longest;
    }
        
    /**
     * Generates a list of random characters in the range between low and high
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param size the size to make the array
     * @return a list of random characters
     */
    public LinkedList<Character> randomList(char low, char high, int size) {
        LinkedList<Character> list = new LinkedList<Character>();
        for (int i = 0; i < size; i++) {
            list.add(random(low, high));
        }
        return list;
    }

    /**
     * Generates a list of random strings of alphabetical characters
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param length the length of the string to generate
     * @param size the size to make the array
     * @return a list of random strings
     */
    public LinkedList<String> randomList(char low, char high, int length, int size) {
        return new LinkedList<String>(random(low, high, length, size));
    }

    /**
     * Generates a list of random words from a dictionary file
     * 
     * @param size the size to make the array
     * @return a list of random words
     */
    public LinkedList<String> randomList(int size) {
        return new LinkedList<String>(randomWords(size));
    }
        
    /**
     * Generates a list of random words from a dictionary file
     * 
     * @param size the size to make the array
     * @param length the length (in characters) of the word to generate
     * @return a list of random words
     */
    public LinkedList<String> randomList(int size, int length) {
        return new LinkedList<String>(randomWordSize(size, length));
    }
    
}
