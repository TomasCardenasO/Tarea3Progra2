package tarea3progra2;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana 
    private Expendedor exp; 
    private Comprador com;
    private Moneda100 moneda100;
    private Moneda400 moneda400;
    private Moneda500 moneda500;
    private Moneda1000 moneda1000;
    private Moneda0 moneda0;
 
    public PanelPrincipal() { 
        exp = new Expendedor(100, 30, 5, 400);
        com = new Comprador(exp);
        moneda100 = new Moneda100(4, 50, 200);
        moneda400 = new Moneda400(1, 50, 250);
        moneda500 = new Moneda500(7, 50, 300);
        moneda1000 = new Moneda1000(8, 50, 440); 
        moneda0 = new Moneda0(0,0,0);
        this.setBackground(Color.white); 
        Botones();
        com.setMoneda(moneda400);
    } 
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Amarillo = 100$, Naranjo = 400$, Gris = 500$, Verde = 1000$.", 10, Ventana.largo - 50);
        exp.paint(g);
        com.paint(g);
        moneda100.paint(g);
        moneda400.paint(g);
        moneda500.paint(g);
        moneda1000.paint(g);
    }
    public void repaint() {
        
    }
    public void Botones(){
        this.setLayout(null);
        Boton botonFanta = new Boton("Fanta");
        botonFanta.setBounds(1000,100,100,50);
        this.add(botonFanta);
      
        this.setLayout(null);
        Boton botonSprite = new Boton("Sprite");
        botonSprite.setBounds(1000,150,100,50);
        this.add(botonSprite);
        
        this.setLayout(null);
        Boton botonCoca = new Boton("CocaCola");
        botonCoca.setBounds(1000,200,100,50);
        this.add(botonCoca);
    } 
    private class Boton extends JButton implements MouseListener {
        private int x;
        public Boton(String s) {
            super(s);
            this.addMouseListener(this);
            if(s.equals("Fanta") == true){
                x = 1;
            }
            else if(s.equals("Sprite") == true){
                x = 2;
            }
            else if(s.equals("CocaCola") == true){
                x = 3;
            }
        }
        public void mouseClicked(MouseEvent e) {
            if(x == 1){
                com.comprar(1);
                this.repaint();
            }
            else if(x == 2){
                com.comprar(2);
                this.repaint();
            }
            else if(x == 3){
                com.comprar(3);
                this.repaint();
            }
        }
        public void mousePressed(MouseEvent e){
            
        }
        public void mouseReleased(MouseEvent e) {
            
        }
        public void mouseEntered(MouseEvent e) {
            
        }
        public void mouseExited(MouseEvent e) {
            
        }
    }
}  
