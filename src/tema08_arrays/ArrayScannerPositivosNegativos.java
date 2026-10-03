//Array: [-5, 10, -2, 8, 0, -7]
//
//Positivos: 2
//Negativos: 3
//Ceros: 1
package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros del array: ");
        int cantidad = scanner.nextInt();
        int [] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        scanner.close();
    }
}
