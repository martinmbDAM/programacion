/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que pinta 9 líneas siguiendo los gráficos del ejercicio
 * 9. Esta versión sigue el gráfico del apartado c.
 * Versiones alternativas: martint03e27a (apartado a), martint03e27b (apartado 
 * b) y martint03e27d (apartado d).
 */
package martin.matobuat03;

public class martint03e27c {

    public static void main(String[] args) {
     
        /*
         * El algoritmo pinta 9 líneas. En cada línea pinta un mismo número
         * 'i+1' un número de veces '10-i'. Es decir, el bucle interno pinta
         * '10-i' veces el número siguiente al número 'i' (por ejemplo, para el
         * número 8 el algoritmo pinta el número 9 10-8=2 veces). El primer 
         * número que se pinta es el 1 (cuando i=0), y el último, el 9 
         * (cuando i=8).
         */
        for(int i=0;i<9;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
