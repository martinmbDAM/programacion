/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que pinta 9 líneas siguiendo los gráficos del ejercicio
 * 9. Esta versión sigue el gráfico del apartado c.
 * Versiones alternativas: martint03e27a (apartado a), martint03e27b (apartado 
 * b) y martint03e27d (apartado d).
 */
package martin.matobuat03parte2;

public class martint03e27c {

    public static void main(String[] args) {
     
        /*
         * El algoritmo pinta 9 líneas. En cada línea pinta un mismo número 'i'
         * 11-i veces. 'i' empieza valiendo 1 y acaba valiendo 9.
         */
        for(int i=1;i<=9;i++){
            for(int j=11;j-i>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
