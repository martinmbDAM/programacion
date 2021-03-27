/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un número entero y determina si es múltiplo de
 * 2, de 3 y/o de 10.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01k {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nIntroduzca un entero: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (numero%2==0){
            System.out.printf("%d es múltiplo de 2\n",numero);
            // Si es múltiplo de 2 y de 5, es múltiplo de 10:
            if (numero%5==0){
                System.out.printf("%d es múltiplo de 10\n",numero);
            }
        }
        else{
            System.out.printf("%d no es múltiplo de 2\n",numero);
            System.out.printf("%d no es múltiplo de 10\n",numero);
        }
        // Comprobamos si es divisor de 3:
        if (numero%3==0){
                System.out.printf("%d es múltiplo de 3\n",numero);
        }
        else{
            System.out.printf("%d no es múltiplo de 3\n",numero);
        }
    }
    
}
