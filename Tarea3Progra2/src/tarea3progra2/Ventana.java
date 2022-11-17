package tarea3progra2;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame {
    private PanelPrincipal panel0;
    public static int ancho = 1300;
    public static int largo = 700;
    
    public Ventana() {
        this.setLayout(new BorderLayout());
        panel0 = new PanelPrincipal();
        this.add(panel0, BorderLayout.CENTER);
        setTitle("Máquina Expendedora");
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(ancho,largo);
        this.setVisible(true);
    }
}