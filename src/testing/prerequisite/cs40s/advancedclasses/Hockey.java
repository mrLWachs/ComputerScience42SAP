/** Required package class namespace */
package testing.prerequisite.cs40s.advancedclasses;
 
/**
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 *
 * @author Mr. Wachs
 * @since May 9, 2025, 10:05:59 a.m.
 */
public interface Hockey extends Sports
{
    void score(String name);
    void endOfPeriod(int period);
}
