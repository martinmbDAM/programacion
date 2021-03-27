/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que muestra los números primos comprendidos entre 2 y 
 * 1000. 
 */
package martin.matobuat03parte2;

public class martint03e21 {

    public static void main(String[] args) {
        
        /*
         * Algoritmo con el mínimo de iteraciones:
         * 1. Se imprimen el 2, el 3 y el 5 por separado (el 2 porque es el 
         *    único número primo par, el 3 porque es el primero de los números 
         *    primos impares del intervalo [2,1000], por lo que vamos a usarlo
         *    como primer posible divisor de los demás, y el 5 porque 3 es mayor
         *    que 5/2).
         * 2. Se recorre el intervalo comprobando sólo los números impares
         *    empezando por el 7.
         * 3. Para cada número comprobamos si es primo observando si tiene 
         *    divisores en el intervalo [3,i/2].
         * 4. Si es primo, se imprime.
         */
        boolean es_primo;
        int divisor;
        
        System.out.println("\nNúmeros primos entre 2 y 1000");
        System.out.print("\n2\n3\n5\n");
        
        for (int i=7;i<=1000;i+=2){            
            divisor=3;
            do{
               es_primo = i%divisor!=0;
               divisor += 2;              
            }while(es_primo && divisor<=i/2);
            
            if(es_primo){
                System.out.print(i + "\n");
            }
        }
        
    }
    
}