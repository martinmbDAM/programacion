/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números y comprueba si los dos son mayores
 * de 10.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01d {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int num1,num2;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer entero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo entero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (num1>10 && num2>10){
            System.out.printf("\n%d y %d son ambos mayores que 10\n\n",num1,
                              num2);
        }
        else{
            System.out.printf("\n%d y %d no son ambos mayores que 10\n\n",num1,
                              num2);
        }
    }
    
}
