/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena por teclado y 
 * compruba si es un palíndromo.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e01m {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();

        boolean palindromo;
        int pos_inicial = 0;
        int pos_final = cad.length()-1;
        // Se comprueba si es un palíndromo ('pos_inicial' apunta a la posición
        // inicial del String, y 'pos_final' apunta a la última posición. En
        // cada iteración comprobamos que ambos caracteres coincidan, y si es
        // así movemos 'pos_inicial' a la posción siguiente y 'pos_final' a la
        // posición anterior mientras 'pos_inicial' sea menor a 'pos_final':
        do{
            palindromo = cad.charAt(pos_inicial)==cad.charAt(pos_final);
            pos_inicial++;
            pos_final--;
        }while(pos_inicial<pos_final && palindromo);
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        if (palindromo){
            System.out.println(cad + " es un palíndromo");
        }
        else {
            System.out.println(cad + " no es un palíndromo");
        }
        System.out.println("-----------------------------------------------");
        
      
    }
    
}
