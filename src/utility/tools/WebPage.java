
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import utility.collections.LinkedList;
import utility.io.FileHandler;

 
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
    
    private static final String CLOSE             = "</body>";
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
    
    private static String text;
    private static String filename;
    
    
    /**
     * Initializes the webpage by getting the defined name for the page
     * 
     * @param filename the name for the HTML webpage document
     */
    public static void initialize(String filename) {
        WebPage.filename = filename;
        text = OPEN + NEW_LINE;
    }
    
    /**
     * Adds a standard line of body text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addLine(String line) {
        text += line;
    }
    
    /**
     * Adds a standard line of body text with a line break to the webpage 
     * document
     * 
     * @param line the line of text to add
     */
    public static void addNewLine(String line) {
        text += line + NEW_LINE + BREAK + NEW_LINE;
    }
    
    /**
     * Adds a level 1 header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH1(String line) {
        text += H1_OPEN + line + H1_CLOSE + NEW_LINE;
    }
    
    /**
     * Adds a level 2 header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH2(String line) {
        text += H2_OPEN + line + H2_CLOSE + NEW_LINE;
    }
        
    /**
     * Adds a note styled header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addH3(String line) {
        text += H3_OPEN + line + H3_CLOSE + NEW_LINE;
    }    
    
    /**
     * Adds a level 2 header to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addText(String line) {
        text += H3_TEXT_OPEN + line + H3_CLOSE + NEW_LINE;
    }
    
    /**
     * Adds pre-formatted text to the webpage document
     * 
     * @param line the line of text to add
     */
    public static void addPre(String line) {
        text += PRE_OPEN + line + PRE_CLOSE + NEW_LINE;
    }
    
    /**
     * Adds pre-formatted text (styled to look like a code comment) to the 
     * webpage document
     * 
     * @param line the line of text to add
     */
    public static void addPreComment(String line) {
        text += PRE_COMMENT_OPEN + line + PRE_CLOSE + NEW_LINE;
    }
    
    /**
     * Completes the webpage documents and generates a HTML file in the system
     */
    public static void generate() {
        text += NEW_LINE + CLOSE;
        FileHandler<LinkedList> handler = new FileHandler<>();
        handler.save(text, filename);
    }
    
}
