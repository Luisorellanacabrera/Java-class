import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionTrabajadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // REQUISITO: Use una List<String> de trabajadores
        List<String> trabajadores = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("       GESTIÓN DE TRABAJADORES          ");
            System.out.println("========================================");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Eliminar trabajador");
            System.out.println("3. Mostrar lista completa");
            System.out.println("4. Mostrar total de trabajadores");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            // Validación de entrada para evitar errores si el usuario no escribe un número
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido del 1 al 5.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del teclado

            switch (opcion) {
                case 1:
                    // REQUISITO: Permita agregar nombres
                    System.out.print("Ingrese el nombre del trabajador: ");
                    String nuevoTrabajador = scanner.nextLine();
                    trabajadores.add(nuevoTrabajador);
                    System.out.println("-> '" + nuevoTrabajador + "' ha sido agregado correctamente.");
                    break;

                case 2:
                    // REQUISITO: Permita eliminar un nombre
                    System.out.print("Ingrese el nombre del trabajador que desea eliminar: ");
                    String trabajadorAEliminar = scanner.nextLine();

                    // El método .remove() devuelve true si encontró y eliminó al elemento
                    if (trabajadores.remove(trabajadorAEliminar)) {
                        System.out.println("-> '" + trabajadorAEliminar + "' ha sido eliminado.");
                    } else {
                        System.out.println("-> No se encontró a ningún trabajador con ese nombre.");
                    }
                    break;

                case 3:
                    // REQUISITO: Muestre la lista completa
                    System.out.println("\n--- Lista Completa de Trabajadores ---");
                    if (trabajadores.isEmpty()) {
                        System.out.println("(No hay trabajadores registrados en este momento)");
                    } else {
                        for (String empleado : trabajadores) {
                            System.out.println("- " + empleado);
                        }
                    }
                    break;

                case 4:
                    // REQUISITO: Muestre el total de trabajadores
                    System.out.println("\nTotal de trabajadores en la empresa: " + trabajadores.size());
                    break;

                case 5:
                    System.out.println("¡Programa finalizado! Que tenga un buen día.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}