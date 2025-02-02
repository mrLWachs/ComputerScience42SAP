
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.System;

 
/**
 * Results.java - a collection of useful methods for displaying the results of
 * testing searching and sorting code
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Results 
{
    
    private static Text display = new Text();
    
    /**
     * Displays the results of a search
     * 
     * @param array the array to search through
     * @param item the item to search for
     * @param found whether the item was found or not found
     */
    public static void show(int[] array, int item, boolean found) {
        String text = "";
        text += "Array " + display.toString(array);
        text += "\n\t Searching for: \t "  + item;
        text += "\n\t Item found was: \t " + found;
        System.out.println(text);
    }

    /**
     * Displays the results of a sort
     * 
     * @param array the array to sort
     */
    public static void show(int[] array) {
        String text = "Sorted Array: \t" + display.toString(array);
        System.out.println(text);
    }
    
     /**
     * Displays the results of a search
     * 
     * @param array the array to search through
     * @param item the item to search for
     * @param index which array index it was found at (or -1 if not found)
     */
    public static void show(int[] array, int item, int index) {
        String text = "";
        text += "Array " + display.toString(array);
        text += "\n\t Searching for: \t "  + item;
        text += "\n\t Location index: \t " + index;
        System.out.println(text);
    }

    /**
     * Displays the results of a sort
     * 
     * @param array the original array
     * @param sorted the sorted array
     */
    public static void show(int[] array, int[] sorted) {
        String text = "";
        text += "Original Array \t" + display.toString(array);
        text += "\nSorted Array \t" + display.toString(sorted);
        System.out.println(text);
    }
    
    /**
     * Displays the results of a search
     * 
     * @param list the LinkedList of items
     * @param word the string to search for
     * @param index the index it was found at (or -1 if not found)
     */
    public static void show(LinkedList<String> list, String word, int index) {
        String text = "";
        text += list.toString();
        text += "\t word: \t" + word;
        text += "\t index: \t" + index;
        System.out.println(text);
    }
    
    /**
     * Displays the results of a search
     * 
     * @param array the array of items
     * @param word the string to search for
     * @param index the index it was found at (or -1 if not found)
     */
    public static void show(String[] array, String word, int index) {
        String text = "";
        Text textTool = new Text();
        text += textTool.toString(array);
        text += "\t word: \t" + word;
        text += "\t index: \t" + index;
        System.out.println(text);
    }
    
    /**
     * Displays the results of a sort
     * 
     * @param before the LinkedList of items before sorting
     * @param after the LinkedList of items after sorting
     */
    public static void show(LinkedList<String> before, 
                            LinkedList<String> after) {
        String text = "";
        text += "Before: \t" + before.toString() + "\n";
        text += "After:  \t" + after.toString();       
        System.out.println(text);
    }

    /**
     * Displays the results of a sort
     * 
     * @param before the array of items before sorting
     * @param after the array of items after sorting
     */
    public static void show(String[] before, 
                            String[] after) {
        Text textTool = new Text();
        String text = "";
        text += "Before: \t" + textTool.toString(before) + "\n";
        text += "After:  \t" + textTool.toString(after);       
        System.out.println(text);
    }
    
}