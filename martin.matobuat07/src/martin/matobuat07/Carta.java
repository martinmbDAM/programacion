package martin.matobuat07;

public class Carta {
    
    private String nombre;    // Número y palo
    private float valor;      // Valor de la carta en el juego
    
    // Constructor:
    Carta(String nombre, float valor){
        this.nombre = nombre;
        this.valor  = valor;
    }
    
    // Métodos que permiten leer los atributos privados:
    String getNombre(){
        return(nombre);
    }
    
    float getValor(){
        return(valor);
    }

    // Métodos que permiten modificar los nombres y atributos de las cartas:
    void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    void setValor(float elValor){
        this.valor = elValor;
    }
}