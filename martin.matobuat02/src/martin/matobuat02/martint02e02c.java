/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 20 de Octubre de 2020
 * Descripción: Programa que lee dos números decimales y después de aplicarle 
 * las operaciones del apartado 'c' divide el primero por el segundo.
 * Versiones alternativas: martint02e02a (apartado a) y martint02e02b (apartado b)
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e02c {

    public static void main(String[] args) {
       
        /* Diferencias entre las versiones:
         * La tercera versión es similar a la primera, ya que evalúa que el 
         * denominador sea distinto de 0 antes de realizar la división, a 
         * diferencia de la segunda versión. No obstante, al usar el operador
         * '&' en lugar de '&&' las condiciones no se evalúan en cortocircuito,
         * es decir, aunque se comprueba que el denominador no sea cero sí se
         * evalúa la segunda condición. Por lo tanto, se llega a realizar la 
         * división y el programa llega a un error, del mismo modo que en la 
         * segunda versión. Al no incorporar código para el manejo de 
         * excepciones el programa aborta la ejecución en ese punto.
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
        if (b !=0 & a/b==0) {
            r = a/b;
            System.out.println("\n" + r + "\n");
        }
        
    }
    
}
