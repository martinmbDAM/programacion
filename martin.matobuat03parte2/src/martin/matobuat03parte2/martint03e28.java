/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que comprueba si para los primeros 10.000 números 
 * enteros positivos se cumple la siguiente afirmación:
 *
 * "La suma de los dígitos de los números múltiplos de 3 es también un múltiplo
 * de 3".
 */
package martin.matobuat03parte2;

public class martint03e28 {

    public static void main(String[] args) {

        // Declaración de variables:
        boolean se_cumple = true; // Bandera
        int contador = 12;        // Primer múltiplo de 3 de más de un dígito
        int suma;                 // Suma de los dígitos
        int digito;               // Cada uno de los dígitos
        int num;                  // Copia del número actual

        while (contador<=10000 && se_cumple) {            
            
            suma = 0;
            num  = contador;
            
            // Se descompone el número en sus dígitos:
            while (num > 0) {
                digito = num % 10;
                num = num / 10;
                suma += digito;
            }
            // Si la suma no es múltiplo de 3, se modifica el valor de la 
            // bandera:
            se_cumple = suma%3==0;

            // Se avanza al siguiente número múltiplo de 3:
            contador += 3;
        }

        // Salida de resultados:
        System.out.println("\n-----------------------------");
        if (se_cumple) {
            System.out.println("La afirmación es correcta");
        } else {
            System.out.println("La afirmación es falsa");
        }
        System.out.println("-----------------------------");
    }

}
