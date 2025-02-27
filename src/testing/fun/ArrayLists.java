/** Required package class namespace */
package testing.fun;

/** Required API imports */
import java.util.ArrayList;


/**
 * ArrayLists.java - the student requested review of the ArrayList concepts as 
 * needed for the AP exam (from the AP Computer Science curriculum). 
 * 
 * In the A.P. computer Science A curriculum in Unit 6, students learn that 
 * data structures are helpful when storing multiple related data values. 
 * Arrays have a static size, which causes limitations related to the number 
 * of elements stored, and it can be challenging to reorder elements stored 
 * in arrays. The ArrayList object has a dynamic size, and the class contains 
 * methods for insertion and deletion of elements, making reordering and 
 * shifting items easier. Deciding which data structure to select becomes 
 * increasingly important as the size of the data set grows, such as when 
 * using a large real-world data set. In this unit, students will also learn 
 * about privacy concerns related to storing large amounts of personal data 
 * and about what can happen if such information is compromised.
 * 
 * ArrayLists are imported from the Java core library (API framework) "util" 
 * (utility) and can be seen in this top-down diagram below...
 * 
 *            +------------+
 *            | Collection |
 *            +------------+
 *           /      |      \
 *          /       |       \
 *   +-----+    +------+    +-------+
 *   | Set |    | List |    | Queue |
 *   +-----+    +------+    +-------+
 *             /    |   \           \
 *            /     |    +-----+     +----+
 *           /      |           \          \
 * +-----------+ +------------+ +--------+ +---------------+    
 * | ArrayList | | LinkedList | | Vector | | PriorityQueue |
 * +-----------+ +------------+ +--------+ +---------------+
 *                                  | 
 *                              +-------+
 *                              | Stack |
 *                              +-------+
 * 
 * From this: "Collection", "Set", "Queue", and "List" are interfaces that are 
 * implemented by the classes: "ArrayList", "LinkedList", "Vector", and 
 * "PriorityQueue" and the class "Stack" inherits from the "Vector" class.
 * 
 * @author Mr. Wachs
 * @since Feb 27, 2025
 */
public class ArrayLists
{

    public static void main(String[] args) {
        
    }

}