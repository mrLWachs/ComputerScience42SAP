
/** Required package class namespace */
package testing;

/** Required API imports */
import testing.cs42sap.CurriculumContentCS42SAP;
import testing.fun.FunDaysCode;
import testing.postsecondary.MorePostSecondaryContent;
import testing.prerequisite.cs20s.ComputerScience20S;
import testing.prerequisite.cs30s.ComputerScience30S;
import testing.prerequisite.cs40s.ComputerScience40S;
import utility.io.Simulator;
import utility.io.System;
import utility.io.Out;


/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs 
 * @since June 2025
 */
public class Tester 
{

    public static final int DO_NOT_RUN    = 0;
    public static final int RUN_SIMULATED = 1;
    public static final int RUN_NORMAL    = 2;
    
    public static final int TEST_ALL                  = 1;
    public static final int TEST_PRE_AND_POST         = 2;
    public static final int TEST_CS42SAP_AND_PRE      = 3;
    public static final int TEST_CS42SAP_AND_POST     = 4;
    public static final int TEST_ONLY_CS42SAP         = 5;
    public static final int TEST_ONLY_PREREQUISITES   = 6;
    public static final int TEST_ONLY_POSTSECONDARY   = 7; 
    public static final int TEST_ONLY_CS20S           = 8;
    public static final int TEST_ONLY_CS30S           = 9;
    public static final int TEST_ONLY_CS40S           = 10;
    public static final int TEST_ONLY_CS42SAP_CURRICULUM = 11;
    public static final int TEST_ONLY_CS42SAP_TESTS   = 12;
    public static final int TEST_ONLY_FUN_DAYS        = 13;
    public static final int TEST_ONLY_MORE_POST       = 14;
     
    public static int state;
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Tester() {
        this(TEST_ALL, RUN_SIMULATED);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param test the type of test to run
     */
    public Tester(int test) {
        this(test, RUN_SIMULATED);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param test the type of test to run
     * @param state the check state of this code module
     */
    public Tester(int test, int state) {
        Tester.state = state;
        System.out = new Out();
        Simulator.initialize();
        if (Simulator.check("Mr. Wachs' Computer Science")) return;        
        if (test == TEST_ALL) {
            preRequisite();
            cs42sAP();
            postSecondary();  
        }
        else if (test == TEST_PRE_AND_POST) {  
            preRequisite();
            postSecondary();
        }
        else if (test == TEST_CS42SAP_AND_PRE) {    
            preRequisite();
            cs42sAP();
        }
        else if (test == TEST_CS42SAP_AND_POST) { 
            cs42sAP(); 
            postSecondary();
        }
        else if (test == TEST_ONLY_CS42SAP_CURRICULUM) { 
            CurriculumContentCS42SAP.initialize();
            CurriculumContentCS42SAP.curriculum();
        }
        else if (test == TEST_ONLY_CS42SAP_TESTS) { 
            CurriculumContentCS42SAP.initialize();            
            CurriculumContentCS42SAP.practiceTests(); 
        }
        else if (test == TEST_ONLY_CS42SAP)       cs42sAP();
        else if (test == TEST_ONLY_PREREQUISITES) preRequisite();
        else if (test == TEST_ONLY_POSTSECONDARY) postSecondary();
        else if (test == TEST_ONLY_CS20S)         new ComputerScience20S();
        else if (test == TEST_ONLY_CS30S)         new ComputerScience30S();
        else if (test == TEST_ONLY_CS40S)         new ComputerScience40S();
        else if (test == TEST_ONLY_FUN_DAYS)      new FunDaysCode(); 
        else if (test == TEST_ONLY_MORE_POST)     new MorePostSecondaryContent();
        Simulator.saveOutput();
    }

    /**
     * The prerequisite Computer Science courses tests
     */
    public void preRequisite() {
        new ComputerScience20S();
        new ComputerScience30S();
        new ComputerScience40S();
    }
    
    /**
     * The post-secondary Computer Science tests
     */
    public void postSecondary() {
        new FunDaysCode();
        new MorePostSecondaryContent();
    }

    /**
     * The Computer Science 42SAP course tests
     */
    public void cs42sAP() {
        CurriculumContentCS42SAP.initialize();
        CurriculumContentCS42SAP.curriculum();
        CurriculumContentCS42SAP.practiceTests();
    }

}
