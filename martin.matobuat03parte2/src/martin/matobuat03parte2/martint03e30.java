/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que gestiona la venta de entradas. Primero pide al 
 * usuario que introduzca cuántas entradas están a la venta, y a continuación
 * pregunta a cada cliente cuántas entradas desea comprar, teniendo en cuenta 
 * que hay un límite de 10 entradas por cliente. El programa finaliza cuando se
 * agotan las entradas y muestra cuántas entradas ha comprado el cliente que 
 * más entradas compró.
 */
package martin.matobuat03parte2;

import java.util.Scanner;

public class martint03e30 {

    public static void main(String[] args) {

        // Constante que almacena el máximo de entradas por cliente:
        final int MAXIMO = 10;

        // Declaración de variables:
        int entradas_totales;
        int entradas_cliente;
        int max_entradas = 0;
        Scanner teclado = new Scanner(System.in);

        // Número de entradas que hay a la venta:
        do{
            System.out.print("\nEntradas a la venta: ");
            entradas_totales = Integer.parseInt(teclado.nextLine());
        }while (entradas_totales < 0);        

        // Compra de entradas:
        while (entradas_totales > 0) {

            // Entradas que se desea comprar:
            System.out.printf("\n¿Cuántas entradas quiere? Quedan %d: ",
                              entradas_totales);
            entradas_cliente = Integer.parseInt(teclado.nextLine());
            
            // Si el cliente pide más entradas de las permitidas no puede 
            // efectuarse la compra:
            if (entradas_cliente > MAXIMO) {
                System.out.printf("\nERROR: No puede comprar más de %d entradas\n",
                                  MAXIMO);               
            }
            // Si el cliente introduce un número negativo no puede efectuarse
            // la compra:
            else if (entradas_cliente < 0){
                System.out.println("\nERROR: El número de entradas no puede ser"
                                 + " negativo");
            }
            // Si el cliente pide más entradas de las que quedan no puede 
            // efectuarse la compra:
            else if (entradas_cliente > entradas_totales) {
                System.out.printf("\nERROR: No puede comprar %d entradas "
                                + "porque sólo quedan %d\n", entradas_cliente,
                                   entradas_totales);
            }
            // Si el cliente introduce un número válido:
            else {
                // Si el cliente ha comprado el número máximo registrado de
                // entradas, se almacena:
                if (entradas_cliente > max_entradas) {
                    max_entradas = entradas_cliente;
                }

                // Se reduce el número de entradas disponible:
                entradas_totales -= entradas_cliente;
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
