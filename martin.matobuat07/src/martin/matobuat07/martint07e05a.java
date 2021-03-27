/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva introduciendo un boleto
 * de 6 números y diga cuántos ha acertado.
 */
package martin.matobuat07;
import java.util.Scanner;

public class martint07e05a {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Primitiva primitiva = new Primitiva();
        
        int[] boleto = new int[6];
        
        // Rellenamos el boleto pidiendo los números uno a uno comprobando
        // que estén en rango y que no estén repetidos:
        int i=0,j=0;    // Punteros
        while(i<boleto.length){
            System.out.print("Número " + (i+1) + ": ");
            int num = teclado.nextInt();
            
            // Comprobamos que esté en rango:
            if (num<50 && num>0){
                
                // Comprobamos que no esté repetido:
                boolean repetido = false;
                while(!repetido && j<i){
                    repetido = num == boleto[j];
                    j++;
                }
                // Si no está repetido lo insertamos:
                if (!repetido){
                    boleto[i]=num;
                    i++;
                }
                j=0;
            }
            
        }
        
        int[] boletoCorrecto = primitiva.getBoleto();
        
        System.out.println("\n-----------------------------------------------");
        
        System.out.print("Boleto correcto: ");
        for(int n : boletoCorrecto){
            System.out.print(n + " ");
        }
        System.out.println("\nNúmeros acertados: " + 
                           primitiva.numAciertos(boleto));
        
    }
    
}
