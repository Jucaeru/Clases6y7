/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta magdalena= new Cuenta("Magdalena Sanchez", 1012, 1234, 0);
        magdalena.consignar(100000);
        Cuenta joselito= new Cuenta("Joselito Perez", 1013, 9876, 500000);
        joselito.cambioclave(1928);
        joselito.consultarsaldo();
    }
    
}
