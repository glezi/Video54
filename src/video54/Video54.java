/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video54;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author gleez
 */
public class Video54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reloj mireloj=new Reloj(2000,true); 
        mireloj.enMarcha(); 
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0); 
    }
    
}
class Reloj{
    public Reloj(int intervalo, boolean sonido){
        this.intervalo=intervalo; 
        this.sonido=sonido; 
    }
    
    public void enMarcha(){
        ActionListener oyente = new DameLaHora2(); 
       // Timer mitemporizador = new Timer(intervalo, oyente); 
        //mitemporizador.start(); 
    }
    private int intervalo; 
    private boolean sonido; 
    
    private class DameLaHora2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           //To change body of generated methods, choose Tools | Templates.
           
           Date hora = new Date(); 
           
           System.out.println("Te pongo la hora cada 3 segundos"+ hora);
           
           if(sonido){
               Toolkit.getDefaultToolkit().beep(); 
           }
        }
        
    }
}