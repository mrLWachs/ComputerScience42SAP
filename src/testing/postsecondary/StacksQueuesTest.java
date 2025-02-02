
/** Required package class namespace */
package testing.postsecondary;

/** Required API imports */
import testing.Tester;
import utility.collections.LinkedList;
import utility.collections.Queue;
import utility.collections.Stack;
import utility.io.Simulator;
import testing.prerequisite.cs40s.advancedclasses.Box;
import utility.tools.Text;
import utility.io.System;


/**
 * StacksQueuesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class StacksQueuesTest 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public StacksQueuesTest(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Stacks and Queues Post Secondary Content not running");
            return;
        }
        Simulator.title("Stacks and Queues Post Secondary Content:");
        
        // Create some objects for testing.....................................
        Simulator.comment("Create objects for testing...");
        
        final int MAX       = 10;       // For the number of objects to create
        final int WORD_SIZE = 5;        // For random words made in the objects
        
        Text text = new Text();         // For making random text
        
        // Create and test a Stack object.......................................
        Simulator.comment("Create and Test a stack object...");
        
        Stack stack = new Stack();
        
        // Test toString, size, isEmpty, and push methods......................
        Simulator.comment("Test toString, size, isEmpty, and push methods...");
        
        System.out.println("Empty = "  + stack.isEmpty() +
                           "\tSize = " + stack.size() +
                           "\t"        + stack.toString());
        
        // Loop through adding random values...................................
        Simulator.comment("Loop through adding random values");
        
        for (int i = 0; i < MAX; i++) {                 // Traverse to test edge
            String word = text.randomWord(WORD_SIZE);   // Create random word
            Box<String> box = new Box<>(word);
            stack.push(box);
            System.out.println("Empty = "  + stack.isEmpty() +
                               "\tSize = " + stack.size() +
                               "\t"        + stack.toString());
        }
        
        // Test clone method...................................................
        Simulator.comment("Test clone method...");
        
        Stack copy = stack.clone();
        System.out.println("Clone stack: " + copy.toString());
        
        // Test equals method..................................................
        Simulator.comment("Test equals method...");
        
        if (stack.equals(copy)) System.out.println(stack + "\n==\n" + copy);
        else                    System.out.println(stack + "\n!=\n" + copy);   
        
        // Now change the copy.................................................
        Simulator.comment("Now change the copy");
        
        copy.finalize();
        copy.push(new Box(text.randomWord(WORD_SIZE)));        
        
        // Now check again.....................................................
        Simulator.comment("Now check again");
        if (stack.equals(copy)) System.out.println(stack + "\n==\n" + copy);
        else                    System.out.println(stack + "\n!=\n" + copy);
        
        // Re-clone the stack, and output......................................
        Simulator.comment("Re-clone the stack, and output");
        copy = stack.clone();
        System.out.println(copy.toString());
        
        // Test the pop method.................................................
        Simulator.comment("Text the pop method...");
        
        System.out.println("Clone stack:" + 
                           "\tEmpty = " + copy.isEmpty() +
                           "\tSize = "  + copy.size() +
                           "\t"         + copy.toString());
        
        // Loop through removing values
        Simulator.comment("Loop through removing values");
        for (int i = 0; i < MAX+1; i++) { 
            System.out.println("Popped -> " + copy.pop() + 
                               "\tEmpty = " + copy.isEmpty() +
                               "\tSize = "  + copy.size() +
                               "\t"         + copy.toString());
        }
        
        // Test peek (top is wrapper no testing needed)........................
        Simulator.comment("Test peek (top is wrapper no testing needed)...");
        
        System.out.println("Clone Top = " + copy.top());
        System.out.println("Stack Top = " + stack.top());
        
        // Test to array and to linked list....................................
        Simulator.comment("Test to array and to linked list...");
        
        LinkedList<Box> list = stack.toLinkedList();
        Box[] array = new Box[1];
        array = (Box[])stack.toArray(array);        
        System.out.println(list);
        System.out.println("Array   \t" + text.toString(array));
        
        // Test our constructors...............................................
        Simulator.comment("Test our constructors...");
        
        Stack stackFromArray = new Stack(array);
        Stack stackFromList  = new Stack(list);        
        System.out.println(stackFromArray);
        System.out.println(stackFromList);
        
        // Now we look at Queues...............................................        
        Simulator.comment("Test the Queue object...");
        
        Queue queue = new Queue();
        
        // Test toString,size,isEmpty, and enqueue methods.....................
        Simulator.comment("Test toString,size,isEmpty, and enqueue methods...");
        
        System.out.println("Empty = "  + queue.isEmpty() +
                           "\tSize = " + queue.size() +
                           "\t"        + queue.toString());  
        
        // Loop through adding random values 
        Simulator.comment("Loop through adding random values");        
        for (int i = 0; i < MAX; i++) {            
            String word = text.randomWord(WORD_SIZE);
            Box<String> box = new Box<>(word);
            queue.enqueue(box);            
            System.out.println("Empty = "  + queue.isEmpty() +
                               "\tSize = " + queue.size() +
                               "\t"        + queue.toString());
        }
        
        // Test clone method...................................................
        Simulator.comment("Test clone method...");
        
        Queue duplicate = queue.clone();
        System.out.println("Clone Queue \t\t\t" + duplicate.toString());
        
        // Test equals method..................................................
        Simulator.comment("Test equals method...");
        
        if (queue.equals(duplicate)) 
            System.out.println(queue + "\n==\n" + duplicate);
        else                    
            System.out.println(queue + "\n!=\n" + duplicate);        
        // Now change the duplicate
        Simulator.comment("Now change the duplicate");
        duplicate.finalize();
        duplicate.enqueue(new Box(text.randomWord(WORD_SIZE)));        
        // Now check again
        Simulator.comment("Now check again");
        if (duplicate.equals(duplicate)) 
            System.out.println(queue + "\n==\n" + duplicate);
        else                    
            System.out.println(queue + "\n!=\n" + duplicate);
        
        // Re-clone the queue, and output
        Simulator.comment("Re-clone the queue, and output");
        duplicate = queue.clone();
        System.out.println(duplicate.toString());
        
        // Test the dequeue method.............................................
        Simulator.comment("Test the dequeue method...");
        
        System.out.println("Clone queue:" + 
                           "\tEmpty = " + duplicate.isEmpty() +
                           "\tSize = "  + duplicate.size() +
                           "\t"         + duplicate.toString());
        
        // Loop through removing values
        Simulator.comment("Loop through removing values");
        for (int i = 0; i < MAX+1; i++) { 
            System.out.println("Dequeued -> " + duplicate.dequeue()+ 
                               "\tEmpty = " + duplicate.isEmpty() +
                               "\tSize = "  + duplicate.size() +
                               "\t"         + duplicate.toString());
        }
        
        // Test front and back.................................................
        Simulator.comment("Test front and back...");
        
        System.out.println("Clone Front = " + duplicate.front());
        System.out.println("Queue Front = " + queue.front());
        System.out.println("Clone Back  = " + duplicate.back());
        System.out.println("Queue Back  = " + queue.back());
                
        // Test to array and to linked list....................................
        Simulator.comment("Test to array and to linked list...");
        
        list = queue.toLinkedList();
        array = new Box[1];
        array = (Box[])queue.toArray(array);        
        System.out.println(list);
        System.out.println("Array   \t" + text.toString(array));
        
        // Test our constructors...............................................
        Simulator.comment("Test our constructors...");
        
        Queue queueFromArray = new Queue(array);
        Queue queueFromList  = new Queue(list);        
        System.out.println(queueFromArray);
        System.out.println(queueFromList);
        
        // Test constructors from stack to queue (and back)....................
        Simulator.comment("Constructors from stack to queue (and back)...");
        
        Stack fromQueueStack = new Stack(queue);
        Queue fromStackQueue = new Queue(fromQueueStack);
        
        System.out.println(queue          + "\t into \t" + fromQueueStack);
        System.out.println(fromQueueStack + "\t into \t" + fromStackQueue);
    }   

}
