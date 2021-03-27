package martin.matobuat07;
import java.time.LocalDate;

public class Contacto {

    public String nombre;
    public long numero;
    public LocalDate fechaAltaAgenda;

    Contacto(String no, long nu, LocalDate fe) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = fe;
    }
    
    Contacto(String no, long nu){
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = LocalDate.now();
    }

}
