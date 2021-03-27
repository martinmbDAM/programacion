/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de Febrero de 2021
 * Descripción: Programa que permite jugar al gato y al ratón.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos un tablero de 20x20
        TableroGatoRaton tablero = new TableroGatoRaton(20, 20);

        // Contador de posiciones
        int contador = 0;

        // Si el gato y el ratón aparecen en la misma casilla, el juego se 
        // acaba:
        if (!tablero.Final()) {
            // Pintamos el tablero:
            System.out.println("Posición " + contador + " - mueve Ratón");
            tablero.pintarTablero();
            contador++;

            while (!tablero.Final()) {

                // Enter:
                teclado.nextLine();

                // Se mueve el ratón:
                tablero.raton.mover(tablero);

                if (!tablero.Final()) {
                    // Pintamos el tablero:
                    System.out.println("Posición " + contador + " - mueve Gato");
                    tablero.pintarTablero();
                    contador++;

                    // Enter:
                    teclado.nextLine();

                    // Se mueve el gato:
                    tablero.gato.mover(tablero);

                    if (!tablero.Final()) {
                        // Pintamos el tablero:
                        System.out.println("Posición " + contador + " - mueve Ratón");
                        tablero.pintarTablero();
                        contador++;
                    }
                }
            }
        }

        System.out.println("JUEGO TERMINADO");
    }

}
