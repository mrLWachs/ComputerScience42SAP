/** Required package class namespace */
package testing.cs42sap.curriculum;

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
    private LinkedList<Topics> topics;
    
    
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
                Topics topic = new Topics(line);
                topics.add(topic);
                currentTopic++;
                currentPoint = -1;
            }
            else if (index >= POINT_START && index < SUB_POINT_START) {
                Points point = new Points(line);
                Topics topic = topics.get(currentTopic);
                topic.points.add(point);
                currentPoint++;
            }
            else if (index >= SUB_POINT_START) {
                SubPoint subPoint = new SubPoint(line);
                Topics   topic    = topics.get(currentTopic);
                Points   point    = topic.points.get(currentPoint);
                point.subPoints.add(subPoint);
            }            
        }        
    }
    
    /**
     * Displays the title of this unit
     */
    public void getTitle() {
        Simulator.title(title);
    }
    
    /**
     * Displays the topic, the points, and the sub-points of the passed topic
     * number
     * 
     * @param number the topic number to display
     */
    public void getTopic(int number) {
        Topics topic = topics.get(number - 1);
        Simulator.header(topic.text);
        for (int i = 0; i < topic.points.size(); i++) {
            Points point = topic.points.get(i);
            String text  = format(point.text,false);
            Simulator.text(text);
            for (int j = 0; j < point.subPoints.size(); j++) {
                SubPoint subPoint = point.subPoints.get(j);
                text = format(subPoint.text,true);
                Simulator.text(text);
            }
        }
    }

    /**
     * Formats the passed string into a displayable point (or sub-point)
     * 
     * @param text the text to format
     * @return a formatted point (or sub-point)
     */
    private String format(String text, boolean isSubPoint) {
        final String SPACE = "   ";
        if (isSubPoint) return SPACE + SPACE + text;
        else            return SPACE + text;
    }

    /**
     * Internal class storing a topic from this unit and the points (and 
     * sub-points) of that topic
     */
    private class Topics 
    {
        public String text;
        public LinkedList<Points> points;        
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the topic to
         */
        public Topics(String text){
            this.text = text;
            points    = new LinkedList<>();
        }
    }
    
    /**
     * Internal class storing a point from this unit and topic and the 
     * sub-points of that point
     */
    private class Points 
    {
        public String text;
        public LinkedList<SubPoint> subPoints;
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the point to
         */
        public Points(String text) {
            this.text = text;
            subPoints = new LinkedList<>();
        }
    }
    
    /**
     * Internal class storing a sub-point from this unit, topic and point
     */
    private class SubPoint 
    {
        public String text;
        
        /**
         * Class constructor, sets class properties to passed parameter
         * 
         * @param text the text to set the sub-point to
         */
        public SubPoint(String text) {
            this.text = text;
        }
    }
            
}