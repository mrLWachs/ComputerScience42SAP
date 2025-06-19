
/** Required package class namespace */
package testing.postsecondary;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.Simulator;
import utility.tools.Numbers;
import utility.tools.Results;
import utility.tools.Search;
import utility.tools.Sort;
import utility.tools.Text;
import utility.io.System;

/**
 * SearchSortTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class SearchSortTest 
{

    /**
     * Default constructor, set class properties
     */
    public SearchSortTest() {
        if (Simulator.check("Searching and Sorting Post Secondary")) return;
        
        // For the I.B. Exam, you only need to know.............................
        Simulator.comment("For the I.B. Exam, you only need to know:");
        // Search: linear (sequential) search and binary search.................
        Simulator.comment("Search: linear search and binary search");
        // Sort: bubble sort and the selection sort.............................
        Simulator.comment("Sort: bubble sort and the selection sort");
        
        // Create some constants (edges) for the data...........................
        Simulator.comment("Create some constants (edges) for the data");
        
        final int MIN      = 0;
        final int MAX      = 100;
        final int LARGEST  = MAX;
        final int SMALLEST = MIN;
        
        Numbers numbers = new Numbers();
        
        // Create some random data to search through and sort...................
        Simulator.comment("Create some random data to search through and sort");
        // Including all "edge" cases to test for (using unit testing)..........
        Simulator.comment("Including edge cases to test");
        
        int[] array    = numbers.random(SMALLEST, LARGEST, MAX);
        int randomItem = numbers.random(SMALLEST, LARGEST);
        int itemInList = array[numbers.random(MIN+1, MAX-2)];
        int firstItem  = array[0];
        int lastItem   = array[MAX-1];
        int notInList  = LARGEST + 1;
        
        int[] findItems = {
            randomItem,
            itemInList,
            firstItem,
            lastItem,
            notInList
        };
                
        // Create data to store the results.....................................
        Simulator.comment("Create data to store the results...");
        
        boolean found  = false;
        int     index  = -1;
        int[]   sorted = new int[MAX];
        
        // The simpliest of searches............................................
        Simulator.comment("The simpliest of searches");
        
        found = search(array, randomItem);
        
        Results.show(array, randomItem, found);
        
        // Now the linear (sequential) search on all test data..................
        Simulator.comment("Now the linear search on all test data");
        
        for (int i = 0; i < findItems.length; i++) {
            index = linearSearch(array, findItems[i]);
            Results.show(array, findItems[i], index);
        }
        
        // Simple sort.........................................................
        Simulator.comment("Simple sort...");
        
        sort(array);
        Results.show(array);
        
        // We need to "re-scramble" the array for further testing..............
        Simulator.comment("We will re-scramble array for further testing");
        
        array = numbers.random(SMALLEST, LARGEST, MAX);
        Results.show(array);
        
        // Now execute the bubble sort (named after bubbles rising from water)..
        Simulator.comment("Now bubble sort (from bubbles rising from water)");
        
        sorted = bubbleSort(array);
        Results.show(array, sorted);
        
        // Now execute the selection sort (named after selecting the smallest)..
        Simulator.comment("Now selection sort (from selecting the smallest)");
        
        sorted = selectionSort(array);
        Results.show(array, sorted);
        
        // Now the binary search (named after "two" or "dividing").............
        Simulator.comment("Now binary search (named after two or dividing)");
        // NOTE: binary search can only happen on a sorted list................
        Simulator.comment("NOTE: binary search can only happen on sorted list");
        
        // Redo some of the test data..........................................
        Simulator.comment("Redo some of the test data...");
        
        findItems[1] = sorted[numbers.random(MIN+1, MAX-2)];
        findItems[2] = sorted[0];
        findItems[3] = sorted[MAX-1];
        
        for (int i = 0; i < findItems.length; i++) {
            index = binarySearch(sorted,findItems[i]);
            Results.show(sorted, findItems[i], index);
        }
        
        // Use class for searching and sorting (creating objects to help).......
        Simulator.comment("Use class for searching and sorting");
        
        Text   text   = new Text();
        Search search = new Search();
        Sort   sort   = new Sort();
        
        final int WORD_SIZE = 4;
        
        // Create random linked list data (include all edge cases to test)......
        Simulator.comment("Create random linked list data");
        
        LinkedList<String> unsortedWords = text.randomList(MAX, WORD_SIZE);
        LinkedList<String> sortedWords   = new LinkedList<>();
        
        Simulator.comment("Create random array data");
        
        String[] unsortedWordsArray = new String[MAX]; 
        String[] sortedWordsArray   = new String[MAX];
        for (int i = 0; i < unsortedWordsArray.length; i++) {
            unsortedWordsArray[i] = unsortedWords.get(i);
        }
        
        // Place all test cases into another linked list........................
        Simulator.comment("Place all test cases into another linked list");
        LinkedList<String> testCases = new LinkedList<>();
        
        String randomWord = text.randomWord(WORD_SIZE);
        String inListWord = unsortedWords.get(numbers.random(MIN+1, MAX-2));
        String firstWord  = unsortedWords.front();
        String lastWord   = unsortedWords.back();
        String notWord    = "Wachs";
                
        testCases.add(randomWord);
        testCases.add(inListWord);
        testCases.add(firstWord);
        testCases.add(lastWord);
        testCases.add(notWord);
        
        // Execute the linear search on all test data...........................
        Simulator.comment("Execute the linear search on all list test data...");        
        for (int i = 0; i < testCases.size(); i++) {
            String word = testCases.get(i);
            index = search.linear(word, unsortedWords);
            Results.show(unsortedWords, word, index);
        }
        
        // Execute the linear search on all test data...........................
        Simulator.comment("Execute the linear search on all array test data...");        
        for (int i = 0; i < testCases.size(); i++) {
            String word = testCases.get(i);
            index = search.linear(word, unsortedWordsArray);
            Results.show(unsortedWordsArray, word, index);
        }
                
        // Execute all the sorts on all test data...............................
        Simulator.comment("Execute all the sorts on all test data...");
        
        // Bubble sort LinkedList data..........................................
        Simulator.comment("Bubble sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.bubble(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Bubble sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.bubble(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
                                        
        // Selection sort LinkedList data.......................................
        Simulator.comment("Selection sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.selection(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Selection sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.selection(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
                
        // Shell sort LinkedList data...........................................
        Simulator.comment("Shell sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.shell(sortedWords);
        Results.show(unsortedWords, sortedWords);
             
        Simulator.comment("Shell sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.shell(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
        
        // Insertion sort LinkedList data.......................................
        Simulator.comment("Insertion sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.insertion(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Insertion sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.insertion(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
        
        // Quick sort LinkedList data...........................................
        Simulator.comment("Quick sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.quick(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Quick sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.quick(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
        
        // Merge sort LinkedList data...........................................
        Simulator.comment("Merge sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.merge(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Merge sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);        
        sort.merge(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
        
        // Heap sort LinkedList data...........................................
        Simulator.comment("Heap sort LinkedList data...");        
        sortedWords = unsortedWords.clone();
        sort.heap(sortedWords);
        Results.show(unsortedWords, sortedWords);
        
        Simulator.comment("Heap sort array data...");  
        sortedWordsArray = clone(unsortedWordsArray);
        sort.heap(sortedWordsArray);
        Results.show(unsortedWordsArray, sortedWordsArray);
        
        // Execute the binary search on all test data...........................
        Simulator.comment("Execute the binary search on all List test data...");        
        for (int i = 0; i < testCases.size(); i++) {
            String word = testCases.get(i);
            index = search.binary(word, sortedWords);
            Results.show(unsortedWords, word, index);
        }

        Simulator.comment("Execute the binary search on all Array test data...");        
        for (int i = 0; i < testCases.size(); i++) {
            String word = testCases.get(i);
            index = search.binary(word, sortedWordsArray);
            Results.show(unsortedWordsArray, word, index);
        }
        
    }   

    /**
     * A simple search, determines if the item is in the array or not
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return found (true) or not (false)
     */
    private boolean search(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {    // Traverse array
            if (array[i] == item) {                 // Check for item
                return true;                        // Item found (leave method)
            }
        }
        return false;                               // Not found
    }
    
    /**
     * An implementation of a linear search (sequential search) algorithm. It 
     * will find the first occurance of an item in the array and return the
     * index where it found it, or a -1 if not found
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return the first index found at, or a -1 if not found
     */
    private int linearSearch(int[] array, int item) {
        // Catch a potential error before we begin
        if (array == null) return -1;
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            // If I encounter the item
            if (array[i] == item) {
                // Return the spot I found it at (and stop)
                return i;
            }
        }
        // Make it through the entire list, never find it, return
        // a "flag" value indicating not found
        return -1;
    }

    /**
     * A simple sort, it will sort the array into ascending order
     * 
     * @param array the array of items to sort 
     */
    private void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {         // Traversing the array
            for (int j = 0; j < array.length - 1; j++) { // Traverse 1 less 
                if (array[j] > array[j+1]) {             // Checking items
                    int temp   = array[j];               // Temporary variable
                    array[j]   = array[j+1];             // Swapping items
                    array[j+1] = temp;
                }
            }
        }
    }
    
    /**
     * An implementation of a bubble sort algorithm it will sort the array into  
     * ascending order
     * 
     * @param array the array of items to sort
     */
    private int[] bubbleSort(int[] array) {
        // Create a new array, same size as the passed array
        int[] sorted = new int[array.length];
        // Make it a copy of that original
        System.arraycopy(array, 0, sorted, 0, array.length);        
        // Sort the copy, using the bubblesort algorithm...        
        // We need to traverse the array aas many times as there are items in
        // that array (n items, for example array size 10, n =10)        
        for (int times = 0; times < sorted.length; times++) {
            // Nested for loop, to traverse the entire array up to the
            // second last spot
            for (int i = 0; i < sorted.length - 1; i++) {
                // Check  each item and the item after it
                int item1 = sorted[i];
                int item2 = sorted[i+1];
                // Now check
                if (item1 > item2) {
                    // Swap them
                    sorted[i]   = item2;
                    sorted[i+1] = item1;
                }                                
            }
        }
        return sorted;
    }

    /**
     * An implementation of a selection sort algorithm it will sort the array   
     * into ascending order
     * 
     * @param array the array of items to sort
     */
    private int[] selectionSort(int[] array) {
        // Create a new array, same size as the passed array
        int[] sorted = new int[array.length];
        // Make it a copy of that original
        System.arraycopy(array, 0, sorted, 0, array.length); 
        // Sort that array using the selection sort algorithm...
        // Traverse the entire array
        for (int i = 0; i < sorted.length; i++) {
            // Track the lowest index, assume it's the first spot
            int lowest = i;
            // Nested inner for loop, starts at one over from current position
            // of the outer for loop used to find the lowest spot
            for (int j = i+1; j < sorted.length; j++) {
                int item1 = sorted[j];
                int item2 = sorted[lowest];
                // check the spots
                if (item1 < item2) {
                    // fouond a new low
                    lowest = j;
                }                
            }
            // Outside the inner loop, now that we have the lowest spot, swap
            // the content of the lowest spot with the current spot i
            if (lowest != i) {
                int temp       = sorted[i];
                sorted[i]      = sorted[lowest];
                sorted[lowest] = temp;
            }
        }
        return sorted;
    }

    /**
     * An implementation of a binary search algorithm. It will find an 
     * occurance of an item in the array and return the index where it found 
     * it, or a -1 if not found
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return the first index found at, or a -1 if not found
     */
    private int binarySearch(int[] array, int item) {
        // Track the low and high indices of the array with "markers"
        int low  = 0;
        int high = array.length - 1;
        // Loop while the markers are not "collapsed" on themselves
        while (low <= high) {
            // Find (calculate) the middle between low and high
            int mid = (high + low) / 2;
            // Check if we found it
            if (array[mid] == item) return mid;
            // Check if the spot I'm at is bigger (greater) than item
            else if (array[mid] > item) high = mid - 1;
            // Check if the spot I'm at is smaller (less) than item
            else if (array[mid] < item) low  = mid + 1;
        }
        return -1;  // Not found!
    }

    /**
     * Clones a duplicate copy of the passed array
     * 
     * @param array the array to clone
     * @return a clone of the passed array
     */
    private String[] clone(String[] array) {
        String[] cloneArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            cloneArray[i] = array[i];
        }
        return cloneArray;
    }
        
}