
package martin.matobuat06;
import java.time.LocalDate;
import java.time.temporal.*;

public class Alumno {
    
    private String nombre;
    private String DNI;
    private LocalDate fecha_nacimiento;
    static public String escuela;
    
    Alumno(String alumno, String dni, LocalDate nacimiento){
        this.nombre = alumno;
        this.DNI = dni;
        this.fecha_nacimiento = nacimiento;
    }
    
    String getNombre(){
        return(nombre);
    }
    
    String getDNI(){
        return(DNI);
    }
    
    LocalDate getFechaNacimiento(){
        return(this.fecha_nacimiento);
    }
    
    void setNombre(String nuevo_nombre){
        this.nombre = nuevo_nombre;
    }
    
    void setDNI(String nuevo_DNI){
        this.DNI = nuevo_DNI;
    }
    
    void setFechaNacimiento(LocalDate nueva_fecha){
        this.fecha_nacimiento = nueva_fecha;
    }
    
    boolean esMayorDeEdad(){
        return(this.fecha_nacimiento.until(LocalDate.now(),
               ChronoUnit.YEARS)>=18);
    }
    
    boolean esMayor(Alumno alumno){
        return(this.fecha_nacimiento.isBefore(alumno.getFechaNacimiento()));
    }
    
    boolean mismoAlumno(Alumno alumno){
        LocalDate fecha = alumno.getFechaNacimiento();
        return(this.nombre.equals(alumno.getNombre()) && 
               this.DNI.equals(alumno.getDNI()) &&
               this.fecha_nacimiento.isEqual(fecha));
    }
}
