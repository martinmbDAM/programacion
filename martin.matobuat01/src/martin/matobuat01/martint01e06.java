/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula el precio final de un automóvil aplicándole
 * al precio de venta inicial la tasa de ganancia de la tienda en la que se 
 * compra y el impuesto correspondiente.
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e06 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de constantes:
        final double GANANCIA = 10.0;
        final double IMPUESTO = 20.0;
        
        // Declaración de variables:
        double precio_fabrica, precio_final;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca el precio de fábrica:
        System.out.print("\nPrecio de fábrica: ");
        precio_fabrica = teclado.nextDouble();
        
        // Cálculo del precio final:
        precio_final = (precio_fabrica * (1 + GANANCIA/100)) * (1 + IMPUESTO/100);
        
        // Se muestra el resultado por pantalla:
        System.out.println("\nPrecio final: " + precio_final + " euros\n");
    }
    
}
