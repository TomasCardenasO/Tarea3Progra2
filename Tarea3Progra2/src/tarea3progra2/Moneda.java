package tarea3progra2;
import java.awt.Graphics;

public abstract class Moneda {
    private int serie;
    public int x, y;
    public int valor;
    
    public Moneda(int serie, int x, int y) {
        this.serie = serie;
        this.x = x;
        this.y = y;
    }
    public int getSerie() {
        return this.serie;
    }
    
    public abstract int getValor();
    
    public abstract void paint(Graphics g);
    
    public String toString() {
        return "Valor: " + this.getValor() + ", " + "Serie: " + this.serie;
    }
}
