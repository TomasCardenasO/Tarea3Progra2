package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Moneda100 extends Moneda { 
    private int valor = 100;
    
    public Moneda100(int serie, int x, int y) {
        super(serie, x, y);
    }
    public int getValor() {
        return valor;
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 40, 40);
        g.setColor(Color.black);
        g.drawOval(x, y, 40, 40);
        g.drawString("#" + this.getSerie(), x + 5, y + 23);
    }
}
