package tema08_arrays;

public class ArrayContar {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 20, 40, 20, 50};

        // cuantas veces se encuentra 20
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                contador++;
            }
        }
        System.out.println("Cuantas veces se encuentra 20: " + contador);
    }
}
