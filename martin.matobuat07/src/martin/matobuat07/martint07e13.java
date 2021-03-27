/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 25 de marzo de 2021
 * Descripción: Programa que tenga un Array con una agenda de teléfonos simple 
 * con unos valores cualquiera. Al programa se le pasará como parámetros un 
 * nombre. Si el nombre está en la agenda, mostrará su teléfono, y en caso 
 * contrario informará que no existe dicha persona. 
 */
package martin.matobuat07;

public class martint07e13 {

    public static void main(String[] args) {
        
        String[][]agenda = new String[4][2];
        
        agenda[0][0]="Marcos";
        agenda[0][1]="653214786";
        agenda[1][0]="Andrea";
        agenda[1][1]="158763249";
        agenda[2][0]="Pablo";
        agenda[2][1]="345789621";
        agenda[3][0]="Olga";
        agenda[3][1]="134762589";
                
        if(args.length==1){
            
            // Recorremos el Array buscando el nombre, y si lo encontramos,
            // mostramos el número:
            boolean encontrado=false;
            int i=0;
            
            while(i<agenda.length && !encontrado){
                encontrado = args[0].equals(agenda[i][0]);
                if(!encontrado){
                    i++;
                }
            }
            
            if(encontrado){
                System.out.println("Teléfono de " + agenda[i][0] + ": " + 
                        agenda[i][1]);
            }
            else{
                System.out.println(args[0] + " no está en la agenda");
            }
            
        }
        
        
    }
    
}
