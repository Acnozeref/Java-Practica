package tema08_arrays;
import java.util.Arrays;
public class ArrayCopyOf {
    // Concepto: Arrays.copyOf(array, nuevoTamaño) devuelve un array nuevo con una copia del original.
    // - Si el nuevo tamaño es menor, se copian solo los primeros elementos.
    // - Si es mayor, las posiciones sobrantes se rellenan con el valor por defecto (0 en int).
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        // copiamos solo las 3 primeras posiciones del original
        int[] copia = Arrays.copyOf(original, 3);

        // Resultado: [10, 20, 30]
        System.out.println(Arrays.toString(copia));
    }
}
