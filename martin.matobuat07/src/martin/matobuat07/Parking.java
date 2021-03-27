
package martin.matobuat07;

public class Parking {
    
    private final String[] matriculas;
    private int ocupadas;
    
    // Constructor:
    Parking(int capacidad){
        matriculas = new String[capacidad];
        ocupadas=0;
    }
    
    // Método que muestra el estado del parking:
    String[] plazasOcupadas(){
        
        String[] plazas_ocupadas = new String[ocupadas];
        
        System.arraycopy(matriculas, 0, plazas_ocupadas, 0, ocupadas);
        
        return(plazas_ocupadas);        
    }
    
    // Método que permite aparcar. Devuelve el número de plaza si se ha podido
    // aparcar o 0 si está lleno:
    int aparcar(String coche){
        int plaza = 0;
        
        if(ocupadas != matriculas.length){
            matriculas[ocupadas] = coche;
            ocupadas++;
            plaza=ocupadas;
        }
        
        return(plaza);
    }
    
    // Método para sacar un coche del parking:
    String desaparcar(){
        String coche = "";
        
        if (ocupadas>0){
            coche = matriculas[ocupadas-1];
            ocupadas--;
        }
        
        return(coche);
    }
    
    // Método para mostrar la cantidad de plazas libres:
    int plazasLibres(){
        return(matriculas.length-ocupadas);
    }
    
}
