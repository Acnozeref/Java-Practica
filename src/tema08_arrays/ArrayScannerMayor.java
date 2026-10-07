package tema08_arrays;
import java.util.Scanner;
public class ArrayScannerMayor {
    // Algoritmo: buscar el mayor (ver ArrayMayor) con datos que escribe el usuario.
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

        // empezamos con el primer valor como mayor (así funciona también con negativos)
        // ojo: si cantidad es 0, numeros[0] no existe y el programa falla
        int mayor = numeros[0];

        for (int numero : numeros) {
            // si el actual es mayor, reemplaza al mayor guardado
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        scanner.close();
    }
}
