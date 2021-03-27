/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita un nombre completo y una edad y muestra
 * por pantalla el siguiente mensaje usando la clase Format: 
 * 
 *     Hola, me llamo 'nombre' 'apellido1' 'apellido2' y tengo 'edad' años
 *
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e09 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nNombre completo: ");
        String nombre = teclado.nextLine();
        System.out.print("\nEdad: ");
        int edad = Integer.parseInt(teclado.nextLine());
        
        // String de salida: 
       String salida = String.format("Hola, me llamo %s y tengo %d años",
                       nombre,edad);

        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println(salida);
        System.out.println("-----------------------------------------------");

    }

}
