package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class CocaCola extends Bebida {
    public CocaCola(int serie, int x, int y) {
        super(serie, x ,y);
    }
    
    public void paint (Graphics g){
         
        g.setColor(Color.red.darker());
        g.fillRect(x,y,100,150);        //ajustar tamaño
        g.setColor(Color.white);
        g.fillOval(x+55, y+10,30, 30);              //ajustar tamaño
        g.fillOval(x+45, y+50,30,30);
        g.fillOval(x+55,y+90,30,30);
        g.drawString("#" + this.getSerie(), x + 45, y + 140);
    }
    
    public String beber() {
        return "cocacola";
    }
}
