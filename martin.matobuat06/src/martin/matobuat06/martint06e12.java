/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase Alumno.
 */
package martin.matobuat06;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.*;

public class martint06e12 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nombre de la escuela: ");
        Alumno.escuela = teclado.nextLine();
        
        String nombre, dni;
        int dia, mes, año;
        
        // Introducimos 3 alumnos: 
        
        System.out.println("-----------------Alumno 1--------------------");
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        System.out.print("DNI: ");
        dni = teclado.nextLine();
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Día: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Año: ");
        año = teclado.nextInt();
        
        // Limpiamos el buffer:
        teclado.nextLine();
        
        // Creación del primer alumno: 
        Alumno alumno1 = new Alumno(nombre, dni, LocalDate.of(año,mes,dia));
        
        System.out.println("-----------------Alumno 2--------------------");
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        System.out.print("DNI: ");
        dni = teclado.nextLine();
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Día: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Año: ");
        año = teclado.nextInt();
        
        // Limpiamos el buffer:
        teclado.nextLine();
        
        // Creación del segundo alumno: 
        Alumno alumno2 = new Alumno(nombre, dni, LocalDate.of(año,mes,dia));
        
        System.out.println("-----------------Alumno 3--------------------");
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        System.out.print("DNI: ");
        dni = teclado.nextLine();
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Día: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Año: ");
        año = teclado.nextInt();
        
        // Creación del tercer alumno: 
        Alumno alumno3 = new Alumno(nombre, dni, LocalDate.of(año,mes,dia));
        
        // Comprobamos los métodos 'get' con el primer alumno:
        System.out.println("-----------Datos del primer alumno--------------");
        System.out.println("Escuela: " + Alumno.escuela);
        System.out.println("Nombre " + alumno1.getNombre());
        System.out.println("DNI: " + alumno1.getDNI());
        System.out.println("Fecha de nacimiento: " + 
                           alumno1.getFechaNacimiento().toString());
        
        // Comprobamos si los alumnos son mayores de edad:
        System.out.println("-----------Alumnos mayores de edad---------------");
        if (alumno1.esMayorDeEdad()){
            System.out.println(alumno1.getNombre());
        }
        if (alumno2.esMayorDeEdad()){
            System.out.println(alumno2.getNombre());
        }
        if(alumno3.esMayorDeEdad()){
            System.out.println(alumno3.getNombre());
        }
        
        // Comprobamos el método 'set' copiando en el primer alumno los datos
        // del tercero:
        alumno1.setNombre(alumno3.getNombre());
        alumno1.setDNI(alumno3.getDNI());
        alumno1.setFechaNacimiento(alumno3.getFechaNacimiento());
        
        System.out.println("-----------Datos del primer alumno--------------");
        System.out.println("Nombre " + alumno1.getNombre());
        System.out.println("DNI: " + alumno1.getDNI());
        System.out.println("Fecha de nacimiento: " + 
                           alumno1.getFechaNacimiento().toString());
        
        // Comprobamos si el método 'mismoAlumno' funciona comparando al primer
        // alumno con el tercero:
        if (alumno1.mismoAlumno(alumno3)){
            System.out.println("El primer y tercer alumno son la misma "
                    + "persona");
        }
        
        // Comprobamos si el método 'mayor' funciona modificando los datos del 
        // segundo alumno para garantizar que sea menor que el primer alumno:
        LocalDate fecha = alumno1.getFechaNacimiento().plus(1,ChronoUnit.DAYS);
        alumno2.setFechaNacimiento(fecha);
        if (alumno1.esMayor(alumno2)){
            System.out.println("El primer alumno es mayor que el segundo");
        }
        
    }
    
}