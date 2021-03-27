/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 13 de Noviembre de 2020
 * Descripción: Programa que muestra por pantalla las tablas de multiplicar del
 * 1 al 9.
 */
package martin.matobuat03;

public class martint03e18 {

    public static void main(String[] args) {
        
        for (int i=1;i<=9;i++){
            System.out.printf("\nTabla del %d:",i);
            System.out.println("\n-----------");
            for (int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
    
}
