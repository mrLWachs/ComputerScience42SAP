
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.FileHandler;
import utility.io.Simulator;

 
/**
 * WebPageGenerator.java - class to generate a webpage (with CSS formatting) 
 * from text inputs
 *
 * @author Mr. Wachs
 * @since Feb 20, 2024, 2:37:58 p.m.
 */
public class WebPage 
{

    private static final String DEFAULT_BACKGROUND_COLOR = "white";
    private static final String DEFAULT_FONT_FAMILY      = "Consolas";
    private static final String DEFAULT_FONT_SIZE        = "16pt";
    private static final String DEFAULT_FONT_STYLE       = "DEFAULT_FONT_STYLE";
    private static final String DEFAULT_FONT_WEIGHT      = "normal";    
    private static final String DEFAULT_FONT_COLOR       = "black";
        
    private static final String H1_FONT_COLOR          = "green";
    private static final String H2_FONT_COLOR          = "blue";
    private static final String H3_FONT_COLOR          = "purple";    
    private static final String H3_TEXT_FONT_COLOR     = "fuchsia";    
    
    private static final String PRE_FONT_COLOR         = "blue";
    private static final String PRE_COMMENT_FONT_COLOR = "gray";
        
    private static final String H1_FONT_SIZE          = "18pt"; 
    private static final String H2_FONT_SIZE          = "17pt"; 
    private static final String H3_FONT_SIZE          = "14pt"; 
    private static final String H3_TEXT_FONT_SIZE     = "10pt"; 
    
    private static final String PRE_FONT_SIZE         = DEFAULT_FONT_SIZE;
    private static final String PRE_COMMENT_FONT_SIZE = DEFAULT_FONT_SIZE;
        
    private static final String H1_FONT_FAMILY          = "Lucida Sans Typewriter"; 
    private static final String H2_FONT_FAMILY          = "Courier New"; 
    private static final String H3_FONT_FAMILY          = "Consolas"; 
    private static final String H3_TEXT_FONT_FAMILY     = "Consolas"; 
    
    private static final String PRE_FONT_FAMILY         = "Courier New"; 
    private static final String PRE_COMMENT_FONT_FAMILY = "Courier New"; 
        
    private static final String H1_FONT_STYLE          = DEFAULT_FONT_STYLE;
    private static final String H2_FONT_STYLE          = "italic";
    private static final String H3_FONT_STYLE          = "oblique";
    private static final String H3_TEXT_FONT_STYLE     = "normal";
    
    private static final String PRE_FONT_STYLE         = DEFAULT_FONT_STYLE;
    private static final String PRE_COMMENT_FONT_STYLE = DEFAULT_FONT_STYLE;
    
    private static final String H1_FONT_WEIGHT          = "bold"; 
    private static final String H2_FONT_WEIGHT          = "600"; 
    private static final String H3_FONT_WEIGHT          = "normal"; 
    private static final String H3_TEXT_FONT_WEIGHT     = "lighter"; 
    
    private static final String PRE_FONT_WEIGHT         = "lighter"; 
    private static final String PRE_COMMENT_FONT_WEIGHT = "lighter"; 
    
    private static final String NEW_LINE = "\n";
    private static final String SPACE    = "&nbsp;";
    
        
    private static final String BODY_STYLE = 
            "body {" + NEW_LINE
                + "   background  : " + DEFAULT_BACKGROUND_COLOR + ";" + NEW_LINE
                + "   font-family : " + DEFAULT_FONT_FAMILY      + ";" + NEW_LINE
                + "   font-size   : " + DEFAULT_FONT_SIZE        + ";" + NEW_LINE
                + "   font-style  : " + DEFAULT_FONT_STYLE       + ";" + NEW_LINE
                + "   font-weight : " + DEFAULT_FONT_WEIGHT      + ";" + NEW_LINE
                + "   color       : " + DEFAULT_FONT_COLOR       + ";" + NEW_LINE
            + "}";
    
    private static final String H1_STYLE = 
            "h1 {" + NEW_LINE
                + "   font-family : " + H1_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + H1_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + H1_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + H1_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + H1_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    
    private static final String H2_STYLE = 
            "h2 {" + NEW_LINE
                + "   font-family : " + H2_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + H2_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + H2_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + H2_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + H2_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    
    private static final String H3_STYLE = 
            "h3 {" + NEW_LINE
                + "   font-family : " + H3_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + H3_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + H3_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + H3_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + H3_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    
    private static final String H3_TEXT_STYLE = 
            "h3.text {" + NEW_LINE
                + "   font-family : " + H3_TEXT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + H3_TEXT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + H3_TEXT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + H3_TEXT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + H3_TEXT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    
    private static final String PRE_STYLE =
            "pre {" + NEW_LINE
                + "   font-family : " + PRE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + PRE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + PRE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + PRE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + PRE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    
    private static final String PRE_COMMENT_STYLE =
            "pre.comment {" + NEW_LINE
                + "   font-family : " + PRE_COMMENT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + PRE_COMMENT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + PRE_COMMENT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + PRE_COMMENT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + PRE_COMMENT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
                
