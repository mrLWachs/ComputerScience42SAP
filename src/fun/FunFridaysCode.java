/** Required package class namespace */
package fun;

import fun.experiments.APExperiments;
import fun.files.Files;
import fun.searching.Searching;
import fun.sorting.SortPeople;
import fun.virus.Virus;


/**
 * FunFridaysCode - this is some of the "extra" learning we have done in our
 * course for both "Fun Fridays" and "new content Thursdays"
 * 
 * @author YOUR NAME
 * @since Mar 4, 2024
*/
public class FunFridaysCode
{

    /**
     * Default constructor, set class properties
     * 
     * @param shouldRun determines if this test should run (true) or not (false)
     */
    public FunFridaysCode(boolean shouldRun) {
        if (!shouldRun) {
            return;
        }
        new APExperiments(!shouldRun);
        new Files(!shouldRun);
        new Virus(!shouldRun);
        new Searching(!shouldRun);
        new SortPeople(shouldRun);
    }

}