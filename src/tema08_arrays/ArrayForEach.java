package tema08_arrays;

public class ArrayForEach {
    // Concepto: el for-each recorre el array elemento por elemento, sin usar índices.
    // Sintaxis: for (tipo variable : array) { ... }
    // Es más corto y seguro cuando solo necesitamos leer los valores.
    // Si necesitamos el índice (o modificar posiciones) se usa el for clásico.
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        // bucle simplificado
        // en el caso que no se trabaje por índices
        // Por cada numero dentro de numeros, haz esto
        // en cada vuelta, "numero" toma una copia del siguiente valor del array
        for (int numero: numeros) {
            System.out.println(numero);
        }
    }
}
