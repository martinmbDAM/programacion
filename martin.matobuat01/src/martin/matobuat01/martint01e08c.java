/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula la media de edad de 4 personas. Esta 
 * versión utiliza 1 variable.
 * Versiones alternativas: martint01e08a.java (5 variables) y 
 * martint01e08b.java (2 variables).
 */
package martin.matobuat01;
import java.util.Scanner;

public class martint01e08c {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
            
        // Entrada de datos por teclado:
        System.out.print("\nEdad de la primera persona: ");
        edad += Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la segunda persona: ");
        edad += Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la tercera persona: ");
        edad += Integer.parseInt(teclado.nextLine());
        System.out.print("Edad de la cuarta persona: ");
        edad += Integer.parseInt(teclado.nextLine());
            
        // Se muestra el resultado:
        System.out.printf("\nMedia de las cuatro edades: %.2f\n\n",
                          (double) edad/4);       
    }
    
}
