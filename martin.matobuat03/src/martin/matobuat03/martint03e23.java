/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que calcula el sueldo final de los trabajadores de un
 * concesionario en función de su sueldo base, cantidad de horas extra 
 * trabajadas y cantidad de ventas, de acuerdo con la siguiente fórmula:
 * 
 *        sueldo_final = sueldo_base + horas_extra*100 + plus_ventas
 *
 * siendo el plus de ventas:
 *  1. 500€ por entre 10 y 20 ventas
 *  2. 1000€ por entre 21 y 30 ventas
 *  3. 1300€ si supera las 30 ventas
 *
 * Después de tratar a cada vendedor el programa pregunta al usuario si quedan
 * más vendedores por tratar. Cuando la respuesta sea negativa, el programa 
 * muestra el total de ventas y el salario final del que más ventas ha realizado
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e23 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        int sueldo_base;      // El sueldo base del vendedor
        int horas_extra;      // Horas extras del vendedor
        int ventas;           // Ventas totales del vendedor
        int sueldo_final;     // Sueldo final del vendedor
        int plus_venta;       // Plus por ventas
        int ventas_totales=0; // Ventas de todos los vendedores
        int ventas_max=0;     // Máximo de ventas hasta el momento
        int sueldo_max=0;     // Sueldo final del vendedor con más ventas
        
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca los datos de los vendedores:
        int respuesta; // Respuesta del usuario
        do{
            
            // Se introducen los datos del vendedor:
            System.out.print("\nSueldo base: ");
            sueldo_base = Integer.parseInt(teclado.nextLine());
            System.out.print("Horas extra: ");
            horas_extra = Integer.parseInt(teclado.nextLine());
            System.out.print("Número de ventas: ");
            ventas = Integer.parseInt(teclado.nextLine());
            
            // Cálculo del plus por ventas:
            if (ventas>=10 && ventas<=20){
                plus_venta=500;
            }
            else if (ventas>20 && ventas<=30){
                plus_venta=1000;
            }
            else if(ventas>30){
                plus_venta=1300;
            }
            else{
                plus_venta=0;
            }
            
            // Cálculo del sueldo final:
            sueldo_final = sueldo_base + horas_extra*100 + plus_venta;
            
            // Si el vendedor es el que más ventas ha realizado hasta el 
            // momento se almacenan tanto su salario final como el número de 
            // ventas realizadas:
            if (ventas>=ventas_max){
                ventas_max = ventas;
                sueldo_max = sueldo_final;
            }
            
            // Se incrementa el número de ventas totales:
            ventas_totales += ventas;
            
            // Se pregunta al usuario si quiere seguir introduciendo vendedores:
            do{
                System.out.println("\n¿Desea seguir introduciendo vendedores?");
                System.out.print("Introduzca 1 para seguir y 0 para acabar: ");
                respuesta = Integer.parseInt(teclado.nextLine());                
            }while(respuesta!=1 && respuesta!=0);
            
        }while(respuesta==1);
        
        // Se muestran los resultados:
        System.out.print("\n-----------------------------------------");
        System.out.printf("\nTotal de ventas: %d",ventas_totales);
        System.out.printf("\nSalario del vendedor con más ventas: %d€\n",
                          sueldo_max);
        System.out.println("-----------------------------------------");
        
    }
    
}
