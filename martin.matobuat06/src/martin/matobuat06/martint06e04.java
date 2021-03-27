/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase CuentaCorriente en el que se crea 
 * una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un 
 * menú le permite al usuario hacer operaciones como ingresar, retirar y
 * consultar saldo en la cuenta. Se añade una nueva operación: cambiar cuenta
 * corriente.
 */
package martin.matobuat06;

import java.util.Scanner;

public class martint06e04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String iban1, iban2;
        boolean todos_digitos=false;

        do {
            System.out.print("IBAN de la primera cuenta: ");
            iban1 = teclado.nextLine();
            
            if (iban1.length() == 24 && Character.isLetter(iban1.charAt(0)) &&  
                Character.isLetter(iban1.charAt(1))) {
                
                todos_digitos=true;
                // Comprobamos que los demás caracteres sean dígitos:
                int contador = 2;
                while (todos_digitos && contador < iban1.length()) {
                    todos_digitos = Character.isDigit(iban1.charAt(contador));
                    contador++;                todos_digitos=true;
                }
            }

        } while (!todos_digitos);
        do {
            System.out.print("IBAN de la segunda cuenta: ");
            iban2 = teclado.nextLine();
            
            if (iban2.length() == 24 && Character.isLetter(iban2.charAt(0)) &&  
                Character.isLetter(iban2.charAt(1))) {
                
                todos_digitos=true;
                // Comprobamos que los demás caracteres sean dígitos:
                int contador = 2;
                while (todos_digitos && contador < iban2.length()) {
                    todos_digitos = Character.isDigit(iban2.charAt(contador));
                    contador++;
                }
            }

        } while (!todos_digitos);
        
        // Creación de las cuentas:
        CuentaCorriente cuenta1 = new CuentaCorriente(iban1);
        CuentaCorriente cuenta2 = new CuentaCorriente(iban2);
        
        // Entrada de los datos de las comisiones:
        float porc_comision, min_comision;
        System.out.print("Porcentaje de comisión de la primera cuenta: ");
        porc_comision = teclado.nextFloat();
        System.out.print("Comisión mínima de la primera cuenta: ");
        min_comision = teclado.nextFloat();
        cuenta1.setComision(porc_comision,min_comision);
        
        System.out.print("Porcentaje de comisión de la segunda cuenta: ");
        porc_comision = teclado.nextFloat();
        System.out.print("Comisión mínima de la segunda cuenta: ");
        min_comision = teclado.nextFloat();
        cuenta2.setComision(porc_comision,min_comision);
        
        // Preguntamos al usuario a qué cuenta quiere acceder:
        int cuenta;
        do{
            System.out.println("¿A qué cuenta desea acceder? Introduzca número");
            System.out.println("1 -> " + iban1);
            System.out.println("2 -> " + iban2);
            System.out.print("Opción escogida: ");
            cuenta = teclado.nextInt();
        }while(cuenta!=1 && cuenta!=2);
        
        CuentaCorriente cuentaActiva;
        
        if (cuenta==1){
            cuentaActiva = cuenta1;
        }
        else{
            cuentaActiva = cuenta2;
        }

        // Se permite al usuario realizar operaciones en la cuenta:
        int respuesta;
        String [] argumentos = {"Ingresar dinero","Retirar dinero",
                                "Consultar saldo","Cambiar cuenta corriente",
                                "Salir"};
        do {
            System.out.print("\n\nIBAN: " + cuentaActiva.IBAN);
            respuesta = Menu.menu(argumentos);            
            if (respuesta != 5){
                switch(respuesta){
                    case 1:
                            float importe_ingresar;
                            do{
                                System.out.print("Importe a ingresar: ");
                                importe_ingresar = teclado.nextFloat();
                            }while(importe_ingresar<=0);
                            cuentaActiva.ingresar(importe_ingresar);
                            break;
                    case 2: 
                            float importe_retirar;
                            do{
                                System.out.print("Importe a retirar: ");
                                importe_retirar = teclado.nextFloat();
                            }while(importe_retirar<=0);
                            if(cuentaActiva.retirar(importe_retirar)){
                                System.out.println("Importe retirado con "
                                        + "éxito");
                            }
                            else{
                                System.out.println("No se ha podido efectuar la"
                                    + " retirada");
                            }
                            break;
                    case 3:
                            System.out.println("Saldo: " + 
                                    cuentaActiva.getSaldo());
                            break;
                    case 4: 
                            if(cuentaActiva==cuenta1){
                                cuentaActiva=cuenta2;
                            }
                            else{
                                cuentaActiva=cuenta1;
                            }
                            break;
                }
            }
            
        } while (respuesta != 5);
        
    }
    
}