package tema08_arrays;

public class ArrayParesForEach {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 8, 21, 30, 7};

        for (int numero: numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
