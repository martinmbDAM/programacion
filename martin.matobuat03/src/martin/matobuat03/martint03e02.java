/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que muestra por pantalla los n primeros números 
 * naturales, siendo n un número introducido por el usuario.
 */
package martin.matobuat03;

import java.util.Scanner;

public class martint03e02 {

    public static void main(String[] args) {

        // Declaración de variables:
        int num;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (se verifica que se introduzca un número natural):
        do {
            System.out.print("\nNúmero natural: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num <= 0);

        // Salida de datos:
        System.out.print("\n-----------------------------------");
        System.out.printf("\nPrimeros %d números naturales: \n", num);
        // Imprimimos los 'num' primeros números naturales (no consideramos al 0 
        // un número natural):
        for (int i=1; i<=num; i++) {
            System.out.print(i + "\n");
        }
        System.out.println("-----------------------------------");
    }

}
