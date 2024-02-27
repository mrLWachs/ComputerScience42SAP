/** Required package class namespace */
package testing.cs42sap.examquestions;

 
/**
 * PracticeQuestions.java - description
 *
 * @author Chylsy Marable
 * @since Feb 12, 2024, 11:55:36 a.m.
 */
public class ExamQuestionsCS42SAP 
{

    /**
     * Default constructor, set class properties
     */
    public ExamQuestionsCS42SAP() {
        
        //q1();
        //q5();
        //q6();
        //q9();
        mock();
        
    }

    //<editor-fold>

    private static void q1(){
        
        int a = 5;
        int b = 2;
        double c = 3.0;
        
        System.out.println(5 + a / b * c - 1 );
    }
    
    private static void q5(){
        
//        boolean a = false;
//        boolean b = true;
//        boolean c = a && !(b || a);
//        
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        
        
        
        boolean a = false;
        boolean b = true;

        //a && !(b || a);
        //       (b || a)
        //       !(b || a)
        // a && [!(b || a)];
        
        boolean c = test0(a, b);
        boolean d = test1(c);
        boolean e = test2(a,d);
        
        System.out.println(e);
    }
    
    public static boolean test0(boolean a, boolean b) {
        System.out.println("Test 0...");
        
        boolean c = (b || a);
        
        return c;
    }
    
    public static boolean test1(boolean a) {
        System.out.println("Test 1....");
        boolean c = !a;
        
        return c;
    }
    
    public static boolean test2(boolean a, boolean c) {
        System.out.println("Test 2....");
        boolean d = a && c;
        
        return d;
    }
    
    public static void q6() {
        
        int val = 48;
        int div = 6;
        
        while ((val % 2 == 0) && div > 0) {
            
            if (val % div == 0){
                
                System.out.println(val + " ");
            }
            
            val /= 2;
            div--;
        }
        

    }
    
    //</editor-fold>
    
    public static void q9(){
        
        int[] nums = {1,2,3,4,5,6};
        
        for (int k = 0; k < nums.length; k++) {
            
            nums[k] = nums[k] * nums[k];
            System.out.println(nums[k]);
        }
        
        for(int n : nums){
            
            n = n * n;
            System.out.println(n);
        }
        
    }
    
    //https://www.crackap.com/ap/computer-science-a/test1.html
    private static void mock(){
        
        // 1: B 2: D 3:D
        
        //q4: A
        double answer = 13 / 5; // = 2.0 coz it gets truncated (it's a division
                                // between 2 integers)
        double ans = (double)(13/5); // this one will not work coz it takes the 
                                     // result of (13/5) and just turns the entire
                                     // thing into a double
        // to fix the problem it has to be a double/int or int/double or double/double
        // int/int will just get truncated 
        
        //q5: E
        int result = 13 - 3 * 6 / 4 % 3;
        
        //13 - 18 / 4 % 3;
        //13 - 4 % 3     <--- 18/4 is 4.5 but it is truncated
        //13 - 1 
        //12
        System.out.println(result);
        
        //q6: C
        //2 + 3 * 12 / 7 - 4 + 8   <--- what is the answer if its not PEMDAS but PEADMS
        //5 * 12 / 7 - 4 + 8
        // 5 * 12 / 3 + 8
        // 5 * 12 / 11
        
        System.out.println(5 * 12 / 11); // = 5
        
    }
    
}
