/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que recibe las coordenadas de un punto en el plano y 
 * calcula el área del rectángulo que forma con el eje de coordenadas.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e32 {

    public static void main(String[] args) {
        
        // Declaración de variables:
        float x,y;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nCoordenada X: ");
        x = teclado.nextFloat();
        System.out.print("Coordenada Y: ");
        y = teclado.nextFloat();
        
        // Cálculo del área (valor absoluto del producto): 
        float area = Math.abs(x*y);
        
        // Salida de resultados:
        System.out.println("\n--------------------------------");
        System.out.printf("Coordenadas: (%.2f,%.2f)",x,y);
        System.out.printf("\nÁrea del rectángulo: %.2f",area);
        System.out.println("\n--------------------------------");
        
    }
    
}
