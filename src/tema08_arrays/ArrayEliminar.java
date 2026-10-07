package tema08_arrays;

import java.util.Arrays;

public class ArrayEliminar {
    // Concepto: un array tiene tamaño fijo, por eso para "eliminar" un elemento
    // se crea un array nuevo con una posición menos y se copian todos los valores menos el eliminado.
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        // índice del elemento que queremos quitar (aquí el 30)
        int posicion = 2;

        // el nuevo array tiene una posición menos
        int[] nuevo = new int[original.length - 1];

        // Completa aquí
        for (int i = 0; i < original.length; i++) {
            if (i < posicion) {
                // Antes de la posición a eliminar, los índices se mantienen igual
                nuevo[i] = original[i];
            } else if (i > posicion) {
                // Después de la posición, desplazamos el elemento original una posición atrás en el nuevo array
                // nos saltamos i == posicion
                // el elemento que está en original[i] debe guardarse en una posición anterior del nuevo array
                nuevo[i - 1] = original[i];
            }
        }
        // Resultado: [10, 20, 40, 50]
        System.out.println(Arrays.toString(nuevo));
    }
}
