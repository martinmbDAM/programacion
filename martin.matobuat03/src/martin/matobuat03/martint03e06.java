/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que muestra los números pares comprendidos entre 100 y
 * 1 en orden descendente.
 */
package martin.matobuat03;

public class martint03e06 {
    
    public static void main(String[] args) {
        
        // Operaciones y salida de resultados:
        
        System.out.println("\nNúmeros pares entre 100 y 1 en orden descendente:");
        
        for (int i=100; i>=1; i--){
            // Se muestran los pares:
            if (i%2==0){
                System.out.println(i);
            }
        }
        
    }
    
}
