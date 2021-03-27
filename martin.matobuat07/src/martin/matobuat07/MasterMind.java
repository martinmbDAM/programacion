package martin.matobuat07;

import java.util.Random;
import java.util.ArrayList;

public class MasterMind {

    private String numero = "";  // Número generado aleatoriamente
    private int intentos;        // Número de intentos
    private int digitos;         // Número de dígitos
    boolean numero_acertado;     // Informa de si el número ha sido acertado
    ArrayList<ArrayList<String>> usuario; // Números del usuario

    // Constructor por defecto:
    MasterMind() {
        // Creación del array de intentos del usuario:
        usuario = new ArrayList<>();
        
        // Creación de los arrays que contienen los detalles de los intentos 
        // (combinación, aciertos y fallos):
        for (int i = 0; i < 3; i++) {
            usuario.add(new ArrayList<>());
        }

        Random aleatorio = new Random();

        // Por defecto tenemos 10 intentos:
        this.intentos = 10;

        // Por defecto usamos 4 dígitos:
        while (numero.length() != 4) {
            int n;
            char c;
            do {
                n = aleatorio.nextInt(10) + 48;
                c = (char) n;
            } while (numero.indexOf(c) != -1);
            numero = numero + c;
        }

        numero_acertado = false;
    }

    // Constructor alternativo:
    MasterMind(int num_intentos, int num_digitos) {
        
        // Creación del array de intentos del usuario:
        usuario = new ArrayList<>();
        
        // Creación de los arrays que contienen los detalles de los intentos 
        // (combinación, aciertos y fallos):
        for (int i = 0; i < 3; i++) {
            usuario.add(new ArrayList<>());
        }

        Random aleatorio = new Random();

        // Número de intentos:
        this.intentos = num_intentos;

        // Usamos el número de dígitos que introduzca el usuario:
        while (numero.length() != num_digitos) {
            int n;
            char c;
            do {
                n = aleatorio.nextInt(10) + 48;
                c = (char) n;
            } while (numero.indexOf(c) != -1);
            numero = numero + c;
        }
        
        digitos = num_digitos;
        
        numero_acertado = false;
    }

    // Método que permite al usuario intentar adivinar el número. 
    void adivinar(String numero_usuario) {

        if (numero_usuario.length() == this.numero.length()) {
            boolean sin_repetidos = true;
            int pos = 0;

            // Comprobamos si hay repetidos:
            while (sin_repetidos && pos < numero_usuario.length() - 1) {
                sin_repetidos = numero_usuario.indexOf(numero_usuario.charAt(pos),
                        pos + 1) == -1;
                pos++;
            }

            if (sin_repetidos) {

                // Almacenamos los números en la primera lista y la cantidad de
                // aciertos en la segunda:
                int aciertos = 0;

                usuario.get(0).add(numero_usuario);
                for (int i = 0; i < numero.length(); i++) {
                    if (usuario.get(0).get(usuario.get(0).size() - 1).contains(
                            Character.toString(numero.charAt(i)))) {
                        aciertos++;
                    }
                }
                
                // Comprobamos cuántos de los aciertos están bien colocados:
                int aciertos_bien_colocados=0;
                
                for (int i = 0; i < numero.length(); i++) {
                    if(numero.charAt(i)==numero_usuario.charAt(i)){
                        aciertos_bien_colocados++;
                    }
                }
                
                usuario.get(1).add(Integer.toString(aciertos_bien_colocados));
                usuario.get(2).add(Integer.toString(
                        digitos-aciertos_bien_colocados));

                if (aciertos == digitos) {
                    numero_acertado = true;
                } else {
                    intentos--;
                }

                imprimeIntentos();
            }
        }

    }

    // Método que informa si el número se ha acertado:
    boolean numeroAcertado() {
        return (numero_acertado);
    }

    // Método que comprueba si el usuario ha agotado sus intentos:
    boolean finIntentos() {
        return (intentos == 0);
    }

    // Método que imprime los intentos del usuario:
    void imprimeIntentos() {

        int pos = 0;

        System.out.println("N  intento  ok  mal");
        System.out.println("==================");

        while (pos < usuario.get(0).size()) {
            
            System.out.printf("%02d  ",(pos+1));
            System.out.println(usuario.get(0).get(pos) + "    " +
                    usuario.get(1).get(pos) + "    " + usuario.get(2).get(pos));
            pos++;
        }

    }
    
    // Método que devuelve los intentos que quedan:
    int getIntentos(){
        return(intentos);
    }
    
    // Método que devuelve el número:
    String getNumero(){
        return(numero);
    }

}
