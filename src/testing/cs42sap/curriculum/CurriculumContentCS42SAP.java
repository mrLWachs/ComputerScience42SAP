
/** Required package class namespace */
package testing.cs42sap.curriculum;

/** Required API imports */
import testing.Tester;
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

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public CurriculumContentCS42SAP(int state) {
        if (state == Tester.DO_NOT_RUN) {
            Simulator.note("Computer Science 42SAP curriculum content not running");
            return;
        }
        Simulator.title("Computer Science 42SAP curriculum content");         
        new Part1(state);
        new Part2(state);
        new Part3(state);
        new Part4(state);
    }
    
    private static String CURRICULUM_FILE = "curriculum.txt";
    private static CurriculumUnit[] units;    
    private static final int TOTAL_UNITS = 11;
    
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
     * Shows all the topic points, and sub-points fo the passed unit and topic
     * number passed
     * 
     * @param unit the unit number to show
     * @param topic the topic number to show
     */
    public static void showUnit(int unit, int topic) {
        units[unit].getTopic(topic);
    }
    
}