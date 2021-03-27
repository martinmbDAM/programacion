/*
 * Autor: Martín Mato Búa
 * Grupo: DAM1 B
 * Fecha: 24 de marzo de 2021
 * Descripción: main del ejercicio 7.28
 */
package martin.matobuat07;
import java.time.LocalDate;

public class martint07e28 {

    public static void main(String[] args) {

        Contacto[] agenda = new Contacto[10];
        agenda[0] = new Contacto("Marta", 6661111222L, LocalDate.parse(
                "2019-11-25"));
        agenda[1] = new Contacto("Miguel", 1111111L, LocalDate.now());
        agenda[2] = new Contacto("Ana", 3333333L, 
                LocalDate.parse("2019-11-20"));
        agenda[3] = new Contacto("Daniel", 444444L);
        

    }

}
