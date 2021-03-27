/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que se ejecuta mientras el usuario introduzca números
 * ordenados ascendentemente. Si el usuario introduce 0 o números no ordenados
 * el programa finaliza su ejecución.
 */
package martin.matobuat03;
import java.util.Scanner;

public class martint03e20 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        int numero, numero_anterior;
        boolean ordenados;
        Scanner teclado = new Scanner(System.in);
        
        // Lectura adelantada:
        System.out.print("\nIntroduzca un número: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Si el número introducido no es 0, se entra en el bucle:
        if (numero != 0){
            // Siguientes lecturas:
            do{
                // Se almacena el número anterior:
                numero_anterior = numero;
                
                // Se lee el siguiente número:
                System.out.print("\nIntroduzca un número: ");
                numero = Integer.parseInt(teclado.nextLine());
                
                // Se informa de si los números están ordenandos
                // ascendentemente (se considera que si se introduce varias
                // veces seguidas el mismo número estos siguen estando ordenados
                // ascendentemente):
                
                ordenados = numero>=numero_anterior;
                
                if (ordenados){
                    System.out.println("Números ordenados ascendentemente");
                }
                else{
                    System.out.println("Números no ordenados ascendentemente");
                }
                
            } while (numero!=0 && ordenados);
        }
        
        // Finaliza la ejecución:
        System.out.println("\nEJECUCIÓN FINALIZADA");  
 
    }
    
}
