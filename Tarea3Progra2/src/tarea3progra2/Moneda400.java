package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Moneda400 extends Moneda {
    public Moneda400(int serie, int x, int y) {
        super(serie, x, y);
    }
    public int getValor() {
        return 400;
    }
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(x, y, 40, 40);
        g.setColor(Color.black);
        g.drawOval(x, y, 40, 40);
        g.drawString("#" + this.getSerie(), x + 5, y + 23);
    }
}
