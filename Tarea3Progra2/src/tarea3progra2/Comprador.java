package tarea3progra2;
import exceptions.NoHayBebidaException;
import exceptions.PagoIncorrectoException;
import exceptions.PagoInsuficienteException;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Comprador {
    private String queBebio;
    private int vuelto;
    private Image mano;
    private Image manoizq;
    public Bebida bebida;
    private Monedero monedero;
    Moneda m;
    Expendedor exp;
    
            
    public Comprador(Expendedor exp) {
        m = null;
        this.exp = exp;
        monedero = new Monedero(1150, 450);
    }
    public void comprar(int cualBebida) {
        try {
            exp.comprarBebida(m, cualBebida);
            m = null;
            
        } catch(PagoIncorrectoException incorrecto) {
            System.out.println(incorrecto.getMessage()); //no estoy seguro de qué poner aquí, hay que probar el getMessage
        } catch(PagoInsuficienteException insuficiente) {
            Moneda monedaVuelto = exp.getVuelto();
            vuelto = monedaVuelto.getValor();
            System.out.println(insuficiente.getMessage());
        } catch(NoHayBebidaException noHay) {
            Moneda monedaVuelto = exp.getVuelto();
            vuelto = monedaVuelto.getValor();
            System.out.println(noHay.getMessage());
        }
        
    }
    public void Takemoney100(int x,int y,int z){
        Moneda100 moneda = new Moneda100(x,y,z);
        m = moneda;
    }
    public void Takemoney400(int x, int y, int z) {
        Moneda400 moneda = new Moneda400(x, y, z);
        m = moneda;
    }
    public void Takemoney500(int x,int y,int z){
        Moneda500 moneda = new Moneda500(x,y,z);
        m = moneda;
    }
    public void Takemoney1000(int x,int y,int z){
        Moneda1000 moneda = new Moneda1000(x,y,z);
        m = moneda;
    }
    public void getBebida() {
        if(exp.depositoBebida != null) {
            bebida = exp.depositoBebida;
            exp.depositoBebida = null;
            bebida.x = 580;
            bebida.y = 500;
        }
    }
    public void getVuelto() {
            vuelto = 0;
            Moneda monedaVuelto;
            Boolean t = true;
             while(t) {
                monedaVuelto = exp.getVuelto();
                if(monedaVuelto == null) {
                    t = false;
                } else {
                    monedero.addMoneda(monedaVuelto);
                    vuelto += monedaVuelto.getValor();
                }
            }
    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queBebiste() {
        return queBebio;
    }
    public void paint(Graphics g){
        mano = new ImageIcon(getClass().getResource("/Imagenes/DoomHand.png")).getImage();
        g.drawImage(mano, 800, 400, 400, 400,null);
        manoizq = new ImageIcon(getClass().getResource("/Imagenes/DoomHandLeft.png")).getImage();
        g.drawImage(manoizq, 300, 400, 400, 400,null);
        monedero.paint(g);
       
        if(m != null) {
            m.paint(g);
        }
        if(bebida != null) {
            bebida.paint(g);
        }
    }
}