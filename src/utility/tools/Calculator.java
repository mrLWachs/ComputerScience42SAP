
/** Required package class namespace */
package utility.tools;


/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Calculator 
{

    /**
     * Calculates the factorial (!) on a number using a recursive method.
     * Recursive methods need at minimum ONE BASE CASE (to stop the recursion),
     * but can have more than one. They also need to have at minimum ONE
     * RECURSIVE CASE (but they can have multiple recursive cases). Recursive
     * cases means the method calls itself.
     * 
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter (number)
     */
    public static long factorial(int number) {
        // BASE CASE - stops the recursion (stops the looping effect)
        if (number <= 1) return 1;
        // RECURSIVE CASE - the method calls itself (like a loop)
        return number * factorial(number-1);        
    }

    /**
     * Calculates the power of a base to it's exponent (recursively)
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the base^exponent
     */
    public static double power(int base, int exponent) {
        // Base case(s):
        // =============
        
        // Special base case for negative exponents and a base of zero (we can
        // never divide by zero) - if a base of zero occurs, we need to return
        // "something" we could use "flag" value (a rarely used value) 
        if (exponent < 0 && base == 0) return Double.MIN_VALUE;
        
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        
        // Recursive case(s):
        // ==================
        
        // Special recursive case for negative exponents
        if (exponent < 0) return 1 / power(base, Math.abs(exponent));
        
        // Default recursive case (for positive exponents)
        return base * power(base, exponent-1);
    }
    
}
