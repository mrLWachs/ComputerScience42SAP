/** Required package class namespace */
package testing.cs42sap.additional;

/** Required API imports */
import utility.io.Simulator;
import java.util.ArrayList;
import java.util.Arrays;
import utility.collections.LinkedList;
import utility.tools.Numbers;
import utility.tools.Search;
import utility.tools.Sort;
import utility.tools.Text;

/**
 * SearchingExamples.java - useful methods for searching through arrays and 
 * lists of data for a specific item. This is the student requested review of 
 * the searching concepts as needed for the AP exam (from the AP Computer 
 * Science curriculum). In the A.P. Computer Science A curriculum in Unit 
 * 4.14, students will notice that the term "searching" comes up as something 
 * potentially they can be tested on. this is seen below:
 * 
 * Learning Objective 4.14.A: Develop code used for linear search algorithms 
 * to search for specific information in a collection and determine the results 
 * of executing a search. 
 * 
 * Essential Knowledge 4.14.A.1: Linear search algorithms are standard 
 * algorithms that check each element in order until the desired value is found 
 * or all elements in the array or ArrayList have been checked. Linear search 
 * algorithms can begin the search process from either end of the array or 
 * ArrayList. 
 * 4.14.A.2: When applying linear search algorithms to 2D arrays, 
 * each row must be accessed then linear search applied to each row of the 
 * 2D array.
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
 * @since Apr 20, 2026, 12:52:43 PM
 */
