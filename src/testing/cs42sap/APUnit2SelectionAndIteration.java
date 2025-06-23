/** Required package class namespace */
package testing.cs42sap;
 
/** Required API imports */
import utility.io.Simulator;
import utility.io.System;


/**
 * APUnit2SelectionAndIteration.java - description
 *
 * @author YOUR NAME
 * @since Jun 23, 2025, 2:26:13 p.m.
 */
public class APUnit2SelectionAndIteration 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit2SelectionAndIteration() {
        final int UNIT = 2;
        final String TITLE = "AP curriculum - Unit 2: Selection and Iteration ";
        if (Simulator.check(TITLE)) return; 
        
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT);
        // AP: Unit 1 (Primitive Types)
        ////////////////////////////////////////////////////////////////////////
                
        ////////////////////////////////////////////////////////////////////////
        ComputerScience42SAP.showUnit(UNIT,1);
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
        
//        Simulator.comment("comment here");
//        Simulator.code("code here");
//        System.out.println("standard output here");

        ComputerScience42SAP.showUnit(UNIT,2);
        ComputerScience42SAP.showUnit(UNIT,3);
        ComputerScience42SAP.showUnit(UNIT,4);
        ComputerScience42SAP.showUnit(UNIT,5);
        ComputerScience42SAP.showUnit(UNIT,6);
        ComputerScience42SAP.showUnit(UNIT,7);
        ComputerScience42SAP.showUnit(UNIT,8);
        ComputerScience42SAP.showUnit(UNIT,9);
        ComputerScience42SAP.showUnit(UNIT,10);
        ComputerScience42SAP.showUnit(UNIT,11);
        ComputerScience42SAP.showUnit(UNIT,12);
        
        ////////////////////////////////////////////////////////////////////////
    }
    
}