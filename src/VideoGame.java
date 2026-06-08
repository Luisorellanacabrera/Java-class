public class VideoGame {
    private String nombre;
    private String genero;
    private double precio;

    // Constructor
    public VideoGame(String nombre, String genero, double precio) {
        this.nombre = nombre;
        this.genero = genero;
        setPrecio(precio); // Usar el setter para validar el precio inicial
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    // Validación del precio (no menor o igual a 0)
    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error: El precio para '" + nombre + "' debe ser mayor que 0. Intento de asignar: " + precio);
        } else {
            this.precio = precio;
        }
    }

    // Método showInfo
    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Precio: " + precio);
    }

    // Método para calcular precio final (sin descuento por defecto)
    public double calculateFinalPrice() {
        return precio;
    }
}
