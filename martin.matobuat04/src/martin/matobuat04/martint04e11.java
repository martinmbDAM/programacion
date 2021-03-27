/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Enero de 2021
 * Descripción: Programa que analiza el código del ejercicio 4.11
 */
package martin.matobuat04;

public class martint04e11 {

    public static void main(String[] args) {
        
        // Código original:
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1) {
                cadenaSB.deleteCharAt(pos);
            }
        } while (pos != -1);
        System.out.println(cadenaSB);
        
        /* Análisis:
         * El programa pide al usuario una cadena, la guarda en un string y crea
         * un StringBuilder con él. A continuación, localiza en la variable 
         * 'pos' la posición de cada espacio en blanco y los borra uno a uno. 
         * El algoritmo no contiene ningún error.
        */
        

    }

}
