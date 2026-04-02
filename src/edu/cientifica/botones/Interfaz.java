
package edu.cientifica.botones;
import edu.cientifica.botones.Pantalla;

import edu.cientifica.botones.Botones;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Interfaz extends JFrame implements ActionListener{
    public Botones boton;
    public Pantalla pantalla;
    public OperacionesBotones operaciones;
    private String operacion,numero1;
    public void Operacion(String o){
      operacion=o; 
    }
    public String Operacion(){
      return operacion;  
    }
    public void Numero1(String n){
      numero1=n; 
    }
    public String Numero1(){
      return numero1;  
    }
    public Interfaz(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //setLayout( new BorderLayout());
      //   setLayout(new GridLayout(2,1));
         pantalla =new Pantalla();
         add(pantalla);
      //   pantalla.setBounds(0,0,299, 75);
      //   add(pantalla,BorderLayout.PAGE_START );
         
        boton =new Botones(pantalla);
        boton.setBounds(5,80,200,200);
        add(boton);
        
        
       //  add(boton,BorderLayout.CENTER);
        operaciones = new  OperacionesBotones(pantalla,this);
        operaciones.setBounds(206,80,60,200);
        add(operaciones);
        JButton btnIgual = new JButton("=");
        btnIgual.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }

            private void btnIgualActionPerformed(ActionEvent evt) {
                if (Operacion().equalsIgnoreCase("Sumar")) {
                   //System.out.println(Numero1());
                    float numero2 = Float.parseFloat(pantalla.pantalla.getText());
                    float numero1= Float.parseFloat(Numero1());
                    float resul = numero1+numero2;
                    pantalla.pantalla.setText(""+resul);
                }else if(Operacion().equalsIgnoreCase("Restar")){
                    float numero2 = Float.parseFloat(pantalla.pantalla.getText());
                    float numero1= Float.parseFloat(Numero1());
                    float resul = numero1-numero2;
                    pantalla.pantalla.setText(""+resul);
                }else if(Operacion().equalsIgnoreCase("Multiplicar")){
                    float numero2 = Float.parseFloat(pantalla.pantalla.getText());
                    float numero1= Float.parseFloat(Numero1());
                    float resul = numero1*numero2;
                    pantalla.pantalla.setText(""+resul);
                }else if(Operacion().equalsIgnoreCase("Dividir")){
                    float numero2 = Float.parseFloat(pantalla.pantalla.getText());
                    float numero1= Float.parseFloat(Numero1());
                    float resul = numero1/numero2;
                    pantalla.pantalla.setText(""+resul);
                }
               Operacion();
            }
        });
        
        btnIgual.setBounds(5, 280,200,49);
        add( btnIgual  );
        JButton btnHola = new JButton("H");
        btnHola.setBounds(206,280,60,49);
        btnHola.setBackground(Color.red);
        btnHola.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHolaActionPerformed(evt);
            }
        });
        add(btnHola);
    }
    
    public static void main(String[] args) {
      Interfaz inter=new Interfaz();
      inter.setBounds(0,0,285,420);
      inter.setResizable(false);
      inter.setLocationRelativeTo(null);
      inter.setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    private void btnHolaActionPerformed(ActionEvent evt) {  
        pantalla.pantalla.setText(pantalla.pantalla.getText()+"hola");
    }

    

   
    
}
