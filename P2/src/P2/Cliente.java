package P2;

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
    private static GUISalpicadero salpicadero;
    
    public static void main(String[] args) {
        salpicadero = new GUISalpicadero();
        salpicadero.main(new String[0]);
    }
    
}
