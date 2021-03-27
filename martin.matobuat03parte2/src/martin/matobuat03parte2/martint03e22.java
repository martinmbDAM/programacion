/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Análisis de un programa que debería mostrar los 12 primeros 
 * elementos de la serie de Fibonacci.
 */
package martin.matobuat03parte2;

public class martint03e22 {

    public static void main(String[] args) {
        
        // Código original:
        /*
        int ant=1, ant2=0, num;      
        for (int i=1; i<=12; i++){              
            num = ant + ant2;
            System.out.println(num);          
            ant = num; ant2 = ant;   
        }
        */
        
        /*Análisis:
         * El código es incorrecto por dos motivos:
         *      1. No aparecen los dos primeros elementos (0 y 1). Se deberían
         *         mostrar esos dos números antes de entrar al bucle que 
         *         calcula los siguientes. Como se muestran por pantalla antes
         *         del bucle, este no debe tener 12 iteraciones, sino diez.
         *      2. La última sentencia está al revés. Primero se debe guardar 
         *         'ant' en 'ant2', y después, 'num' en 'ant'. Tal y como lo 
         *         hace el algoritmo se almacena 'num' tanto en 'ant' como en 
         *         'ant2'.
         */
        
        // Código correcto:
        int ant=1,ant2=0,num;
        System.out.println(ant2);
        System.out.println(ant);
        for(int i=1;i<=10;i++){
            num=ant+ant2;
            System.out.println(num);
            ant2=ant; ant=num;
        }
        
    }
    
}
