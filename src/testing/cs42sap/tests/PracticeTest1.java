/** Required package class namespace */
package testing.cs42sap.tests;

/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

/**
 * PracticeTest1 - a set of practice test questions and solutions for the 
 * A.P. Computer Science exam
 * 
 * @author Mr. Wachs
 * @since Feb 28, 2024
*/
public class PracticeTest1
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public PracticeTest1(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("AP Practice Test 1 not running");
            return;
        }
        Simulator.title("AP Practice Test 1");
        question1();     
        question2();     
        question3();     
        question4();     
        question5();     
        question6();     
        question7();     
        question8();
        question9();
        question10();                
    }

    /**
     * A practice test question
     */
    private void question1() {
        Simulator.comment("Question 1...");        
        System.out.println("Consider the following code segment.");
        Simulator.code("int a = 5;");
        Simulator.code("int b = 2;");
        Simulator.code("double c = 3.0;");
        Simulator.code("System.out.println(5 + a / b * c - 1);");        
        System.out.println("What is printed when the code segment is executed?");
        System.out.println("(A) 0.666666666666667");
        System.out.println("(B) 9.0");
        System.out.println("(C) 10.0");
        System.out.println("(D) 11.5");
        System.out.println("(E) 14.0");
             
        Simulator.comment("Answer 1...");  
        System.out.println("C");
        // int a = 5;
        // int b = 2;
        // double c = 3.0;
        // System.out.println(5 + a / b * c - 1);
    }

    /**
     * A practice test question
     */
    private void question2() {
        Simulator.comment("Question 2...");        
        System.out.println("Which of the following statements assigns a random");
        System.out.println("integer between 25 and 60, inclusive to rn?");
        Simulator.code("(A) int rnA = (int)(Math.random() * 25) + 36;");
        Simulator.code("(B) int rnB = (int)(Math.random() * 25) + 60;");
        Simulator.code("(C) int rnC = (int)(Math.random() * 26) + 60;");
        Simulator.code("(D) int rnD = (int)(Math.random() * 36) + 25;");
        Simulator.code("(E) int rnE = (int)(Math.random() * 60) + 25;");
        
        Simulator.comment("Answer 2...");  
        boolean metA = true;
        boolean metB = true;
        boolean metC = true;
        boolean metD = true;
        boolean metE = true; 
        final long MAX = 10000000;
        //               10,000,000 (10 million tests)
        for (long i = 0; i < MAX; i++) {
            int rnA = (int)(Math.random() * 25) + 36;
            int rnB = (int)(Math.random() * 25) + 60;
            int rnC = (int)(Math.random() * 26) + 60;
            int rnD = (int)(Math.random() * 36) + 25;
            int rnE = (int)(Math.random() * 60) + 25;   
            if (rnA < 25 || rnA > 60) metA = false;
            if (rnB < 25 || rnB > 60) metB = false;
            if (rnC < 25 || rnC > 60) metC = false;
            if (rnD < 25 || rnD > 60) metD = false;
            if (rnE < 25 || rnE > 60) metE = false;
        }
        if (metA) System.out.println("A");
        if (metB) System.out.println("B");
        if (metC) System.out.println("C");
        if (metD) System.out.println("D");
        if (metE) System.out.println("E");
    }
    
    /**
     * A practice test question
     */
    private void question3() {
        Simulator.comment("Question 3...");        
        System.out.println("Which of the following best describes the value");
        System.out.println("of the Boolean expression shown below?");
        Simulator.code("a && !(b || a)");
        System.out.println("(A) The value is always true");
        System.out.println("(B) The value is always false");
        System.out.println("(C) The value is true when a has the value "
                       + "\n    false, and is false otherwise");
        System.out.println("(D) The value is true when b has the value "
                       + "\n    false, and is false otherwise");
        System.out.println("(E) The value is true when either a or b has "
                       + "\n    the value true, and is false otherwise");
             
        Simulator.comment("Answer 3...");          
        boolean a = true;
        boolean b = true;
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;
        boolean result4 = false;        
        a = true;
        b = true;
        result1 = a && !(b || a);
        a = false;
        b = false;
        result2 = a && !(b || a);
        a = true;
        b = false;
        result3 = a && !(b || a);
        a = false;
        b = true;
        result4 = a && !(b || a);        
        if (result1 && result2 && result3 && result4)     System.out.println("A");
        if (!result1 && !result2 && !result3 && !result4) System.out.println("B");
        if (result1 && !result2 && result3 && !result4)   System.out.println("C");
        if (result1 && !result2 && !result3 && result4)   System.out.println("D");
        if (result1 && !result2 && result3 && result4)    System.out.println("D");        
    }

    /**
     * A practice test question
     */
    private void question4() {
        Simulator.comment("Question 4...");        
        System.out.println("Consider the following code segment");
        Simulator.code("int val = 48;");        
        Simulator.code("int div = 6;");        
        Simulator.code("while((val % 2 == 0) && div > 0) {");        
        Simulator.code("    if (val % div == 0) {");
        Simulator.code("        System.out.print(val + \" \");");
        Simulator.code("    }");
        Simulator.code("    val /= 2;");
        Simulator.code("    div--;");
        Simulator.code("}");       
        System.out.println("What is printed when the code segment is executed?");
        System.out.println("(A) 48 12 6");
        System.out.println("(B) 48 12 6 3");
        System.out.println("(C) 48 12 6 3 1");
        System.out.println("(D) 48 24 12 6");
        System.out.println("(E) 48 24 12 6 3");
                     
        Simulator.comment("Answer 4...");          
        // int val = 48;
        // int div = 6;
        // while((val % 2 == 0) && div > 0) {
        //     if (val % div == 0) {
        //         System.out.print(val + " ");
        //     }
        //     val /= 2;
        //     div--;
        // }
        System.out.println("A");
    }

    /**
     * A practice test question
     */
    private void question5() {
        Simulator.comment("Question 5...");        
        System.out.println("Which of the following code segments is equivalent to the code below");
        Simulator.code("if (x >= 1) x = x * 3;");
        Simulator.code("if (x > 3) x = 0;");
        System.out.println("(A) x = 0");
        System.out.println("(B) if (x > 1) x = 0;");
        System.out.println("(C) if (x > 3) x = 0;");
        System.out.println("(D) if (x >= 1) x = 0;");
        System.out.println("(E) none of the above");
                     
        Simulator.comment("Answer 5...");          
        // for (int i = 0; i < 5; i++) {
        //     System.out.print("Test " + i + "\t");
        //     int x = i;
        //     if (x >= 1) x = x * 3;
        //     if (x >  3) x = 0;
        //     int xA = i;
        //     int xB = i;
        //     int xC = i;
        //     int xD = i;
        //     xA = 0;
        //     if (xB >  1) xB = 0;
        //     if (xC >  3) xC = 0;
        //     if (xD >= 1) xD = 0;
        //     if (x == xA) System.out.print(" A");
        //     if (x == xB) System.out.print(" B");
        //     if (x == xC) System.out.print(" C");
        //     if (x == xD) System.out.print(" D");
        //     if (x != xA && x != xB && x != xC && x != xD) {
        //         System.out.print(" E");
        //     }    
        //     System.out.println("\t(x=" + x + ")");
        // }        
        System.out.println("B");
    }

    /**
     * A practice test question
     */
    private void question6() {
        Simulator.comment("Question 6...");        
        System.out.println("When is the following Boolean expression true");
        System.out.println("(a and b are integers)?");
        Simulator.code("(a < b) && !(b > a)");        
        System.out.println("(A) Always true");
        System.out.println("(B) Never true");
        System.out.println("(C) a = b");
        System.out.println("(D) a < b");
        System.out.println("(E) a > b");
             
        Simulator.comment("Answer 6..."); 
        // int min = -100;
        // int max = min * -1;
        // for (int i = min; i < max; i++) {
        //     for (int j = min; j < max; j++) {       
        //         int a = i;
        //         int b = j;
        //         if ( (a < b) && !(b > a) ) {
        //             System.out.println("a = " + a + " b = " + b + " is true");
        //         }
        //     }
        // }
        // for (int i = max; i > min; i--) {
        //     for (int j = max; j > min; j--) {       
        //         int a = i;
        //         int b = j;
        //         if ( (a < b) && !(b > a) ) {
        //             System.out.println("a = " + a + " b = " + b + " is true");
        //         }
        //     }
        // }
        System.out.println("B");
    }
    
    /**
     * A practice test question
     */
    private void question7() {
        Simulator.comment("Question 7...");        
        System.out.println("Consider the following code segment");
        Simulator.code("int i = a random number such that 1 <= i <= n;");
        Simulator.code("for (int a = 2; a <= i; a++)");
        Simulator.code("    for (int b = 1; b < i; b++)");
        Simulator.code("        System.out.println(\"*\");");        
        System.out.println("(A) 0");
        System.out.println("(B) 1");
        System.out.println("(C) 2");
        System.out.println("(D) n - 1");
        System.out.println("(E) n - 2");
             
        Simulator.comment("Answer 7...");  
        // for (int n = 1; n <= 5; n++) {
        //     double seed = Math.random();
        //     double low = 1;
        //     double high = (double)n;
        //     int i = (int)((high - low + 1d) * seed + low);
        //     int count = 0;
        //     for (int a = 2; a <= i; a++) {
        //         for (int b = 1; b < i; b++) {
        //             count++;
        //             System.out.println("*");
        //         }
        //     }
        //     System.out.println("n = " + n + " random i = " + i + " star count = " + count);
        // }
        System.out.println("B");
    }
    
    /**
     * A practice test question
     */
    private void question8() {
        Simulator.comment("Question 8...");        
        System.out.println("Consider the following code segment");
        Simulator.code("int p = 5;");   
        Simulator.code("int q = 2;");   
        Simulator.code("int sum = 0;");   
        Simulator.code("while (p <= 8) {");   
        Simulator.code("    sum += p % q;");   
        Simulator.code("    p++;");   
        Simulator.code("    q++;");   
        Simulator.code("}");            
        System.out.println("(A) 1");
        System.out.println("(B) 0");
        System.out.println("(C) 13");
        System.out.println("(D) 7");
        System.out.println("(E) 4");
             
        Simulator.comment("Answer 8...");  
        // int p = 5;
        // int q = 2;
        // int sum = 0;
        // while (p <= 8) {
        //     sum += p % q;
        //     p++;
        //     q++;
        // }
        // System.out.println("sum = " + sum);
        System.out.println("D");
    }
    
    /**
     * A practice test question
     */
    private void question9() {
        Simulator.comment("Question 9...");        
        System.out.println("Consider the following code segment");
        Simulator.code("for (int i = 0; i <= 3; i++) {"); 
        Simulator.code("    for (int j = 1; j <= 5; j+=2) {"); 
        Simulator.code("        System.out.println(\"*\");"); 
        Simulator.code("    }"); 
        Simulator.code("}");          
        System.out.println("(A) 3");
        System.out.println("(B) 6");
        System.out.println("(C) 9");
        System.out.println("(D) 12");
        System.out.println("(E) 15");
             
        Simulator.comment("Answer 9...");  
        // int count = 0;
        // for (int i = 0; i <= 3; i++) {
        //     for (int j = 1; j <= 5; j+=2) {
        //         count++;
        //         System.out.println("*");
        //     }
        // }
        // System.out.println("count = " + count);  
        System.out.println("D");
    }
    
    /**
     * A practice test question
     */
    private void question10() {
        Simulator.comment("Question 10...");        
        System.out.println("What are the values of a and b after the for loop");
        System.out.println("finishes?");
        Simulator.code("int a = 10;");        
        Simulator.code("int b = 3;");        
        Simulator.code("int t = 0;");        
        Simulator.code("for (int i = 1; i < 4; i++) {");        
        Simulator.code("    t = a;");        
        Simulator.code("    a = i + b;");        
        Simulator.code("    b = t - i;");        
        Simulator.code("}");    
        System.out.println("(A) a = 5 and b = -2");
        System.out.println("(B) a = 6 and b = 7");
        System.out.println("(C) a = 6 and b = 3");
        System.out.println("(D) a = 12 and b = 1");
        System.out.println("(E) a = 5 and b = 8");
             
        Simulator.comment("Answer 10...");  
        // int a = 10;
        // int b = 3;
        // int t = 0;
        // for (int i = 1; i < 4; i++) {
        //     t = a;
        //     a = i + b;
        //     b = t - i;
        // }
        // System.out.println("a = " + a + " and b = " + b);
        System.out.println("E");
    }
}