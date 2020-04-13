package P2.model;
import java.util.ArrayList;

public class CadenaFiltros {
	public ArrayList<Filtro> cadena = new ArrayList<>();
        
        CadenaFiltros()
        {
            cadena.clear();
        }

	public double ejecutar(double rev_local, int estado) {
            rev_local = this.cadena.get(0).ejecutar(rev_local, estado);
            rev_local = this.cadena.get(1).ejecutar(rev_local, estado);
            return rev_local;
	}
        
        public void generar()
        {
            this.cadena.add(new CalcularVelocidad());
            this.cadena.add(new RepercutirRozamiento());
        }
}