/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que solicita al usuario una cadena de seis caracteres,
 * todos ellos dígitos y sin repetidos. Mientras no se cumplan todas las 
 * condiciones seguirá solicitando la cadena.
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean todo_digitos = true;
        boolean sin_repetidos = true;
        String cadena;

        do {
            // Entrada de datos:
            System.out.print("\nIntroduzca una cadena: ");
            cadena = teclado.nextLine();

            if (cadena.length() == 6) {
                // Se comprueba que todos los caracteres sean dígitos y que 
                // no haya repetidos:
                int contador=0;
                do{                    
                    todo_digitos = Character.isDigit(cadena.charAt(contador));
                    sin_repetidos = cadena.indexOf(cadena.charAt(contador),
                                    contador+1)==-1;
                    contador++;
                    
                }while (contador<6 && todo_digitos && sin_repetidos);
                
            }

        } while (cadena.length() != 6 || !todo_digitos || !sin_repetidos);

    }

}
