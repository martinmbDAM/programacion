/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que lee por consola un valor en euros y lo convierte a
 * dólares, teniendo en cuenta que un euro equivale a 1.14 dólares.
 */
package martin.matobuat01;
import java.util.Scanner;

public class martint01e01 {
    public static void main(String[] args) {
        
        // Constante que almacena la tasa de conversión:
        final double EURO_A_DOLAR = 1.14;
        
        // Declaración de variables:
        double euros, dolares;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca una cantidad en euros:
        System.out.print("\nImporte en euros: ");
        euros = teclado.nextDouble();
        
        // Se conviete la cantidad en euros a dólares:
        dolares = euros * EURO_A_DOLAR;
        
        // Se muestra al usuario el mismo importe en dólares con dos decimales:
        System.out.printf("Importe en dólares: %.2f\n\n",dolares);
    }
    
}
