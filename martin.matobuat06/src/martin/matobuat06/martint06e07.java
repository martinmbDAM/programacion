/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase Círculo.
 */
package martin.matobuat06;
import java.util.Scanner;

public class martint06e07 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Primer círculo (se crea con el constructor sin parámetro):
        Circulo c1 = new Circulo();
        
        // Se pide al usuario que introduzca los radios:
        float radio;
        do{
            System.out.print("Radio del primer círculo: ");
            radio = teclado.nextFloat();
        }while (radio<=0);
        
        c1.setRadio(radio);
        
        // Segundo círculo (se crea con el constructor con parámetro):
        do{
            System.out.print("Radio del segundo círculo: ");
            radio = teclado.nextFloat();
        }while (radio<=0);
        
        Circulo c2 = new Circulo(radio);
        
        // Operaciones sobre los círculos: 
        System.out.println("\n-----------------------------------------------");
        System.out.println("Círculo 1");
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Diámetro: " + c1.calcularDiametro());
        System.out.println("Circunferencia: " + c1.calcularCircunferencia());
        System.out.println("Superficie: " + c1.calcularSuperficie());
        System.out.println("\n-----------------------------------------------");
        System.out.println("Círculo 2");
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Diámetro: " + c2.calcularDiametro());
        System.out.println("Circunferencia: " + c2.calcularCircunferencia());
        System.out.println("Superficie: " + c2.calcularSuperficie());
    }
    
}
