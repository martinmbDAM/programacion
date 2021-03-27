
package martin.matobuat06;
import java.time.LocalDate;

public class EjemplarLibro {
    
    public String titulo;
    public LocalDate fecha_adquisicion;
    public int num_ejemplar;
    private boolean prestado;
    
    // Constructor:
    EjemplarLibro(String el_titulo){
        this.titulo = el_titulo;
        this.fecha_adquisicion = LocalDate.now();
        this.num_ejemplar = 1;
        this.prestado = false;
    }
    
    EjemplarLibro(EjemplarLibro libro){
        this.titulo = libro.titulo;
        this.fecha_adquisicion = libro.fecha_adquisicion;
        this.num_ejemplar = libro.num_ejemplar+1;
        this.prestado = false;
    }
    
    boolean Prestar(){
        boolean se_puede_prestar = false;
        if (!this.prestado){
            this.prestado = true;
            se_puede_prestar = true;
        }
        return(se_puede_prestar);
    }
    
    boolean Devolver(){
        boolean se_puede_devolver = false;
        if (this.prestado){
            this.prestado = false;
            se_puede_devolver = true;
        }
        return(se_puede_devolver);
    }
    
    @Override
    public String toString(){
        String mensaje = String.format("%s - (%s) - [%d]",this.titulo,
               this.fecha_adquisicion.toString(),this.num_ejemplar);
        
        // Mostramos si el ejemplar está prestado o no:
        if (prestado){
            mensaje = mensaje + " - En préstamo";
        }
        else{
            mensaje = mensaje + " - Disponible";
        }
        return(mensaje);
    }
}
