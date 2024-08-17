 
package vetbovino.Login.Opcions;


 
import vetbovino.MainWindow.Main_Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vetbovino.Windows;




 
public class PatientWindow implements Windows{
    
    
    public PatientWindow(){
    
        create_frame();
    
    }

    @Override
    public void create_frame() {

        Main_Frame ventana = new Main_Frame();
        ventana.initializeWindow(JFrame.HIDE_ON_CLOSE, "OPCIONS", "src/vetbovino/users.png",0);
        ventana.add(create_panel());

    }

    @Override
    public JPanel create_panel() {
       
         PatientPanel panel = new PatientPanel();
         
        return panel;
     }
    
    
    
}
