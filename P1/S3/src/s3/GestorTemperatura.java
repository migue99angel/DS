package s3;
import java.util.ArrayList;

public class GestorTemperatura {
    private float temperatura;
    private final ArrayList<Observadores> observadores = new ArrayList<>();
    
    public void addObserver(Observadores o) {
        this.observadores.add(o);
    }
    
    public void removeObserver(Observadores o) {
        this.observadores.remove(o);
    }
    
    public void notificar(float t) {
        this.temperatura = t;
        
        for(Observadores o : this.observadores) {
            o.update(this.temperatura);
        }
    }
}
