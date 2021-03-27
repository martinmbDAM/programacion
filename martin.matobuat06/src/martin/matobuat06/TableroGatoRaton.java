
package martin.matobuat06;

public class TableroGatoRaton {
    
    private final int filas;     // Número de filas del tablero
    private final int columnas;  // Número de columnas del tablero
    public Raton raton;         // El ratón
    public Gato gato;           // El gato
    
    // Constructor que recibe las dimensiones:
    TableroGatoRaton(int num_filas, int num_columnas){
        this.filas = num_filas;
        this.columnas = num_columnas;
        raton = new Raton(this);
        gato = new Gato(this);
    }
    
    // Método para mostrar el tablero por pantalla:
    void pintarTablero(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i==raton.getFila() && j==raton.getColumna()){
                    System.out.print("R");
                }
                else if(i==gato.getFila() && j==gato.getColumna()){
                    System.out.print("G");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
    
    // Método para comprobar si el juego se ha terminado:
    boolean Final(){
        return(raton.getFila()==gato.getFila() && raton.getColumna()==
               gato.getColumna());
    }
    
    // Método que devuelve el número de filas del tablero:
    int getFilas(){
        return(filas);
    }
    
    // Método que devuelve el número de columnas del tablero:
    int getColumnas(){
        return(columnas);
    }
    
    // Método que devuelve la posición del ratón:
    Raton getRaton(){
        return(raton);
    }
}
