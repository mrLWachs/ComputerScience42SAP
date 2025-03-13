/** Required package class namespace */
package testing.fun;


/*
 * SearchingTest - description
 * 
 * @author YOUR NAME
 * @since Mar 13, 2025
*/
public class SearchingTest
{

    public static void main(String[] args) {
        
        // Array of items to search through
        String[] array = {
            "William", "Kurt", "Alan",
            "Franz", "Kaleb", "Neal",
            "Orion", "Tristan", "Cam", 
            "Teddy", "Finlay", "Yevheniia",
            "Thomas", "Hunter", "Nathaniel",
            "Izen", "Jonah", "Wachs"
        };
        
        // An item to search for
        String item = "Wachs";
        
        // Get the simple result of a seach 
        boolean result = search(array,item);
        
        // Display the result
        if (result) System.out.println("Found " + item);
        else        System.out.println("Not Found " + item);
        
        
        
        
    }

    /**
     * A simple search, determines if the item is in the array or not
     * 
     * @param array an array to search through
     * @param item the item to search for
     * @return found (true) or not (false)
     */
    private static boolean search(String[] array, String item) {
        // Travel the array (traverse, means to "visit" every spot) using a loop
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                // Found it!
                return true;
            }
        }
        // Go through the entire array, never found it
        return false;
    }
    

}