package tema08_arrays;
import java.util.Arrays;
public class ArrayCopyOf {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copia = Arrays.copyOf(original, 3);

        System.out.println(Arrays.toString(copia));
    }
}
