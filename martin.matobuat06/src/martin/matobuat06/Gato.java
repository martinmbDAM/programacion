
package martin.matobuat06;
import java.util.Random;

public class Gato {
    
    private int fila;       // Fila en la que está el gato
    private int columna;    // Columna en la que está el gato

    // Constructor que inicializa la posición del gato de forma aleatoria en
    // función de las dimensiones del tablero:
    Gato(TableroGatoRaton untablero) {
        Random aleatorio = new Random();
        this.fila = aleatorio.nextInt(untablero.getFilas());
        this.columna = aleatorio.nextInt(untablero.getColumnas());
    }
    
    // Método que modifica la posición del gato en función de la del ratón:
    void mover(TableroGatoRaton juego){
        int fila_raton = juego.getRaton().getFila();
        int columna_raton = juego.getRaton().getColumna();
        
        // Si la diferencia entre filas es mayor, se modifica la fila:
        if (Math.abs(fila_raton-fila)>Math.abs(columna_raton-columna)){
            if (fila_raton>fila){
                fila++;
            }
            else{
                fila--;
            }
        }
        // Si la diferencia entre columnas es mayor, se modifica la columna:
        else{
            if (columna_raton>columna){
                columna++;
            }
            else{
                columna--;
            }
        }
    }
    
    // Método que devuelve la fila en la que está el gato:
    int getFila() {
        return (fila);
    }
    
    // Método que devuelve la columna en la que está el gato:
    int getColumna() {
        return (columna);
    }
    
}