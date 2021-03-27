
package martin.matobuat07;
import java.util.ArrayList;

public class Jugador {
    
    private final ArrayList <Carta> cartas; // Cartas del jugador
    private boolean plantado;               // Estado del jugador
    
    // Constructor:
    Jugador(){
        cartas = new ArrayList<>();
        plantado = false;
    }
    
    // Método que permite al jugador plantarse:
    void plantarse(){
        plantado = true;
    }
    
    // Método que permite saber si el jugador ha perdido:
    boolean haPerdido(){
        // Si la suma de las cartas del jugador supera el 7.5, el jugador ha
        // perdido:
        float suma = 0;
        for (int i = 0; i < cartas.size(); i++) {
            suma += cartas.get(i).getValor();
        }
        return(suma>7.5);
    }
    
    // Método que permite saber si el jugador se ha plantado:
    boolean seHaPlantado(){
        return(plantado);
    }
    
    // Método que permite al jugador pedir carta:
    void pideCarta(Carta unaCarta){
        cartas.add(unaCarta);
    }
    
    // Método que devuelve las cartas de un jugador:
    ArrayList<Carta> getCartas(){
        return(cartas);
    }
    
}
