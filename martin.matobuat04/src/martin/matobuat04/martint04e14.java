/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita al usuario una cadena, la convierte en 
 * StringBuilder y realiza las siguientes acciones sobre ella:
 * 
 * 1. Borrar el caracter que haya en la posición 3.
 * 2. Insertar una 'x' en la posición 5.
 * 3. Sustituir el caracter de la posición 1 por una 'z'.
 * 4. Borrar los caracteres entre la posición 5 y 10.
 * 5. Darle la vuelta a todos los caracteres del StringBuilder.
 * 6. Convertir el StringBuilder en cadena.
 *
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduzca una cadena: ");
        StringBuilder cad = new StringBuilder(teclado.nextLine());

        System.out.println("-----------------------------------------------");
        System.out.println("Cadena: " + cad);
        System.out.println("-----------------------------------------------");

        // Borrar el caracter que haya en la posición 3:
        if (cad.length() >= 3) {
            cad.deleteCharAt(2);
            System.out.println("Borrar caracter de la posición 3: " + cad);

            System.out.println("---------------------------------------------");
        }

        // Insertar una 'x' en la posición 5:
        if (cad.length() >= 5) {
            cad.insert(4, 'x');
            System.out.println("Insertar una 'x' en la posición 5: " + cad);

            System.out.println("---------------------------------------------");
        }

        // Sustituir el caracter de la posición 1 por una 'z':
        if (cad.length() >= 1) {
            cad.setCharAt(0, 'z');
            System.out.println("Sustituir el caracter de la posición 1 por 'z':"
                    + cad);

            System.out.println("---------------------------------------------");
        }

        // Borrar los caracteres entre la posición 5 y 10 (se borran los 
        // caracteres entre las posiciones 5 y 10, pero no los de las posiciones 
        // 5 y 10).
        if (cad.length() >= 10) {
            cad.delete(5, 9);
            System.out.println("Borrar caracteres entre la posición 5 y 10: "
                    + cad);

            System.out.println("---------------------------------------------");
        }

        // Darle la vuelta a todos los caracteres del StringBuilder:
        cad.reverse();
        System.out.println("Darle la vuelta a todos los caracteres: " + cad);

        System.out.println("-----------------------------------------------");

        // Convertir el StringBuilder en cadena:
        String cadena = cad.toString();
        System.out.println("Convertir en cadena: " + cadena);
    }

}
