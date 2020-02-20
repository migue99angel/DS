package factoriaabstracta;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Cliente {
	public Bicicleta bici;
        private static final Scanner in =new Scanner (System.in);
	public static ArrayList<Carrera> listaCarreras = new ArrayList<>();
	public static FactoriaCarreraYBicicleta factoria;
        
        public static void generarNumeroParticipantes()
        {
            //Al menos habrá 10 participantes y como máximo 20
            if(Carrera.N == -1)
            {
                Random rand = new Random();
                int obtenido = rand.nextInt(10) + 10;
                Carrera.N = obtenido;
            }
        }
        
        public static void generar()
        {
            generarNumeroParticipantes();
            factoria = new FactoriaMontana();
            //Creo la carrera de montaña a la que le asigno la edición 1
            Cliente.listaCarreras.add(factoria.crearCarrera(1));
            for(int i = 0; i < Carrera.N; i++)
            {
                Cliente.listaCarreras.get(0).participantes.add(factoria.crearBicicleta(i));
            }
            //Genero la carrera de carretera
            factoria = new FactroriaCarretera();
            //Creo la carrera de carretera a la que le asigno la edición 2
            Cliente.listaCarreras.add(factoria.crearCarrera(2));
            for(int i = 0; i < Carrera.N; i++)
            {
                Cliente.listaCarreras.get(1).participantes.add(factoria.crearBicicleta(100+i));
            }
        }
        
        public static void simular()
        {
            generar();
            ((Thread)Cliente.listaCarreras.get(0)).start();
            ((Thread)Cliente.listaCarreras.get(1)).start();
        }

	public static void main(String[] args) {
		boolean ejecucion = true;
                int opcion = 0;
                while(ejecucion)
                {
                    switch(opcion)
                    {
                        case 0:
                            System.out.println("1. Lanzar 2 carreras simultáneamente  ");
                            System.out.print("¿Qué quieres hacer?: ");
                            opcion = in.nextInt();
                            System.out.println();
                        break;
                        case 1:
                            
                        break;
                        case 3:
                            generar();
                            if(Cliente.listaCarreras.size() != 2)
                            {
                                System.out.println("Se deben lanzar exactamente 2 carreras");
                                ejecucion = false;
                            }else
                            {
                                simular();  
                            }
                    }
                }
	}
}