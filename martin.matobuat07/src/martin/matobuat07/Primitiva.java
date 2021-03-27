package martin.matobuat07;

import java.util.Random;

public class Primitiva {

    private int[] numeros;
    static private final int CIFRAS=6;

    // Constructor:
    Primitiva() {
        numeros = new int[CIFRAS];
        numeros = Primitiva.generaBoleto();
    }

    // Método que recibe un boleto de la primitiva y devuelve el número de 
    // aciertos:
    int numAciertos(int[] boleto) {
        int aciertos = 0;
        if (numeros.length == boleto.length) {
            int i=0,j=0;
            while(i<numeros.length){
                boolean encontrado=false;
                while(!encontrado&&j<boleto.length){
                    encontrado=boleto[i]==numeros[j];
                    j++;
                }
                if(encontrado){
                    aciertos++;
                }
                i++;
                j=0;
            }
        }
        return (aciertos);
    }

    // Método para generar un boleto al azar sin repetidos:
    static int [] generaBoleto(){
        int [] boleto = new int[CIFRAS];
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < CIFRAS; i++) {
            
            // Generamos números aleatorios hasta conseguir uno que no esté 
            // repetido y lo insertamos:
            int num;
            boolean repetido;
            do{
                num = aleatorio.nextInt(49) + 1;
                repetido=false;
                int j=0;
                while(j<i && !repetido){
                    repetido = num==boleto[j];
                    j++;
                }
            }while(repetido);
            boleto[i] = num;
        }
        
        return(boleto);
    }
    
    // Método para leer el boleto:
    int[] getBoleto(){
        return(numeros);
    }

}
