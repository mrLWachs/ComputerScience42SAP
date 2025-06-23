/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import utility.io.Simulator;
import utility.io.System;


/**
 * PracticeTest2 - a set of practice test questions and solutions for the 
 * A.P. Computer Science exam
 * 
 * @author Mr. Wachs
 * @since Mar 5, 2024
*/
public class PracticeTest2
{

    /**
     * Default constructor, set class properties
     */
    public PracticeTest2() {
        if (Simulator.check("AP Practice Test 2")) return;
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
        System.out.println("Consider the following class definition");
        Simulator.code("public class Example");        
        Simulator.code("{");        
        Simulator.code("     private int x;");        
        Simulator.code("     // constructor not shown");        
        Simulator.code("}");        
        System.out.println("Which of the following is a correct header for a");
        System.out.println("method that would return the value of the private");
        System.out.println("instance variable x so that it can be used in a");
        System.out.println("class other than Example?");
        System.out.println("(A) private int getX()");
        System.out.println("(B) private void getX()");
        System.out.println("(C) public int getX()");
        System.out.println("(D) public void getX()");
        System.out.println("(E) public void getX(int x)");
        Simulator.comment("Answer 1...");     
        System.out.println("C");
    }
    
    /**
     * A practice test question
     */
    private void question2() {
        Simulator.comment("Question 2..."); 
        System.out.println("Consider the following class definitions");
        Simulator.code("public class Thing1 {");
        Simulator.code("     public void calc(int n) {");
        Simulator.code("          n *= 3;");
        Simulator.code("          System.out.print(n);");
        Simulator.code("     }");
        Simulator.code("}");
        Simulator.code("public class Thing2 extends Thing1 {");
        Simulator.code("     public void calc(int n) {");
        Simulator.code("          n += 2;");
        Simulator.code("          super.calc(n);");
        Simulator.code("          System.out.print(n);");
        Simulator.code("     }");
        Simulator.code("}"); 
        System.out.println("The following code seqment appears in a class");
        System.out.println("other than Thing1 or Thing2");
        Simulator.code("Thing1 t = new Thing2();");
        Simulator.code("t.calc(2);");
        System.out.println("What is printed as a result of executing the");
        System.out.println("code segment?");        
        System.out.println("(A) 4");
        System.out.println("(B) 6");
        System.out.println("(C) 68");
        System.out.println("(D) 124");
        System.out.println("(E) 1212");
             
        Simulator.comment("Answer 2...");  
        System.out.println("D");
        // public class Thing1 {
        //     public void calc(int n) {
        //         n *= 3;
        //         java.lang.System.out.print(n);
        //     }
        // }
        // public class Thing2 extends Thing1 {
        //     public void calc(int n) {
        //         n += 2;
        //         super.calc(n);
        //         java.lang.System.out.print(n);
        //     }
        // }
        // Thing1 t = new Thing2();
        // t.calc(2);
    }
        
    /**
     * A practice test question
     */
    private void question3() {
        Simulator.comment("Question 3...");        
        System.out.println("Consider the following class definitions.");
        Simulator.code("public class Student {");
        Simulator.code("    public String getFood() {");
        Simulator.code("        return \"Pizza\";");
        Simulator.code("    }");
        Simulator.code("    public String getInfo() {");
        Simulator.code("        return \"Studying\";");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("public class GradStudent extends Student {");
        Simulator.code("    public String getFood() {");
        Simulator.code("        return \"Taco\";");
        Simulator.code("    }");
        Simulator.code("    public String getInfo() {");
        Simulator.code("        super.getInfo();");
        Simulator.code("        return \"Eating\";");
        Simulator.code("    }");
        Simulator.code("}");
        System.out.println("What is printed when the following code is");
        System.out.println("executed?");
        Simulator.code("Student s = new GradStudent();");
        Simulator.code("System.out.println(s.getInfo());");        
        System.out.println("(A) Pizza");
        System.out.println("(B) Taco");
        System.out.println("(C) Studying");
        System.out.println("(D) Eating");
        System.out.println("(E) Studying");
        System.out.println("    Eating");             
        Simulator.comment("Answer 3...");  
        System.out.println("D");
        // public class Student {
        //     public String getFood() {
        //         return "Pizza";
        //     }    
        //     public String getInfo() {
        //         return "Studying";
        //     }
        // }
        // public class GradStudent extends Student {
        //     public String getFood() {
        //         return "Taco";
        //    }    
        //     public String getInfo() {
        //         super.getInfo();
        //         return "Eating";
        //     }
        // }
        // Student s = new GradStudent();
        // System.out.println(s.getInfo());
    }
       
