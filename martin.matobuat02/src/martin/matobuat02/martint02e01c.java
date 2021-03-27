/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un número entero y determina si es par o impar
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01c {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nIntroduzca un entero: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (numero%2 == 0){
            System.out.printf("\n%d es un número par\n\n",numero);
        }
        else{
            System.out.printf("\n%d es un número impar\n\n",numero);
        }
    }
    
}
