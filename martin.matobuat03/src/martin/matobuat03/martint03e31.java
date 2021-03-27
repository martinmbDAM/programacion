/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que realiza la misma función que el anterior pero 
 * que además informa a un cliente de su error si introduce una cantidad de 
 * entradas fuera del rango [0,10] y lo obligue a continuar introduciendo 
 * valores hasta introducir uno correcto.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e31 {

    public static void main(String[] args) {

        // Constante que almacena el máximo de entradas por clientes:
        final int MAX_ENTRADAS = 10;

        // Declaración de variables:
        int entradas_totales;
        int entradas_cliente;
        int max_entradas = 0;
        Scanner teclado = new Scanner(System.in);

        // Entrada del número de entradas que hay a la venta:
        System.out.print("\nEntradas a la venta: ");
        entradas_totales = Integer.parseInt(teclado.nextLine());

        // Los clientes compran entradas:
        while (entradas_totales > 0) {

            // El usuario introduce un número comprendido entre 1 y 10 que se
            // corresponde con el número de entradas que quiere:
            System.out.printf("\n¿Cuántas entradas quiere? Quedan %d: ",
                    entradas_totales);
            entradas_cliente = Integer.parseInt(teclado.nextLine());

            // Si el cliente pide más entradas de las que quedan se informa
            // de que no puede comprar tantas:
            if (entradas_cliente > entradas_totales) {
                System.out.printf("\nERROR: No puede comprar %d entradas "
                        + "porque sólo quedan %d\n", entradas_cliente,
                        entradas_totales);
            // Si el cliente introduce un número negativo o mayor que el máximo
            // permitido se le informa de su error:
            } else if (entradas_cliente > MAX_ENTRADAS || entradas_cliente < 0) {
                System.out.printf("\nERROR: El número de entradas debe estar "
                        + "en el rango [0,%d]\n",MAX_ENTRADAS);
            } else {
                // Si el cliente ha comprado el número máximo registrado de
                // entradas, se almacena:
                if (entradas_cliente > max_entradas) {
                    max_entradas = entradas_cliente;
                }

                // Se reduce el número de entradas disponible:
                entradas_totales = entradas_totales - entradas_cliente;
            }
        }

        // Salida de resultados:
        System.out.print("\n-------------------------------------");
        System.out.print("\nENTRADAS AGOTADAS");
        System.out.printf("\nMáximo de entradas compradas por un cliente: %d",
                max_entradas);
        System.out.print("\n-------------------------------------\n");

    }

}
