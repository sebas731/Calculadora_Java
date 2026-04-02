
package edu.cientifica.botones;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class OperacionesBotones extends JPanel{
    
    JButton btnSumar,btnRestar,btnMultiplicar,btnDividir;
    float numero;
    Pantalla pantallita;
    String Operacion;
    Interfaz interfaz;
    public OperacionesBotones(Pantalla p,Interfaz i) {
        interfaz=i;
        pantallita=p;
        setLayout(new GridLayout(4,1,1,1));
        btnSumar = new JButton("+");
        btnSumar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
            private void btnSumarActionPerformed(ActionEvent evt) {
            numero=Float.parseFloat(pantallita.pantalla.getText());
            
            
            
            Operacion="Sumar";
            interfaz.Operacion(Operacion);
            interfaz.Numero1(pantallita.pantalla.getText());
            pantallita.pantalla.setText("");
            }

            
        }); 
        btnSumar.setPreferredSize(new Dimension( 20, 20 ));
        add( btnSumar );
        //restar
        btnRestar = new JButton("-");
        btnRestar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
            private void btnRestarActionPerformed(ActionEvent evt) {
            numero=Float.parseFloat(pantallita.pantalla.getText());
            
            
            
            Operacion="Restar";
            interfaz.Operacion(Operacion);
            interfaz.Numero1(pantallita.pantalla.getText());
            pantallita.pantalla.setText("");
            }

            
        }); 
        btnRestar.setPreferredSize(new Dimension( 20, 20 ));
        add( btnRestar );
        //multiplicar
        btnMultiplicar = new JButton("x");
        btnMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
            private void btnMultiplicarActionPerformed(ActionEvent evt) {
            numero=Float.parseFloat(pantallita.pantalla.getText());
            
            
            
            Operacion="Multiplicar";
            interfaz.Operacion(Operacion);
            interfaz.Numero1(pantallita.pantalla.getText());
            pantallita.pantalla.setText("");
            }

            
        }); 
        btnMultiplicar.setPreferredSize(new Dimension( 20, 20 ));
        add( btnMultiplicar );
        //dividir
        btnDividir = new JButton("/");
        btnDividir.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
            private void btnDividirActionPerformed(ActionEvent evt) {
            numero=Float.parseFloat(pantallita.pantalla.getText());
            
            
            
            Operacion="Dividir";
            interfaz.Operacion(Operacion);
            interfaz.Numero1(pantallita.pantalla.getText());
            pantallita.pantalla.setText("");
            }

            
        }); 
        btnDividir.setPreferredSize(new Dimension( 20, 20 ));
        add( btnDividir );
    }
    
    
    
}

