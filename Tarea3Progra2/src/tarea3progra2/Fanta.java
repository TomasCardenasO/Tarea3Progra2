package tarea3progra2;
import java.awt.Color;
import java.awt.Graphics;

public class Fanta extends Bebida {
    public Fanta(int serie, int x, int y) {
        super(serie, x ,y);
    }
    
    public void paint (Graphics g){
         
        g.setColor(new Color(245,150,8));
        g.fillRect(x,y,100,150);        //ajustar tamaño
        g.setColor(Color.green.darker());
        g.fillOval(x+55, y+10,30, 30);   
        g.fillOval(x+55,y+90,30,30);       //ajustar tamaño
        g.setColor(Color.blue);
        g.fillOval(x+45, y+50,30,30);
        g.drawString("#" + this.getSerie(), x + 45, y + 140);
    }
    
    public String beber() {
        return "fanta";
    }
}
