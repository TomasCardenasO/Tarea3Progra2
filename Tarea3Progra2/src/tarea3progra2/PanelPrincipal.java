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
 
    public PanelPrincipal() { 
        this.setBackground(Color.white);
        Botones();
        exp = new Expendedor(100, 30, 5, 400);
        com = new Comprador(exp);
    } 
    public void paint(Graphics g) {
        super.paint(g);
<<<<<<< HEAD
        if(com.m == null){
            g.drawString("Amarillo = 100$, Gris = 500$, Verde = 1000$.", 10, Ventana.largo - 50);

        }else{
            g.drawString("Amarillo = 100$, Gris = 500$, Verde = 1000$. Moneda actual:" + com.m.getValor(), 10, Ventana.largo - 50);
        }
=======
        g.drawString("Amarillo = 100$, Naranjo = 400$, Gris = 500$, Verde = 1000$.", 10, Ventana.largo - 50);
>>>>>>> 13da331f96d95de7b2567d609299967092b2513e
        exp.paint(g);
        com.paint(g);
    }
    public void Botones(){
        this.setLayout(null);
        Boton botonFanta = new Boton("Fanta", this);
        botonFanta.setBounds(1000,100,100,50);
        this.add(botonFanta);
      
        this.setLayout(null);
        Boton botonSprite = new Boton("Sprite", this);
        botonSprite.setBounds(1000,150,100,50);
        this.add(botonSprite);
        
        this.setLayout(null);
        Boton botonCoca = new Boton("CocaCola", this);
        botonCoca.setBounds(1000,200,100,50);
        this.add(botonCoca);
        
        this.setLayout(null);
        Boton boton100 = new Boton("100", this);
        boton100.setBounds(1000,300,100,50);
        this.add(boton100);
      
        this.setLayout(null);
        Boton boton500 = new Boton("500", this);
        boton500.setBounds(1000,350,100,50);
        this.add(boton500);
        
        this.setLayout(null);
        Boton boton1000 = new Boton("1000", this);
        boton1000.setBounds(1000,400,100,50);
        this.add(boton1000);
        
        this.setLayout(null);
        Boton botonRetirar = new Boton("Retirar", this);
        botonRetirar.setBounds(10,480,80,30);
        this.add(botonRetirar);
    } 
    private class Boton extends JButton implements MouseListener {
        private int x;
<<<<<<< HEAD
        private int y = 1;
=======
>>>>>>> 13da331f96d95de7b2567d609299967092b2513e
        private PanelPrincipal panel;
        public Boton(String s, PanelPrincipal panel) {
            super(s);
            this.addMouseListener(this);
            this.panel = panel;
            if(s.equals("Fanta") == true){
                x = 1;
            }
            else if(s.equals("Sprite") == true){
                x = 2;
            }
            else if(s.equals("CocaCola") == true){
                x = 3;
            }
            else if(s.equals("100") == true){
                x = 4;
            }
            else if(s.equals("500") == true){
                x = 5;
            }
            else if(s.equals("1000") == true){
                x = 6;
            }
            else if(s.equals("Retirar") == true){
                x = 7;
            }
        }
        public void mouseClicked(MouseEvent e) {
            if(x == 1){
                com.comprar(1);
                panel.repaint();
                
            }
            else if(x == 2){
                com.comprar(2);
                panel.repaint();
            }
            else if(x == 3){
                com.comprar(3);
                panel.repaint();
            }
            else if(x == 4){
<<<<<<< HEAD
                com.Takemoney100(y,850,500); //Hay que poner el numero de serie de las monedas en random
                panel.repaint();
                System.out.println(com.m.getValor());
                this.y = y +1;
            }
            else if(x == 5){
                com.Takemoney500(y,850,500);
                panel.repaint();
                System.out.println(com.m.getValor());
                this.y = y +1;

            }
            else if(x == 6){
                com.Takemoney1000(y,850,500);
                panel.repaint();
                System.out.println(com.m.getValor());
                this.y = y +1;
=======
                com.Takemoney100(2,850,500); //Hay que poner el numero de serie de las monedas en random
                panel.repaint();
                System.out.println(com.m.getValor());

            }
            else if(x == 5){
                com.Takemoney500(3,850,500);
                panel.repaint();
                System.out.println(com.m.getValor());

            }
            else if(x == 6){
                com.Takemoney1000(4,850,500);
                panel.repaint();
                System.out.println(com.m.getValor());
>>>>>>> 13da331f96d95de7b2567d609299967092b2513e

            }
            else if(x == 7) {
                com.getBebida();
                panel.repaint();
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
