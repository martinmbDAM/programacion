package martin.matobuat07;
import java.util.ArrayList;

public class carritoCompra2 {

    private final ArrayList<String[]> compras;  
    private double importe;         

    // Constructor:
    carritoCompra2() {
        compras = new ArrayList<>();
        importe = 0;               
    }

    // Método toString():
    String mostrarProductos() {
        String salida = "";
        
        if (compras.size()>0) {
            int pos = 0;

            while (pos<compras.size()) {
                String[]producto = compras.get(pos);
                pos++;
                salida = salida + "Producto " + pos + "\n"
                        + "Código: " + producto[0] + "\n"
                        + "Descripción: " + producto[1] + "\n"
                        + "Precio: " + producto[2] + "€\n"
                        + "Cantidad: " + producto[3] + "\n"
                        + "Precio total: " + String.format("%.2f€\n",
                                Double.parseDouble(producto[4]));
            }
            salida = salida + String.format("Importe total de la compra: %.2f€",
                                            importe);
        }

        return (salida);
    }

    // Método que permite añadir un producto:
    void añadirProducto(int código, String descripción, double precio,
            int cantidad) {
        
        // Añadimos un producto:
        String[]producto={Integer.toString(código), descripción, 
        Double.toString(precio),Integer.toString(cantidad),
        Double.toString(precio*cantidad)};
        
        compras.add(producto);

        // Modificamos el importe: 
        importe += precio * cantidad;

    }

    // Método que permite eliminar un producto:
    boolean eliminarProducto(int codigo) {
        
        // Buscamos el elemento que coincida con el código:
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<compras.size()){
            encontrado= compras.get(pos)[0].equals(Integer.toString(codigo));
            if (!encontrado){
                pos++;
            }
        }
        
        // Si hemos encontrado el elemento, lo borramos:
        if(encontrado){
            importe -= Double.parseDouble(compras.get(pos)[4]);
            compras.remove(pos);
        }
        
        return (encontrado);
    }
    
    // Método que permite vaciar el carrito:
    void vaciarCarrito(){
        compras.clear();
    }

}
