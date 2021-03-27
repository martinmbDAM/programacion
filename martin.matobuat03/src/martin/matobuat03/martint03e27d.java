/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que pinta 9 líneas siguiendo los gráficos del ejercicio
 * 9. Esta versión sigue el gráfico del apartado d.
 * Versiones alternativas: martint03e27a (apartado a), martint03e27b (apartado 
 * b) y martint03e27c (apartado c).
 */
package martin.matobuat03;

public class martint03e27d {

    public static void main(String[] args) {
        
        /*
         * El algoritmo pinta 9 líneas. En cada línea pinta '10-i'
         * números, desde el 'i' original, 9, hasta el número '9-i' posiciones
         * antes del 9. Por ejemplo, para i=7 debe mostrar: 987 (muestra 
         * 10-7=3 números desde el 9 hasta el número 9-7=2 posiciones antes):
         */
        for(int i=9;i>=0;i--){
            for (int j=9-i;j>0;j--){
                System.out.print(i+j);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
