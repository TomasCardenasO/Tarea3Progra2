package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Moneda500 extends Moneda {
    int valor = 500;
    public Moneda500(int serie, int x, int y) {
        super(serie, x, y);
    }
    public int getValor() {
        return 500;
    }
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillOval(x, y, 40, 40);
        g.setColor(Color.black);
        g.drawOval(x, y, 40, 40);
        g.drawString("#" + this.getSerie(), x + 5, y + 23);
    }
}
