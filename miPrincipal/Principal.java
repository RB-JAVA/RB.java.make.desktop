package miPrincipal;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

    public static void main(String[] args) {
        // Crear y configurar la ventana
        JFrame frame = new JFrame("Hola Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Añadir la etiqueta "Hola Mundo"
        JLabel label = new JLabel("Hola Mundo");
        frame.getContentPane().add(label);

        // Añadir el botón con etiqueta Ok
        JButton button = new JButton("Ok");
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}