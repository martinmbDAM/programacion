/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que suma los números positivos que introduce el usuario
 * y que finaliza cuando recibe el valor '-1';
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e05 {

    public static void main(String[] args) {

        // Declaración de variables:
        float num=0f, suma=0f;
        Scanner teclado = new Scanner(System.in);

        // Bucle:
        while (num != -1) {

            // Lectura dentro del bucle:
            System.out.print("\nIntroduzca un número: ");
            num = teclado.nextFloat();
            
            // El número se añade a la suma de los anteriores, siempre que no
            // sea negativo:
            if (num > 0) {
                suma += num;
            }

            // Salida de datos:
            System.out.println("Suma: " + suma);

        }

    }

}
