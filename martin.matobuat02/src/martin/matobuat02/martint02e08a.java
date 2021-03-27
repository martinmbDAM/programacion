/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que recibe un día de la semana y una hora y responde
 * si a esa hora sale un autobús o no. Esta versión hace dos comprobaciones 
 * distintas: primero comprueba si los datos son correctos y, a continuación,
 * si hay autobús a esa día y hora.
 * Versión alternativa: martint02e08b.java (las dos comprobaciones juntas).
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e08a {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int dia, hora;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nDía: ");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.print("Hora: ");
        hora = Integer.parseInt(teclado.nextLine());
        
        // Se comprueba si los datos son correctos:
        
        //Datos correctos:
        if ((1<=dia && dia<=7)&&(9<=hora && hora<=14)){
            
            //Se comprueba si a esa hora hay autobús:
            boolean hay_autobus = true;
            switch (dia){
                case 1 : 
                case 2 : 
                case 3 :
                case 5 :
                case 6 : hay_autobus = hora==10 || hora==14;
                         break;
                case 4 : hay_autobus = hora==10 || hora==12 || hora==14;
                         break;
                default : System.out.println("\nERROR");
            }    
            //Se muestra el resultado:
            if(hay_autobus){
                System.out.println("\nHay autobús\n");
            }
            else{
                System.out.println("\nNo hay autobús\n");
            }
        }
        //Datos incorrectos:
        else{
            System.out.println("\nERROR: Datos incorrectos\n");
        }
    }
    
}
