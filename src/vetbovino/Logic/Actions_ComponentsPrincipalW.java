package vetbovino.Logic;


import vetbovino.Login.LoginFrame;
import vetbovino.SinginWindow.Singin_Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vetbovino.Login.LoginFrame;
import vetbovino.SinginWindow.Singin_Window;

public class Actions_ComponentsPrincipalW {

    JButton boton = new JButton();

    // Constructor de la clase
    public Actions_ComponentsPrincipalW() {
        // No hace nada en el constructor por ahora
    }

    // Método para asignar acciones a los botones de la ventana principal
    public void ActionButton_PrincipalWindow(JButton button1, JButton button2) {
        // Asignamos el ActionListener al primer botón
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción cuando se presiona el primer botón
                // Ejemplo: Abrir una ventana de inicio de sesión
                Singin_Window singin = new Singin_Window();
            }
        });

        // Asignamos el ActionListener al segundo botón
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción cuando se presiona el segundo botón
                // Ejemplo: Abrir una ventana de opciones
                LoginFrame opcions = new LoginFrame();
            }
        });
    }
    
    // Método para manejar eventos de botones en la clase OpcionsWindow
   
}
