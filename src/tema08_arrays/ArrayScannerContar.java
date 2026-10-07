// Ejemplo de lo que debe hacer el programa:
// Array: [10, 20, 10, 30, 10]
//
// Numero a buscar: 10
//
// El numero aparece 3 veces
package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerContar {
    // Algoritmo: contar cuántas veces aparece un valor (contador que se incrementa en cada coincidencia).
    // A diferencia de buscar, aquí NO se usa break porque hay que revisar todos los elementos.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros en el array: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        System.out.print("Numero a contar: ");
        int buscar = scanner.nextInt();
        // contador de apariciones
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
