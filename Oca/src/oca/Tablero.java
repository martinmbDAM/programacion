package oca;

/**
 * Tablero del juego de la Oca
 *
 * @author Martín Mato Búa
 * @version 1.0
 * @since 19-03-2021
 * @see Casilla
 * @see Jugador
 * @see Dado
 */
public class Tablero {

    /**
     * Array que contiene las casillas del tablero
     */
    public final Casilla[] casillas;

    /**
     * Array que contiene los jugadores de la partida
     */
    public final Jugador[] jugadores;

    /**
     * Dado con el que se va a jugar la partida
     */
    public final Dado dado;

    /**
     * Constructor con 1 argumento. Crea las casillas del tablero asignándoles
     * su tipo, posición en el tablero, casilla a la que conducen (les asigna el
     * valor '-1' si no conducen a ninguna) y sus turnos de penalización. Hay 7
     * tipos de casilla:
     *<div class="oca">
     * <table>
     * <caption>Tipos de casillas</caption>
     * <tr>
     * <td>Tipo de
     * Casilla</td><td>Número(s)</td><td>Turnos de
     * Sanción</td><td>Siguiente Casilla</td>
     * </tr>
     * <tr>
     * <td>Oca</td><td>5,9,14,18,23,27,32,36,41,45,50,54,59</td><td>0</td><td>Siguiente
     * Oca</td>
     * </tr>
     * <tr>
     * <td>Puente</td><td>6 y 12</td><td>0</td><td>19</td>
     * </tr>
     * <tr>
     * <td>Posada</td><td>19</td><td>1</td><td>-1</td>
     * </tr>
     * <tr>
     * <td>Laberinto</td><td>42</td><td>0</td><td>30</td>
     * </tr>
     * <tr>
     * <td>Cárcel</td><td>56</td><td>2</td><td>-1</td>
     * </tr>
     * <tr>
     * <td>Calavera</td><td>58</td><td>0</td><td>1</td>
     * </tr>
     * <tr>
     * <td>Ganador</td><td>63</td><td>0</td><td>-1</td>
     * </tr>
     * </table>
     * </div>
     *
     * @param num_jugadores Número de jugadores
     */
    public Tablero(int num_jugadores) {

        // Creamos el dado: 
        dado = new Dado();

        // Creamos el Array de jugadores:
        jugadores = new Jugador[num_jugadores];
        for (int i = 0; i < num_jugadores; i++) {
            jugadores[i] = new Jugador();
        }

        // Creamos el Array de casillas:
        casillas = new Casilla[63];

        // Creamos las casillas. Hay 7 tipos diferentes: 
        // La casilla 62 es de tipo Ganador (no conduce a ninguna otra casilla
        // y no resta turnos de movimiento):
        casillas[62] = new Casilla(62, "Ganador", -1, 0);

        // La casilla 57 es de tipo Calavera (conduce a la casilla de salida y
        // no resta turnos de movimiento): 
        casillas[57] = new Casilla(57, "Calavera", 0, 0);

        // La casilla 55 es de tipo Cárcel, (no conduce a ninguna casilla y 
        // resta 2 turnos de movimiento):
        casillas[55] = new Casilla(55, "Cárcel", -1, 2);

        // La casilla 41 es de tipo Laberinto(conduce a la casilla 29 y no 
        // resta turnos de movimiento):
        casillas[41] = new Casilla(41, "Laberinto", 29, 0);

        // La casilla 18 es de tipo Posada (no conduce a ninguna casilla y 
        // resta 1 turno de movimiento):
        casillas[18] = new Casilla(18, "Posada", -1, 1);

        // Las casillas 5 y 11 son de tipo Puente (conducen a la posada y no 
        // restan ningún turno de movimiento):
        casillas[5] = new Casilla(5, "Puente", 18, 0);
        casillas[11] = new Casilla(11, "Puente", 18, 0);

        // Las casillas de tipo Oca empiezan en la 5 y se intercalan cada 4 y 5
        // casillas hasta la 58:
        boolean suma_cinco = false;
        for (int i = 4; i < 59; i = i + 4) {
            if (i != 58) {
                if (suma_cinco) {
                    casillas[i] = new Casilla(i, "Oca", i + 5, 0);
                } else {
                    casillas[i] = new Casilla(i, "Oca", i + 4, 0);
                }
            } else {
                casillas[i] = new Casilla(i, "Oca", -1, 0);
            }

            if (suma_cinco) {
                i++;
            }
            suma_cinco = !suma_cinco;
        }

        // Una vez rellenadas las casillas especiales, rellenamos las normales:
        for (int i = 0; i < 62; i++) {
            if (casillas[i] == null) {
                casillas[i] = new Casilla(i, "Normal", -1, 0);
            }
        }
    }

