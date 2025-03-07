/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        probarIngresar(objetoCuenta, 500, 3000);
        probarRetirar(objetoCuenta, 1000, 2000);
    
    }
    
   
public static void probarIngresar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
    try {
        objetoCuenta.ingresar(cantidad);
        System.out.println("Saldo esperado: " + cantidadEsperada);
    } catch (Exception e) {
        System.out.println("Error al ingresar: " + e.getMessage());
    }
}

public static void probarRetirar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
    try {
        objetoCuenta.retirar(cantidad);
        System.out.println("Saldo esperado: " + cantidadEsperada);
    } catch (Exception e) {
        System.out.println("Error al retirar: " + e.getMessage());
    }
}

}
