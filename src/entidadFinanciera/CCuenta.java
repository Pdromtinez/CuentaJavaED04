/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    // Constante para el error de cantidad negativa
    public static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    public CCuenta() {}
    
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
        this.nombre =  nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInterés = tipoInterés;
    }

    // Método para obtener el estado actual de la cuenta
    public double estado() {
        return this.saldo;
    }

    /**
     * Método para ingresar una cantidad de dinero en la cuenta
     * 
     * @param cantidad Cantidad de dinero a ingresar
     * @throws Exception Si la cantidad es negativa, lanza una excepción
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad de dinero de la cuenta
     * 
     * @param cantidad Cantidad de dinero a retirar
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo, lanza una excepción
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception(ERRORCANTIDADNEGATIVA);
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}






    
   