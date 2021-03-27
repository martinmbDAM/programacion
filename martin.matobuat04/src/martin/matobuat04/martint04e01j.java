/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y si se
 * encuentra en su interior con "prueva" lo sustituye por "prueba".
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01j {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad1 = teclado.nextLine();
        
        // Si contiene "prueva" se sustituye por "prueba":
        String cad2 = cad1.replace("prueva", "prueba");
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad1);
        System.out.println("Cadena modificada: " + cad2);
        System.out.println("\n-----------------------------------------------");
        
      
    }
    
}
