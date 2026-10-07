package tema08_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayScanner {
    // Concepto: llenar un array con datos del usuario.
    // Primero se pide el tamaño, se crea el array con ese tamaño (new int[cantidad])
    // y después un for guarda cada valor leído en su índice.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres guarda: ");
        int cantidad = scanner.nextInt();

        // el tamaño del array se decide en tiempo de ejecución
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            // (i + 1) dice, empieza desde el numero 1 no afectando los índices
            // solo afecta al texto que ve el usuario, no al índice real del array.
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt(); // guarda el valor introducido
            numeros[i] = numero; // guarda correctamente el numero introducido al indice actual
        }
        // Arrays.toString muestra el contenido completo, p. ej. [4, 8, 15]
        System.out.println(Arrays.toString(numeros));
        scanner.close();
    }
}
