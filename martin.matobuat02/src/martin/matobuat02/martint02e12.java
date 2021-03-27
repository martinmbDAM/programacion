/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee dos fechas y comprueba cuál es mayor, 
 * suponiendo que ambas fechas son correctas. Suponemos que las fechas 
 * introducidas son válidas.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e12 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int dia1, mes1, año1, dia2, mes2, año2;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer día: ");
        dia1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Primer mes: ");
        mes1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Primer año: ");
        año1 = Integer.parseInt(teclado.nextLine());
        System.out.print("\nSegundo día: ");
        dia2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo mes: ");
        mes2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo año: ");
        año2 = Integer.parseInt(teclado.nextLine());
        
        // Se comprueba qué fecha es mayor:
        if (año1>año2 || (año1==año2 && mes1>mes2) || (año1==año2 && mes1==mes2 
            && dia1>dia2)){
            System.out.printf("\n%d/%d/%d es mayor que %d/%d/%d\n\n",dia1,mes1,
                              año1,dia2,mes2,año2);
        }
        else if (año1<año2 || (año1==año2 && mes1<mes2) || (año1==año2 && 
                 mes1==mes2 && dia1<dia2)){
            System.out.printf("\n%d/%d/%d es mayor que %d/%d/%d\n\n",dia2,mes2,
                              año2,dia1,mes1,año1);
        }
        else{
            System.out.printf("\n%d/%d/%d es la misma fecha que %d/%d/%d\n\n",
                              dia2,mes2,año2,dia1,mes1,año1);
        }
        
    }
    
}
