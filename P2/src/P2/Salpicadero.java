package P2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class Salpicadero implements Observer {
	private double vLineal = 0;
	private double distancia = 0;
	private double revoluciones = 0;
        private double vMantenida = 0;
        private double revolucionesMantenida = 0;
        long inicio = 0;
        long actual = 0;
        long anterior = 0;
        static final double radio = 0.15;
        private int estadoPalanca = -1;
        
        Salpicadero()
        {
            this.inicio = System.currentTimeMillis();
        }
        
        @Override
        public void update(Observable o, Object temp) {
            this.estadoPalanca = (int) temp;
        }
        
        // SI ESTAMOS EN MANTENER Y SE PISA EL FRENO PONER LA PALANCA EN PARAR
	public void ejecutar(double revol, int EstadoMotor)
        {
            // Acelerando o frenando y modo manual
            if((EstadoMotor == 0 || EstadoMotor == 1) && estadoPalanca == 1)
            {
                this.anterior = this.actual;
                this.actual = System.currentTimeMillis();
                this.vLineal = 2*Math.PI*radio*revol*((double)(60.0/1000.0));
                this.revoluciones = revol;
                this.distancia += this.vLineal * ((this.actual - anterior))/3600000;
            }
            //Si modo mantener
            if(estadoPalanca == 2)
            {
                this.anterior = this.actual;
                this.actual = System.currentTimeMillis();
                this.vLineal = 2*Math.PI*radio*revol*((double)(60.0/1000.0));
                this.revoluciones = revol;
                this.distancia += this.vLineal * ((this.actual - anterior))/3600000;
                if(vMantenida != this.vLineal)
                {
                    this.vMantenida = this.vLineal;
                    this.revolucionesMantenida = this.revoluciones;
                }

            }
            //Si modo reiniciar
            if(estadoPalanca == 3)
            {
                this.anterior = this.actual;
                this.actual = System.currentTimeMillis();
                this.vLineal = 2*Math.PI*radio*revol*((double)(60.0/1000.0));
                this.revoluciones = revol;
                this.distancia += this.vLineal * ((this.actual - anterior))/3600000;  
            }
            
            else {
                this.actual = System.currentTimeMillis();
            }
	}
        
        public double getVelocidad(){return this.vLineal;}
        
        public double getDistancia(){return this.distancia;}
        
        public double getRevoluciones(){return this.revoluciones;}
        
        public void setVelocidad(double v){this.vLineal = v;}
        
        public void setDistancia(double d){this.distancia = d;}
        
        public void setRevoluciones(double r){this.revoluciones = r;}

        public int getEstadoPalanca(){return this.estadoPalanca;}
        
        public double getRevolucionesObjetivo(){return this.revolucionesMantenida;}
        
}