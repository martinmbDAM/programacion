/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un número entero y determina si es mayor que 10
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01a {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nIntroduzca un entero: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (numero > 10){
            System.out.printf("\n%d es mayor que 10\n\n",numero);
        }
        else{
            System.out.printf("\n%d no es mayor que 10\n\n",numero);
        }
    }
    
}
