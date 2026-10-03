package tema08_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayScannerSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres guarda: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // con Arrays.
        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("Suma total del array: " + suma);

        // sin Arrays.
        System.out.println("Suma total del array: " + suma);

        scanner.close();
    }
}