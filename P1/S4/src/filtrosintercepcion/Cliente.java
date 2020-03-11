package filtrosintercepcion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class Cliente {

    public static GestorFiltros gestor;
    
    public static void main(String[] args) {
        gestor = new GestorFiltros();
        ((Thread)gestor).start();
    }
    
}
