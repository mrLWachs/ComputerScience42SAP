/** Required package class namespace */
package testing.cs42sap.additional;
 
/** Required API imports */
import utility.io.Simulator;
import java.util.ArrayList;
import java.util.Arrays;
import utility.collections.LinkedList;
import utility.tools.Numbers;
import utility.tools.Sort;
import utility.tools.Text;


/**
 * SortingExamples.java - useful methods for sorting arrays and lists of data. 
 * This is the sorting concepts as needed for the AP exam (from the AP Computer
 * Science curriculum). 
 * 
 * The AP Curriculum mentions "sort" in the following places:
 * 
 *  - 4.15.A   Determine the result of executing each step of sorting algorithms 
 *             to sort the elements of a collection.
 *  - 4.15.A.1 Selection sort and insertion sort are iterative sorting 
 *             algorithms that can be used to sort elements in an array or 
 *             ArrayList.
 *  - 4.15.A.2 Selection sort repeatedly selects the smallest (or largest) 
 *             element from the unsorted portion of the list and swaps it into 
 *             its correct (and final) position in the sorted portion of the 
 *             list.
 *  - 4.15.A.3 Insertion sort inserts an element from the unsorted portion of a
 *             list into its correct (but not necessarily final) position in the 
 *             sorted portion of the list by shifting elements of the sorted 
 *             portion
 *  - 4.17.C   Determine the result of each iteration of the merge sort 
 *             algorithm when used to sort a collection.
 *  - 4.17.C.1 Merge sort is a recursive sorting algorithm that can be used to 
 *             sort elements in an array or ArrayList.
 *  - 4.17.C.2 Merge sort repeatedly divides an array into smaller subarrays 
 *             until each subarray is one element and then recursively merges 
 *             the sorted subarrays back together in sorted order to form the 
 *             final sorted array.
 * 
 *  EXCLUSION STATEMENT: Sorting algorithms other than selection, insertion, 
 *                       and merge sort are outside the scope of the AP Computer 
 *                       Science A course and exam.
 *
 * However, with more analysis of these curriculum points, more specifics 
 * can be drawn out. Since the curriculum document is vague about it, I would 
 * interpret what you need to know about sorting is:
 * 
 * (1) That their are different sorting algorithms, for example selection 
 *     sort, bubble sort, insertion sort, and merge sort
 * (2) Some sorting algorithms can be implemented recursively to array and/or
 *     ArrayLists of data
 * (3) Not necessarily know how to write these sorting algorithms (even 
 *     though we will in this example)
 * 
 * NOTE: further resources for sorting can be found here:
 *       - My video playlist on sorting: https://bit.ly/4bN2dbu
 *       - My presentation on sorting: https://bit.ly/3FonaxA
 *       - My assignment on sorting: https://bit.ly/4269gZy
 *       - My review sheet on sorting: https://bit.ly/3FqTgZr
 *       - Some other websites that go over sorting:
 *             - https://bit.ly/4izDppK
 *             - https://bit.ly/4bH0HYI
 *             - https://bit.ly/4iB2AZ8
 *             - https://bit.ly/42dFt18
 *
 * @author Mr. Wachs
 * @since Apr 29, 2026, 7:20:21 AM
 */
public class SortingExamples 
{
    
