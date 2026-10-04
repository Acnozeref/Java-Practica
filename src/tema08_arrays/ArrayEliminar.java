package tema08_arrays;

import java.util.Arrays;

public class ArrayEliminar {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int posicion = 2;

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
        System.out.println(Arrays.toString(nuevo));
    }
}