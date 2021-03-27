/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números enteros y comprueba si el segundo
 * es divisor del primero.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01i {

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
        if (num2!=0 && num1%num2==0){
                System.out.printf("\n%d es divisor de %d\n\n",num2,num1);
            }
            else{
                System.out.printf("\n%d no es divisor de %d\n\n",num2,num1);
            }
        
    }
    
}
