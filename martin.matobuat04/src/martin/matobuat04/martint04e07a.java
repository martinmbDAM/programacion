/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que encripta una cadena introducida por el usuario
 * cambiando las letras mayúsculas por otras de acuerdo a un algoritmo.
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e07a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Cadenas que determinan el algoritmo de encriptación:
        String alfabeto   = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String encriptado = "GHIJKLMNÑOPQRSTUVWXYZABCDEF";
        
        // Entrada de datos:
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine().toUpperCase();
        
        // Cadena encriptada:
        String cad_encriptada = new String();
        
        // Encriptado: 
        for (int i=0; i<cad.length(); i++){
            
            // Si nos encontramos una letra, la encriptamos:
            if (Character.isLetter(cad.charAt(i))){
                cad_encriptada = cad_encriptada + 
                      encriptado.charAt(alfabeto.indexOf(cad.charAt(i)));
            }
            else {
                cad_encriptada = cad_encriptada + cad.charAt(i);
            }
        }

        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Cadena original: " + cad);
        System.out.println("Cadena encriptada: " + cad_encriptada);
        System.out.println("-----------------------------------------------");

    }

}
