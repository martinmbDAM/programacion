/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar una programa con un ArrayList bidimensional llamado 
 * edadesAlumnos en el que cada fila representa cada aula y cada columna los 
 * alumnos dentro del aula. El programa solicitará por teclado las edades de los 
 * alumnos (si se introduce 0 quiere decir que se acabó con esa clase y se pasa 
 * a la siguiente y si se introduce -1 finaliza el programa). Una vez 
 * introducidos todos los valores, mostrar todas las edades introducidas
 * (cada aula en una fila).
 */
package martin.matobuat07;

import java.util.ArrayList;
import java.util.Scanner;

public class martint07e25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> edadesAlumnos = new ArrayList<>();
        edadesAlumnos.add(new ArrayList<>());

        int edad, pos = 0;
        do {

            System.out.print("Edad: ");
            edad = teclado.nextInt();

            // Si se introduce el 0, pasamos a la siguiente clase:
            if (edad == 0) {
                pos++;
                edadesAlumnos.add(new ArrayList<>());
            }

            if (edad!=0 && edad!=-1) {
                // Añadimos el alumno:
                edadesAlumnos.get(pos).add(edad);
            }

        } while (edad != -1);

        // Mostramos el resultado:
        for (int i = 0; i < edadesAlumnos.size(); i++) {
            for (int j = 0; j < edadesAlumnos.get(i).size(); j++) {
                System.out.print(edadesAlumnos.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
