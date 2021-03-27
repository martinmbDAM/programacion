/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita una cadena, una posición en la cadena y 
 * una letra. El programa sustituye el caracter de esa posición por la letra
 * introducida por el usuario. Esta versión utiliza la clase StringBuilder.
 * Versión alternativa: martint04e08b (String)
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e08b {

    public static void main(String[] args) {

        // Declaración de variables:
        int pos;
        char c;
        StringBuilder cad;        
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (se verifica que la cadena mide lo suficiente:
        do {
            System.out.print("\nIntroduzca una cadena: ");
            cad = new StringBuilder(teclado.nextLine());
            System.out.print("\nIntroduzca una posición: ");
            pos = Integer.parseInt(teclado.nextLine());
            System.out.print("\nIntroduzca una letra: ");
            c = teclado.nextLine().charAt(0);
        } while (pos >= cad.length());
 
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad);
        
        // Sustitución del caracter en la posición 'pos':
        cad.setCharAt(pos,c);
        
        System.out.println("Cadena modificada: " + cad);
        System.out.println("-----------------------------------------------");

    }

}
