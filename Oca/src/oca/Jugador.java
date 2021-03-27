
package oca;

/**
 * Cada jugador de la partida
 * 
 * @author Martín Mato Búa
 * @version 1.0
 * @since 19-03-2021
 * @see Casilla
 */
public class Jugador {
    
    /**
     * Turnos de sanción que tiene el jugador
     */
    public int turnos_sancion;
    
    /**
     * Casilla en la que se encuentra el jugador
     */
    public int casilla;        
    
    /**
     * Constructor que inicializa los atributos a 0
     */
    public Jugador(){
        turnos_sancion = 0;
        casilla = 0;
    }
    
    /**
     * Aumenta los turnos de sanción
     * @param turnos Turnos de penalización
     */
    public void aumentarTurnosSancion(int turnos){
        turnos_sancion += turnos;
    }
    
    /**
     * Disminuye en una unidad los turnos de sanción
     */
    public void disminuirSancion(){
        turnos_sancion--;
    }
    
    /**
     * Modifica la casilla en la que se encuentra el jugador
     * @param nueva Número de casilla
     */
    public void setCasilla(int nueva){
        casilla = nueva;
    }
    
    /**
     * Lee los turnos de sanción que le quedan al jugador
     * @return Turnos de sanción
     */
    public int getTurnosSancion(){
        return(turnos_sancion);
    }
    
    /**
     * Lee el número de casilla
     * @return Número de casilla
     */
    public int getCasilla(){
        return(casilla);
    }
}
