/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que genera un número aleatorio y da al usuario 5 
 * intentos de adivinarlo.
 */
package martin.matobuat03;
import java.util.Random;
import java.util.Scanner;

public class martint03e16 {

    public static void main(String[] args) {
        
        // Constante que almacena el número máximo de intentos:
        final int INTENTOS = 5;
        
        // Declaración de variables: 
        int intentos_restantes = INTENTOS, numero, aleatorio;
        boolean adivinado = false;
        Scanner teclado = new Scanner(System.in);
        
        // Generación del número aleatorio:
        Random num_aleatorio = new Random();
        aleatorio = num_aleatorio.nextInt(100);
        
        // El usuario intenta adivinar el número:
        do{
            System.out.printf("\nIntroduzca un número (quedan %d intentos): ",
                              intentos_restantes);
            numero = Integer.parseInt(teclado.nextLine());
            
           // Restamos un intento:
           intentos_restantes--;
           
           // Comprobamos si el usuario ha acertado:
           adivinado = (numero == aleatorio);
            
        }while (!adivinado && intentos_restantes > 0);
        
        // Informamos del resultado:
        System.out.print("\n------------------------------------------------");
        if (adivinado){
            System.out.printf("\nHas acertado: el número era el %d\n",aleatorio);
        }
        else{
            System.out.printf("\nNo has acertado: el número era el %d\n",aleatorio);
        }
        System.out.println("------------------------------------------------");
    }
    
}
