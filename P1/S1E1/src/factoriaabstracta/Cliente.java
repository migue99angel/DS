package factoriaabstracta;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Cliente{
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
                System.out.println("¡¡Se han inscrito un total de "+obtenido+" participantes a cada carrera !!");
            }
        }
        
        public static void generar()
        {
            generarNumeroParticipantes();
            factoria = new FactoriaMontana();
            //Creo la carrera de montaña a la que le asigno la edición 1
            Cliente.listaCarreras.add(factoria.crearCarrera(0));
            for(int i = 0; i < Carrera.N; i++)
            {
                Cliente.listaCarreras.get(0).participantes.add(factoria.crearBicicleta(i));
            }
            //Genero la carrera de carretera
            factoria = new FactroriaCarretera();
            //Creo la carrera de carretera a la que le asigno la edición 2
            Cliente.listaCarreras.add(factoria.crearCarrera(1));
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
         try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(100);
         } catch (Exception e) {
            System.out.println(e);
         }
        }

	public static void main(String[] args) {
            simular();
            System.out.println("Resultado primera carrera");
            Cliente.listaCarreras.get(0).getRanking();
            System.out.println("Resultado de la segunda carrera");
            Cliente.listaCarreras.get(1).getRanking();
        }
}