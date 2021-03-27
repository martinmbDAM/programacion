/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee tres números enteros y dice si hay alguno mayor
 * que cero, pero no todos.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01m {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int num1,num2,num3;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer entero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo entero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Tercer entero: ");
        num3 = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if ((num1>0 || num2>0 || num3>0) && !(num1>0 && num2>0 && num3>0)){
            System.out.println("\nHay algún número mayor que 0, pero no todos\n");
        }
        else{
            System.out.println("\nNo hay ningún número mayor que 0 o todos son"
                             + " mayores que 0\n");
        }
    }
    
}
