
package edu.cientifica.botones;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import edu.cientifica.botones.Interfaz;
import javax.swing.border.*;
public class Pantalla extends JPanel {
    public JLabel pantalla;
    public BorderFactory b;
    public Pantalla(){
        setLayout(new GridLayout(1, 1));
        setBounds(20,9,230, 60);
        pantalla = new JLabel();
       // pantalla.setBounds(5, 9, 280, 50);
        pantalla.setOpaque(true);
        pantalla.setBackground(Color.WHITE);
        pantalla.setHorizontalTextPosition(SwingConstants.RIGHT);
        //pantalla.setText("soy una calculadora");
        pantalla.setBorder(b.createLineBorder(new Color(0, 0, 0)));
        add(pantalla);
    }
}
