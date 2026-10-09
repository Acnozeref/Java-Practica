package tema08_arrays;

import java.util.Arrays;

public class ArrayDeepToString {

    public static void main(String[] args) {

        // Arrays.deepToString(matriz) convierte una matriz entera en texto,
        // igual que Arrays.toString con los arrays de una sola dimensión,
        // sin necesidad de recorrerla con bucles.

        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        // muestra de forma rapida el contenido de la matriz
        System.out.print(Arrays.deepToString(matriz));
    }
}
