
/
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */

import io.Simulator;
import java.lang.reflect.Array;
import java.util.Arrays;
 
/**
 * APUnit06Arrays.java - This unit focuses on data structures, which are used
 * to represent collections of related data using a single variable rather 
 * than multiple variables. Using a data structure along with iterative 
 * statements with appropriate bounds will allow for similar treatment to be 
 * applied more easily to all values in the collection. Just as there are 
 * useful standard algorithms when dealing with primitive data, there are 
 * standard algorithms to use with data structures. In this unit, we apply 
 * standard algorithms to arrays; however, these same algorithms are used 
 * with ArrayLists and 2D arrays as well. Additional standard algorithms, 
 * such as standard searching and sorting algorithms, will be covered in the 
 * next unit.
 *
 * @author Mr. Wachs
 * @since 29-Jun-2023, 2:15:16 PM
 */
public class APUnit06Arrays 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit06Arrays() {
        Simulator.header("AP: Unit 6 (Arrays) started...");
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("6.1 Array Creation and Access");  
        // (6.1.1) Represent collections of related primitive or object 
        //         reference data using onedimensional (1D) array objects
            // (6.1.1.1) The use of array objects allows multiple related 
            //           items to be represented using a single variable
            // (6.1.1.2) The size of an array is established at the time of 
            //           creation and cannot be changed
            // (6.1.1.3) Arrays can store either primitive data or object 
            //           reference data
            // (6.1.1.4) When an array is created using the keyword new, all
            //           of its elements are initialized with a specific value
            //           based on the type of  elements: (a) Elements of type 
            //           int are initialized to 0, (b) Elements of type double
            //           are initialized to 0.0, (c) Elements of type boolean 
            //           are initialized to false, (d) Elements of a reference
            //           type are initialized to the reference value null. No
            //           objects are automatically created
            // (6.1.1.5) Initializer lists can be used to create and initialize
            //           arrays
            // (6.1.1.6) Square brackets ([ ]) are used to access and modify an 
            //           element in a 1D array using an index
            // (6.1.1.7) The valid index values for an array are 0 through one 
            //           less than the number of elements in the array, 
            //           inclusive. Using an index value outside of this range
            //           will result in an ArrayIndexOutOfBoundsException 
            //           being thrown
        ////////////////////////////////////////////////////////////////////////

     
        String[] arrayString = new String[]{"zero","one","two","three","four","this is out of place"};
        int[] arrayInt = new int[]{0,1,2,3,4};
        int[] messyArray = new int[]{234,33,67,223,15,43,62,53,34,6,75,3,1};
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("6.2 Traversing Arrays");  
        // (6.2.1) Traverse the elements in a 1D array
            // (6.2.1.1) Iteration statements can be used to access all the
            //           elements in an array. This is called traversing the 
            //           array
            // (6.2.1.2) Traversing an array with an indexed for loop or while
            //           loop requires elements to be accessed using their 
            //           indices
            // (6.2.1.3) Since the indices for an array start at 0 and end at
            //           the number of elements − 1, “off by one” errors are 
            //           easy to make when traversing an array, resulting in 
            //           an ArrayIndexOutOfBoundsException being thrown
        ////////////////////////////////////////////////////////////////////////
        
        int indexInt1 = arrayInt[1];
        System.out.println(indexInt1);
        
        String indexString1 = arrayString[1];
        System.out.println(indexString1);
        // for loop "i" starts and 0 and outputs that index in the array
        // 1 is added to "i" every ideration untill it reaches the legnth of the array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
        
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("6.3 Enhanced for Loop for Arrays");  
        // (6.3.1) Traverse the elements in a 1D array object using an enhanced
        //         for loop
            // (6.3.1.1) An enhanced for loop header includes a variable, 
            //           referred to as the enhanced for loop variable
            // (6.3.1.2) For each iteration of the enhanced for loop, the 
            //           enhanced for loop variable is assigned a copy of an 
            //           element without using its index
            // (6.3.1.3) Assigning a new value to the enhanced for loop 
            //           variable does not change the value stored in the array
            // (6.3.1.4) Program code written using an enhanced for loop to 
            //           traverse and access elements in an array can be 
            //           rewritten using an indexed for loop or a while loop
        ////////////////////////////////////////////////////////////////////////
        // enhanced for loops 
        // the int "one" assigned the value of what is found at that index of 
        //the array and the body code outputs that value
        for (int one : arrayInt) {
            System.out.println(one);
        }
        for ( String output : arrayString ) {
            System.out.println(output);
        }
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("6.4 Developing Algorithms Using Arrays");  
        // (6.4.1) For algorithms in the context of a particular specification 
        //         that requires the use of array traversals: (a) Identify 
        //         standard algorithms, (b) Modify standard algorithms, 
        //         (c) Develop an algorithm
            // (6.4.1.1) There are standard algorithms that utilize array 
            //           traversals to: (a) Determine a minimum or maximum 
            //           value, (b) Compute a sum, average, or mode, 
            //           (c) Determine if at least one element has a particular 
            //           property, (d) Determine if all elements have a 
            //           particular property, (e) Access all consecutive pairs
            //           of elements, (f) Determine the presence or absence of
            //           duplicate elements, (g) Determine the number of 
            //           elements meeting specific criteria
            // (6.4.1.2) There are standard array algorithms that utilize 
            //           traversals to: (a) Shift or rotate elements left or
            //           right, (b) Reverse the order of the elements
        ////////////////////////////////////////////////////////////////////////
        
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == 1) {
                System.out.println(" found it" +" 1 is at index " + i);
            }
           
        }
          
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] == "this is out of place") {
                System.out.println( "index " + i + " is out of place");
            }
           
        }
        // sorting
        int i;
        int j;
        int temp;
         for (i = 0; i < messyArray.length - 1; i++) {
            for ( j = 0; j < messyArray.length - 1 - i; j++) {
                if (messyArray[j] > messyArray[j+1]) {
                  
                 temp = messyArray[j];
                 messyArray[j] = messyArray[j+1];
                 messyArray[j + 1] = temp;
                }
                System.out.println(Arrays.toString(messyArray));
            }
        }
        Simulator.header("AP: Unit 6 (Arrays) completed!");
    }   
    
}
