package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerBuscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros tendra tu array: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero: " + ( i+ 1 ) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        System.out.print("Numero a buscar: ");
        int buscar = scanner.nextInt();

        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.print("Numero encontrado");
        } else {
            System.out.print("Numero no encontrado");
        }
        scanner.close();
    }
}
