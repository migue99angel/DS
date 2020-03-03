package s3;
import java.util.Observable;
import java.util.Observer;

public class botonCambio implements Observer {
    private float temperaturaObservador;
    
    @Override
    public void update(Observable o, Object temp) {
        this.temperaturaObservador = (float) temp;
    }
}
