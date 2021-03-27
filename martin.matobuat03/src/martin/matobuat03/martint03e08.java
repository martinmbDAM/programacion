/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Programa que calcula la suma de los 100 números siguientes a uno
 * introducido por el usuario.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e08 {

    public static void main(String[] args) {
        
        // Constante que almacena la cantidad de números siguientes:
        final int LIMITE = 100;
        
        // Declaración de variables:
        int num, suma=0;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nIntroduzca un número: ");
        num = Integer.parseInt(teclado.nextLine());
        for (int i = num+LIMITE; i>num; i--) {
            suma+=i;
        }
       
        // Salida de datos:
        System.out.print("\n---------------------------------------------------");
        System.out.printf("\nLa suma de los %d números siguientes a %d es: %d\n",
                          LIMITE,num,suma);        
        System.out.println("-------------------------------------------------");
        
    }
    
}
