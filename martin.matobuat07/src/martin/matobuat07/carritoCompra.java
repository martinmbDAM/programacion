package martin.matobuat07;

public class carritoCompra {

    private final String[][] compras; // Array que almacena los productos
    private final int MAX = 100;      // Nº máximo de artículos
    private double importe;           // Importe de la compra
    private int articulos;            // Nº de artículos de la compra actual

    // Constructor:
    carritoCompra() {
        compras = new String[MAX][5];   // MAX productos con 5 atributos
        importe = 0;                    // Se inicializa el importe a 0
        articulos = 0;                  // Se inicializa el nº de artículos a 0
    }

    // Método toString():
    String mostrarProductos() {
        String salida = "";

        if (articulos > 0) {
            int pos = 0;

            while (pos < articulos) {

                salida = salida + "Producto " + (pos+1) + "\n"
                        + "Código: " + compras[pos][0] + "\n"
                        + "Descripción: " + compras[pos][1] + "\n"
                        + "Precio: " + compras[pos][2] + "€\n"
                        + "Cantidad: " + compras[pos][3] + "\n"
                        + "Precio total: " + String.format("%.2f€\n",
                                Double.parseDouble(compras[pos][4]));

                pos++;
            }
            salida = salida + String.format("Importe total de la compra: %.2f€",
                                            importe);
        }

        return (salida);
    }

    // Método que permite añadir un producto:
    boolean añadirProducto(int código, String descripción, double precio,
            int cantidad) {

        boolean se_puede_insertar = articulos < MAX;

        if (se_puede_insertar) {

            compras[articulos][0] = Integer.toString(código);
            compras[articulos][1] = descripción;
            compras[articulos][2] = Double.toString(precio);
            compras[articulos][3] = Integer.toString(cantidad);
            compras[articulos][4] = Double.toString(precio * cantidad);

            articulos++;

            // Modificamos el importe: 
            importe += precio * cantidad;
        }

        return (se_puede_insertar);
    }

    // Método que permite eliminar un producto:
    boolean eliminarProducto(int codigo) {

        boolean se_puede_eliminar = false;

        // Búscamos el código de producto, y si lo hay, copiamos el resto de
        // productos en las posiciones anteriores:
        int i = 0;
        boolean encontrado=false;
        while (i < articulos && !encontrado) {
            encontrado = compras[i][0].equals(Integer.toString(codigo));
            if (!encontrado){
                i++;
            }
        }

        // Si se ha encontrado el producto, lo eliminamos:
        if (encontrado) {

            se_puede_eliminar = true;

            importe -= Double.parseDouble(compras[i][4]);

            while (i < articulos-1) {
                compras[i][0] = compras[i+1][0];
                compras[i][1] = compras[i+1][1];
                compras[i][2] = compras[i+1][2];
                compras[i][3] = compras[i+1][3];
                compras[i][4] = compras[i+1][4];
                i++;
            }
            articulos--;
        }

        return (se_puede_eliminar);
    }

}
