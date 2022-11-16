package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Fanta extends Bebida {
    public Fanta(int serie, int x, int y) {
        super(serie, x, y);
    }
    
    public void paint (Graphics g){
         
        g.setColor(new Color(245,150,8));
        g.fillRect(x,y, 50, 80);
        g.setColor(Color.black);
        g.drawRect(x, y, 50, 80);
        g.setColor(Color.green.darker());
        g.fillOval(x+30, y+10,15, 15);   
        g.fillOval(x+30,y+50,15,15);
        g.setColor(Color.blue);
        g.fillOval(x+15, y+30,15,15);
        g.drawString("#" + this.getSerie(), x + 15, y + 75);
    }
    
    public String beber() {
        return "fanta";
    }
}
