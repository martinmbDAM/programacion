/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números enteros y determina si al menos uno
 * es mayor que 10.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01e {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int num1,num2;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer entero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo entero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (num1>10 || num2>10){
            System.out.println("\nAl menos uno de los números es mayor que 10\n");
        }
        else{
            System.out.println("\nNinguno de los números es mayor que 10\n");
        }
    
    }
}