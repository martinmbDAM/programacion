/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y 
 * comprueba si es igual a la cadena "hola".
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01g {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad1 = teclado.nextLine();
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        if (cad1.equals("hola")){
            System.out.printf("La cadena es igual a \"hola\"");
        }
        else {
            System.out.printf("La cadena no es igual a \"hola\"");
        }
        System.out.println("\n-----------------------------------------------");
      
    }
    
}
