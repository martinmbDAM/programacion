/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa al que se le introduce un número y garantiza que es
 * positivo, es decir, si se introduce 0 o un número negativo volverá a pedirlo.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e13 {

    public static void main(String[] args) {
        
        // Declaración de variables:
        float num;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        do{
            System.out.print("\nIntroduzca un número: ");
            num = teclado.nextFloat();
        }while (num<=0);
        
        // Se muestra el resultado cuando el ususario introduce un positivo:
        System.out.print("\n---------------------------------------------");
        System.out.printf("\nNúmero introducido: %.2f\n",num);
        System.out.println("---------------------------------------------");
        
    }
    
}
