/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva3 generando boletos hasta
 * que se acierten los 6 números e informe del número de boletos que ha tenido
 * que crear.
 */
package martin.matobuat07;

public class martint07e26c {

    public static void main(String[] args) {

        Primitiva3 p = new Primitiva3();
        int[] boleto;
        
        long boletos=0;
        
        do{
            boleto = Primitiva.generaBoleto();
            boletos++;
            
        }while(p.numAciertos(boleto)!=6);
        
        System.out.println("Boletos generados: " + boletos);

    }

}
