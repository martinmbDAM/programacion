package martin.matobuat07;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Primitiva2 {

    private final ArrayList <Integer> numeros;
    static private final int CIFRAS = 6;

    // Constructor:
    Primitiva2() {
        numeros = Primitiva2.generaBoleto();
    }

    // Método que recibe un boleto de la primitiva y devuelve el número de 
    // aciertos:
    int numAciertos(ArrayList <Integer> boleto) {
        Collections.sort(boleto);
        int aciertos = 0;
        if (numeros.size() == boleto.size()) {
            for (int i = 0; i < boleto.size(); i++) {
                if(Collections.binarySearch(numeros, boleto.get(i))>=0){
                    aciertos++;
                }
            }
        }
        return (aciertos);
    }

    // Método para generar un boleto al azar sin repetidos:
    static ArrayList <Integer> generaBoleto(){
        ArrayList <Integer> boleto = new ArrayList<>();
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < CIFRAS; i++) {
            
            // Generamos números aleatorios y los insertamos si no están
            // repetidos:
            boolean insertado=false;
            do{
                int num = aleatorio.nextInt(49)+1;
                if(!boleto.contains(num)){
                    insertado=true;
                    boleto.add(num);
                }
            }while(!insertado);
        }
        // Ordenamos el array:
        Collections.sort(boleto);
        
        return(boleto);
    }
    
    // Método para leer el boleto:
    ArrayList<Integer> getBoleto(){
        return(numeros);
    }

}
