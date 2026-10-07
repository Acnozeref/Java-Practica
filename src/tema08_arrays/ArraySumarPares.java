package tema08_arrays;

public class ArraySumarPares {

    public static void main(String[] args) {

        // Objetivo: sumar solo los números pares.
        int[] numeros = {10, 15, 8, 21, 30, 7};

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            // Un número es par si el resto de dividirlo entre 2 es 0.
            // Solo los pares se suman al acumulador.
            if (numeros[i] % 2 == 0) {
                suma += numeros[i];
            }
        }
        System.out.println("Suma de numeros pares: " + suma); // 10 + 8 + 30 = 48
    }
}
