package tema08_arrays;
// Array: [10, 7, 4, 9, 6]
// Suma de pares: 20

import java.util.Scanner;
public class ArrayScannerSumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos numeros en el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Inserta el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares += numero;
            }
        }
        System.out.print("Suma de pares: " + pares);
        scanner.close();
    }
}
