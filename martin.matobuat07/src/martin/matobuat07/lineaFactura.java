
package martin.matobuat07;

public class lineaFactura {
    
    private final String descripcion;
    private final float precio;
    private final int cantidad;
    private final float descuento;
    private final float importe;
    
    // Constructor:
    lineaFactura(String producto, float precio, int numero){
        this.descripcion = producto;
        this.precio = precio;
        this.cantidad = numero;
        this.descuento = 0.05f;
        
        if (cantidad > 10){
            importe = cantidad * precio * (1-descuento);
        }
        else{
            importe = cantidad * precio;
        }
    }
    
    // Método toString():
    String mostrarLinea(){
        String salida = "Producto: " + descripcion + 
                        "\nPrecio: " + Float.toString(precio) +
                        "\nCantidad: " + Integer.toString(cantidad) + 
                        "\nDescuento por más de 10 ud: " + 
                        Float.toString(descuento*100) + "%" +
                        "\nImporte total del producto: " + 
                        String.format("%.2f€", importe);        
        return(salida);
    }
    
    // Métodos para leer los atributos:
    String getDescripcion(){
        return(descripcion);
    }
    
    float getPrecio(){
        return(precio);
    }
    
    int getCantidad(){
        return(cantidad);
    }
    
    float getDescuento(){
        return(descuento);
    }
    
    float getImporte(){
        return(importe);
    }
    
}
