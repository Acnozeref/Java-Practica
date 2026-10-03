package tema08_arrays;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] copia = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[numeros.length - 1 - i];
        }
        // muestra el contenido del array sin recorrerlo manualmente
        // .toString
        // convierte su contenido en una representación de texto para poder mostrarlo.
        System.out.println(Arrays.toString(copia));
    }
}
