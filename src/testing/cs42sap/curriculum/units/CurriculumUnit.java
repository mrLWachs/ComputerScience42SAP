/** Required package class namespace */
package testing.cs42sap.curriculum.units;

import utility.collections.LinkedList;
import utility.io.Simulator;

 
/**
 * CurriculumUnit.java - description
 *
 * @author Mr. Wachs
 * @since Feb. 2, 2025
 */
public class CurriculumUnit 
{

    private String title;
    private LinkedList<Topics> topics;
    
    
    /**
     * Default constructor, set class properties
     */
    public CurriculumUnit(LinkedList<String> lines) {
        title = lines.get(0);
        topics = new LinkedList<>();
        int currentTopic = -1;
        int currentPoint = -1;        
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            int index = line.indexOf(' ');
            if (index >= 3 && index < 5) {
                Topics topic = new Topics(line);
                topics.add(topic);
                currentTopic++;
                currentPoint = -1;
            }
            else if (index >= 5 && index < 7) {
                Points point = new Points(line);
                Topics topic = topics.get(currentTopic);
                topic.points.add(point);
                currentPoint++;
            }
            else if (index >= 7) {
                SubPoint subPoint = new SubPoint(line);
                Topics topic = topics.get(currentTopic);
                Points point = topic.points.get(currentPoint);
                point.subPoints.add(subPoint);
            }            
        }        
    }
    
    public void getTitle() {
        Simulator.title(title);
    }
    
    public void getTopic(int number) {
        Topics topic = topics.get(number - 1);
        Simulator.header(topic.topic);
        for (int i = 0; i < topic.points.size(); i++) {
            Points point = topic.points.get(i);
            String text = formatPoint(point.point);
            Simulator.text(text);
            for (int j = 0; j < point.subPoints.size(); j++) {
                SubPoint subPoint = point.subPoints.get(j);
                text = formatSubPoint(subPoint.subPoint);
                Simulator.text(text);
            }
        }
    }

    private String formatPoint(String point) {
        final String SPACE = "   ";
        return SPACE + point;
    }

    private String formatSubPoint(String subPoint) {
        final String SPACE = "   ";
        return SPACE + SPACE + subPoint;
    }
    
    private class Topics {
        public String topic;
        public LinkedList<Points> points;
        public Topics(String line) {
            topic  = line;
            points = new LinkedList<>();
        }
    }
    
    private class Points {
        public String point;
        public LinkedList<SubPoint> subPoints;
        public Points(String line) {
            point     = line;
            subPoints = new LinkedList<>();
        }
    }
    
    private class SubPoint {
        public String subPoint;
        public SubPoint(String line) {
            subPoint = line;
        }
    }
            
}