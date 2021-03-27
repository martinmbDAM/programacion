/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y la 
 * convierte a un número hexadecimal.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01i {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad);
        System.out.printf("Hexadecimal a partir de la cadena: %s", 
                          Integer.toString(Integer.parseInt(cad),16));
        System.out.println("\n-----------------------------------------------");
     
    }
    
}
