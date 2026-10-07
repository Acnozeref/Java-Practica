package tema08_arrays;

// Arrays es una clase de utilidades de Java para trabajar con arrays;
// hay que importarla para poder usar sus métodos.
import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        // La búsqueda binaria encuentra un valor dividiendo el array a la mitad
        // en cada paso, por eso es más rápida que recorrer todo el array.
        // IMPORTANTE: solo funciona bien si el array está ORDENADO.
        int[] numeros = {50, 10, 40, 20, 30};

        int buscar = 40;

        // Arrays.sort(array) ordena el array de menor a mayor (modifica el original).
        // Queda {10, 20, 30, 40, 50}.
        Arrays.sort(numeros);

        // Arrays.binarySearch(array, valor) devuelve el índice donde está el valor.
        // Si no lo encuentra, devuelve un número negativo.
        // Aquí 40 está en el índice 3 del array ya ordenado.
        int posicion = Arrays.binarySearch(numeros, buscar);

        System.out.println("Numero encontrado en la posicion: " + posicion);


        // Cuando el valor no existe, el resultado es negativo (no es un índice válido).
        // Por eso, para que se lea mejor, comprobamos si es >= 0
        // y así mostramos un mensaje claro en lugar del número negativo.
        int buscarNoExiste = 99;

        int posicionNoExiste = Arrays.binarySearch(numeros, buscarNoExiste);

        if (posicionNoExiste >= 0) {
            System.out.println("Numero encontrado en la posicion: " + posicionNoExiste);
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}