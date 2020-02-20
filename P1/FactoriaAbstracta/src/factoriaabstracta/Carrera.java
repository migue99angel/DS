package factoriaabstracta;

import java.util.ArrayList;


public abstract class Carrera extends Thread{
        public static String tipo;
	public ArrayList<Bicicleta> participantes = new ArrayList<>();
        public static int N = -1;
        private final int numEdicion;
        public Carrera(int i, String msg)
        {
            super(msg);
            numEdicion = i;
            tipo = "";
        }
	public void setBiciletas(ArrayList<Bicicleta> bicicletas)
        {
            this.participantes = bicicletas;
        }

	public ArrayList<Bicicleta> getBicicletas()
        {
            return this.participantes;
        }

	public void addBicicleta(Bicicleta bicicleta)
        {
            this.participantes.add(bicicleta);
        }
        
        public abstract void run();
        
        public void getRanking()
        {
            System.out.println("Final de la carrera de "+this.tipo + " ! Han participado "+N+" ciclistas. ");
            System.out.println("La clasificación ha sido la siguiente: ");
            for(int i = 0; i < participantes.size(); i++ )
            {
                int puesto = ++i;
                System.out.println("Carrera numero: "+numEdicion+". Puesto "+ puesto + ". Bicicleta con número "+participantes.get(i).getID());
            }
        }
}