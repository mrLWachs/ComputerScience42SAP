/** Required package class namespace */
package testing.cs42sap;
 
/** Required API imports */
import utility.io.Simulator;
import utility.io.System;


/**
 * APUnit4DataCollections.java - description
 *
 * @author YOUR NAME
 * @since Jun 23, 2025, 2:27:13 p.m.
 */
public class APUnit4DataCollections 
{

    /**
     * Default constructor, set class properties
     */
    public APUnit4DataCollections() {
        final String TITLE = "AP curriculum - Unit 4: Data Collections";
        if (Simulator.check(TITLE)) return; 
        
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4);
        // AP: Unit 1 (Primitive Types)
        ////////////////////////////////////////////////////////////////////////
                
        ////////////////////////////////////////////////////////////////////////
        CurriculumContentCS42SAP.showUnit(4,1);
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
        
        ////////////////////////////////////////////////////////////////////////
    }
    
}