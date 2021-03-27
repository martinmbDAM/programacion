/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que defina un Array con 10 elementos e introduzca 
 * valores a azar entre 1 y 20 pero garantizando que no se introducen repetidos 
 * y una vez introducidos, ordénalos ascendentemente programando un algoritmo de
 * ordenación. 
 */
package martin.matobuat07;

import java.util.Random;

public class martint07e14 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Random aleatorio = new Random();

        // Inicializamos el array:
        for (int i = 0; i < numeros.length; i++) {
            boolean insertado = false;
            do {
                int nuevo = aleatorio.nextInt(20) + 1;
                boolean repetido = false;
                int pos = 0;
                while (!repetido && pos < i) {
                    repetido = nuevo == numeros[pos];
                    pos++;
                }
                if (!repetido) {
                    insertado = true;
                    numeros[i] = nuevo;
                }
            } while (!insertado);
        }

        // Los ordenamos ascendentemente:
        int posMin;
        for (int i = 0; i < numeros.length - 1; i++) {
            //busqueda del menor
            posMin = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posMin]) {
                    posMin = j;
                }
            }
            //intercambio del actual i con el menor
            int aux = numeros[i];
            numeros[i] = numeros[posMin];
            numeros[posMin] = aux;
        }
        
        // Mostramos el array:
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

}
