package tarea3progra2;
import exceptions.NoHayBebidaException;
import exceptions.PagoIncorrectoException;
import exceptions.PagoInsuficienteException;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;

/*public class Comprador {
    private String queBebio;
    private int vuelto;
    private Image mano;
            
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        try {
            vuelto = 0;
            Moneda monedaVuelto;
            Boolean t = true;
            Bebida b = exp.comprarBebida(m, cualBebida);
            queBebio = b.beber();
            while(t) {
                monedaVuelto = exp.getVuelto();
                if(monedaVuelto == null) {
                    t = false;
                    break;
                } else {
                    vuelto += monedaVuelto.getValor();
                }
            }
            
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
    public void getBebida() {
        //para retirar la bebida del deposito
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
    }
}
*/