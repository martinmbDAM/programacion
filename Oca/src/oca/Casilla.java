package oca;

/**
 * Cada posición en el tablero
 * 
 * @author Martín Mato Búa
 * @version 1.0
 * @since 19-03-2021
 * @see Tablero
 * 
 */
public class Casilla {

    /**
     * Tipo de casilla
     */
    public final String tipo;
    
    /**
     * Número de la casilla en el tablero
     */
    public final int posicion;
    
    /**
     * Número de la casilla a la que conduce
     */
    public final int siguiente_casilla;

    /**
     * Turnos que un jugador pierde por caer en esta casilla
     */
    public final int resta_turnos;         

    /**
     * Constructor con 4 parámetros
     * 
     * @param pos Número de la casilla en el tablero
     * @param c Tipo de casilla
     * @param siguiente Número de la casilla siguiente
     * @param turnos Turnos que resta caer en esta casilla
     */
    public Casilla(int pos, String c, int siguiente, int turnos) {
        posicion = pos;
        tipo = c;
        siguiente_casilla = siguiente;
        resta_turnos = turnos;
    }
    
    /**
     * Lee el tipo de casilla
     * @return Tipo de casilla
     */
    public String getTipo() {
        return (tipo);
    }
    
    /**
     * Lee el número de la casilla en el tablero
     * @return Número de casilla
     */
    public int getPosicion() {
        return (posicion);
    }
    
    /**
     * Lee el número de la siguiente casilla en el tablero
     * @return Número de la siguiente casilla
     */
    public int getSiguienteCasilla() {
        return (siguiente_casilla);
    }
    
    /**
     * Lee el número de turnos que resta la casilla
     * @return Número de turnos de penalización
     */
    public int getRestaTurnos() {
        return (resta_turnos);
    }
}
