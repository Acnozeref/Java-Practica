package tema08_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres guarda: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            // (i + 1) dice, empieza desde el numero 1 no afecando los indices
            // solo afecta al texto que ve el usuario, no al índice real del array.
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt(); // guarda el valor introducido
            numeros[i] = numero; // guarda correctamente el numero introducido al indice actual
        }
        System.out.println(Arrays.toString(numeros));
        scanner.close();
    }
}
