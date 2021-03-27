/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que define un Array con 10 elementos e introduce 
 * valores al azar entre 1 y 20. Al finalizar informa si tiene repetidos o no.
 */
package martin.matobuat07;
import java.util.Random;

public class martint07e03 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int [] elementos = new int [10];
        
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = aleatorio.nextInt(20)+1;
        }
        
        boolean repetidos = false;
        int pos1 = 0;
        
        while(!repetidos && pos1<elementos.length-1){
            int pos2 = pos1+1;
            while(!repetidos && pos2<elementos.length){
                repetidos = elementos[pos1]==elementos[pos2];
                pos2++;
            }            
            pos1++;
        }
        
        // Mostramos el array:
        for(int i=0; i<elementos.length; i++){
            System.out.print(elementos[i] + " ");
        }
        
        // Mostramos si hay repetidos:
        if (repetidos){
            System.out.println("\nHay elementos repetidos");
        }
        else{
            System.out.println("\nNo hay elementos repetidos");
        }
    }
    
}
