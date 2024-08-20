class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }
public String toString () {
    return "nombre: " + this.nombre + "\nprecio: " + this.precio + "\ncantidad: " + this.cantidad;


    }
}
