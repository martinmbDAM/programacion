
package oca;
import java.util.Random;

/**
 * Clase que imita el funcionamiento de un dado
 * 
 * @author Martín Mato Búa
 * @version 1.0
 * @since 19-03-2021
 */
public class Dado {
    
    /**
     * Permite lanzar el dado
     * 
     * @return Un número aleatorio del 1 al 6
     */
    public int lanzarDado(){
        
        Random aleatorio = new Random();
        
        return(aleatorio.nextInt(5)+1);
    }
    
}
