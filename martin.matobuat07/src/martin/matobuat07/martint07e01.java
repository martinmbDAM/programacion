/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tiene definido un Array como variable global 
 * llamado temperaturaMeses, de 12 enteros, con las temperaturas medias de un 
 * lugar en cada uno de los meses del año. Serán valores enteros negativos o 
 * positivos. El programa tendrá diferentes funciones que realicen las 
 * siguientes tareas:
 * 
 * a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
 * b) Mostrar por pantalla el contenido del Array.
 * c) Mostrar por pantalla el contenido del Array en orden inverso.
 * d) Mostrar la temperatura media del año.
 * e) Mostrar los meses en los que hizo más de 30 grados.
 * f) Decir si hay algún mes con más de 30 grados.
 * 
 */
package martin.matobuat07;
import java.util.Random;

public class martint07e01 {
    
    // Variable global: 
    static int[] temperaturaMeses = new int[12];
    
    public static void main(String[] args) {
        
        // Apartado a:
        rellenaArray();
        
        // Apartado b:
        muestraArray();
        
        // Apartado c:
        muestraArrayInverso();
        
        // Apartado d: 
        temperaturaMedia();
        
        // Apartado e: 
        mesesDeMasDe30Grados();
        
        // Apartado f: 
        hayMayorDe30();
        
    }
    
    // Apartado a: Función que llena el Array con valores al azar para todos 
    // los meses (entre 0 y 40):
    static void rellenaArray(){
        Random aleatorio = new Random();
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i]=aleatorio.nextInt(41);
        }
    }
    
    // Apartado b: Función que muestra por pantalla el contenido del Array:
    static void muestraArray(){
        System.out.println("Elementos del Array: ");
        for(int n : temperaturaMeses){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    // Apartado c: Función que muestra por pantalla el contenido del Array en 
    // orden inverso:
    static void muestraArrayInverso(){
        System.out.println("Elementos del Array en orden inverso: ");
        for (int i = temperaturaMeses.length-1; i >= 0; i--) {
            System.out.print(temperaturaMeses[i] + " ");
        }
        System.out.println();
    }
    
    // Apartado d: Función que muestra la temperatura media del año:
    static void temperaturaMedia(){
        int media=0;
        for(int n : temperaturaMeses){
            media += n;
        }
        System.out.printf("\nTemperatura media: %.2fº",(float)media/12);
    }
    
    // Apartado e: Función que muestra los meses en los que hizo más de 30 
    // grados:
    static void mesesDeMasDe30Grados(){
        System.out.println("\nMeses en los que hizo más de 30º: ");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i]>30){
                switch(i){
                    case 0 : System.out.println("Enero"); break;
                    case 1 : System.out.println("Febrero"); break;
                    case 2 : System.out.println("Marzo"); break;
                    case 3 : System.out.println("Abril"); break;
                    case 4 : System.out.println("Mayo"); break;
                    case 5 : System.out.println("Junio"); break;
                    case 6 : System.out.println("Julio"); break;
                    case 7 : System.out.println("Agosto"); break;
                    case 8 : System.out.println("Septiembre"); break;
                    case 9 : System.out.println("Octubre"); break;
                    case 10: System.out.println("Noviembre"); break;
                    case 11: System.out.println("Diciembre"); break;
                }
            }
        }
    }
    
    // Apartado f: Función que dice si hay algún mes con más de 30 grados: 
    static void hayMayorDe30(){
        int i=0;
        boolean mas_de_30 = false;
        
        while(!mas_de_30 && i<temperaturaMeses.length){
            mas_de_30 = temperaturaMeses[i]>30;
            i++;
        }
        
        if (mas_de_30){
            System.out.println("Hay algún mes de más de 30º");
        }
        else {
            System.out.println("No hay ningún mes de más de 30º");
        }
    }

    
}