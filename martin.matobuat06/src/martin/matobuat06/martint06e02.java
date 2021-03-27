/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase MovilPrepago.  El usuario da de 
 * alta un teléfono con unas características determinadas y luego le permite
 * mediante un menú hacer operaciones como consultar saldo, recarga, hacer 
 * llamada, navegar. 
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e02 {

    public static void main(String[] args) {

        int respuesta;
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables:
        float establecerLlamada, costeMinuto, consumoMB;
        int saldo_inicial=0;
        long telefono;
        String cadena;
        boolean todos_digitos = true;

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
        
        // Argumentos del menu:
        String [] argumentos = {"Efectuar llamada","Navegar","Recargar",
                                "Consultar Saldo","Salir"};
        do {
            
            respuesta = Menu.menu(argumentos);
            
            if (respuesta!=5){
                switch(respuesta){
                    case 1:
                            int duracion;
                            do{
                                System.out.print("Duración de la llamada: ");
                                duracion = teclado.nextInt();
                            }while(duracion<=0);
                            movil.efectuarLlamada(duracion);
                            break;
                    case 2: 
                            int mb;
                            do{
                                System.out.print("MB: ");
                                mb = teclado.nextInt();
                            }while(mb<=0);
                            movil.navegar(mb);
                            break;
                    case 3:
                            int importe;
                            do{
                                System.out.print("Importe de la recarga: ");
                                importe = teclado.nextInt();
                            }while(importe<=0);
                            if (movil.recargar(importe)){
                                System.out.println("Recarga realizada con "
                                        + "éxito");
                            }
                            else{
                                System.out.println("No se ha podido efectuar"
                                        + " la recarga");
                            }
                            break;
                    case 4:
                            System.out.printf("Saldo: %.2f\n",
                                              movil.consultarSaldo());   
                            break;
                }
            }
            
        } while (respuesta!=5);

    }
}
