/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee tres números enteros y dice si hay alguno mayor
 * que cero.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01l {

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
        if (num1>0 || num2>0 || num3>0){
            System.out.println("\nHay algún número mayor que 0\n");
        }
        else{
            System.out.println("\nNo hay ningún número mayor que 0\n");
        }
    }
    
}
