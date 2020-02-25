package factoriaabstracta;

import java.util.Collections;
import java.util.Random;


public class CarreraCarretera extends Carrera {
    CarreraCarretera(int i)
    {
        super(i,"Carrera de carretera");
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
        System.out.println("EN LA CARRERA DE CARRETERA SE ELIMINAN "+abandonos+ " CICICLISTAS ");
        for(int i = 0; i<abandonos; i++)
        {
            int obtenido = rand.nextInt(participantes.size());
            System.out.println("SE ELIMINA EL PARTICIPANTE NUMERO "+ participantes.get(obtenido).getID() +" EN LA CARRERA DE CARRETERA");
            participantes.remove(obtenido);
        }
    }


}