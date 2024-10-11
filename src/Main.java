import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList();

        productos.add(new Producto("Manzanas", 3500.0, 45));
        productos.add(new Producto("Papas Margarita", 6500.0, 45));
        productos.add(new Producto("Gaseosa Postobon", 6500.0, 45));

        System.out.println("Lista inicial de productos:");
        for (Producto producto : productos) {
            producto.mostrarProducto();
            System.out.println("----------------");
        }

        productos.get(1).setCantidadStock(70);

        productos.remove(2);

        System.out.println("\nProductos Actualizados\n----------------");
        for (Producto producto : productos) {
            producto.mostrarProducto();
            System.out.println("----------------");
        }

        String nombreBuscado = JOptionPane.showInputDialog("Ingresa el nombre del producto que deseas encontrar: ");

        boolean productoEncontrado = false;


        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("\nEl producto ha sido encontrado\n");
                producto.mostrarProducto();
                productoEncontrado = true;
                break;
            }
        }


        if (!productoEncontrado) {
            System.out.println("El producto no existe.");
        }
    }
}
