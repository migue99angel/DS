package P1;

import java.util.ArrayList;
import P1.Bicicleta;

public abstract class Carrera {
	public ArrayList<Bicicleta> participantes = new ArrayList<Bicicleta>();

	public ArrayList<Bicicletas> getBicicletas() {
		return this.participantes;
	}

	public void setBiciletas(ArrayList<Bicicleta> bicicletas) {
		this.participantes = bicicletas;
	}

	public void addBicicleta(Bicicleta bicicleta) {
		this.participantes.add(bicicleta);
	}
}