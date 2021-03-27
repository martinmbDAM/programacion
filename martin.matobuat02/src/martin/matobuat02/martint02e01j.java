/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos números enteros y comprueba si el menor de
 * ellos es divisor del mayor.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e01j {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int num1,num2, menor, mayor;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        // Comprobamos cuál es el menor (si son iguales se almacena el mismo
        // número, ya que todo número distinto de 0 es divisor de sí mismo:
        menor = (num1>num2)? num2:num1;
        mayor = (num1>menor)? num1:num2;
        
        // Salida de resultados:
        if (menor!=0 && mayor%menor==0){
            System.out.printf("\n%d es divisor de %d\n\n",menor,mayor);
        }
        else{
            System.out.printf("\n%d no es divisor de %d\n\n",menor,mayor);
        }
    }
    
}
