/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que pide al usuario números y muestra el resultado de
 * sumarlos. El programa finaliza cuando el usuario introduzca un número mayor
 * de 1000 o bien cuando se han introducido 15 números.
 */
package martin.matobuat03parte2;
import java.util.Scanner;

public class martint03e24 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        float num=0f, suma=0f;
        int contador=1;
        Scanner teclado = new Scanner(System.in);
        
        while (num<=1000 && contador<=15){
            
            // Lectura de datos:
            System.out.print("\nIntroduzca un número: ");
            num = teclado.nextFloat();
            
            // Si el número no es mayor que 1000, se añade a la suma y se 
            // incrementa el contador:
            if (num <= 1000){
                suma += num;
                contador++;
            }            
            
        }
        
        // Se muestra el resultado por pantalla:
        System.out.println("\nSuma: " + suma);
        
    }
    
}
