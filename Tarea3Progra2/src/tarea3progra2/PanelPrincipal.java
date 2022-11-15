package tarea3progra2;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana 
    private Comprador com; 
    private Expendedor exp; 
    
    public PanelPrincipal() { 
        exp = new Expendedor(5, 800); 
        com = new Comprador(); 
        this.setBackground(Color.white); 
    } 
    public void paint(Graphics g) {
         super.paint(g);                
         com.paint(g);
         exp.paint(g);
    }   
}  