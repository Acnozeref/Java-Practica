package tema08_arrays;

import java.util.Arrays;

public class ArrayInsertar {
    // Concepto: como el tamaño de un array no cambia, para insertar un valor
    // se crea un array con una posición más y se copian los elementos,
    // desplazando una posición a la derecha los que quedan desde la posición de inserción.
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        // índice donde queremos insertar y valor que se insertará
        int posicion = 2;
        int valor = 25;

        // creamos un array con una posicion nueva antes de insertar
        int[] nuevo = new int[original.length + 1];

        // Completa aquí

        for (int i = 0; i < original.length; i++) {
            if (i < posicion) {
                // antes de la posición todo queda igual
                nuevo[i] = original[i];
            } else if (i == posicion) {
                // en la posición guardamos el valor nuevo
                // y el elemento original que estaba ahí pasa un lugar a la derecha
                nuevo[i] = valor;
                nuevo[i + 1] = original[i];
            } else {
                // después de la posición, cada elemento se desplaza un lugar a la derecha
                nuevo[i + 1] = original[i];
            }
        }
        // Resultado: [10, 20, 25, 30, 40, 50]
        System.out.println(Arrays.toString(nuevo));
    }
}
