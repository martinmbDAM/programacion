/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Realizar un programa al que se le introduzcan dos números 
 * enteros positivos y nos diga cuál de los dos tiene más divisores (usar 
 * función previa).
 */
package martin.matobuat05;
import java.util.Scanner;

public class martint05e08 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1,num2,div1,div2;
        
        do{
            System.out.print("\nPrimer número entero: ");
            num1 = teclado.nextInt();
        }while(num1<=0);
        do{
            System.out.print("\nPrimer número entero: ");
            num2 = teclado.nextInt();
        }while(num2<=0);
        
        // Cálculo del número de divisores:
        div1 = cantidadDivisores(num1);
        div2 = cantidadDivisores(num2);
        
        if (div1==div2){
            System.out.println(num1 + " y " + num2 + " tienen el mismo número "
                              + "de divisores (" + div1 + ")");
        }
        else if (div1>div2){
            System.out.println(num1 + " tiene más divisores que " + num2);
        }
        else{
            System.out.println(num2 + " tiene más divisores que " + num1);
        }       

    }
    
    // Función que permite calcular los divisores de un número (no se incluyen
    // ni el 1 ni el propio número):
    static int cantidadDivisores(int n) {
        int divisores = 0;
        if (n > 0) {
            for (int i = 2; i <= n/2; i++) {
                if (n%i==0){
                    divisores++;
                }
            }
        }
        return (divisores);
    }

}
