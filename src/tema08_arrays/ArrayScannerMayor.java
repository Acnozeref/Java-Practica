package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros en el Array: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i +1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        scanner.close();
    }
}