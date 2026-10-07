package tema08_arrays;
import java.util.Arrays;
public class ArrayEquals {
    // Concepto: Arrays.equals(a, b) compara el contenido de dos arrays
    // (mismo tamaño y mismos valores en el mismo orden) y devuelve un boolean.
    // Con == solo se compararía si son el mismo array en memoria, no su contenido.
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30};
        int[] numeros2 = {10, 20, 40};

        boolean resultado = Arrays.equals(numeros1, numeros2);
        // Resultado: false (el último valor es distinto)
        System.out.println(resultado);
    }
}
