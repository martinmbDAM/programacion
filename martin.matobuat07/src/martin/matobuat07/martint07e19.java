/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase carritoCompra2. Dispone de un menú  
 * que permite al usuario usar los métodos de la clase.
 */
package martin.matobuat07;

import java.util.Scanner;

public class martint07e19 {

    public static void main(String[] args) {
        
        carritoCompra2 carrito = new carritoCompra2();

        Scanner teclado = new Scanner(System.in);

        int respuesta;

        do {

            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Ver productos");
                System.out.println("2 -> Añadir producto");
                System.out.println("3 -> Eliminar producto");
                System.out.println("4 -> Vaciar carrito");
                System.out.println("5 -> Salir");
                System.out.print("Opción escogida: ");
                respuesta = teclado.nextInt();
            } while (respuesta < 1 || respuesta > 5);
            
            if(respuesta != 5){
                
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
                            codigo = teclado.nextInt();
                            teclado.nextLine();
                            System.out.print("Descripción: ");
                            descripcion = teclado.nextLine();
                            System.out.print("Precio: ");
                            precio = teclado.nextDouble();
                            System.out.print("Cantidad: ");
                            cantidad = teclado.nextInt();
                            
                            carrito.añadirProducto(codigo, descripcion, precio, 
                                                   cantidad);
                            System.out.println("Producto añadido");
                            System.out.println("-----------------------------");
                            break;
                    case 3:
                            System.out.println("-----------------------------");
                            System.out.print("Código: ");
                            codigo = teclado.nextInt();
                            if(carrito.eliminarProducto(codigo)){
                                System.out.println("Producto eliminado");
                            }
                            else{
                                System.out.println("No se ha encontrado el "
                                        + "producto ");
                            }
                            System.out.println("-----------------------------");
                            break;
                    case 4: 
                            System.out.println("-----------------------------");
                            carrito.vaciarCarrito();
                            System.out.println("Se ha vaciado el carrito");
                            System.out.println("-----------------------------");
                            break;
                }
                
            }

        } while (respuesta != 5);
        
    }
    
}
