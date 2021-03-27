
package martin.matobuat06;
import java.util.Random;

public class Pistola {
    
    private int bala;
    private int disparos;
    
    Pistola(){
        Random aleatorio = new Random();
        bala = aleatorio.nextInt(6)+1;
        disparos = 0;
    }
    
    void disparo(){
        disparos++;
    }
    
    boolean fin(){
        return(disparos==bala);
    }
    
}