
package martin.matobuat07;
import java.time.LocalDateTime;
import java.time.temporal.*;

public class Parking2 {
    
    private final String[][] vehiculos;
    private int ocupadas;
    private final double precioMinuto;
    private double recaudado;
    private final double maximo;
    
    Parking2(int capacidad){
        vehiculos = new String[2][capacidad];
        ocupadas=0;
        precioMinuto = 0.02;
        recaudado = 0;
        maximo = 10;
    }
    
    // Método que muestra el estado del parking:
    String[][] plazasOcupadas(){
        
        String[][] plazas_ocupadas = new String[2][ocupadas];
        
        for (int i = 0; i < ocupadas; i++) {
            plazas_ocupadas[0][i] = vehiculos[0][i];
            plazas_ocupadas[1][i] = vehiculos[1][i];
        }
        
        return(plazas_ocupadas);        
    }
    
    // Método que permite aparcar. Devuelve el número de plaza si se ha podido
    // aparcar o 0 si está lleno:
    int aparcar(String coche){
        int plaza = 0;
        
        if(ocupadas != vehiculos[0].length){
            vehiculos[0][ocupadas] = coche;
            vehiculos[1][ocupadas] = LocalDateTime.now().toString();
            ocupadas++;
            plaza=ocupadas;
        }
        
        return(plaza);
    }
    
    // Método para sacar un coche del parking:
    String[] desaparcar(){
        String[] coche = {"","0"};
        
        if (ocupadas>0){
            coche[0] = vehiculos[0][ocupadas-1];
                       
            // Cálculo del importe:
            double importe_coche = (LocalDateTime.parse(vehiculos[1][ocupadas-1]).
                    until(LocalDateTime.now(),ChronoUnit.MINUTES))*precioMinuto;
            
            if (importe_coche > maximo){
                importe_coche = maximo;
            }
            
            this.recaudado +=importe_coche;
            
            coche[1] = Double.toString(importe_coche);
            
             ocupadas--;
        }
        
        return(coche);
    }
    
    // Método para mostrar la recaudación actual:
    double getRecaudacion(){
        return(recaudado);
    }
}
