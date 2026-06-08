import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministradorDeFrutas {

    public static void main(String[] args) {
        // 1. Crear una lista de frutas y el Scanner
        Scanner sc = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();

        System.out.println("--- BIENVENIDO AL GESTOR DE FRUTAS ---");

        // Llamadas a las funciones modulares
        agregarFrutas(frutas, sc);
        mostrarFrutas(frutas);
        mostrarCantidad(frutas);
        reemplazarFruta(frutas, sc);
        eliminarFruta(frutas, sc);

        // 7. Mostrar resultado final
        System.out.println("\n--- RESULTADO FINAL ---");
        mostrarFrutas(frutas);

        // Importante: Cerrar el Scanner al finalizar el programa
        sc.close();
    }

    // 2. Función para agregar frutas
    static void agregarFrutas(List<String> frutas, Scanner sc) {
        System.out.println("\n[AGREGAR FRUTAS]");
        System.out.println("Ingresa las frutas una por una. (Escribe 'salir' para terminar)");

        while (true) {
            System.out.print("Fruta: ");
            String nuevaFruta = sc.nextLine();

            // Condición para romper el bucle
            if (nuevaFruta.equalsIgnoreCase("salir")) {
                break;
            }

            // Evitamos agregar cadenas vacías
            if (!nuevaFruta.trim().isEmpty()) {
                frutas.add(nuevaFruta);
            }
        }
    }

    // 3. Función para mostrar frutas
    static void mostrarFrutas(List<String> frutas) {
        System.out.println("\n[LISTA DE FRUTAS]");
        if (frutas.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < frutas.size(); i++) {
                System.out.println((i + 1) + ". " + frutas.get(i));
            }
        }
    }

    // 4. Función para mostrar la cantidad
    static void mostrarCantidad(List<String> frutas) {
        System.out.println("\n[CANTIDAD]");
        System.out.println("Actualmente hay " + frutas.size() + " fruta(s) en la lista.");
    }

    // 5. Función para reemplazar una fruta (con desafío opcional)
    static void reemplazarFruta(List<String> frutas, Scanner sc) {
        System.out.println("\n[REEMPLAZAR FRUTA]");
        System.out.print("Ingresa la fruta que deseas cambiar: ");
        String frutaAntigua = sc.nextLine();

        // Verificamos si la fruta existe en la lista
        if (frutas.contains(frutaAntigua)) {
            System.out.print("Ingresa la nueva fruta: ");
            String frutaNueva = sc.nextLine();

            // Obtenemos el índice de la fruta antigua para sobreescribirla
            int indice = frutas.indexOf(frutaAntigua);
            frutas.set(indice, frutaNueva);

            System.out.println("¡Fruta reemplazada con éxito!");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    // 6. Función para eliminar una fruta (con desafío opcional)
    static void eliminarFruta(List<String> frutas, Scanner sc) {
        System.out.println("\n[ELIMINAR FRUTA]");
        System.out.print("Ingresa la fruta que deseas eliminar: ");
        String frutaAEliminar = sc.nextLine();

        // Verificamos si la fruta existe antes de intentar borrarla
        if (frutas.contains(frutaAEliminar)) {
            frutas.remove(frutaAEliminar);
            System.out.println("¡Fruta eliminada con éxito!");
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }
}