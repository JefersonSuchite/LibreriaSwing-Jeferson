/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
        JLabel label = new JLabel("Ingrese Texto a Mostrar:");
        frame.add(label);

        // JTextField 
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Aceptar");
        frame.add(button);

        // Agregar un ActionListener al botón
        button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            JOptionPane.showMessageDialog(frame, "Texto ingresado: " + inputText);
        });

        // JCheckBox verificacion
        JCheckBox checkBox = new JCheckBox("Casilla de verificación");
        frame.add(checkBox);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        frame.add(radioButton1);
       // radioButton1.setBackground(Color.blue);
        frame.add(radioButton2);

        // JComboBox
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // JList
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        frame.add(list);

        // Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }
    
}
