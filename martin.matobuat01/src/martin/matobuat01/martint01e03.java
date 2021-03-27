/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que lee dos números enteros y muestra el resultado de 
 * sumar, restar y dividir dichos números. La división debe responder con 
 * decimales.
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e03 {
    
    public static void main(String[] args) {
        
        // Declaración de variables:
        int num1, num2, suma, resta;
        int division;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca dos números:
        System.out.print("\nPrimer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        // Se realizan las operaciones pertinentes y se muestran los resultados
        // por pantalla, excepto en el caso de una división entre 0:
        
        // Suma:
        suma = num1 + num2;
        System.out.println("\n" + num1 + " + " + num2 + " = " + suma);
        
        // Resta:
        resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resta);
        
        // Evitamos la división por cero. Para ello, tenemos que hacer la 
        // división entera, ya que la división decimal entre cero se efectúa
        // sin lanzar una excepción aritmética en Java:
        try {
            division = num1/num2;
            System.out.printf("%d / %d = %.2f\n\n",num1,num2,(float)num1/num2);
            
        } 
        catch( Exception e ) {
            // En caso de que el denomidador sea 0, asignamos el mismo valor
            // a la división:
            division = 0;
            System.out.println("Error: " + e.getMessage());
            System.out.printf("División = %d\n\n",division);
        }

    }
}
