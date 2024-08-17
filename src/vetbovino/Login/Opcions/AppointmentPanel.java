
package vetbovino.Login.Opcions;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import vetbovino.Logic.Actions_ComponentsOpcionW;
import vetbovino.Utils.GUIUtils;


public class AppointmentPanel extends JPanel {
    
    
    public AppointmentPanel(){
    
        add(panel_Buttons2());
    
    }
    
     private JPanel panel_Buttons2(){
    
        JPanel panelButton2 = new JPanel();
        panelButton2.setLayout(new GridLayout(5,1,0,10));
        panelButton2.add(createButtons("PACIENTES",new ImageIcon("src/vetbovino/users.png")));
        panelButton2.add(createButtons("<html>AGENDAMIENTO<br>DE CITAS</html>",new ImageIcon("src/vetbovino/gestionCitas.png")));
        panelButton2.add(createButtons("<html>PROCEDS<br>PENDIENTES</html>",new ImageIcon("src/vetbovino/procedimientosPendientes.png")));
        panelButton2.add(createButtons("<html>ESTETICA<br>PENDIENTE</html>",new ImageIcon("src/vetbovino/estetica.png") ));
        panelButton2.add(createButtons("HOSPITALIZACION",new ImageIcon("src/vetbovino/hospitalizacion.png")));
        panelButton2.setBorder(new EmptyBorder(80,500,30,510));
        
        return panelButton2;
    }
    
    
    private JButton createButtons(String title,Icon icono){
        
    JButton boton =GUIUtils.createButton(title, 300, 20, new Color(240, 187, 93), new Font("Consolas", Font.BOLD, 17),icono);
    Actions_ComponentsOpcionW Action_Button = new Actions_ComponentsOpcionW();
    Action_Button.event(boton.getText(), boton);
    
    return boton;
    }
    
    
}
