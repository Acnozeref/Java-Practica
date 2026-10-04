package tema08_arrays;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] numeros = {50, 10, 40, 20, 30};

        int buscar = 40;

        Arrays.sort(numeros);

        // Devuelve el índice del valor buscado
        // Si no lo encuentra, devuelve un valor negativo
        int posicion = Arrays.binarySearch(numeros, buscar);

        System.out.println("Numero encontrado en la posicion: " + posicion);


        // Resultado en base a si el numero no se encuentra
        // devuelve un numero negativo
        // podemos simplificarlo para mejor lectura
        int buscarNoExiste = 99;

        int posicionNoExiste = Arrays.binarySearch(numeros, buscarNoExiste);

        if (posicionNoExiste >= 0) {
            System.out.println("Numero encontrado en la posicion: " + posicionNoExiste);
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}