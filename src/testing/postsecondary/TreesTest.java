
/** Required package class namespace */
package testing.postsecondary;

/** Required API imports */
import utility.collections.BinaryTree;
import utility.collections.LinkedList;
import utility.collections.Queue;
import utility.collections.Stack;
import utility.collections.TreeNode;
import utility.io.Simulator;
import utility.tools.Numbers;
import utility.tools.Text;
import utility.io.System;


/**
 * TreesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class TreesTest 
{

    /**
     * Default constructor, set class properties
     */
    public TreesTest() {
        if (Simulator.check("Binary Trees Post Secondary")) return;
        
        // Constants/variables for creating random values......................
        Simulator.comment("Constants/variables for creating random values..."); 
        
        final int MIN   = 10;
        final int MAX   = 99;
        final int SIZE  = 5;        
        Numbers numbers = new Numbers();
        
        // Creating some TreeNode objects......................................
        Simulator.comment("Creating some TreeNode objects...");      
        
        TreeNode<Integer> node1 = new TreeNode<>(numbers.random(MIN, MAX));
        TreeNode<Integer> node2 = new TreeNode<>(numbers.random(MIN, MAX));
        TreeNode<Integer> node3 = new TreeNode<>(numbers.random(MIN, MAX),
                                                 node1,node2);
        // Linking the TreeNodes...............................................
        Simulator.comment("Linking the TreeNodes...");     
        
        node1.left  = node2;
        node1.right = node3;
        
        // Testing TreeNode equals..............................................
        Simulator.comment("Testing TreeNode equals...");    
        
        if (node1.equals(node2)) System.out.println("TreeNode1=TreeNode2");
        if (node1.equals(node3)) System.out.println("TreeNode1=TreeNode3");
        if (node2.equals(node3)) System.out.println("TreeNode2=TreeNode3");        
        
        // Testing TreeNode toString...........................................
        Simulator.comment("Testing TreeNode toString...");
        
        System.out.println(node1.toString());
        System.out.println(node2.toString());
        System.out.println(node3.toString());
        
        // Creating a Tree object..............................................
        Simulator.comment("Creating a Tree object...");  
        
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        // Test the insert method..............................................
        Simulator.comment("Test the insert method..."); 
        
        for (int i = 0; i < SIZE; i++) {
            tree.insert(numbers.random(MIN, MAX));
        }
        // Insert one more.....................................................
        Simulator.comment("Insert one more..."); 
        
        int value = numbers.random(MIN, MAX);
        tree.insert(value);
        
        // Test the search of the tree.........................................
        Simulator.comment("Test the search of the tree..."); 
        
        System.out.println("Should be found     = " + tree.search(value));
        System.out.println("Should NOT be found = " + tree.search(MIN-1));
        
        // Test toString() and pre, post, in order traversals..................
        Simulator.comment("Test toString() and pre, post, in order traversals"); 
        
        System.out.println(tree.toString());
        
        // Building a second tree (test clone) and test equals.................
        Simulator.comment("Building second tree (test clone) and test equals"); 
        
        BinaryTree<Integer> second = new BinaryTree<>();
        for (int i = 0; i < SIZE+1; i++) {
            second.insert(numbers.random(MIN, MAX));
        }
        System.out.println("1st tree -> " + tree.inOrder().toString());
        System.out.println("2nd tree -> " + second.inOrder().toString());
        if (tree.equals(second)) System.out.println("1st==2nd");
        else                      System.out.println("1st!=2nd");
        
        // Building a third tree (test clone) and test equals.................. 
        Simulator.comment("Building a third tree (test clone) and test equals"); 
        
        BinaryTree<Integer> third = tree.clone();
        System.out.println("1st tree -> " + tree.inOrder().toString());
        System.out.println("3rd tree -> " + third.inOrder().toString());
        if (tree.equals(third)) System.out.println("1st==3rd");
        else                    System.out.println("1st!=3rd");
        
        // Build all our data structures from each other........................
        Simulator.comment("Build all our data structures from each other..."); 
        
        final int WORD_LENGTH = 5;
        Text text = new Text();
        
        // Create variable objects..............................................
        Simulator.comment("Create variable objects...");
        
        String variable1 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable2 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable3 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable4 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable5 = text.randomWord(WORD_LENGTH).toLowerCase();
        
        // Create array from variables..........................................
        Simulator.comment("Create array from variables...");
        
        String[] array = {variable1,variable2,variable3,variable4,variable5};
        
        // Create LinkedList from array.........................................
        Simulator.comment("Create LinkedList from array...");
        
        LinkedList<String> list = new LinkedList<>(array);
        
        // Create Stack from LinkedList.........................................
        Simulator.comment("Create Stack from LinkedList...");
        
        Stack<String> stack = new Stack<>(list);
        
        // Create Queue from Stack..............................................
        Simulator.comment("Create Queue from Stack...");
        
        Queue<String> queue = new Queue<>(stack);
        
        // Create Tree from Queue...............................................
        Simulator.comment("Create Tree from Queue...");
        
        BinaryTree<String> binaryTree = new BinaryTree<>(queue);
        
        // Output variables, array, list, stack, queue, tree....................
        Simulator.comment("Output variables,array,list,stack,queue,tree...");
        
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(text.toString(array));
        System.out.println(list);
        System.out.println(stack);
        System.out.println(queue);
        System.out.println(binaryTree);
        
        // Now re-building queue from tree......................................
        Simulator.comment("Now re-building queue from tree");
        
        queue = new Queue<>(binaryTree);
        
        // Now re-building stack from queue.....................................
        Simulator.comment("Now re-building stack from queue");
        
        stack = new Stack<>(queue);
        
        // Now re-building LinkedList from stack................................
        Simulator.comment("Now re-building LinkedList from stack...");
        
        list = new LinkedList<>(stack);
        
        // Now re-building array from LinkedList................................
        Simulator.comment("Now re-building array from LinkedList...");
        
        array = list.toArray(array);
        
        // Output array,list,stack,queue,tree again.............................
        Simulator.comment("Output array,list,stack,queue,tree again...");
        
        System.out.println(text.toString(array));
        System.out.println(list);
        System.out.println(stack);
        System.out.println(queue);
        System.out.println(binaryTree);
    }   

}