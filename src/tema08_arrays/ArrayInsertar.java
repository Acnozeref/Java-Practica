package tema08_arrays;

import java.util.Arrays;

public class ArrayInsertar {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int posicion = 2;
        int valor = 25;

        // creamos un array con una posicion nueva antes de insertar
        int[] nuevo = new int[original.length + 1];

        // Completa aquí

        for (int i = 0; i < original.length; i++) {
            if (i < posicion) {
                nuevo[i] = original[i];
            } else if (i == posicion) {
                nuevo[i] = valor;
                nuevo[i + 1] = original[i];
            } else {
                nuevo[i + 1] = original[i];
            }
        }
        System.out.println(Arrays.toString(nuevo));
    }
}