    /**
     * A practice test question
     */ 
    private void question4() {
        Simulator.comment("Question 4...");        
        System.out.println("Given the following class declarations:");
        Simulator.code("public class Car {");
        Simulator.code("    private String make;");
        Simulator.code("    public Car(String theMake) {");
        Simulator.code("        make = theMake;");
        Simulator.code("    }");
        Simulator.code("    public String getMake() {");
        Simulator.code("        return make;");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("public class ElectricCar extends Car {");
        Simulator.code("    public ElectricCar() {");
        Simulator.code("        super(\"Ford\");");
        Simulator.code("    }");
        Simulator.code("    public ElectricCar(String theMake) {");
        Simulator.code("        super(theMake);");
        Simulator.code("    } ");
        Simulator.code("}");
        System.out.println("Which of the following will cause a compile");
        System.out.println("time error?");
        System.out.println("(A) Car myCar = new Car();");
        System.out.println("(B) Car myCar1 = new ElectricCar();");
        System.out.println("(C) ElectricCar myCar2 = new ElectricCar(\"Ford\");");
        System.out.println("(D) Car myCar3 = new Car(\"Ford\");");
        System.out.println("(E) Car myCar4 = new ElectricCar(\"Ford\");");             
        Simulator.comment("Answer 4..."); 
        // public class Car {    
        //     private String make;    
        //     public Car(String theMake) {
        //         make = theMake;
        //     }
        //     public String getMake() {
        //         return make;
        //     }
        // }
        // public class ElectricCar extends Car {
        //     public ElectricCar() {
        //         super("Ford");
        //     }
        //     public ElectricCar(String theMake) {
        //         super(theMake);
        //     }    
        // }
        // //Car myCar = new Car();
        // Car myCar1 = new ElectricCar();
        // ElectricCar myCar2 = new ElectricCar("Ford");
        // Car myCar3 = new Car("Ford");
        // Car myCar4 = new ElectricCar("Ford");
        System.out.println("A");
    }
    
    /**
     * A practice test question
     */
    private void question5() {
        Simulator.comment("Question 5...");        
        System.out.println("Given the following declarations.");
        Simulator.code("public class Vehicle {");
        Simulator.code("    public void test(Car x, SportsCar y) { }");
        Simulator.code("}");
        Simulator.code("public class Car extends Vehicle {");
        Simulator.code("}");
        Simulator.code("public class SportsCar extends Car {");
        Simulator.code("}");
        System.out.println("Also consider the following code that appears");
        System.out.println("in a different class.");
        Simulator.code("Vehicle v = new Vehicle();");
        Simulator.code("Car c = new Car();");
        Simulator.code("SportsCar sporty = new SportsCar();");
        System.out.println("Which of the following is a correct call to test ?");
        System.out.println("(A) v.test(sporty, v);");
        System.out.println("(B) sporty.test(c, c);");
        System.out.println("(C) v.test(sporty, c);");
        System.out.println("(D) sporty.test(sporty, v);");
        System.out.println("(E) c.test(sporty, sporty);");
             
        Simulator.comment("Answer 5...");  
        // public class Vehicle {    
        //     public void test(Car x, SportsCar y) { }
        // }
        // public class Car extends Vehicle {
        // }
        // public class SportsCar extends Car {
        // }
        // Vehicle v = new Vehicle();
        // Car c = new Car();
        // SportsCar sporty = new SportsCar();
        // v.test(sporty, v);
        // sporty.test(c, c);        
        // v.test(sporty, c);
        // sporty.test(sporty, v);
        // c.test(sporty, sporty);
        System.out.println("E");
    }
    
