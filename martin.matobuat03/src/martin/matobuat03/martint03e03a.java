/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que permite introducir números positivos y muestra si 
 * son pares o impares. El programa finaliza cuando se introduce un número 
 * negativo. Esta versión utiliza lectura adelantada.
 * Versión alternativa: martint03e03b (sin lectura adelantada).
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e03a {

    public static void main(String[] args) {
        
        // Declaración de variables:
        int num;
        Scanner teclado = new Scanner(System.in);
        
        // Lectura adelantada:
        System.out.print("\nIntroduzca un número: ");
        num = Integer.parseInt(teclado.nextLine());
        
        // Bucle:
        while (num>=0){
            
            if (num%2 == 0){
                System.out.println(num + " es un número par");
            }
            else{
                System.out.println(num + " es un número impar");
            }
            
            // Lectura dentro del bucle:
            System.out.print("\nIntroduzca un número: ");
            num = Integer.parseInt(teclado.nextLine());
        }
        
        System.out.println("\nEJECUCIÓN FINALIZADA");
        
    }
    
}
