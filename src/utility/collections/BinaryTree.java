
/** Required package class namespace */
package utility.collections;

/** Required API imports */
import java.io.Serializable;

 
/**
 * BinaryTree.java - a representation of a binary tree ADT object.It uses the 
 * TreeNode class to connect into a traditional binary tree. It could be
 * visualized as:
 *                               +------+
 *                               | root |
 *                               +------+
 *                                /    \
 *        (Left sub-tree)  +------+    +------+  (Right sub-tree)
 *                         | node |    | node |
 *                         +------+    +------+
 *                          /    \           \
 *                   +------+    +------+    +------+
 *                   | node |    | node |    | node |
 *                   +------+    +------+    +------+
 *
 * @author Mr. Wachs
 * @param <T> the generic data type used
 * @since June 2023
 */
public class BinaryTree <T extends Comparable<T> > implements Serializable
{

    private TreeNode<T> root;               // The root of tree
    
    // Add some other object (mostly to show the tree works - they could be 
    // removed from this class)
    
    private LinkedList<T> list;             // For when we "travel" the tree
    private LinkedList<T> order;            // The original order of the data
        
    
    /**
     * Default constructor, set class properties
     */
    public BinaryTree() {
        root  = null;
        list  = new LinkedList<>();         // Instantiate for traversals
        order = new LinkedList<>();
    }
         
    /**
     * Inserts data recursively into the tree in order
     * 
     * @param data the data type to insert
     */
    public boolean insert(T data) {
        if (data == null) return false;                 // Error check
        order.add(data);                                // Add to our list
        if (root == null) root = new TreeNode<>(data);  // Inserting first item
        else root.insert(data);                         // Recursive insert
        return true;                                    // Operation successful
    }
    
    /**
     * Searches the tree to see if the data exists in the tree
     * 
     * @param data the data to search for
     * @return data has been found (true) or not (false)
     */
    public boolean search(T data) {
        if (data == null) return false;             // Invalid search item
        return recursiveSearch(data,root);          // Wrapper method
    }
    
    /**
     * Recursive search starting at the root of the tree
     * 
     * @param data the data to search for
     * @param current the current tree node reference
     * @return found (true) or not (false)
     */
    private boolean recursiveSearch(T data, TreeNode<T> current) {
        // Base case (the tree is empty or we got past a leaf node)
        if (current == null) return false;          // Not found
        else if (data.compareTo(current.data) < 0) {
            // Recursive case (search the left sub-tree)
            return recursiveSearch(data, current.left);
        }
        else if (data.compareTo(current.data) > 0) {
            // Recursive case (search the right sub-tree)
            return recursiveSearch(data, current.right);
        }
        else return true;       // Base case (we found it)
    }
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public BinaryTree clone() {
        BinaryTree<T> tree = new BinaryTree<>();    // Create new tree memory
        for (int i = 0; i < order.size(); i++) {    // Traverse this tree list
            tree.insert((T)order.get(i));           // Insert into new tree
        }
        return tree;
    }
    
    /**
     * A pre-order traversal of the tree nodes
     * 
     * @return a linked list containing all the data from the tree in pre-order
     */
    public LinkedList<T> preOrder() {
        list.clear();
        list = recursivePreOrderTraversal(root);
        return list;
    }
    
    /**
     * A post-order traversal of the tree nodes
     * 
     * @return a linked list containing all the data from the tree in post-order
     */
    public LinkedList<T> postOrder() {
        list.clear();
        list = recursivePostOrderTraversal(root);
        return list;
    }
    
    /**
     * A in-order traversal of the tree nodes
     * 
     * @return a linked list containing all the data from the tree in in-order
     */
    public LinkedList<T> inOrder() {
        list.clear();
        list = recursiveInOrderTraversal(root);
        return list;
    }
    
    /**
     * Recursive wrapper method pre-order traversal starting at the root
     * 
     * @param current the reference to the current tree node
     */
    private LinkedList<T> recursivePreOrderTraversal(TreeNode<T> current) {
        // "pre" means "before" or "first", so: VISIT, left, right
        if (current != null) {  // Not yet past a leaf node, recurse (keep going)
            list.add(current.data);         // "Visit" a node (the data)
            recursivePreOrderTraversal(current.left);   // Travel left sub-tree
            recursivePreOrderTraversal(current.right);  // Travel right sub-tree
        }
        return list;            // Base case, past a leaf node
    }

    /**
     * Recursive wrapper method post-order traversal starting at the root
     * 
     * @param current the reference to the current tree node
     */
    private LinkedList<T> recursivePostOrderTraversal(TreeNode<T> current) {
        // "post" means "after" or "last", so: left, right, VISIT
        if (current != null) {  // Not yet past a leaf node, recurse (keep going)            
            recursivePostOrderTraversal(current.left);   // Travel left sub-tree
            recursivePostOrderTraversal(current.right);  // Travel right sub-tree
            list.add(current.data);         // "Visit" a node (the data)
        }
        return list;            // Base case, past a leaf node
    }

    /**
     * Recursive wrapper method in-order traversal starting at the root
     * 
     * @param current the reference to the current tree node
     */
    private LinkedList<T> recursiveInOrderTraversal(TreeNode<T> current) {
        // "in" means "in-between", so: left, VISIT, right
        if (current != null) {  // Not yet past a leaf node, recurse (keep going)
            recursiveInOrderTraversal(current.left);   // Travel left sub-tree
            list.add(current.data);         // "Visit" a node (the data)
            recursiveInOrderTraversal(current.right);  // Travel right sub-tree
        }
        return list;            // Base case, past a leaf node
    }
      
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (root == null) return "Tree Empty";          // For empty trees
        else {                                          // For filled trees
            String text = "Binary Tree:\n";             // text for output
            text += "Order: " + order.toString()       + "\n";
            text += "Pre:   " + preOrder().toString()  + "\n";
            text += "Post:  " + postOrder().toString() + "\n";
            text += "In:    " + inOrder().toString();
            return text;
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
        if (object == null) return false;           // Error check parameter
        try {
            BinaryTree that = (BinaryTree)object;   // Cast to tree object
            LinkedList inOder1 = this.inOrder();    // Use in order lists
            LinkedList inOder2 = that.inOrder();
            return inOder1.equals(inOder2);         // Check if same lists
        }
        catch (ClassCastException error) {          // Cannot cast object
            return false;
        }
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param linkedList the LinkedList to create the tree from
     */
    public BinaryTree(LinkedList<T> linkedList) {
        root  = null;
        list  = new LinkedList<>();             // build objects for traversals
        order = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            insert((T)linkedList.get(i));
        }
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param array the array to create the tree from
     */
    public BinaryTree(T[] array) {
        this(new LinkedList<>(array));
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param stack the Stack to create the tree from
     */
    public BinaryTree(Stack stack) {
        this(stack.toLinkedList());
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param queue the Queue to create the tree from
     */
    public BinaryTree(Queue queue) {
        this(queue.toLinkedList());
    }
    
}