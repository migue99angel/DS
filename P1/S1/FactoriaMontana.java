package P1;

public class FactoriaMontana extends FactoriaCarreraYBicicleta {

	public Carrera crearCarrera() {
		return new CarreraMontana();
	}

	public Bicicleta crearBicicleta() {
		return new BicicletaMontana();
	}
}