/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 10 de Noviembre de 2020
 * Descripción: Programa que muestra los números primos comprendidos entre 2 y 
 * 1000. Se permite el uso de 'break' en los bucles para minimizar las 
 * iteraciones. Hay que tener en cuenta:
 *      1. Los números primos solo son divisibles por 1 y por sí mismos
 *      2. Todos los números primos son impares (excepto el 2).
 *      3. Los divisores de un número siempre son menores que la mitad de dicho
 *         número (salvo él mismo).
 *      4. Si un número no es divisible por 2 ya no va a serlo por ningún número
 *         par.
 */
package martin.matobuat03;

public class martint03e21 {

    public static void main(String[] args) {
        
        /*
         * Algoritmo con el mínimo de iteraciones:
         * 1. Se imprimen el 2 y el 3 por separado (el 2 porque es el único
         *    número primo par y el 3 porque no tiene posibles divisores 
              diferentes de 1 y sí mismo).
         * 2. Se recorre el intervalo comprobando sólo los números impares.
         * 3. Para cada número comprobamos si tiene algún divisor distinto de 1
         *    o sí mismo.
         * 4. Si no tiene ningún divisor distinto de 1 o sí mismo, se imprime.
         */
        
        System.out.println("\nNúmeros primos entre 2 y 1000");
        System.out.print("\n2\n3\n");
        
        for (int i=5;i<=1000;i+=2){
            boolean es_primo;
            int divisor=3;
            do{
               es_primo = i%divisor!=0;
               divisor += 2;
              
            }while(es_primo && divisor<=(float)i/2);
            
            if(es_primo){
                System.out.print(i + "\n");
            }
        }
        
    }
    
}