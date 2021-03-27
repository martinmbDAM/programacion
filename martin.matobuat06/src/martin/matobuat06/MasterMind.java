package martin.matobuat06;

import java.util.Random;

public class MasterMind {

    private String numero="";    // Número generado aleatoriamente
    private int intentos;        // Número de intentos
    boolean numero_acertado;     // Informa de si el número ha sido acertado

    // Constructor por defecto:
    MasterMind() {

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
        numero_acertado = false;
    }

    // Método que permite al usuario intentar adivinar el número. En primer 
    // lugar comprueba que la dimensión del String del usuario sea la adecuada
    // y que no haya repetidos. En ese caso, comprueba si ha adivinado, y si no 
    // lo ha hecho, resta un intento e informa al usuario de cuántos números ha 
    // acertado y cuántos de ellos están en la posición correcta:
    void adivinar(String numero_usuario) {
        String mensaje;

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
                if (this.numero.equals(numero_usuario)) {
                    mensaje = "¡Has acertado! El número era " + this.numero;
                    numero_acertado = true;
                } else {

                    int acertados = 0;
                    int posicion_correcta = 0;

                    for (int i = 0; i < this.numero.length(); i++) {
                        if (this.numero.indexOf(numero_usuario.charAt(i)) != -1) {
                            acertados++;
                            if (this.numero.charAt(i) == numero_usuario.charAt(i)) {
                                posicion_correcta++;
                            }
                        }
                    }

                    mensaje = acertados + " números acertados\n" + posicion_correcta
                            + " dígitos bien colocados\n" + (acertados
                            - posicion_correcta) + " dígitos mal colocados\n";

                    intentos--;
                    // Si era el último intento:
                    if (intentos == 0) {
                        mensaje += "\nHas agotado tus intentos. El número era "
                                + numero;
                    }
                }
            } else {
                mensaje = "ERROR: No puede haber números repetidos";
            }
        } else {
            mensaje = "ERROR: Longitud incorrecta";
        }

        System.out.println(mensaje);
    }

    // Método que informa de cuántos intentos quedan:
    int getIntentos() {
        return (intentos);
    }

    // Método que informa si el número se ha acertado:
    boolean numeroAcertado() {
        return (numero_acertado);
    }

    // Método que comprueba si el usuario ha agotado sus intentos:
    boolean finIntentos() {
        return (intentos == 0);
    }

}