    /**
     * A practice test question
     */
    private void question6() {
        Simulator.comment("Question 6...");        
        System.out.println("Class C extends class B, which extends class A. ");
        System.out.println("Also, all of the three classes implement a public");
        System.out.println("method test(). How can a method in an object of");
        System.out.println("class C invoke the test() method defined in class");
        System.out.println("A (without creating a new instance of class A)?");
        System.out.println("(A) test();");
        System.out.println("(B) super.super.test();");
        System.out.println("(C) super.test();");
        System.out.println("(D) this.test();");
        System.out.println("(E) There is no way to call a method in a ");
        System.out.println("    grandparent class from a grandchild class");
        Simulator.comment("Answer 6...");  
        // public class A {
        //     public void test() {
        //         System.out.println("A");
        //     }
        // }
        // public class B extends A {
        //     public void test() {
        //         System.out.println("B");
        //     }
        // }
        // public class C extends B {
        //     public void test() {
        //         java.lang.System.out.println("C");
        //     }
        // }
        // C c = new C();
        // c.test();
        System.out.println("E");
    }
       
    /**
     * A practice test question
     */ 
    private void question7() {
        Simulator.comment("Question 7...");        
        System.out.println("Given the following class declarations. Assume");
        System.out.println("that Parent p = new Child(); appears in a client");
        System.out.println("program. What is the result of the call p.m1();");
        Simulator.code("public class Parent {");
        Simulator.code("    public void m1() {");
        Simulator.code("        System.out.print(\"pm1\");");
        Simulator.code("        m2();");
        Simulator.code("    }");
        Simulator.code("    public void m2() {");
        Simulator.code("        System.out.print(\"pm2\");");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("public class Child extends Parent {");
        Simulator.code("    public void m1() {");
        Simulator.code("        super.m1();");
        Simulator.code("        System.out.print(\"cm1\");");
        Simulator.code("    }");
        Simulator.code("    public void m2() {");
        Simulator.code("        super.m2();");
        Simulator.code("        System.out.print(\"cm2\");");
        Simulator.code("    }");
        Simulator.code("}");
        System.out.println("(A) pm1pm2cm2cm1");
        System.out.println("(B) pm1pm2");
        System.out.println("(C) pm1pm2cm1cm2");
        System.out.println("(D) pm1cm1");
        System.out.println("(E) pm1");
             
        Simulator.comment("Answer 7...");  
        // public class Parent {
        //     public void m1() {
        //         System.out.print("pm1");
        //         m2();
        //     }
        //     public void m2() {
        //         System.out.print("pm2");
        //     }
        // }
        // public class Child extends Parent {
        //     public void m1() {
        //         super.m1();
        //         System.out.print("cm1");
        //     }
        //     public void m2() {
        //         super.m2();
        //         System.out.print("cm2");
        //     }
        // }
         Parent p = new Child();
         p.m1();
//        System.out.println("A");
    }
    
    
    public class Parent {

        public void m1() {
            System.out.print("pm1");
            m2();
        }

        public void m2() {
            System.out.print("pm2");
        }
    }

    public class Child extends Parent {

        public void m1() {
            super.m1();
            System.out.print("cm1");
        }

