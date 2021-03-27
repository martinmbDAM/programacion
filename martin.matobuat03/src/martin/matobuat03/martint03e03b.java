/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que permite introducir números positivos y muestra si 
 * son pares o impares. El programa finaliza cuando se introduce un número 
 * negativo. Esta versión no utiliza lectura adelantada.
 * Versión alternativa: martint03e03b (con lectura adelantada).
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e03b {

    public static void main(String[] args) {
        
        // Declaración de variables:
        int num = 0;
        Scanner teclado = new Scanner(System.in);
        
        // Bucle:
        while (num>=0){
            
            // Lectura dentro del bucle:
            System.out.print("\nIntroduzca un número: ");
            num = Integer.parseInt(teclado.nextLine());
            
            if (num>=0){
                if (num%2 == 0){
                    System.out.println(num + " es un número par");
                }
                else{
                    System.out.println(num + " es un número impar");
                }
            }
  
        }
        
        System.out.println("\nEJECUCIÓN FINALIZADA");
        
    }
    
}
