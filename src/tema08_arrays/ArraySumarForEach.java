package tema08_arrays;

public class ArraySumarForEach {
    public static void main(String[] args) {
        // Mismo ejercicio que ArraySuma, pero con for-each:
        // más corto, porque no se necesita el índice.
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;

        // En cada vuelta, numero toma el valor del siguiente elemento.
        for (int numero: numeros) {
            suma += numero;
        }
        System.out.println("Suma: " + suma); // 150
    }
}
