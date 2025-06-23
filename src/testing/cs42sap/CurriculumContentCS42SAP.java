
/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.FileHandler;
import utility.io.Simulator;

 
/**
 * CurriculumContentCS42SAP.java - the curriculum content from the advanced
 * placement (AP) Computer Science curriculum.
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class CurriculumContentCS42SAP 
{

    private static String CURRICULUM_FILE = "curriculum.txt";
    private static CurriculumUnit[] units;    
    private static final int TOTAL_UNITS = 5;
    
    
    /**
     * Initializes the curriculum content for display by reading the A.P.
     * curriculum from the data file
     */
    public static void initialize() {
        FileHandler file = new FileHandler();
        String[] lines = file.openArray(CURRICULUM_FILE);
        units = new CurriculumUnit[TOTAL_UNITS];
        for (int i = 1; i < TOTAL_UNITS; i++) {
            units[i] = new CurriculumUnit(getUnitLines(i,lines));
        }  
    }
    
    /**
     * The curriculum content of the CS42SAP course
     */
    public static void curriculum() {
        if (Simulator.check("Curriculum")) return;          
        new APUnit1UsingObjectsAndMethods();
        new APUnit2SelectionAndIteration();
        new APUnit3ClassCreation();
        new APUnit4DataCollections();
    }
    
    /**
     * These are practice test to practice the types of multiple choice 
     * questions on the A.P. Computer Science exam
     */
    public static void practiceTests() {
        if (Simulator.check("Practice Tests")) return;          
        new PracticeTest1(); 
        new PracticeTest2(); 
        new PracticeTest3(); 
        new PracticeTest4();   
    }
        
    /**
     * Reads the array of all lines read from the curriculum data file to 
     * parse out the lines that are for the passed specific unit
     * 
     * @param unit the unit to parse out of all the lines
     * @param lines all the lines read from the A.P. curriculum data file
     * @return the specific lines from the A.P. curriculum for this unit
     */
    private static LinkedList<String> getUnitLines(int unit, String[] lines) {
        final String MARKER    = "Unit";
        final int START_UNIT   = 0;
        final int END_UNIT     = 4;
        final int START_NUMBER = 5;
        final int END_NUMBER   = 7;        
        LinkedList<String> unitLines = new LinkedList<>();
        boolean reading = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i]; 
            if (line != null) {
                String unitText = line.substring(START_UNIT, END_UNIT);
                if (unitText.equals(MARKER)) {
                    String numberText = line.substring(START_NUMBER, END_NUMBER);
                    int foundUnit = Integer.parseInt(numberText.trim());
                    if (foundUnit == unit) reading = true; 
                    else                   reading = false;         
                }                            
            }
            if (reading) unitLines.add(line);
        }
        return unitLines;
    }

    /**
     * Shows the passed unit title
     * 
     * @param unit the unit number to show
     */
    public static void showUnit(int unit) {
        units[unit].getTitle();        
    }

    /**
     * Shows all the unitTopic points, and sub-points fo the passed unit and unitTopic
 number passed
     * 
     * @param unit the unit number to show
     * @param topic the unitTopic number to show
     */
    public static void showUnit(int unit, int topic) {
        units[unit].getTopic(topic);
    }

}