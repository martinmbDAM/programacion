/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que recibe un entero, verifica que está comprendido 
 * entre 1 y 10 y muestra su tabla de multiplicar.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e04 {

    public static void main(String[] args) {

        // Declaración de variables:
        int num;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (sólo se admiten valores en el intervalo [1,10]):
        do {
            System.out.print("\nIntroduzca un entero en el intervalo [1,10]: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num < 1 || num > 10);

        // Tabla de multiplicar:
        System.out.println("\n---------------");
        System.out.printf("TABLA DEL %d:\n",num);
        for (int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        System.out.println("---------------");

    }

}
