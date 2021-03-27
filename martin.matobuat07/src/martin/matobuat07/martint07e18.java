/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar un programa que tenga una función a la que se le pasa 
 * un entero y devuelva un ArrayList con todos sus divisores.
 */
package martin.matobuat07;

import java.util.ArrayList;
import java.util.Scanner;

public class martint07e18 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        do{
            System.out.print("Introduzca un número: "); 
            numero = teclado.nextInt();
        }while(numero<=0);
        
        ArrayList <Integer> divisores = calculaDivisores(numero);
        
        // Mostramos los divisores:
        System.out.println("---------------------------------------------");
        System.out.print("Divisores de " + numero + ": ");
        for (int i = 0; i < divisores.size(); i++) {
            System.out.print(divisores.get(i) + " ");
        }
        System.out.println("\n---------------------------------------------");        
    }

    static ArrayList<Integer> calculaDivisores(int n) {

        ArrayList<Integer> divisores = new ArrayList<>();

        // Buscamos los divisores entre 1 y n/2:
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisores.add(i);
            }
        }
        // Añadimos el propio número a la lista de divisores:
        divisores.add(n);
        return (divisores);
    }

}
