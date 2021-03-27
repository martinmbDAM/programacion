/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena y crea otra con la 
 * primera y última posición intercambiadas.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01n {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad1 = teclado.nextLine();      
        
        // Se crea una nueva cadena con la primera y última posción 
        // intercambiadas:
        String cad2 = cad1.charAt(cad1.length()-1) + cad1.substring(1, 
                      cad1.length()-1) + cad1.charAt(0);        
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad1);
        System.out.println("Cadena modificada: " + cad2);
        System.out.println("-----------------------------------------------");
        
      
    }
    
}
