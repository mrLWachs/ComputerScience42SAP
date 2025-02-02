
/** Required package class namespace */
package utility.collections;

/** Required API imports */
import java.io.Serializable;
import java.lang.reflect.Array;


/**
 * Stack.java - a Stack ADT using generics. The stack class represents a 
 * last-in-first-out (LIFO) stack of generic objects. The usual push and pop
 * methods are provided, as well as a method to peek at the top item on the 
 * stack, a method to test for whether the stack is empty. When a stack is 
 * first created, it contains no items. It can be visualized as:
 * 
 *    top -------> item    items are removed (pop) and added (push) to the top
 *                 item
 *                 item
 *                 item
 *    bottom ----> item    a null at the bottom indicates an empty stack
 *
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since June 2023
 */
public class Stack <T> implements Serializable
{

    /** Node reference to the top of the stack */
    private Node top;
    
    /** The number of nodes in the stack */
    private int length;
        
    
    /**
     * Default constructor, set class properties
     */
    public Stack() {
        finalize();                                     // Wipe any current data
    }
    
    /**
     * Calls for garbage collection, and frees up memory - when the stack is 
     * destroyed
     */
    @Override
    public final void finalize() {
        length = 0;                                 // Length set to zero
        top    = null;                              // Reference set to null
        System.gc();                                // Garbage collector called
    }
    
    /**
     * Accessor method for the number of items in the stack
     * 
     * @return the length of the stack
     */
    public int size() {
        return length;
    }
    
    /**
     * Determines if the stack is empty or not
     * 
     * @return empty stack (true) or not (false)
     */
    public boolean isEmpty() {
        return (length == 0);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty Stack";            // Nothing in the stack
        else {                                          // Stack has content
            String text = "Stack top -> [";             // Start a string
            Node current = top;                         // Reference to top
            while (current.next != null) {              // Traverse stack
                text += current.toString() + ",";       // Add to string
                current = current.next;                 // Mode to next node
            }            
            return text + current.toString() + "] <- bottom"; 
        }
    }
    
    /**
     * Adds (inserting) to the top of the stack. Note: the data must be valid
     * (not null) for it to be added
     * 
     * @param data the generic data to be added (pushed)
     * @return operation was successful (true) or not (false)
     */
    public boolean push(T data) {
        if (data == null) return false;     // Will not proceed
        Node node = new Node(data);         // Creating (instantiating) object
        if (!isEmpty()) node.next = top;    // Check if is the first node
        top = node;                         // Adjusting top reference (link)
        length++;                           // Increasing private property
        return true;                        // Operation was successful
    }
    
    /**
     * Removes the data from the top of the stack, it mutates (changes) the 
     * stack (mutator method)
     * 
     * @return the data from the top of the stack
     */
    public T pop() {
        if (isEmpty()) return null;                     // No nodes in stack
        else {                                          // Stack has some nodes
            length--;                                   // Reduce length
            T data = (T)top.data;                       // Store data
            top = top.next;                             // Adjust top reference
            System.gc();                                // Remove garbage memory
            return data;                                // Data returned
        }  
    }
    
    /**
     * Just "peeks" at the top of the stack without mutating (changing it) 
     * the structure of this stack (accessor method)
     * 
     * @return the data on the top
     */
    public T peek() {
        if (isEmpty()) return null;
        return (T)top.data;
    }
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Stack clone() {
        Stack<T> that = new Stack<>();          // Instantiate new empty stack
        Node current = top;                     // Start reference at top node
        while (current != null) {               // Traverse stack
            T data = (T)current.data;           // Get the data
            that.push(data);                    // Push onto new stack
            current = current.next;             // Move to next node
        }                
        Stack<T> copy = new Stack<>();          // Create second new stack
        while (!that.isEmpty()) {               // Traverse first stack
            T data = (T)that.pop();             // Get "that" data
            copy.push(data);                    // Push onto 2nd stack
        }        
        return copy;                            // return the deep clone
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Stack)) return false;   // Check object type
        try {                                           // Error trap
            Stack stack1 = ((Stack)object).clone();     // Clone/cast parameter
            Stack stack2 = this.clone();                // Clone this stack
            if (stack1.size() != stack2.size()) return false;   // Not same size
            while (!stack2.isEmpty()) {                 // Traverse stacks
                T data1 = (T)stack1.pop();              // Retrieve data
                T data2 = (T)stack2.pop();
                if (!data1.equals(data2)) return false; // Compare data
            }
            return true;                                // All tests passed
        }
        catch (ClassCastException | NullPointerException e) {
            return false;                               // Cannot cast, or null
        }
    }
        
    /**
     * Just "peeks" at top of stack without mutating the structure
     * 
     * @return the data on the top
     */
    public T top() {
        return peek();
    }
    
    /**
     * Turns the stack into a ADT LinkedList object
     * 
     * @return the Stack as a ADT LinkedList
     */
    public LinkedList<T> toLinkedList() {
        LinkedList<T> list = new LinkedList<>();        // create new list
        Node current = top;                             // start at top node        
        while (current != null) {                       // traverse stack   
            T data = (T)current.data;                   // retrieve data
            list.add(data);                             // add to list
            current = current.next;                     // move to next node
        }
        return list;                                    // return list
    }
    
    /**
     * Returns an array that contains the same data as the list
     * 
     * @param array the data type array
     * @return an array of generic type T
     */
    public T[] toArray(T[] array) {
        array = (T[])(Array.newInstance(
                array.getClass().getComponentType(), 
                length));                               // create array 
        Node current = top;                             // start at top node 
        for (int i = 0; i < length; i++) {              // traverse array
            array[i] = (T)current.data;                 // retrieve data
            current = current.next;                     // move to next node
        }
        return array;                                   // return array
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param list the LinkedList to set the stack to
     */
    public Stack(LinkedList<T> list) {
        finalize();                                     // wipe any current data
        for (int i = list.size()-1; i >= 0; i--) {      // traverse list
            T data = (T)list.get(i);                    // retrieve data
            push(data);                                 // push onto stack
        }
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param array the array to set the stack to
     */
    public Stack(T[] array) {
        finalize();                                     // wipe any current data
        for (int i = array.length-1; i >= 0; i--) {     // traverse array
            T data = (T)array[i];                       // retrieve data
            push(data);                                 // push onto stack
        }
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param queue the queue to set the stack to
     */
    public Stack(Queue queue) {
        this(queue.toLinkedList());
    }
    
    /**
     * Turns the stack into a ADT Queue object
     * 
     * @return the Stack as a ADT Queue
     */
    public Queue toQueue() {
        return new Queue(this);
    }

    /**
     * Constructor sets class data to the parameter 
     * 
     * @param tree the Tree to set the stack to
     */
    public Stack(BinaryTree tree) {
        this(tree.inOrder());
    }
    
    /**
     * Turns the stack into a ADT Binary tree object
     * 
     * @return the Stack as a ADT Binary tree
     */
    public BinaryTree toBinaryTree() {
        return new BinaryTree(this);
    }
    
}