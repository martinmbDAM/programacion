/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y crea 
 * una cadena con las 5 primeras posiciones de la cadena.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01e {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad1 = teclado.nextLine();
        
        // Cadena formada por las 5 primeras posiciones:
        String cad2 = cad1.substring(0,5);
        
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad1);
        System.out.println("Cadena nueva (5 primeros caracteres de la "
                            + "original): " + cad2);
        System.out.println("\n-----------------------------------------------");
    }
    
}
