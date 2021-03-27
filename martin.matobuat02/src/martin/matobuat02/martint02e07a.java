/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que comprueba si un año es bisiesto. Esta versión 
 * utiliza varias sentencias condicionales.
 * Versión alternativa: martint02e07b (una sola sentencia condicional).
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e07a {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int año;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nAño: ");
        año = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        if (año%4==0){
            if (año%100!=0){
                System.out.println("\n" + año + " es bisiesto\n");
            }
            else{
                if (año%400==0){
                    System.out.println("\n" + año + " es bisiesto\n");
                }
                else{
                    System.out.println("\n" + año + " no es bisiesto\n");
                } 
            }
        }
        else{
            System.out.println("\n" + año + " no es bisiesto\n");
        }
    }
    
}
