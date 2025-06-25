
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
    
    private static final String NEW_LINE = "\n";
    private static final String SPACE    = "&nbsp;";
    
    private static final String DEFAULT_BACKGROUND_COLOR = "white";
    private static final String DEFAULT_FONT_FAMILY      = "Consolas";
    private static final String DEFAULT_FONT_SIZE        = "16pt";
    private static final String DEFAULT_FONT_STYLE       = "DEFAULT_FONT_STYLE";
    private static final String DEFAULT_FONT_WEIGHT      = "normal";    
    private static final String DEFAULT_FONT_COLOR       = "black";
    
    private static final String LEVEL_1_FONT_SIZE        = "18pt";
    private static final String LEVEL_2_FONT_SIZE        = "20pt";
    private static final String LEVEL_3_FONT_SIZE        = "22pt";
    private static final String LEVEL_1_FONT_FAMILY      = "Lucida Sans Typewriter";   
    private static final String LEVEL_2_FONT_FAMILY      = "Courier New"; 
        
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
    
    ////////////////////////////////////////////////////////////////////////////
    
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
    
    private static final String UNIT_TITLE_CLASS       = "unitTitle";
    private static final String UNIT_TITLE_FONT_COLOR  = "purple"; //olive"; 
    private static final String UNIT_TITLE_FONT_SIZE   = LEVEL_3_FONT_SIZE;
    private static final String UNIT_TITLE_FONT_FAMILY = LEVEL_1_FONT_FAMILY; 
    private static final String UNIT_TITLE_FONT_STYLE  = "normal";
    private static final String UNIT_TITLE_FONT_WEIGHT = "bold";
    private static final String UNIT_TITLE_STYLE = 
            "h1." + UNIT_TITLE_CLASS + " {" + NEW_LINE
                + "   font-family : " + UNIT_TITLE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + UNIT_TITLE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + UNIT_TITLE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + UNIT_TITLE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + UNIT_TITLE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String UNIT_TITLE_OPEN = "<h1 class=\"" + UNIT_TITLE_CLASS + "\">";
    private static final String UNIT_TITLE_CLOSE = "</h1>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String UNIT_TOPIC_CLASS       = "unitTopic";
    private static final String UNIT_TOPIC_FONT_COLOR  = "blue"; 
    private static final String UNIT_TOPIC_FONT_SIZE   = LEVEL_2_FONT_SIZE; //"18pt";
    private static final String UNIT_TOPIC_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String UNIT_TOPIC_FONT_STYLE  = "italic";
    private static final String UNIT_TOPIC_FONT_WEIGHT = "bold";
    private static final String UNIT_TOPIC_STYLE = 
            "div." + UNIT_TOPIC_CLASS + " {" + NEW_LINE
                + "   font-family : " + UNIT_TOPIC_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + UNIT_TOPIC_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + UNIT_TOPIC_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + UNIT_TOPIC_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + UNIT_TOPIC_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String UNIT_TOPIC_OPEN  = "<div class=\"" + UNIT_TOPIC_CLASS + "\">";
    private static final String UNIT_TOPIC_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String UNIT_POINT_CLASS       = "unitPoint";
    private static final String UNIT_POINT_FONT_COLOR  = "fuchsia"; 
    private static final String UNIT_POINT_FONT_SIZE   = LEVEL_1_FONT_SIZE; //"16pt";
    private static final String UNIT_POINT_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String UNIT_POINT_FONT_STYLE  = "italic";
    private static final String UNIT_POINT_FONT_WEIGHT = "normal";
    private static final String UNIT_POINT_STYLE = 
            "div." + UNIT_POINT_CLASS + " {" + NEW_LINE
                + "   font-family : " + UNIT_POINT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + UNIT_POINT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + UNIT_POINT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + UNIT_POINT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + UNIT_POINT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String UNIT_POINT_OPEN  = "<div class=\"" + UNIT_POINT_CLASS + "\">";
    private static final String UNIT_POINT_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String UNIT_SUB_POINT_CLASS       = "unitSubPoint";
    private static final String UNIT_SUB_POINT_FONT_COLOR  = "gray"; 
    private static final String UNIT_SUB_POINT_FONT_SIZE   = DEFAULT_FONT_SIZE; //"10pt";
    private static final String UNIT_SUB_POINT_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String UNIT_SUB_POINT_FONT_STYLE  = "normal";
    private static final String UNIT_SUB_POINT_FONT_WEIGHT = "normal";
    private static final String UNIT_SUB_POINT_STYLE = 
            "div." + UNIT_SUB_POINT_CLASS + " {" + NEW_LINE
                + "   font-family : " + UNIT_SUB_POINT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + UNIT_SUB_POINT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + UNIT_SUB_POINT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + UNIT_SUB_POINT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + UNIT_SUB_POINT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String UNIT_SUB_POINT_OPEN  = "<div class=\"" + UNIT_SUB_POINT_CLASS + "\">";
    private static final String UNIT_SUB_POINT_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String EXAMPLE_CLASS       = "example";
    private static final String EXAMPLE_FONT_COLOR  = "silver"; 
    private static final String EXAMPLE_FONT_SIZE   = DEFAULT_FONT_SIZE;
    private static final String EXAMPLE_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String EXAMPLE_FONT_STYLE  = "normal";
    private static final String EXAMPLE_FONT_WEIGHT = "normal";
    private static final String EXAMPLE_STYLE = 
            "div." + EXAMPLE_CLASS + " {" + NEW_LINE
                + "   font-family : " + EXAMPLE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + EXAMPLE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + EXAMPLE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + EXAMPLE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + EXAMPLE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String EXAMPLE_OPEN  = "<div class=\"" + EXAMPLE_CLASS + "\">";
    private static final String EXAMPLE_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String DIALOG_CLASS       = "dialog";
    private static final String DIALOG_FONT_COLOR  = "goldenrod"; 
    private static final String DIALOG_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String DIALOG_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String DIALOG_FONT_STYLE  = "normal";
    private static final String DIALOG_FONT_WEIGHT = "normal";
    private static final String DIALOG_STYLE = 
            "div." + DIALOG_CLASS + " {" + NEW_LINE
                + "   font-family : " + DIALOG_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + DIALOG_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + DIALOG_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + DIALOG_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + DIALOG_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String DIALOG_OPEN  = "<div class=\"" + DIALOG_CLASS + "\">";
    private static final String DIALOG_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String CODE_CLASS       = "code";
    private static final String CODE_FONT_COLOR  = "gray"; 
    private static final String CODE_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String CODE_FONT_FAMILY = LEVEL_2_FONT_FAMILY; 
    private static final String CODE_FONT_STYLE  = "normal";
    private static final String CODE_FONT_WEIGHT = "bolder";
    private static final String CODE_STYLE = 
            "pre." + CODE_CLASS + " {" + NEW_LINE
                + "   font-family : " + CODE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + CODE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + CODE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + CODE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + CODE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String CODE_OPEN  = "<pre class=\"" + CODE_CLASS + "\">";
    private static final String CODE_CLOSE = "</pre>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String COMMENT_CLASS       = "comment";
    private static final String COMMENT_FONT_COLOR  = "limegreen"; 
    private static final String COMMENT_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String COMMENT_FONT_FAMILY = LEVEL_2_FONT_FAMILY; 
    private static final String COMMENT_FONT_STYLE  = "normal";
    private static final String COMMENT_FONT_WEIGHT = "normal";
    private static final String COMMENT_STYLE = 
            "pre." + COMMENT_CLASS + " {" + NEW_LINE
                + "   font-family : " + COMMENT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + COMMENT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + COMMENT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + COMMENT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + COMMENT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String COMMENT_OPEN  = "<pre class=\"" + COMMENT_CLASS + "\">";
    private static final String COMMENT_CLOSE = "</pre>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String SUB_TEXT_CLASS       = "subText";
    private static final String SUB_TEXT_FONT_COLOR  = "lightsalmon"; 
    private static final String SUB_TEXT_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String SUB_TEXT_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String SUB_TEXT_FONT_STYLE  = "normal";
    private static final String SUB_TEXT_FONT_WEIGHT = "normal";
    private static final String SUB_TEXT_STYLE = 
            "div." + SUB_TEXT_CLASS + " {" + NEW_LINE
                + "   font-family : " + SUB_TEXT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + SUB_TEXT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + SUB_TEXT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + SUB_TEXT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + SUB_TEXT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String SUB_TEXT_OPEN  = "<div class=\"" + SUB_TEXT_CLASS + "\">";
    private static final String SUB_TEXT_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String PLAIN_TEXT_CLASS       = "plainText";
    private static final String PLAIN_TEXT_FONT_COLOR  = "black"; 
    private static final String PLAIN_TEXT_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String PLAIN_TEXT_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String PLAIN_TEXT_FONT_STYLE  = "normal";
    private static final String PLAIN_TEXT_FONT_WEIGHT = "normal";
    private static final String PLAIN_TEXT_STYLE = 
            "div." + PLAIN_TEXT_CLASS + " {" + NEW_LINE
                + "   font-family : " + PLAIN_TEXT_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + PLAIN_TEXT_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + PLAIN_TEXT_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + PLAIN_TEXT_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + PLAIN_TEXT_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String PLAIN_TEXT_OPEN  = "<div class=\"" + PLAIN_TEXT_CLASS + "\">";
    private static final String PLAIN_TEXT_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String HEADER_SPACED_CLASS       = "headerSpaced";
    private static final String HEADER_SPACED_FONT_COLOR  = UNIT_POINT_FONT_COLOR; 
    private static final String HEADER_SPACED_FONT_SIZE   = LEVEL_1_FONT_SIZE;//"18pt";
    private static final String HEADER_SPACED_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String HEADER_SPACED_FONT_STYLE  = "italic";
    private static final String HEADER_SPACED_FONT_WEIGHT = "normal";
    private static final String HEADER_SPACED_STYLE = 
            "div." + HEADER_SPACED_CLASS + " {" + NEW_LINE
                + "   font-family : " + HEADER_SPACED_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + HEADER_SPACED_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + HEADER_SPACED_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + HEADER_SPACED_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + HEADER_SPACED_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String HEADER_SPACED_OPEN  = "<div class=\"" + HEADER_SPACED_CLASS + "\">";
    private static final String HEADER_SPACED_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String NOTE_CLASS       = "note";
    private static final String NOTE_FONT_COLOR  = "orange"; 
    private static final String NOTE_FONT_SIZE   = DEFAULT_FONT_SIZE; //"16pt";
    private static final String NOTE_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String NOTE_FONT_STYLE  = "italic";
    private static final String NOTE_FONT_WEIGHT = "bold";
    private static final String NOTE_STYLE = 
            "div." + NOTE_CLASS + " {" + NEW_LINE
                + "   font-family : " + NOTE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + NOTE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + NOTE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + NOTE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + NOTE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String NOTE_OPEN  = "<div class=\"" + NOTE_CLASS + "\">";
    private static final String NOTE_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String HEADER_CLASS       = "header";
    private static final String HEADER_FONT_COLOR  = UNIT_TOPIC_FONT_COLOR; 
    private static final String HEADER_FONT_SIZE   = LEVEL_2_FONT_SIZE;//"18pt";
    private static final String HEADER_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String HEADER_FONT_STYLE  = "italic";
    private static final String HEADER_FONT_WEIGHT = "bold";
    private static final String HEADER_STYLE = 
            "div." + HEADER_CLASS + " {" + NEW_LINE
                + "   font-family : " + HEADER_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + HEADER_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + HEADER_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + HEADER_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + HEADER_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String HEADER_OPEN  = "<div class=\"" + HEADER_CLASS + "\">";
    private static final String HEADER_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String TITLE_CLASS       = "title";
    private static final String TITLE_FONT_COLOR  = UNIT_TITLE_FONT_COLOR; 
    private static final String TITLE_FONT_SIZE   = LEVEL_3_FONT_SIZE;//"20pt";
    private static final String TITLE_FONT_FAMILY = DEFAULT_FONT_FAMILY; 
    private static final String TITLE_FONT_STYLE  = "normal";
    private static final String TITLE_FONT_WEIGHT = "bold";
    private static final String TITLE_STYLE = 
            "div." + TITLE_CLASS + " {" + NEW_LINE
                + "   font-family : " + TITLE_FONT_FAMILY + ";" + NEW_LINE
                + "   font-size   : " + TITLE_FONT_SIZE   + ";" + NEW_LINE
                + "   font-style  : " + TITLE_FONT_STYLE  + ";" + NEW_LINE
                + "   font-weight : " + TITLE_FONT_WEIGHT + ";" + NEW_LINE
                + "   color       : " + TITLE_FONT_COLOR  + ";" + NEW_LINE
            + "}";
    private static final String TITLE_OPEN  = "<div class=\"" + TITLE_CLASS + "\">";
    private static final String TITLE_CLOSE = "</div>";
    
    ////////////////////////////////////////////////////////////////////////////
    
    private static final String STYLE = 
            "<style>"            + NEW_LINE + 
            BODY_STYLE           + NEW_LINE + 
            H1_STYLE             + NEW_LINE + 
            H2_STYLE             + NEW_LINE + 
            H3_STYLE             + NEW_LINE + 
            H3_TEXT_STYLE        + NEW_LINE +
            PRE_STYLE            + NEW_LINE + 
            PRE_COMMENT_STYLE    + NEW_LINE + 
            UNIT_TITLE_STYLE     + NEW_LINE +             
            UNIT_TOPIC_STYLE     + NEW_LINE +             
            UNIT_POINT_STYLE     + NEW_LINE +  
            UNIT_SUB_POINT_STYLE + NEW_LINE +  
            EXAMPLE_STYLE        + NEW_LINE +             
            DIALOG_STYLE         + NEW_LINE +             
            CODE_STYLE           + NEW_LINE +             
            COMMENT_STYLE        + NEW_LINE +             
            SUB_TEXT_STYLE       + NEW_LINE +             
            PLAIN_TEXT_STYLE     + NEW_LINE +             
            HEADER_SPACED_STYLE  + NEW_LINE +             
            NOTE_STYLE           + NEW_LINE +             
            HEADER_STYLE         + NEW_LINE +             
            TITLE_STYLE          + NEW_LINE +  
            "</style>";

    private static final String OPEN = 
            "<!-- Code Generated by Mr. Wachs -->" + NEW_LINE + 
            "<html>"  + NEW_LINE + 
            "<head>"  + NEW_LINE +
            STYLE     + NEW_LINE + 
            "</head>" + NEW_LINE + 
            "<body>"  + NEW_LINE;
    
    private static final String CLOSE = "</body></html>";
    private static final String BREAK = "</br />";
    
    ////////////////////////////////////////////////////////////////////////////
    
    
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
                text = UNIT_POINT_OPEN + line + UNIT_POINT_CLOSE;
            }
            else if (type == TYPE_UNIT_SUB_POINT) {
                line = SPACE + SPACE + SPACE + 
                       SPACE + SPACE + SPACE + line;
                text = UNIT_SUB_POINT_OPEN + line + UNIT_SUB_POINT_CLOSE;
            } 
            else if (type == TYPE_TEXT)           text = line + NEW_LINE + BREAK;
            else if (type == TYPE_PLAIN_TEXT)     text = line + NEW_LINE + BREAK;
            else if (type == TYPE_H1)             text = H1_OPEN            + line + H1_CLOSE;
            else if (type == TYPE_H2)             text = H2_OPEN            + line + H2_CLOSE;
            else if (type == TYPE_H3)             text = H3_OPEN            + line + H3_CLOSE;
            else if (type == TYPE_ADD_SUB_TEXT)   text = PRE_OPEN           + line + PRE_CLOSE;
            else if (type == TYPE_PRE_COMMENT)    text = PRE_COMMENT_OPEN   + line + PRE_CLOSE;
            else if (type == TYPE_UNIT_TITLE)     text = UNIT_TITLE_OPEN    + line + UNIT_TITLE_CLOSE;
            else if (type == TYPE_UNIT_TOPIC)     text = UNIT_TOPIC_OPEN    + line + UNIT_TOPIC_CLOSE;
            else if (type == TYPE_EXAMPLE)        text = EXAMPLE_OPEN       + line + EXAMPLE_CLOSE;
            else if (type == TYPE_DIALOG)         text = DIALOG_OPEN        + line + DIALOG_CLOSE;
            else if (type == TYPE_CODE)           text = CODE_OPEN          + line + CODE_CLOSE;
            else if (type == TYPE_COMMENT)        text = COMMENT_OPEN       + line + COMMENT_CLOSE;
            else if (type == TYPE_SUB_TEXT)       text = SUB_TEXT_OPEN      + line + SUB_TEXT_CLOSE;
            else if (type == TYPE_HEADER_SPACED)  text = HEADER_SPACED_OPEN + line + HEADER_SPACED_CLOSE;
            else if (type == TYPE_NOTE)           text = NOTE_OPEN          + line + NOTE_CLOSE;
            else if (type == TYPE_HEADER)         text = HEADER_OPEN        + line + HEADER_CLOSE;
            else if (type == TYPE_TITLE)          text = TITLE_OPEN         + line + TITLE_CLOSE;  
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
