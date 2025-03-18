/** Required package class namespace */
package testing.fun;

/** Required API imports */
import java.util.ArrayList;


/*
 * SearchingTest - useful methods for searching through arrays and lists of
 * data for a specific item. This is the student requested review of the 
 * searching concepts as needed for the AP exam (from the AP Computer Science 
 * curriculum). 
 *
 * In the A.P. Computer Science A curriculum in Units 7 and 9, students will 
 * notice that the term "searching" comes up as something potentially they 
 * can be tested on. For example it states: "discuss the algorithm necessary 
 * to search for the smallest value in an ArrayList", and "apply 
 * sequential/linear search algorithms to search for specific information in 
 * array or ArrayList", and "sequential/linear search algorithms check each 
 * element in order until the desired value is found or all elements in the 
 * array or ArrayList have been checked", and "recursive searching algorithms
 * often produce a result much more quickly than iterative solutions", and 
 * "apply recursive search algorithms to information in String, 1D array, or 
 * ArrayList", and "data must be in sorted order to use the binary search 
 * algorithm which starts at the middle of a sorted array or ArrayList and 
 * eliminates half of the array or ArrayList in each iteration until the 
 * desired value is found or all elements have been eliminated", and "binary 
 * search can be more efficient than sequential/linear search", and "search 
 * algorithms other than sequential/linear and binary search are outside the 
 * scope of the course and AP Exam". 
 *
 * However, with more analysis of these curriculum points, more specifics can 
 * be drawn out. Since the curriculum document is vague about it, I would 
 * interpret what you need to know about searching is:
 * 
 * (1) What a sequential search is, how it works, and how to write
 *     it in code as applied to both arrays and ArrayLists
 * (2) What a binary search is, and how it works (not necessarily how to 
 *     write one)
 * (3) How these algorithms can be implemented with iteration (loops) or 
 *     recursively
 * (4) How the binary search is more efficient than the linear search - but 
 *     the binary search only works on sorted data
 * 
 * NOTE: further resources for searching can be found here:
 *       - My video playlist on searching: https://bit.ly/4bN2dbu
 *       - My presentation on searching: https://bit.ly/3FonaxA
 *       - My assignment on searching: https://bit.ly/4269gZy
 *       - My review sheet on searching: https://bit.ly/3FqTgZr
 *       - Some other websites that go over searching:
 *             - https://bit.ly/4hCIFIe
 *             - https://bit.ly/4iu3WFa
 *             - https://bit.ly/4iK8ZkE
 *             - https://bit.ly/3FtFAwV
 *             - https://bit.ly/4bOFITC
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
        
        ////////////////////////////////////////////////////////////////////////
        // Array of items to search through...
        ////////////////////////////////////////////////////////////////////////
        
        String[] array = {
            "William",          // Index 0
            "Kurt",             // Index 1
            "Alan",             // Index 2
            "Franz",            // Index 3
            "Kaleb",            // Index 4
            "Neal",             // Index 5
            "Orion",            // Index 6
            "Tristan",          // Index 7 
            "Cam",              // Index 8
            "Teddy",            // Index 9
            "Finlay",           // Index 10
            "Yevheniia",        // Index 11
            "Thomas",           // Index 12
            "Hunter",           // Index 13
            "Nathaniel",        // Index 14
            "Izen",             // Index 15
            "Jonah",            // Index 16
            "Wachs"             // Index 17
        };
        
        ////////////////////////////////////////////////////////////////////////
        // An item to search for...
        ////////////////////////////////////////////////////////////////////////
        
        String item = "Wachs";
        
        ////////////////////////////////////////////////////////////////////////
        // Get the simple result of a search...
        ////////////////////////////////////////////////////////////////////////
        
        boolean result = search(array,item);
        
        ////////////////////////////////////////////////////////////////////////
        // Display the result...
        ////////////////////////////////////////////////////////////////////////
        
        if (result) System.out.println("Search found " + item);
        else        System.out.println("Search did not find " + item);
        
        ////////////////////////////////////////////////////////////////////////
        // Get a more detailed result of a search...
        ////////////////////////////////////////////////////////////////////////
        
        int index = linearSearch(array, item);
        
        ////////////////////////////////////////////////////////////////////////
        // Display the result...
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Linear search array: " + item + " at index " + index);
        
        ////////////////////////////////////////////////////////////////////////
        // Now do the linear search with an ArrayList...
        ////////////////////////////////////////////////////////////////////////

        ArrayList<String> list = new ArrayList<>();
        
        ////////////////////////////////////////////////////////////////////////
        // Fill the list (from the array)...
        ////////////////////////////////////////////////////////////////////////

        for (String string : array) {
            list.add(string);
        }        
        
        ////////////////////////////////////////////////////////////////////////
        // Now use "built-in" ArrayList methods to search the list...
        ////////////////////////////////////////////////////////////////////////
        
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
                // Found it, stop the loop by returning from the method!
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
                // Found it, now return the index of the first occurance (i)
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