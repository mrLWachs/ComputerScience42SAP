
/** Required package class namespace */
package testing.cs42sap.curriculum.units;

/** Required API imports */
import testing.cs42sap.curriculum.CurriculumContentCS42SAP;
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;

 
/**
 * APUnit03BooleanExpressionsAndIfStatements.java - Algorithms are composed of
 * three building blocks: sequencing, selection, and iteration. This unit
 * focuses on selection, which is represented in a program by using conditional
 * statements. Conditional statements give the program the ability to decide
 * and respond appropriately and are a critical aspect of any nontrivial
 * computer program. In addition to learning the syntax and proper use of
 * conditional statements, students will build on the introduction of Boolean
 * variables by writing Boolean expressions with relational and logical
 * operators. The third building block of all algorithms is iteration, which
 * you will cover in Unit 4. Selection and iteration work together to solve
 * problems
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class APUnit03BooleanExpressionsAndIfStatements 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit03BooleanExpressionsAndIfStatements() {
        if (Simulator.check("AP: Unit 3 (Boolean Expressions And If Statements)")) return; 
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3);
        // AP: Unit 3 (Boolean Expressions And If Statements)
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,1);
        // 3.1 Boolean Expressions
        // (3.1.1) Evaluate Boolean expressions that use relational operators 
        //         in program code
            // (3.1.1.1) Primitive values and reference values can be compared
            //           using relational operators (i.e., == and !=)
            // (3.1.1.2) Arithmetic expression values can be compared using 
            //           relational operators (i.e., <, >, <=, >=)
            // (3.1.1.3) An expression involving relational operators evaluates
            //           to a Boolean value
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("A Boolean (true/false) expression is a code ");
        System.out.println("statement most likely in a control structure ");
        System.out.print("like a conditional statement or loop control ");
        System.out.println("structure that evaluates to true or false to ");
        System.out.print("make decisions and control the flow of the ");
        System.out.println("program. The Boolean expression will require ");
        System.out.print("the use of relational operators like: < , > , ");
        System.out.println("<= , >= , == , and != those being: \"less ");
        System.out.print("than\", \"greater than\", \"less than or equal ");
        System.out.println("to\", \"greater than or equal to\", \"equal ");
        System.out.println("to\", and \"not equal to\".");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,2);
        // 3.2 if Statements and Control Flow
        // (3.2.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.2.1.1) Conditional statements interrupt the sequential 
            //           execution of statements
            // (3.2.1.2) if statements affect the flow of control by executing
            //           different statements based on the value of a Boolean
            //           expression
            // (3.2.1.3) A one-way selection (if statement) is written when
            //           there is a set of statements to execute under a 
            //           certain condition. In this case, the body is executed
            //           only when the Boolean condition is true
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("A \"Conditional Statement\" is also known under ");
        System.out.println("other names like \"branching statement\", \"if ");
        System.out.print("statement\", \"one-way selection statement\", ");
        System.out.println("and \"control structure\". It uses the reserved ");
        System.out.print("keyword \"if\" along with round brackets which ");
        System.out.println("contain the Boolean expression, and curly ");
        System.out.print("brackets to contain the control block of all ");
        System.out.println("code you wish to be controlled by the ");
        System.out.print("conditional statement. Brackets are optional if ");
        System.out.println("the block is only one line, and you may also ");
        System.out.print("move thos lines up to the same line as the ");
        System.out.println("conditional statement. For example:");
        
        // Example of if statements
        int a = 10;
        int b = 10;        
        if (a == a) {
            // "equal"
        }        
                
        Simulator.comment("Example of if statements");
        Simulator.code("int a = 10;");
        Simulator.code("int b = 10;");
        Simulator.code("if (a == a) {");
        Simulator.code("    // \"equal\"");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,3);
        // 3.3 if-else Statements
        // (3.3.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.3.1.1) A two-way selection is written when there are two 
            //           sets of statements— one to be executed when the 
            //           Boolean condition is true, and another set for when 
            //           the Boolean condition is false. In this case, the 
            //           body of the "if" is executed when the Boolean 
            //           condition is true, and the body of the "else" is 
            //           executed when the Boolean condition is false
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The \"else\" statement is paired with an \"if\" ");
        System.out.println("statement to control the flow of the logic so ");
        System.out.print("that the conditional now evaluates to both ");
        System.out.println("true and false. This can be called a \"two ");
        System.out.print("way selection\" (for true/false). An \"else\" ");
        System.out.println("must always follow an \"if\" statement first. ");
        System.out.println("For example:");
        
        // if with "else"       
        double c = 1.45, d = 1.5;        
        if (c < d) {
            // "Less than"
        }
        else {
            // "Greater than"
        }        
        // Shortened lines version
        char e = 'A';
        char f = 'a';        
        if (e != f) e = '!';
        else        e = '=';
        
        Simulator.comment("if with \"else\" ");
        Simulator.code("double c = 1.45, d = 1.5; ");
        Simulator.code("if (c < d) {");
        Simulator.code("    // \"Less than\"");
        Simulator.code("}");
        Simulator.code("else {");
        Simulator.code("    // \"Greater than\"");
        Simulator.code("}");
        Simulator.comment("Shortened lines version");
        Simulator.code("char e = 'A';"); 
        Simulator.code("char f = 'a';"); 
        Simulator.code("if (e != f) e = '!';"); 
        Simulator.code("else        e = '=';"); 
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,4);
        // 3.4 else if Statements
        // (3.4.1) Represent branching logical processes by using conditional 
        //         statements
            // (3.4.1.1) A multi-way selection is written when there are a 
            //           series of conditions with different statements for 
            //           each condition. Multi-way selection is performed 
            //           using if-else-if statements such that exactly one 
            //           section of code is executed based on the first
            //           condition that evaluates to true
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("When making multiple decisions (more than 2), ");
        System.out.println("the \"else if\" statement is added to an ");
        System.out.print("existing \"if\" statement to have multiple ");
        System.out.println("branches of logic for the code to follow. This ");
        System.out.print("is much more efficient than seperate \"if\" ");
        System.out.println("statements. This can also be called \"multi-way ");
        System.out.print("selection\" (or \"if-else-if\"). An \"else\" ");
        System.out.println("statement is also still the final option (but ");
        System.out.println("this is not required). For example:");       
        
        // Showing a "chain" of else if statements
        int g = 0;
        if (g == 1) {
            // The first if is true
        }
        else if (g == 2) {
            // The next if is true
        }
        else if (g == 3) {
            // The next if (in the "chain" of ifs) is true
        }
        else {
            // Nothing above is true, so go to this else
        }
        
        Simulator.comment("Showing a \"chain\" of else if statements");
        Simulator.code("int g = 0;");
        Simulator.code("if (g == 1) {");
        Simulator.code("    // The first if is true");
        Simulator.code("}");
        Simulator.code("else if (g == 2) {");
        Simulator.code("    // The next if is true");
        Simulator.code("}");
        Simulator.code("else if (g == 3) {");
        Simulator.code("    // The next if (in the \"chain\" of ifs) is true");
        Simulator.code("}");
        Simulator.code("else {");
        Simulator.code("    // Nothing above is true, so go to this else");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,5);
        // 3.5 Compound Boolean Expressions
        // (3.5.1) Represent branching logical processes by using nested 
        //         conditional statements
            // (3.5.1.1) Nested if statements consist of if statements within
            //           if statements
        // (3.5.2) Evaluate compound Boolean expressions in program code
            // (3.5.2.1) Logical operators !(not), &&(and), and ||(or) are 
            //           used with Boolean values. This represents the order 
            //           these operators will be evaluated
            // (3.5.2.2) An expression involving logical operators evaluates 
            //           to a Boolean value
            // (3.5.2.3) When the result of a logical expression using && or
            //           || can be determined by evaluating only the first 
            //           Boolean operand, the second is not evaluated. This is
            //           known as short-circuited evaluation
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The process of \"nesting\" means to place one ");
        System.out.println("conditional statement inside the \"block\" of ");
        System.out.print("another conditional statement. The logical ");
        System.out.println("operators: \"and\", \"or\", and \"not\" are ");
        System.out.print("represented with the symbols: \"&&\" (and), ");
        System.out.println("\"||\" (or), and \"!\" (not). The operator AND ");
        System.out.print("is used to combine logical boolean expressions ");
        System.out.println("such that ALL expressions need to be true for ");
        System.out.print("the entire statement to be true. The operator ");
        System.out.println("OR is used to combine logical boolean ");
        System.out.print("expressions such that ANY expression can be ");
        System.out.println("true for the entire statement to be true. The ");
        System.out.print("operator NOT reverses the logic so that true ");
        System.out.println("statements are evaluated as false (and visa ");
        System.out.print("versa). If the statement contains multiple ");
        System.out.println("Boolean expressions and the result of the ");
        System.out.print("evaluation of one expression has already ");
        System.out.println("determined the expressions result, then the ");
        System.out.print("rest of the expressions do not need to be ");
        System.out.println("evaluated - this is known as a \"short-circuited ");
        System.out.println("evaluation\". For example:");   
        
        // Logical operators and "nesting"
        int    age = 17;
        double iq  = 1.0;
        if (age >= 18 && iq > 90) {
            // with "and" ("&&") BOTH have to be true
        }
        else if (age >= 18 || iq > 0) {
            // with "or" ("||") EITHER can be true
        }
        else {
            // Case if neither evaluates
            if (age > 0) {
                // A "nested if statement"
            }
        }
        
        Simulator.comment("Logical operators and \"nesting\"");
        Simulator.code("int    age = 17;");
        Simulator.code("double iq  = 1.0;");
        Simulator.code("if (age >= 18 && iq > 90) {");
        Simulator.code("    // with \"and\" (\"&&\") BOTH have to be true");
        Simulator.code("}");
        Simulator.code("else if (age >= 18 || iq > 0) {");
        Simulator.code("    // with \"or\" (\"||\") EITHER can be true");
        Simulator.code("}");
        Simulator.code("else {");
        Simulator.code("    // Case if neither evaluates");
        Simulator.code("    if (age > 0) {");
        Simulator.code("        // A \"nested if statement\"");
        Simulator.code("    }");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,6);
        // 3.6 Equivalent Boolean Expressions
        // (3.6.1) Compare and contrast equivalent Boolean expressions
            // (3.6.1.1) De Morgan’s Laws can be applied to Boolean expressions
            // (3.6.1.2) Truth tables can be used to prove Boolean identities
            // (3.6.1.3) Equivalent Boolean expressions will evaluate to the 
            //           same value in all cases
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Boolean (true/false) expressions turned into ");
        System.out.println("logical statements used by control structures ");
        System.out.print("like conditional statements are subject to the ");
        System.out.println("laws of mathemtical logic such as \"De Morgan's ");
        System.out.print("Law\" (Google search this if you are curious, ");
        System.out.println("but it applies to mathematical proofs and is ");
        System.out.print("not necessarily applicable to this exam). This ");
        System.out.println("just means that complex statements need to be ");
        System.out.print("evaluated by using mathematical rules (like ");
        System.out.println("\"order of operations\") and logical operators ");
        System.out.print("(like \"and, or, not\") to determine the final ");
        System.out.println("Boolean result. This could determine if a ");
        System.out.print("control structure (like an \"if\" statement) ");
        System.out.println("runs a block of code or not.");
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(3,7);
        // 3.7 Comparing Objects
        // (3.7.1) Compare object references using Boolean expressions in 
        //         program code
            // (3.7.1.1) Two object references are considered aliases when 
            //           they both reference the same object
            // (3.7.1.2) Object reference values can be compared, using == 
            //           and !=, to identify aliases
            // (3.7.1.3) A reference value can be compared with null, using 
            //           == or !=, to determine if the reference actually 
            //           references an object
            // (3.7.1.4) Often classes have their own equals method, which can
            //           be used to determine whether two objects of the class 
            //           are equivalent
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("The use of an advanced data type like an ");
        System.out.println("\"Object\" in code means that comparison ");
        System.out.print("operators (like <, >, ==, !=) that are used ");
        System.out.println("with primitive data type (like \"int, ");
        System.out.print("double, char, etc.\") are not used. Instead, ");
        System.out.println("use the \"built-in\" method \"equals()\" to ");
        System.out.print("determine the equality of two objects. For ");        
        System.out.println("example:");
        
        // Use of the built-in equals method with Objects
        String word1 = "edgy";
        String word2 = "edGy";        
        if (word1.equals(word2)) {
            // "W1=W2"
        }
        else if (word1.equalsIgnoreCase(word2)) {
            // "W1 kind of == W2"
        }
        
        Simulator.comment("Use of the built-in equals method with Objects");
        Simulator.code("String word1 = \"edgy\";");
        Simulator.code("String word2 = \"edGy\";");
        Simulator.code("if (word1.equals(word2)) {");
        Simulator.code("    // \"W1=W2\"");
        Simulator.code("}");
        Simulator.code("else if (word1.equalsIgnoreCase(word2)) {");
        Simulator.code("    // \"W1 kind of == W2\"");
        Simulator.code("}");
        
        ////////////////////////////////////////////////////////////////////////
    }
     
}