/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 17 de Noviembre de 2020
 * Descripción: Análisis del código del ejercicio 15.
 */
package martin.matobuat03;

public class martint03e15 {

    public static void main(String[] args) {
        
        int hora=0;
        for (int i=1;i<=7*24;i++) {
            System.out.println (hora);
            if (++hora > 23) hora=0;
                
        }
        
        /* ANÁLISIS: 
         * El código anterior muestra por pantalla todas las horas que hay en 
         * una semana (no la suma de las horas, sino las horas una a una). El
         * bucle recorre cada hora de cada día de la semana (7*24 = 168 
         * iteraciones), y en cada una de estas iteraciones muestra la hora.
         * A continuación hay una sentencia 'if' que realiza dos acciones: 
         * primero incrementa la variable 'hora' y a continuación comprueba si
         * el valor almacenado en esa variable supera el número 23, en tal caso
         * la variable se habrá salido de rango y es necesario volver a ponerla
         * a 0.        
        */
        
    }
}
    
