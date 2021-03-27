/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar un programa que genere 10.000 números aleatorios entre 
 * 1 y 6 (como si fuese lanzar un dado). Guarda los resultados obtenidos, esto 
 * es, cuantas veces ha salido el uno, cuantas veces ha salido el dos, etc… para 
 * finalmente mostrar la diferencia de veces entre el número que más ha salido y 
 * el que menos ha salido.
 */
package martin.matobuat07;
import java.util.Random;

public class martint07e22 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        // Array en el que almacenaremos el resultado:
        int[] dado = {0,0,0,0,0,0};
        
        for (int i = 0; i < 10000; i++) {
            int n = aleatorio.nextInt(6)+1;
            dado[n-1]++;
        }
        
        // Cálculo de la diferencia entre las veces que ha salido el número que
        // más ha salido y las veces que ha salido el número que menos ha 
        // salido:
        int max=0,min=10000;
        
        for (int i = 0; i < dado.length; i++) {
            if(dado[i]<min){
                min=dado[i];
            }
            if(dado[i]>max){
                max=dado[i];
            }
        }
        
        for (int i = 0; i < dado.length; i++) {
            System.out.println((i+1) + ": " + dado[i] + " veces");
        }
        
        System.out.println("Diferencia entre el máximo y el mínimo: " 
                + (max-min));
        
    }
    
}
