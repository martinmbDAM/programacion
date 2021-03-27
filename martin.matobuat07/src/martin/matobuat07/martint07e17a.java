/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: Programa que prueba la clase Primitiva2 introduciendo un boleto
 * de 6 números y diga cuántos ha acertado.
 */
package martin.matobuat07;

import java.util.Scanner;
import java.util.ArrayList;

public class martint07e17a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Primitiva2 primitiva = new Primitiva2();
        
        ArrayList<Integer> boleto = new ArrayList<>();

        // Rellenamos el boleto pidiendo los números uno a uno comprobando
        // que estén en rango y que no estén repetidos:
        int i = 0;
        while (boleto.size() < 6) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = teclado.nextInt();

            // Si está en rango y no está repetido, lo insertamos:
            if (num < 50 && num > 0 && !boleto.contains(num)) {
                boleto.add(num);
                i++;
            }

        }
        
        ArrayList<Integer> boletoCorrecto = primitiva.getBoleto();
        
        System.out.println("\n-----------------------------------------------");

        System.out.print("Boleto correcto: ");
        for (int j = 0; j < boletoCorrecto.size(); j++) {
            System.out.print(boletoCorrecto.get(j) + " ");
        }
        System.out.println();

        System.out.println("Números acertados: "
                + primitiva.numAciertos(boleto));

    }

}
