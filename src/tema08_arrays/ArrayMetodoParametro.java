package tema08_arrays;

public class ArrayMetodoParametro {

    // Un método que trabaja con un array de una dimensión recibido por parámetro.
    // El parámetro es int[] numeros (el array completo, no un número suelto).
    public static int contarPares(int[] numeros) {

        // Contador de elementos pares.
        int contador = 0;

        // En el for-each, "numero" es el VALOR de cada posición.
        // Ojo: hay que comprobar ese valor directamente (numero % 2 == 0).
        // Usarlo como índice (numeros[numero]) sería un error: tomaría un
        // valor del array como posición y podría no existir o dar un índice
        // fuera de rango (ArrayIndexOutOfBoundsException).
        for (int numero : numeros) {

            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 15, 20, 7, 8, 11};

        int resultado = contarPares(numeros);

        System.out.print("Cantidad de pares: " + resultado); // 3 (10, 20 y 8)

    }
}
