/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que prueba la clase Parking2. Dispone de un menú que 
 * permite al usuario usar los métodos creados mostrando la información del 
 * parking correspondiente a los métodos creados.
 */
package martin.matobuat07;

import java.util.Scanner;

public class martint07e07 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Parking2 parking = new Parking2(20);

        int respuesta;

        do {
            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Consultar estado del parking");
                System.out.println("2 -> Aparcar coche");
                System.out.println("3 -> Sacar coche del parking");
                System.out.println("4 -> Mostrar recaudación");
                System.out.println("5 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = Integer.parseInt(teclado.nextLine());
            } while (respuesta < 1 || respuesta > 5);

            if (respuesta != 5) {

                switch (respuesta) {
                    case 1:
                        System.out.println("-----------------------------");
                        String[][] plazasOcupadas = parking.plazasOcupadas();
                        System.out.println("Coches en el párking: ");
                        for (int i = 0; i < plazasOcupadas[0].length; i++) {
                            System.out.println("Plaza " + (i + 1) + " - "
                                    + plazasOcupadas[0][i] + " - " + 
                                      plazasOcupadas[1][i]);
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 2:
                        System.out.println("-----------------------------");
                        System.out.print("Matrícula del coche: ");
                        String coche = teclado.nextLine();
                        int aparcado = parking.aparcar(coche);
                        if (aparcado == 0) {
                            System.out.println("No se ha podido aparcar");
                        } else {
                            System.out.println("Coche aparcado en la plaza " +
                                    aparcado);
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 3:
                        System.out.println("-----------------------------");
                        String[] matricula = parking.desaparcar();
                        if (matricula[0].length() > 0) {
                            System.out.println("Coche retirado: "
                                    + matricula[0]);
                            System.out.println("Importe a pagar: " + 
                                    matricula[1] + "€");
                        } else {
                            System.out.println("No se ha podido retirar "
                                    + "ningún coche");
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 4:
                        System.out.println("-----------------------------");
                        System.out.println("Recaudación: " + 
                                parking.getRecaudacion() + "€");
                        System.out.println("-----------------------------");
                }

            }

        } while (respuesta != 5);
        
    }
    
}
