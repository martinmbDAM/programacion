/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Programa que comprueba el funcionamiento de cinco funciones:
 *
 * 1. par(): Comprueba si un número entero es par
 * 2. mayor(): Devuelve el mayor de 3 dobles
 * 3. sumaIntervalo(): Recibe dos 'long' y devuelve la suma de los números
      comprendidos entre ellos si el primero es menor que el segundo y ambos son
 *    son mayores que 0. En caso contrario, devuelve -1.
 * 4. contarCeros(): Recibe una cadena y devuelve la cantidad de ceros que 
 *    contiene.
 * 5. aleatorio(): Devuelve un valor aleatorio comprendido entre dos enteros en
 *    caso de que el primero sea menor que el segundo y ambos sean mayores de 0.
 *    En caso contrario, devuelve -1. 
 */
package martin.matobuat05;

import java.util.Scanner;
import java.util.Random;

public class martint05e01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Prueba de la función esPar():
        
        System.out.println("-------------Prueba función esPar()-------------");
        
        System.out.print("Introduzca un entero: ");
        int n = Integer.parseInt(teclado.nextLine());
        if (esPar(n)){
            System.out.printf("%d es un número par",n);
        }
        else{
            System.out.printf("%d es un número impar",n);
        }
        
        System.out.print("\n\n");
        System.out.println("--------------Prueba función mayor()-------------");
        
        // Prueba de la función mayor():
        
        System.out.print("Introduzca un número: ");
        double primero = teclado.nextDouble();
        System.out.print("Introduzca un número: ");
        double segundo = teclado.nextDouble();
        System.out.print("Introduzca un número: ");
        double tercero = teclado.nextDouble();
        System.out.printf("El número más grande del conjunto (%.2f,%.2f,%.2f)"
                          + " es el %.2f",primero,segundo,tercero,
                          mayor(primero,segundo,tercero));
        
        System.out.print("\n\n");
        
        // Prueba de la función sumaIntervalo():
        
        System.out.println("---------Prueba función sumaIntervalo()----------");
        
        System.out.print("Introduzca un número entero: ");
        long a = teclado.nextLong();
        System.out.print("Introduzca un número entero: ");
        long b = teclado.nextLong();
        if (sumaIntervalo(a,b)==-1){
            System.out.printf("ERROR: %d no es menor que %d o alguno de los "
                              + "números no es mayor que 0",a,b);
        }
        else {
            System.out.printf("Suma de los números del intervalo [%d,%d]: %d",
                              a,b,sumaIntervalo(a,b));
        }
        
        System.out.print("\n\n");
        
        // Prueba de la función contarCeros():
        
        System.out.println("----------Prueba función contarCeros()-----------");
        
        System.out.print("Introduzca una cadena: ");
        teclado.nextLine(); // Descarta el '\n'
        String cad = teclado.nextLine();
        System.out.printf("Número de ceros: %d",contarCeros(cad));
        
        System.out.print("\n\n");
        
        // Prueba de la función aleatorio():
        
        System.out.println("-----------Prueba función aleatorio()------------");
        
        System.out.print("Introduzca un entero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca un entero: ");
        int num2 = teclado.nextInt();
        int num_aleatorio = aleatorio(num1,num2);
        if (num_aleatorio==-1){
            System.out.println("ERROR: " + num1 + " no es menor que " + num2
                             + " o alguno no es mayor que 0\n");
        } 
        else {
            System.out.printf("Número aleatorio en el intervalo [%d,%d]: %d\n",
                              num1,num2,num_aleatorio);
        }

    }
    
    // Función que comprueba si un número entero es par:
    static boolean esPar(int n) {
        return (n % 2 == 0);
    }
    
    // Función que devuelve el mayor de 3 números 'double':
    static double mayor(double a, double b, double c) {
        a = (a > b) ? a : b;
        a = (a > c) ? a : c;
        return (a);
    }
    
    // Función que suma los números de un intervalo (los límites del intervalo
    // se incluyen en la suma):
    static long sumaIntervalo(long a, long b) {
        long suma = -1;
        if (a < b && a > 0 && b > 0) {
            suma = 0;
            while (a <= b) {
                suma += a;
                a++;
            }
        }
        return (suma);
    }

    // Función que cuenta la cantidad de ceros que hay en una cadena:
    static int contarCeros(String cad) {
        int contador = 0;
        int pos = 0;
        while (cad.indexOf('0', pos) != -1){
            contador++;
            pos = cad.indexOf('0', pos) + 1;
        }
        return (contador);
    }

    // Función que genera un número aleatorio entre los números de un intervalo
    // (se incluyen los límites del intervalo):
    static int aleatorio(int a, int b) {
        int num = -1;
        if (a < b && a > 0 && b > 0) {
            Random n = new Random();
            num = n.nextInt(b-a) + a;
        }
        return (num);
    }
}
