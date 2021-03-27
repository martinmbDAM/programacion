/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce el número del DNI y obtiene la 
 * letra correspondiente, devolviendo el DNI completo en una cadena. 
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // String que contiene las posibles letras del DNI:
        String letra_dni = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca el número del DNI: ");
        int numero_dni = Integer.parseInt(teclado.nextLine());
        
        // División:
       int resto = numero_dni%23;
        
        // Creación del DNI completo: 
        String dni = Integer.toString(numero_dni) + letra_dni.charAt(resto);        
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("DNI: " + dni);
        System.out.println("-----------------------------------------------");
        
      
    }
    
}
