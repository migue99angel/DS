package s3;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulador extends Observable implements Runnable {
    
    private float temperatura;
    volatile boolean ejecutar = true;
    private static GUIBoton boton;
    private static GUIGrafica grafica = new GUIGrafica();
    private static GUIPantalla pantalla;
    
    public float getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(float t) {
        this.temperatura = t;
        setChanged();
        notifyObservers(t);
    }
    
    @Override
    public void run(){
        while(this.ejecutar) {
            // Mínimo y máximo de temperatura. Generamos una entre medias.  
            float max = 50, min = -10;
            Random rand = new Random();
            float temp = min + rand.nextFloat() * (max - min);
            this.setTemperatura(temp);

            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(6*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
        }
    }
    
    public boolean getEstado() {
        return this.ejecutar;
    }
    
    public void detener() {
        this.ejecutar = false;
    }
    
    public static void main(String[] args) throws InterruptedException {
        // Creamos el observable
        Simulador sim = new Simulador();
        pantalla = new GUIPantalla(sim);
        boton = new GUIBoton(sim);
        sim.addObserver(boton);
        sim.addObserver(grafica);

        // Iniciamos la hebra
        Thread h1 = new Thread(sim);
        h1.start();
        
        sim.boton.main(new String[0]);
        sim.grafica.main(new String[0]);
        sim.pantalla.main(new String[0]);

    }
}
