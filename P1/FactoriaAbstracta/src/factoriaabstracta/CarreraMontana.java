package factoriaabstracta;

import static factoriaabstracta.Carrera.N;
import java.util.Collections;
import java.util.Random;


public class CarreraMontana extends Carrera {
    CarreraMontana(int i)
    {
        super(i,"Carrera de montana");
        tipo = "Montaña";
    }
    @Override
    public void run() 
    {
        System.out.println("¡Comienza una competición por la montaña!");
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