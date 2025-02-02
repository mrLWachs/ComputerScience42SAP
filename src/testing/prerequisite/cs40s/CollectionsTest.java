
/** Required package class namespace */
package testing.prerequisite.cs40s;

/** Required API imports */
import utility.collections.LinkedList;
import utility.collections.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import utility.io.System;


/**
 * CollectionsTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class CollectionsTest 
{

    /**
     * Default constructor, set class properties
     */
    public CollectionsTest() {
        System.out.println("Collections testing begins...");
        
        // Create some node objects...
        System.out.println("Testing Node constructors....................");
        Node<String> a = new Node<>();
        Node<String> b = new Node<>("Sass");
        Node<String> c = new Node<>("Pros", b);
        Node<String> d = new Node<>("Joes", c, b);
        
        // Output our nodes...
        System.out.println("Testing Node toString()......................");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        
        // Clone a node...
        System.out.println("Testing Node clone().........................");
        Node<String> e = a.clone();
        Node<String> f = b.clone();
        Node<String> g = c.clone();
        Node<String> h = d.clone();
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Check if nodes are equal...
        System.out.println("Testing Node equal().........................");
        System.out.println("Node a == b? -> " + a.equals(b));
        System.out.println("Node b == c? -> " + b.equals(c));
        System.out.println("Node c == d? -> " + c.equals(d));
        System.out.println("Node d == d? -> " + d.equals(d));
        System.out.println("Node e == a? -> " + e.equals(a));
        System.out.println("Node f == b? -> " + f.equals(b));
        System.out.println("Node g == c? -> " + g.equals(c));
        System.out.println("Node h == d? -> " + h.equals(d));
        
        // finalize some nodes (wipe em out, "destroy" them, free up memory)
        System.out.println("Testing Node finalize()......................");
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());   
        System.out.println("Node g = " + g.toString());   
        System.out.println("Node h = " + h.toString());   
        a.finalize();
        b.finalize();
        c.finalize();
        d.finalize();
        e.finalize();
        f.finalize();  
        g.finalize();  
        h.finalize();  
        System.out.println("Node a = " + a.toString());
        System.out.println("Node b = " + b.toString());
        System.out.println("Node c = " + c.toString());
        System.out.println("Node d = " + d.toString());
        System.out.println("Node e = " + e.toString());
        System.out.println("Node f = " + f.toString());
        System.out.println("Node g = " + g.toString());
        System.out.println("Node h = " + h.toString());
        
        // Create a LinkedList object to test the constructor
        System.out.println("Testing default LinkedList constructor.......");        
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        // Test toString() method (before I add anything into the list)........
        System.out.println("Testing toString, empty, size methods........");        
        System.out.println("L1 toString -> " + list1.toString());
        System.out.println("L2 toString -> " + list2.toString());
        
        // Test isEmpty() method...............................................
        System.out.println("L1 empty? -> " + list1.isEmpty());
        System.out.println("L2 empty? -> " + list2.isEmpty());
        
        // Test size() method..................................................
        System.out.println("L1 size -> " + list1.size());
        System.out.println("L2 size -> " + list2.size());
        
        // More testing, explained in the outputs..............................
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test add (first to the back) of the list.....");        
        System.out.println("addBack -> " + list1.addBack(51)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(50)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(-50)  + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(55)   + "\t" + list1);
        System.out.println("addBack -> " + list1.addBack(null) + "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////        
        System.out.println("Test add (second to the front) of the list...");        
        System.out.println("addFront -> " + list1.addFront(80)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(81)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(-80)  + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(88)   + "\t" + list1);
        System.out.println("addFront -> " + list1.addFront(null) + "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Re-testing empty, size methods...............");  
        System.out.println("L1 empty? -> " + list1.isEmpty() + "\t" + list1);
        System.out.println("L2 empty? -> " + list2.isEmpty() + "\t" + list2);
        System.out.println("L1 size -> "   + list1.size()    + "\t" + list1);
        System.out.println("L2 size -> "   + list2.size()    + "\t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test get method..............................");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = list1.get(i);
            System.out.println("Getting " + i + " = " + value + "\t" + list1);
        }
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test set method..............................");
        for (int i = 0-1; i < list1.size()+1; i++) {
            Integer value = new Integer(i+10);
            System.out.println("Setting " + i + " to " + value + " -> " + 
                               list1.set(i, value) + "\t" + list1);
        }
        System.out.println("Setting 0 to null -> " + list1.set(0, null) + 
                           "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test equals method...........................");
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("List1 == List2 -> " + list1.equals(list2));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test clone method............................");
        list2 = list1.clone();
        System.out.println("List 1 = " + list1.toString());
        System.out.println("List 2 = " + list2.toString());
        System.out.println("Re-testing equals...");
        System.out.println("List1 == List2 -> " + list1.equals(list2));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test addAfter method.........................");
        int size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"   + value                   + 
                               "\t after index \t" + i                       + 
                               "\t result \t"      + list1.addAfter(value,i) + 
                               "\t"                + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"   + 10                      + 
                           "\t after index \t" + size                    + 
                           "\t result \t"      + list1.addAfter(10,size) + 
                           "\t"                + list1.toString());
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test addBefore method.........................");
        size = list1.size();
        for (int i = 0-1; i < size; i++) {
            int number = i + 100;
            Integer value = new Integer(number);
            System.out.println("Adding value \t"   + value                   + 
                               "\t before index \t" + i                       + 
                               "\t result \t"      + list1.addBefore(value,i) + 
                               "\t"                + list1.toString());            
        }
        System.out.println("Test other edge case");
        size = list1.size()+1; 
        System.out.println("Adding value \t"   + 10                      + 
                           "\t before index \t" + size                    + 
                           "\t result \t"      + list1.addBefore(10,size) + 
                           "\t"                + list1.toString());
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test front and back methods..................");
        System.out.println("Front of list 1 = " + list1.front() + "\t" + list1);
        System.out.println("Front of list 2 = " + list2.front() + "\t" + list2);
        System.out.println("Back of list 1 = " + list1.back() + "\t" + list1);
        System.out.println("Back of list 2 = " + list2.back() + "\t" + list2);
        System.out.println("Clear out list 2");
        list2.clear();
        System.out.println("Front of list 2 = " + list2.front() + "\t" + list2);
        System.out.println("Back of list 2 = " + list2.back() + "\t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Cloning list 2 from list 1");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeFront method......................");
        size = list1.size()+1;
        for (int i = 0; i < size; i++) {
            System.out.print(list1.toString() + "\t");
            Integer value = list1.removeFront();
            System.out.println("Removing list 1 front = \t" + value);
        }
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Cloning list 1 from list 2");
        list1 = list2.clone();
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeBack method.......................");
        size = list2.size()+1;
        for (int i = 0; i < size; i++) {
            System.out.print(list2.toString() + "\t");
            Integer value = list2.removeBack();
            System.out.println("Removing list 2 back = \t" + value);
        }
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Cloning list 2 from list 1");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test remove method...........................");
        size = list2.size()+1;
        for (int i = size; i >= -1; i--) {
            System.out.print(list1.toString() + "\t");
            Integer value = list1.remove(i);
            System.out.println("Removing from list 1 from index: \t" + i + 
                               "\t removed: \t" + value);
        }
        
        ////////////////////////////////////////////////////////////////////////        
        System.out.println("Test contains method.........................");
        System.out.println("List 1 (empty) contains 10 = " + 
                            list1.contains(10) + "\t" + list1);
        for (int i = 0; i < list2.size(); i++) {
            Integer value = list2.get(i);
            System.out.println("List 2 contains \t" + value + "\t" + 
                            list2.contains(value) + "\t" + list2);
        }
        System.out.println("List 2 contains \t" + 1000 + "\t" + 
                            list2.contains(1000) + "\t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        list1.clear(); 
        list1.add(5); list1.add(6); list1.add(7); list1.add(8); list1.add(5); 
        list1.add(6); list1.add(7); list1.add(5); list1.add(6); list1.add(7);
        System.out.println("Resetting list 1 to: " + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test firstIndexOf and lastIndexOf methods....");
        System.out.println("First index of 5: \t" + list1.firstIndexOf(5));
        System.out.println("Last  index of 5: \t" + list1.lastIndexOf(5));
        System.out.println("First index of 7: \t" + list1.firstIndexOf(7));
        System.out.println("Last  index of 7: \t" + list1.lastIndexOf(7));
        System.out.println("First index of 8: \t" + list1.firstIndexOf(8));
        System.out.println("Last  index of 8: \t" + list1.lastIndexOf(8));
        System.out.println("First index of 9: \t" + list1.firstIndexOf(9));
        System.out.println("Last  index of 9: \t" + list1.lastIndexOf(9));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test numberOf method.........................");
        System.out.println(list1);
        System.out.println("Number of 5: \t" + list1.numberOf(5));
        System.out.println("Number of 8: \t" + list1.numberOf(8));
        System.out.println("Number of 9: \t" + list1.numberOf(9));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test allIndices method.......................");
        System.out.println(list1);
        int[] array1 = list1.allIndices(5);
        int[] array2 = list1.allIndices(8);
        int[] array3 = list1.allIndices(9);        
        System.out.println("Array -> indices 5: \t" + Arrays.toString(array1));
        System.out.println("Array -> indices 8: \t" + Arrays.toString(array2));
        System.out.println("Array -> indices 9: \t" + Arrays.toString(array3));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Cloning list 2 from list 1");
        list2 = list1.clone();
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test remove method...........................");
        System.out.println(list1);
        Integer data1 = new Integer(5);
        Integer data2 = new Integer(8);
        Integer data3 = new Integer(9);
        System.out.println("Removing 5: \t" + list1.remove(data1) + "\t" + 
                list1);
        System.out.println("Removing 8: \t" + list1.remove(data2) + "\t" + 
                list1);
        System.out.println("Removing 9: \t" + list1.remove(data3) + "\t" + 
                list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeLast method.......................");
        System.out.println(list1);
        data1 = new Integer(5);
        data2 = new Integer(8);
        data3 = new Integer(9);
        System.out.println("Removing 5: \t" + list1.removeLast(data1) + "\t" + 
                list1);
        System.out.println("Removing 8: \t" + list1.removeLast(data2) + "\t" + 
                list1);
        System.out.println("Removing 9: \t" + list1.removeLast(data3) + "\t" + 
                list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeAll method........................");
        System.out.println(list1);
        data1 = new Integer(5);
        data2 = new Integer(6);
        data3 = new Integer(9);
        System.out.println("Removing all 5: \t" + list1.removeAll(data1) +  
                "\t" + list1);
        System.out.println("Removing all 6: \t" + list1.removeAll(data2) +  
                "\t" + list1);
        System.out.println("Removing all 9: \t" + list1.removeAll(data3) +  
                "\t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Cloning list 1 from list 2");
        list1 = list2.clone();
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeAll array method..................");
        System.out.println(list2);
        int[] array4 = {5,6,9};
        Integer[] array5 = {5,6,9};
        System.out.println("Array: \t" + Arrays.toString(array4));
        list2.removeAll(array5);
        System.out.println("Removing all from array: " + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test removeAll list method..................");
        System.out.println("List 1 \t" + list1);
        System.out.println("List 2 \t" + list2);
        list1.removeAll(list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Removing all list 2 from list 1...");
        System.out.println("List 1 \t" + list1);
        System.out.println("List 2 \t" + list2);
                
        ////////////////////////////////////////////////////////////////////////
        list1.clear(); 
        list1.add(5); list1.add(6); list1.add(7); list1.add(8); list1.add(5); 
        list1.add(6); list1.add(7); list1.add(5); list1.add(6); list1.add(7);
        list2 = list1.clone();
        System.out.println("Resetting list 1 and 2 to: " + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test containsAll array method................");
        System.out.println("List: \t" + list1 + 
                           " contains array: \t" + Arrays.toString(array4) + 
                           "\t is " + list1.containsAll(array5));
        int[] array7 = {5,6,7,8};
        Integer[] array8 = {5,6,7,8};
        System.out.println("List: \t" + list1 + 
                           " contains array: \t" + Arrays.toString(array7) + 
                           "\t is " + list1.containsAll(array8));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test containsAll list method.................");
        System.out.println("List: \t" + list1 + 
                           " contains list: \t" + list2 + 
                           "\t is " + list1.containsAll(list2));
        System.out.println("Alter list 2...");
        list2.removeBack();
        list2.removeFront();
        list2.remove(3);
        list2.add(45);
        System.out.println("List: \t" + list1 + 
                           " contains list: \t" + list2 + 
                           "\t is " + list1.containsAll(list2));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test addAll array method.....................");
        System.out.println(list2);
        list2.addAll(array8);
        System.out.println("Adding array: \t" + Arrays.toString(array7) + 
                           "\t now list \t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test addAll list method......................");
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println("Adding list: \t" + list1 + 
                           "\t now list \t" + list2);
              
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test subList method..........................");
        System.out.println("List 1 = \t" + list1);
        list2 = list1.subList(3, 6);
        System.out.println("Pulling out sub-list from 3 to 6: \t" + list2);
        list2 = list1.subList(1, 1);
        System.out.println("Pulling out sub-list from 1 to 1: \t" + list2);
        list2 = list1.subList(2, 10);
        System.out.println("Pulling out sub-list from 2 to 10: \t" + list2);
        list2 = list1.subList(0, 9);
        System.out.println("Pulling out sub-list from 0 to 9: \t" + list2);
              
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test fromArray method........................");
        System.out.println("Array is \t" + Arrays.toString(array7));
        list1.fromArray(array8);
        System.out.println("List is \t" + list1);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test fromLinkedList method...................");
        System.out.println("1st List is \t" + list1);
        list2.fromLinkedList(list1);
        System.out.println("2nd List is \t" + list2);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Test toArray method..........................");
        Integer[] array9 = new Integer[1];
        array9 = list1.toArray(array9);
        System.out.println("List \t" + list1 + "\t into array \t" + 
                Arrays.toString(array9));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing the imported util LinkedList.........");
        
        // Normally, professional programmers do not create a Linked List class, 
        // because a Linked List ADT is already available to programmers to 
        // import from something called the Collections framework which Java 
        // defines this as "The Java collections framework (JCF) is a set of 
        // classes and interfaces that implement commonly reusable collection
        // data structures". This description now has meaning  with your
        // experience, and the experience of creating a Linked List of our own 
        // will give you better insight into using and understanding this ADT. 
        // Although it is called a "framework" it is really a library of code 
        // you can use to import various ADTs for working with collections of
        // generic data. Some of the ADTs it gives programmers are:
        //   * List (including LinkedList and ArrayList)
        //   * Stack (studied in A.P. Computer Science)
        //   * Queue (including PriorityQueue, studied in A.P. Computer Science)
        //   * Set (including HashSet, or hash table)
        //   * Map (including variations of TreeMap)

        java.util.LinkedList<Double> importList = new java.util.LinkedList<>();
        System.out.println("Imported constructor...");
        Double d1 = new Double(0.01);
        importList.clear();
        importList.add(new Double(0.00));
        System.out.println("Imported add:\t" + importList.toString());
        importList.add(1, new Double(1.23));
        System.out.println("Imported add:\t" + importList.toString());
        importList.addFirst(new Double(4.56));
        System.out.println("Imported addFirst:\t" + importList.toString());
        importList.addLast(new Double(7.89));
        System.out.println("Imported addLast:\t" + importList.toString());
        System.out.println("Imported size:\t" + importList.size());
        System.out.println("Imported isEmpty:\t" + importList.isEmpty());
        System.out.println("Imported get:\t" + importList.get(1));
        System.out.println("Imported set:\t" + importList.set(0, d1));
        java.util.LinkedList<Double> cloneImport = 
                (java.util.LinkedList<Double>) importList.clone();
        System.out.println("Imported clone:\t" + cloneImport);
        System.out.println("Imported equals:\t" + importList.equals(cloneImport));
        System.out.println("Imported getFirst:\t" + importList.getFirst());
        System.out.println("Imported getLast:\t" + importList.getLast());
        System.out.println("Imported contains:\t" + importList.contains(d1));
        System.out.println("Imported removeFirst:\t" + importList.removeFirst());
        System.out.println("Imported removeLast:\t" + importList.removeLast());
        System.out.println("Imported remove:\t" + importList.remove(1));
        System.out.println("Imported remove:\t" + importList.remove(d1));
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Testing the imported util ArrayList.........");
        
        // In addition, the Collections framework allows you to work with an
        // Iterator object, which is yet another way to travel, traverse, 
        // iterate, or loop through a collection. The Iterator object is 
        // imported and has a few simple methods for using it. The iterator 
        // is another option (that you do not have to use) available with 
        // more advanced data structures
        
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add(new Character('a'));
        arrayList.add(new Character('b'));
        arrayList.add(new Character('c'));
        arrayList.add(new Character('d'));
        arrayList.add(new Character('e'));        
        System.out.println("Imported ArrayList:\t" + arrayList.toString());
        System.out.println("Using the enhanced for loop with this object...");
        for (Character character : arrayList) {
            System.out.print(character.toString() + " ");
        }
        System.out.println("");
        System.out.println("Using an iterator object...");
        Iterator i = arrayList.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Collections testing complete!");
    }
     
}