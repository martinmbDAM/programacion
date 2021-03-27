/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula la media de edad de 4 personas. Esta 
 * versión utiliza 2 variables.
 * Versiones alternativas: martint01e08a.java (5 variabless) y 
 * martint01e08c.java (1 variable).
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e08b {

    public static void main(String[] args) {
        
        // Declaración de variables e inicialización de la variable acumulativa
        // 'edad':
        int edad = 0;
        double media;
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
            
        // Cálculo de la media redondeada:
        media = (double) edad / 4;
            
        // Se muestra el resultado:
        System.out.printf("\nMedia de las cuatro edades: %.2f\n\n",media);
    }
    
}
