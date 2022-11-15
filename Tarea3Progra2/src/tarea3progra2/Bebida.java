package tarea3progra2;
import java.awt.Graphics;

public abstract class Bebida {
    private int serie;
    public int x, y;
    
    public Bebida(int Serie, int x, int y){
        this.serie = Serie;
        this.x = x;
        this.y = y;
    }
    
    public int getSerie() {
        return this.serie;
    }
    
    public abstract void paint(Graphics g);
    public abstract String beber();
}
