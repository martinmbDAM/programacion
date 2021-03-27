/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que muestra los números perfectos comprendidos entre 1
 * y 10.000. Los números perfectos son aquellos que son iguales a la suma de 
 * todos los divisores menores que ellos.
 */
package martin.matobuat03;

public class martint03e14 {

    public static void main(String[] args){
        
        // Declaración de variables:
        int suma = 0;
        
        System.out.print("\nNúmeros perfectos entre 1 y 10.000: \n");
        
        // Cálculo de los números perfectos:
        for (int i=1; i<=10000;i++){
            // Para cada número se calculan los divisores (se ignoran los 
            // números comprendidos entre 'i' e 'i/2', ya que ningún número 
            // tiene divisores en ese intervalo):
            for (int j=i/2; j>0; j--){
                
                // Cálculo de la suma de los divisores:
                if (i%j==0){
                    suma += j;
                }
            }
            
            // Se comprueba si el número es perfecto:
            if (i == suma){
                System.out.print(" " + i);
            }
            
            // Se pone la suma a 0:
            suma = 0;
            
        }
        
        System.out.println();
       
    }
    
}
