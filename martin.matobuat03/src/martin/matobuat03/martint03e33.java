/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que recibe las coordenadas de dos puntos en el plano e
 * informa de si lo que forman es un cuadrado o un rectángulo y calcula el 
 * área del mismo.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e33 {

    public static void main(String[] args) {
        
        // Declaración de variables;
        float x1,x2,y1,y2,distancia_x,distancia_y, area;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nCoordenada X del primer punto: ");
        x1 = teclado.nextFloat();
        System.out.print("Coordenada Y del primer punto: ");
        y1 = teclado.nextFloat();
        System.out.print("\nCoordenada X del segundo punto: ");
        x2 = teclado.nextFloat();
        System.out.print("Coordenada Y del segundo punto: ");
        y2 = teclado.nextFloat();
        
        // La distancia entre dos puntos de una recta es el valor absoluto de su
        // diferencia:
        distancia_x = Math.abs(x1-x2);
        distancia_y = Math.abs(y1-y2);
        
        // Cálculo del área:
        area = distancia_x*distancia_y;
        
        // Salida de resultados (si el área es negativa se pasa a positiva):
        System.out.println("\n-----------------------------------------------");
        System.out.printf("Coordenadas del primer punto: (%.2f,%.2f)\n",x1,y1);
        System.out.printf("Coordenadas del segundo punto: (%.2f,%.2f)",x2,y2);
        if (distancia_x == distancia_y){
            System.out.print("\nLa figura es un cuadrado");
        }
        else{
            System.out.print("\nLa figura es un rectángulo");
        }
        System.out.printf("\nÁrea: %.2f",area);
        System.out.println("\n-----------------------------------------------");
        
    }
    
}
