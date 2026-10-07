package tema08_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayScannerSuma {
    // Algoritmo: sumar todos los elementos con un acumulador (suma += elemento).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres guarda: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        // acumulador: empieza en 0 y en cada vuelta se le suma el elemento actual
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // con Arrays.
        // Arrays.toString permite mostrar el array completo, p. ej. [1, 2, 3]
        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("Suma total del array: " + suma);

        // sin Arrays.
        // (muestra la misma suma, no se usa Arrays.toString)
        System.out.println("Suma total del array: " + suma);

        scanner.close();
    }
}
