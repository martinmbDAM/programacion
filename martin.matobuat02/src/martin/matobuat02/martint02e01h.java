/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números y comprueba si el primero es mayor
 * que el segundo, si el segundo es mayor que el primero o si son iguales.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01h {

    public static void main(String[] args) {
       
        // Declaración de variables:
        float num1,num2;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer número: ");
        num1 = teclado.nextFloat();
        System.out.print("Segundo número: ");
        num2 = teclado.nextFloat();
        
        // Salida de resultados:
        if (num1 > num2){
            System.out.printf("\nEl primero (%.2f) es mayor que el segundo (%.2f)\n\n"
                              ,num1,num2);
        }
        else if (num1 < num2){
            System.out.printf("\nEl segundo (%.2f) es mayor que el primero (%.2f)\n\n"
                              ,num2,num1);
        }
        else{
            System.out.printf("\nEl primero(%.2f) es igual al segundo(%.2f)\n\n"
                              ,num1,num2);
        }
    }
    
}
