package tarea3progra2;

public abstract class Moneda {
    public Moneda() {
        
    }
    public String getSerie() {
        return this.toString();
    }
    public abstract int getValor();
    
    public String toString() {
        return "Valor: " + this.getValor() + ", " + "Serie: " + super.toString();
    }
}
