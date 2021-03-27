package tamagotchi;
import java.util.ArrayList;

import java.util.Scanner;

public class juego {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre del Tamagotchi: ");
        String nombre = teclado.nextLine();

        Tamagotchi mascota = new Tamagotchi(nombre);

        while (!mascota.juegoTerminado()) {
            int respuesta;
            System.out.println("\n");
            System.out.println("---------------------------------------------");
            do {
                System.out.println("Escoja una opción: ");
                System.out.println("1 -> Ver Estado");
                System.out.println("2 -> Comer");
                System.out.println("3 -> Dormir");
                System.out.println("4 -> Dar medicina");
                System.out.print("Opción escogida: ");
                respuesta = teclado.nextInt();
            } while (respuesta < 1 || respuesta > 4);
            
            switch(respuesta){
                case 1 : 
                    ArrayList<String> estado = mascota.getEstado();
                    System.out.println("Estado de " + mascota.getNombre() +":");
                    for (int i = 0; i < estado.size(); i++) {
                        System.out.println(estado.get(i));
                    }
                    break;
                case 2 : 
                    if(mascota.comer()){
                        System.out.println(mascota.getNombre() + " ha comido");
                        mascota.puedeEnfermar();
                    }
                    else{
                        System.out.println(mascota.getNombre() + " no ha podido"
                                + " comer");
                    }
                    break;
                case 3 : 
                    if(mascota.dormir()){
                        System.out.println(mascota.getNombre() + " se ha puesto "
                                + "a dormir");
                        mascota.puedeEnfermar();
                    }
                    else{
                        System.out.println(mascota.getNombre() + " no ha podido"
                                + " ponerse a dormir");
                    }
                    break;
                case 4 : 
                    if(mascota.darMedicina()){
                        System.out.println(mascota.getNombre() + " ha recibido "
                                + "la medicina");
                    }
                    else{
                        System.out.println(mascota.getNombre() + " no ha podido"
                                + " recibir la medicina");
                    }
                    break;
                                        
            }
            System.out.println("---------------------------------------------");
            System.out.println("\n");
            mascota.actualizar();
        }

    }

}
