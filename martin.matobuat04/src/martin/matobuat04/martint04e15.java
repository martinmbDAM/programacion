/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita una cadena y sustituye las posiciones
 * impares por asteriscos.
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e15 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        String original = cad;
        
        // Sustitución de caracteres:
        for (int i = 1; i < cad.length(); i+=2) {
            cad = cad.substring(0,i) + '*' + cad.substring(i+1);
        }
 
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena resultante: " + cad);
        System.out.println("-----------------------------------------------");

    }

}
