package s3;
import java.util.Observable;
import java.util.Observer;

public class pantallaTemperatura implements Observer {
    private float temperaturaObservador;
    
    @Override
    public void update(Observable o, Object temp) {
        this.temperaturaObservador = (float) temp;
    }
    
    public float getTemperatura() {
        return this.temperaturaObservador;
    }
    
    public void pedirTemperatura(Observable o) {
        this.temperaturaObservador = ((Simulador) o).getTemperatura();
    }
}
