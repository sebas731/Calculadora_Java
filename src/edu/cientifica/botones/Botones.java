package edu.cientifica.botones;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import edu.cientifica.botones.Interfaz;


public class Botones extends JPanel implements ActionListener{
    
    public JButton btnIgual,btnPunto,btnNumero0,btnNumero1,btnNumero2,btnNumero3,btnNumero4
            ,btnNumero5,btnNumero6,btnNumero7,btnNumero8,btnNumero9,btnClear;
    private Interfaz ventana;
    Pantalla pantallita;
    String cadena;
     public Botones(Pantalla p){
        // ventana = venta;
        pantallita=p;
        setLayout( new GridLayout(4,3,1,1));
        
        btnNumero1 = new JButton("1");
        btnNumero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero1ActionPerformed(evt);
            }
            private void btnNumero1ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"1");
            }

            
        });
        btnNumero1.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero1 );
        btnNumero2 = new JButton("2");
        btnNumero2.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero2ActionPerformed(evt);
            }
            private void btnNumero2ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"2");
            }

            
        });
        btnNumero2.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero2 );
        btnNumero3 = new JButton("3");
        btnNumero3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero3ActionPerformed(evt);
            }
            private void btnNumero3ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"3");
            }

            
        });
        btnNumero3.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero3 );
        //boton 4
        btnNumero4 = new JButton("4");
        btnNumero4.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero4ActionPerformed(evt);
            }
            private void btnNumero4ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"4");
            }

            
        });
        btnNumero4.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero4 );
        btnNumero5 = new JButton("5");
        btnNumero5.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero5ActionPerformed(evt);
            }
            private void btnNumero5ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"5");
            }

            
        });
        btnNumero5.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero5 );
        //
        btnNumero6 = new JButton("6");
        btnNumero6.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero6ActionPerformed(evt);
            }
            private void btnNumero6ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"6");
            }

            
        });
        btnNumero6.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero6 );
        //boton 7
        btnNumero7 = new JButton("7");
        btnNumero7.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero7ActionPerformed(evt);
            }
            private void btnNumero7ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"7");
            }

            
        });
        btnNumero7.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero7 );
        //boton 8
        btnNumero8 = new JButton("8");
        btnNumero8.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero8ActionPerformed(evt);
            }
            private void btnNumero8ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"8");
            }

            
        });
        btnNumero8.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero8 );
        //boton 9
        btnNumero9 = new JButton("9");
        btnNumero9.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero9ActionPerformed(evt);
            }
            private void btnNumero9ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"9");
            }

            
        });
        btnNumero9.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero9 );
        //clear
        btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
            private void btnClearActionPerformed(ActionEvent evt) {
                pantallita.pantalla.setText("");
            }

            
        });
        btnClear.setPreferredSize(new Dimension( 20, 20 ));
        add( btnClear );
        //boton 0
        btnNumero0 = new JButton("0");
        btnNumero0.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNumero0ActionPerformed(evt);
            }
            private void btnNumero0ActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+"0");
            }

            
        });
        btnNumero0.setPreferredSize(new Dimension( 20, 20 ));
        add( btnNumero0 );
        
        btnPunto = new JButton(".");
        btnPunto.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
            private void btnPuntoActionPerformed(ActionEvent evt) {
            pantallita.pantalla.setText(pantallita.pantalla.getText()+".");
            }

            
        });
        btnPunto.setPreferredSize(new Dimension( 20, 20 ));
        add( btnPunto );
       
        
                
    }
     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
    
  
    
}
