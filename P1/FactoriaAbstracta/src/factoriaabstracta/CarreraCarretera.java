package factoriaabstracta;

import java.util.Collections;
import java.util.Random;


public class CarreraCarretera extends Carrera {
    CarreraCarretera(int i)
    {
        super(i,"Carrera de carretera");
        tipo = "Carretera";
    }
    @Override
    public void run()
    {
        System.out.println("¡Comienza una competición por la carretera!");
        //Desordeno los participantes
        Collections.shuffle(this.participantes);
        //Calculo el 10% de los participantes
        int abandonos = (int)(participantes.size() * 0.1);
        Random rand = new Random();
        //Elimino aleatoriamente al 10% de los participantes
        for(int i = 0; i<abandonos; i++)
        {
            int obtenido = rand.nextInt(participantes.size());
            participantes.remove(obtenido);
        }
        
        this.getRanking();
        
          
    }


}