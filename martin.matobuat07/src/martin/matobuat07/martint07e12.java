/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa llamado hipotenusa al que se le pasan como parámetros 
 * dos valores, verifica que son enteros positivos y que suponiendo que son los 
 * catetos de un ángulo recto, calcula el valor de la hipotenusa. (Se refiere a 
 * introducirlos en la llamada al programa, java prog param1 param2, sería algo 
 * así: java hipotenusa 4 2.
 */
package martin.matobuat07;

public class martint07e12 {

    public static void main(String[] args) {
        
        if(args.length==2){
            
            int c1 = Integer.parseInt(args[0]);
            int c2 = Integer.parseInt(args[1]);
            
            if (c1>0 && c2>0){
                System.out.println("Hipotenusa: " + (c1*c1 + c2*c2));
            }         
            
        }
        
    }
    
}
 