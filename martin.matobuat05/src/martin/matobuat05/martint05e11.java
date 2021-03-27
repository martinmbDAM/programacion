/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: ¿Qué mostraría este código por pantalla? ¿Por qué?
 */
package martin.matobuat05;

public class martint05e11 {
    
    /*
     * Análisis: Dado que 'saldo' es una variable local del main y que el paso
     * a la función 'ingresar' se hace por valor, no se realiza ninguna 
     * modificación. Por lo tanto, el programa muestra "No tienes más de 1000
     * euros: 500.0". Si el saldo fuese una variable global en lugar de 
     * pasarse como parámetro, sí se modificaría.
    */

    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        if (saldo > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static void ingresar(float saldo, float increm) {
        saldo += increm;
    }

}
