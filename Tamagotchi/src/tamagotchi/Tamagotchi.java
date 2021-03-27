package tamagotchi;

import java.util.Random;
import java.time.LocalDateTime;
import java.time.temporal.*;
import java.util.ArrayList;

public class Tamagotchi {

    /**************************************************************************/
    // Constantes estáticas públicas de la clase Tamagotchi:    
    public static int TIEMPO_SIN_COMER = 30;  // Puede estar 30 seg sin comer
    public static int TIEMPO_SIN_HAMBRE = 20; // Puede estar 20 seg sin hambre
    public static int TIEMPO_EMPACHO = 5;     // Si come 2 veces en 5 seg muere
    public static int MIN_DORMIR = 10;        // Duerme como mínimo 10 seg
    public static int MAX_DORMIR = 20;        // Duerme como máximo 20 seg
    public static int TIEMPO_MEDICINA = 30;   // 30 seg enfermo como máximo
    public static int ENTRE_MEDICINAS = 10;   // 10 seg mínimo entre medicinas 
    public static int FIN_JUEGO = 7;          // Se gana a los 7 min con vida
    /**************************************************************************/

    /**************************************************************************/
    // Atributos privados de las instancias de la clase Tamagotchi:    
    private final String nombre;            // Nombre del Tamagotchi
    private final LocalDateTime fNacimiento;// Fecha de nacimiento
    private LocalDateTime fUltimaComida;    // Fecha de la última comida
    private LocalDateTime fEmpiezaDormir;   // Fecha en la que empieza a dormir
    private LocalDateTime fTerminaDormir;   // Fecha en la que termina de dormir
    private LocalDateTime fEnferma;         // Fecha en la que enferma
    private int cantidadMedicinas;          // Medicinas que ha tomado
    private LocalDateTime fPrimeraMedicina; // Fecha de la primera medicina
    private final String[] estadoString;    // Posibles estados del Tamagotchi
    private boolean[] estadoBoolean;        // Comprobación de los estados
    private int tiempoDurmiendo;            // Tiempo que ha dormido (en seg)
    /**************************************************************************/
    
