package P2;

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
            double rev_local = this.salpicadero.getRevoluciones();
            
            if(this.salpicadero.getEstadoPalanca() == 0)
            {
                rev_local = this.cadena.ejecutar(rev_local, estado);
                this.salpicadero.ejecutar(rev_local, estado);
            }
            
            if(this.salpicadero.getEstadoPalanca() == 1)
            {
                rev_local = this.cadena.ejecutar(rev_local, estado);
                this.salpicadero.ejecutar(rev_local, estado);
            }
            
            if(this.salpicadero.getEstadoPalanca() == 2)
            {
                this.salpicadero.ejecutar(rev_local, estado);
            }
            
            if(this.salpicadero.getEstadoPalanca() == 3)
            {
                if(this.salpicadero.getRevoluciones() < this.salpicadero.getRevolucionesObjetivo())
                    rev_local = this.cadena.ejecutar(rev_local, estado);
                
                this.salpicadero.ejecutar(rev_local, estado);
            }
            
	}
        
        public void crearCadena()
        {
            cadena.generar();
        }
        
        public void run()
        {   
            // Encendemos el coche
            this.salpicadero.setRevoluciones(0);
            this.peticionFiltros(2);
        }
}