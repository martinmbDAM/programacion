/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar un programa con una función a la que se le pasan dos 
 * ArrayList de enteros como parámetros y nos devuelva true si los dos ArrayList 
 * tienen los mismos elementos, aunque sean en otro orden, y devuelva false en 
 * caso contrario (suponemos que no tienen valores repetidos).
 */
package martin.matobuat07;
import java.util.Scanner;

import java.util.ArrayList;

public class martint07e24 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Integer>primero = new ArrayList<>();
        ArrayList<Integer>segundo = new ArrayList<>();
        
        // Rellenamos los arrays:
        
        int longitud;
        
        System.out.print("Longitud del primer ArrayList: ");
        longitud = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Primer ArrayList: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Número: ");
            primero.add(Integer.parseInt(teclado.nextLine()));
        }
        
        System.out.print("Longitud del segundo ArrayList: ");
        longitud = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Segundo ArrayList: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Número: ");
            segundo.add(Integer.parseInt(teclado.nextLine()));
        }
        
        // Comparamos los arrays:
        if(comparaArrayList(primero,segundo)){
            System.out.println("Los ArrayLists son iguales");
        }
        else{
            System.out.println("Los ArrayLists son distintos");
        }
    }

    static boolean comparaArrayList(ArrayList<Integer> a, ArrayList<Integer> b){

        boolean iguales = true;

        if (a.size() != b.size()) {
            iguales = false;
        } else {

            int i = 0;
            while(i<a.size() && iguales){
                iguales = b.contains(a.get(i));
                i++;
            }

        }

        return (iguales);
    }

}
