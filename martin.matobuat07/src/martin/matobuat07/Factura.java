package martin.matobuat07;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.*;

public class Factura {

    private final String identificador;
    private final LocalDateTime fecha;
    private final int numCliente;
    private final float IVA;
    private final ArrayList<lineaFactura> lineas;
    private float importe;

    // Constructor:
    Factura(String id, int num) {
        this.identificador = id;
        fecha = LocalDateTime.now();
        this.numCliente = num;
        this.IVA = 0.21f;
        lineas = new ArrayList<>();
        this.importe = 0;
    }

    // Método que permite añadir una línea a la factura:
    void añadirLinea(String producto, float precio, int numero) {

        lineaFactura nueva_linea = new lineaFactura(producto, precio, numero);

        lineas.add(nueva_linea);
        
        this.importe += nueva_linea.getImporte();

    }

    // Método que permite eliminar una línea de la factura:
    boolean eliminarLinea(int num) {

        boolean encontrado = num < lineas.size();

        if (encontrado) {
            lineas.remove(num);
        }

        return (encontrado);
    }

    // Método que permite imprimir la factura:
    String imprimeFactura() {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd - "
                + "hh:mm:ss a");

        String salida = "";

        salida = salida + "\n\n***********************************************\n"
                + "Identificador de la factura: " + identificador
                + "\nFecha de la compra: " + f.format(fecha)
                + "\nNúmero de cliente: " + Integer.toString(numCliente)
                + "\n***********************************************\n"
                + "Productos comprados: \n\n";

        // Imprimimos las líneas de la factura:
        int pos = 0;
        while (pos < lineas.size()) {
            salida = salida + lineas.get(pos).mostrarLinea();
            
            if(pos!=(lineas.size()-1)){
                salida = salida + "\n\n";
            }
            
            pos++;
        }

        // Imprimimos el importe total:
        salida = salida + "\n***********************************************\n"
                + "Importe total (sin IVA): " + String.format("%.2f",importe)
                + "€" + "\nImporte total (con IVA): " 
                + String.format("%.2f",importe*(1+IVA)) + "€"
                + "\n***********************************************\n\n";
        return (salida);
    }

    // Método que devuelve las líneas de la factura:
    ArrayList<lineaFactura> getLineas() {
        return (lineas);
    }
    
    // Método que devuelve el identificador de una factura: 
    String getIdentificador(){
        return(identificador);
    }

}
