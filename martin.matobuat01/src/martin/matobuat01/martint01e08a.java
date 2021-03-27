/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula la media de edad de 4 personas. Esta 
 * versión utiliza 5 variables.
 * Versiones alternativas: martint01e08b.java (2 variables) y 
 * martint01e08c.java (1 variable).
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e08a {

    public static void main(String[] args) {
        
        // Declaración de variables:
        int edad1, edad2, edad3, edad4;
        double media;
        Scanner teclado = new Scanner(System.in);
            
        // Entrada de datos por teclado:
        System.out.print("\nEdad de la primera persona: ");
        edad1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la segunda persona: ");
        edad2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la tercera persona: ");
        edad3 = Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la cuarta persona: ");
        edad4 = Integer.parseInt(teclado.nextLine());
            
        // Cálculo de la media redondeada:
        media = (double) (edad1 + edad2 + edad3 + edad4) / 4;
            
        // Se muestra el resultado:
        System.out.printf("\nMedia de las cuatro edades: %.2f\n\n",media);
    
    }
}
        
        