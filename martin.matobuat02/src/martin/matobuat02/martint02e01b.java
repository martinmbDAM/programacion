/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números enteros y muestra si el primero es
 * mayor que el segundo.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01b {

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
        if (num1 > num2){
            System.out.printf("\n%d es mayor que %d\n\n",num1,num2);
        }
        else{
            System.out.printf("\n%d no es mayor que %d\n\n",num1,num2);
        }
    }
    
}
