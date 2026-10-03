package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerMenor {
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

        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Numero menor: " + menor);
        scanner.close();
    }
}