
package vetbovino.Login;


import vetbovino.Logic.Actions_ComponentsOpcionW;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import vetbovino.Utils.GUIUtils;

public class LoginPanel extends JPanel{
    
    public LoginPanel(){
    
     setLayout(new BorderLayout());
     add( panel_Buttons2(),BorderLayout.CENTER);
     add(panel_Title(),BorderLayout.NORTH);
    }
    

    
    private JPanel panel_Buttons2(){
    
        JPanel panelButton2 = new JPanel();
        panelButton2.setLayout(new GridLayout(5,1,0,10));
        panelButton2.add(createButtons("PACIENTES",new ImageIcon("src/vetbovino/users.png")));
        panelButton2.add(createButtons("<html>GESTION<br>DE CITAS</html>",new ImageIcon("src/vetbovino/gestionCitas.png")));
        panelButton2.add(createButtons("<html>PROCEDS<br>PENDIENTES</html>",new ImageIcon("src/vetbovino/procedimientosPendientes.png")));
        panelButton2.add(createButtons("<html>ESTETICA<br>PENDIENTE</html>",new ImageIcon("src/vetbovino/estetica.png") ));
        panelButton2.add(createButtons("HOSPITALIZACION",new ImageIcon("src/vetbovino/hospitalizacion.png")));
        panelButton2.setBorder(new EmptyBorder(80,500,30,510));
        
        return panelButton2;
    }
    
    private JPanel panel_Title(){
    
        JPanel panel_Title = new JPanel();
        panel_Title.setBorder(new EmptyBorder(40,0,0,0));
        panel_Title.add(tittle());
        
        return panel_Title;
    }
    
    private JLabel tittle(){
    
        JLabel title = new JLabel("O P C I O N S");
        title.setFont(new Font("Consolas", Font.TRUETYPE_FONT, 40));
        
        return title;
    }
    
    private JButton createButtons(String title,Icon icono){
        
    JButton boton =GUIUtils.createButton(title, 300, 20, new Color(240, 187, 93), new Font("Consolas", Font.BOLD, 17),icono);
    Actions_ComponentsOpcionW hola = new Actions_ComponentsOpcionW();
    hola.event(boton.getText(), boton);
    
    return boton;
    }
    
}
