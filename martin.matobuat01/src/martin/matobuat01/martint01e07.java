/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula el consumo medio de gasolina de un coche 
 * cada 100 km
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e07 {

    public static void main(String[] args) {
        
        // Declaración de variables:
        double km_inicial, km_final, gas_inicial, gas_final, consumo;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca los datos por teclado:
        System.out.print("\nKilometraje inicial: ");
        km_inicial = teclado.nextDouble();
        System.out.print("Kilometraje final: ");
        km_final = teclado.nextDouble();
        System.out.print("\nLitros iniciales: ");
        gas_inicial = teclado.nextDouble();
        System.out.print("Litros finales: ");
        gas_final = teclado.nextDouble();
        
        // Cálculo del consumo medio de gasolina por 100 km:
        consumo = (gas_inicial - gas_final)/(km_final - km_inicial) * 100;
        
        // Se muestra el resultado con 2 decimales:
        System.out.printf("\nConsumo medio: %.2f litros cada 100km\n\n",consumo);
    }  
}
