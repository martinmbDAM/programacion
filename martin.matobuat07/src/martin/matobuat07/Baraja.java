
package martin.matobuat07;


public class Baraja {
    
    private final Carta[] cartas;
    private int tamaño;
    
    // Constructor:
    Baraja(){
        
        tamaño = 40;
        
        cartas = new Carta[tamaño];
        
        // Creamos las cartas de espadas:
        cartas[0] = new Carta("As de Espadas",1);
        for (int i = 1; i < 7; i++) {
            cartas[i] = new 
                        Carta((Integer.toString(i+1) + " de Espadas"),
                        (float)(i+1));
        }
        cartas[7] = new Carta("Sota de Espadas",0.5f);
        cartas[8] = new Carta("Caballo de Espadas",0.5f);
        cartas[9] = new Carta("Rey de Espadas",0.5f);
        
        // Creamos las cartas de oros:
        cartas[10] = new Carta("As de Oros",1);
        for (int i= 1; i<7; i++) {
            cartas[i+10] = new 
                        Carta((Integer.toString(i+1) + " de Oros"),
                        (float)(i+1));
        }
        cartas[17] = new Carta("Sota de Oros",0.5f);
        cartas[18] = new Carta("Caballo de Oros",0.5f);
        cartas[19] = new Carta("Rey de Oros",0.5f);
        
        // Creamos las cartas de copas:
        cartas[20] = new Carta("As de Copas",1);
        for (int i = 1; i < 7; i++) {
            cartas[i+20] = new 
                        Carta((Integer.toString(i+1) + " de Copas"),
                        (float)(i+1));
        }
        cartas[27] = new Carta("Sota de Copas",0.5f);
        cartas[28] = new Carta("Caballo de Copas",0.5f);
        cartas[29] = new Carta("Rey de Copas",0.5f);
        
        // Creamos las cartas de bastos:
        cartas[30] = new Carta("As de Bastos",1);
        for (int i = 1; i < 7; i++) {
            cartas[i+30] = new 
                        Carta((Integer.toString(i+1) + " de Bastos"),
                        (float)(i+1));
        }
        cartas[37] = new Carta("Sota de Bastos",0.5f);
        cartas[38] = new Carta("Caballo de Bastos",0.5f);
        cartas[39] = new Carta("Rey de Bastos",0.5f);
        
    }
    
    // Método que devuelve la baraja de cartas:
    Carta[] getBaraja(){
        return(cartas);
    }
    
    // Método que elimina una carta:
    void eliminarCarta(Carta unaCarta){
        boolean encontrada = false;
        int i = 0;
        while(i<tamaño && !encontrada){
            encontrada = cartas[i].getNombre().equals(unaCarta.getNombre())  && 
                         cartas[i].getValor() == unaCarta.getValor();
            if(!encontrada){
                i++;
            }
        }
        if (encontrada){
            for (int j = i; j < tamaño-1; j++) {
                cartas[j].setNombre(cartas[j+1].getNombre());
                cartas[j].setValor(cartas[j+1].getValor());
            }
            tamaño--;
        }
    }
    
    // Devuelve el tamaño de la baraja:
    int getTamaño(){
        return(tamaño);
    }
    
}