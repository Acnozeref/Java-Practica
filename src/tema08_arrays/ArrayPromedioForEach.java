package tema08_arrays;

public class ArrayPromedioForEach {
    // Algoritmo: promedio = suma de todos los valores / cantidad de valores.
    // Misma idea que ArrayPromedio, pero recorriendo con for-each.
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        // acumulador de la suma
        int suma = 0;

        for (int numero: numeros) {
            suma += numero;
        }

        // recordar hacer casting y guardar el resultado
        // sin (double), int / int daría una división entera sin decimales
        // Resultado: Promedio: 30.0
        double promedio = (double) suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
}
