
package vetbovino.Logic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vetbovino.Login.Opcions.PendingAppointmentWindow;
import vetbovino.Login.Opcions.AppointmentWindow;
import vetbovino.Login.Opcions.HospitalizationWindow;
import vetbovino.Login.Opcions.PatientWindow;
import vetbovino.Login.Opcions.PendingProcessWindow;


public class Actions_ComponentsOpcionW {
     public void event(String text, JButton boton) {
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción cuando se presiona un botón en la ventana de opciones
                JButton sourceButton = (JButton) e.getSource();
                String buttonText = sourceButton.getText();
                
              switch (buttonText) {
                     
                case "PACIENTES":
                    PatientWindow pacientesW = new PatientWindow();
                    break;
                case "<html>GESTION<br>DE CITAS</html>":
                     AppointmentWindow G_C = new AppointmentWindow();
                    break;
                case "<html>PROCEDS<br>PENDIENTES</html>":
                    PendingProcessWindow proceds = new PendingProcessWindow();
                    break;
                case "<html>ESTETICA<br>PENDIENTE</html>":
                    PendingAppointmentWindow Est_Pend = new PendingAppointmentWindow();
                    break;
                case "HOSPITALIZACION":
                    HospitalizationWindow hosp = new HospitalizationWindow();
                    break;
                // Agregar casos para otras opciones según sea necesario
                default:
                    // Acción por defecto si no coincide con ningún caso
            }
                
            }
        });
    }
}
