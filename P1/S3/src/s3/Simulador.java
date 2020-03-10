package s3;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulador extends Observable implements Runnable {
    
    private double temperaturaC;
    private double temperaturaF;
    
    public double getTemperaturaC() {
        return this.temperaturaC;
    }
    
    public void setTemperaturaC(double t) {
        this.temperaturaC = t;
        setChanged();
        notifyObservers(t);
    }
    
    public double getTemperaturaF() {
        return this.temperaturaF;
    }
    
    public void setTemperaturaF(double t) {
        this.temperaturaF = t;
        setChanged();
        notifyObservers(t);
    }
    
    @Override
    public void run(){
        while(true) {
            // Mínimo y máximo de temperatura. Generamos una entre medias.  
            float max = 50, min = -10;
            Random rand = new Random();
            double tempC = min + rand.nextFloat() * (max - min);
            this.setTemperaturaC(tempC);
            
            double tempF = ((double) (9/5) * tempC) + 68;
            this.setTemperaturaF(tempF);

            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(6*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
        }
    }
}
