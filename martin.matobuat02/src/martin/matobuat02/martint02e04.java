/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que evalúa si un alumno ha aprobado una asignatura en
 * función de su nota en el examen, de la nota de un trabajo y de la nota del 
 * trabajo en clase. El alumno aprueba si cumple alguno de estos supuestos:
 * 
 *  1. La nota del examen es mayor o igual que 5.
 *  2. La nota del examen está entre 4 y 5, trabajo en clase mayor que 5 y 
 *     trabajo práctico mayor que 5.
 *  3. Nota del examen entre 4 y 5 y una nota mayor que 8 en el trabajo en clase
 *     o en el trabajo práctico.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e04 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        float examen, trabajo_clase, trabajo_practico;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nNota del examen: ");
        examen = teclado.nextFloat();
        System.out.print("Nota del trabajo en clase: ");
        trabajo_clase = teclado.nextFloat();
        System.out.print("Nota del trabajo práctico: ");
        trabajo_practico = teclado.nextFloat();
        
        // Salida de resultados:
        if (examen>=5 || ((4<examen && examen<5) && trabajo_clase>5 && trabajo_practico>5) 
            || ((4<examen && examen<5) && (trabajo_clase>8 || trabajo_practico>8))){
            System.out.println("\nEl alumno ha aprobado\n");
        }
        else{
            System.out.println("\nEl alumno ha suspendido\n");
        }
    }
    
}
