/** Required package class namespace */
package testing.fun;

import java.util.ArrayList;


/*
 * SearchingTest - useful methods for searching through arrays and lists of
 * data for a specific item
 * 
 * @author Mr. Wachs
 * @since Mar 13, 2025
*/
public class SearchingTest
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Array of items to search through
        String[] array = {
            "William", "Kurt", "Alan", "Franz", "Kaleb", "Neal", "Orion", 
            "Tristan", "Cam",  "Teddy", "Finlay", "Yevheniia", "Thomas", 
            "Hunter", "Nathaniel", "Izen", "Jonah", "Wachs"
        };
        
        // An item to search for
        String item = "Wachs";
        
        // Get the simple result of a seach 
        boolean result = search(array,item);
        
        // Display the result
        if (result) System.out.println("Search found " + item);
        else        System.out.println("Search did not find " + item);
        
        // Get a more detailed result of a search
        int index = linearSearch(array, item);
        
        // Display the result
        System.out.println("Linear search array: " + item + " at index " + index);
        
        // Now do the linear search with an ArrayList...
        
        ArrayList<String> list = new ArrayList<>();
        // Fill the list (from the array)...
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        // Now use "built-in" ArrayList methods to search the list...
        result = list.contains(item);        
        if (result) System.out.println("ArrayList found " + item);
        else        System.out.println("ArrayList did not find " + item);
        index = list.indexOf(item);
        System.out.println("Linear search ArrayList: " + item + " at index " + index);
        
        
    }

    /**
     * A simple search, determines if the item is in the array or not
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return found (true) or not (false)
     */
    private static boolean search(String[] array, String item) {
        // Travel the array (traverse, means to "visit" every spot) using a loop
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                // Found it!
                return true;
            }
        }
        // Go through the entire array, never found it
        return false;
    }
    
    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurrence of an item in the array and return
     * the index where it found it, or a -1 if not found 
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found
     */
    private static int linearSearch(String[] array, String item) {
        // Travel the array (traverse, means to "visit" every spot) using a loop
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                // Found it!
                return i;
            }
        }
        // Go through the entire array, never found it
        return -1;
        
        // An alternative loop structure
        // int i = 0;
        // while (i < array.length) {
        //     if (array[i].equals(item)) {
        //         return i;
        //     }
        //     i++;
        // }
        // return -1;        
    }
    

}