/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Partiendo de la función del programa anterior, hacer un programa 
 * al que se le introduzcan dos fechas del mismo año y nos informe de los días 
 * comprendidos entre ellas.
 */
package martin.matobuat05;

import java.util.Scanner;

public class martint05e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (comprobamos que los números estén en rango):
        System.out.print("Año: ");
        int año = teclado.nextInt();
        int mes1, mes2, dia1, dia2;
        do {
            System.out.print("Primera fecha: mes: ");
            mes1 = teclado.nextInt();
            System.out.print("Primera fecha: día: ");
            dia1 = teclado.nextInt();
            System.out.print("Segunda fecha: mes: ");
            mes2 = teclado.nextInt();
            System.out.print("Segunda fecha: día: ");
            dia2 = teclado.nextInt();
        } while ((dia1<=0 || mes1<=0 || mes1>12 || dia1>31 || 
                (dia1==31 && (mes1==4 || mes1==6 || mes1==9 || mes1==11)) || 
                (dia1>29 && mes1==2) || (dia1==29 && mes1==2 && 
                !esBisiesto(año))) || (dia2<=0 || mes2<=0 || mes2>12 || dia2>31  
                || (dia2==31 && (mes2==4 || mes2==6 || mes2==9 || mes2==11)) || 
                (dia2>29 && mes2==2) || (dia2==29 && mes2==2 && 
                !esBisiesto(año))));

        // Comprobamos qué fecha es menor. Si la segunda fecha es menor, las 
        // intercambiamos: 
        if (mes2 < mes1 || (mes1 == mes2 && dia2 < dia1)) {
            int temporal;
            temporal = dia1;
            dia1 = dia2;
            dia2 = temporal;
            temporal = mes1;
            mes1 = mes2;
            mes2 = temporal;
        }

        int sumaDias = 0;

        // Si los meses coinciden, restamos los días.
        if (mes1 == mes2) {
            sumaDias += dia2 - dia1;
        } else {

            // Sumamos los días que faltaban para acabar el primer mes:
            sumaDias += CalcularDiasMes(mes1, año) - dia1 + 1;

            // Sumamos los días de los meses intermedios:
            for (int i = mes1; i <= mes2 - 1; i++) {
                sumaDias += CalcularDiasMes(año, i);
            }

            // Sumamos los días del último mes sin incluir el día actual:
            sumaDias += dia2 - 1;

        }

        // Salida de resultados:
        System.out.println("Días transcurridos entre el " + dia1 + "/" + mes1
                + "/" + año + " y el " + dia2 + "/" + mes2 + "/" + año
                + ":" + sumaDias);

    }

    // Función que permite comprobar si un año es bisiesto:
    static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    private static int CalcularDiasMes(int año, int mes) {
        int dias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = esBisiesto(año) ? 29 : 28;
                break;
        }
        return (dias);
    }

}
