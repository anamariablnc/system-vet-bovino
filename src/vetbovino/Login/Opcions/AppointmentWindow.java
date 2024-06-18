
package vetbovino.Login.Opcions;

import javax.swing.JFrame;
import javax.swing.JPanel;
import vetbovino.MainWindow.Main_Frame;
import vetbovino.Windows;

public class AppointmentWindow implements Windows{
    
    
    public AppointmentWindow(){
    
        create_frame();
    
    
    }
    
    
     @Override
    public void create_frame() {

        Main_Frame ventana = new Main_Frame();
        ventana.initializeWindow(JFrame.HIDE_ON_CLOSE, "GESTION DE CITAS", "src/vetBovino/gestionCitas.png",JFrame.MAXIMIZED_BOTH);
        ventana.add(create_panel());

    }

    @Override
    public JPanel create_panel() {
       
         AppointmentPanel panel = new AppointmentPanel();
         
        return panel;
     }
    
}