    private static final String STYLE = 
            "<style>"      + NEW_LINE + 
            BODY_STYLE     + NEW_LINE + 
            H1_STYLE       + NEW_LINE + 
            H2_STYLE       + NEW_LINE + 
            H3_STYLE       + NEW_LINE + 
            H3_TEXT_STYLE  + NEW_LINE +
            PRE_STYLE      + NEW_LINE + 
            PRE_COMMENT_STYLE + NEW_LINE + 
            "</style>";

    private static final String OPEN = 
            "<html>"  + NEW_LINE + 
            "<head>"  + NEW_LINE +
            STYLE     + NEW_LINE + 
            "</head>" + NEW_LINE + 
            "<body>"  + NEW_LINE;
    
    private static final String CLOSE             = "</body></html>";
    private static final String BREAK             = "</br />";
    private static final String H1_OPEN           = "<h1>";
    private static final String H1_CLOSE          = "</h1>";
    private static final String H2_OPEN           = "<h2>";
    private static final String H2_CLOSE          = "</h2>";
    private static final String H3_OPEN           = "<h3>";
    private static final String H3_TEXT_OPEN      = "<h3 class=\"text\">";    
    private static final String H3_CLOSE          = "</h3>";
    private static final String PRE_OPEN          = "<pre>";
    private static final String PRE_CLOSE         = "</pre>";
    private static final String PRE_COMMENT_OPEN  = "<pre class=\"comment\">";
    
    private static String filename;
    private static LinkedList<String> lines;
    
    private static final int TYPE_TEXT           = 0;
    private static final int TYPE_H1             = 1;
    private static final int TYPE_H2             = 2;
    private static final int TYPE_H3             = 3;
    private static final int TYPE_ADD_TEXT       = 4;
    private static final int TYPE_ADD_SUB_TEXT   = 5;
    private static final int TYPE_PRE            = 6;
    private static final int TYPE_PRE_COMMENT    = 7;    
    private static final int TYPE_UNIT_TITLE     = 8;
    private static final int TYPE_UNIT_TOPIC     = 9;
    private static final int TYPE_UNIT_POINT     = 10;
    private static final int TYPE_UNIT_SUB_POINT = 11;
    private static final int TYPE_EXAMPLE        = 12;
    private static final int TYPE_DIALOG         = 13;
    private static final int TYPE_CODE           = 14;
    private static final int TYPE_COMMENT        = 15;
    private static final int TYPE_SUB_TEXT       = 16;
    private static final int TYPE_PLAIN_TEXT     = 17;
    private static final int TYPE_HEADER_SPACED  = 18;
    private static final int TYPE_NOTE           = 19;
    private static final int TYPE_HEADER         = 20;
    private static final int TYPE_TITLE          = 21;
        
    
    /**
     * Initializes the webpage by getting the defined name for the page
     * 
     * @param filename the name for the HTML webpage document
     */
    public static void initialize(String filename) {
        WebPage.filename = filename;
        lines = new LinkedList<>();
        String text = OPEN + NEW_LINE;
        lines.add(text);
    }
    
    /**
     * Completes the webpage documents and generates a HTML file in the system
     */
    public static void generate() {
        Simulator.title("Computer Science 42SAP - Computer Science 42SAP content completed!");
        String text = NEW_LINE + BREAK + CLOSE;
        lines.add(text);
        FileHandler<LinkedList> handler = new FileHandler<>();
        handler.save(lines, filename);
    }
    