    /**
     * A version of the main method so this class can run independently of the 
     * rest of this project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulator.title("Starting Searching Examples");
        new SortingExamples();
        Simulator.title("\nCompleted Searching Examples");
    }

    /**
     * Default constructor, set class properties
     */
    public SortingExamples() {
        System.out.println("Let us start learning about sorting...");
        
        ////////////////////////////////////////////////////////////////////////
        // First let us make some methods to build and show random arrays...
        ////////////////////////////////////////////////////////////////////////
        
        final int SIZE = 20;
        int a1[] = build(SIZE);
        int a2[] = build(SIZE);
        int a3[] = build(SIZE);
        int a4[] = build(SIZE);
        
        show(a1,"Array 1 before");
        show(a2,"Array 2 before");
        show(a3,"Array 3 before");
        show(a4,"Array 4 before");
                
        ////////////////////////////////////////////////////////////////////////
        // Now we can start learning about sorting...
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        // The "Bubble" sort is considered the "easiest" of the sorts...
        //
        //  - Watch: https://bit.ly/4mXR3Xd (simple 2 minutes)
        //  - Read:  https://bit.ly/4tHzHQY (defines the algorithm)
        ////////////////////////////////////////////////////////////////////////
        
        bubble(a1);
        
        ////////////////////////////////////////////////////////////////////////
        // The "Selection" sort algorithm...
        //
        //  - Watch: https://bit.ly/4w4UGii (simple 2 minutes)
        //  - Read:  https://bit.ly/4n1sgBF (defines the algorithm)
        ////////////////////////////////////////////////////////////////////////
        
        selection(a2);
        
        ////////////////////////////////////////////////////////////////////////
        // The "Insertion" sort algorithm...
        //
        //  - Watch: https://bit.ly/4t5ijEv (simple 2 minutes)
        //  - Read:  https://bit.ly/48utoHO (defines the algorithm)
        ////////////////////////////////////////////////////////////////////////
        
        insertion(a3);
        
        ////////////////////////////////////////////////////////////////////////
        // The "Merge" sort algorithm...
        //
        //  - Watch: https://bit.ly/4eca71v (simple 2 minutes)
        //  - Read:  https://bit.ly/4vXLhZB (defines the algorithm)
        ////////////////////////////////////////////////////////////////////////
        
        merge(a4);
        
        ////////////////////////////////////////////////////////////////////////
        // Finally display the arrays after the various sorts...
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("After sorts...");
        
        show(a1,"Bubble sort   ");
        show(a2,"Selection sort");
        show(a3,"Insertion sort");
        show(a4,"Merge sort    ");
        
        ////////////////////////////////////////////////////////////////////////
        // Also some bonus sorting code to potentially look at...
        //
        // And some "fun" videos to show the concepts:
        //  - Bubble    sort: https://bit.ly/4mVFjnQ
        //  - Selection sort: https://bit.ly/490ziAC
        //  - Insertion sort: https://bit.ly/4n144iz
        //  - Merge     sort: https://bit.ly/4ddMHHZ
        // And some online "visualizers"...
        //  - https://bit.ly/422UhiA
        //  - https://bit.ly/4cG1Vpa
        //  - https://bit.ly/4t8lcoa
        ////////////////////////////////////////////////////////////////////////
        bonus();
    }
        
