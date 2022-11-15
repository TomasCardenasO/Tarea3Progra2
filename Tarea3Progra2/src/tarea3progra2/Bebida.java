package tarea3progra2;
import java.awt.Graphics;

public abstract class Bebida {
    private int serie;
    public int x, y;
    
    public Bebida(int serie, int x, int y){
        this.serie = serie;
        this.x = x;
        this.y = y;
    }
    
    public int getSerie() {
        return this.serie;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void paint(Graphics g);
    
    public abstract String beber();
}
