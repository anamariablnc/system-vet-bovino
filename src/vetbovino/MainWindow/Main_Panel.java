 
package vetbovino.MainWindow;
 
// Class for the buttons panel

 
import vetbovino.Logic.Actions_ComponentsPrincipalW;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vetbovino.Utils.GUIUtils;

 
 
 

class Main_Panel extends JPanel {

    //Creacion de variables utilizadas en esta clase
    private JButton boton1;
    private JButton boton2;
    private Image image1;
    private Image image2;
    private boolean excp;
     
    //Constructor que carga todos los metodos necesarios para ejecutar esta clase
    public Main_Panel() {
        loadImages();
        initializeButtons();
        Accion();
        add(createGridPanel());
    }
    
  

    // Metodo privado para cargar Imagenes
    private void loadImages() {
        //Manejo de errores : Si ocurre un error en al cargar las imagenes
          //Se mostrara un mensaje por consola
        try {
            image1 = ImageIO.read(new File("src/vetBovino/dog.png"));
            image2 = ImageIO.read(new File("src/vetBovino/cat.png"));
        } catch (IOException e) {
            System.out.println("We´re sorry");
        }
        if (image1 != null || image2!=null) {
             excp=true;
        }
          
    }
    

    // Method to initialize buttons
    private void initializeButtons() {
        boton1 = GUIUtils.createButton("Registrar nuevo usuario",250,25,new Color(240, 187, 93),new Font("Consolas", Font.BOLD, 17),null);
        boton2 = GUIUtils.createButton("Ingresar",250,25,new Color(240, 187, 93),new Font("Consolas", Font.BOLD, 17),null);
    }
    
    //Metodo para crear una instancia de la clase Action_Components
     //La cual define las acciones a realizar cuando los botones se presionen
    private void Accion(){
    
        Actions_ComponentsPrincipalW accion = new Actions_ComponentsPrincipalW();
        accion.ActionButton_PrincipalWindow(boton1,boton2);
     
    }
    

    
   
    //  Metodo para imprimar las imagenes anteriormente cargadas
    private void printImage(){
     
      //Instancia de label el cual pasa por parametros una instancia 
     //ImageIcon que recibe por parametros la imagen anteriormente cargada
     JLabel imageLabel1 = new JLabel(new ImageIcon(image1));
     JLabel imageLabel2 = new JLabel(new ImageIcon(image2));
     //Añadimos los label a la lamina gridPanel
        gridPanel.add(imageLabel1);
        gridPanel.add(imageLabel2);
      
    
    }
    
    //Creacion de la lamina gridPanel la cual va a contar con los elementos:
     //-Botones / -Imagenes
    JPanel gridPanel = new JPanel();
    
    //Metodo que configura la lamina gridPanel
    private JPanel createGridPanel() {
      
        //Configutacion layout de la lamina
        gridPanel.setLayout(new GridLayout(2, 2,20,20));
        
    //Si las imagenes han sido cargada correctamente
    //Pasamos las imagenes al label
     if(excp==true){
        //Llamada al metodo printImage() para imprimir las imagenes en la lamina
        printImage();
     }
        //Añadinamos a la lamina los dos botones
        gridPanel.add(boton1);
        gridPanel.add(boton2);

        //Retornamos la lamina
        return gridPanel;
    }
}
