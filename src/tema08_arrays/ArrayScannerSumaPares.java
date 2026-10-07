package tema08_arrays;
// Ejemplo de lo que debe hacer el programa:
// Array: [10, 7, 4, 9, 6]
// Suma de pares: 20

import java.util.Scanner;
public class ArrayScannerSumaPares {
    // Algoritmo: acumulador con filtro (solo se suma si el número es par).
    // Nota: la variable "pares" guarda la SUMA de los pares, no la cantidad.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos numeros en el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        // acumulador de la suma de los pares
        int pares = 0;
        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Inserta el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        for (int numero : numeros) {
            // par = residuo 0 al dividir entre 2
            if (numero % 2 == 0) {
                pares += numero;
            }
        }
        System.out.print("Suma de pares: " + pares);
        scanner.close();
    }
}
