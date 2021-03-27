/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa al que se le introducen las notas de un alumno y 
 * comprueba si puede acceder a la FCT (todos los módulos aprobados). Esta 
 * versión no pide al usuario que introduzca necesariamente las 9 notas, ya que
 * en el momento en que introduzca un suspenso se acaba la introducción de 
 * datos.
 * Versión alternativa: martint03e17b (con todas las notas)
 */
package martin.matobuat03;

import java.util.Scanner;

public class martint03e17b {

    public static void main(String[] args) {

        // Declaración de variables:
        float nota;
        int modulo = 1; // Contador de módulos
        boolean aprobado;
        Scanner teclado = new Scanner(System.in);

        // Se comprueba si el alumno ha aprobado todos los módulos:
        do {
            // Se pide al usuario que introduzca la nota (debe estar en el 
            // intervalo [0,10]):
            do {
                System.out.printf("Nota del módulo %d: ", modulo);
                nota = teclado.nextFloat();
            } while (nota < 0 || nota > 10);

            // Se comprueba si el alumno ha aprobado el módulo:
            aprobado = nota >= 5.0;

            // Se incrementa el número de módulo:
            modulo++;

        } while (modulo <= 9 && aprobado);

        // Se informa de si el alumno puede acceder a FCT: 
        System.out.print("\n----------------------------------------");
        if (aprobado) {
            System.out.println("\nEl alumno puede acceder a FCT");
        } else {
            System.out.println("\nEl alumno no puede acceder a FCT");
        }
        System.out.println("----------------------------------------");

    }

}
