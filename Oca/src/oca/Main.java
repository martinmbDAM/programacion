
package oca;
import java.util.Scanner;

/**
 * Simula una partida a la Oca con un número variable de jugadores
 * 
 * @author Martín Mato Búa
 * @version 1.0
 * @since 19-03-2021
 * @see Tablero
 * @see Dado
 * @see Casilla
 * @see Jugador
 */
public class Main {

    /**
     * Permite jugar a la Oca a un número indeterminado de jugadores
     * @param args No recibe argumentos desde la línea de comandos
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario el número de jugadores (2, 3 ó 4):
        int n;
        do{
            System.out.print("Número de jugadores: "); 
            n = teclado.nextInt();
        }while(n<2 || n>4);
        
        // Creamos el tablero:
        Tablero tablero = new Tablero(n);
        
        // Creamos el dado:
        Dado dado = new Dado();
        
        // Empieza el juego con los jugadores en la casilla inicial:
        for (int i = 0; i < n; i++) {
            System.out.println("Jugador " + (i + 1) + " - Casilla " + 
            (tablero.getCasillas()[tablero.getJugadores()[i].getCasilla()].
            getPosicion() + 1)+ " - " + 
            tablero.getCasillas()[tablero.getJugadores()[i].getCasilla()].
            getTipo());
        }
        
        // El juego continúa hasta que un jugador llega a la última casilla:
        int jugador = 0;
        while(!tablero.Fin()){
            int casilla = tablero.moverJugador(jugador);
            
            // Si la casilla del jugador es una oca, se le concede otro turno:
            if (!tablero.getCasillas()[casilla].getTipo().equals("Oca")){
                jugador++;
            }
            
            if(jugador==n){
                jugador=0;
            }
        }
        
    }
    
}
