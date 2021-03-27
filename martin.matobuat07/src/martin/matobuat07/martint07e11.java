/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tiene definido un Array de 12 filas y 30 columnas 
 * llamado temperaturaDia con las temperaturas medias de un lugar en cada uno de 
 * los días del año suponemos meses de 30 días). Serán valores enteros negativos 
 * o positivos. El programa tiene funciones para realizar las tareas de cada
 * apartado.
 */
package martin.matobuat07;
import java.util.Random;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.Month;

public class martint07e11 {
    
    static int[][]temperaturasDias = new int[12][30];

    public static void main(String[] args) {
        
        // Apartado a:
        // Damos valores al array:
        rellenaArray();
        
        // Apartado b:
        // Mostramos los valores del Array:
        System.out.println("Temperatura media de cada día del año: ");
        muestraDias();
        
        // Apartado c:
        // Mostramos la temperatura media:
        temperaturaMedia();
        
        // Apartado d:
        // Mostramos el día más caluroso del año:
        diaMasCaluroso();
        
        // Apartado e:
        // Mostramos la temperatura media de cada mes:
        float [] medias = mediaMensual();
        
        Locale pais = new Locale("es","Es");
        
        for (int i = 0; i < medias.length; i++) {
            Month mes = Month.of(i+1);
            System.out.printf("Temperatura media de " + 
                    mes.getDisplayName(TextStyle.FULL, pais) + ": %+.2fº\n",
                    medias[i]);
        }
        
        // Apartado f:
        // Mostramos si hay algún día de más de30º:
        if (masDe30()){
            System.out.println("Hay algún día de más de 30º");
        }
        else {
            System.out.println("No hay ningún día de más de 30º");
        }
        
        // Apartado g:
        // Mostramos la temperatura mínima de cada país:
        float [] minimas = minimaMensual();
        
        for (int i = 0; i < minimas.length; i++) {
            Month mes = Month.of(i+1);
            System.out.printf("Temperatura mínima de " + 
                    mes.getDisplayName(TextStyle.FULL, pais) + ": %+.2fº\n",
                    minimas[i]);
        }        
        
    }
    
    // Apartado a:
    // Función que llena el Array con valores al azar para todos los días. 
    // Para enero, febrero, marzo, noviembre y diciembre los valores estarán 
    // comprendidos entre -10 y +20 y para el resto de meses entre +10 y +35.
    static void rellenaArray(){
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < temperaturasDias.length; i++) {
            
            switch(i){
                case 0:
                case 1:
                case 2:
                case 10:
                case 11:
                        for(int j=0; j<temperaturasDias[i].length;j++){
                            temperaturasDias[i][j] = aleatorio.nextInt(31)-10;
                        }
                        break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                        for(int j=0; j<temperaturasDias[i].length;j++){
                            temperaturasDias[i][j] = aleatorio.nextInt(26)+10;
                        }
                        break;
            }
            
        }
        
    }
    
    // Apartado b:
    // Función que muestra por pantalla el contenido del array en forma de 
    // tabla: todos los días de un mes en la misma fila, ocupando 3 posiciones 
    // (una para el signo y dos dígitos para la temperatura).
    static void muestraDias(){
        
        for(int i=0; i<temperaturasDias.length; i++){
            for(int j=0; j<temperaturasDias[i].length; j++){
                System.out.printf("%+3d  ",temperaturasDias[i][j]);
            }
            System.out.println();
        }
        
    }
    
    // Apartado c:
    // Función que muestra la temperatura media del año:
    static void temperaturaMedia(){
        
        float media=0;
        
        for (int i = 0; i < temperaturasDias.length; i++) {
            for (int j = 0; j < temperaturasDias[i].length; j++) {
                media+=temperaturasDias[i][j];
            }
        }
        
        media = media/(temperaturasDias.length*temperaturasDias[0].length);
        
        System.out.printf("\nTemperatura media: %+.2fº\n",media);
    }
    
    // Apartado d:
    // Función que muestra el día en que más calor hizo del año:
    static void diaMasCaluroso(){
        
        int max_temperatura = -11;
        int[] pos = {0,0};  // Fila y columna del día más caluroso
        
        for (int i = 0; i < temperaturasDias.length; i++) {
            for (int j = 0; j < temperaturasDias[i].length; j++) {
                if(temperaturasDias[i][j]>max_temperatura){
                    max_temperatura = temperaturasDias[i][j];
                    pos[0]=i;
                    pos[1]=j;
                }
            }
        }
        
        Month mes = Month.of(pos[0]+1);
        
        Locale pais = new Locale("es","Es");
        System.out.println("Día más caluroso: " + (pos[1]+1) + " de " + 
                mes.getDisplayName(TextStyle.FULL, pais) + "(" + 
                max_temperatura + "º)");
    }
    
    // Apartado e:
    // Función que calcula la temperatura media de cada mes y lo almacena en 
    // un array unidimensional de 12 posiciones:
    static float[] mediaMensual(){
        
        float[] temperaturaMeses = new float[12];
        
        for (int i = 0; i < temperaturasDias.length; i++) {
            float media=0;
            for (int j = 0; j < temperaturasDias[i].length; j++) {
                media+=temperaturasDias[i][j];
            }
            media=media/temperaturasDias[i].length;
            temperaturaMeses[i]=media;
        }        
        
        return(temperaturaMeses);
    }
    
    // Apartado f:
    // Función que dice si hay algún día con más de 30 grados, recorriendo lo 
    // imprescindible del array, es decir, en cuanto sabe que sí hay alguno, 
    // para de recorrer el array.
    static boolean masDe30(){
        
        boolean mayor=false;
        int i=0;
        
        while(i<temperaturasDias.length && !mayor){
            int j=0;
            while(j<temperaturasDias[i].length && !mayor){
                mayor=temperaturasDias[i][j]>30;
                j++;
            }
            i++;
        }
        return(mayor);        
    }
    
    // Apartado g:
    // Función que crea un Array unidimensional con la temperatura mínima de 
    // cada mes.
    static float[] minimaMensual(){
        
        float[] minimaMeses = new float[12];
        
        for (int i = 0; i < temperaturasDias.length; i++) {
            int minima = 36;
            for (int j = 0; j < temperaturasDias[i].length; j++) {
                if(temperaturasDias[i][j]<minima){
                    minima=temperaturasDias[i][j];
                }
            }
            minimaMeses[i]=minima;
        }        
        
        return(minimaMeses);
    }

}