    /**
     * Adds the passed data to the web page file
     * 
     * @param line the line of text to add
     * @param newLine if a new line break (true) is added or not (false)
     * @param type what type of line is being added
     */
    public static void add(String line, boolean newLine, int type) {
        String text = "";  
        if (newLine == false) {
            text = line;
        }
        else {
            if (type == TYPE_ADD_TEXT) {
                line = SPACE + SPACE + SPACE + line;
                text = H3_TEXT_OPEN + line + H3_CLOSE;
            }
            else if (type == TYPE_ADD_SUB_TEXT && newLine == true) {
                line = SPACE + SPACE + SPACE + 
                       SPACE + SPACE + SPACE + line;
                text = H3_TEXT_OPEN + line + H3_CLOSE;
            }   
            
            else if (type == TYPE_UNIT_POINT)  {
                line = SPACE + SPACE + SPACE + line;
                text = H3_TEXT_OPEN + line + H3_CLOSE;
            }
            else if (type == TYPE_UNIT_SUB_POINT) {
                line = SPACE + SPACE + SPACE + 
                       SPACE + SPACE + SPACE + line;
                text = H3_TEXT_OPEN + line + H3_CLOSE;
            } 
            else if (type == TYPE_TEXT)           text = line + NEW_LINE + BREAK;
            else if (type == TYPE_PLAIN_TEXT)     text = line + NEW_LINE + BREAK;
            else if (type == TYPE_H1)             text = H1_OPEN          + line + H1_CLOSE;
            else if (type == TYPE_H2)             text = H2_OPEN          + line + H2_CLOSE;
            else if (type == TYPE_H3)             text = H3_OPEN          + line + H3_CLOSE;
            else if (type == TYPE_ADD_SUB_TEXT)   text = PRE_OPEN         + line + PRE_CLOSE;
            else if (type == TYPE_PRE_COMMENT)    text = PRE_COMMENT_OPEN + line + PRE_CLOSE;
            else if (type == TYPE_UNIT_TITLE)     text = H1_OPEN          + line + H1_CLOSE;
            else if (type == TYPE_UNIT_TOPIC)     text = H2_OPEN          + line + H2_CLOSE;
            else if (type == TYPE_EXAMPLE)        text = PRE_COMMENT_OPEN + line + PRE_CLOSE;
            else if (type == TYPE_DIALOG)         text = H3_OPEN          + line + H3_CLOSE;
            else if (type == TYPE_CODE)           text = PRE_OPEN         + line + PRE_CLOSE;
            else if (type == TYPE_COMMENT)        text = PRE_COMMENT_OPEN + line + PRE_CLOSE;
            else if (type == TYPE_SUB_TEXT)       text = PRE_OPEN         + line + PRE_CLOSE;
            else if (type == TYPE_HEADER_SPACED)  text = H2_OPEN          + line + H2_CLOSE;
            else if (type == TYPE_NOTE)           text = H3_OPEN          + line + H3_CLOSE;
            else if (type == TYPE_HEADER)         text = H2_OPEN          + line + H2_CLOSE;
            else if (type == TYPE_TITLE)          text = H1_OPEN          + line + H1_CLOSE;  
            else                                  text = line;
            text = text + NEW_LINE;
        }
        lines.add(text);
    }
    
    
    /**
     * Adds a standard line of body text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addLine(String line) {
        add(line,false,TYPE_TEXT);
    }
    
    /**
     * Adds a standard line of body text with a line break to the webpage 
     * document
     * 
     * @param line the line of text to add
     */
    public static void addNewLine(String line) {
        add(line,true,TYPE_TEXT);
    }
    
    /**
     * Adds a level 1 header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH1(String line) {
        add(line,true,TYPE_H1);
    }
    
    /**
     * Adds a level 2 header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH2(String line) {
        add(line,true,TYPE_H2);
    }
        
    /**
     * Adds a note styled header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH3(String line) {
        add(line,true,TYPE_H3);
    }    
    
    /**
     * Adds "unitPoint" text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addText(String line) {
        add(line,true,TYPE_ADD_TEXT);
    }
    
    /**
     * Adds "sub-unitPoint" text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addSubText(String line) {
        add(line,true,TYPE_ADD_SUB_TEXT);
    }
    
    /**
     * Adds pre-formatted text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addPre(String line) {
        add(line,true,TYPE_PRE);
    }
    
    /**
     * Adds pre-formatted text (styled to look like a code comment) to the 
     * webpage document
     * 
     * @param line the line of text to add
     */
    public static void addPreComment(String line) {
        add(line,true,TYPE_PRE_COMMENT);
    }
    
    /**
     * Adds a text line (styled to look like a title) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void unitTitle(String line) {
        add(line,true,TYPE_UNIT_TITLE);
    }
    
    /**
     * Adds a text line (styled to look like a topic) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void unitTopic(String line) {
        add(line,true,TYPE_UNIT_TOPIC);
    }
    
    /**
     * Adds a text line (styled to look like a point) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void unitPoint(String line) {
        add(line,true,TYPE_UNIT_POINT);
    }
        
    /**
     * Adds a text line (styled to look like a sub point) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void unitSubPoint(String line) {
        add(line,true,TYPE_UNIT_SUB_POINT);
    }
    
    /**
     * Adds a text line (styled to look like an example) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void example(String line) {
        add(line,true,TYPE_EXAMPLE);
    }

    /**
     * Adds a text line (styled to look like a dialog) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void dialog(String line) {
        add(line,true,TYPE_DIALOG);
    }
    
    /**
     * Adds a text line (styled to look like code) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void code(String line) {
        add(line,true,TYPE_CODE);
    }
    
    /**
     * Adds a text line (styled to look like a comment) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void comment(String line) {
        add(line,true,TYPE_COMMENT);
    }
    
    /**
     * Adds a text line (styled to look like sub text) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void subText(String line) {
        add(line,true,TYPE_SUB_TEXT);
    }
    
    /**
     * Adds a text line (styled to look like plain text) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void text(String line) {
        add(line,true,TYPE_PLAIN_TEXT);
    }
    
    /**
     * Adds a text line (styled to look like a header spaced) to the webpage 
     * document
     * 
     * @param line the line of text to add
     */
    public static void headerSpaced(String line) {
        add(line,true,TYPE_HEADER_SPACED);
    }
    
    /**
     * Adds a text line (styled to look like a note) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void note(String line) {
        add(line,true,TYPE_NOTE);
    }
    
    /**
     * Adds a text line (styled to look like a header) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void header(String line) {
        add(line,true,TYPE_HEADER);
    }
    
    /**
     * Adds a text line (styled to look like a title) to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void title(String line) {
        add(line,true,TYPE_TITLE);
    }
    
}
