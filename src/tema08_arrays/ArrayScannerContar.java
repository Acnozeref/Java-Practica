//Array: [10, 20, 10, 30, 10]
//
//        Numero a buscar: 10
//
//        El numero aparece 3 veces
package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerContar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros en el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        System.out.print("Numero a contar: ");
        int buscar = scanner.nextInt();
        int contador = 0;
        for (int numero : numeros) {
            if (numero == buscar) {
                contador++;
            }
        }
        System.out.print("El numero aparece " + contador + " veces.");
        scanner.close();
    }
}