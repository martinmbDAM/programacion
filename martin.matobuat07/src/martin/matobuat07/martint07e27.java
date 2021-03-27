/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que permite jugar al MasterMind.
 */
package martin.matobuat07;
import java.util.Scanner;

public class martint07e27 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num_intentos, num_digitos;
        
        do{
            System.out.print("Número de intentos: "); 
            num_intentos = Integer.parseInt(teclado.nextLine());
        }while(num_intentos<=0);
        do{
            System.out.print("Número de dígitos: "); 
            num_digitos = Integer.parseInt(teclado.nextLine());
        }while(num_digitos<=0);
        
        System.out.println("-------------NÚMERO GENERADO-------------");
        
        // Creamos el juego:
        MasterMind juego = new MasterMind(num_intentos,num_digitos);
        
        int num_intento=1;
        
        // Jugamos:
        while(!juego.finIntentos() && !juego.numeroAcertado()){
            String intento;
            System.out.print("Introduce intento " + num_intento + ": ");
            intento = teclado.nextLine();
            
            int intentos_restantes = juego.getIntentos();
            juego.adivinar(intento);
            if(intentos_restantes != juego.getIntentos()){
                num_intento++;
            }
        }
        
        if(juego.numero_acertado){
            System.out.println("¡Has acertado! El número era el " + 
                    juego.getNumero());
        }
        else{
            System.out.println("No has acertado. El número era el " + 
                    juego.getNumero());
        }

    }
    
}
