package martin.matobuat07;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SieteyMedia {

    private final Baraja baraja;        // Cartas que todavía no han salido
    private final Jugador[] jugadores;  // Jugadores

    // Constructor:
    SieteyMedia() {

        baraja = new Baraja();
        jugadores = new Jugador[3];
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador();
        }
    }

    // Método para jugar:
    void jugar() {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        for (int i = 0; i < jugadores.length; i++) {

            System.out.println("Jugador " + (i + 1));
            while (!jugadores[i].haPerdido() && !jugadores[i].seHaPlantado()) {
                                
                int respuesta;
                do {
                    System.out.println("¿Qué desea hacer?");
                    System.out.println("1 -> Pedir carta");
                    System.out.println("2 -> Plantarse");
                    System.out.print("Opción escogida: ");
                    respuesta = teclado.nextInt();
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    Carta unaCarta = baraja.getBaraja()[aleatorio.nextInt(
                            baraja.getTamaño())];
                    System.out.println("Carta: " + unaCarta.getNombre() + " - "
                            + unaCarta.getValor() + " puntos");
                    jugadores[i].pideCarta(new Carta(unaCarta.getNombre(),unaCarta.getValor()));
                    baraja.eliminarCarta(unaCarta);
                } else {
                    jugadores[i].plantarse();
                }
            }

        }

    }

    // Método que muestra los resultados de la partida:
    void mostrarResultados() {
        float[] suma = {0f, 0f, 0f};
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores[i].getCartas().size(); j++) {
                suma[i] += jugadores[i].getCartas().get(j).getValor();
            }
        }
        for (int i = 0; i < suma.length; i++) {
            System.out.println("Suma del jugador " + (i + 1) + ": " + suma[i]);
        }

        // Creamos un ArrayList con los que no han perdido:
        ArrayList<Float> ganadores = new ArrayList<>();
        
        for (int i = 0; i < jugadores.length; i++) {
            if(!jugadores[i].haPerdido()){
                ganadores.add(suma[i]);
            }
        }
        
        // Ordenamos el ArrayList:
        Collections.sort(ganadores);
        
        // Mostramos quién ha ganado:
        for (int i = 0; i < jugadores.length; i++) {
            
            if (jugadores[i].haPerdido()){
                System.out.println("El jugador " + (i+1) + " ha perdido");
            }
            else{
                if (suma[i] != ganadores.get(ganadores.size()-1)){
                    System.out.println("El jugador " + (i+1) + " ha perdido");
                }
                else{
                    System.out.println("El jugador " + (i+1) + " ha ganado");
                }
            }
            
        }

    }
    
}
