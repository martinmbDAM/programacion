/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tiene una función a la que se le pasa un Array con 
 * las edades de los alumnos de una clase y nos devuelva la edad media. Añadir 
 * una función a la que se le pasa un Array con las edades de los alumnos y nos 
 * devuelva un Array solo con los mayores de edad.
 */
package martin.matobuat07;

public class martint07e10 {

    public static void main(String[] args) {
        
        // Array de prueba:
        int[]edad_alumnos = {16,23,32,18,17,19,21,25,22,29};
        
        // Cálculo de la edad media de los alumnos:
        System.out.println("Edad media de los alumnos: " + media(edad_alumnos) + 
                " años");
        
        // Edades de los alumnos mayores de edad:
        int[] mayores = mayoresEdad(edad_alumnos);
        
        System.out.print("Edades de los alumnos mayores de edad: ");
        for(int n : mayores){
            System.out.print(n + " ");
        }
        System.out.println();
        
    }
    
    // Función que calcula la edad media de los alumnos:
    private static float media(int[] edades){
        
        float media=0;
        
        for (int n : edades) {
            media += n;
        }
        
        media = media/edades.length; 
        
        return(media);
    }
    
    // Función que devuelve un array con las edades de los alumnos mayores de 
    // edad:
    private static int[] mayoresEdad(int[] edades){
        
        int mayores=0;
        
        // Comprobamos cuántos alumnos mayores de edad hay:
        for(int n : edades){
            if (n>=18){
                mayores++;
            }
        }
        
        int[] alumnos = new int[mayores];
        
        // Introducimos en el array las edades de los alumnos mayores de edad:
        int i=0;
        for(int n : edades){
            if (n>=18){
                alumnos[i]=n;
                i++;
            }
        }
        
        return(alumnos);
    }
    
}
