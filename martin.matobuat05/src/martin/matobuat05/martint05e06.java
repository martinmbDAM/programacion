/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Realiza una función llamada cantidadDivisores al que se le pase 
 * como parámetro un número entero y devuelva el número de divisores o bien cero 
 * si el número es negativo. Usa dicha función en un main.
 */
package martin.matobuat05;

import java.util.Scanner;

public class martint05e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduzca un entero: ");
        int num = teclado.nextInt();

        int num_divisores = cantidadDivisores(num);

        System.out.println(num + " tiene " + num_divisores + " divisores");

    }

    // Función que permite calcular los divisores de un número (no se incluyen
    // ni el 1 ni el propio número):
    static int cantidadDivisores(int n) {
        int divisores = 0;
        if (n > 0) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisores++;
                }
            }
        }
        return (divisores);
    }

}
