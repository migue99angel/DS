package P1;

import java.util.ArrayList;
import P1.Bicicleta;

public abstract class Carrera {
	public ArrayList<Bicicleta> _unnamed_Bicicleta_ = new ArrayList<Bicicleta>();

	public abstract void setBiciletas(ArrayList<Bicicleta> aBicicletas);

	public abstract ArrayList<Bicicleta> getBicicletas();

	public abstract void addBicicleta(Bicicleta aBicicleta);
}