package s3;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Simulador extends Observable implements Runnable {
    
    private float temperatura;
    volatile boolean ejecutar = true;
    
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
        while(this.ejecutar) {
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
    }
    
    public void detener() {
        this.ejecutar = false;
    }
    
    public static void main(String[] args) throws InterruptedException {
        // Creamos el observable
        Simulador sim = new Simulador();
        
        // Creamos el observador graficaTemperatura
        graficaTemperatura grafica = new graficaTemperatura();
        
        // Lo añadimos a la lista
        sim.addObserver(grafica);
        
        // Creamos el observador botonCambio
        botonCambio boton = new botonCambio();
        
        // Lo añadimos a la lista
        sim.addObserver(boton);
        
        // Creamos el observador pantallaTemperatura
        pantallaTemperatura pantalla = new pantallaTemperatura();
        
        // Pedimos el número de simulaciones
        int i = 0;
        try {
            System.out.println("Introduca el número de simulaciones");
            Scanner in = new Scanner(System.in);
            i = in.nextInt();
        } catch(Exception e) {
            System.out.println(e);
        }
        
        // Iniciamos la hebra
        Thread h1 = new Thread(sim);
        h1.start();
        
        int contador = 0;
        /* Dormimos el programa para notificar a los observadores para evitar que se generen más temperaturas de las que podemos comunicar */
        while(contador != i){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Notificamos a los observadores...");
            sim.setTemperatura(sim.getTemperatura());
            
            // Generamos aleatoriedad para saber si PantallaTemperatura quiere obtener la temperatura
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            
            if(randomNum == 1) {
                System.out.println("Observador Pantalla pide la temperatura");
                pantalla.pedirTemperatura(sim);
            }
            
            System.out.println("\tTemperatura Gráfica: " + grafica.getTemperatura());
            System.out.println("\tTemperatura Botón: " + boton.getTemperatura());
            System.out.println("\tTemperatura Pantalla: " + pantalla.getTemperatura());
            
            TimeUnit.SECONDS.sleep(5);
            contador++;
            
            /* Después de un determinado número de ejecuciones, paramos el programa */
            if(contador == i){
                sim.detener();
            }
        }
    }
}
