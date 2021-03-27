/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 23 de Octubre de 2020
 * Descripción: Programa que lee tres números enteros. Si todos son negativos 
 * realiza el producto de los tres. Si alguno es negativo, pero no todos,
 * realiza la suma de los tres. Si todos son positivos, suma los dos primeros y
 * multiplica el resultado por el tercero. Se considera el cero un número
 * positivo. 
 */
package martin.matobuat02;
import java.util.Scanner;

public class martint02e03 {

    public static void main(String[] args) {
       
        // Declaración de variables:
        int num1,num2,num3;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos:
        System.out.print("\nPrimer entero: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Segundo entero: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Tercer entero: ");
        num3 = Integer.parseInt(teclado.nextLine());
        
        // Salida de resultados:
        
        // Caso 1: Todos negativos
        if (num1<0 && num2<0 && num3<0){
            int producto = num1*num2*num3;
            System.out.printf("\nTodos negativos: (%d)x(%d)x(%d) = %d\n\n",num1,
                              num2,num3,producto);
        }
        // Caso 2: Todos positivos
        else if (num1>0 && num2>0 && num3>0){
            int suma_y_producto = (num1+num2)*num3;
            System.out.printf("\nTodos positivos: (%d+%d)x%d = %d\n\n",num1,num2,
                              num3,suma_y_producto);
        }
        //Caso 3: Hay positivos y negativos
        else{
            int suma = num1+num2+num3;
            System.out.printf("\nHay positivos y negativos: la suma de %d, %d y"
                            + " %d es %d\n\n",num1,num2,num3,suma);
        }
        // No es necesario añadir nuevos casos porque el caso 3 abarca todas las
        // combinaciones posibles (1 positivo y 2 negativos ó 2 positivos y un
        // negativo.
    }
    
}
