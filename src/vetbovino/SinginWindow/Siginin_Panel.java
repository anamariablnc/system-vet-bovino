package vetbovino.SinginWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import vetbovino.Utils.GUIUtils;

public class Siginin_Panel extends JPanel {
    // Variables de instancia
    private Image image1;
    private JPanel panelImage, panelGridform;
    private boolean excp;
    // Constructor
    public Siginin_Panel() {
        // Configuración inicial de la interfaz
        panel_settings();
        load_images();
        setPanel_Image();
        setPanel_Gridform();
    }

    // Configuración de la disposición de los paneles
    private void panel_settings() {
        setLayout(new BorderLayout()); // Configuración del layout principal
        panelImage = new JPanel(); // Creación del panel de la imagen
        panelGridform = new JPanel(new GridBagLayout()); // Creación del panel del formulario
        panelGridform.setBorder(new EmptyBorder(120, 0, 40, 380)); // Añadir borde al panel del formulario
        add(panelImage, BorderLayout.WEST); // Añadir panel de la imagen al oeste
        add(panelGridform, BorderLayout.CENTER); // Añadir panel del formulario al centro
        add(panel_title(), BorderLayout.NORTH); // Añadir título al norte
        add(Buttons_Opcion(), BorderLayout.SOUTH); // Añadir botones de opción al sur
    }
    
    // Creación de los botones de opción
    private JPanel Buttons_Opcion() {
        JPanel lamina_ButtonBack = new JPanel(); // Creación del panel de botones
        lamina_ButtonBack.setLayout(new GridLayout(1,3,10,10)); // Configuración del layout del panel de botones
        lamina_ButtonBack.setBorder(new EmptyBorder(0,670,80,400)); // Añadir borde al panel de botones
        
        // Creación de los botones
        JButton cleanButton = new JButton("C L E A N");
        JButton saveButton = new JButton("S A V E");
        JButton cancelButton = new JButton("C A N C E L");
        
        // Añadir los botones al panel de botones
        lamina_ButtonBack.add(cleanButton);
        lamina_ButtonBack.add(saveButton);
        lamina_ButtonBack.add(cancelButton);
        
        // Aplicar estilos a los botones
        style_ButtonsOptions(cleanButton);
        style_ButtonsOptions(saveButton);
        style_ButtonsOptions(cancelButton);
        
        return lamina_ButtonBack;
    }
    
    // Aplicar estilos a los botones de opción
    private JButton style_ButtonsOptions(JButton button) {
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true)); // Añadir borde al botón
        button.setBackground(new Color(194, 217, 255)); // Establecer color de fondo del botón
        button.setFont(new Font("monospace", Font.BOLD, 15)); // Establecer fuente y tamaño de texto del botón
        button.setPreferredSize(new Dimension(0, 20)); // Establecer tamaño preferido del botón
        return button;
    }
    
    // Creación del título
    private JPanel panel_title() {
        JPanel panelTitle = new JPanel(); // Creación del panel del título
        JLabel title = new JLabel(" R E G I S T R O "); // Creación del JLabel del título
        title.setBorder(new EmptyBorder(70,0,0,0)); // Añadir borde al título
        title.setFont(new Font("monospace", Font.BOLD, 40)); // Establecer fuente y tamaño de texto del título
        panelTitle.add(title); // Añadir título al panel
        return panelTitle;
    }
    
    // Carga de imágenes
    private void load_images() {
        try {
            image1 = ImageIO.read(new File("src/vetbovino/logo2.png")); // Carga de la imagen
        } catch (IOException e) {
            System.out.println("We're sorry, an error occurred while loading images."); // Manejo de errores
        }
        
        if(image1!=null){
           
           excp=true; 
        }
    }

    // Configuración de la imagen
    private void setPanel_Image() {
     
        if(excp==true){
        panelImage.setLayout(new BorderLayout()); // Configuración del layout del panel de imagen
        JLabel label = new JLabel(new ImageIcon(image1)); // Creación del JLabel con la imagen
        label.setBorder(new EmptyBorder(110,300,80,0)); // Añadir borde al JLabel
        panelImage.add(label, BorderLayout.WEST); // Añadir JLabel al panel
        }
     }

    // Configuración del formulario
    private void setPanel_Gridform() {
        GridBagConstraints gbc = new GridBagConstraints(); // Creación de restricciones de cuadrícula
        gbc.insets = new Insets(10, 10, 10, 5); // Espaciado entre componentes
        
        // Agregar campos de formulario al panel de cuadrícula
        addFormField("Nombre", creatTextField(), gbc, 0);
        addFormField("Animal", type_Animal(), gbc, 1);
        addFormField("Edad", creatTextField(), gbc, 2);
        addFormField("Telefono", creatTextField(), gbc, 3);
        addFormField("Direccion", creatTextField(), gbc, 4);
        addFormField("Sexo", createRazaPanel(), gbc, 5);
    }

    // Crear campos de texto
    private JTextField creatTextField() {
        
        return GUIUtils.createTextField(20);
    }

    // Crear panel de botones de opción para el sexo
    private JPanel createRazaPanel() {
        JPanel razaPanel = new JPanel(); // Creación del panel de botones de opción
        ButtonGroup group = new ButtonGroup(); // Creación de grupo para los botones de opción
        JRadioButton option1 = new JRadioButton("F"); // Creación del botón opción (F)
        JRadioButton option2 = new JRadioButton("M"); // Creación del botón opción (M)
        
        // Establecer estilos y añadir botones al grupo
        option1.setFont(new Font("Consolas", Font.BOLD, 15));
        option2.setBackground(new Color(194, 217, 255));
        option1.setBackground(new Color(194, 217, 255));
        option1.setFont(new Font("Consolas", Font.BOLD,15));
        option2.setFont(new Font("Consolas", Font.BOLD,15));
        group.add(option1);
        group.add(option2);
        
        // Añadir botones al panel de botones de opción
        razaPanel.add(option1);
        razaPanel.add(option2);
        
        return razaPanel; // Retornar panel de botones de opción
    }

    // Agregar campo de formulario al panel de cuadrícula
    private void addFormField(String labelText, java.awt.Component component, GridBagConstraints gbc, int row) {
        gbc.gridx = 0; // Columna para la etiqueta
        gbc.gridy = row; // Fila especificada
        panelGridform.add(createLabel(labelText), gbc); // Agregar etiqueta al panel de cuadrícula
        gbc.gridx = 1; // Columna para el componente
        panelGridform.add(component, gbc); // Agregar componente al panel de cuadrícula
    }

    // Crear etiqueta con estilo
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text); // Creación de la etiqueta
        label.setFont(new Font("Consolas", Font.BOLD,20)); // Establecer fuente y tamaño de texto
        return label; // Retornar etiqueta
    }

    // Crear JComboBox para el tipo de animal
    private JComboBox type_Animal() {
        JComboBox comboBox = new JComboBox(); // Creación de JComboBox
        comboBox.addItem("PERRO "); // Añadir opción PERRO
        comboBox.addItem("GATO "); // Añadir opción GATO
        comboBox.setPreferredSize(new Dimension(162,25)); // Establecer tamaño preferido
        comboBox.setFont(new Font("Consolas", Font.BOLD,15)); // Establecer fuente y tamaño de texto
        comboBox.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1, true)); // Añadir borde
        comboBox.setBackground(new Color(194, 217, 255)); // Establecer color de fondo
        return comboBox; // Retornar JComboBox
    }
}
