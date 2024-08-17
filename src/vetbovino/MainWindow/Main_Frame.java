package vetbovino.MainWindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
 
 

 

public  class Main_Frame extends JFrame  {

     public Main_Frame(){}
     
    public Main_Frame(boolean isVisible) {
        initializeWindow(JFrame.EXIT_ON_CLOSE,"HOME","src/vetbovino/icon.png",JFrame.MAXIMIZED_BOTH);
        addComponents();
        setVisible(isVisible);
          // Maximizar la ventana después de agregar los componentes
     }
    
   

    // Método para inicializar la configuración de la ventana principal
    public final void initializeWindow(int CloseOpe,String title,String icono,int extendedState) {
        setVisible(true);
        setTitle(title);
        setDefaultCloseOperation( CloseOpe);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setResizable(false);
        setIconImage(toolkit.getImage(icono));
        setBounds(screenSize.width / 4, screenSize.height / 4, screenSize.width / 2, screenSize.height / 2);
        setExtendedState(extendedState);
    }

    // Método para agregar componentes a la ventana
    private void addComponents() {
        setLayout(new BorderLayout(40, 40));
        add(new TitlePanel(), BorderLayout.NORTH);
        Main_Panel buttonsPrincipalPanel = new Main_Panel();
        add(buttonsPrincipalPanel, BorderLayout.CENTER);

        // Forzar la actualización de la interfaz gráfica
        revalidate();
        repaint();
    }

   
}
