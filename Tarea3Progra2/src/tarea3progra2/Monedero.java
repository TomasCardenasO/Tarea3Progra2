package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Monedero extends DepositoDeVuelto {
    public Monedero(int x, int y) {
        super(x, y);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(x, y, 50, 180);
        if(!arr.isEmpty()) {
            int posicionMoneda = y + 135;
            for(int i = 0; i < 14 && i < arr.size(); i++) {
                arr.get(i).x = x + 5;
                arr.get(i).y = posicionMoneda;
                arr.get(i).paint(g);
                posicionMoneda -= 10;
            }
        }
    }
}
