/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee una nota entera entre 0 y 10 y devuelve el 
 * equivalente en texto (Muy Deficiente (0,1,2), Insuficiente (3,4), Aprobado
 * (5,6), Notable (7,8), Sobresaliente (9,10).
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e13 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int nota;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nNota: ");
        nota = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        switch(nota){
            case 0:
            case 1:
            case 2: System.out.println("\nMuy Deficiente\n"); break;
            case 3:
            case 4: System.out.println("\nInsuficiente\n"); break;
            case 5:
            case 6: System.out.println("\nAprobado\n"); break;
            case 7:
            case 8: System.out.println("\nNotable\n"); break;
            case 9: 
            case 10: System.out.println("\nSobresaliente\n"); break;
            default: System.out.println("\nEntrada incorrecta\n");
        }
    }
    
}
