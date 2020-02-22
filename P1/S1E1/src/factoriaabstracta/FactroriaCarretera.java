package factoriaabstracta;


public class FactroriaCarretera extends FactoriaCarreraYBicicleta {

        @Override
	public CarreraCarretera crearCarrera(int i)
        {
		return new CarreraCarretera(i);
	}

        @Override
	public BicicletaCarretera crearBicicleta(int i)
        {
		return new BicicletaCarretera(i);
        }
}