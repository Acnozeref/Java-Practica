package tema08_arrays;

public class ArrayComparar {
    public static void main(String[] args) {
        // Comparar dos arrays posición por posición: se recorren a la vez
        // usando el mismo índice i en ambos.
        // Aquí se asume que tienen el mismo tamaño (ver ArrayCompararSeguro).
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30, 35, 50};

        for (int i = 0; i < numeros1.length; i++) {
            // Con [i] accedemos al elemento de la misma posición en cada array.
            // numeros1.length solo da la cantidad de elementos; el índice
            // es el contador i, no la longitud.
            if (numeros1[i] == numeros2[i]) {
                System.out.println("Posicion " + i + ": Iguales");
            } else {
                System.out.println("Posicion " + i + ": Diferentes");
            }
        }
        // Salida: posiciones 0, 2 y 4 iguales; posiciones 1 y 3 diferentes.
    }
}
