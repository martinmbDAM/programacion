/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Programa que calcule el factorial de números menores de 20. El 
 * programa permite al usuario meter los números que desee y finalizará cuando 
 * meta un número menor que 1 o mayor que 20. Crea las funciones que consideres 
 * útiles y que puedas reutilizar en otros programas.
 */
package martin.matobuat05;
import java.util.Scanner;

public class martint05e05 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("\nIntroduzca un número entero: ");
            num=teclado.nextInt();
            
            if (num>=1 && num<=20){
                System.out.println(num + "! = " + factorial(num));
            }
            
        }while (num>=1 && num<=20);
        
    }
    
    // Función que permite calcular el factorial de un número:
    static int factorial(int n){
       int fac = 1;
        for (int i=2; i<=n; i++) {
            fac *= i;
        }
        return (fac);
    }
    
       
}
