/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Parking3. Dispone de un menú que 
 * permite al usuario usar los métodos creados mostrando la información del 
 * parking correspondiente a los métodos creados.
 */
package martin.matobuat07;

import java.util.Scanner;

public class martint07e29 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Parking3 parking = new Parking3(20,0.02);

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
                        parking.plazasOcupadas();
                        System.out.println("-----------------------------");
                        break;
                    case 2:
                        System.out.println("-----------------------------");
                        System.out.print("Matrícula del coche: ");
                        String coche = teclado.nextLine();
                        int aparcado = parking.aparcar(coche);
                        if (aparcado== 0) {
                            System.out.println("No se ha podido aparcar");
                        } else {
                            System.out.println("Coche aparcado en la plaza " +
                                    aparcado);
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 3:
                        System.out.println("-----------------------------");
                        double importe = parking.desaparcar();
                        if(importe != -1){
                            System.out.printf("Importe: %.2f€\n",importe);
                        }
                        else{
                            System.out.println("No se ha encontrado la "
                                    + "matrícula");
                        }
                        System.out.println("-----------------------------");
                        break;
                    case 4:
                        System.out.println("-----------------------------");
                        System.out.printf("Recaudación: %.2f€\n",
                                parking.recaudacion());
                        System.out.println("-----------------------------");
                }

            }

        } while (respuesta != 5);
        
    }
    
}
