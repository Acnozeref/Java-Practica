package tema08_arrays;

// Arrays es una clase de Java con utilidades para trabajar con arrays.
import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] copia = new int[5];

        // Se llena copia con los elementos de numeros en orden inverso:
        // en i = 0 toma el último (numeros.length - 1), en i = 1 el penúltimo, etc.
        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[numeros.length - 1 - i];
        }
        // Arrays.toString(array) convierte el contenido del array en un texto,
        // para mostrarlo sin recorrerlo manualmente.
        // Si se imprimiera el array directamente, saldría una dirección y no sus valores.
        System.out.println(Arrays.toString(copia)); // [50, 40, 30, 20, 10]
    }
}
