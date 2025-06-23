/** Required package class namespace */
package testing.cs42sap;
 
/** Required API imports */
import utility.io.Simulator;
import utility.io.System;

/**
 * APUnit1UsingObjectsAndMethods.java - description
 *
 * @author Mr. Wachs
 * @since June 2025
 */
public class APUnit1UsingObjectsAndMethods 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit1UsingObjectsAndMethods() {
        final int UNIT = 1;
        final String TITLE = "AP curriculum - Unit 1: Using Objects and Methods";
        if (Simulator.check(TITLE)) return; 
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(UNIT);
        // AP: Unit 1 (Primitive Types)
        ////////////////////////////////////////////////////////////////////////
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(UNIT,1);
        // 1.1 Why Programming? Why Java? 
        // (1.1.1) Call System class methods to generate output to the console
            // (1.1.1.1) System.out.print and System.out.println display 
             //           information on the computer monitor 
            // (1.1.1.2) System.out.println moves the cursor to a new line after 
            //           the information has been displayed, while 
            //           System.out.print does not        
        // (1.1.2) Create string literals
            // (1.1.2.1) A string literal is enclosed in double quotes        
        ////////////////////////////////////////////////////////////////////////
        
        Simulator.comment("comment here");
        Simulator.code("code here");
        System.out.println("standard output here");
        
        
        CurriculumContentCS42SAP.showUnit(UNIT,2);
        CurriculumContentCS42SAP.showUnit(UNIT,3);
        CurriculumContentCS42SAP.showUnit(UNIT,4);
        CurriculumContentCS42SAP.showUnit(UNIT,5);
        CurriculumContentCS42SAP.showUnit(UNIT,6);
        CurriculumContentCS42SAP.showUnit(UNIT,7);
        CurriculumContentCS42SAP.showUnit(UNIT,8);
        CurriculumContentCS42SAP.showUnit(UNIT,9);
        CurriculumContentCS42SAP.showUnit(UNIT,10);
        CurriculumContentCS42SAP.showUnit(UNIT,11);
        CurriculumContentCS42SAP.showUnit(UNIT,12);
        CurriculumContentCS42SAP.showUnit(UNIT,13);
        CurriculumContentCS42SAP.showUnit(UNIT,14);
        CurriculumContentCS42SAP.showUnit(UNIT,15);        
        
        
        ////////////////////////////////////////////////////////////////////////
    }
    
}