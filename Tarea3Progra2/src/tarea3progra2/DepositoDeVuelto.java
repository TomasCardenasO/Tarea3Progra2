package tarea3progra2;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;

public class DepositoDeVuelto {
    protected int x, y;
    protected ArrayList <Moneda> arr;
    
    public DepositoDeVuelto(int x, int y) {
        this.x = x;
        this.y = y;
        arr = new ArrayList();
    }
    public void addMoneda(Moneda m) {
        arr.add(m);
    }
    public Moneda getMoneda() {
        Moneda aux;
        if(arr.size() == 0) {
            return null;
        } else {
            aux = arr.get(0);
            arr.remove(0);
            return aux;
        }
    }
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(x, y, 100, 50);
        g.setColor(Color.black);
        g.drawRect(x, y, 100, 50);
        if(!arr.isEmpty()) {
            int posicionMoneda = x + 5;
            for(int i = 0; i < 6 && i < arr.size(); i++) {
                arr.get(i).x = posicionMoneda;
                arr.get(i).y = y + 5;
                arr.get(i).paint(g);
                posicionMoneda += 10;
            }
        }
    }
}