    /**
     * Comprueba si el juego se ha terminado
     *
     * @return Si hay o no un jugador en la última casilla
     */
    public boolean Fin() {
        boolean terminado = false;
        int pos = 0;
        while (!terminado && pos < jugadores.length) {
            terminado = jugadores[pos].getCasilla()
                    == casillas[casillas.length - 1].getPosicion();
            pos++;
        }
        return (terminado);
    }

    /**
     * Permite mover a un jugador por el tablero
     *
     * @param x Número de jugador
     * @return Número de la nueva casilla del jugador
     */
    public int moverJugador(int x) {

        // Si el jugador está sancionado no lo movemos, pero le quitamos un
        // turno de sanción:
        if (jugadores[x].getTurnosSancion() > 0) {
            jugadores[x].disminuirSancion();
            System.out.println("Jugador " + (x + 1) + " (sancionado) - Casilla "
                    + (casillas[jugadores[x].getCasilla()].getPosicion() + 1)
                    + " - " + casillas[jugadores[x].getCasilla()].getTipo());
        } else {

            // Lanzamos un dado y movemos al jugador:
            int resultado = dado.lanzarDado();

            System.out.println("Jugador " + (x + 1) + " saca un " + resultado);

            // Movemos el jugador haciendo que rebote si se sale del tablero:
            if (jugadores[x].getCasilla() + resultado < casillas.length) {

                jugadores[x].setCasilla(jugadores[x].getCasilla() + resultado);
            } else {
                int exceso = (jugadores[x].getCasilla()
                        + resultado) - (casillas.length - 1);
                jugadores[x].setCasilla(casillas.length - exceso - 1);
            }

            System.out.println("Jugador " + (x + 1) + " - Casilla "
                    + (casillas[jugadores[x].getCasilla()].getPosicion() + 1)
                    + " - " + casillas[jugadores[x].getCasilla()].getTipo());

            // Si la nueva casilla conduce a otra, movemos al jugador a esa 
            // casilla:
            if (casillas[jugadores[x].getCasilla()].getSiguienteCasilla() != -1) {

                jugadores[x].setCasilla(casillas[jugadores[x].
                        getCasilla()].getSiguienteCasilla());

                System.out.println("Jugador " + (x + 1) + " - Casilla "
                        + (casillas[jugadores[x].getCasilla()].getPosicion() + 1)
                        + " - " + casillas[jugadores[x].getCasilla()].getTipo());
            }

            // Si la casilla del jugador conlleva una penalización de turnos, 
            // se actualiza el número de turnos que no puede mover:
            if (casillas[jugadores[x].getCasilla()].getRestaTurnos() > 0) {

                jugadores[x].aumentarTurnosSancion(casillas[jugadores[x].getCasilla()].
                        getRestaTurnos());
            }
        }

        return (jugadores[x].getCasilla());
    }

    /**
     * Lee el array de casillas
     *
     * @return Array de casillas
     */
    public Casilla[] getCasillas() {
        return (casillas);
    }

    /**
     * Lee el array de jugadores
     *
     * @return Array de jugadores
     */
    public Jugador[] getJugadores() {
        return (jugadores);
    }

}
