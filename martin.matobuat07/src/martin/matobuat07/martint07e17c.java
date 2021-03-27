/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva2 generando boletos hasta
 * que se acierten los 6 números e informe del número de boletos que ha tenido
 * que crear.
 */
package martin.matobuat07;
import java.util.ArrayList;

public class martint07e17c {

    public static void main(String[] args) {
        
        Primitiva2 p = new Primitiva2();
        ArrayList<Integer> boleto;
        
        long boletos=0;
        do{
            boleto = Primitiva2.generaBoleto();
            boletos++;
        }while(p.numAciertos(boleto)!=6);
                
        System.out.println("Boletos generados: " + boletos);
        
    }
    
}
