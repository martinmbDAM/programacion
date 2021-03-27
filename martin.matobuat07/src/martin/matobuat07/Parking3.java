package martin.matobuat07;

import java.time.LocalDateTime;
import java.time.temporal.*;
import java.util.ArrayList;

public class Parking3 {

    private final ArrayList<ArrayList<String>> coches;
    private final double precioMinuto;
    private double recaudado;
    private final int CAPACIDAD;

    Parking3(int capacidad, double precio) {
        coches = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            coches.add(new ArrayList<>());
        }
        
        precioMinuto = precio;
        recaudado = 0;
        CAPACIDAD = capacidad;
    }

    // Método que muestra el estado del parking:
    void plazasOcupadas() {

        System.out.println("Plazas ocupadas: ");

        if (coches.get(0).isEmpty()) {
            System.out.println("No hay plazas ocupadas");
        } else {
            System.out.println("---------------------------------------------");
            for (int i = 0; i < coches.get(0).size(); i++) {
                System.out.println("Plaza " + (i + 1) + ": "
                        + coches.get(0).get(i) + " - " + coches.get(1).get(i));
            }
            System.out.println("\n-------------------------------------------");
        }
    }

    // Método que permite aparcar. Devuelve el número de plaza si se ha podido
    // aparcar o 0 si está lleno:
    int aparcar(String matricula) {
        int plaza=0;
        
        if(coches.get(0).size()<CAPACIDAD){
            String fecha = LocalDateTime.now().toString();
            coches.get(0).add(matricula);
            coches.get(1).add(fecha);
            plaza = coches.get(0).size();
        }
        
        return (plaza);
    }

    // Método para sacar un coche del parking:
    Double desaparcar() {
        
        double importe = -1;
        
        if(coches.get(0).size()>0){
            
            
            importe = LocalDateTime.parse(coches.get(1).
                      get(coches.get(1).size()-1)).until(LocalDateTime.now(),
                      ChronoUnit.MINUTES)*precioMinuto;
            
            // Eliminamos el coche:
            coches.get(0).remove(coches.get(0).size()-1);
            coches.get(1).remove(coches.get(1).size()-1);
            
        }
        
        if(importe != -1){
            recaudado += importe;
        }        
        
        return (importe);
    }

    // Método para mostrar la recaudación actual:
    double recaudacion() {
        return (recaudado);
    }
}
