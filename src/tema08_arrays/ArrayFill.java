package tema08_arrays;
import java.util.Arrays;
public class ArrayFill {
    public static void main(String[] args) {
        // int[] numeros = new int[5];
        int [] numeros = {1, 2, 3, 4, 5};
        /* su funcion es llenar todo del mismo valor o parcialmente */
        // Arrays.fill(array, inicio, fin, valor);
        // el índice fin no se modifica
        // inicio incluido, fin excluido
        Arrays.fill(numeros, 1, 4, 10);

        // toString para mostrar todos los valores de un array
        System.out.println(Arrays.toString(numeros));
    }
}