    /**
     * Builds an array of the passed size filled with random integers from 0 up 
     * to one less than the size of the array
     * 
     * @param size the size of the array to create
     * @return an array of random integers
     */
    private static int[] build(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)((size-1-0+1)*Math.random()+0);
        }
        return array;
    }
    
    /**
     * Shows the array on screen with some preliminary text
     * 
     * @param array the array to show
     * @param text the first text to show before the array is shown
     */
    private static void show(int[] array, String text) {
        System.out.print(text + ":\t");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
    
    /**
     * Simple implementation of the bubble sort algorithm
     * 
     * @param array the array to sort
     */
    private static void bubble(int[] array) {
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array.length-1; j++) {
                 if (array[j] > array[j+1]) {
                     int temp = array[j];
                     array[j]     = array[j+1];
                     array[j+1]   = temp;
                 }
             }
         }
    }
    
    /**
     * Implementation of the selection sort algorithm
     * 
     * @param array the array to sort
     */
    private static void selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp   = array[min];
            array[min] = array[i];
            array[i]   = temp;
        }
    }
    
    /**
     * Implementation of the insertion sort algorithm
     * 
     * @param array the array to sort
     */
    private static void insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j   = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    
    /**
     * Implementation of the merge sort algorithm
     * 
     * @param array the array to sort
     */
    private static void merge(int[] a) {
        mergeRecursively(a,0,a.length-1);       
    }

    /**
     * Recursively divides the array into halves and triggers the merging 
     * process. Part of the Merge Sort algorithm.
     *
     * @param array The array to be sorted
     * @param left  The starting index of the current segment
     * @param right The ending index of the current segment
    */
    private static void mergeRecursively(int[] array, int left, int right) {
        // Base Case: If left is not less than right, the segment has 0 or 1 
        // element and is already "sorted"
        if (left < right) {
            // Calculate the midpoint to divide the array into two halves, 
            // using (right - left) / 2 prevents potential integer overflow for
            // large arrays
            int mid = left + (right - left) / 2;
            
            // Recursive Call 1: Sort the left half (from left to mid)
            mergeRecursively(array, left, mid);
            
            // Recursive Call 2: Sort the right half (from mid + 1 to right)
            mergeRecursively(array, mid + 1, right);
            
            // Merge Step: Combine the two sorted halves back together
            // Note: This calls an overloaded version of mergeRecursively (or 
            //       a merge helper)
            mergeRecursively(array, left, mid, right);
        }
    }

    /**
     * Merges two sorted contiguous segments of an array into a single sorted 
     * segment
     * 
     * @param array The original array containing the segments
     * @param left  The starting index of the first segment
     * @param mid   The ending index of the first segment
     * @param right The ending index of the second segment
    */
    private static void mergeRecursively(int[] array, int left, int mid, int right) {
        // 1. Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1; // Size of the left half
        int n2 = right - mid;    // Size of the right half

        // 2. Create temporary arrays to hold the data during the merge process
        int[] leftTemp  = new int[n1];
        int[] rightTemp = new int[n2];

        // 3. Copy data from the main array into the temporary arrays L and R
        for (int i = 0; i < n1; ++i) {
            leftTemp[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightTemp[j] = array[mid + 1 + j];
        }

        // 4. Merge the temporary arrays back into the original array
        int i = 0;    // Initial index of the first subarray (L)
        int j = 0;    // Initial index of the second subarray (R)
        int k = left; // Initial index of the merged subarray (original array)

        while (i < n1 && j < n2) {
            // Pick smaller element from either L or R to maintain sorted order
            if (leftTemp[i] <= rightTemp[j]) {
                array[k] = leftTemp[i];
                i++;
            } 
            else {
                array[k] = rightTemp[j];
                j++;
            }
            k++;
        }

        // 5. Copy any remaining elements from the left array (L), if any exist
        while (i < n1) {
            array[k] = leftTemp[i];
            i++;
            k++;
        }

        // 6. Copy any remaining elements from the right array (R), if any exist
        while (j < n2) {
            array[k] = rightTemp[j];
            j++;
            k++;
        }
    }
    
    /**
     * Some bonus sorting code in a class in this project you can examine that
     * uses generic values in lists and arrays
     */
    private void bonus() {
        ////////////////////////////////////////////////////////////////////////
        // NOTE: more searching code including searching arrays and LinkedList
        // (the one we developed ourselves in the CS40S class) of generic data
        // types can be found in the "utility.tools" package namespace of this
        // project in a class called "Sort.java" which has many sort methods
        // that can be seen and used by importing this class. Also, several
        // other classes ("Text", "Numbers") from this package are instantiated
        // to be used to create data, sort data, and demonstrate the various 
        // methods of the Sort class. For example...
        ////////////////////////////////////////////////////////////////////////
        
        Text    text    = new Text();       // For text arrays and lists
        Numbers numbers = new Numbers();    // For integer arrays and lists
        Sort    sort    = new Sort();       // For sorting the arrays and lists
        
        final int SIZE   = 10;              // The sizes of the arrays and lists
        final int LENGTH = 5;               // The length of the words
        final int LOW    = 0;               // The lowest random integer value
        final int HIGH   = SIZE;            // The highest random integer value
        
        ////////////////////////////////////////////////////////////////////////
        // Create random array of words (strings) and a random LinkedList of
        // integers
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        // The bubble sort algorithm: https://bit.ly/4iOnkg5
        ////////////////////////////////////////////////////////////////////////
        
        String[] array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before bubble sort array: \t" + Arrays.toString(array));
        sort.bubble(array);
        System.out.println("After bubble sort array: \t" + Arrays.toString(array));
        
        LinkedList<Integer> list = numbers.randomList(LOW,HIGH,SIZE); 
        System.out.println("Before bubble sort list:  \t" + list.toString());      
        sort.bubble(list);        
        System.out.println("After bubble sort list:  \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The selection sort algorithm: https://bit.ly/4htmaFK
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before selection sort array: \t" + Arrays.toString(array));
        sort.selection(array);
        System.out.println("After selection sort array: \t" + Arrays.toString(array));
        
        list = numbers.randomList(LOW,HIGH,SIZE);
        System.out.println("Before selection sort list:  \t" + list.toString()); 
        sort.selection(list);        
        System.out.println("After selection sort list:  \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The insertion sort algorithm: https://bit.ly/4iuQyks
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before insertion sort array: \t" + Arrays.toString(array));
        sort.insertion(array);
        System.out.println("After insertion sort array: \t" + Arrays.toString(array));  
        
        list = numbers.randomList(LOW,HIGH,SIZE);
        System.out.println("Before insertion sort list:  \t" + list.toString());
        sort.insertion(list);      
        System.out.println("After insertion sort list:  \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The shell sort algorithm: https://bit.ly/4iOo5pr
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before shell sort array: \t" + Arrays.toString(array));
        sort.shell(array);
        System.out.println("After shell sort array: \t" + Arrays.toString(array));
        
        list = numbers.randomList(LOW,HIGH,SIZE);
        System.out.println("Before shell sort list:  \t" + list.toString());                        
        sort.shell(list);                
        System.out.println("After shell sort list:  \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The heap sort algorithm: https://bit.ly/4iJmy3V
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before heap sort array: \t" + Arrays.toString(array));
        sort.heap(array);
        System.out.println("After heap sort array:  \t" + Arrays.toString(array));
        
        list = numbers.randomList(LOW,HIGH,SIZE);        
        System.out.println("Before heap sort list:  \t" + list.toString());                        
        sort.heap(list);                
        System.out.println("After heap sort list:   \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The merge sort algorithm: https://bit.ly/4hxtpfR
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before merge sort array: \t" + Arrays.toString(array));
        sort.merge(array);
        System.out.println("After merge sort array:  \t" + Arrays.toString(array));
        
        list = numbers.randomList(LOW,HIGH,SIZE);        
        System.out.println("Before merge sort list:  \t" + list.toString());                        
        sort.merge(list);                
        System.out.println("After merge sort list:   \t" + list.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // The quick sort algorithm: https://bit.ly/4kEotbT
        ////////////////////////////////////////////////////////////////////////
        
        array = text.randomWordSize(SIZE,LENGTH,true);
        System.out.println("Before quick sort array: \t" + Arrays.toString(array));
        sort.quick(array);
        System.out.println("After quick sort array:  \t" + Arrays.toString(array));
        
        list = numbers.randomList(LOW,HIGH,SIZE);        
        System.out.println("Before quick sort list:  \t" + list.toString());                        
        sort.quick(list);                
        System.out.println("After quick sort list:   \t" + list.toString());
                
        ////////////////////////////////////////////////////////////////////////
        // The radix sort algorithm: https://bit.ly/4in5fpC
        ////////////////////////////////////////////////////////////////////////
        
        list = numbers.randomList(LOW,HIGH,SIZE);
        System.out.println("Before radix sort list:  \t" + list.toString());                
        sort.radix(list);        
        System.out.println("After radix sort list:   \t" + list.toString());
    }

}