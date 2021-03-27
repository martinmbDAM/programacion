/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?
 */
package martin.matobuat05;

public class martint05e10 {
    
    /*
     * Análisis: El código es erróneo porque el segundo ingreso (el que se
     * produce dentro del 'if') no se guarda (el valor que devuelve la función 
     * 'ingresar' se usa dentro del 'if', pero no se suma al saldo). Esto sucede 
     * porque en Java los parámetros de las funciones se pasan por valor y no 
     * por referencia. El código muestra: No tienes más de 1000 euros: 900.0, a 
     * pesar de que el usuario querría tener 1300.
    */

    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f) > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }

}
