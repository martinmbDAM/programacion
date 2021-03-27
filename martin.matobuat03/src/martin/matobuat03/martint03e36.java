/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que realiza la misma función que el anterior pero 
 * permite elegir la base a la que se quiere traducir: binario, ternario u octal.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e36 {

    public static void main(String[] args) {

        // Declaración de variables:
        int numero_decimal, cociente, resto, contador = 0, base;
        long numero_convertido = 0;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.print("\nIntroduzca un número: ");
        numero_decimal = Integer.parseInt(teclado.nextLine());
        do{
            System.out.print("Introduzca la base (2,3 u 8): ");
            base = Integer.parseInt(teclado.nextLine());
        }while(base!=2 && base!=3 && base!=8);

        /* Algoritmo para convertir a base 2, 3 u 8 un número decimal:
         * Se divide el número sucesivamente entre la base y se compone el número 
         * binario con el último cociente y todos los restos ordenados 
         * ascendentemente. Para ordenar los números se multiplican por la 
         * potencia de 10 que corresponda y se suman. Si el primer número es un
         * 0 desaparece y no se muestra.
         */
        
        int dividendo = numero_decimal;
        
        while (dividendo > 0) {

		resto     = dividendo%base;
                dividendo = dividendo/base;

		// Se añade el resto al número binario y se incrementa el 
                // contador:
                numero_convertido += resto*Math.pow(10.0, (double)contador);
                contador++;
		

	}

        // Salida de resultados:
        System.out.print("\n------------------------------------------------");
        System.out.printf("\nNúmero en decimal: %d", numero_decimal);
        System.out.printf("\nNúmero en base %d: %d", base, numero_convertido);
        System.out.println("\n------------------------------------------------");

        }

    }
