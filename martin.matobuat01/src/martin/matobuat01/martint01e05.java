/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que convierte una temperatura de grados Celsius a 
 * grados Fahrenheit y una longitud de pulgadas a centímetros. Ambos resultados 
 * se muestran con dos decimales.
 */

package martin.matobuat01;
import java.util.Scanner;

public class martint01e05 {
    
    public static void main(String[] args) {
        
        // Constante que almacena la tasa de conversión de longitud:
        final double PULGADAS_A_CM = 2.55;
        
        // Declaración de variables:
        double temp_celsius, temp_fahrenheit, long_cm, long_pulgadas;
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca los datos por teclado:
        System.out.print("\nTemperatura en Celsius: ");
        temp_celsius = teclado.nextDouble();
        System.out.print("Longitud en pulgadas: ");
        long_pulgadas = teclado.nextDouble();
        
        // Se realizan los cálculos: 
        temp_fahrenheit = (float) 9/5 * temp_celsius + 32;
        long_cm = long_pulgadas * PULGADAS_A_CM;
        
        // Se muestran los resultados por pantalla redondeando a dos decimales
        // la temperatura y a un decimal la longitud:
        System.out.printf("\n%.2f grados Celsius equivalen a %.2f grados "
                         + "Fahrenheit", temp_celsius, temp_fahrenheit);
        System.out.printf("\n%.1f pulgadas equivalen a %.1f cm\n\n",
                           long_pulgadas, long_cm);
    }
    
}
