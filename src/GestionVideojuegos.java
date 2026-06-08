import java.util.ArrayList;

public class GestionVideojuegos {
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
