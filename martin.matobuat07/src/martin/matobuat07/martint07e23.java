/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Realizar el programa que simule el comportamiento de una “cola” 
 * FIFO con los nombres de pacientes que esperan en la consulta del médico. 
 * Tendrá un menú con las siguientes opciones a) Llega un paciente (esto es, 
 * Introducir elemento al final de la cola) b) Llamar al paciente para ser 
 * atendido (esto es, sacar el primer elemento de la cola) mostrándolo por 
 * pantalla y c) Mostrar el estado de la cola y d) salir de programa.
 */
package martin.matobuat07;

import java.util.Scanner;
import java.util.ArrayList;

public class martint07e23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> pacientes = new ArrayList<>();

        int respuesta;
        do {

            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Añadir paciente");
                System.out.println("2 -> Sacar paciente");
                System.out.println("3 -> Mostrar estado");
                System.out.println("4 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = Integer.parseInt(teclado.nextLine());
            } while (respuesta < 1 || respuesta > 4);

            if (respuesta != 4) {

                switch (respuesta) {
                    case 1:
                        System.out.print("Paciente: ");
                        pacientes.add(teclado.nextLine());
                        break;
                    case 2:
                        if (pacientes.size()>0){
                            System.out.println("Es el turno de " + pacientes.remove(0));
                        }
                        else{
                            System.out.println("No hay pacientes que atender");
                        }
                        break;
                    case 3:
                        if (pacientes.size() > 0) {
                            for (int i = 0; i < pacientes.size(); i++) {
                                System.out.println("Paciente " + (i + 1) + ": "
                                        + pacientes.get(i));
                            }
                        }
                        else{
                            System.out.println("No hay pacientes");
                        }
                        break;
                }

            }

        } while (respuesta != 4);

    }

}
