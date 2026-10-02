package tema08_arrays;

public class ArraySumarPares {

    public static void main(String[] args) {

        int[] numeros = {10, 15, 8, 21, 30, 7};

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                suma += numeros[i];
            }
        }
        System.out.println("Suma de numeros pares: " + suma);
    }
}
