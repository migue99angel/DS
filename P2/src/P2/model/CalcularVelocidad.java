package P2.model;

public class CalcularVelocidad implements Filtro {
        CalcularVelocidad(){}
        
	public double ejecutar(double Revoluciones, int EstadoMotor) {
            double rev = Revoluciones;
            // EstadoMotor 0, el coche está acelerando
		if(EstadoMotor == 0 && Revoluciones < 3500)
                    rev += 100;
                else
                    if(EstadoMotor == 1 && Revoluciones > 0) //EstadoMotor 1, el coche está frenando
                        rev -= 100;
                
                if(rev < 0)
                    rev = 0;
                
                return rev;
	}
}