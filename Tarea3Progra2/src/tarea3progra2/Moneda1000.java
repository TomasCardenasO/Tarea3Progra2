package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Moneda1000 extends Moneda {
    public Moneda1000(int serie, int x, int y) {
        super(serie, x, y);
    }
    public int getValor() {
        return 1000;
    }
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, 40, 40);
        g.setColor(Color.black);
        g.drawOval(x, y, 40, 40);
        g.drawString("#" + this.getSerie(), x + 5, y + 23);
    }
}
