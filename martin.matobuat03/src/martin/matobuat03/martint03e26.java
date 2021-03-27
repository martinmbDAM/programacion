/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que muestra por pantalla alternativamente 'hola' y 
 * 'adiós' en función de un número natural introducido por el usuario.
 */
package martin.matobuat03;

import java.util.Scanner;

public class martint03e26 {

    public static void main(String[] args) {

        // Declaración de variables:
        int num;
        Scanner teclado = new Scanner(System.in);

        // Se pide al usuario que introduzca un número natural:
        do {
            System.out.print("\nIntroduzca un número natural: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num <= 0);

        // Se muestran por pantalla tantas líneas como haya pedido el usuario:
        System.out.println("\n------------------");
        for (int i = 1; i <= num; i++) {
            // En las líneas impares se imprime "hola":
            if (i % 2 != 0) {
                System.out.println("hola");
            // En las líneas pares se imprime "adiós":
            } else {
                System.out.println("adiós");
            }
        }
        System.out.println("------------------");

    }

}