    /**************************************************************************/
    // Constructor:
    Tamagotchi(String nombre_nacimiento) {

        // Registramos nombre y fecha de nacimiento:
        this.nombre = nombre_nacimiento;
        fNacimiento = LocalDateTime.now();

        // Inicializamos las medicinas a 0:
        cantidadMedicinas = 0;
        
        // Inicializamos el tiempo que ha dormido a 0:
        tiempoDurmiendo = 0;

        // Suponemos que come en el momento de su nacimiento:
        fUltimaComida = fNacimiento;

        // Inicializamos a null el resto de las fechas:        
        fEmpiezaDormir = null;
        fTerminaDormir = null;
        fEnferma = null;
        fPrimeraMedicina = null;

        // Creamos el Array con los 7 estados posibles del Tamagotchi:
        estadoString = new String[]{"MUERTO", "ENFERMO", "DURMIENDO", "TENGO "
            + "SUEÑO", "TENGO HAMBRE", "BIEN", "FIN JUEGO"};

        // Creamos el Array que define el estado del Tamagotchi, inicializando
        // todas las posiciones a 'false' excepto la que se corresponde con 
        // "BIEN":
        estadoBoolean = new boolean[]{false, false, false, false, false, true, 
                                      false};
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que devuelve el nombre del Tamagotchi:
    String getNombre() {
        return (nombre);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que devuelve la fecha de nacimiento:
    LocalDateTime getFechaNacimiento() {
        return (fNacimiento);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que devuelve el estado del Tamagotchi:
    ArrayList<String> getEstado() {

        ArrayList<String> estadoActual = new ArrayList<>();

        // Recorremos el Array lógico, y para cada valor "true" copiamos el 
        // equivalente del Array de Strings:
        for (int i = 0; i < estadoBoolean.length; i++) {
            if (estadoBoolean[i]) {
                estadoActual.add(estadoString[i]);
            }
        }

        return (estadoActual);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que permite comer al Tamagotchi. Devuelve si ha podido comer:
    boolean comer() {

        boolean ha_comido = false;

        // Comprobamos que no esté muerto, que no esté dormido, que no esté 
        // enfermo y que el juego no se haya acabado:
        if (!estadoBoolean[0] && !estadoBoolean[1] && !estadoBoolean[2] && 
            !estadoBoolean[6]) {

            // Si no se da ninguna de esas condiciones, puede comer:
            ha_comido = true;

            // Si ha comido hace poco, muere de empacho y termina el juego:
            if (fUltimaComida.until(LocalDateTime.now(), ChronoUnit.SECONDS)
                    < TIEMPO_EMPACHO) {

                estadoBoolean[0] = true;
                estadoBoolean[6] = true;

                for (int i = 1; i < 6; i++) {
                    estadoBoolean[i] = false;
                }

            } else {

                // Si no muere de empacho, actualizamos la fecha de la última
                // comida y hacemos que deje de tener hambre:
                fUltimaComida = LocalDateTime.now();
                estadoBoolean[4] = false;
            }

        }

        return (ha_comido);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que comprueba si el Tamagotchi tiene hambre:
    void tieneHambre() {
        // Si ha pasado el tiempo máximo desde la última comida, tiene hambre:
        if (fUltimaComida.until(LocalDateTime.now(), ChronoUnit.SECONDS)
                > TIEMPO_SIN_HAMBRE) {
            estadoBoolean[4] = true;
        }
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que puede hacer enfermar al Tamagotchi:
    void puedeEnfermar() {

        // Obtenemos dos números aleatorios entre 0 y 9. Si coinciden (hay una
        // probabilidad del 10%) el Tamagotchi enferma:
        Random aleatorio = new Random();
        int n1, n2;
        n1 = aleatorio.nextInt(10);
        n2 = aleatorio.nextInt(10);
        if (n1 == n2) {
            // El tamagotchi enferma:
            estadoBoolean[1] = true;
            estadoBoolean[5] = false;
            // Registramos la fecha en la que enferma:
            fEnferma = LocalDateTime.now();
        }
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que permite dormir al Tamagotchi. Devuelve si ha podido dormir:
    boolean dormir() {

        boolean puede_dormir = false;

        // Si el juego no se ha acabado, no está enfermo y no está muerto, puede 
        // dormir:
        if (!estadoBoolean[0] && !estadoBoolean[1] && !estadoBoolean[6]) {

            puede_dormir = true;

            // Generamos un número aleatorio para comprobar cuanto duerme:
            Random aleatorio = new Random();
            int num_dormir = aleatorio.nextInt(MIN_DORMIR) + 1 + 
                            (MAX_DORMIR - MIN_DORMIR);
            fEmpiezaDormir = LocalDateTime.now();
            fTerminaDormir = fEmpiezaDormir.plus(num_dormir,ChronoUnit.SECONDS);

            // El Tamagotchi se duerme: 
            estadoBoolean[2] = true;
            estadoBoolean[3] = false;
            
            // Actualizamos el tiempo que ha dormido:
            tiempoDurmiendo += num_dormir;
        }

        return (puede_dormir);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que permite al Tamagotchi despertar:
    void despierta() {

        if (estadoBoolean[2] && fTerminaDormir.isBefore(LocalDateTime.now())) {

            estadoBoolean[2] = false;
            fEmpiezaDormir = null;
            fTerminaDormir = null;

        }

    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que permite al usuario dar medicina al Tamagotchi. Devuelve "true"
    // si se le ha podido dar:
    boolean darMedicina() {

        boolean dosis_administrada = false;

        // Si no está enfermo, no se le puede dar la medicina:
        if (estadoBoolean[1]) {

            dosis_administrada = true;

            // Si no ha tomado medicinas, se le da la primera dosis:
            if (this.cantidadMedicinas == 0) {

                cantidadMedicinas++;
                fPrimeraMedicina = LocalDateTime.now();

            } else {

                // Si no ha pasado el tiempo suficiente desde la última dosis, 
                // se muere:
                if (fPrimeraMedicina.until(LocalDateTime.now(), 
                                           ChronoUnit.SECONDS)
                        < ENTRE_MEDICINAS) {
                    estadoBoolean[0] = true;
                    estadoBoolean[6] = true;

                    for (int i = 1; i < 6; i++) {
                        estadoBoolean[i] = false;
                    }
                } else {

                    // Si ha pasado el tiempo suficiente, se cura:
                    estadoBoolean[1] = false;
                    fEnferma = null;
                    fPrimeraMedicina = null;
                    cantidadMedicinas = 0;
                }
            }

        }

        return (dosis_administrada);
    }
    /**************************************************************************/

    /**************************************************************************/
    // Método que permite saber si el Tamagotchi está bien:
    void estaBien() {
        if (!estadoBoolean[0] && !estadoBoolean[1] && !estadoBoolean[3]
                && !estadoBoolean[4] && !estadoBoolean[6]) {
            estadoBoolean[5] = true;
        }
        else{
            estadoBoolean[5] = false;
        }
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que hace que el Tamagotchi se muera:
    void muere() {

        // Si hace demasiado tiempo que no come o si está enfermo durante
        // demasiado tiempo se muere: 
        if (fUltimaComida.until(LocalDateTime.now(), ChronoUnit.SECONDS)
                > TIEMPO_SIN_COMER || (estadoBoolean[1] && fEnferma.until(
                        LocalDateTime.now(), ChronoUnit.SECONDS) > 
                        TIEMPO_MEDICINA)) {

            estadoBoolean[0] = true;
            estadoBoolean[6] = true;

            for (int i = 1; i < 6; i++) {
                estadoBoolean[i] = false;
            }

        }

    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que comprueba si se ha acabado el juego:
    boolean juegoTerminado(){
        boolean terminado = false;
        if(fNacimiento.until(LocalDateTime.now(),ChronoUnit.MINUTES)>=7){
            terminado=true;
            estadoBoolean[6] = true;
            
            // Si no ha dormido lo suficiente, se muere de sueño: 
            if (tieneSueño()){
                estadoBoolean[0]=true;
            }
            else{
                for (int i = 0; i < 5; i++) {
                    estadoBoolean[i] = false;
                }
                estadoBoolean[5] = true;
            }
        }
        return(terminado);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método para comprobar si el Tamagotchi tiene sueño (si no ha dormido 
    // al menos el 25% de su tiempo de vida tiene sueño):
    boolean tieneSueño(){
        boolean somnoliento = false;
        
        // Si el juego no se ha terminado:
        if (!estadoBoolean[6]){
            
            long tiempoVivo = fNacimiento.until(LocalDateTime.now(),
                          ChronoUnit.SECONDS);
            
            if((tiempoDurmiendo * 100)/tiempoVivo < 25){
                
                // Tiene sueño:
                somnoliento = true;
                estadoBoolean[3] = somnoliento;
            }
        }
                
        return(somnoliento);
    }
    /**************************************************************************/
    
    /**************************************************************************/
    // Método que permite actualizar el estado del Tamagotchi:
    void actualizar(){
        
        despierta();
        tieneSueño();
        tieneHambre();
        estaBien();
        muere();
        juegoTerminado();
        
    }
    /**************************************************************************/
}
