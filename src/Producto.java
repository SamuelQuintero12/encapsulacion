package tallerEncapsulacion;

public class Producto {

    private String nombre;
    private double precio;
    private double cantidadStock;

    // Constructor
    public Producto(String nombre, double precio, double cantidadStock) {
        this.nombre = nombre;
        setPrecio(precio); // Using setter to ensure price validation
        setCantidadStock(cantidadStock); // Using setter for stock validation
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {  // Corrected to 'setNombre'
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio ingresado debe ser positivo.");
        }
    }

    public double getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(double cantidadStock) {
        if (cantidadStock >= 0) {  // Allowing stock to be zero, but not negative
            this.cantidadStock = cantidadStock;
        } else {
            System.out.println("La cantidad de stock debe ser positiva o cero.");
        }
    }

    // Method to display product details
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidadStock);
    }
}
