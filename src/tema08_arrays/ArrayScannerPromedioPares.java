package tema08_arrays;
import java.util.Scanner;
// Ejemplo de lo que debe hacer el programa:
// Array: [10, 7, 4, 9, 6]

// Pares: 10, 4, 6
// Suma: 20
// Cantidad de pares: 3
// Promedio de pares: 6.666...
public class ArrayScannerPromedioPares {
    // Algoritmo: promedio de un subconjunto (solo los pares).
    // Se necesitan dos variables: la suma de los pares y cuántos pares hay.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros para el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        int suma = 0;
        int pares = 0;
        for (int numero : numeros) {
            // se cuentan y suman solo los pares (residuo 0 al dividir entre 2),
            // igual que en los demás ejercicios de pares
            if (numero % 2 == 0) {
                suma += numero;
                pares++;
            }
        }
        // si no hay pares, pares vale 0 y (double) suma / pares daría NaN (no es un número).
        // Por eso se comprueba antes de dividir, igual que en ArrayScannerMayorPares.
        if (pares > 0) {
            double promedio = (double) suma / pares;
            System.out.println("Cantidad de pares: " + pares);
            System.out.println("Promedio de pares: " + promedio);
        } else {
            System.out.println("No se detecto numeros pares");
        }
        scanner.close();
    }
}
