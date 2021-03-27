/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 30 de Noviembre de 2020
 * Descripción: Programa que recibe el sexo y la edad de cada uno de los 30 
 * trabajadores de una fábrica y muestra:
 *
 *  1. Edad y sexo del trabajador más joven
 *  2. Media de edad de las mujeres.
 *  3. Si hay algún trabajador con más de 60 años.
 *
 * Previamente se comprueba que las edades introducidas estén entre 16 y 70
 * años. Además, si el usuario introduce un 0 el programa terminará en ese
 * momento sin esperar a que se lean los 30 trabajadores.
 */
package martin.matobuat03parte2;

import java.util.Scanner;

public class martint03e25 {

    public static void main(String[] args) {

        // Declaración e inicialización de variables:
        char sexo;                // Sexo de cada trabajador
        char sexo_joven = '#';    // Sexo del trabajador más joven
        int edad = -1;            // Edad de cada trabajador
        int edad_joven = 71;      // Edad del trabajador más joven
        int trabajadores = 1;     // Contador de trabajadores
        int total_mujeres = 0;    // Total de mujeres
        int edad_mujeres = 0;     // Suma de la edad de las mujeres
        float media;              // Media de edad de las mujeres
        boolean mayor_60 = false; // Comprueba si hay trabajadores de más de 60
        Scanner teclado = new Scanner(System.in);

        // Se piden al usuario los datos de cada trabajador:
        while (trabajadores<=30 && edad!=0) {

            // Se verifica que la edad introducida esté en el rango correcto:
            do {
                System.out.printf("Edad del trabajador %d: ", trabajadores);
                edad = Integer.parseInt(teclado.nextLine());
            } while (edad!=0 && (edad<16 || edad>70));

            // Si el usuario introduce un 0 en la edad ya no se evalúa nada más:
            if (edad != 0) {
                // Se verifica que el sexo introducido sea correcto (se admiten
                // mayúsculas y minúsculas):
                do {
                    System.out.printf("Sexo del trabajador %d: ", trabajadores);
                    sexo = teclado.nextLine().charAt(0);
                } while (sexo!='H' && sexo!='M' && sexo!='h' && sexo!='m');

                // Si el trabajador introducido es el más joven se almacenan sus
                // datos:
                if (edad < edad_joven) {
                    edad_joven = edad;
                    sexo_joven = sexo;
                }

                // Si el trabajador es una mujer se almacenan sus datos:
                if (sexo == 'M' || sexo == 'm') {
                    total_mujeres++;
                    edad_mujeres += edad;
                }

                // Si el trabajador es mayor de 60 años, se cambia la bandera a
                // 'true':
                if (edad > 60) {
                    mayor_60 = true;
                }

                // Se incrementa el contador de trabajadores:
                trabajadores++;
            }

        }

        // Se muestran los resultados:
        System.out.print("\n----------------------------------");

        // Si el contador de trabajadores conserva su valor inicial singifica
        // que no se han metido datos:
        if (trabajadores > 1) {
            // Edad y sexo del más joven (para el sexo se admiten minúsculas en 
            // la entrada, pero en la salida se muestra siempre en mayúscula):
            System.out.println("\nTrabajador más joven: ");
            System.out.printf("Sexo: %c\n", Character.toUpperCase(sexo_joven));
            System.out.printf("Edad: %d", edad_joven);

            // Se calcula la media de edad de las mujeres, en caso de que se 
            // hayan introducido los datos de alguna trabajadora:
            if (total_mujeres > 0) {
                System.out.print("\nMedia de edad de las mujeres: ");
                media = (float) edad_mujeres / total_mujeres;
                System.out.printf("%.2f\n", media);
            } else {
                System.out.println("\nNo hay datos de las mujeres");
            }
            
            // Se comprueba si hay algún trabajador mayor de 60:
            if (mayor_60) {
                System.out.println("Hay algún trabajador mayor de 60");
            } else {
                System.out.println("No hay ningún trabajador mayor de 60");
            }
        }
        else{
            System.out.println("\nERROR: No hay datos");
        }

        System.out.println("----------------------------------");
    }

}
