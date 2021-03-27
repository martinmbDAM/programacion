/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que saca por pantalla la suma, la media y el producto 
 * de todos los números pares comprendidos entre dos números introducidos por el
 * usuario. No se incluyen en los cálculos los números introducidos y 
 * desconocemos si el primero es mayor que el segundo o viceversa.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e29 {

    public static void main(String[] args) {

        // Declaración de variables:
        int num1, num2, menor, mayor, suma = 0, contador = 0;
        long producto = 1;
        float media=-1f;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.print("\nPrimer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());

        // Se comprueba cuál es el menor y el mayor:
        menor = (num1 >= num2) ? num2 : num1;
        mayor = (num1 > menor) ? num1 : num2;

        // Se realizan la suma, el producto y la media:
        for (int i = menor + 1; i < mayor; i++) {
            // Si el número es par se realizan las operaciones:
            if (i % 2 == 0) {
                suma += i;
                producto *= i;
                contador++;
            }

        }
        // La media solo se realiza si contador!=0, es decir, si hay números 
        // pares entre num1 y num2:
        if(contador!=0){
            media = (float) suma / contador;
        }
        
        // Salida de resultados:
        System.out.print("\n----------------------------------------------");
        System.out.printf("\nSuma de los números pares intermedios: %d", suma);
        System.out.printf("\nProducto de los números pares intermedios: %d", 
                         producto);
        System.out.printf("\nMedia de los números pares intermedios: %.2f\n", 
                        media);
        System.out.print("----------------------------------------------\n");

    }

}
