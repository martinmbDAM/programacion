/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que pinta 9 líneas siguiendo los gráficos del ejercicio
 * 9. Esta versión sigue el gráfico del apartado b.
 * Versiones alternativas: martint03e27a (apartado a), martint03e27c (apartado 
 * c) y martint03e27d (apartado d).
 */
package martin.matobuat03;

public class martint03e27b {

    public static void main(String[] args) {
        
        /*
         * El algoritmo pinta 9 líneas. En cada línea se pinta 'i' veces un 
         * número 'i'. Al principio del bucle 'i' vale 1 y al final vale 9. 
         */
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
