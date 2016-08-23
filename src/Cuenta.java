/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class Cuenta {
    private String nombretitular;
    private int numero, clave;
    private double saldo;

    public Cuenta(String nombretitular, int numero, int clave, double saldo) {
        this.nombretitular = nombretitular;
        this.numero = numero;
        this.clave = clave;
        this.saldo = saldo;
    }
    
    public void consignar(double valor){
        this.saldo += valor;
    }
    public void retirar(double valor){
        this.saldo -= valor;
    }
    public void cambioclave(int nuevaclave){
        this.clave = nuevaclave;
    }
    public void consultarsaldo(){
       System.out.println(saldo);
    }  
}
