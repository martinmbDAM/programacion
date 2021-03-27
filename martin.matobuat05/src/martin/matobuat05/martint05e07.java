/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Un número primo es aquel que solo tiene como divisores el número 
 * 1 y a él mismo. Usando la función del programa anterior, haz un programa que 
 * muestre la suma de los números primos comprendidos entre 1 y 1000.
 */
package martin.matobuat05;

public class martint05e07 {

    public static void main(String[] args) {

        int suma_primos=0;
        
        for (int i=1; i<=1000; i++) {
            if (cantidadDivisores(i)==0){
                suma_primos+=i;
            }
        }
        
        System.out.println("Suma de los números primos del intervalo [1,1000]:"
                           + " " + suma_primos);
        

    }
    
    // Función que permite calcular los divisores de un número (no se incluyen
    // ni el 1 ni el propio número):
    static int cantidadDivisores(int n) {
        int divisores = 0;
        if (n > 0) {
            for (int i = 2; i <= n/2; i++) {
                if (n%i==0){
                    divisores++;
                }
            }
        }
        return (divisores);
    }

}
