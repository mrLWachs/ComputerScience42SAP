
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;

 
/**
 * Numbers.java - a collection of useful methods for working with numbers
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Numbers 
{

    // Encapsulated global class properties below..............................
    
    private final char NEGATIVE = '-';
    private final char DECIMAL  = '.';
    
    /**
     * Checks the value to see if it contains numerical characters or a "-" 
     * or a "."
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    public boolean isDouble(String value) {
        char[] characters = value.toCharArray();
        for (int i = 0; i < characters.length; i++) {            
            if (Character.isDigit(characters[i]) == false) {
                if (characters[i] != DECIMAL && 
                    characters[i] != NEGATIVE) {
                    return false;
                }
            }
        }
        try {
            Double.parseDouble(value);
        } 
        catch (NumberFormatException error) {
            return false;
        }
        return true;
    }
    
    /**
     * Checks the value to see if it contains numerical characters or a "-"
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    public boolean isInteger(String value) {
        char[] characters = value.toCharArray();
        for (int i = 0; i < characters.length; i++) {            
            if (Character.isDigit(characters[i]) == false) {
                if (characters[i] != NEGATIVE) {
                    return false;
                }
            }
        }
        try {
            Integer.parseInt(value);
        } 
        catch (NumberFormatException error) {
            return false;
        }
        return true;
    }

    /**
     * Determines if a number if odd or even
     * 
     * @param number the number to check
     * @return true (if even), false (if odd)
     */
    public boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else                 return false;
    }
    
    /**
     * Checks to make sure the number is in the range
     * 
     * @param number the number to check
     * @param low lowest in the range
     * @param high highest in the range
     * @return in range (true) or not (false)
     */
    public boolean inRange(int number, int low, int high) {
        if (number >= low && number <= high) return true;
        return false;
    }
    
    /**
     * Checks to make sure the number is in the range
     * 
     * @param number the number to check
     * @param low lowest in the range
     * @param high highest in the range
     * @return in range (true) or not (false)
     */
    public boolean inRange(double number, double low, double high) {
        if (number >= low && number <= high) return true;
        return false;
    }
    
    /**
     * Rounds off a number to the passed number of decimal places
     * 
     * @param number the number to round off
     * @param places the number of places to round to
     * @return a rounded off number
     */
    public double round(double number, int places) {
        String text = String.format("%." + places + "f",number);
        double rounded = Double.parseDouble(text);
        return rounded;
    }
    
    /**
     * Rounds off all numbers in the array to the passed number of decimal 
     * places
     * 
     * @param array the array to use
     * @param places the number of places to round to
     * @return a rounded off array of numbers
     */
    public double[] round(double[] array, int places) {
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = round(array[i], places);
        }
        return a;
    }
    
    /**
     * Rounds off all numbers in the matrix to the passed number of decimal 
     * places
     * 
     * @param matrix the matrix to use
     * @param places the number of places to round to
     * @return a rounded off matrix of numbers
     */
    public double[][] round(double[][] matrix, int places) {
        double[][] m = new double[matrix.length][matrix[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = round(matrix[row][column], places);
            }
        }
        return m;
    }
    
    /**
     * Rounds off all numbers in the LinkedList to the passed number of decimal 
     * places
     * 
     * @param list the LinkedList to use
     * @param places the number of places to round to
     * @return a rounded off LinkedList of numbers
     */
    public LinkedList<Double> round(LinkedList<Double> list, int places) {
        LinkedList<Double> l = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            l.add(round(list.get(i), places));
        }
        return l;
    }
    
    /**
     * Generate a random Boolean
     * 
     * @return random Boolean (true or false)
     */
    public boolean random() {
        return random(0, 1) == 0;
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    public int random(int low, int high) {
        return (int)(random((double)low, (double)high));
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    public double random(double low, double high) {
        return ((high - low + 1d) * Math.random() + low);
    }
      
    /**
     * Generates an array of random Booleans 
     * 
     * @param size the size to make the array
     * @return an array of random integers
     */
    public boolean[] random(int size) {
        boolean[] numbers = new boolean[size]; // create empty array
        for (int i = 0; i < size; i++) {       // traverse array size
            numbers[i] = random();  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
    
    /**
     * Generates an array of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    public int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // create empty array of passed size
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
    
    /**
     * Generates an array of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    public Integer[] randomClass(int low, int high, int size) {
        Integer[] numbers = new Integer[size];  // create empty array
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
    
    /**
     * Generates an array of random doubles in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random doubles
     */
    public double[] random(double low, double high, int size) {
        double[] numbers = new double[size]; // create empty array 
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
   
    /**
     * Generates a matrix of random integers in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random integers
     */
    public int[][] random(int rows, int columns, int low, int high) {
        int[][] matrix = new int[rows][columns];    // create empty matrix
        for (int row = 0; row < rows; row++) {      // traverse rows
            matrix[row] = random(low, high, columns);   // create random row
        }
        return matrix;                              // return completed matrix
    }
    
    /**
     * Generates a matrix of random doubles in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random doubles
     */
    public double[][] random(int rows, int columns, double low, double high) {
        double[][] matrix = new double[rows][columns];    // create empty matrix
        for (int row = 0; row < rows; row++) {      // traverse rows
            matrix[row] = random(low, high, columns);   // create random row
        }
        return matrix;                              // return completed matrix
    }
    
    /**
     * Generates a list of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the list
     * @return a list of random integers
     */
    public LinkedList<Integer> randomList(int low, int high, int size) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(random(low, high));
        }
        return list;
    }
    
    /**
     * Generates a list of random doubles in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the list
     * @return a list of random doubles
     */
    public LinkedList<Double> randomList(double low, double high, int size) {
        LinkedList<Double> list = new LinkedList<Double>();
        for (int i = 0; i < size; i++) {
            list.add(random(low, high));
        }
        return list;
    }
    
    /**
     * Generates a list of random Booleans
     * 
     * @param size the size to make the list
     * @return a list of random doubles
     */
    public LinkedList<Boolean> randomList(int size) {
        LinkedList<Boolean> list = new LinkedList<Boolean>();
        for (int i = 0; i < size; i++) {
            list.add(random());
        }
        return list;
    }

    /**
     * Creates an empty clone of the passed array
     * 
     * @param array the array to clone
     * @return a clone (empty) of the passed array
     */
    public Integer[] arrayClone(Integer[] array) {
        Integer[] clone = new Integer[array.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = new Integer(array[i]);
        }
        return clone;
    }
    
}
