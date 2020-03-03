package s3;
import java.util.Observable;

public class Simulador extends Observable {
    
    private float temperatura;
    
    public float getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(float t) {
        this.temperatura = t;
        setChanged();
        notifyObservers(this.temperatura);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
