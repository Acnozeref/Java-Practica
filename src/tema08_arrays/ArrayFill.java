package tema08_arrays;
import java.util.Arrays;
public class ArrayFill {
    // Concepto: Arrays.fill rellena un array con un mismo valor, sin necesidad de un bucle.
    public static void main(String[] args) {
        // int[] numeros = new int[5];
        int [] numeros = {1, 2, 3, 4, 5};
        /* su función es llenar todo con el mismo valor o solo una parte */
        // Arrays.fill(array, valor);              -> rellena todo el array
        // Arrays.fill(array, inicio, fin, valor); -> rellena solo un rango
        // el índice fin no se modifica
        // inicio incluido, fin excluido
        // aquí se cambian los índices 1, 2 y 3
        Arrays.fill(numeros, 1, 4, 10);

        // toString para mostrar todos los valores de un array
        // Resultado: [1, 10, 10, 10, 5]
        System.out.println(Arrays.toString(numeros));
    }
}
