/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase MovilPrepago. En primer lugar crea
 * un teléfono con unas características determinadas y a continuación ejecuta
 * una serie de actividades, como recargar 10 euros, llamar 30 segundos, 
 * navegar 10 MB, etc. viendo cómo se va modificando el saldo.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaración de variables:
        float establecerLlamada, costeMinuto, consumoMB;
        int saldo_inicial=0;
        long telefono;
        String cadena;

        // Entrada de variables comprobando que los valores sean válidos:        
        System.out.println("\nCaracterísticas de la tarifa:");
        System.out.println("---------------------------------");
        do {
            System.out.print("Coste de establecer llamada: ");
            establecerLlamada = teclado.nextFloat();
        } while (establecerLlamada < 0);
        do {
            System.out.print("Coste por minuto: ");
            costeMinuto = teclado.nextFloat();
        } while (costeMinuto < 0);
        do {
            System.out.print("Coste de navegación: ");
            consumoMB = teclado.nextFloat();
        } while (consumoMB < 0);
        System.out.println("---------------------------------");
        teclado.nextLine();
        boolean todos_digitos = true;
        do {
            System.out.print("Número de teléfono: ");
            cadena = teclado.nextLine();
            
            // Comprobamos que todos los caracteres sean dígitos:
            if (cadena.length() == 13) {
                int contador = 0;
                while (todos_digitos && contador < cadena.length()) {
                    todos_digitos = Character.isDigit(cadena.charAt(contador));
                    contador++;
                }
            }

        } while (cadena.length() != 13 && todos_digitos);
        
        telefono = Long.parseLong(cadena);
        
        System.out.println("---------------------------------");
        
        // Creación de un objeto de la clase MovilPrepago con el saldo a 0:
        MovilPrepago movil = new MovilPrepago(telefono,establecerLlamada,
                             costeMinuto,consumoMB,saldo_inicial);
        
        // Primera recarga: 
        do{
            System.out.print("Primera recarga: ");
            saldo_inicial = teclado.nextInt();
        }while (saldo_inicial<0 || !movil.recargar(saldo_inicial));
        
        System.out.println("---------------------------------");
        
        // Modificaciones comprobando cómo se va modificando el saldo: 
        
        System.out.printf("Saldo inicial: %.2f\n", movil.consultarSaldo());
        
        // Recargar 10 euros:
        System.out.println("---------------------------------");
        movil.recargar(10);
        System.out.printf("Saldo después de recargar 10 euros: %.2f\n",
                           movil.consultarSaldo());
        
        // Llamar 30 segundos:
        System.out.println("---------------------------------");
        movil.efectuarLlamada(30);
        System.out.printf("Saldo después de llamar 30 segundos: %.2f\n",
                           movil.consultarSaldo());
        
        // Navegar 10MB:
        System.out.println("---------------------------------");
        movil.navegar(10);
        System.out.printf("Saldo después de navegar 10 MB: %.2f\n",
                           movil.consultarSaldo());
    }
}