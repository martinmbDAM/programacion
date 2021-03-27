/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que pinta 9 líneas siguiendo los gráficos del ejercicio
 * 9. Esta versión sigue el gráfico del apartado a.
 * Versiones alternativas: martint03e27b (apartado b), martint03e27c (apartado 
 * c) y martint03e27d (apartado d).
 */
package martin.matobuat03parte2;

public class martint03e27a {

    public static void main(String[] args) {
        
        /*
         * El algoritmo pinta 9 líneas. En cada línea se repite 10 veces el 
         * mismo número, desde el 0 (primera línea) hasta el 8 (última línea).
         */
        System.out.println();
        for (int i=0;i<9;i++){
            for(int j=0;j<10;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
