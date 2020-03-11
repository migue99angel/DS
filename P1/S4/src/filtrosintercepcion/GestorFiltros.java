package filtrosintercepcion;

public class GestorFiltros extends Thread {
	public Salpicadero salpicadero;
	public CadenaFiltros cadena;
        
        GestorFiltros()
        {
            salpicadero = new Salpicadero();
            cadena = new CadenaFiltros();
            this.crearCadena();
        }
        
	public void peticionFiltros(int estado) {
            double rev_local;
            rev_local = this.salpicadero.getRevoluciones();
            rev_local = this.cadena.ejecutar(rev_local, estado);
            this.salpicadero.ejecutar(rev_local, estado);
	}
        
        public void crearCadena()
        {
            cadena.generar();
        }
        
        public void run()
        {
            this.salpicadero.setRevoluciones(1500);
            System.out.println("Acelera");
            /*try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}*/
            this.peticionFiltros(0);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            //System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos");
            System.out.println("Acelera");
            try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}
            this.peticionFiltros(0);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            //System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos");
            System.out.println("Acelera");
            try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}
            this.peticionFiltros(0);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            //System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos");
            System.out.println("Acelera");
            try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}
            this.peticionFiltros(0);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            //System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos");
            System.out.println("Frena");
            try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}
            this.peticionFiltros(1);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            //System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos");
            System.out.println("Frena");
            try
            {
                Thread.sleep(60);
            }catch(InterruptedException e){}
            this.peticionFiltros(1);
            System.out.println(this.salpicadero.getRevoluciones()+" RPM");
            System.out.println(this.salpicadero.getVelocidad()+" Km/h");
            System.out.println(this.salpicadero.getDistancia()+ "Km");
            System.out.println("Se han simulado "+this.salpicadero.getTiempoSimulado()+" minutos totales");
        }
}