package filtrosintercepcion;
public class Salpicadero {
	private double vLineal = 0;
	private double distancia = 0;
	private double revoluciones = 0;
        long inicio = 0;
        long actual = 0;
        
        static final double radio = 0.15;
        
        Salpicadero()
        {
            this.inicio = System.currentTimeMillis();
        }
        

	public void ejecutar(double revol, int EstadoMotor)
        {
            
            long anterior = this.actual;
            this.actual = System.currentTimeMillis();
            this.vLineal = 2*Math.PI*radio*revol*((double)(60.0/1000.0));
            this.revoluciones = revol;
            
            this.distancia += this.vLineal * 100/((this.actual - anterior));
            System.out.println("Se han simulado "+((this.actual - anterior))+" minutos");
	}
        
        public double getVelocidad(){return this.vLineal;}
        
        public double getDistancia(){return this.distancia;}
        
        public double getRevoluciones(){return this.revoluciones;}
        
        public void setVelocidad(double v){this.vLineal = v;}
        
        public void setDistancia(double d){this.distancia = d;}
        
        public void setRevoluciones(double r){this.revoluciones = r;}
        
        public long getTiempoSimulado(){return ((this.actual - this.inicio));}
}