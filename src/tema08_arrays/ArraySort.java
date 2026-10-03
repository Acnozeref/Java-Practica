package tema08_arrays;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int[] numeros = {40, 10, 50, 20, 30};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
