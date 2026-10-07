package tema08_arrays;

public class ArrayContar {

    public static void main(String[] args) {

        // Algoritmo de contador: recorrer el array y sumar 1 cada vez que
        // un elemento cumple una condición.
        int[] numeros = {10, 20, 30, 20, 40, 20, 50};

        // Cuántas veces aparece el 20. El contador empieza en 0.
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                contador++;
            }
        }
        // El 20 está 3 veces -> imprime 3.
        System.out.println("Cuantas veces se encuentra 20: " + contador);
    }
}
