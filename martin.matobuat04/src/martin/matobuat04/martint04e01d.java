/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado e informa
 * de si contiene el caracter 'x' a partir de la cuarta posición.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01d {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        // Buscamos la posición del caracter 'x'. Si no lo hay, el método 
        // devuelve -1. (Haciéndolo de esta forma se incluye la cuarta posición
        // en la búsqueda. Si se desease excluir la cuarta posición, habría que
        // hacer int pos = cad.indexOf('x',4):
        System.out.println("\n-----------------------------------------------");
        if (cad.indexOf('x',3) != -1){
            System.out.printf("La cadena contiene el caracter 'x' a partir de "
                              + "la cuarta posición");
        }
        else {
            System.out.printf("La cadena no contiene el caracter 'x' a partir "
                              + "de la cuarta posición");
        }
        System.out.println("\n-----------------------------------------------");
    }
    
}
