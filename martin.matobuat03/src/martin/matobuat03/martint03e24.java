/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que pide al usuario números y muestra el resultado de
 * sumarlos. El programa finaliza cuando el usuario introduzca un número mayor
 * de 1000 o bien cuando se han introducido 15 números.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e24 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        int num=0, suma = 0, contador = 1;
        Scanner teclado = new Scanner(System.in);
        
        while (num<=1000 && contador<=15){
            
            // Lectura dentro del bucle:
            System.out.print("\nIntroduzca un número: ");
            num = Integer.parseInt(teclado.nextLine());
            
            // Se añade el número a la suma y se muestra por pantalla:
            suma += num;
            System.out.print("Suma: " + suma);
            
            // Se incrementa el contador:
            contador++;
            
        }
        
        System.out.println("\nEJECUCIÓN FINALIZADA");
        
    }
    
}
