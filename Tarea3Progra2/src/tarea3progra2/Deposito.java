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
        g.fillRect(x, y, 70, 370);
        g.setColor(Color.black);
        g.drawRect(x, y, 70, 370);
        if(!arr.isEmpty()) { //Si el arreglo no esta vacio haz lo siguiente
            int alturaLata = y + 280;
            for(int i = 0; i < 4 && i < arr.size(); i++) { //Recorre el arreglo hasta el cuarto elemento maximo
                arr.get(i).x = this.x + 10;
                arr.get(i).y = alturaLata;
                arr.get(i).paint(g);
                alturaLata -= 90;
            }
        }
     
        

    }
    public void painted(Graphics g) {
        
        g.setColor(Color.gray);
        g.fillRect(x, y, 70, 370);
        g.setColor(Color.black);
        g.drawRect(x, y, 70, 370);
        if(!arr.isEmpty()) { //Si el arreglo no esta vacio haz lo siguiente
            int alturaLata = y + 280;
            for(int i = 0; i < 6 && i < arr.size(); i++) { //Recorre el arreglo hasta el cuarto elemento maximo
                arr.get(i).x = this.x + 10;
                arr.get(i).y = alturaLata;
                arr.get(i).paint(g);
                alturaLata -= 90;
            }
        }
     
        

    }
}