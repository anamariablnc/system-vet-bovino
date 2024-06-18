 
package vetbovino.Utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


 
public class GUIUtils {
    
     public static JButton createButton(String text,int width,int heigth,Color color,Font styleFont,Icon icon) {
         
        JButton button = new JButton(text,icon);
        button.setPreferredSize(new Dimension(width, heigth));
        button.setBorderPainted(true);
        button.setBackground(color);
        button.setFont(new Font("Consolas", Font.BOLD, 17));
        Border border = BorderFactory.createEtchedBorder(WIDTH, Color.LIGHT_GRAY, new Color(240, 187, 93));
        button.setBorder(border);
        button.setHorizontalTextPosition(SwingConstants.LEFT); // Mueve el texto a la izquierda del icono
        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setIconTextGap(25);
        
        return button;
    }
     
     
     public static JTextField createTextField(int c){
     
        JTextField textSerch = new JTextField(c);
        textSerch.setFont(new Font("Consolas", Font.BOLD, 15)); 
        textSerch.setHorizontalAlignment(JTextField.CENTER);
        textSerch.setDragEnabled(true); 
        textSerch.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true)); 
        textSerch.setBackground(new Color(194, 217, 255));
        
     return textSerch;
     }

}
