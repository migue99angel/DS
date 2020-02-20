package P1;

public class FactroriaCarretera extends FactoriaCarreraYBicicleta {

	public Carrera crearCarrera() {
		return new CarreraCarretera();
	}

	public Bicicleta crearBicicleta() {
		return new BicicletaCarretera();
	}
}