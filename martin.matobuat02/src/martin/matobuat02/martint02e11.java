/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee un día, un mes y un año y devuelve el día
 * siguiente.
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e11 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int dia, mes, año;
        boolean fecha = true, es_bisiesto=false;
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
                    es_bisiesto = (año%4==0 && año%100!=0) || año%400==0;
                    fecha = dia<=28 || (dia==29 && es_bisiesto);
                    
            }
        }
        else{
            fecha = false;
        }
        
        // Si la fecha es correcta se calcula el día siguiente:
        if (fecha){
            //Se actualiza la fecha:
            int dia_siguiente = dia, mes_siguiente = mes, año_siguiente = año;
            
            switch(mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    // Para enero, marzo, mayo, julio, agosto y octubre, si es 
                    // fin de mes se cambia el día a 1 y se incrementa el mes.
                    if (dia==31){
                        dia_siguiente = 1;
                        mes_siguiente = mes + 1;
                    }
                    // Si no es fin de mes simplemente se incrementa el día.
                    else{
                        dia_siguiente = dia + 1;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    // Para abril, junio, septiembre y noviembre, si es fin de
                    // mes se cambia el día a 1 y se incrementa el mes.
                    if (dia==30){
                        dia_siguiente = 1;
                        mes_siguiente = mes + 1;
                    }
                    // Si no es fin de mes simplemente se incrementa el día.
                    else{
                        dia_siguiente = dia + 1;
                    }
                    break;
                case 12:
                    // Si es fin de año se pone el día a 1, se cambia el mes a
                    // enero y se incrementa el año.
                    if (dia==31){
                        dia_siguiente = 1;
                        mes_siguiente=1;
                        año_siguiente = año + 1;
                    }
                    // Si es diciembre pero no es fin de año simplemente se
                    // incrementa el día en 1.
                    else{
                        dia_siguiente = dia + 1;
                    }
                    break;
                case 2:
                    // Si es el 29 de febrero y es bisiesto (se comprueba 
                    // previamente) se pone el día a 1 y se incrementa el mes.
                    if (dia==29){
                        dia_siguiente = 1;
                        mes_siguiente = mes + 1;
                    }
                    // Si es el 28 de febrero y no es bisiesto (se comprueba
                    // previamente) se pone el día a 1 y se incrementa el mes.
                    else if (dia==28 && !es_bisiesto){
                        dia_siguiente = 1;
                        mes_siguiente = mes + 1;
                    }
                    // Si no es fin de mes simplemente se incrementa el día.
                    else{
                        dia_siguiente = dia + 1;
                    }
                    break;
                default: System.out.println("\nERROR\n");
            }
                
            // Se muestran los resultados:
            System.out.printf("\nEl día siguiente al %d/%d/%d es el %d/%d/%d\n\n",
                                dia,mes,año,dia_siguiente,mes_siguiente,año_siguiente);
            
        }
        else{
            System.out.printf("\n%d/%d/%d no es una fecha correcta\n\n",dia,mes,
                              año);
        }
        
    }
    
}
