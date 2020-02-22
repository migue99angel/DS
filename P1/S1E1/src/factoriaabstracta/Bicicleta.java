package factoriaabstracta;

public abstract class Bicicleta {
	private final int _id;
        Bicicleta(int i)
        {
            this._id = i;
        }
	public int getID() 
        {
		return this._id;
	}
}