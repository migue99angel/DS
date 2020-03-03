package s3;
import java.util.Observable;
import java.util.Observer;

public class graficaTemperatura implements Observer {
    private float temperaturaObservador;
    
    @Override
    public void update(Observable o, Object temp) {
        this.temperaturaObservador = (float) temp;
    }
}
