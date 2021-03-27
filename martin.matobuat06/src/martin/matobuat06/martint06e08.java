/*
 * Autor: Martín Mato Búa
 * @author martin.matobua
 * Grupo: DAM1 B
 * Fecha: 18 de Febrero de 2021
 * Descripción: Programa que prueba la clase EjemplarLibro.
 */
package martin.matobuat06;

public class martint06e08 {

    public static void main(String[] args) {
        
        // 4 libros:
        String titulo1 = "Don Quijote de la Mancha";
        String titulo2 = "Cien años de soledad";
        String titulo3 = "Crónica de una muerte anunciada";
        String titulo4 = "Romancero Gitano";
        
        // Creamos 3 ejemplares del primer libro:
        EjemplarLibro libro1ej1 = new EjemplarLibro(titulo1);
        EjemplarLibro libro1ej2 = new EjemplarLibro(libro1ej1);
        EjemplarLibro libro1ej3 = new EjemplarLibro(libro1ej2);
        
        // Creamos 1 ejemplar del segundo libro:
        EjemplarLibro libro2ej1 = new EjemplarLibro(titulo2);
        
        // Creamos 2 ejemplares del tercer libro:
        EjemplarLibro libro3ej1 = new EjemplarLibro(titulo3);
        EjemplarLibro libro3ej2 = new EjemplarLibro(libro3ej1);
        
        // Creamos 2 ejemplares del cuarto libro:
        EjemplarLibro libro4ej1 = new EjemplarLibro(titulo4);
        EjemplarLibro libro4ej2 = new EjemplarLibro(libro4ej1);
        
        /**********************************************************************/
        /**********************************************************************/
        
        // Para el primer libro prestamos el primer ejemplar, intentamos 
        // devolver el segundo y prestamos y devolvemos el tercero:
        System.out.println("Prestar el primer ejemplar del primer libro: ");
        if (libro1ej1.Prestar()){
            System.out.println("Prestado");
        }
        else{
            System.out.println("No se ha podido prestar");
        }
        
        System.out.println("Devolver el segundo ejemplar del primer libro: ");
        if (libro1ej2.Devolver()){
            System.out.println("Devuelto");
        }
        else{
            System.out.println("No se ha podido devolver");
        }
        
        System.out.println("Prestar el tercer ejemplar del primer libro: ");
        if (libro1ej3.Prestar()){
            System.out.println("Prestado");
        }
        else{
            System.out.println("No se ha podido prestar");
        }
        
        System.out.println("Devolver el tercer ejemplar del primer libro: ");
        if (libro1ej3.Devolver()){
            System.out.println("Devuleto");
        }
        else{
            System.out.println("No se ha podido devolver");
        }
        
        /**********************************************************************/
        /**********************************************************************/
        
        // Para el segundo libro, prestamos el único ejemplar:
        System.out.println("Prestar el primer ejemplar del segundo libro: ");
        if (libro2ej1.Prestar()){
            System.out.println("Prestado");
        }
        else{
            System.out.println("No se ha podido prestar");
        }
        
        /**********************************************************************/
        /**********************************************************************/
        
        // Para el tercer libro, intentamos devolver ambos ejemplares:
        System.out.println("Devolver el primer ejemplar del tercer libro: ");
        if (libro3ej1.Devolver()){
            System.out.println("Devuelto");
        }
        else{
            System.out.println("No se ha podido devolver");
        }
        
        System.out.println("Devolver el segundo ejemplar del tercer libro: ");
        if (libro3ej2.Devolver()){
            System.out.println("Devuelto");
        }
        else{
            System.out.println("No se ha podido devolver");
        }
        
        /**********************************************************************/
        /**********************************************************************/
        
        // Para el cuarto libro, prestamos ambos ejemplares y devolvemos el 
        // segundo:
        System.out.println("Prestar el primer ejemplar del cuarto libro: ");
        if (libro4ej1.Prestar()){
            System.out.println("Prestado");
        }
        else{
            System.out.println("No se ha podido prestar");
        }
        
        System.out.println("Prestar el segundo ejemplar del cuarto libro: ");
        if (libro4ej2.Prestar()){
            System.out.println("Prestado");
        }
        else{
            System.out.println("No se ha podido prestar");
        }
        
        System.out.println("Devolver el primer ejemplar del cuarto libro: ");
        if (libro4ej1.Devolver()){
            System.out.println("Devuelto");
        }
        else{
            System.out.println("No se ha podido devolver");
        }   
        
        /**********************************************************************/
        /**********************************************************************/
        
        // Mostramos los libros:
        System.out.println("Libros registrados: ");
        System.out.println(libro1ej1.toString());
        System.out.println(libro1ej2.toString());
        System.out.println(libro1ej3.toString());
        System.out.println(libro2ej1.toString());
        System.out.println(libro3ej1.toString());
        System.out.println(libro3ej2.toString());
        System.out.println(libro4ej1.toString());
        System.out.println(libro4ej2.toString());                
    }
    
}