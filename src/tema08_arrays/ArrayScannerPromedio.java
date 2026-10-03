package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros desea para el array: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Inserta el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        double promedio = (double) suma / numeros.length;

        System.out.print("Promedio del array: " + promedio);

        scanner.close();
    }
}