        public void m2() {
            super.m2();
            System.out.print("cm2");
        }
    }
    
    
    /**
     * A practice test question
     */
    private void question8() {
        Simulator.comment("Question 8...");        
        System.out.println("Given the following class declarations.");
        Simulator.code("public class Animal {");
        Simulator.code("    public void eat() {");
        Simulator.code("        System.out.println(\"AE\");");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("public class Bear extends Animal {");
        Simulator.code("    public void growl() {");
        Simulator.code("        System.out.println(\"BG\");");
        Simulator.code("    }");
        Simulator.code("}");
        System.out.println("Assume the following declaration is in a ");
        System.out.println("different class.");
        Simulator.code("Animal b = new Bear();");
        System.out.println("Which of the following will compile without error?");
        System.out.println("I.   b.eat();");
        System.out.println("II.  b.growl();");
        System.out.println("III. ((Bear)b).growl();");
        System.out.println("(A) I only");
        System.out.println("(B) II only");
        System.out.println("(C) III only");
        System.out.println("(D) I and III only");
        System.out.println("(E) I, II, and III");
             
        Simulator.comment("Answer 8...");  
        // public class Animal {
        //     public void eat() {
        //         System.out.println("AE");
        //     }
        // }
        // public class Bear extends Animal {
        //     public void growl() {
        //         System.out.println("BG");
        //     }
        // }
        // Animal b = new Bear();
        // b.eat();
        // b.growl();
        // ((Bear)b).growl();
        System.out.println("B");
    }
    
    /**
     * A practice test question
     */
    private void question9() {
        Simulator.comment("Question 9...");        
        System.out.println("Consider the following partial class definitions.");
        Simulator.code("public class C1 {");
        Simulator.code("    private int num;");
        Simulator.code("    private String name;");
        Simulator.code("    public C1(int theNum) {");
        Simulator.code("        num = theNum");
        Simulator.code("    } ");
        Simulator.code("    public C1(String theName) {");
        Simulator.code("        name = theName;");
        Simulator.code("    }");
        Simulator.code("}");
        Simulator.code("public class C2 extends C1 {");
        Simulator.code("    // methods not shown");
        Simulator.code("}");
        System.out.println("Which of the following constructors are valid for");
        System.out.println("C2?");
        System.out.println("I. public C2() { }");
        System.out.println("II. public C2(int quan) { super(quan); }");
        System.out.println("III. public C2(String label) { super(label); }");        
        System.out.println("(A) All three are valid");
        System.out.println("(B) II only");
        System.out.println("(C) III only");
        System.out.println("(D) II and III");
        System.out.println("(E) None are valid");             
        Simulator.comment("Answer 9...");  
        // public class C1 {    
        //     private int num;
        //     private String name;    
        //     public C1(int theNum) {
        //         num = theNum;
        //     }    
        //     public C1(String theName) {
        //         name = theName;
        //     }    
        // }
        // public class C2 extends C1 {    
        //     public C2() {
        // 
        //     }    
        //     public C2(int quan) {
        //         super(quan);
        //     }    
        //     public C2(String label) {
        //         super(label);
        //     }    
        // }
        System.out.println("D");
    }
       
    /**
     * A practice test question
     */ 
    private void question10() {
        Simulator.comment("Question 10...");        
        System.out.println("Given the following class definition. What are ");
        System.out.println("the values of x, y, and z just before method2");
        System.out.println("returns?");
        Simulator.code("public class Class1 {");
        Simulator.code("    public int method1(int a, int b) {");
        Simulator.code("        int temp = a;");
        Simulator.code("        a = b;");
        Simulator.code("        b = temp;");
        Simulator.code("        return b;");
        Simulator.code("    }  ");
        Simulator.code("    public void method2() {");
        Simulator.code("        int x = 3;");
        Simulator.code("        int y = 5;");
        Simulator.code("        int z = method1(x, y);");
        Simulator.code("    }");
        Simulator.code("}");        
        System.out.println("(A) x=3,y=3,z=3");
        System.out.println("(B) x=3,y=5,z=3");
        System.out.println("(C) x=5,y=3,z=5");
        System.out.println("(D) x=5,y=3,z=3");
        System.out.println("(E) x=3,y=5,z=5");
        Simulator.comment("Answer 10...");  
        // public class Class1 {
        //     public int method1(int a, int b) {
        //         int temp = a;
        //         a = b;
        //         b = temp;
        //         return b;
        //     }    
        //     public void method2() {
        //         int x = 3;
        //         int y = 5;
        //         int z = method1(x, y);
        //     }
        // }
        System.out.println("B");
    }
    
}