import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculadora {

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            // En Java lanzamos una excepción en lugar de devolver un String
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return num1 / num2;
    }

    public static double pedirNumero(Scanner scanner) {
        double numero;
        while (true) {
            System.out.print("Ingrese un número: ");
            String input = scanner.nextLine();
            try {
                numero = Double.parseDouble(input);
                return numero; // Si la conversión es exitosa, retorna el número
            } catch (NumberFormatException e) {
                // Si el usuario ingresa letras, capturamos el error
                System.out.println("Debe ingresar un número valido");
            }
        }
    }

    // Usamos BiFunction para poder recibir un metodo (suma, resta, etc.) como parámetro
    public static void ejecutarCaso(BiFunction<Double, Double, Double> operacion, Scanner scanner) {
        double num1 = pedirNumero(scanner);
        double num2 = pedirNumero(scanner);
        try {
            double resultado = operacion.apply(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Resultado: " + e.getMessage());
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("5")) {
            System.out.println("\n### Calculadora ###");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    // Pasamos la referencia del método usando ::
                    ejecutarCaso(Calculadora::suma, scanner);
                    break;
                case "2":
                    ejecutarCaso(Calculadora::resta, scanner);
                    break;
                case "3":
                    ejecutarCaso(Calculadora::multiplicar, scanner);
                    break;
                case "4":
                    ejecutarCaso(Calculadora::dividir, scanner);
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
        scanner.close(); // Siempre es buena práctica cerrar el Scanner al final
    }

    public static void main(String[] args) {
        menu();
    }
}