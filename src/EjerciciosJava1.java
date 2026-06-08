import java.util.Scanner;

public class EjerciciosJava1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- EJERCICIOS DE JAVA ---");
        System.out.println("Descomenta el método en el código para probar cada ejercicio.");

// --- BÁSICOS ---
        ejercicio1(scanner);
        ejercicio2(scanner);
        ejercicio3(scanner);
        ejercicio4(scanner);

        // --- CONDICIONALES ---
        ejercicio5(scanner);
        ejercicio6(scanner);
        ejercicio7(scanner);
        ejercicio8(scanner);
        ejercicio9(scanner);
        ejercicio10(scanner);

        // --- STRING ---
        ejercicio11(scanner);
        ejercicio12(scanner);
        ejercicio13(scanner);
        ejercicio14(scanner);

        // --- BUCLES ---
        ejercicio15();
        ejercicio16(scanner);
        ejercicio17(scanner);
        ejercicio18();
        ejercicio19(scanner);
        ejercicio20(scanner);

        scanner.close();
    }

    // ==========================================
    // EJERCICIOS BÁSICOS
    // ==========================================

    public static void ejercicio1(Scanner scanner) {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu año de nacimiento: ");
        int anio = scanner.nextInt();

        // Asumiendo el año actual como 2026 (o cámbialo al que necesites)
        int edad = 2026 - anio;
        System.out.println("\nHola " + nombre + ", tienes aproximadamente " + edad + " años.");
    }

    public static void ejercicio2(Scanner scanner) {
        System.out.print("Ingresa la temperatura en Celsius: ");
        double c = scanner.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.printf("La temperatura en Fahrenheit es: %.2f\n", f);
    }

    public static void ejercicio3(Scanner scanner) {
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static void ejercicio4(Scanner scanner) {
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingresa el porcentaje de descuento: ");
        double porcentaje = scanner.nextDouble();

        double descuentoAplicado = precio * (porcentaje / 100);
        double precioFinal = precio - descuentoAplicado;

        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Precio final: $" + precioFinal);
    }

    // ==========================================
    // CONDICIONALES
    // ==========================================

    public static void ejercicio5(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public static void ejercicio6(Scanner scanner) {
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

    public static void ejercicio7(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es Par.");
        } else {
            System.out.println("El número es Impar.");
        }
    }

    public static void ejercicio8(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    public static void ejercicio9(Scanner scanner) {
        System.out.print("Ingresa número 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingresa número 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingresa operador (+, -, *, /): ");
        String op = scanner.next();

        switch (op) {
            case "+": System.out.println("Resultado: " + (n1 + n2)); break;
            case "-": System.out.println("Resultado: " + (n1 - n2)); break;
            case "*": System.out.println("Resultado: " + (n1 * n2)); break;
            case "/":
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Error: División por cero.");
                break;
            default: System.out.println("Operador no válido.");
        }
    }

    public static void ejercicio10(Scanner scanner) {
        System.out.print("Ingresa la nota (1.0 a 7.0): ");
        double nota = scanner.nextDouble();

        if (nota >= 1.0 && nota <= 3.9) {
            System.out.println("Reprobado");
        } else if (nota >= 4.0 && nota <= 5.9) {
            System.out.println("Aprobado");
        } else if (nota >= 6.0 && nota <= 7.0) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota fuera de rango.");
        }
    }

    // ==========================================
    // STRING
    // ==========================================

    public static void ejercicio11(Scanner scanner) {
        System.out.print("Ingresa un nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("El nombre tiene " + nombre.length() + " caracteres.");
    }

    public static void ejercicio12(Scanner scanner) {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        System.out.println("Iniciales: " + inicialNombre + inicialApellido);
    }

    public static void ejercicio13(Scanner scanner) {
        System.out.print("Ingresa la contraseña: ");
        String password = scanner.nextLine();
        if (password.equals("java123")) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    public static void ejercicio14(Scanner scanner) {
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());
    }

    // ==========================================
    // BUCLES
    // ==========================================

    public static void ejercicio15() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio16(Scanner scanner) {
        System.out.print("Ingresa un número para ver su tabla: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void ejercicio17(Scanner scanner) {
        System.out.print("Ingresa un número N: ");
        int n = scanner.nextInt();
        int suma = 0;
        System.out.print("Suma: ");
        for (int i = 1; i <= n; i++) {
            suma += i;
            System.out.print(i + (i < n ? " + " : " = "));
        }
        System.out.println(suma);
    }

    public static void ejercicio18() {
        System.out.println("Números pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ejercicio19(Scanner scanner) {
        int secreto = 7;
        int intento = 0;

        System.out.println("¡Adivina el número secreto!");
        while (intento != secreto) {
            System.out.print("Ingresa un número: ");
            intento = scanner.nextInt();
            if (intento != secreto) {
                System.out.println("Incorrecto, intenta de nuevo.");
            }
        }
        System.out.println("¡Felicidades! Adivinaste el número.");
    }

    public static void ejercicio20(Scanner scanner) {
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha ficticia");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! ¿Cómo estás?");
                    break;
                case 2:
                    System.out.println("La fecha ficticia es: 02 de Junio de 2026");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}