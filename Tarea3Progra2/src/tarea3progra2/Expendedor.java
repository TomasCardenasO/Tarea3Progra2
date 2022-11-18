package tarea3progra2;
import exceptions.NoHayBebidaException;
import exceptions.PagoIncorrectoException;
import exceptions.PagoInsuficienteException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Expendedor{
    public Deposito depositoFanta;
    private Deposito depositoSprite;
    private Deposito depositoCocaCola;
    private DepositoDeVuelto depositoVuelto;
    private DepositoDeVuelto depositoTragaMonedas;
    private Bebida depositoBebida;
    private int precioBebidas;
    public int x, y;
    private Image banner;
    
    public Expendedor(int x, int y, int numBebidas, int precioBebidas) {
        this.x = x;
        this.y = y;
        depositoFanta = new Deposito(this.x + 20, this.y + 20);
        depositoSprite= new Deposito(this.x + 90,this.y + 20);
        depositoCocaCola = new Deposito(this.x + 160,this.y + 20);
        depositoVuelto = new DepositoDeVuelto();
        depositoTragaMonedas = new DepositoDeVuelto();
        for(int i = 0; i < numBebidas; i++) {
            Fanta f = new Fanta(i, 0, 0);
            depositoFanta.addBebida(f);
            Sprite s = new Sprite(i + 1000, 0, 0);
            depositoSprite.addBebida(s);
            CocaCola c = new CocaCola(i + 2000, 0, 0);
            depositoCocaCola.addBebida(c);
        }
        this.precioBebidas = precioBebidas;
    }
    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        int vuelto;
        Bebida b;
        if(m == null) {
            throw new PagoIncorrectoException("Pago no valido");
        } else {
            switch(cual) {
                case 1:
                    if(m.getValor() >= precioBebidas) {
                        b = depositoFanta.getBebida();
                        if(b == null) {
                            depositoVuelto.addMoneda(m);
                            throw new NoHayBebidaException("No quedan Fanta");
                        } else {
                            vuelto = m.getValor() - precioBebidas;
                            for(int i = 0; i < vuelto/100; i++) {
                                Moneda100 mon100 = new Moneda100(i, 100, 100); //posicion random
                                depositoVuelto.addMoneda(mon100);
                            }
                            depositoBebida = b;
                            depositoBebida.x = this.x + 100;
                            depositoBebida.y = this.y + 420;
                            depositoTragaMonedas.addMoneda(m);
                        }
                    } else {
                        depositoVuelto.addMoneda(m);
                        throw new PagoInsuficienteException("Pago insuficiente");
                    }
                case 2:
                    if(m.getValor() >= precioBebidas) {
                        b = depositoSprite.getBebida();
                        if(b == null) {
                            depositoVuelto.addMoneda(m);
                            throw new NoHayBebidaException("No quedan Sprite");
                        } else {
                            vuelto = m.getValor() - precioBebidas;
                            for(int i = 0; i < vuelto/100; i++) {
                                Moneda100 mon100 = new Moneda100(i, 100, 100);
                                depositoVuelto.addMoneda(mon100);
                            }
                            depositoBebida = b;
                            depositoBebida.x = this.x + 100;
                            depositoBebida.y = this.y + 420;
                            depositoTragaMonedas.addMoneda(m);
                        }
                    } else {
                        depositoVuelto.addMoneda(m);
                        throw new PagoInsuficienteException("Pago insuficiente");
                    }
                case 3:
                    if(m.getValor() >= precioBebidas) {
                        b = depositoCocaCola.getBebida();
                        if(b == null) {
                            depositoVuelto.addMoneda(m);
                            throw new NoHayBebidaException("No quedan CocaCola");
                        } else {
                            vuelto = m.getValor() - precioBebidas;
                            for(int i = 0; i < vuelto/100; i++) {
                                Moneda100 mon100 = new Moneda100(i, 100, 100);
                                depositoVuelto.addMoneda(mon100);
                            }
                            depositoBebida = b;
                            depositoBebida.x = this.x + 100;
                            depositoBebida.y = this.y + 420;
                            depositoTragaMonedas.addMoneda(m);
                        }
                    } else {
                        depositoVuelto.addMoneda(m);
                        throw new PagoInsuficienteException("Pago insuficiente");
                    }
                default:
                    depositoVuelto.addMoneda(m);
                    throw new NoHayBebidaException("Boton no valido");
                    
           
            }
        }
    }
    public Moneda getVuelto() {
        return depositoVuelto.getMoneda();
    }
    public void paint(Graphics g) {
        banner = new ImageIcon(getClass().getResource("/Imagenes/BannerCocaCola.png")).getImage();
        g.setColor(Color.black);
        g.fillRect(x, y, 370, 600);
        depositoFanta.paint(g);
        depositoSprite.paint(g);
        depositoCocaCola.paint(g);
        g.setColor (new Color(0,247,255,100));
        g.fillRect(x+20,y+20,210,370);
        g.setColor(Color.gray);
        g.fillRect(x + 90, y + 410, 70, 90);
        g.fillRect(x+290,y+200,20,50);
        g.fillRect(x+260,y+300,70,30);
        g.setColor(Color.black);
        g.fillRect(x+295,y+210,10,30);
        g.drawImage(banner, x+5, y+510, 360, 85,null);
        if(depositoBebida != null) {
            depositoBebida.paint(g);   
        }
    }
    public void painted(Graphics g) {
        banner = new ImageIcon(getClass().getResource("/Imagenes/BannerCocaCola.png")).getImage();
        g.setColor(Color.black);
        g.fillRect(x, y, 440, 690);
        depositoFanta.painted(g);
        depositoSprite.painted(g);
        depositoCocaCola.painted(g);
        g.setColor (new Color(0,247,255,100));
        g.fillRect(x+20,y+20,210,370);
        g.setColor(Color.blue);
        g.fillRect(x + 90, y + 410, 70, 90);
        g.fillRect(x+290,y+200,20,50);
        g.fillRect(x+260,y+300,70,30);
        g.setColor(Color.black);
        g.fillRect(x+295,y+210,10,30);
        g.drawImage(banner, x+5, y+510, 360, 85,null);
        if(depositoBebida != null) {
            depositoBebida.paint(g);   
        }
    }
}
