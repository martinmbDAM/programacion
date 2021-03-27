/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de octubre de 2020
 * Descripción: Programa que calcula los datos estadísticos de una asignatura. 
 * Para ello, el usuario debe introducir el número de suspensos, suficientes, 
 * notables y sobresalientes. El programa devolverá el porcentaje de alumnos que 
 * han superado la asignatura y el porcentaje de notables y sobresalientes de la 
 * misma.
 */
package martin.matobuat01;
import java.util.Scanner;

public class martint01e04 {
    
    public static void main(String[] args) {
        
        // Declaración de variables:
        int num_suspensos, num_suficientes, num_notables, num_sobresalientes, 
            total_alumnos;
        float tasa_aprobados, tasa_notables, tasa_sobresalientes;
        Scanner teclado = new Scanner(System.in);

        // Se pide al usuario que introduzca los datos:
        System.out.print("\nNúmero de suspensos: ");
        num_suspensos = Integer.parseInt(teclado.nextLine());
        System.out.print("Número de suficientes: ");
        num_suficientes = Integer.parseInt(teclado.nextLine());
        System.out.print("Número de notables: ");
        num_notables = Integer.parseInt(teclado.nextLine());
        System.out.print("Número de sobresalientes: ");
        num_sobresalientes = Integer.parseInt(teclado.nextLine());
        
        // Total de alumnos (no tiene sentido pedir al usuario que lo 
        // introduzca porque se puede calcular como suma del resto de datos):
        total_alumnos = num_suspensos + num_suficientes + num_notables + 
                        num_sobresalientes;
        
        // Porcentaje de abrobados, notables y sobresalientes:
        tasa_aprobados = (1 - (float) num_suspensos / total_alumnos) * 100;
        tasa_notables = ((float) num_notables / total_alumnos) * 100;
        tasa_sobresalientes = ((float) num_sobresalientes / total_alumnos) * 100;
        
        // Se muestran los resultados con 2 decimales:
        System.out.printf("\nPorcentaje de alumnos que ha superado la asignatura"
                          + ": %.2f%%\n", tasa_aprobados);
        System.out.printf("Porcentaje de notables: %.2f%%\n", tasa_notables);
        System.out.printf("Porcentaje de sobresalientes: %.2f%%\n\n", 
                          tasa_sobresalientes);
        
    }
}
