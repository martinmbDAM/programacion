package martin.matobuat06;

import java.util.Random;

public class Raton {

    private int fila;       // Fila en la que está el ratón
    private int columna;    // Columna en la que está el ratón

    // Constructor: Se inicializa la posición del ratón con una posición 
    // aleatoria en base a las dimensiones del tablero.
    Raton(TableroGatoRaton untablero) {
        Random aleatorio = new Random();
        this.fila = aleatorio.nextInt(untablero.getFilas());
        this.columna = aleatorio.nextInt(untablero.getColumnas());
    }

    // Método que modifica aleatoriamente la posición del ratón:
    void mover(TableroGatoRaton juego) {

        boolean movimiento_valido = false;

        while (!movimiento_valido) {
            // Generamos un aleatorio entre 0 y 3
            // 0 -> movimiento horizontal positivo
            // 1 -> movimiento vertical positivo
            // 2 -> movimiento horizontal negativo
            // 3 -> movimiento vertical negativo
            Random aleatorio = new Random();
            int n = aleatorio.nextInt(4);

            switch (n) {
                case 0: {
                    int nueva_fila = fila + 2;
                    if (nueva_fila < juego.getFilas()) {
                        fila = nueva_fila;
                        movimiento_valido = true;
                    }
                    break;
                }
                case 1: {
                    int nueva_columna = columna + 2;
                    if (nueva_columna < juego.getColumnas()) {
                        columna = nueva_columna;
                        movimiento_valido = true;
                    }
                    break;
                }
                case 2: {
                    int nueva_fila = fila - 2;
                    if (nueva_fila >= 0) {
                        fila = nueva_fila;
                        movimiento_valido = true;
                    }
                    break;
                }
                default: {
                    int nueva_columna = columna - 2;
                    if (nueva_columna >= 0) {
                        columna = nueva_columna;
                        movimiento_valido = true;
                    }
                    break;
                }
            }

        }
    }

    // Método que devuelve la fila en la que está el ratón:
    int getFila() {
        return (fila);
    }

    // Método que devuelve la columna en la que está el ratón:
    int getColumna() {
        return (columna);
    }
}