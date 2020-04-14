package P2.model;


public class MonitorConsumo {
    public static int notificacionFrenos = 100000000;
    public static int notificacionAceite = 5000000;
    public static int notificacionRevisionGeneral = 1000000000;
    private double vueltas;
    private double vueltasAceite;
    private double vueltasFrenos;
    
    MonitorConsumo(){
        vueltas = 0;
        vueltasAceite = 0;
        vueltasFrenos = 0;
    }
    
    public void consumir(double vueltas)
    {
        this.vueltas += vueltas;
        this.vueltasAceite += vueltas;
        this.vueltasFrenos += vueltas;
    }
    
    public void cambioAceite()
    {
        this.vueltasAceite = 0;
    }
    
    public void cambioFrenos()
    {
        this.vueltasFrenos = 0;
    }
    
    public void revisionGeneral()
    {
        this.vueltas = 0;
    }
    
    public double getAceite()
    {
        return this.vueltasAceite;
    }
    
    public double getFrenos()
    {
        return this.vueltasFrenos;
    }
    
    public double getGeneral()
    {
        return this.vueltas;
    }
}
