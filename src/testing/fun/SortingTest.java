/** Required package class namespace */
package testing.fun;

/** Required API imports */
import java.util.ArrayList;
import java.util.Arrays;
import utility.collections.LinkedList;
import utility.tools.Numbers;
import utility.tools.Sort;
import utility.tools.Text;


/*
 * SortingTest - seful methods for sorting arrays and lists of data. This is 
 * the student requested review of the sorting concepts as needed for the AP 
 * exam (from the AP Computer Science curriculum). 
 *
 * In the A.P. Computer Science A curriculum in Units 7 and 9, students will 
 * notice that the term "sorting" comes up as something potentially they 
 * can be tested on. For example it states: "Apply selection sort and 
 * insertion sort algorithms to sort the elements of array or ArrayList 
 * objects", "Selection sort and insertion sort are iterative sorting 
 * algorithms that can be used to sort elements in an array or ArrayList", 
 * "Recursive algorithms, such as sorting and searching algorithms, often 
 * produce a result much more quickly than iterative solutions", "Apply 
 * recursive algorithms to sort elements of array or ArrayList objects", 
 * and "Merge sort is a recursive sorting algorithm that can be used to 
 * sort elements in an array or ArrayList". 
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
 * @since Mar 18, 2025
*/
public class SortingTest
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SortingTest();
    }
    
    /**
     * Class constructor, sets class properties
     */
    public SortingTest() {        
        System.out.println("Let us start learning about sorting...");
        
        ////////////////////////////////////////////////////////////////////////
        // Let us begin to start learning about sorting...
        ////////////////////////////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////////////////////////////////
        // Create a maximum number of random people for our list object and use
        // three different actual population sizes for testing...
        // Approximate population of Winnipeg:  783 thousand people    (783,096)
        // Approximate population of Manitoba:  1.3 million  people  (1,342,153)
        // Approximate population of Canada:   40.1 million  people (40,100,000)
        ////////////////////////////////////////////////////////////////////////
        
        final int WINNIPEG =   783096;
        final int MANITOBA =  1342153;
        final int CANADA   = 40100000;
        final int TOTAL    = CANADA;
        
        ////////////////////////////////////////////////////////////////////////
        // Create the ADT list to store the data
        ////////////////////////////////////////////////////////////////////////
        
        ArrayList<String> population = new ArrayList<>();
        
        ////////////////////////////////////////////////////////////////////////
        // Fill the ArrayList ADT with random names
        ////////////////////////////////////////////////////////////////////////
        
        for (int i = 0; i < TOTAL; i++) {
            String person = randomName();
            population.add(person);
        }
        
        ////////////////////////////////////////////////////////////////////////
        // Now sort the list and display some of the results
        ////////////////////////////////////////////////////////////////////////
        
        final int AMOUNT_TO_DISPLAY = 5;
        
        sort(population);                       // Sort the list
        output(population,AMOUNT_TO_DISPLAY);   // Display the sorted list
        
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

    /**
     * Creates a random "name" of a set number of random characters with the 
     * first character being a capital letter
     * 
     * @return a random name
     */
    private String randomName() {
        final int LOW  = (int)'a';              // Letters from the alphabet
        final int HIGH = (int)'z';      
        final int SIZE = 5;                     // The size of the name
        String name = "";       
        for (int i = 0; i < SIZE; i++) {        // Fill name with letters
            char letter = (char)( (HIGH - LOW + 1d) * Math.random() + LOW);
            if (i == 0) {                       // Capitalize first letter
                letter = Character.toUpperCase(letter);
            }
            name += letter;                     // Add letter to name
        }
        return name;
    }
    
    /**
     * Display the list of on screen of a set amount from the beginning of the
     * list and the ned of the list
     * 
     * @param list the ADT list to display
     * @param amount the amount of items to display from the front and back
     */
    private void output(ArrayList<String> list, int amount) {
        System.out.println("Here are the first " + amount + " in the list...");
        for (int i = 0; i < amount; i++) {
            System.out.println(i + ": \t" + list.get(i));
        }
        System.out.println("Here are the last " + amount + " in the list...");
        int end = list.size();
        int start = end - amount;
        for (int i = start; i < end; i++) {
            System.out.println(i + ": \t" + list.get(i));
        }
    }
    
    /**
     * The sorting of the list 
     * 
     * @param list the ADT list 
     */
    private void sort(ArrayList<String> list) {
        // There are many types of sort algorithms you can investigate,
        // the most intuitive one most people think of is known as the 
        // "selection sort" algorithm. In which you search a list for the 
        // smallest item, move it to a new list, and continue until all items
        // fromt he original list are moved to a new list. However, the 
        // "bubble sort" is the easiest algorithm to write.
        
        // A Basic "bubble sort" algorithm below:
        // int a[] = { 3,5,7,2,9,1,8 };
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length-1; j++) {
        //         if (a[j] > a[j+1]) {
        //             int temp = a[j];
        //             a[j]     = a[j+1];
        //             a[j+1]   = temp;
        //         }
        //     }
        // }
        
        // Here is a more "optimized" version of the bubble sort
        // for (int i = list.size()-1; i > 0; i--) {            
        //     boolean didISwap = false;            
        //     // Travel through the list...
        //     for (int j = 0; j < i; j++) {
        //         Person p1 = list.get(j);
        //         Person p2 = list.get(j + 1);
        //         // Check if the value is greater than 
        //         // the next value
        //         if (p1.compareTo(p2) > 0) {
        //             didISwap = true;
        //             // Swap them
        //             Person p3 = p1.clone();
        //             p1 = new Person(p2.name, p2.age, p2.iq);
        //             p2 = new Person(p3.name, p3.age, p3.iq);
        //             // Update the list
        //             list.set(j, p1);
        //             list.set(j + 1, p2);
        //         }
        //     }            
        //     // check if no swaps took place
        //     if (didISwap == false) {
        //         return;
        //     }
        // }
        // // Do it again (as many times as things in the list)
        
        
        // And here is a "fancier" sort algorithm known as the "quick sort"
        // algorithm that uses wrapper methods and recursion to sort the list
        if (list == null) return;                       // error check
        recursiveQuick(list,0,list.size()-1);        
    }
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param list the ArrayList to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(ArrayList<String> list, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(list,front,back);
            recursiveQuick(list,front,pivot-1);
            recursiveQuick(list,pivot+1,back);
        }
    }
    
    /**
     * Partitions the list into S1 and S2 and separates
     * 
     * @param list the ArrayList to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the list
     */
    private int partition(ArrayList<String> list, int front, int back) {
        String pivot = list.get(front);
        while (back > front) {
            while (back > front && list.get(back).compareTo(pivot) > 0)
                back--;
            if (back == front) break;
            list.set(front,list.get(back));
            front++;            
            while (back > front && list.get(front).compareTo(pivot) < 0)
                front++;
            if (back == front) break;
            list.set(back,list.get(front));
            back--;
        }
        list.set(front,pivot);
        return front; 
    }

}