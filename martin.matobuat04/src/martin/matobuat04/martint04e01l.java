/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y 
 * muestra cuántos dígitos contiene.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01l {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();

        // Se comprueba cuántos dígitos contiene:
        int digitos=0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isDigit(cad.charAt(i))){
                digitos++;
            }
        }
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Número de dígitos de " + cad + ": " + digitos);
        System.out.println("-----------------------------------------------");
        
      
    }
    
}
