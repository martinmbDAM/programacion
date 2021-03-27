/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un número entero y determina si está 
 * comprendido entre 10 y 20, ambos incluidos.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01f {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nIntroduzca un entero: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (10<=numero && numero<=20){
            System.out.printf("\n%d está comprendido entre 10 y 20\n\n",numero);
        }
        else{
            System.out.printf("\n%d no está comprendido entre 10 y 20\n\n",
                              numero);
        }
    }
    
}
