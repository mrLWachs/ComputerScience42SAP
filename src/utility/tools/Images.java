
/** Required package class namespace */
package utility.tools;

/** Required API imports */
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

 
/**
 * Images.java - tools for working with images
 *
 * @author Mr. Wachs
 * @since June 2023
 */
public class Images 
{

    /** 
     * Resizes the image inside the label to match the size of the label 
     * 
     * @param label the JLabel object to resize to
     */
    public static void resizeToContainer(JLabel label) {
        int       width         = label.getWidth();     // get label width
        int       height        = label.getHeight();    // get label height
        ImageIcon originalIcon  = (ImageIcon)label.getIcon();   // get icon
        if (originalIcon == null) return;               // error trap
        Image     originalImage = originalIcon.getImage();      // get image
        Image     newImage      = originalImage.getScaledInstance(
                                          width,height,Image.SCALE_SMOOTH);
        Icon icon               = new ImageIcon(newImage);  // set new image
        label.setIcon(icon);                            // set icon to label
    }
    
}
