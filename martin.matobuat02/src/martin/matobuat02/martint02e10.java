/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un día, un mes y un año y comprueba si la fecha
 * es correcta.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e10 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int dia, mes, año;
        boolean fecha = true; // Si fecha=true la fecha es correcta
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nDía: ");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.print("Mes: ");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.print("Año: ");
        año = Integer.parseInt(teclado.nextLine());
        
        //Se comprueba si la fecha es correcta. 
        
        // Se comprueba que el mes y el día sean valores válidos:
        if (1<=mes && mes<=12 && 1<=dia){
            
            //Se comprueba que el día sea correcto:
            switch(mes){
                case 1 : 
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 : if(dia<=31) fecha=true; break;
                case 4 :
                case 6 :
                case 9 :
                case 11 : if(dia<=30) fecha=true; break;
                case 2 :
                    // Hay que comprobar si el año es bisiesto:
                    fecha = dia<=28 || (dia==29 && ((año%4==0 && año%100!=0) || 
                            año%400==0));
                    
            }
        }
        else{
            fecha = false;
        }
        
        // Salida de resultados:
        if (fecha){
            System.out.printf("\n%d-%d-%d es una fecha correcta\n\n",dia,mes,año);
        }
        else{
            System.out.printf("\n%d-%d-%d no es una fecha correcta\n\n",dia,mes,año);
        }
        
    }
    
}
