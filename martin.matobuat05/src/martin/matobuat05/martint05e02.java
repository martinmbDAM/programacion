/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Programa que presenta un menú y permite calcular repetidas veces
 * a) el área de un círculo
 * b) el área de un cuadrado
 * c) el área de un triángulo 
 * d) Salir. 
 */
package martin.matobuat05;

import java.util.Scanner;

public class martint05e02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int respuesta;
        double area;

        do {
            do {
                System.out.println("\nEscoja una opción: ");
                System.out.println("Área de un círculo------->1");
                System.out.println("Área de un cuadrado------>2");
                System.out.println("Área de un triángulo----->3");
                System.out.println("Salir-------------------->4");
                System.out.print("Opción elegida: ");
                respuesta = teclado.nextInt();
            } while (respuesta < 1 || respuesta > 4);

            switch (respuesta) {
                case 1:

                    System.out.print("\nRadio del círculo: ");
                    double r = teclado.nextDouble();
                    area = areaCirculo(r);
                    System.out.println("Área del círculo de radio " + r + ": "
                            + area);
                    break;

                case 2:

                    System.out.print("\nLado del cuadrado: ");
                    double l = teclado.nextDouble();
                    area = areaCuadrado(l);
                    System.out.println("Área del cuadrado de lado " + l + ": "
                            + area);
                    break;

                case 3:

                    System.out.print("\nBase del triángulo: ");
                    double b = teclado.nextDouble();
                    System.out.print("\nAltura del triángulo: ");
                    double h = teclado.nextDouble();
                    area = areaTriangulo(b, h);
                    System.out.println("Área del triángulo de base " + b + ": "
                            + " y altura " + h + ": " + area);
                    break;

            }
        } while (respuesta != 4);

    }

    // Función que permite calcular el área de un círculo a partir de su radio:
    static double areaCirculo(double radio) {
        return (3.141592 * radio * radio);
    }

    // Función que permite calcular el área de un cuadrado a partir de su lado:
    static double areaCuadrado(double lado) {
        return (lado * lado);
    }

    // Función que permite calcular el área de un triángulo a partir de su
    // base y altura: 
    static double areaTriangulo(double base, double altura) {
        return (base * altura * 0.5);
    }

}
