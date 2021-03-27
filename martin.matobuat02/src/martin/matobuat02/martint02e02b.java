/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 20 de Octubre de 2020
 * Descripción: Programa que lee dos números decimales y después de aplicarle 
 * las operaciones del apartado 'b' divide el primero por el segundo.
 * Versiones alternativas: martint02e02a (apartado a) y martint02e02c (apartado c)
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e02b {

    public static void main(String[] args) {
       
        /* Diferencias entre las versiones:
         * La segunda versión, a diferencia de la primera, realiza la división 
         * antes de comprobar que el denominador no sea cero. Esto ocasiona que 
         * se llegue a un error si el usuario introduce el 0 como valor de b. Ya
         * que el código no incluye código para el manejo de las excepciones, el
         * programa aborta su ejecución en ese punto y no se ejecuta nada más.
        */
        
        // Declaración de variables:
        double a,b,r;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer número: ");
        a = teclado.nextDouble();
        System.out.print("Segundo número: ");
        b = teclado.nextDouble();
        
        // Salida de resultados:
        if (a/b==0 && b !=0){
            r = a/b;
            System.out.println("\n" + r + "\n");
        }
        
    }
    
}
