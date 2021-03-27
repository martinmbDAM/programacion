/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee una hora y responde qué días de la semana hay
 * autobús a dicha hora.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e09 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int hora;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nHora: ");
        hora = Integer.parseInt(teclado.nextLine());
        
        //Salida de resultados:
        if (0<=hora && hora<=23){
            
            //Si la hora no está en el intervalo [9,14] no hay autobús:
            if (hora<9 || hora>14){
                System.out.println("\nNo hay autobús a esa hora\n");
            }
            else{
                System.out.printf("\nA las %d:00 hay autobús estos días: ",
                                   hora);
                switch(hora){
                case 9 :  System.out.print("Domingo\n\n"); break;
                case 10 : System.out.print("Lunes, Martes, Miércoles, Jueves,"
                        + " Viernes, Sábado y Domingo\n\n"); break;
                case 11 : System.out.print("Domingo\n\n"); break;
                case 12 : System.out.print("Jueves y Domingo\n\n"); break;
                case 13 : System.out.print("Domingo\n\n"); break;
                case 14 : System.out.print("Lunes, Martes, Miércoles, Viernes,"
                        + " y Domingo\n\n"); break;
                default : System.out.println("ERROR");
            }
            }
        }
        else{
            System.out.println("\nERROR: Hora incorrecta\n");
        }
    }
    
}
