package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerBuscar {
    // Algoritmo: saber si un valor existe en el array (búsqueda con bandera boolean).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros tendra tu array: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero: " + ( i+ 1 ) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        System.out.print("Numero a buscar: ");
        int buscar = scanner.nextInt();

        // bandera: pasa a true solo si encontramos el número
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscar) {
                encontrado = true;
                // ya lo encontramos, no hace falta seguir recorriendo
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
