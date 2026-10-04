package tema08_arrays;
import java.util.Scanner;
// Array: [10, 7, 4, 9, 6]

// Pares: 10, 4, 6
// Suma: 20
// Cantidad de pares: 3
// Promedio de pares: 6.666...
public class ArrayScannerPromedioPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros para el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        int suma = 0;
        int pares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0 && numero > 0) {
                suma += numero;
                pares++;
            }
        }
        double promedio = (double) suma / pares;
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Promedio de pares: " + promedio);
        scanner.close();
    }
}
