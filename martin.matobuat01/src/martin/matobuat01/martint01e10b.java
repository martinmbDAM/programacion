/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula la longitud de la hipotenusa de un 
 * triángulo rectángulo en función de la longitud de sus catetos. Esta versión
 * del programa calcula la hipotenusa usando la función propia de Java.
 * Versión alternativa: martint01e10a.java (no usa la función propia de Java).
 */
package martin.matobuat01;
import java.util.Scanner;

public class martint01e10b {

    public static void main(String[] args) {
        
        // Declaración de variables:
        double cateto1, cateto2, hipotenusa;
        Scanner teclado = new Scanner(System.in);
             
         // Entrada de datos:
        System.out.print("\nCateto 1: ");
        cateto1 = teclado.nextDouble();
        System.out.print("Cateto 2: ");
        cateto2 = teclado.nextDouble();
             
        // Cálculo de la hipotenusa:
        hipotenusa = Math.hypot(cateto1,cateto2);
            
        // Se muestra el resultado con dos decimales:
        System.out.printf("\nHipotenusa: %.2f\n\n",hipotenusa);
    }
    
}
