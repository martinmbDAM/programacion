/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: El siguiente programa tiene una variable global llamada saldo 
 * sobre la que se ejecutan las funciones ingresar() y retirar() que aumentan y 
 * reducen el saldo respectivamente, no pudiendo quedar el saldo por debajo de 
 * cero. ¿Hay algún error? ¿Cuánto vale la variable saldo al finalizar la 
 * ejecución del programa?
 */
package martin.matobuat05;

public class martint05e09 {
    
    /*
     * Análisis del código: En primer lugar se ingresan 30 euros. A continuación
     *                      se retiran 10 euros dos veces, con lo cual el 
     *                      saldo final es de diez euros. La llamada a la
     *                      función que se realiza dentro del 'if' también 
     *                      modifica el saldo. Como el saldo es una variable
     *                      global, se puede modificar dentro de la función.
     * Errores: En la línea 29 se declara una variable booleana que nunca se 
     *          usa.
    */

    public static int saldo = 0;

    public static void main(String[] args) {
        boolean ok = false;
        ingresar(30);
        retirar(10);
        if (retirar(10) == false) {
            System.out.println("No se puede retirar tanto");
        }
        System.out.println("Saldo final: " + saldo);
    }

    static void ingresar(int i) {
        saldo += i;
    }

    static boolean retirar(int i) {
        if (i > saldo) {
            return false;
        }
        saldo -= i;
        return true;

    }
}
