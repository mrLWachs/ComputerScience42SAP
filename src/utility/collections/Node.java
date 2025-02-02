
/** Required package class namespace */
package utility.collections;

/** Required API imports */
import java.io.Serializable;

 
/**
 * Node.java - a representation of a generic node for use with
 * a LinkedList object, and could be "visualized" as:
 * 
 * <pre>
 * 
 *                      NODE
 *                +--------------+
 * previous {---- |              |
 *                |     data     |
 *                |   (generic)  |
 *                |              |----} next
 *                +--------------+
 *
 * </pre>
 * 
 * @author Mr. Wachs 
 * @param <T> the generic data type used in the class
 * @since June 2023
 */
public class Node <T> implements Serializable
{
    
     /** the generic data to store */
    public T data;    
    /** Self reference (link) to the next node in the "chain" */
    public Node next;
    /** Self reference (pointer) to the previous node in the "list" */
    public Node previous;
    
        
    /**
     * Class constructor sets class properties 
     * 
     * @param data the node data
     * @param next reference to the next Node object
     * @param previous reference to the previous Node object
     */
    public Node(T data, Node next, Node previous) {
        this.data     = data;
        this.next     = next;
        this.previous = previous;
    }
       
    /**
     * Class constructor sets class properties 
     * 
     * @param data the node data
     * @param next reference to the next Node object
     */
    public Node(T data, Node next) {
        this(data,next,null);
    }
        
    /**
     * Class constructor sets class properties 
     * 
     * @param data the node data
     */
    public Node(T data) {
        this(data,null,null);
    }
    
    /** 
     * Default constructor, sets class properties
     */
    public Node() {
        this(null,null,null);
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (data == null) return null;              // invalid data, output null
        return data.toString();                     // output data in node
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        if (this.data == null) return false;
        if (object    == null) return false;    // error checks
        Node that = (Node)object;               // cast object into node
        if (that.data == null || this.data == null) return false;
        return this.data.equals(that.data);     // compare data in nodes
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Node clone() {
        return new Node(data,next,previous);
        // annonymous object
    }
    
    /**
     * Frees up all memory used by this object
     */
    @Override
    public void finalize() {
        data = null;
        next = previous = null;
        System.gc();                // runs the garbage collector in Java
    }

}
