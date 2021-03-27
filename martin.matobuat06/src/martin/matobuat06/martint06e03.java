/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase CuentaCorriente en el que se crea 
 * una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un 
 * menú le permite al usuario hacer operaciones como ingresar, retirar y
 * consultar saldo en la cuenta.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cadena;
        boolean todos_digitos=false;
        
        // Entrada de datos:
        do {
            System.out.print("IBAN: ");
            cadena = teclado.nextLine();
            
            if (cadena.length() == 24 && Character.isLetter(cadena.charAt(0)) &&  
                Character.isLetter(cadena.charAt(1))) {
                
                todos_digitos=true;
                // Comprobamos que los demás caracteres sean dígitos:
                int contador = 2;
                while (todos_digitos && contador < cadena.length()) {
                    todos_digitos = Character.isDigit(cadena.charAt(contador));
                    contador++;
                }
            }

        } while (!todos_digitos);
        
        // Creación de la cuenta:
        CuentaCorriente cuenta = new CuentaCorriente(cadena);
        
        // Entrada de los datos de las comisiones:
        float porc_comision, min_comision;
        System.out.print("Porcentaje de comisión: ");
        porc_comision = teclado.nextFloat();
        System.out.print("Comisión mínima: ");
        min_comision = teclado.nextFloat();
        
        CuentaCorriente.setComision(porc_comision,min_comision);
        
        // Se permite al usuario realizar operaciones en la cuenta:
        int respuesta;
        String [] argumentos = {"Ingresar dinero","Retirar dinero",
                                "Consultar saldo","Salir"};
        do {
            
            respuesta = Menu.menu(argumentos);
            
            if (respuesta != 4){
                switch(respuesta){
                    case 1:
                            float importe_ingresar;
                            do{
                                System.out.print("Importe a ingresar: ");
                                importe_ingresar = teclado.nextFloat();
                            }while(importe_ingresar<=0);
                            cuenta.ingresar(importe_ingresar);
                            break;
                    case 2: 
                            float importe_retirar;
                            do{
                                System.out.print("Importe a retirar: ");
                                importe_retirar = teclado.nextFloat();
                            }while(importe_retirar<=0);
                            if(cuenta.retirar(importe_retirar)){
                                System.out.println("Importe retirado con "
                                        + "éxito");
                            }
                            else{
                                System.out.println("No se ha podido efectuar la"
                                    + " retirada");
                            }
                            break;
                    case 3:
                            System.out.println("Saldo: " + cuenta.getSaldo());
                            break;
                }
            }
            
        } while (respuesta != 4);

    }

}
