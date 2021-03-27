/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 20 de Octubre de 2020
 * Descripción: Programa que lee dos números decimales y después de aplicarle 
 * las operaciones del apartado 'a' divide el primero por el segundo.
 * Versiones alternativas: martint02e02b (apartado b) y martint02e02c (apartado c)
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e02a {

    public static void main(String[] args) {
       
        /* Diferencias entre las versiones:
         * La primera versión comprueba primero que el denominador sea distinto
         * de 0, de ese modo, si el usuario introduce 0 para el valor de b, al
         * ejecutarse las condiciones en cortocircuito, no llega a realizarse la
         * división, por lo el programa no llega a un error y no necesita lanzar
         * una excepción. No se cumple la condición del 'if' y por lo tanto no
         * se realiza ninguna otra acción, solo se sale del 'if' y finaliza la
         * ejecución del programa.       
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
        if (b !=0 && a/b==0){
            r = a/b;
            System.out.println("\n" + r + "\n");
        }
        
    }
    
}
