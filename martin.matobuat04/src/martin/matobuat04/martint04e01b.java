/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado e informa
 * de si contiene el caracter 'x'.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01b {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        if (cad.indexOf('x')!=-1){
            System.out.printf("La cadena contiene el caracter 'x'");
        }
        else {
            System.out.printf("La cadena no contiene el caracter 'x'");
        }
        System.out.println("\n-----------------------------------------------");
    }
    
}
