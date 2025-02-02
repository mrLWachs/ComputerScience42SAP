
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;


/**
 * Searcher.java - useful methods for searching through arrays and lists of
 * generic data for a specific item
 * 
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since June 2023
 */
public class Search <T extends Comparable<T>>
{
    
    /** Indicates the item being searched for is not found */
    public final int NOT_FOUND = -1;

    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurance of an item in the array and return the 
     * index where it found it, or a -1 if not found
     * 
     * @param item the generic data type to search for in the list
     * @param array an array of generic items to search through
     * @return the first index found at, or a -1 if not found
     */
    public int linear(T item, T[] array) {
        if (item == null || array == null) return NOT_FOUND; // invalids
        for (int i = 0; i < array.length; i++) {    // traverse entire list
            if (item.equals(array[i])) {            // found first occurance
                return i;                           // stop loop and return
            }
        }
        return NOT_FOUND;                           // not found
    }
    
    /**
     * An implementation of a linear search (sequential search) algorithm. It
     * will find the first occurance of an item in the LinkedList and return
     * the index where it found it, or a -1 if not found 
     * 
     * @param item the generic data type to search for in the list
     * @param list the LinkedList to search through
     * @return the first index found at, or a -1 if not found
     */
    public int linear(T item, LinkedList list) {
        if (item == null || list == null) return NOT_FOUND; // invalids
        return recursiveLinear(item, list, 0);              // recursive call
    }
    
    /**
     * Recursive method to find the first occurance of an item in the
     * LinkedList and return the index where it found it, or a  -1 if not found
     * 
     * @param item the generic data type to search for in the list
     * @param list the LinkedList to search through
     * @param i the current index location
     * @return the first index found at, or a -1 if not found
     */
    private int recursiveLinear(T item, LinkedList<T> list, int i) {
        if      (i == list.size())                 return NOT_FOUND;  
        else if (item.compareTo(list.get(i)) == 0) return i;
        else return recursiveLinear(item,list,i+1);
    }
    
    /**
     * An implementation of a binary search algorithm. It will find the first
     * occurance of an item in the LinkedList and return the index where it 
     * found it, or a  -1 if not found
     * 
     * @param item the generic data type to search for in the list
     * @param array an array of generic items to search through
     * @return the first index found at, or a -1 if not found 
     */
    public int binary(T item, T[] array) {
        if (item == null || array == null) return NOT_FOUND;
        int high = array.length - 1;    // marker for high end
        int low = 0;                    // marker for low end
        while (low <= high) {           // continue while markers not collapsed
            int mid = (high + low) / 2; // calculate middle point of markers
            if      (array[mid].compareTo(item) == 0) return mid;
            else if (array[mid].compareTo(item)  > 0) high = mid - 1;
            else if (array[mid].compareTo(item)  < 0) low  = mid + 1;
        }
        return NOT_FOUND;               // not found
    }
    
    /**
     * An implementation of a binary search algorithm. It will find the first 
     * occurance of an item in the LinkedList and return the index where it 
     * found it, or a -1 if not found
     * 
     * @param item the generic data type to search for in the list
     * @param list the LinkedList to search through
     * @return the first index found at, or a -1 if not found 
     */
    public int binary(T item, LinkedList<T> list) {
        if (item == null || list == null) return NOT_FOUND;
        return recursiveBinary(item,list,0,list.size());
    }

    /**
     * Recursive method used to find the item in the list and return the index 
     * of it's location or a -1 if not found
     * 
     * @param item the generic data type to search for in the list
     * @param list the LinkedList to search through
     * @param low the lowest index to start from
     * @param high the highest index to go to
     * @return the first index found at, or a -1 if not found 
     */
    private int recursiveBinary(T item,LinkedList<T> list,int low,int high) {
        if (low <= high) {                      // while markers not collapsed
            int mid = low + (high - low) / 2;   // calculate middle point 
            if (list.get(mid) == null) return NOT_FOUND;
            if (list.get(mid).compareTo(item) >  0)
                return recursiveBinary(item,list,low,mid-1);
            else if (list.get(mid).compareTo(item) <  0)
                return recursiveBinary(item,list,mid+1,high);
            else 
                return mid;
        }
        return NOT_FOUND;                       // not found
    }

}