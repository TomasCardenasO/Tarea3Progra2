package tarea3progra2;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;

public class Deposito {
    private int x, y;
    private ArrayList <Bebida> arr;
    public Deposito(int x, int y) {
        arr = new ArrayList();
        this.x = x;
        this.y = y;
    }
    public void addBebida(Bebida b) {
        arr.add(b);
    }
    public Bebida getBebida() {
        Bebida aux;
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
        g.fillRect(x, y, 130, 370);
        for(int i = 0; i < this.arr.size(); i++) {
            
        }
    }
}
