/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase Pistola permitiendo jugar a la 
 * ruleta rusa.
 */
package martin.matobuat06;

public class martint06e13 {

    public static void main(String[] args) {
        
        Pistola pistola = new Pistola();
        
        boolean jugador1 = true;
        
        System.out.println("-----------------RULETA RUSA-----------------");
        while(!pistola.fin()){
            pistola.disparo();
            if (jugador1){
                System.out.print("Jugador 1 -> ");
            }
            else{
                System.out.print("Jugador 2 -> ");
            }
            jugador1 = !jugador1;
            
            if (pistola.fin()){
                System.out.println("Muere");
            }
            else{
                System.out.println("Sobrevive");
            }
        }
        
    }
    
}