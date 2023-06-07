/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg3.ejercicio.pkg2;

/**
 *
 * @author LABORATORIO 04
 */
public class Semana3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = 5;
       
       System.out.println("Tabla de Multiplicar del" + numero + ":");
       for (int i = 1; i <= 10; i++) {
           int resultado = numero * i;
           System.out.println(numero + " x " + i + " = " + resultado);
       }
    }
    
}
