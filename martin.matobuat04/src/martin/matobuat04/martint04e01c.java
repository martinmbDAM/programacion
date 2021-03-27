/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado e informa
 * de si tiene más de diez posiciones.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01c {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        if (cad.length()>10){
            System.out.printf("La cadena tiene más de diez posiciones");
        }
        else {
            System.out.printf("La cadena no tiene más de diez posiciones");
        }
        System.out.println("\n-----------------------------------------------");
    }
    
}
