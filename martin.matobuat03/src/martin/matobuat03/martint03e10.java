/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa al que se le introducen las edades de unos alumnos e 
 * informa de si hay alguno menor de edad. El programa finaliza su ejecución 
 * cuando se introduce -1.
 */
package martin.matobuat03;

import java.util.Scanner;

public class martint03e10 {

    public static void main(String[] args) {

        // Constante que almacena el número que hay que introducir para 
        // finalizar:
        final int FINAL = -1;

        // Declaración de variables:
        int edad=0;
        boolean menor = false;
        Scanner teclado = new Scanner(System.in);

        while (edad != FINAL) {

            // Lectura de datos (se verifica que no se introduzcan edades 
            // negativas diferentes del número que hay que introducir para 
            // finalizar):
            do {
                System.out.print("\nEdad: ");
                edad = Integer.parseInt(teclado.nextLine());
            } while (edad < 0 && edad != FINAL);

            if (edad != FINAL) {
                // Se comprueba si el alumno es menor de edad:
                if (edad < 18) {
                    menor = true;
                }

                // Salida de resultados:
                if (menor) {
                    System.out.println("Sí, hay alguno");
                } else {
                    System.out.println("No, no hay ninguno");
                }

            }

        }

    }

}
