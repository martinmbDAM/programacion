/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que prueba la clase carritoCompra. Dispone de un menú  
 * que permite al usuario usar los métodos de la clase.
 */
package martin.matobuat07;

import java.util.Scanner;

public class martint07e08 {

    public static void main(String[] args) {

        carritoCompra carrito = new carritoCompra();

        Scanner teclado = new Scanner(System.in);

        int respuesta;

        do {

            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Ver productos");
                System.out.println("2 -> Añadir producto");
                System.out.println("3 -> Eliminar producto");
                System.out.println("4 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = Integer.parseInt(teclado.nextLine());
            } while (respuesta < 1 || respuesta > 4);
            
            if(respuesta != 4){
                
                switch(respuesta){
                    case 1: 
                            System.out.println("-----------------------------");
                            String productos = carrito.mostrarProductos();
                            if(productos.length()!=0){
                                System.out.println(productos);
                            }
                            else{
                                System.out.println("No hay productos");
                            }
                            System.out.println("-----------------------------");
                            break;
                    case 2:
                            System.out.println("-----------------------------");
                            int codigo;
                            String descripcion;
                            double precio;
                            int cantidad;
                            
                            System.out.print("Código de producto: ");
                            codigo = Integer.parseInt(teclado.nextLine());
                            System.out.print("Descripción: ");
                            descripcion = teclado.nextLine();
                            System.out.print("Precio: ");
                            precio = Double.parseDouble(teclado.nextLine());
                            System.out.print("Cantidad: ");
                            cantidad = Integer.parseInt(teclado.nextLine());
                            
                            if(carrito.añadirProducto(codigo, descripcion,  
                                                   precio, cantidad)){
                                System.out.println("Producto añadido");
                            }
                            else{
                                System.out.println("El producto no ha podido "
                                        + "añadirse");
                            }
                            System.out.println("-----------------------------");
                            break;
                    case 3:
                            System.out.println("-----------------------------");
                            System.out.print("Código: ");
                            codigo = Integer.parseInt(teclado.nextLine());
                            if(carrito.eliminarProducto(codigo)){
                                System.out.println("Producto eliminado");
                            }
                            else{
                                System.out.println("No se ha encontrado el "
                                        + "producto ");
                            }
                            System.out.println("-----------------------------");
                            break;
                }
                
            }

        } while (respuesta != 4);

    }

}
