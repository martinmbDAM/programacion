/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 19 de Febrero de 2021
 * Descripción: Programa que prueba la clase Ruleta.
 */
package martin.matobuat06;

public class martint06e14 {

    public static void main(String[] args) {

        int importe = 10000;

        System.out.println("Importe inicial: " + importe + "€");

        // Apostamos 1€ 10.000 veces:
        for (int i = 0; i < 10000; i++) {
            importe += Ruleta.apuesta(1, "par");
        }
        
        System.out.println("Importe final: " + importe + "€");

        // Después de apostar 10.000 veces queda claro que en la inmensa mayoría
        // de las veces gana la banca.
    }

}
