/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que obtiene la letra del DNI a partir de los 8 dígitos.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e19 {

    public static void main(String[] args) {
        
        // Declaración de variables:
        int numero_dni, resto;
        char letra = '#';
        Scanner teclado = new Scanner(System.in);
        
        // Se pide al usuario que introduzca el número del DNI:
        System.out.print("\nNúmero del DNI: ");
        numero_dni = Integer.parseInt(teclado.nextLine());
        
        // División:
        resto = numero_dni%23;
        
        // Se le asigna una letra:
        switch(resto){
            case 0 : letra = 'T'; break;
            case 1 : letra = 'R'; break;
            case 2 : letra = 'W'; break;
            case 3 : letra = 'A'; break;
            case 4 : letra = 'G'; break;
            case 5 : letra = 'M'; break;
            case 6 : letra = 'Y'; break;
            case 7 : letra = 'F'; break;
            case 8 : letra = 'P'; break;
            case 9 : letra = 'D'; break;
            case 10 : letra = 'X'; break;
            case 11 : letra = 'B'; break;
            case 12 : letra = 'N'; break;
            case 13 : letra = 'J'; break;
            case 14 : letra = 'Z'; break;
            case 15 : letra = 'S'; break;
            case 16 : letra = 'Q'; break;
            case 17 : letra = 'V'; break;
            case 18 : letra = 'H'; break;
            case 19 : letra = 'L'; break;
            case 20 : letra = 'C'; break;
            case 21 : letra = 'K'; break;
            case 22 :  letra = 'E'; break;
            default : System.out.println("\nERROR");
        }
        
        // Se muestra el DNI completo:
        System.out.print("\n------------------------------");
        System.out.printf("\nDNI completo: %d%c\n",numero_dni,letra);
        System.out.println("------------------------------");
    }
    
}
