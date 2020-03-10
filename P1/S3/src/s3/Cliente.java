package s3;


public class Cliente {
    public static void main(String[] args) throws InterruptedException {
        // Creamos el observable
        Simulador sim = new Simulador();
        GUIPantalla pantalla = new GUIPantalla(sim);
        GUIBoton boton = new GUIBoton(sim);
        GUIGrafica grafica = new GUIGrafica();
        sim.addObserver(boton);
        sim.addObserver(grafica);

        // Iniciamos la hebra
        Thread h1 = new Thread(sim);
        h1.start();
        
        boton.main(new String[0]);
        grafica.main(new String[0]);
        pantalla.main(new String[0]);

    }
}
