package tema08_arrays;

public class ArrayParesForEach {
    // Práctica: for-each + filtro con if.
    // Un número es par si el residuo de dividirlo entre 2 es 0 (numero % 2 == 0).
    public static void main(String[] args) {
        int[] numeros = {10, 15, 8, 21, 30, 7};

        for (int numero: numeros) {
            // solo se muestran los pares: 10, 8 y 30
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
