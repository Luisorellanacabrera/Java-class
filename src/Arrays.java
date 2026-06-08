public class Arrays {
    public static void main(String[] args) {
        int[] numeros =  new int[3]; // 0 por default
        String[] nombres = new String[4]; // null por default
        String[] usuarios = {"Luis", "Pedro", "Camilo", "Max"};

        System.out.println(usuarios[0]);
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        numeros[numeros.length-1] = 2;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

            int tamanio = numeros.length;
            System.out.println(tamanio);



    }
}
