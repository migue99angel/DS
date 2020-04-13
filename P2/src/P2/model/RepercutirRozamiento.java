package P2.model;

public class RepercutirRozamiento implements Filtro {
        RepercutirRozamiento(){}
        
        @Override
	public double ejecutar(double Revoluciones, int EstadoMotor) {
		// EstadoMotor 0, el coche está acelerando
		if((EstadoMotor == 0 || EstadoMotor == 1 || EstadoMotor == -1) && Revoluciones != 0)
                    return Revoluciones -= Revoluciones*0.015;// Considero que el coeficiente de rozamiento es del 1.5%
                return Revoluciones; 
	}
}