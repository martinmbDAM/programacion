/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que lee dos valores enteros, 'm' y 'n' y muestra los 
 * números comprendidos entre ellos ordenados ascendentemente, así como el valor
 * de elevar cada uno de esos números al cuadrado. No se sabe si m>n o n>m, pero
 * se usa una sola sentencia repetitiva.
 */

package martin.matobuat03;
import java.util.Scanner;

public class martint03e11 {

    public static void main(String[] args) {
        
        // Declaración de variables;
        int m, n, menor, mayor;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nPrimer número: ");
        m = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        n = Integer.parseInt(teclado.nextLine());
        
        // Se comprueba qué número es el mayor y cuál es el menor:
        menor = (m>=n)? n:m;
        mayor = (m>menor)? m:n;
        
        // Operaciones y salida de datos (se muestran los números comprendidos
        // entre los introducidos por el usuario excluyendo los extremos del
        // intervalo):
        System.out.println("\n----------------------------------------------");
        System.out.printf("Números del intervalo (%d,%d) al cuadrado:\n",
                          menor,mayor);
        for(int i=menor+1; i<mayor; i++){
            System.out.println(i + " -> " + i + " al cuadrado = " + i*i);
        }
        System.out.println("----------------------------------------------");
        
    }
    
}
