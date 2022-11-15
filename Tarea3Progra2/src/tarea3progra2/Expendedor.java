package tarea3progra2;
import exceptions.NoHayBebidaException;
import exceptions.PagoIncorrectoException;
import exceptions.PagoInsuficienteException;

public class Expendedor {
    private Deposito depositoFanta;
    private Deposito depositoSprite;
    private Deposito depositoCocaCola;
    private DepositoDeVuelto depositoVuelto;
    private int precioBebidas;
    
    public Expendedor(int numBebidas, int precioBebidas) {
        depositoFanta = new Deposito(0, 0); //Editar posicion
        depositoSprite= new Deposito(0,0);
        depositoCocaCola = new Deposito(0,0);
        depositoVuelto = new DepositoDeVuelto();
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
                            return b;
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
                            return b;
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
                            return b;
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
}
