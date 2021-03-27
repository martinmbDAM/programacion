/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar un programa al que se le vayan introduciendo por 
 * teclado números enteros. El programa dispone de dos ArrayList, uno llamado 
 * positivos y otro negativos. Se trata de meter los números introducidos en uno 
 * u otro según su signo hasta que finalice el programa (esto ocurrirá cuando se 
 * introduzca cero). Al finalizar, mostrará la media aritmética de cada 
 * ArrayList.
 */
package martin.matobuat07;
import java.util.Scanner;
import java.util.ArrayList;

public class martint07e16 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList <Integer> positivos = new ArrayList <>();
        ArrayList <Integer> negativos = new ArrayList <>();
        
        int num;
        do{
            System.out.print("Número: ");
            num=teclado.nextInt();
            
            if(num!=0){
                if(num>0){
                    positivos.add(num);
                }
                else{
                    negativos.add(num);
                }
            }
        }while(num!=0);
        
        // Realizamos la media de ambos arrays:
        float media_positivos=0,media_negativos=0;
        
        for (int i = 0; i < positivos.size(); i++) {
            media_positivos+=positivos.get(i);
        }
        media_positivos = media_positivos/positivos.size();
        
        for (int i = 0; i < negativos.size(); i++) {
            media_negativos+=negativos.get(i);
        }
        media_negativos = media_negativos/negativos.size();
        
        if(positivos.size()>0){
            System.out.println("Media de los números positivos: " + 
                    media_positivos);
        }
        else{
            System.out.println("No hay números positivos");
        }
        
        if(negativos.size()>0){
            System.out.println("Media de los números negativos: " + 
                    media_negativos);
        }
        else{
            System.out.println("No hay números negativos");
        }
    }
    
}
