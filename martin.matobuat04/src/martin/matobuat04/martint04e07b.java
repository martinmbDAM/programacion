/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que encripta una cadena introducida por el usuario
 * cambiando las letras por otras de acuerdo a un algoritmo.
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e07b {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Cadenas que determinan el algoritmo de encriptación:
        String alfabeto   = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String encriptado = "GHIJKLMNÑOPQRSTUVWXYZABCDEF";
        
        // Entrada de datos:
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        
        // Cadena encriptada:
        String cad_encriptada = new String();
        
        // Encriptado: 
        for (int i=0; i<cad.length(); i++){
            
            // Si nos encontramos una letra, la encriptamos:
            if (Character.isLetter(cad.charAt(i))){
                
                // Letra encriptada:
                char letra_encriptada = encriptado.charAt(alfabeto.indexOf(
                                        Character.toUpperCase(cad.charAt(i))));
                
                // Si la letra era minúscula, la encriptamos en minúscula:
                if (Character.isLowerCase(cad.charAt(i))){
                    letra_encriptada = Character.toLowerCase(letra_encriptada);
                }
                
                cad_encriptada = cad_encriptada + letra_encriptada;
      
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
