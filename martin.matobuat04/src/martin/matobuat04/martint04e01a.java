/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y muestra
 * por pantalla el resultado de pasarla a mayúsculas y minúsculas.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01a {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad);
        System.out.println("Cadena en mayúsculas: " + cad.toUpperCase());
        System.out.println("Cadena en minúsculas: " + cad.toLowerCase());
        System.out.println("-----------------------------------------------");
    }
    
}
