/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que define un Array con 10 elementos e introduce 
 * valores al azar entre 1 y 20, garantizando que no se introducen repetidos.
 */
package martin.matobuat07;
import java.util.Random;

public class martint07e04 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int [] elementos = new int [10];
        
        for (int i = 0; i < elementos.length; i++) {
            boolean insertado = false;
            do{
                int nuevo = aleatorio.nextInt(20)+1;
                boolean repetido = false;
                int pos=0;
                while(!repetido && pos<elementos.length){
                    repetido = nuevo==elementos[pos];
                    pos++;
                }
                if (!repetido){
                    insertado=true;
                    elementos[i] = nuevo;
                }
            }while(!insertado);
        }
        
        // Mostramos el array:
        for(int i=0; i<elementos.length; i++){
            System.out.print(elementos[i] + " ");
        }
        
    }
    
}
