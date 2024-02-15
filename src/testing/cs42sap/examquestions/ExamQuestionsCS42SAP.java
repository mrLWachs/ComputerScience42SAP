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
        
        question5();
    }

    private static void question5(){
        
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
    
    
    
}
