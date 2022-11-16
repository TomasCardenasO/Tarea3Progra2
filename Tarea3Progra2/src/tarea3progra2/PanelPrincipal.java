package tarea3progra2;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana 
    private Comprador com; 
    private Expendedor exp; 
    private Moneda100 moneda100;
    private Moneda400 moneda400;
    private Moneda500 moneda500;
    private Moneda1000 moneda1000;
    private CocaCola CocaCola;
    private Fanta Fanta;
    private Sprite Sprite;
    
    public PanelPrincipal() { 
        exp = new Expendedor(700, 100, 5, 800); 
        /*com = new Comprador();*/
        moneda100 = new Moneda100(5, 50, 200); //parametros random
        moneda400 = new Moneda400(6, 100, 200);
        moneda500 = new Moneda500(7, 150, 200);
        moneda1000 = new Moneda1000(8, 200, 200);
        CocaCola = new CocaCola(1,500,100); 
        Fanta = new Fanta(2,650,100);
        Sprite = new Sprite(3,800,100);
        
        this.setBackground(Color.white); 
    } 
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Amarillo = 100$, Naranjo = 400$, Gris = 500$, Verde = 1000$.", 10, Ventana.largo - 50);
        moneda100.paint(g);
        moneda400.paint(g);
        moneda500.paint(g);
        moneda1000.paint(g);
        CocaCola.paint(g);
        Fanta.paint(g);
        Sprite.paint(g);
        exp.paint(g);
        /*com.paint(g);*/
    }
    
    
}  