/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que lee por consola un valor en dólares y lo convierte 
 * en euros, teniendo en cuenta que un euro equivale a 1.14 dólares.
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e02 {
    public static void main(String[] args) {
        
        // Constante que almacena la tasa de conversión:
        final double DOLAR_A_EURO = 0.86;
        
        // Declaración de variables:
        double dolares, euros;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca una cantidad en dólares:
        System.out.print("\nImporte en dólares: ");
        dolares = teclado.nextDouble();
        
        // Conversión a euros:
        euros = dolares * DOLAR_A_EURO;
        
        // Se muestra al usuario el mismo importe en euros con dos decimales:
        System.out.printf("Importe en euros: %.2f\n\n", euros);
    }
    
}
