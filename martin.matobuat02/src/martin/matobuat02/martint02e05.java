/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee una hora digital descompuesta en horas, minutos
 * y segundos. Primero comprueba que el tiempo introducido sea correcto y a 
 * continuación calcula el total de segundos transcurridos desde el comienzo del 
 * día.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e05 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int horas, minutos, segundos;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nHoras: ");
        horas = Integer.parseInt(teclado.nextLine());
        System.out.print("Minutos: ");
        minutos = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundos: ");
        segundos = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        System.out.println("\nHora introducida -> " + horas + ":" + minutos + ":" 
                           + segundos);
        
        // Se comprueba si la hora introducida es válida:
        if ((0<=horas && horas<24) && (0<=minutos && minutos<60) && 
            (0<=segundos && segundos<60)){
            
            // Cálculo de los segundos transcurridos desde las 00:00
            int tiempo_transcurrido = horas*3600 + minutos*60 + segundos;
            System.out.println("Valores correctos");
            System.out.println("Segundos transcurridos desde las 00:00 -> "
                                + tiempo_transcurrido + " segundos\n");
        }
        else{
            System.out.println("Valores incorrectos\n");
        }
    }
    
}
