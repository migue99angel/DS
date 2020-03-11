package filtrosintercepcion;

public class CalcularVelocidad implements Filtro {
        CalcularVelocidad(){}
        
        @Override
	public double ejecutar(double Revoluciones, int EstadoMotor) {
            // EstadoMotor 0, el coche está acelerando
		if(EstadoMotor == 0 && Revoluciones < 5000)
                    return Revoluciones += 100;
                else
                    if(EstadoMotor == 1 && Revoluciones > 0) //EstadoMotor 1, el coche está frenando
                        return Revoluciones -= 100;
                return Revoluciones;    //Si no está ni frenando ni acelerando no se modifican las revoluciones
	}
}