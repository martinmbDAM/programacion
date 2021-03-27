/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que saca por pantalla la suma, la media y el producto 
 * de todos los números pares comprendidos entre dos números introducidos por el
 * usuario. No se incluyen en los cálculos los números introducidos y 
 * desconocemos si el primero es mayor que el segundo o viceversa.
 */
package martin.matobuat03parte2;

import java.util.Scanner;

public class martint03e29 {

    public static void main(String[] args) {

        // Declaración de variables:
        int m, n, suma=0, contador=0, producto=1;
        float media;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.print("\nPrimer número: ");
        m = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        n = Integer.parseInt(teclado.nextLine());

        // El bucle supone que m<n, de modo que si el valor 'm' introducido por
        // el usuario es mayor que 'n' es necesario intercambiarlos:
        if (m > n) {
            int temporal = m;
            m = n;
            n = temporal;
        }

        // Se realizan la suma, el producto y se incrementa el contador:
        for (int i=m+1; i<n; i++) {
            
            // Si el número es par se realizan las operaciones:
            if (i%2 == 0) {
                suma += i;
                producto *= i;
                contador++;
            }

        }
        
        System.out.print("\n---------------------------------------------");
        
        // Si hay números pares entre m y n se realiza la media y se muestran
        // los resultados:
        if (contador != 0) {
            
            media = (float) suma / contador;
            
            // Salida de resultados:
            System.out.printf("\nSuma de los números pares intermedios: %d", 
                              suma);
            System.out.printf("\nProducto de los números pares intermedios: %d",
                              producto);
            System.out.printf("\nMedia de los números pares intermedios: %.2f\n",
                              media);
        }
        else{
            System.out.printf("\nNo hay números pares entre %d y %d\n",m,n);
        }
        
        System.out.print("---------------------------------------------\n");

    }

}
