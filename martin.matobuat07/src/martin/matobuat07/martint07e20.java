/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Factura.
 */
package martin.matobuat07;

import java.util.Scanner;
import java.util.ArrayList;

public class martint07e20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Array de facturas:
        ArrayList<Factura> facturas = new ArrayList<>();

        // Factura en uso:
        int factura_en_uso = 0;

        int respuesta;
        do {

            if (facturas.size() > 0) {
                System.out.println("Factura actual: " + facturas.get(
                        factura_en_uso).getIdentificador());
            }

            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Crear factura");
                System.out.println("2 -> Añadir línea de factura");
                System.out.println("3 -> Eliminar línea de factura");
                System.out.println("4 -> Imprimir factura");
                System.out.println("5 -> Cambiar de factura");
                System.out.println("6 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = Integer.parseInt(teclado.nextLine());
            } while (respuesta < 1 || respuesta > 6);

            if (respuesta != 6) {

                switch (respuesta) {
                    case 1:
                        System.out.println("---------------------------------");
                        String id;
                        int num_cliente;
                        System.out.print("Identificador: ");
                        id = teclado.nextLine();
                        System.out.print("Número de cliente: ");
                        num_cliente = Integer.parseInt(teclado.nextLine());

                        // Creamos la factura: 
                        facturas.add(new Factura(id, num_cliente));
                        System.out.println("---------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        String descripcion;
                        int cantidad;
                        float precio;
                        System.out.print("Descripción: ");
                        descripcion = teclado.nextLine();
                        System.out.print("Precio: ");
                        precio = Float.parseFloat(teclado.nextLine());
                        System.out.print("Cantidad: ");
                        cantidad = Integer.parseInt(teclado.nextLine());

                        // Creamos la nueva línea de la factura:
                        facturas.get(factura_en_uso).añadirLinea(descripcion, 
                        precio, cantidad);
                        System.out.println("---------------------------------");
                        break;
                    case 3:
                        System.out.println("---------------------------------");
                        int linea;
                        System.out.print("Línea a eliminar: ");
                        linea = Integer.parseInt(teclado.nextLine());
                        if (linea < facturas.get(factura_en_uso).getLineas().
                                size()) {
                            // Eliminamos la línea de la factura:
                            facturas.get(factura_en_uso).eliminarLinea(linea);
                            System.out.println("Línea eliminada");
                        } else {
                            System.out.println("No se ha podido eliminar la "
                                    + "línea");
                        }
                        System.out.println("---------------------------------");
                        break;
                    case 4:
                        System.out.println("---------------------------------");
                        System.out.println(facturas.get(factura_en_uso).
                                imprimeFactura());
                        System.out.println("---------------------------------");
                        break;
                    case 5:
                        System.out.println("---------------------------------");

                        System.out.print("Identificador: ");
                        id = teclado.nextLine();

                        // Buscamos la factura:
                        boolean encontrada = false;
                        int pos = 0;

                        while (!encontrada && pos < facturas.size()) {
                            encontrada = facturas.get(pos).getIdentificador().
                                    equals(id);
                            if (!encontrada) {
                                pos++;
                            }
                        }

                        if (encontrada) {

                            // Cambiamos la factura en uso:
                            factura_en_uso = pos;
                            System.out.println("Has cambiado a la factura "
                                    + facturas.get(factura_en_uso).getIdentificador());
                        } else {
                            System.out.println("No existe la factura " + id);
                        }

                        System.out.println("---------------------------------");
                        break;
                }

            }

        } while (respuesta != 6);

    }

}
