/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realiza un programa que tenga un ArrayList llamado AlturaAlumnos 
 * que mantenga una lista con las alturas de los alumnos de un centro. Serán 
 * valores positivos entre 0,50 y 2,50 redondeados a dos decimales. El programa 
 * tendrá las siguientes funciones (accesibles mediante un menú):
 *
 * a. Añadir altura.
 * b. Mostrar lista actual con el número de posición
 * c. Eliminar por posición. Se le pasa como parámetro una posición y elimina la 
 *    altur en dicha posición.
 * d. Eliminar por valor. Se le pasa como parámetro una altura y elimina todas 
 *    las posiciones en las que se encuentre dicha altura. Devuelve la cantidad 
 *    de eliminaciones.
 * e. Ordenar la lista.
 * f. Vaciar la lista.
 * 
 */
package martin.matobuat07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class martint07e15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Float> alumnos = new ArrayList<>();

        int respuesta;
        do {

            do {
                System.out.println("Escoja una opción:");
                System.out.println("1 -> Añadir altura");
                System.out.println("2 -> Mostrar lista actual");
                System.out.println("3 -> Eliminar por posición");
                System.out.println("4 -> Eliminar por valor");
                System.out.println("5 -> Ordenar la lista");
                System.out.println("6 -> Vaciar la lista");
                System.out.println("7 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = teclado.nextInt();
                System.out.println("-----------------------------------------");
            } while (respuesta < 1 || respuesta > 7);

            if (respuesta != 7) {

                switch (respuesta) {
                    case 1:
                        float altura;
                        do {
                            System.out.print("Altura: ");
                            altura = teclado.nextFloat();
                        } while (altura < 0.5 || altura > 2.5);
                        
                        // Redondeamos a dos decimales: 
                        altura = Math.round(altura*100f)/100f;
                        
                        if (alumnos.add(altura)) {
                            System.out.println("Altura añadida");
                        }
                        System.out.println("---------------------------------");
                        break;
                    case 2:
                        if (!alumnos.isEmpty()) {
                            for (int i = 0; i < alumnos.size(); i++) {
                                System.out.println("Posición " + (i + 1) + ": "
                                        + alumnos.get(i));
                            }
                        }
                        else{
                            System.out.println("Lista vacía");
                        }
                        System.out.println("---------------------------------");
                        break;
                    case 3:
                        int pos;
                        System.out.print("Posición: ");
                        pos = teclado.nextInt();
                        if (pos < alumnos.size()) {
                            System.out.println("Se ha eliminado la altura "
                                    + alumnos.remove(pos));
                        } else {
                            System.out.println("No se ha podido eliminar el "
                                    + "elemento");
                        }
                        System.out.println("---------------------------------");
                        break;
                    case 4:
                        float valor;
                        System.out.print("Valor: ");
                        valor = teclado.nextFloat();
                        if (alumnos.remove(valor)) {
                            System.out.println("Se ha eliminado la primera "
                                    + "ocurrencia del valor " + valor);
                        } else {
                            System.out.println("No se ha podido eliminar");
                        }
                        System.out.println("---------------------------------");
                        break;
                    case 5:
                        Collections.sort(alumnos);
                        System.out.println("Lista ordenada");
                        System.out.println("---------------------------------");
                        break;
                    case 6:
                        alumnos.clear();
                        System.out.println("Lista borrada");
                        System.out.println("---------------------------------");
                        break;
                }

            }

        } while (respuesta != 7);

    }

}
