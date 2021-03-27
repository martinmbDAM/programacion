package martin.matobuat06;

import java.util.Scanner;

public class Menu {
    
    static Scanner teclado;
    
    public static int menu(String[] args) {
        
        teclado = new Scanner(System.in);
        int opcion;
        do {
           opcion=pintarMenu (args);
           if(opcion>args.length){
               System.out.println("Opción incorrecta");
           }
           
        } while (opcion>args.length || opcion<=0);
        return(opcion);
    } 
    
   private static int pintarMenu (String [] args){
      System.out.println("\n");  
      System.out.println("Elija una opción:");  
       for (int i = 0; i < args.length; i++) {
           System.out.println((i+1) + " -> " + args[i]);
       }
       System.out.print("Opción escogida: ");
      try {                  //si introduce un valor no entero haría return 999
        return Integer.parseInt (teclado.nextLine());
      } catch (Exception e ) {return 999;}
   }

    
}