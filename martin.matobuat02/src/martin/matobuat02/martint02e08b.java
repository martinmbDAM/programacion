/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que recibe un día de la semana y una hora y responde
 * si a esa hora sale un autobús o no. Esta versión realiza a la vez las 
 * comprobaciones sobre si los datos son válidos y si hay autobús.
 * Versión alternativa: martint02e08a.java (las dos comprobaciones separadas).
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e08b {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int dia, hora;
        boolean datos_correctos, hay_autobus;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nDía: ");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.print("Hora: ");
        hora = Integer.parseInt(teclado.nextLine());
        
        // Comprobaciones y resultados. Las comprobaciones son las siguientes:
        // 1. El día tiene que estar en el intervalo [1,7]
        // 2. La hora tiene que estar entre el intervalo [9,14]
        // 3. Si el día es el domingo siempre hay autobús entre las 9 y las 14.
        // 4. Si son las 10:00h siempre hay autobús.
        // 5. Si son las 14:00h hay autobús todos los días excepto el jueves.
        // 6. Si son las 12:00h y es jueves hay autobús.
        
        if((1<=dia && dia<=7)&&(9<=hora && hora<=14) && (dia==7 ||hora==10 || 
           (hora==14 && dia!=4) || (hora==12 && dia==4))){
            
            System.out.println("\nHay autobús\n");
        }
        else{
            System.out.println("\nNo hay autobús\n");
        }
    }
    
}
