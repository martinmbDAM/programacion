/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva generando boletos hasta
 * que se acierten los 6 números e informe del número de boletos que ha tenido
 * que crear.
 */
package martin.matobuat07;

public class martint07e05c {

    public static void main(String[] args) {

        Primitiva p = new Primitiva();
        int[] boleto;
        
        long boletos=0;
        
        do{
            boleto = Primitiva.generaBoleto();
            boletos++;
        }while(p.numAciertos(boleto)!=6);
        
        System.out.println("Boletos generados: " + boletos);

    }

}
