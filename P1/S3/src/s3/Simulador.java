package s3;
import java.util.Observable;
import java.util.Random;

public class Simulador extends Observable implements Runnable {
    
    private float temperatura;
    
    public float getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(float t) {
        this.temperatura = t;
        setChanged();
        notifyObservers(t);
    }
    
    @Override
    public void run() {
        // Mínimo y máximo de temperatura. Generamos una entre medias.  
        float max = 45, min = -10;
        Random rand = new Random();
        float temp = min + rand.nextFloat() * (max - min);
        
        System.out.println("Temperatura cambiada: " + temp);
        
        this.temperatura = temp;
        
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(6*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
    
    public static void main(String[] args) {
        // Creamos el observable
        Simulador sim = new Simulador();
        
        // Creamos el observador graficaTemperatura
        graficaTemperatura observador_uno = new graficaTemperatura();
        
        // Lo añadimos a la lista
        sim.addObserver(observador_uno);
        
        // Creamos el observador botonCambio
        botonCambio observador_dos = new botonCambio();
        
        // Lo añadimos a la lista
        sim.addObserver(observador_dos);
        
        // Iniciamos la hebra
        Thread h1 = new Thread(sim);
        
        while(true){
            if(!h1.isAlive()){
                h1.start();
            }
        
            try {
                h1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            h1.stop();
            sim.setTemperatura(sim.getTemperatura());
        }
    }
}
