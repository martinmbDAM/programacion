/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que recibe un número entero y lo muestra en binario. 
 */

package martin.matobuat03;
import java.util.Scanner;

public class martint03e35 {

    public static void main(String[] args) {

        // Declaración de variables:
        int numero_decimal, cociente, resto, contador = 0;
        long numero_binario = 0;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.print("\nIntroduzca un número: ");
        numero_decimal = Integer.parseInt(teclado.nextLine());

        /* Algoritmo para convertir a binario un número decimal:
         * Se divide el número sucesivamente entre 2 y se compone el número 
         * binario con el último cociente y todos los restos ordenados 
         * ascendentemente. Para ordenar los números se multiplican por la 
         * potencia de 10 que corresponda y se suman. Si el primer número es un
         * 0 desaparece y no se muestra.
         */
        
        int dividendo = numero_decimal;
        
        while (dividendo > 0) {

		resto     = dividendo%2;
                dividendo = dividendo/2;

		// Se añade el resto al número binario y se incrementa el 
                // contador:
                numero_binario += resto*Math.pow(10.0, (double)contador);
                contador++;
		

	}
 
        // Salida de resultados:
        System.out.print("\n------------------------------------------------");
        System.out.printf("\nNúmero en decimal: %d", numero_decimal);
        System.out.printf("\nNúmero en binario: %d", numero_binario);
        System.out.println("\n------------------------------------------------");

        }

    }
