
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import io.Simulator;

 
/**
 * APUnit082DArrays.java - description
 *
 * @author Mr. Wachs
 * @since 28-Jun-2023, 2:15:24 PM
 */
public class APUnit082DArrays 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit082DArrays() {
        Simulator.header("AP: Unit 8 (2D Arrays) started...");
        
        
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("8.1 2D Arrays");  
        // (8.1.1) Represent collections of related primitive or object 
        //         reference data using two-dimensional (2D) array objects
            // (8.1.1.1) 2D arrays are stored as arrays of arrays. Therefore, 
            //           the way 2D arrays are created and indexed is similar 
            //           to 1D array objects
            // (8.1.1.2) For the purposes of the exam, when accessing the 
            //           element at arr[first][second], the first index is 
            //           used for rows, the second index is used for columns
            // (8.1.1.3) The initializer list used to create and initialize 
            //           a 2D array consists of initializer lists that 
            //           represent 1D arrays
            // (8.1.1.4) The square brackets [row][col] are used to access 
            //           and modify an element in a 2D array
            // (8.1.1.5) “Row-major order” refers to an ordering of 2D array 
            //           elements where traversal occurs across each row, 
            //           while “column-major order” traversal occurs down 
            //           each column
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        Simulator.comment("8.2 Traversing 2D Arrays");  
        // (8.1.1) For 2D array objects: (a) Traverse using nested for loops,
        //         (b) Traverse using nested enhanced for loops
            // (8.1.1.1) Nested iteration statements can be written to traverse 
            //           the 2D array in “row-major order” or “column-major 
            //           order.”
            // (8.1.1.2) The outer loop of a nested enhanced for loop used to 
            //           traverse a 2D array traverses the rows. Therefore, the
            //           enhanced for loop variable must be the type of each 
            //           row, which is a 1D array. The inner loop traverses a
            //           single row.  Therefore, the inner enhanced for loop 
            //           variable must be the same type as the elements stored
            //           in the 1D array            
        ////////////////////////////////////////////////////////////////////////
        
        
        
        Simulator.header("AP: Unit 8 (2D Arrays) completed!");
    }
     
}