/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que intercambia dos variables. Esta versión utiliza una 
 * variable auxiliar.
 * Versión alternativa: martint01e09b.java (sin variable auxiliar).
 */
package martin.matobuat01;
import java.util.Scanner;

public class martint01e09a {

    public static void main(String[] args) {
        
        // Declaración de variables:
        int var1, var2, var_aux;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.print("\nIntroduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
            
        // Intercambio:
        var_aux = var1;
        var1 = var2;
        var2 = var_aux;
            
        // Salida de resultados:
        System.out.println("\nAhora var1 es igual a " + var1);
        System.out.println("Ahora var2 es igual a " + var2 + "\n");
    }
    
}
