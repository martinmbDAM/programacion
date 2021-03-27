/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que suma los números que vaya introduciendo el usuario
 * hasta que la suma de los mismos valga más de 100.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e09 {

    public static void main(String[] args) {

        // Constante que almacena el valor máximo de la suma:
        final int LIMITE = 100;

        // Declaración de variables:
        float num, suma=0f;
        Scanner teclado = new Scanner(System.in);

        // Bucle de entrada y suma de números:
        while (suma <= LIMITE) {

            // Entrada de datos:
            System.out.print("\nIntroduzca un número: ");
            num=teclado.nextFloat();

            // Se añade el nuevo número a la suma de los anteriores:
            suma += num;

            // Salida de datos:
            System.out.println("Suma: " + suma);
        }

    }

}
