
/** Required package class namespace */
package utility.collections;

/** Required API imports */
import java.io.Serializable;
import java.lang.reflect.Array;

 
/**
 * Queue.java - a Queue ADT using generics. It is a collection of entities that 
 * are maintained in a sequence and can be modified by the addition of entities 
 * at one end of the sequence and removal from the other end of the sequence. 
 * By convention, the end of the sequence at which elements are added is called 
 * the back, tail, or rear of the queue and the end at which elements are 
 * removed is called the head or front of the queue, analogously to the words 
 * used when people line up to wait for goods or services. It can be 
 * visualized as:
 * 
 *   Add items (enqueue)                      Remove items (dequeue)
 *   back (or tail, rear)                     front (or head)
 *    |                                         |
 *    V                                         V
 *   item  item  item  item  item  item  item  item  
 *                                             (null indicates empty queue)
 *
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since June 2023
 */
public class Queue <T> implements Serializable
{

    /** Node reference to the first node of the queue */
    private Node head;
    
    /** Node reference to the last node of the queue */
    private Node tail;
        
    /** The number of nodes in the stack */
    private int length;
        
    
    /**
     * Default constructor, set class properties
     */
    public Queue() {
        finalize();
    }
     
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param list the LinkedList to set the queue to
     */
    public Queue(LinkedList<T> list) {
        finalize();                                 // wipe any current data
        for (int i = list.size()-1; i >= 0; i--) {  // traverse list
            T data = (T)list.get(i);
            enqueue(data);                // get data, push in queue
        }
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param array the array to set the stack to
     */
    public Queue(T[] array) {
        finalize();                                     // wipe any current data
        for (int i = array.length-1; i >= 0; i--) {     // traverse array
            T data = (T)array[i];                       // retrieve data
            enqueue(data);                              // push onto stack
        }
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param stack the stack to set the queue to
     */
    public Queue(Stack stack) {
        this(stack.toLinkedList());
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param tree the Tree to set the queue to
     */
    public Queue(BinaryTree tree) {
        this(tree.inOrder());
    }
    
    /**
     * Turns the queue into a ADT LinkedList object
     * 
     * @return the Stack as a ADT LinkedList
     */
    public LinkedList<T> toLinkedList() {
        LinkedList<T> list = new LinkedList<>();        // create new list
        Node current = head;                            // start at first node        
        while (current != null) {                       // traverse queue   
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
        Node current = head;                            // start at top node 
        for (int i = 0; i < length; i++) {              // traverse array
            array[i] = (T)current.data;                 // retrieve data
            current = current.next;                     // move to next node
        }
        return array;                                   // return array
    }
    
    /**
     * Turns the queue into a ADT stack object
     * 
     * @return the queue as a ADT stack
     */
    public Stack toStack() {
        return new Stack(this);
    }
    
    /**
     * Turns the queue into a ADT Binary tree object
     * 
     * @return the Queue as a ADT Binary tree
     */
    public BinaryTree toBinaryTree() {
        return new BinaryTree(this);
    }
    
    /**
     * Calls for garbage collection, and frees up memory - when the stack is 
     * destroyed
     */
    @Override
    public final void finalize() {
        length = 0;                                 // Length set to zero
        head = tail = null;                         // Reference set to null
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
        if (isEmpty()) return "Empty Queue";            // Nothing in the queue
        else {                                          // Queue has content
            String text = "Queue back -> [";             // Start a string
            Node current = head;                        // Reference to head
            while (current.next != null) {              // Traverse queue
                text += current.toString() + ",";       // Add to string
                current = current.next;                 // Move to next node
            }            
            return text + current.toString() + "] <- front"; 
        }
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Queue)) return false;   // Check object type
        try {                                           // Error trap
            Queue<T> q1 = this.clone();                 // Clone this queue
            Queue<T> q2 = ((Queue<T>)object).clone();   // Clone/cast parameter
            if (q1.size() != q2.size()) return false;   // Queues not same size          
            while (!q1.isEmpty()) {                     // Traverse queues
                T data1 = (T)q1.dequeue();              // Retrieve data
                T data2 = (T)q2.dequeue();
                if (!data1.equals(data2)) return false; // Compare data              
            }
            return true;                                // All tests passed
        }
        catch (ClassCastException | NullPointerException e) { 
            return false;                               // Cannot cast, or null
        }
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Queue clone() {
        Queue<T> q = new Queue<>();                     // New empty queue
        Node current = tail;                            // Start at first node
        while (current != null) {                       // Traverse queue
            T data = (T)current.data;                   // Get data
            q.enqueue(data);                            // Enqueue to new queue
            current = current.previous;                 // Move to next node
        }        
        return q;                                       // Return clone
    }
    
    /**
     * Just "peeks" at front of the queue (accessor method) without mutating 
     * the structure of the Queue ADT
     * 
     * @return the data at the front
     */
    public T front() {
        if (isEmpty()) return null;                     // no nodes in stack
        return (T)tail.data;
    }
    
    /**
     * Just "peeks" at back of the queue (accessor method) without mutating 
     * the structure of the Queue ADT
     * 
     * @return the data at the back
     */
    public T back() {
        if (isEmpty()) return null;                     // no nodes in stack
        return (T)head.data;
    }
    
    /**
     * Adds data to the back (tail) of the queue (mutator method)
     * 
     * @param data the generic data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean enqueue(T data) {
        if (data == null) return false;                 // Empty queue
        Node node = new Node<T>(data);                  // Create node
        if (isEmpty()) head = tail = node;              // Add first node
        else {                                          // Add subsequent nodes
            node.next = head;                           // Adjust references
            head.previous = node;
            head = node;
        }
        length++;                                       // Increase length
        return true;                                    // Operation successful
    }

    /**
     * Removes an item from the front (head) of the queue (mutator method)
     * 
     * @return the generic data in the queue
     */
    public T dequeue() {
        if (isEmpty()) return null;                     // No nodes in queue
        else {                                          // Queue has some nodes
            length--;                                   // Reduce length
            T data = (T)tail.data;                      // Store data
            if (head == tail) finalize();               // Single node, wipe all
            else {                                      // Multi node queue
                tail = tail.previous;                   // Adjust references
                tail.next.previous = null;
                tail.next = null;
                System.gc();                            // Clean up memory
            }
            return data;                                // Data returned
        }
    }
    
}