/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tiene un Array con las 10 notas de un alumno de 
 * ciclos formativos. Primero se le pedirá al usuario que introduzca valores 
 * para las 10 asignaturas, verificando que los valores estén entre 1 y 10 
 * (si lo introduce mal, deberá introducirlos hasta que lo haga bien). Muestra 
 * la nota máxima, mínima, media, si puede ir a la FCT (todas>=5), y si se 
 * propone para matrícula de honor (todas 9 ó 10).
 */
package martin.matobuat07;
import java.util.Scanner;

public class martint07e02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        int [] notas = new int [10];
        
        int nota_maxima = 1;
        int nota_minima = 10;
        float nota_media=0;
        
        int contador=0;
        while(contador<notas.length){
            int nota;
            do{
                System.out.print("Nota del módulo " + (contador+1) + ": ");
                nota = teclado.nextInt();
            }while(nota<1 || nota>10);
            notas[contador]=nota;
            
            if (nota>nota_maxima){
                nota_maxima=nota;
            }
            if (nota<nota_minima){
                nota_minima=nota;
            }
            contador++;
            nota_media+=nota;
        }
        
        // Comprobamos si puede ir a la FCT:
        int i = 0;
        boolean aptoFCT = true;
        
        while (aptoFCT && i<notas.length){
            aptoFCT = notas[i]>=5;
            i++;
        }
        
        // Comprobamos si se propone para matrícula de honor. Para hacerlo más 
        // eficiente, comprobamos antes si tiene una media de 9 o más con todas
        // las asignaturas aprobadas:
        boolean matricula = false;
        if (aptoFCT && nota_media>=9){
            matricula = true;
            int n = 0;
            while(matricula && n<notas.length){
                matricula = notas[n]>=9;
                n++;
            }
        }
        
        // Resultados:
        System.out.println("-------------------------------------------------");
        System.out.println("Nota máxima: " + nota_maxima);
        System.out.println("Nota mínima: " + nota_minima);
        System.out.printf("Nota media: %.2f\n", nota_media/notas.length);
        if(aptoFCT){
            System.out.println("El alumno puede ir a FCT");
        }
        else{
            System.out.println("El alumno no puede ir a FCT");
        }
        if (matricula){
            System.out.println("Se propone al alumno para matrícula");
        }
        else {
            System.out.println("No se propone al alumno para matrícula");
        }
        System.out.println("-------------------------------------------------");
        
    }
    
}

