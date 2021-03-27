/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba las clases fecha de Java.
 */
package martin.matobuat06;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.*;
import java.util.Scanner;
import java.time.Year;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.util.Locale;
import java.time.format.TextStyle;

public class martint06e09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables:
        int dia, mes, año;
        int horas, minutos, segundos;
        LocalDateTime fecha_y_hora;
        
        // Menú:        
        String [] argumentos = {"Apartado a","Apartado b","Apartado c",
                                "Apartado d","Apartado e","Apartado f",
                                "Apartado g","Apartado h"};

        int apartado = Menu.menu(argumentos);

        switch (apartado) {
            case 1:
                // a) Mostrar cuántos días han pasado desde mi nacimiento:
                System.out.println("--------------Apartado A-----------------");
                System.out.println("Fecha de nacimiento: ");
                System.out.print("Día: ");
                dia = teclado.nextInt();
                System.out.print("Mes: ");
                mes = teclado.nextInt();
                System.out.print("Año: ");
                año = teclado.nextInt();
                long Dias = LocalDate.of(año, mes, dia).until(LocalDate.now(),
                        ChronoUnit.DAYS);
                System.out.println("Días que han pasado desde mi nacimiento "
                        + "hasta hoy: " + Dias);
                break;
            case 2:
                // b) Introducir una fecha y un número de días y calcule la 
                //    fecha que se obtiene al incrementar dichos días a la 
                //    fecha:
                System.out.println("------------Apartado B-------------------");
                int cantidad;
                System.out.print("Día: ");
                dia = teclado.nextInt();
                System.out.print("Mes: ");
                mes = teclado.nextInt();
                System.out.print("Año: ");
                año = teclado.nextInt();
                System.out.print("Días a incrementar: ");
                cantidad = teclado.nextInt();

                System.out.println("Fecha original: " + 
                                   LocalDate.of(año, mes, dia));
                System.out.println("Fecha modificada: "
                        + LocalDate.of(año, mes, dia).plus(cantidad, 
                          ChronoUnit.DAYS));
                break;
            case 3:
                // c) Introducir dos horas de reloj y nos dé la diferencia entre 
                //    ambas en segundos:
                System.out.println("------------Apartado C-------------------");
                System.out.println("Primera hora de reloj: ");
                System.out.print("Horas: ");
                horas = teclado.nextInt();
                System.out.print("Minutos: ");
                minutos = teclado.nextInt();
                System.out.print("Segundos: ");
                segundos = teclado.nextInt();
                LocalTime fecha1 = LocalTime.of(horas, minutos, segundos);
                System.out.println("Segunda hora de reloj: ");
                System.out.print("Horas: ");
                horas = teclado.nextInt();
                System.out.print("Minutos: ");
                minutos = teclado.nextInt();
                System.out.print("Segundos: ");
                segundos = teclado.nextInt();
                LocalTime fecha2 = LocalTime.of(horas, minutos, segundos);

                // Asumimos que la primera fecha es menor. De no ser así, las 
                // intercambiamos:
                if (fecha1.isAfter(fecha2)) {

                    LocalTime fechaTemporal = fecha1;
                    fecha1 = fecha2;
                    fecha2 = fechaTemporal;
                }

                System.out.println("Diferencia en segundos: "
                        + fecha1.until(fecha2, ChronoUnit.SECONDS));
                break;
            case 4:
                // d) ¿Cuántos años bisiestos ha habido desde el año 1 dC? 
                System.out.println("------------Apartado D-------------------");
                int contador = 0;

                Year año1 = Year.of(1);
                Year año2 = Year.of(LocalDate.now().getYear());

                while (año2.isAfter(año1)) {

                    if (año1.isLeap()) {
                        contador++;
                    }
                    año1 = Year.of(año1.getValue() + 1);
                }

                System.out.println("Años bisiestos desde el 1dC: " + contador);
                break;
            case 5:
                System.out.println("--------------Apartado E-----------------");
                // e) Introducir una fecha y mostrar a qué día de la semana le
                // corresponde:
                System.out.print("Día: ");
                dia = teclado.nextInt();
                System.out.print("Mes: ");
                mes = teclado.nextInt();
                System.out.print("Año: ");
                año = teclado.nextInt();
                LocalDate fecha = LocalDate.of(año, mes, dia);
                System.out.println("Día de la semana: " + fecha.getDayOfWeek());
                break;
            case 6:
                System.out.println("--------------Apartado F-----------------");
                // f) Introducir un tipo de producto (1- perecedero, 
                // 2-electrónica, 3-ropa) y la fecha de compra, y que informe 
                // si se puede devolver a día de hoy o no (los plazos de
                // devolución, son respectivamente 5 horas, 6 meses, 15 días):
                int tipo;
                do {
                    System.out.print("Tipo de producto: ");
                    tipo = teclado.nextInt();
                } while (tipo < 1 || tipo > 3);
                do {
                    System.out.print("Día: ");
                    dia = teclado.nextInt();
                    System.out.print("Mes: ");
                    mes = teclado.nextInt();
                    System.out.print("Año: ");
                    año = teclado.nextInt();
                    System.out.print("Horas: ");
                    horas = teclado.nextInt();
                    System.out.print("Minutos: ");
                    minutos = teclado.nextInt();
                    System.out.print("Segundos: ");
                    segundos = teclado.nextInt();
                    fecha_y_hora = LocalDateTime.of(año, mes, dia, horas, 
                            minutos, segundos);
                } while (fecha_y_hora.isAfter(LocalDateTime.now()));

                boolean puede_devolver = false;
                switch (tipo) {
                    case 1:
                        puede_devolver = fecha_y_hora.until(LocalDateTime.now(),
                                ChronoUnit.HOURS) < 5;
                        break;
                    case 2:
                        puede_devolver = fecha_y_hora.until(LocalDateTime.now(),
                                ChronoUnit.MONTHS) < 6;
                        break;
                    case 3:
                        puede_devolver = fecha_y_hora.until(LocalDateTime.now(),
                                ChronoUnit.DAYS) < 15;
                        break;
                }

                if (puede_devolver) {
                    System.out.println("Puede devolver el producto");
                } else {
                    System.out.println("No puede devolver el producto");
                }
                break;
            case 7:
                System.out.println("------------Apartado G-------------------");
                // g) Introducir un año y decir cuántos domingos tiene:

                System.out.print("Año: ");
                año = teclado.nextInt();
                Year año_domingos = Year.of(año);
                fecha = LocalDate.of(año, 1, 1);

                while (fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    fecha = fecha.plus(1, ChronoUnit.DAYS);
                }

                // Cuándo encontremos el primer domingo, tenemos que sumar los
                // días de siete en siete:
                contador = 0;
                while (fecha.getYear() < (año_domingos.getValue() + 1)) {
                    contador++;
                    fecha = fecha.plus(7, ChronoUnit.DAYS);
                }

                System.out.println("Número de domingos del año "
                        + año_domingos.toString() + ": " + contador);
                break;
            case 8:
                // h) Indica el día de la semana (en texto, en gallego) del 31 
                // de diciembre de los últimos 5 años.
                System.out.println("------------Apartado G-------------------");
                Year año_inicio = Year.of(Year.now().getValue() - 4);
                Locale pais = new Locale("gl", "ES");
                while (año_inicio.getValue() <= Year.now().getValue()) {
                    fecha = LocalDate.of(año_inicio.getValue(), 12, 31);

                    System.out.println(año_inicio.toString() + ": "
                            + fecha.getDayOfWeek().getDisplayName(
                              TextStyle.FULL, pais));
                    año_inicio = año_inicio.plus(1, ChronoUnit.YEARS);
                }

        }

    }

}
