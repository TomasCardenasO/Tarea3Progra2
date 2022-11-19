package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Moneda0 extends Moneda { 
    private int valor = 0;
    public Moneda0(int serie, int x, int y) {
        super(serie, x, y);
    }
    public int getValor() {
        return valor;
    }
    public void paint(Graphics g) {
    }
}
