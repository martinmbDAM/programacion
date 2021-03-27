/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Análisis de la funcionalidad del código del ejercicio 7. Se 
 * comenta si hay algún error, si falta alguna llave y si se podría reducir el
 * recorrido del 'for' para que el programa sea más rápido, manteniendo su 
 * funcionalidad.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e07 {

    public static void main(String[] args) {

        /* Análisis:
         * Funcionalidad: El programa pide al usuario un número comprendido 
         *                entre 1 y 1000, verifica que el número esté en el 
         *                intervalo y a continuación obtiene y muestra todos sus 
         *                divisores en orden descendente.
         * Errores: Hay un error en el primer 'if', ya que en lugar de comprobar
         *          si el número es menor que 0 o mayor que 1000 comprueba si el
         *          número es simultáneamente menor que 0 y mayor que 1000, lo 
         *          cual es imposible, por lo tanto se evalúa siempre como 
         *          'false', y además el intervalo no es correcto, ya que 
         *          considera correcto el número 0. Lo correcto 
         *          es if (num<1 || num>1000). También hay un error en el 
         *          'for', ya que en la condición de control se comprueba
         *          que 'num' sea mayor o igual que 1, lo cual es siempre
         *          cierto y lleva a que no se salga nunca del bucle y se llegue
         *          a una división por 0 cuando 'i' tome el valor 0. Lo 
         *          correcto es evaluar 'i' en lugar de 'num', de este modo: 
         *          for (int i=num; i>=1; i--).
         * Llaves: No falta ninguna llave.
         * Eficiencia: Se podría reducir el recorrido del 'for' saltándonos los
         *             números comprendidos en el intervalo abierto (num,num/2),
         *             ya que no hay divisores entre un número y su mitad. Se 
         *             mejoraría la eficiencia si antes del bucle se imprime el 
         *             número original (todo número es divisible por sí mismo) y 
         *             dentro del bucle se calculan los divisores menores que el 
         *             número.
         */
        // Código original:
        /*
        int num;        
        Scanner teclado = new Scanner(System.in);                
        System.out.print("Introduce un número natural entre 1 y 1000: ");        
        num = teclado.nextInt();        
        if (num <0 && num > 1000)           
            System.out.println("Numero incorrecto.");        
        else            
            for (int i=num;num>=1;i--)                
                if (num % i == 0) System.out.println(i); 
         */
        // Código modificado:
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num < 1 || num > 1000) {
            System.out.println("Número incorrecto.");
        } else {
            System.out.println(num);
            for (int i = num/2; i>=1; i--) {
                if (num%i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
