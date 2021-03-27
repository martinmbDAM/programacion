/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce una cadena y un caracter, y 
 * muestra cuántas veces está contenido el caracter en la cadena.
 */
package martin.matobuat04;
import java.util.Scanner;

public class martint04e03{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos: 
        System.out.print("\nIntroduzca una cadena: ");
        String cad = teclado.nextLine();
        System.out.print("\nIntroduzca un caracter: ");
        char c = teclado.nextLine().charAt(0);
        
        // Se comprueba cuántas veces está presente en la cadena:
        int contador=0;
        int pos=0;
        while (cad.indexOf(c,pos)!=-1){
            contador++;
            pos=cad.indexOf(c,pos)+1;
        }
   
        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.printf("El caracter %c está presente en la cadena \"%s\" %d"
                          + " veces",c,cad,contador);
        System.out.println("\n-----------------------------------------------");
        
      
    }
    
}
