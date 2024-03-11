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
        //mockTest1();
        mockTest2();
        mockTest3();
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

    //</editor-fold>

    /**
     * https://www.crackap.com/ap/computer-science-a/test1.html
     * 
     * 12 questions 
     * 
     * got 10/12
     */
    private static void mockTest1(){
        
        // 1: B 2: E 3:D
        
        //q4: E
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
        
        //q7: C <--- Answer is B
        //3.0 == x * (3.0 / x)
        double x = 4.0;
        if (3.0 == x * (3.0 / x)) System.out.println("true"); 
        else System.out.println("false");
        // K i am stupid coz all this boolean expression does is like
        // x * 3 / x   <--- it will always be 3 except for when x = 0 coz the x's
        //                  will cancel out 
        
        //q8: B <-- Answer is D
        //(Math.pow(y,0.5) == Math.sqrt(y)) <--- it will only be false if y is 
        //                                       is negative
        
        /*
            double min =    -0.00001; // Double.MIN_VALUE;
            double max = 99999.99999; //Double.MAX_VALUE;

            for (double i = min; i < max; i = i + Math.abs(min)) {

                double y = i;
                if (Math.pow(y,0.5) == Math.sqrt(y)) {
                    System.out.println(i + " = true");
                }
                else {
                    System.out.println(i + " = false");
                }
            }
        */
        
        //q9: D 
//        int num = 22;        
//        if (num > 0)
//        if (num % 5 == 0) 
//        System.out.println(num);
//        else System.out.println(num + " is negative");
       
//        int num = 22;        
//        if (num > 0) if (num % 5 == 0) System.out.println(num);
//        else System.out.println(num + " is negative");
        
        int num = 22;        
        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            else {
                System.out.println(num + " is negative");
            }
        }
        
        //q10: A q11: C q12: D
    }
    
    /**
     * https://www.crackap.com/ap/computer-science-a/test2.html
     * 
     * 12 questions
     */
    private static void mockTest2(){
        
        //1: A
        
        
        //q6:
        boolean valid = checkNumber(6143); 
        if (valid) System.out.println("V");

        boolean valid2 = checkNumber(6144);
        if (valid2) System.out.println("V2");

        boolean valid3 = checkNumber(6145);
        if (valid3) System.out.println("V3");

        boolean valid4 = checkNumber(6146);
        if (valid4) System.out.println("V4");

        boolean valid5 = checkNumber(6147);
        if (valid5) System.out.println("V5");
        
        //q9: 
        for (int i = 5; i >= 1; i--) {
            
            for (int j = i; j >= 1; j--) {
                
                System.out.println(2 * j - 1);
            }
            
            System.out.println();
        }
    }
    
    public static boolean checkNumber(int n){
        
        int d1, d2, d3, checkDigit, nRemaining, rem;
        
        checkDigit = n % 10;
        nRemaining = n / 10;
        d3 = nRemaining % 10;
        nRemaining /= 10;
        d2 = nRemaining % 10;
        nRemaining /= 10;
        d1 = nRemaining % 10;
        
        rem = (d1 + d2 + d3) % 7;
        
        return rem == checkDigit;
    }
    
    public static void mockTest3(){
        
        //q4: C
        //Two overloaded methods in the same class must have parameters with different names
        //this is false???
        String message = "Hello World";
        String punctuation = "!";
        output(message);
        output(message, punctuation);
        //this is false: to overload a method it only has to have a different
        //amount of parameters
    }
    
    private static void output(String message) {
        
        String punctuation = "!";
        System.out.println(message + punctuation);
    }

    private static void output(String message, String punctuation) {
        
        System.out.println(message + punctuation);
    }
}
