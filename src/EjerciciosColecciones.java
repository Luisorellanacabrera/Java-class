import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("      MENÚ DE EJERCICIOS DE JAVA        ");
            System.out.println("========================================");
            System.out.println("1. Ejercicio 1: ArrayList (Productos)");
            System.out.println("2. Ejercicio 2: Set (Usuarios Únicos)");
            System.out.println("3. Ejercicio 3: Map (Agenda Telefónica)");
            System.out.println("4. Ejercicio 4: Stream (Filtrar Notas)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido del 1 al 5.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer del teclado

            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
                case 3:
                    ejercicio3(scanner);
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    System.out.println("¡Programa finalizado con éxito! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // --- Ejercicio 1: ArrayList - Registro de Productos ---
    private static void ejercicio1(Scanner scanner) {
        System.out.println("\n--- EJERCICIO 1: ARRAYLIST (PRODUCTOS) ---");
        List<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();
            productos.add(producto);
        }

        System.out.println("\n--- Productos Registrados ---");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        System.out.println("Total de productos ingresados: " + productos.size());
    }

    // --- Ejercicio 2: Set - Registro de Usuarios Únicos ---
    private static void ejercicio2(Scanner scanner) {
        System.out.println("\n--- EJERCICIO 2: SET (USUARIOS ÚNICOS) ---");
        HashSet<String> usuarios = new HashSet<>();

        System.out.print("¿Cuántos usuarios desea registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre de usuario " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            boolean seAgrego = usuarios.add(nombre);
            if (!seAgrego) {
                System.out.println("-> Usuario repetido. No se agregará.");
            }
        }

        System.out.println("\n--- Usuarios Únicos Registrados ---");
        for (String usuario : usuarios) {
            System.out.println("- " + usuario);
        }

        System.out.println("Total de usuarios únicos: " + usuarios.size());
    }

    // --- Ejercicio 3: Map - Agenda Telefónica ---
    private static void ejercicio3(Scanner scanner) {
        System.out.println("\n--- EJERCICIO 3: MAP (AGENDA TELEFÓNICA) ---");
        HashMap<String, String> agenda = new HashMap<>();

        System.out.println("Por favor, registre 5 contactos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del contacto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Teléfono de " + nombre + ": ");
            String telefono = scanner.nextLine();

            agenda.put(nombre, telefono);
        }

        System.out.println("\n--- Todos los Contactos Registrados ---");
        for (var contacto : agenda.entrySet()) {
            System.out.println("Nombre: " + contacto.getKey() + " | Teléfono: " + contacto.getValue());
        }

        System.out.println("\n--- Búsqueda de Teléfono ---");
        System.out.print("Ingrese un nombre para buscar su teléfono: ");
        String buscarNombre = scanner.nextLine();

        if (agenda.containsKey(buscarNombre)) {
            System.out.println("El teléfono de " + buscarNombre + " es: " + agenda.get(buscarNombre));
        } else {
            System.out.println("El contacto '" + buscarNombre + "' no existe en la agenda.");
        }
    }

    // --- Ejercicio 4: Stream - Filtrar Notas Aprobadas ---
    private static void ejercicio4() {
        System.out.println("\n--- EJERCICIO 4: STREAM (FILTRAR NOTAS) ---");
        List<Double> notas = new ArrayList<>();

        // Agregamos notas de prueba automáticamente
        notas.add(3.5);
        notas.add(4.2);
        notas.add(5.5);
        notas.add(2.8);
        notas.add(4.0);
        notas.add(6.8);
        notas.add(1.5);

        System.out.println("Lista completa de notas cargadas: " + notas);
        System.out.println("\n--- Notas Aprobadas (>= 4.0) ---");

        // Filtrar y mostrar usando Streams
        notas.stream()
                .filter(nota -> nota >= 4.0)
                .forEach(nota -> System.out.println("- " + nota));

        // Contar aprobados usando Streams
        long aprobados = notas.stream()
                .filter(nota -> nota >= 4.0)
                .count();

        System.out.println("\nTotal de notas aprobadas: " + aprobados);
    }
}