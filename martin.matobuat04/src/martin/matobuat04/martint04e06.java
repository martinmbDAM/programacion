/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa al que se le introduce un email y devuelve el dominio
 * y los subdominios si los hubiese. 
 */
package martin.matobuat04;

import java.util.Scanner;

public class martint04e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nEmail: ");
        String email = teclado.nextLine();
        
        // Para obtener el dominio y los subdominios hay que extraer la cadena
        // que va de la arroba al último punto. Tenemos dos índices, 'i' y 'j'.
        // 'i' apunta a la '@' y 'j' apunta al último punto:
        int i = email.indexOf('@');
        int j = i;        
        do{
            j=email.indexOf('.',j+1);
        }while (email.indexOf('.',j+1)!=-1);
        
        // Obtenemos la subcadena:
        String dominio = email.substring(i+1,j);

        // Salida de resultados:
        System.out.println("\n-----------------------------------------------");
        System.out.println("Dominio (y subdominios): " + dominio);
        System.out.println("-----------------------------------------------");

    }

}
