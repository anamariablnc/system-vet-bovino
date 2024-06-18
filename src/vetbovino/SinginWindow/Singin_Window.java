package vetbovino.SinginWindow;


import vetbovino.MainWindow.Main_Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vetbovino.Windows;

 

 
 

public class Singin_Window implements Windows {

    public Singin_Window() {
        create_frame();
    }

    @Override
    public void create_frame() {
        
        Main_Frame ventana = new Main_Frame();
        ventana.initializeWindow(JFrame.HIDE_ON_CLOSE, "SIGN IN", "src/vetbovino/icon.png",JFrame.MAXIMIZED_BOTH);
        ventana.add(create_panel());
    }

    @Override
    public JPanel create_panel() {
        
        return new Siginin_Panel();
    }
}

 
