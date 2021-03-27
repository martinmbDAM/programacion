/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que genere aleatoriamente una contraseña con las 
 * siguientes limitaciones: 
 *
 * 1. Tendrá entre 5 y 10 posiciones
 * 2. Sólo tendrá caracteres entre la 'a' y la 'j'
 * 
 */
package martin.matobuat04;

import java.util.Random;

public class martint04e04 {

    public static void main(String[] args) {

        // String que contiene las letras posibles:
        String letras = "abcdefghij";
        
        // Número de caracteres aleatorio:
        Random num_aleatorio = new Random();
        int num_caracteres = num_aleatorio.nextInt(6) + 5;
        
        String contraseña = new String();

        for (int i = 0; i < num_caracteres; i++) {
            
            char letra_aleatoria = letras.charAt(num_aleatorio.nextInt(
                                   letras.length()));
            contraseña = contraseña + letra_aleatoria;
        }

        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Contraseña: " + contraseña);
        System.out.println("-----------------------------------------------");

    }

}
