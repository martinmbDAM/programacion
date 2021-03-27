/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que recibe 30 números comprendidos entre 0 y 1.000 y 
 * muestra:
 *
 *  1. Los 3 primeros si la suma de los 30 es par.
 *  2. Los 3 últimos si la suma de los 30 es impar.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e34 {

    public static void main(String[] args) {

        // Constante:
        final int TOTAL = 30;

        // Declaración de variables:
        int num, suma = 0, primero = 0, segundo = 0, tercero = 0, ultimo = 0,
                penultimo = 0, antepenultimo = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= TOTAL; i++) {

            // Se pide al usuario que introduzca un número comprendido entre 0
            // y 1000:
            do {
                System.out.printf("Número %d: ", i);
                num = Integer.parseInt(teclado.nextLine());
            } while (num < 0 || num > 1000);

            // Se añade el número a la suma:
            suma += num;

            // Se almacenan los 3 primeros y los 3 últimos:
            switch (i) {
                case 1:
                    primero = num;
                    break;
                case 2:
                    segundo = num;
                    break;
                case 3:
                    tercero = num;
                    break;
                case TOTAL - 2:
                    antepenultimo = num;
                    break;
                case TOTAL - 1:
                    penultimo = num;
                    break;
                case TOTAL:
                    ultimo = num;
                    break;
                default:
                    break;
            }
        }

        // Salida de resultados:
        System.out.print("\n-----------------------------------------------");
        if (suma % 2 == 0) {
            System.out.print("\nLa suma es par: ");
            System.out.printf("\nPrimero: %d\nSegundo: %d\nTercero: %d",
                    primero, segundo, tercero);
        } else {
            System.out.print("\nLa suma es impar: ");
            System.out.printf("\nAntepenúltimo: %d\nPenúltimo: %d\nÚltimo: %d",
                    antepenultimo, penultimo, ultimo);
        }
        System.out.println("\n-----------------------------------------------");

    }

}
