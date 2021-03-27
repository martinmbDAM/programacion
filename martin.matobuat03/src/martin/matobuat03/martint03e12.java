/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que recibe las notas de unos exámenes con decimales y 
 * calcula: 
 *      1. Total de notas introducidas.
 *      2. Nota mínima.
 *      3. Nota máxima.
 *      4. Nota media.
 *      5. Si hay algún 5.0 exacto.
 *      6. Porcentaje de aprobados.
 * Previamente se evalúa si la nota introducida está entre 0 y 10.
 * El programa finaliza su ejecución cuando se introduce un -1.
 */
package martin.matobuat03;

import java.util.Scanner;

public class martint03e12 {

    public static void main(String[] args) {

        // Constante que almacena el número que hay que introducir para acabar
        // la ejecución:
        final int FINAL = -1;

        // Declaración de variables:
        float nota = 0;            // Nota de cada alumno
        float nota_min = 11f;      // Nota mínima 
        float nota_max = -1f;      // Nota máxima
        float nota_media = -1f;    // Nota media
        float porc_aprobados = 0f; // Porcentaje de aprobados
        float suma_notas = 0f;     // Suma de todas las notas

        int total_notas = 0;       // Total de notas introducidas
        int total_aprobados = 0;   // Total de aprobados

        boolean cinco_exacto = false;
        Scanner teclado = new Scanner(System.in);

        // Entrada de notas: 
        while (nota != FINAL) {

            // Lectura dentro del bucle:
            System.out.print("\nNota del examen: ");
            nota = teclado.nextFloat();

            // Se comprueba si la nota introducida está en el rango correcto:
            if (0 <= nota && nota <= 10) {

                // Se incrementa el total de notas:
                total_notas++;

                // Se suma la nota actual al acumulado:
                suma_notas += nota;

                // Se comprueba si la nota actual es menor que la mínima:
                if (nota < nota_min) {
                    nota_min = nota;
                }

                // Se comprueba si la nota actual es mayor que la máxima:
                if (nota > nota_max) {
                    nota_max = nota;
                }

                // Se comprueba si la nota es un aprobado:
                if (nota >= 5.0) {
                    total_aprobados++;

                    // Se comprueba si hay algún 5.0:
                    if (nota == 5.0) {
                        cinco_exacto = true;
                    }
                }

            } else {
                // Si el valor introducido no es la constante FINAL se indica
                // que los valores son incorrectos:
                if (nota != FINAL) {
                    System.out.println("\nERROR: Valores incorrectos");
                }
            }
        }

        // Si hay valores introducidos se calcula la nota media y el porcentaje
        // de aprobados. Después se muestran las estadísticas. En caso
        // contrario se muesra un mensaje de error:
        System.out.print("\n--------------------------------------");
        if (total_notas > 0) {
            
            if (total_notas != 0) {
                nota_media = suma_notas / total_notas;
                porc_aprobados = (float) total_aprobados / total_notas;
            }
            
            System.out.print("\nNotas introducidas: " + total_notas);
            System.out.printf("\nNota mínima: %.2f", nota_min);
            System.out.printf("\nNota máxima: %.2f", nota_max);
            System.out.printf("\nNota media: %.2f", nota_media);

            if (cinco_exacto) {
                System.out.print("\nHay algún 5.0 exacto");
            } else {
                System.out.print("\nNo hay ningún 5.0 exacto");
            }

            System.out.printf("\nPorcentaje de aprobados: %.2f%%\n",
                    porc_aprobados * 100);
        } else {
            System.out.println("\nERROR: No se han introducido notas");
        }

        System.out.println("--------------------------------------");
    }

}
