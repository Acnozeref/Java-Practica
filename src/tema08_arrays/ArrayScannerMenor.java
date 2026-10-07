package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerMenor {
    // Algoritmo: buscar el menor (ver ArrayMenor) con datos que escribe el usuario.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de numeros en el Array: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i +1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        // el primer valor es el menor de partida
        int menor = numeros[0];

        for (int numero : numeros) {
            // si el actual es menor, reemplaza al menor guardado
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Numero menor: " + menor);
        scanner.close();
    }
}
