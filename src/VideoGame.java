import java.util.ArrayList;

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

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   PARTE 1, 2 y 3: CREACION Y ENCAPSULACION      ");
        System.out.println("==================================================");
        
        // Crear un videojuego con constructor
        VideoGame juego1 = new VideoGame("Minecraft", "Sandbox", 20000);
        System.out.println("Informacion inicial de juego1:");
        juego1.showInfo();
        System.out.println();

        // Probar validaciones de encapsulación en setters
        System.out.println("Intentando asignar un precio valido (25000) a Minecraft...");
        juego1.setPrecio(25000);
        System.out.println("Precio final de Minecraft: $" + juego1.getPrecio());
        System.out.println();

        System.out.println("Intentando asignar un precio invalido (-500) a Minecraft...");
        juego1.setPrecio(-500);
        System.out.println("Precio final de Minecraft (se mantiene el anterior): $" + juego1.getPrecio());
        System.out.println();

        System.out.println("==================================================");
        System.out.println("     PARTE 4, 5 y 6: HERENCIA Y POLIMORFISMO     ");
        System.out.println("==================================================");

        // Crear una lista de videojuegos de tipo VideoGame (Polimorfismo)
        ArrayList<VideoGame> listaJuegos = new ArrayList<>();

        // Agregar distintos tipos de juegos (Herencia y Polimorfismo)
        listaJuegos.add(new VideoGame("FIFA", "Deportes", 35000));
        listaJuegos.add(new PCGame("Minecraft", "Sandbox", 20000, "Intel i5, 8GB RAM, GTX 1060"));
        listaJuegos.add(new ConsoleGame("Spider-Man 2", "Accion/Aventura", 50000, "PlayStation 5"));

        // Recorrer la lista y mostrar informacion junto con el calculo de descuentos
        for (VideoGame juego : listaJuegos) {
            System.out.println(juego.getNombre());
            System.out.println("Precio Original: " + (int)juego.getPrecio());
            System.out.println("Precio Final: " + (int)juego.calculateFinalPrice());
            System.out.println();
        }
    }
}
