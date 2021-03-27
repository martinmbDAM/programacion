/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 31 de Enero de 2021
 * Descripción: Hacer una función llamada CalcularDiasMes que se le pase como 
 * parámetro un año y un mes y devuelva los días que tiene ese mes, teniendo en 
 * cuenta los años bisiestos. A continuación, realizar un programa al que se le 
 * introduzca una fecha y nos informe de los días pasados desde el 1 de enero de 
 * ese año. 
 */
package martin.matobuat05;

import java.util.Scanner;

public class martint05e03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de datos (comprobamos que los números estén en rango):
        int dia, mes, año;
        do {
            System.out.print("\nDía: ");
            dia = teclado.nextInt();
            System.out.print("Mes: ");
            mes = teclado.nextInt();
            System.out.print("Año: ");
            año = teclado.nextInt();

        } while (dia<=0 || mes<=0 || mes>12 || dia>31 || 
                (dia==31 && (mes==4 || mes==6 || mes==9 || mes==11)) || 
                (dia>29 && mes==2) || (dia==29 && mes==2 && !esBisiesto(año)));

        int sumaDias = 0;

        // Sumamos los días de los meses anteriores al actual:
        for (int i = 1; i < mes; i++) {
            sumaDias += CalcularDiasMes(año, i);
        }

        // Sumamos los días del mes actual menos 1 (no incluimos el día actual
        // en los días transcurridos):
        sumaDias += dia-1;

        // Salida de resultados: 
        System.out.println("Días transcurridos entre el 1/1/" + año + " y el "
                + dia + "/" + mes + "/" + año + ":" + sumaDias);

    }

    // Función que permite comprobar si un año es bisiesto:
    static boolean esBisiesto(int año){
        return(año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }
    
    // Función que calcula los días que tiene un mes de un año concreto:
    static int CalcularDiasMes(int año, int mes) {
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
