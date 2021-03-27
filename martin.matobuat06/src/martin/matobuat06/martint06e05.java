/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que permite jugar al Ahorcado.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        String adivinar, pista;
        
        Ahorcado juego;

        System.out.print("Palabra a adivinar: ");
        adivinar = teclado.nextLine();
        int respuesta;
        String [] argumentos = {"Sí","No"};
        respuesta = Menu.menu(argumentos);
        
        if (respuesta==1){
            System.out.print("Pista: ");
            pista = teclado.nextLine();
            
            // Creamos el juego con pista:
            juego = new Ahorcado(adivinar,pista);
        }
        else{
            // Creamos el juego sin pista:
            juego = new Ahorcado(adivinar);
        }
        
        // Juego del ahorcado:
        while(!juego.adivinada() && !juego.perdio()){
            System.out.println("---------------------------------------------");
            juego.pintar();
            if(juego.probarLetra(juego.leerLetra())){
                System.out.println("Has acertado una letra");
            }
            else{
                System.out.println("No has acertado");
            }
            
        }
        
        System.out.println("---------------------------------------------");
        
        if (juego.adivinada()){
            System.out.println("¡Felicidades! Has ganado");
        }
        else{
            System.out.println("Te has quedado sin intentos. Otra vez será...");
        }

    }

}
