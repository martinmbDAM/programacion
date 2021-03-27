/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de Febrero de 2021
 * Descripción: Programa que permite jugar al MasterMind.
 */
package martin.matobuat06;
import java.util.Scanner;

public class martint06e17 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num_intentos, num_digitos;
        
        do{
            System.out.print("Número de intentos: "); 
            num_intentos = teclado.nextInt();
        }while(num_intentos<=0);
        do{
            System.out.print("Número de dígitos: "); 
            num_digitos = teclado.nextInt();
        }while(num_digitos<=0);
        
        System.out.println("-------------NÚMERO GENERADO-------------");
        
        // Limpiamos el buffer:
        teclado.nextLine();
        
        // Creamos el juego:
        MasterMind juego = new MasterMind(num_intentos,num_digitos);
        
        // Jugamos:
        while(!juego.finIntentos() && !juego.numeroAcertado()){
            System.out.print("Introduzca un número de " + num_digitos + 
                    " digitos (quedan " + juego.getIntentos() + " intentos): ");
            juego.adivinar(teclado.nextLine());
        }

    }
    
}