package tema08_arrays;
import java.util.Arrays;
public class ArrayEquals {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30};
        int[] numeros2 = {10, 20, 40};

        boolean resultado = Arrays.equals(numeros1, numeros2);
        System.out.println(resultado);
    }
}
