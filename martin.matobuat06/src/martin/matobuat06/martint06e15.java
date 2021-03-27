/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de Febrero de 2021
 * Descripción: Programa que prueba la clase Examen.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Respuestas correctas:
        String correctas = "abcdddaaaacbbabdcacb";

        // Creación de un objeto de la clase examen:
        Examen examen = new Examen(correctas);

        // Respuestas del alumno: 
        String alumno;
        do {
            System.out.print("Respuestas del alumno (-1 para terminar): ");
            alumno = teclado.nextLine();

            // Comprobamos que las respuestas sean válidas:
            if (alumno.length() == 20) {

                boolean valido = true;
                int c = (int)'e';
                while (c < (int)'z' && valido) {
                    valido = alumno.indexOf(c) == -1;
                    c++;
                }

                // Si la respuesta es válida, mostramos la nota:
                if (valido) {
                    // Mostramos la nota del alumno por pantalla:
                    System.out.println("Nota: " + examen.responder(alumno));
                }
            }

        } while (!alumno.equals("-1"));
    }

}
