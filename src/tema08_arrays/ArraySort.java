package tema08_arrays;
import java.util.Arrays;
public class ArraySort {
    // Concepto: Arrays.sort(array) ordena el array de menor a mayor.
    // Modifica el mismo array (no crea uno nuevo).
    public static void main(String[] args) {
        int[] numeros = {40, 10, 50, 20, 30};
        // antes de ordenar: [40, 10, 50, 20, 30]
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        // después de ordenar: [10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(numeros));
    }
}
