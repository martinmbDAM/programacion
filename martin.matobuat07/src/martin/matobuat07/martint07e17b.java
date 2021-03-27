/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva2 generando 1000 boletos 
 * al azar e informa de cuántos boletos hay con 3, 4, 5 y 6 aciertos.
 */
package martin.matobuat07;

public class martint07e17b {

    public static void main(String[] args) {
        
        Primitiva2 p = new Primitiva2();

        final int numGenerar = 1000;

        int[] aciertos = new int[]{0, 0, 0, 0};

        for (int i = 0; i < numGenerar; i++) {

            int num_acertados = p.numAciertos(Primitiva2.generaBoleto());

            switch (num_acertados) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    aciertos[0]++;
                    break;
                case 4:
                    aciertos[1]++;
                    break;
                case 5:
                    aciertos[2]++;
                    break;
                case 6:
                    aciertos[3]++;
                    break;
                default:
                    System.out.println("ERROR");
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Boletos generados al azar: " + numGenerar);
        System.out.println("Boletos con 3 aciertos: " + aciertos[0]);
        System.out.println("Boletos con 4 aciertos: " + aciertos[1]);
        System.out.println("Boletos con 5 aciertos: " + aciertos[2]);
        System.out.println("Boletos con 6 aciertos: " + aciertos[3]);
        System.out.println("---------------------------------------------");
        
    }
    
}