public class SearchingExamples 
{

    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting Searching Examples");
        new SearchingExamples();
        Simulator.title("\nCompleted Searching Examples");
    }
    
    /**
     * Default constructor, set class properties
     */
    public SearchingExamples() {
        System.out.println("Learn about Searching............................");
        
        ////////////////////////////////////////////////////////////////////////
        // Let us begin to start learning about searching...
        ////////////////////////////////////////////////////////////////////////
        // Array of items to search through...
        ////////////////////////////////////////////////////////////////////////
        
        String[] array = {
            "Lucas",        // Index 0
            "Brennan",      // Index 1
            "Jonathan",     // Index 2
            "A.J.",         // Index 3
            "Herminey",     // Index 4
            "Brook",        // Index 5
            "Nikita",       // Index 6
            "Connor",       // Index 7 
            "Tristan",      // Index 8
            "Norman",       // Index 9
            "Kevaughn",     // Index 10
            "Wachs"         // Index 11
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
        
        ////////////////////////////////////////////////////////////////////////
        // To use a binary search, there is a pre-condition that has to be 
        // true before the search can take place...
        //   - The array/list has to be SORTED first!
        // We will manually sort the array and ArrayList in order...
        ////////////////////////////////////////////////////////////////////////
        
        String[] sortedArray = {
            "A.J.",         // Index 0
            "Brennan",      // Index 1
            "Brook",        // Index 2
            "Connor",       // Index 3
            "Herminey",     // Index 4
            "Jonathan",     // Index 5
            "Kevaughn",     // Index 6
            "Lucas",        // Index 7
            "Nikita",       // Index 8
            "Norman",       // Index 9
            "Tristan",      // Index 10
            "Wachs"         // Index 11
        };
        ArrayList<String> sortedList = new ArrayList<>();
        for (String string : sortedArray) {
            sortedList.add(string);
        }
        
        ////////////////////////////////////////////////////////////////////////
        // Now apply the binary search algorithm to the sorted array and 
        // LinkedList data structures
        ////////////////////////////////////////////////////////////////////////
        
        index = binarySearch(sortedArray,item);
        System.out.println("Binary search array: " + item + " at index " + index);
        index = binarySearch(sortedList,item);
        System.out.println("Binary search list: " + item + " at index " + index);
                
        ////////////////////////////////////////////////////////////////////////
        // NOTE: more searching code including searching arrays and LinkedList
        // (the one we developed ourselves in the CS40S class) of generic data
        // types can be found in the "utility.tools" package namespace of this
        // project in a class called "Search.java" which has many search methods
        // that can be seen and used by importing this class. Also, several
        // other classes ("Text", "Numbers", "Sort") from this package are 
        // instantiated to be used to create data, sort data, and demonstrate
        // the various methods of the Search class. For example...
        ////////////////////////////////////////////////////////////////////////
        
        Search  search  = new Search();     // For search methods
        Text    text    = new Text();       // For text arrays and lists
        Numbers numbers = new Numbers();    // For integer arrays and lists
        Sort    sort    = new Sort();       // For sorting the arrays and lists
        
        final int SIZE   = 10;              // The sizes of the arrays and lists
        final int LENGTH = 5;               // The length of the words
        final int LOW    = -SIZE;           // The lowest random integer value
        final int HIGH   = SIZE;            // The highest random integer value
        
        ////////////////////////////////////////////////////////////////////////
        // Create random array of words (strings) and a random LinkedList of
        // integers
        ////////////////////////////////////////////////////////////////////////
        
        String[]            array1 = text.randomWordSize(SIZE,LENGTH);
        LinkedList<Integer> list1  = numbers.randomList(LOW,HIGH,SIZE);
        
        ////////////////////////////////////////////////////////////////////////
        // Get 2 items to search for in the array and list 
        ////////////////////////////////////////////////////////////////////////
        
        String  item1 = array1[SIZE/2];
        Integer item2 = list1.get(SIZE/2);
        
        ////////////////////////////////////////////////////////////////////////
        // Sort the array and lists
        ////////////////////////////////////////////////////////////////////////
        
        sort.quick(array1);
        sort.quick(list1); 
        
        ////////////////////////////////////////////////////////////////////////
        // Output the array and list
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Searching array: " + Arrays.toString(array1));
        System.out.println("Searching list:  " + list1.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // Do a linear search on the array and list and display results
        ////////////////////////////////////////////////////////////////////////
        
        int index1 = search.linear(item1, array1);
        int index2 = search.linear(item2, list1);
        System.out.println("Linear search array: " + item1 + " at index " + index1);
        System.out.println("Linear search list: "  + item2 + " at index " + index2);
              
        ////////////////////////////////////////////////////////////////////////
        // Do a binary search on the array and list and display results
        ////////////////////////////////////////////////////////////////////////
        
        index1 = search.binary(item1, array1);     
        index2 = search.binary(item2, list1);
        System.out.println("Binary search array: " + item1 + " at index " + index1);
        System.out.println("Binary search list:  " + item2 + " at index " + index2);
        
        System.out.println("Completed Searching..............................");
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
    
    /**
     * An implementation of a binary search algorithm. It will find the first 
     * occurrence of an item in the array and return the index where it 
     * found it, or a -1 if not found
     * 
     * @param list the array to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private static int binarySearch(String[] array, String item) {
        int low  = 0;                   // Marker for the low end
        int high = array.length - 1;    // Marker for the high end
        while(low <= high) {            // Continue while markers not collapsed
            int mid = (high + low) / 2; // Calculate middle between markers
            if      (array[mid].equals(item))        return mid; // Found it
            else if (array[mid].compareTo(item) > 0) high = mid - 1; // Too high 
            else if (array[mid].compareTo(item) < 0) low  = mid + 1; // Too low
        }
        return -1;  // Not found
    }

//    // HERE IS AN EXAMPLE OF THE SAME ALGORITHM USING INTEGERS.....
//    private int binarySearch(int[] array, int item) {
//        int low  = 0;                   
//        int high = array.length - 1;    
//        while(low <= high) {          
//            int middle = (high + low) / 2;  
//            if (array[middle] == item){
//                return middle;
//            } 
//            else if (array[middle] > item) {
//                high = middle - 1;
//            }
//            else if (array[middle] < item) {
//                low  = middle + 1;
//            }
//        }
//        return -1;  
//    }
        
    /**
     * Another implementation of a binary search algorithm. This implementation
     * uses a wrapper method around a private utility recursive method. It will
     * find the first occurrence of an item in the ArrayList and return the 
     * index where it found it, or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @return the first index found at, or a -1 if not found 
     */
    private static int binarySearch(ArrayList<String> list, String item) {
        return binaryRecursive(list,item,0,list.size());
    }

    /**
     * Recursive method used to find the item in the list and return the index 
     * of it's location or a -1 if not found
     * 
     * @param list the ArrayList to search through
     * @param item the item to search for in the list
     * @param low the lowest index to start from
     * @param high the highest index to go to
     * @return the first index found at, or a -1 if not found 
     */
    private static int binaryRecursive(ArrayList<String> list, String item, 
                                      int low, int high) {
        if (low <= high) {                      // While markers not collapsed
            int mid = low + (high - low) / 2;   // Calculate middle point 
            if (list.get(mid) == null) 
                return -1;                                      // Not found
            else if (list.get(mid).compareTo(item) > 0)  
                return binaryRecursive(list,item,low,mid-1);    // Too low
            else if (list.get(mid).compareTo(item) < 0) 
                return binaryRecursive(list,item,mid+1,high);   // Too high
            else 
                return mid;                                     // Found it
        }
        return -1;                                              // Not found
    }
   
}