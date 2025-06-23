/** Required package class namespace */
package testing.cs42sap;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.Simulator;

 
/**
 * CurriculumUnit.java - class to store data on a A.P. curriculum unit including
 * the unit's title, topics, points, and sub-points of that unit
 *
 * @author Mr. Wachs
 * @since Feb. 2, 2025
 */
public class CurriculumUnit 
{

    private String title;
    private LinkedList<Topic> topics;
    
    
    /**
     * Class constructor, set class properties from parameters
     * 
     * @param lines the lines read from the A.P. curriculum document file for 
     * this specific unit stored in a linked list
     */
    public CurriculumUnit(LinkedList<String> lines) {
        final char MARKER          = ' ';
        final int  TOPIC_START     = 3;
        final int  POINT_START     = 5;
        final int  SUB_POINT_START = 7;        
        title  = lines.get(0);
        topics = new LinkedList<>();
        int currentTopic = -1;
        int currentPoint = -1;        
        for (int i = 1; i < lines.size(); i++) {
            String line  = lines.get(i);
            int    index = line.indexOf(MARKER);
            if (index >= TOPIC_START && index < POINT_START) {
                Topic topic = new Topic(line);
                topics.add(topic);
                currentTopic++;
                currentPoint = -1;
            }
            else if (index >= POINT_START && index < SUB_POINT_START) {
                Point point = new Point(line);
                Topic topic = topics.get(currentTopic);
                topic.points.add(point);
                currentPoint++;
            }
            else if (index >= SUB_POINT_START) {
                SubPoint subPoint = new SubPoint(line);
                Topic   topic    = topics.get(currentTopic);
                Point   point    = topic.points.get(currentPoint);
                point.subPoints.add(subPoint);
            }            
        }        
    }
    
    /**
     * Displays the title of this unit
     */
    public void getTitle() {
        Simulator.unitTitle(title);
    }
    
    /**
     * Displays the unitTopic, the points, and the sub-points of the passed 
     * unit Topic number
     * 
     * @param number the unitTopic number to display
     */
    public void getTopic(int number) {
        Topic topic = topics.get(number - 1);
        Simulator.unitTopic(topic.text);
        topic.showPoints();
    }
    
    /**
     * Displays the unitTopic, the points, and the sub-points of the passed 
     * unit Topic number
     */
    public void getTopics() {
        for (int i = 0; i < topics.size(); i++) {
            Topic topic = topics.get(i);
            Simulator.header(topic.text);
            topic.showPoints();
        }
    }

    /**
     * Internal class storing a unitTopic from this unit and the points (and 
     * sub-points) of that unit Topic
     */
    public class Topic 
    {
        public String text;
        public LinkedList<Point> points;        
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the unitTopic to
         */
        public Topic(String text){
            this.text = text;
            points    = new LinkedList<>();
        }
        
        /**
         * Shows all the points of this unitTopic, and each unitPoint's sub-points
         */
        public void showPoints() {
            for (int i = 0; i < points.size(); i++) {
                Point point = points.get(i);
                String text = point.text;
                format(text, false);
                point.showSubPoints();
            }
        }
    }
    
    /**
     * Internal class storing a unitPoint from this unit and unitTopic and the 
     * sub-points of that unitPoint
     */
    private class Point 
    {
        public String text;
        public LinkedList<SubPoint> subPoints;
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the unitPoint to
         */
        public Point(String text) {
            this.text = text;
            subPoints = new LinkedList<>();
        }

        /**
         * Shows all the sub-points of this unitPoint
         */
        public void showSubPoints() {
            for (int i = 0; i < subPoints.size(); i++) {
                SubPoint subPoint = subPoints.get(i);
                String text = subPoint.text; 
                format(text , true);
            }
        }        
    }
    
    /**
     * Internal class storing a sub-unitPoint from this unit, unitTopic and unitPoint
     */
    private class SubPoint 
    {
        public String text;
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the sub-unitPoint to
         */
        public SubPoint(String text) {
            this.text = text;
        }
    }

    /**
     * Formats the passed string into displayable points (or sub-points)
     * 
     * @param originalLine the text to format
     */
    private void format(String originalLine, boolean isSubPoint) {
        final char SPACE    = ' ';
        final int  LINE_MAX = 80;
        final String ADJUST = "           ";
        final String SPACER = "" + SPACE + SPACE + SPACE;
        String space = SPACER;
        if (isSubPoint) space = space + SPACER;
        int maxLength = LINE_MAX - space.length();
        LinkedList<String> allLines = new LinkedList<>();
        int count = 0;
        String newLine = space;
        for (int i = 0; i < originalLine.length(); i++) {
            char character = originalLine.charAt(i);
            newLine = newLine + character;   
            count++;
            if (count >= maxLength && character == SPACE) {
                if (isEmpty(newLine) == false) allLines.add(newLine);
                newLine = space;
                count = 0;
            }             
        }
        if (isEmpty(newLine) == false) allLines.add(newLine);
        for (int i = 0; i < allLines.size(); i++) {
            String line = allLines.get(i);
            if (i != 0) line = ADJUST + line;
            if (isSubPoint) Simulator.unitSubPoint(line);
            else            Simulator.unitPoint(line);
        }
    }
    
    /**
     * Determines if a line has any characters others than spaces in it
     * 
     * @param line the string to check
     * @return the line is empty (true) or not (false)
     */
    private boolean isEmpty(String line) {
        if (line == null) return true;
        if (line.equals("")) return true;
        boolean empty = true;
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            if (character != ' ') {
                empty = false;
            }
        }
        return empty;
    }

}