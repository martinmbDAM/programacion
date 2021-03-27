/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que permite jugar al Nim. En esta versión juega primero
 * el jugador. 
 * Versión alternativa: martint06e06a (juega primero la máquina).
 */
package martin.matobuat06;

public class martint06e06b {

    public static void main(String[] args) {

        Nim juego = new Nim();

        int jugada_maquina, fila, cantidad;

        while (!juego.Fin()) {
            Consola.PintarTablero(juego);

            System.out.print("\n--Juega el humano--");

            // Juega el humano:
            do {
                do {
                    System.out.println();
                    fila = Consola.leerEntero("Fila: ");
                } while (fila < 1 || fila > 3);

                do {
                    cantidad = Consola.leerEntero("Palillos: ");
                } while (cantidad <= 0);

            } while (!juego.Juega(fila - 1, cantidad));

            if (!juego.Fin()) {

                // Situación actual del tablero:
                Consola.PintarTablero(juego);

                // Juega la máquina:
                jugada_maquina = juego.Piensa();
                juego.Juega((jugada_maquina / 10), jugada_maquina % 10);

                // Para el jugador, las filas se llaman 1, 2 y 3, pero para la 
                // máquina, son 0, 1 y 2:            
                System.out.println("\n--Juega la máquina--");
                System.out.println("Fila: " + (jugada_maquina / 10 + 1));
                System.out.println("Palillos: " + jugada_maquina % 10);
            }

        }

        System.out.println("FIN DE JUEGO");

    }

}
