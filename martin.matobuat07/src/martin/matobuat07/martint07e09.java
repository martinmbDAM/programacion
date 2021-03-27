/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tiene definido un Array como variable global 
 * llamado temperaturaMeses, de 12 enteros, con las temperaturas medias de un 
 * lugar en cada uno de los meses del año. Serán valores enteros negativos o 
 * positivos. El programa tiene diferentes funciones que realicen las
 * tareas que se especifican en ellas:
 */
package martin.matobuat07;
import java.util.Random;
import java.util.Locale;
import java.time.Month;
import java.time.format.TextStyle;

public class martint07e09 {
    
    static int[]temperaturaMeses = new int[12];
    
    public static void main(String[] args) {
        
        // Apartado a:
        // Damos valores al array:
        rellenaArray();
        
        // Apartado b:
        System.out.println("\nMostrar los valores por pantalla: ");
        muestraMeses();
        
        // Apartado c:
        System.out.println("\nMostrar la temperatura media: ");
        temperaturaMedia();
        
        // Apartado d:
        System.out.println("\nMostrar la temperatura máxima: ");
        temperaturaMaxima();
        
        // Apartado e:
        System.out.println("\nMostrar el mes más frío: ");
        mesMasFrio();
        
        // Apartado f:
        System.out.println("\nDesplazar los valores a la derecha y mostrarlos: ");
        desplazaDerecha();
        muestraMeses();
        
        // Apartado g:
        System.out.println("\nDesplazar los valores a la izquierda y mostrarlos");
        desplazaIzquierda();
        muestraMeses();
        
        // Apartado h:
        System.out.println("\nMostrar si hay algún mes de más de 30º: ");
        if(masDe30()){
            System.out.println("Hay algún mes de más de 30º");
        }
        else{
            System.out.println("No hay ningún mes de más de 30º");
        }
        
        // Apartado i:
        System.out.println("\nMostrar si hay alguna temperatura repetida: ");
        if(tempRepetida()){
            System.out.println("Hay alguna temperatura repetida");
        }
        else{
            System.out.println("No hay ninguna temperatura repetida");
        }
    }
    
    // Apartado a:
    // Función que Llena el Array con valores al azar para todos los meses. 
    // Para enero, febrero, marzo, noviembre y diciembre los valores estarán 
    // comprendidos entre -10 y +20 y para el resto de meses entre +10 y +40.
    static void rellenaArray(){
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            
            switch(i){
                case 0:
                case 1:
                case 2:
                case 10:
                case 11:
                        temperaturaMeses[i]=aleatorio.nextInt(31)-10;
                        break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                        temperaturaMeses[i]=aleatorio.nextInt(31)+10;
                        break;
            }
            
        }
        
    }
    
    // Apartado b:
    // Función que muestra por pantalla el contenido del array con el nombre de 
    // los meses:
    static void muestraMeses(){
        
        Locale pais = new Locale("es","Es");
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            
            Month mes = Month.of(i+1);           
            
            System.out.println(mes.getDisplayName(TextStyle.FULL, pais) +
                                ": " + temperaturaMeses[i] + "º");
        }
        
    }
   
    // Apartado c:
    // Función que calcula la temperatura media del año, usando printf 
    // especificando en el formato que incluya el signo “+” en temperaturas 
    // positivas y que solo muestre 1 decimal.
    static void temperaturaMedia(){
        
        float media=0;
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            media+=temperaturaMeses[i];
        }
        media=media/temperaturaMeses.length;
        
        System.out.printf("Temperatura media: %+.1fº\n",media);
    }
    
    // Apartado d:
    // Función que muestra la temperatura máxima del año:
    static void temperaturaMaxima(){
        
        int maxima=-10;
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if(temperaturaMeses[i]>maxima){
                maxima = temperaturaMeses[i];
            }
        }
        System.out.printf("Temperatura máxima: %+dº\n",maxima);
    }
    
    // Apartado e:
    // Función que muestra el mes más frío del año:
    static void mesMasFrio(){
        
        Locale pais = new Locale("es","Es");
        
        int mes_mas_frio = 0;
        int  temperatura_mas_fria=41;
        
        for (int i = 1; i < temperaturaMeses.length; i++) {
            
            if(temperaturaMeses[i]<temperatura_mas_fria){
                temperatura_mas_fria = temperaturaMeses[i];
                mes_mas_frio = i;
            }     
        }
        
        Month mes = Month.of(mes_mas_frio+1);
        
        System.out.println("Mes más frío: " + mes.getDisplayName(TextStyle.FULL, 
                pais));
        
    }
    
    // Apartado f:
    // Función que desplaza los valores a la derecha, pasando el último al 
    // primero, para hacer pruebas estadísticas:
    static void desplazaDerecha(){
        
        // Almacenamos el último valor:
        int ultimo = temperaturaMeses[temperaturaMeses.length-1];
        
        // Copiamos todos los valores en el siguiente:
        int i=11;
        while(i>0){
            temperaturaMeses[i]=temperaturaMeses[i-1];
            i--;
        }
        // Copiamos el último valor en el primero:
        temperaturaMeses[0]=ultimo;
    }
    
    // Apartado g:
    // Función que desplaza los valores a la izquierda, pasando el primero al 
    // último, para hacer pruebas estadísticas:
    static void desplazaIzquierda(){
        
        // Almacenamos el primer valor:
        int primero = temperaturaMeses[0];
        
        // Copiamos todos los valores en el siguiente:
        int i=1;
        while(i<temperaturaMeses.length){
            temperaturaMeses[i-1]=temperaturaMeses[i];
            i++;
        }
        // Copiamos el primer valor en el último:
        temperaturaMeses[temperaturaMeses.length-1]=primero;
        
    }
    
    // Apartado h:
    // Función que dice si hay algún mes con más de 30 grados, recorriendo lo 
    // imprescindible del array, es decir, en cuanto sepa que sí hay alguno, 
    // que pare de recorrer el array.
    static boolean masDe30(){
        boolean mayor = false;
        int pos = 0;
        
        while(pos<temperaturaMeses.length && !mayor){
            mayor = temperaturaMeses[pos]>30;
            pos++;
        }
        return(mayor);
    }
    
    // Apartado i:
    // Función que comprueba si se repite alguna tempertatura:
    static boolean tempRepetida(){
        boolean repetida = false;
        
        int i=0;
        
        while(!repetida && i<temperaturaMeses.length-1){
            int j=i+1;
            while(!repetida && j<temperaturaMeses.length){
                repetida = temperaturaMeses[i]==temperaturaMeses[j];
                j++;
            }
            i++;
        }
        
        return(repetida);
    }

}