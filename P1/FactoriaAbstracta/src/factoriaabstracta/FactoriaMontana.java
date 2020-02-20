package factoriaabstracta;

public class FactoriaMontana extends FactoriaCarreraYBicicleta {

        @Override
	public CarreraMontana crearCarrera(int i) 
        {
		return new CarreraMontana(i);
	}

        @Override
	public BicicletaMontana crearBicicleta(int i) 
        {
		return new BicicletaMontana(i);
	}
}