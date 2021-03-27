/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que genera un número aleatorio y da al usuario 5 
 * intentos de adivinarlo. En cada momento informa al usuario si el número
 * es mayor, menor o si ha acertado.
 */
package martin.matobuat03parte2;
import java.util.Random;
import java.util.Scanner;

public class martint03e16 {

    public static void main(String[] args) {

        // Declaración de variables: 
        int intentos_restantes = 5; // Número de intentos restantes
        int numero;                 // Número introducido por el usuario
        int aleatorio;              // Número generado aleatoriamente
        boolean adivinado=false;    // Bandera que comprueba el acierto
        Scanner teclado = new Scanner(System.in);
        
        // Generación del número aleatorio:
        Random num_aleatorio = new Random();
        aleatorio = num_aleatorio.nextInt(100);
        
        // El usuario intenta adivinar el número:
        do{
            // Entrada de datos:
            System.out.printf("\nIntroduzca un número (quedan %d intentos): ",
                              intentos_restantes);
            numero = Integer.parseInt(teclado.nextLine());
            
            // Comprobamos si el usuario ha acertado. Si no ha acertado restamos
            // un intento e informamos de si el número a adivinar es mayor o 
            // menor que el que ha introducido él:
            if (numero == aleatorio){
                adivinado = true;
            }
            else{   
                
                intentos_restantes--;
                
                if (numero < aleatorio){
                    System.out.println("\nTe has quedado corto");
                }
                else{
                    System.out.println("\nTe has pasado");
                }
            }
            
        }while (!adivinado && intentos_restantes>0);
        
        // Informamos del resultado:
        System.out.print("\n-----------------------------------------");
        if (adivinado){
            System.out.printf("\nHas acertado: el número era el %d\n",
                              aleatorio);
        }
        else{
            System.out.printf("\nNo has acertado: el número era el %d\n",
                              aleatorio);
        }
        System.out.println("-----------------------------------------");
    }
    
}
