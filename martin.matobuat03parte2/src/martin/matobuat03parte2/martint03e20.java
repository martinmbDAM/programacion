/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que se ejecuta mientras el usuario introduzca números
 * ordenados ascendentemente. Si el usuario introduce 0 o números no ordenados
 * el programa finaliza su ejecución.
 */
package martin.matobuat03parte2;
import java.util.Scanner;

public class martint03e20 {

    public static void main(String[] args) {
        
        // Declaración e inicialización de variables:
        int numero, numero_anterior;
        boolean ordenados;
        Scanner teclado = new Scanner(System.in);
        
        // Primer número:
        System.out.print("\nIntroduzca un número: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Si el número introducido no es 0, se entra en el bucle:
        if (numero != 0){
            // Siguientes lecturas:
            do{
                // Se almacena el número anterior:
                numero_anterior = numero;
                
                // Lectura dentro del bucle:
                System.out.print("\nIntroduzca un número: ");
                numero = Integer.parseInt(teclado.nextLine());
                
                // Se comprueba si los números están ordenados:                 
                ordenados = numero > numero_anterior;                
                              
            } while (numero!=0 && ordenados);
            
            // Salida de resultados:
            if (ordenados){
                System.out.println("\nNúmeros ordenados ascendentemente");
            }
            else{
                System.out.println("\nNúmeros no ordenados ascendentemente");
            }
        }
        else{
            System.out.println("\nERROR: No hay datos");
        }
        
       /* El enunciado no especifica si el 0, además de ser condición de parada,
        * es un valor válido de la sucesión (es decir, si se puede usar para
        * compararlo con el número anterior). Este programa considera que sí lo
        * es. Si se optase por lo contrario, el código quedaría así:
        */
       
       /*
        
        // Declaración e inicialización de variables:
        int numero, numero_anterior;
        boolean ordenados=true;
        Scanner teclado = new Scanner(System.in);
        
        // Primer número:
        System.out.print("\nIntroduzca un número: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        // Si el número introducido no es 0, se entra en el bucle:
        if (numero != 0){
            // Segundo número:
            System.out.print("\nIntroduzca un número: ");
            numero_anterior = Integer.parseInt(teclado.nextLine());
        
            if (numero_anterior != 0){
                do{                                    
                    // Lectura dentro del bucle:
                    System.out.print("\nIntroduzca un número: ");
                    numero = Integer.parseInt(teclado.nextLine());
                
                    // Se comprueba si los números están ordenados:
                    if (numero != 0){
                        ordenados = numero > numero_anterior;
       
                        // Se almacena el número anterior:
                        numero_anterior = numero;
                    }                    
                              
                } while (numero!=0 && ordenados);
            
                // Salida de resultados:
                if (ordenados){
                    System.out.println("\nNúmeros ordenados ascendentemente");
                }
                else{
                    System.out.println("\nNúmeros no ordenados ascendentemente");
                }
            }
            else{
                System.out.println("\nERROR: Solo ha introducido un número");
            }
            
        }
        else{
            System.out.println("\nERROR: No hay datos");
        }        
        
        */
    }
    
}
