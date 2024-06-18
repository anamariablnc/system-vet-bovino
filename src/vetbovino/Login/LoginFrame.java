
package vetbovino.Login;



import vetbovino.MainWindow.Main_Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vetbovino.Windows;

 


public class LoginFrame implements Windows{
    
    
    public LoginFrame(){
    
         create_frame();
    
    }
    
     @Override
    public void create_frame() {
        
        Main_Frame ventana = new Main_Frame();
        ventana.initializeWindow(JFrame.HIDE_ON_CLOSE, "OPCIONS", "src/vetbovino/icon.png",JFrame.MAXIMIZED_BOTH);
        ventana.add(create_panel());
    }

    @Override
    public JPanel create_panel() {
        LoginPanel panel = new LoginPanel();
        
        return panel;
    }


   
    
}


