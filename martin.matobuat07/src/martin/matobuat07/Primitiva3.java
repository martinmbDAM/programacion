package martin.matobuat07;

import java.util.Random;

public class Primitiva3 {

    private final int[] numeros;
    static private final int CIFRAS = 6;
    
    // Constructor:
    Primitiva3() {
        numeros = Primitiva3.generaBoleto();
    }

    // Método que recibe un boleto de la primitiva y devuelve el número de 
    // aciertos:
    int numAciertos(int[] boleto) {
        
        // Ordenamos el array:
        int posMin;
        for (int i = 0; i < CIFRAS - 1; i++) {
            //busqueda del menor
            posMin = i;
            for (int j = i + 1; j < CIFRAS; j++) {
                if (boleto[j] < boleto[posMin]) {
                    posMin = j;
                }
            }
            //intercambio del actual i con el menor
            int aux = boleto[i];
            boleto[i] = boleto[posMin];
            boleto[posMin] = aux;
        }
        
        int aciertos = 0;
        if (numeros.length == boleto.length) {

            for (int i = 0; i < boleto.length; i++) {

                // Búsqueda dicotómica:
                boolean encontrado = false, fin = false;
                int centro, inf = 0, sup = numeros.length - 1;
                int num = boleto[i];
                while (!encontrado && !fin) {
                    centro = (int) ((sup + inf) / 2);
                    if (num == numeros[centro]) {
                        encontrado = true;
                        aciertos++;
                    } else {
                        if (num < numeros[centro]) {
                            sup = centro - 1;
                        } else {
                            inf = centro + 1;
                        }
                        if (inf > sup) {
                            fin = true;
                        }
                    }
                }
            }

        }
        return (aciertos);
    }

    // Método para generar un boleto al azar sin repetidos:
    static int[] generaBoleto() {
        int[] boleto = new int[CIFRAS];

        Random aleatorio = new Random();

        for (int i = 0; i < CIFRAS; i++) {

            // Generamos números aleatorios hasta conseguir uno que no esté 
            // repetido y lo insertamos:
            int num;
            boolean repetido;
            do {
                num = aleatorio.nextInt(49) + 1;
                repetido = false;
                int j = 0;
                while (j < i && !repetido) {
                    repetido = num == boleto[j];
                    j++;
                }
            } while (repetido);
            boleto[i] = num;
        }

        // Ordenamos el array:
        int posMin;
        for (int i = 0; i < CIFRAS - 1; i++) {
            //busqueda del menor
            posMin = i;
            for (int j = i + 1; j < CIFRAS; j++) {
                if (boleto[j] < boleto[posMin]) {
                    posMin = j;
                }
            }
            //intercambio del actual i con el menor
            int aux = boleto[i];
            boleto[i] = boleto[posMin];
            boleto[posMin] = aux;
        }

        return (boleto);
    }

    // Método para leer el boleto:
    int[] getBoleto() {
        return (numeros);
    }

}
