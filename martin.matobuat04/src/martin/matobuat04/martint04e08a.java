/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita una cadena, una posición en la cadena y 
 * una letra. El programa sustituye el caracter de esa posición por la letra
 * introducida por el usuario. Esta versión utiliza la clase String.
 * Versión alternativa: martint04e08b (StringBuilder)
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e08a {

    public static void main(String[] args) {

        // Declaración de variables:
        int pos;
        char c;
        String cad;        
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (se verifica que la cadena mide lo suficiente:
        do {
            System.out.print("\nIntroduzca una cadena: ");
            cad = teclado.nextLine();
            System.out.print("\nIntroduzca una posición: ");
            pos = Integer.parseInt(teclado.nextLine());
            System.out.print("\nIntroduzca una letra: ");
            c = teclado.nextLine().charAt(0);
        } while (pos >= cad.length());
        
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad);

        // Sustitución del caracter en la posición 'pos':
        cad = cad.substring(0,pos) + c + cad.substring(pos+1);

        
        System.out.println("Nueva cadena: " + cad);
        System.out.println("-----------------------------------------------");

    }

}
