package P2.controller;

import java.util.Observable;

public class Palanca extends Observable {
    /**
     * Estado de la palanca
     * 0 (Parado): Modo Manual
     * 1 (Acelerar): Se acelera el vehículo hasta poner la palanca en "Mantener"
     * 2 (Mantener/Modo Automático): Velocidad constante
     * 3 (Reiniciar): Recupera la última velocidad de crucero almacenada, la que tenía la última vez que estuvo
     * en modo automático
     */
    private int estado;
    
    public Palanca() {
        /* Modo Manual por defecto */
        this.estado = 0;
    }
    
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        if(estado == 0 || estado == 1 || estado == 2 || estado == 3) {
            this.estado = estado;
            setChanged();
            notifyObservers(this.estado);
        }
        
        else
            System.out.println("Estado no válido");
    }
}
