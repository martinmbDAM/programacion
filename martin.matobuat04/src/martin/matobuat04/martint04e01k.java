/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Diciembre de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y 
 * compruba si el primer caracter es igual al último.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01k {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
 
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        if (cad.charAt(0) == cad.charAt(cad.length()-1)){
            System.out.println("El primer caracter es igual al último");
        }
        else {
            System.out.println("El primer caracter es distinto del último");
        }
        System.out.println("-----------------------------------------------");
        
      
    }
    
}
