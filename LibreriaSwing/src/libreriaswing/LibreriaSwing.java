/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class LibreriaSwing {

     public static void main(String[] args) {
        // Crear un JFrame como ventana principal
        JFrame frame = new JFrame("Interfaz Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Ingrese su Nombre:");
        frame.add(label);

        // JTextField 
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JCheckBox verificacion
        JCheckBox checkBox = new JCheckBox("Casilla de verificación");
        frame.add(checkBox);

        // JRadioButton
        JLabel label2 = new JLabel("\n Seleccione su Modo de Estudio: \n");
        frame.add(label2);
        
        JRadioButton radioButton1 = new JRadioButton("Virtual");
        JRadioButton radioButton2 = new JRadioButton("Precencial");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        // JComboBox
        JLabel label3 = new JLabel("\n Seleccione su Modo de Transporte: \n");
        frame.add(label3);

        String[] options = {"Automovil", "Motocicleta", "Autobus"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // JList
        JLabel label4 = new JLabel("\n Seleccione su Vivienda: \n");
        frame.add(label4);

        String[] items = {"Puerto Barrios", "Santo Tomas", "Entre Rios"};
        JList<String> list = new JList<>(items);
        frame.add(list);
        
        // JButton
        JButton button = new JButton("Aceptar");
        frame.add(button);
        
         // Agregar un ActionListener al botón
        button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Hola. Mucho Gusto: ").append(inputText).append("\n");
            mensaje.append("Casilla de Verificación: ").append(checkBox.isSelected() ? "Seleccionada" : "No seleccionada").append("\n");
            mensaje.append("Su Modalidad de Estudio es: ").append(radioButton1.isSelected() ? "Virtual" : "Presencial").append("\n");
            mensaje.append("Su Medio de Transporte es: ").append(comboBox.getSelectedItem()).append("\n");
            mensaje.append("Usted Viene de: ").append(Arrays.toString(list.getSelectedValuesList().toArray()));
            
            JOptionPane.showMessageDialog(frame, mensaje.toString());
        });

        // Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }
    
}
