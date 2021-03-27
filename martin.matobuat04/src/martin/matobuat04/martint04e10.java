/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita 10 cadenas de caracteres y construye una
 * cadena con los 10 primeros caracteres de cada una.
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        String cad1 = new String();
        do {
            System.out.print("\nIntroduzca una cadena: ");
            String cad2 = teclado.nextLine();
            
            cad1 = cad1 + cad2.charAt(0);
            
        } while (cad1.length()<10);
 
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena resultante: " + cad1);
        System.out.println("-----------------------------------------------");

    }

}
