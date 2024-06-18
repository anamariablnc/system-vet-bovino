
package vetbovino.MainWindow;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



// Clase que representa el panel de logo de la ventana principal
public class TitlePanel extends JPanel {
    
    // Constructor
    public TitlePanel() {
        setLayout(new BorderLayout());
        // Inicializamos una variable de tipo Image en null para cargar la imagen del logo
        Image image = null;
        // Try-catch para cargar la imagen del logo
        try {
            image = ImageIO.read(new File("src/vetBovino/log.png"));
        } catch (IOException e) {
            // Manejo de errores: si ocurre un error al cargar la imagen.
              //Se muestra el titulo de la marca 
            JLabel exceptionImage = new JLabel("B O V I N O  V E T E R I N A R I A");
            exceptionImage.setBorder(new EmptyBorder(250,455, 0, 0));
            exceptionImage.setFont(new Font("Consolas", Font.BOLD, 25));
            add(exceptionImage, BorderLayout.NORTH);
        }
        // Se verifica si la imagen se ha cargado correctamente antes de agregarla al panel
        if (image != null) {
            // Se crea un JLabel para mostrar la imagen del logo
            JLabel logo = new JLabel(new ImageIcon(image));
            // Se configura un borde vacío en la parte superior del logo para separarlo del borde de la ventana
            logo.setBorder(new EmptyBorder(80, 0, 0, 0));
            // Se agrega el JLabel que contiene la imagen del logo al panel en la parte superior
            add(logo, BorderLayout.NORTH);
        }
    }
}
