
package vetbovino.Login.Opcions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import vetbovino.Utils.GUIUtils;

public class PatientPanel extends JPanel {
    
    JPanel panel = new JPanel();
    Image imageP;
    
    public PatientPanel(){
    
        setLayout(new BorderLayout());
        add(PanelImage(),BorderLayout.NORTH);
        add( PanelSearch(),BorderLayout.CENTER);
        add(PanelResult(),BorderLayout.SOUTH);
    
    }
    
    
    private JPanel PanelImage(){
    
        panel.setLayout(new BorderLayout());
        try{
        
         imageP = ImageIO.read(new File("src/vetBovino/searchUsers.png"));
         
        }catch(IOException e){
        
            JLabel label = new JLabel ("Image not found");
            panel.add(label);
        }
        if(imageP != null){
        
            JLabel label = new JLabel (new ImageIcon(imageP));
            panel.add(label,BorderLayout.NORTH);
            
        }
        
        
        JLabel title = new JLabel(" B U S C A R  U S U A R I O ");  
        title.setFont(new Font("monospace", Font.TRUETYPE_FONT, 20));  
        title.setBorder(new EmptyBorder(30,210,0,0));
        title.setBackground(new Color(10,130,20));
        panel.add(title,BorderLayout.SOUTH);
        
       return panel;
    }
    
    
    private JPanel PanelSearch(){
    
        JPanel panelSearch = new JPanel();
        
        panelSearch.setBorder(new EmptyBorder(20,10,0,0));
        panelSearch.add(GUIUtils.createTextField(30));
         
        
      return panelSearch;
    }
    
    private JPanel PanelResult(){
    
        JPanel panelResult = new JPanel();
        
        JLabel lab = new JLabel("RESULTADOS");
        lab.setFont(new Font("Arial",Font.BOLD,90));
        panelResult.add(lab);
        panelResult.setBackground(Color.BLUE);
        
      return panelResult;
    }
    
}
