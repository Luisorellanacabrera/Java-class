public class Main1 {
    public static void main(String[] args) {

        // Comentario de una linea
        /* Comentario de varias lineas */

        int numero = 50;
        System.out.println("Numero: " + numero);
        System.out.println("Hola Mundo");

        // Tipos de datos
        byte tipoByte = 127;

        short tipoShort = 32000;
        double tipoDouble = 1.6;
        boolean isValido = true;
        boolean hasCarnet = false;
        char tipoCaracter = 'a';
        String tipoString = "Kathy";

        var variable = 38;
        System.out.println(variable);
        variable = 23;
        System.out.println(variable);

        final double PI = 3.14; // Buena práctica trabajar con mayúsculas


        // Formas de imprimir y concatenar
        System.out.println(tipoString + " tengo " + numero + " años.");
        System.out.println("PI = " + PI);
        System.out.printf("Mi edad es %d, mi altura es %.2f, %s, es %b que la letra a es %c\n", numero, tipoDouble, tipoString, isValido, tipoCaracter);
        System.out.printf("""
                Usuario: %s
                Edad: %d
                Altura: %.2f
                Carnet: %b
                """, tipoString, numero, tipoDouble, hasCarnet);
        /*System.out.print("Hola Mundo");
        System.out.print("Voy a quedar pegadita arriba");

        System.out.print("Edad Kathy (" + numero + ")");
        System.out.printf("Edad Kathy (%d)", numero);
        */

    }
}
