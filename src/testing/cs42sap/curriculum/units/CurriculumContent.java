/** Required package class namespace */
package testing.cs42sap.curriculum.units;

import utility.collections.LinkedList;
import utility.io.FileHandler;
import utility.io.Simulator;

 
/**
 * CurriculumContent.java - description
 *
 * @author Mr. Wachs
 * @since Feb. 2, 2025
 */
public class CurriculumContent 
{

    private static String CURRICULUM_FILE = "curriculum.txt";
    private static CurriculumUnit[] units;    
    private static final int TOTAL_UNITS = 11;
    
    
    public static void initialize() {
        FileHandler file = new FileHandler();
        String[] lines = file.openArray(CURRICULUM_FILE);
        units = new CurriculumUnit[TOTAL_UNITS];
        for (int i = 1; i < TOTAL_UNITS; i++) {
            units[i] = new CurriculumUnit(getUnitLines(i,lines));
        }  
    }
    
    public static void show() {
        units[1].getTitle();
        units[1].getTopic(1);
        units[1].getTopic(2);
        units[1].getTopic(3);
        units[1].getTopic(4);
        units[1].getTopic(5);
        
        units[2].getTitle();
        units[2].getTopic(1);
        units[2].getTopic(2);
        units[2].getTopic(3);
        units[2].getTopic(4);
        units[2].getTopic(5);
        units[2].getTopic(6);
        units[2].getTopic(7);
        units[2].getTopic(8);
        units[2].getTopic(9);
        
        units[3].getTitle();
        units[3].getTopic(1);
        units[3].getTopic(2);
        units[3].getTopic(3);
        units[3].getTopic(4);
        units[3].getTopic(5);
        units[3].getTopic(6);
        units[3].getTopic(7);
        
        units[4].getTitle();
        units[4].getTopic(1);
        units[4].getTopic(2);
        units[4].getTopic(3);
        units[4].getTopic(4);
        units[4].getTopic(5);
       
        units[5].getTitle();
        units[5].getTopic(1);
        units[5].getTopic(2);
        units[5].getTopic(3);
        units[5].getTopic(4);
        units[5].getTopic(5);
        units[5].getTopic(6);
        units[5].getTopic(7);
        units[5].getTopic(8);
        units[5].getTopic(9);
        units[5].getTopic(10);
                
        units[6].getTitle();
        units[6].getTopic(1);
        units[6].getTopic(2);
        units[6].getTopic(3);
        units[6].getTopic(4);
       
        units[7].getTitle();
        units[7].getTopic(1);
        units[7].getTopic(2);
        units[7].getTopic(3);
        units[7].getTopic(4);
        units[7].getTopic(5);
        units[7].getTopic(6);
        units[7].getTopic(7);
        
        units[8].getTitle();
        units[8].getTopic(1);
        units[8].getTopic(2);
        
        units[9].getTitle();
        units[9].getTopic(1);
        units[9].getTopic(2);
        units[9].getTopic(3);
        units[9].getTopic(4);
        units[9].getTopic(5);
        units[9].getTopic(6);
        units[9].getTopic(7);
       
        units[10].getTitle();
        units[10].getTopic(1);
        units[10].getTopic(2);
        
    }

    private static LinkedList<String> getUnitLines(int unit, String[] lines) {
        LinkedList<String> unitLines = new LinkedList<>();
        boolean reading = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];            
            if (line != null) {
                String unitText   = line.substring(0, 4);
                if (unitText.equals("Unit")) {
                    String numberText = line.substring(5, 7);
                    int foundUnit = Integer.parseInt(numberText.trim());
                    if (foundUnit == unit) reading = true; 
                    else                   reading = false;         
                }                            
            }
            if (reading) unitLines.add(line);
        }
        return unitLines;
    }

    public static void showUnit(int unit) {
        units[unit].getTitle();        
    }

    public static void showUnit(int unit, int topic) {
        units[unit].getTopic(topic);
    }
    
}