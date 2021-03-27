/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que resuelve un sistema de ecuaciones lineales en 
 * función de los coeficientes introducidos por el usuario.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e06 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        float a,b,c,d,e,f,x,y;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\na: ");
        a = teclado.nextFloat();
        System.out.print("b: ");
        b = teclado.nextFloat();
        System.out.print("c: ");
        c = teclado.nextFloat();
        System.out.print("d: ");
        d = teclado.nextFloat();
        System.out.print("e: ");
        e = teclado.nextFloat();
        System.out.print("f: ");
        f = teclado.nextFloat();
        
        // Salida de resultados:
        try{
            x = (c*e - b*f)/(a*e - b*d);
            y = (a*f - c*d)/(a*e - b*d);
            
            System.out.printf("\nx=%.2f\n",x);
            System.out.printf("\ny=%.2f\n\n",y);
        }
        //Se evita la división por 0, único caso en el que el algoritmo no
        // funciona:
        catch (Exception error){
            System.out.println("\nERROR: " + error.getMessage() + "\n");
        }
    }
    
}
