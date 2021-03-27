
package martin.matobuat06;
import java.util.Random;

public class Ruleta {
    
    static int apuesta (int importe, String par_o_impar){
        int apuesta=importe*(-1);
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(37);
        if (resultado!=0 && ((par_o_impar.equals("par") && resultado%2==0) || 
            (par_o_impar.equals("impar") && resultado%2!=0))){
            apuesta = importe;
        }
        return(apuesta);
    }
    
}