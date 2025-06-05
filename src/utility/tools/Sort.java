
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;
import java.lang.reflect.Array;


/**
 * Sort.java - useful methods for sorting arrays and LinkedLists of generic
 * data into ascending order
 * 
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since June 2023
 */
public class Sort <T extends Comparable<T>> 
{
        
    /**
     * A simple implementation of a bubble sort algorithm it will sort the 
     * array into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void bubble(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 0; i < array.length; i++) {            // traverse array
            for (int j = 0; j < array.length - 1; j++) {    // traverse again
                T item1 = array[j];
                T item2 = array[j+1];
                if (item1.compareTo(item2) > 0) {           // out of order
                    array[j]   = item2;                     // swap positions
                    array[j+1] = item1;
                }
            }
        }
    }    
    
    /**
     * An efficient implementation of a bubble sort algorithm it will sort the 
     * list into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void bubble(LinkedList<T> list) {
        if (list == null) return;                   // error check
        boolean sorted = true;                      // flag to stop or not
        for (int i = list.size()-1; i >= 0; i--) {  // traverse list
            sorted = true;                          // assume sorted
            for (int j = 0; j < i; j++) {           // traverse again
                T item1 = list.get(j);  
                T item2 = list.get(j+1);
                if (item1.compareTo(item2) > 0) {   // out of order
                    sorted = false;                 // flag no sorted
                    list.set(j, item2);             // swap positions
                    list.set(j+1, item1);
                } 
            }
            if (sorted) return;                     // return early
        }
    }
    
    /**
     * An implementation of a selection sort algorithm it will sort the array
     * into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void selection(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 0; i < array.length-1; i++) {          // traverse array
            int lowest = i;                                 // take low index
            for (int j = i+1; j < array.length; j++) {      // traverse again
                if (array[j].compareTo(array[lowest]) < 0) { // swap with low
                    lowest = j;
                }
            }
            if (lowest != i) {                              // perform swap
                T temp        = array[i];
                array[i]      = array[lowest];
                array[lowest] = temp;
            }
        }
    }
    
    /**
     * An implementation of a selection sort algorithm it will sort the list
     * into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void selection(LinkedList<T> list) {
        if (list == null) return;                       // error check
        for (int i = 0; i < list.size()-1; i++) {       // traverse array
            int lowest = i;                             // take low index
            for (int j = i+1; j < list.size(); j++) {   // traverse again
                T item1 = list.get(j);
                T item2 = list.get(lowest);
                if (item1.compareTo(item2) < 0) {       // swap with low
                    lowest = j;
                }
            }
            if (lowest != i) {                          // perform swap
                T temp1 = list.get(i);
                T temp2 = list.get(lowest);
                list.set(i, temp2);
                list.set(lowest, temp1);
            }
        }
    }
    
    /**
     * An implementation of a insertion sort algorithm it will sort the array
     * into ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void insertion(T[] array) {
        if (array == null) return;                          // error check
        for (int i = 1; i < array.length; i++) {
            int j = i;
            T temp = array[i];
            while ((j > 0) && 
                   (array[j-1].compareTo(temp) > 0)) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }        
    }
    
    /**
     * An implementation of a insertion sort algorithm it will sort the list
     * into ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void insertion(LinkedList<T> list) {
        if (list == null) return;                       // error check
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            T temp = list.get(i);
            while ((j > 0) &&
                   (list.get(j-1).compareTo(temp) > 0)) {
                list.set(j, list.get(j-1));                
                j--;
            }
            list.set(j, temp); 
        }      
    }
        
    /**
     * An implementation of a shell sort algorithm it will sort the array into
     * ascending order
     * 
     * @param array the array of generic items to sort
     */
    public void shell(T[] array) {
        if (array == null) return;                          // error check
        int j = 0;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                T temp = array[i];
                for (j = i; 
                     (j >= gap) && (temp.compareTo(array[j-gap]) < 0); 
                     j -= gap) {
                    array[j] = array[j-gap];
                }
                array[j] = temp;
            }
        }        
    }
    
    /**
     * An implementation of a shell sort algorithm it will sort the list into
     * ascending order
     * 
     * @param list the LinkedList to sort
     */
    public void shell(LinkedList<T> list) {
        if (list == null) return;                       // error check
        int j = 0;
        for (int gap = list.size() / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.size(); i++) {
                T temp = list.get(i);
                for (j = i; 
                     (j >= gap) && (temp.compareTo(list.get(j-gap)) < 0); 
                     j -= gap) {
                    list.set(j, list.get(j-gap));
                }
                list.set(j,temp);
            }
        }        
    }
    
    /**
     * An implementation of a quick sort algorithm it will sort the array into 
     * ascending order
     * 
     * @param array the array of generic items to sort 
     */    
    public void quick(T[] array) {
        if (array == null) return;                          // error check
        recursiveQuick(array,0,array.length-1);
    }

    /**
     * An implementation of a quick sort algorithm it will sort the list into
     * ascending order
     * 
     * @param list the LinkedList to sort
     */    
    public void quick(LinkedList<T> list) {
        if (list == null) return;                       // error check
        recursiveQuick(list,0,list.size()-1);
    }
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param array the array of generic items to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(T[] array, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(array,front,back);
            recursiveQuick(array,front,pivot-1);
            recursiveQuick(array,pivot+1,back);
        }
    }
    
    /**
     * Recursive implementation of a quick sort algorithm 
     * 
     * @param list the LinkedList to sort
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     */
    private void recursiveQuick(LinkedList<T> list, int front, int back) {
        if (back <= front) return;
        else {
            int pivot = partition(list,front,back);
            recursiveQuick(list,front,pivot-1);
            recursiveQuick(list,pivot+1,back);
        }
    }

    /**
     * Partitions the array into S1 and S2 and separates
     * 
     * @param array the array of generic items to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the array
     */
    private int partition(T[] array, int front, int back) {
        T pivot = array[front];
        while (back > front) {
            while (back > front && array[back].compareTo(pivot) > 0)
                back--;
            if (back == front) break;
            array[front] = array[back];
            front++;
            while (back > front && array[front].compareTo(pivot) < 0)
                front++;
            if (back == front) break;
            array[back] = array[front];
            back--;
        }
        array[front] = pivot; 
        return front;
    }    
    
    /**
     * Partitions the list into S1 and S2 and separates
     * 
     * @param list the LinkedList to partition
     * @param front the marker for the front partition
     * @param back the marker for the back partition 
     * @return the position of the partition in the list
     */
    private int partition(LinkedList<T> list, int front, int back) {
        T pivot = list.get(front);
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
        
    /**
     * An implementation of a merge sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param list the LinkedList to sort
     */    
    public void merge(LinkedList<T> list) {
        if (list == null) return;                          // error check
        recursiveMerge(list,list.size());
    } 
    
    /**
     * The recursive wrapper method for merge sort. This algorithm takes the 
     * list parameter and its length and uses a recursive wrapper method (with 
     * a base and the recursive conditions). The base condition checks if the 
     * length is 1 and it will just return. For the rest of the cases, the 
     * recursive call will be executed. For the recursive case, we get the 
     * middle index and create two temporary lists. Then both two lists are 
     * recursively sorted. 
     * 
     * @param list the LinkedList to sort
     * @param length the length of the list
     */
    private void recursiveMerge(LinkedList<T> list, int length) {
        if (length < 2) return;
        int mid = length / 2;
        LinkedList<T> leftList  = new LinkedList<>();
        LinkedList<T> rightList = new LinkedList<>();
        for (int i = 0; i < mid; i++) {
            leftList.add(list.get(i));
        }
        for (int i = mid; i < length; i++) {
            rightList.add(list.get(i));
        }
        for (int i = mid; i < length; i++) {
            rightList.set(i-mid,list.get(i));
        }
        recursiveMerge(leftList, mid);
        recursiveMerge(rightList, length - mid);
        mergeAssist(list, leftList, rightList, mid, length - mid);
    }
    
    /**
     * An assist method for the merge sort. We then call the merge method 
     * which takes in the input and both the sub-lists and the starting and 
     * end indices of both the lists. It compares the elements of both 
     * sub-lists one by one and places the smaller element into the input 
     * list. When we reach the end of one of the sub-lists, the rest of the 
     * elements from the other list are copied into the input list thereby 
     * giving us the final sorted list.
     * 
     * @param list the LinkedList to sort
     * @param leftList the left sub-list
     * @param rightList the right sub-list
     * @param left the left starting index
     * @param right the right starting index 
     */
    private void mergeAssist(LinkedList<T> list, LinkedList<T> leftList,
            LinkedList<T> rightList, int left, int right) {        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            }
            else {
                list.set(k++, rightList.get(j++));
            }
        }
        while (i < left) {
            list.set(k++, leftList.get(i++));
        }
        while (j < right) {
            list.set(k++, rightList.get(j++));
        }        
    }

    /**
     * An implementation of a merge sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param array the array of generic items to sort
     */    
    public void merge(T[] array) {
        if (array == null) return;                          // error check
        recursiveMerge(array, array.length);
    } 
    
    /**
     * The recursive wrapper method for merge sort. This algorithm takes the 
     * list parameter and its length and uses a recursive wrapper method (with 
     * a base and the recursive conditions). The base condition checks if the 
     * length is 1 and it will just return. For the rest of the cases, the 
     * recursive call will be executed. For the recursive case, we get the 
     * middle index and create two temporary lists. Then both two lists are 
     * recursively sorted. 
     * 
     * @param array the array to sort
     * @param length the length of the list
     */
    private void recursiveMerge(T[] array, int length) {
        if (length < 2) return;
        int mid = length / 2;
        int newLength = mid;
        T[] leftArray  = (T[])(
            Array.newInstance(array.getClass().getComponentType(), 
                              newLength)
        ); 
        newLength = length - mid;
        T[] rightArray  = (T[])(
            Array.newInstance(array.getClass().getComponentType(), 
                              newLength)
        );         
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        int index = 0;
        for (int i = mid; i < length; i++) {
            rightArray[index] = array[i];
            index++;
        }
        for (int i = mid; i < length; i++) {
            rightArray[i-mid] = array[i];
        }
        recursiveMerge(leftArray, mid);
        recursiveMerge(rightArray, length - mid);
        mergeAssist(array, leftArray, rightArray, mid, length - mid);
    }
    
    /**
     * An assist method for the merge sort. We then call the merge method 
     * which takes in the input and both the sub-lists and the starting and 
     * end indices of both the lists. It compares the elements of both 
     * sub-lists one by one and places the smaller element into the input 
     * list. When we reach the end of one of the sub-lists, the rest of the 
     * elements from the other list are copied into the input list thereby 
     * giving us the final sorted list.
     * 
     * @param array the array to sort
     * @param leftList the left sub-list
     * @param rightList the right sub-list
     * @param left the left starting index
     * @param right the right starting index 
     */
    private void mergeAssist(T[] array, T[] leftArray,
            T[] rightArray, int left, int right) {        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }        
    }
    
    /**
     * An implementation of a heap sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param array the array of generic items to sort
     */
    public void heap(T[] array) {
        if (array == null) return;                         // Error check
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);      // Build heap (rearrange array)
        }
        for (int i = length - 1; i > 0; i--) {  // Extract element from heap            
            T temp = array[0];                  // Move current root to end
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);       // Call max heapify on the reduced heap
        }
    } 

    /**
     * To 'heapify' a sub-tree rooted with node index which is an index in 
     * array[] with length being the size of heap
     * 
     * @param array the array to heapify
     * @param length the length to heapify
     * @param index the index of the largest
     */
    private void heapify(T[] array, int length, int index) {
        int largest = index; // Initialize largest as root
        int left    = 2 * index + 1; 
        int right   = 2 * index + 2; 
        if (left < length && array[left].compareTo(array[largest]) > 0) {
            largest = left;     // If left child is larger than root
        }
        if (right < length && array[right].compareTo(array[largest]) > 0) {
            largest = right;    // If right child is larger than largest so far
        }
        if (largest != index) {             // If largest is not root
            T swap = array[index];
            array[index] = array[largest];
            array[largest] = swap;
            heapify(array, length, largest);    // Recursively heapify sub-tree
        }
    }
            
    /**
     * An implementation of a heap sort algorithm it will sort the array into 
     * ascending order. 
     * 
     * @param list the LinkedList to sort
     */
    public void heap(LinkedList<T> list) {
        if (list == null) return;                       // error check
        int length = list.size();
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(list, length, i);      // Build heap (rearrange list)
        }
        for (int i = length - 1; i > 0; i--) {  // Extract element from heap            
            T temp = list.get(0);               // Move current root to end
            list.set(0, list.get(i));
            list.set(i, temp);
            heapify(list, i, 0);       // Call max heapify on the reduced heap
        }
    } 
 
    /**
     * To 'heapify' a sub-tree rooted with node index which is an index in 
     * array[] with length being the size of heap
     * 
     * @param list the LinkedList to heapify
     * @param length the length to heapify
     * @param index the index of the largest
     */
    private void heapify(LinkedList<T> list, int length, int index) {
        int largest = index; // Initialize largest as root
        int left    = 2 * index + 1; 
        int right   = 2 * index + 2;         
        if (left < length && list.get(left).compareTo(list.get(largest)) > 0) {
            largest = left;     // If left child is larger than root
        }        
        if (right < length && list.get(right).compareTo(list.get(largest)) > 0) {
            largest = right;    // If right child is larger than largest so far
        }
        if (largest != index) {             // If largest is not root
            T swap = list.get(index);
            list.set(index, list.get(largest));
            list.set(largest, swap);
            heapify(list, length, largest);    // Recursively heapify sub-tree
        }
    }
    
    /**
     * An implementation of a radix sort algorithm it will sort the array into 
     * ascending order. NOTE: radix sort will work on array/lists of integers
     * or data types that can be represented as integers (e.g. char ASCII values)
     * 
     * @param array the integer array of generic items to sort
     */    
    public void radix(Integer[] array) {
        if (array == null) return;                          // error check
        int[] a = toPrimitive(array);
        radix(a);
        for (int i = 0; i < array.length; i++) {
            array[i] = a[i];            
        }
    }
    
    /**
     * An implementation of a radix sort algorithm it will sort the list into 
     * ascending order. NOTE: radix sort will work on array/lists of numbers
     * or date types that can be represented as numbers (e.g. char ASCII values)
     * 
     * @param list the LinkedList to sort
     */    
    public void radix(LinkedList<Integer> list) {
        if (list == null) return;                          // error check
        if (list.isEmpty()) return;                          // error check
        Integer arrayFromList[] = new Integer[1];
        arrayFromList = list.toArray(arrayFromList);
        int[] array = new int[arrayFromList.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayFromList[i].intValue();            
        }
        radix(array);
        list.clear();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }
    
    /**
     * Sorts an array of integers using Radix Sort algorithm, which works by 
     * sorting numbers digit by digit starting from the least significant 
     * digit to the most significant
     * 
     * @param array The input array to be sorted
     */
    private void radix(int[] array) {
        if (array == null) return;                          // error check
        int maximum = getMaximum(array);    // Get largest in array
        // Apply counting sort for every digit, moving from least 
        // significant to most significant
        for (int exponent = 1; maximum / exponent > 0; exponent *= 10) {
            countingSort(array, exponent);
        }
    }
    
    /**
     * Converts the Integer class array into the primitive int type array
     * 
     * @param array the Integer class array to convert
     * @return a primitive int type array
     */
    private int[] toPrimitive(Integer[] array) {
        int[] converted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            converted[i] = array[i].intValue();            
        }
        return converted;
    }
            
    /**
     * Finds the maximum absolute value in the array
     * 
     * @param array The input array.
     * @return The maximum absolute value in the array
     */
    private int getMaximum(int[] array) {
        int maximum = Math.abs(array[0]);
        for (int value : array) {
            if (Math.abs(value) > maximum) {
                maximum = Math.abs(value);
            }
        }
        return maximum;
    }
    
    /**
     * Performs counting sort based on the digit represented by exp.
     * 
     * @param array The input array.
     * @param exponent The exponent representing the digit place (1s, 10s, 
     * 100s, etc.).
     */
    private static void countingSort(int[] array, int exponent) {
        int length = array.length;
        int[] outputArray = new int[length]; // Output array
        int[] count = new int[19]; // Count array for digits (-9 to 9)
        // Count occurrences of each digit
        for (int i = 0; i < length; i++) {
            count[9 + (array[i] / exponent) % 10]++;
        }
        // Change count[i] so that it contains actual position of the 
        // digit in outputArray[]
        for (int i = 1; i < 19; i++) {
            count[i] += count[i - 1];
        }
        // Build the outputArray
        for (int i = length - 1; i >= 0; i--) {
            outputArray[count[9 + (array[i] / exponent) % 10] - 1] = array[i];
            count[9 + (array[i] / exponent) % 10]--;
        }
        // Copy the outputArray to array, so that array now contains 
        // sorted numbers
        System.arraycopy(outputArray, 0, array, 0, length);
    }
    
}