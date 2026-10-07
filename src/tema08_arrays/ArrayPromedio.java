package tema08_arrays;

public class ArrayPromedio {
    // Algoritmo: promedio = suma de todos los valores / cantidad de valores.
    // Se necesita un acumulador (suma) y length para saber cuántos elementos hay.

    public static void main(String[] args) {

        // array a sacar promedio
        int[] numeros = {10, 20, 30, 40, 50};

        // suma de todos los números (acumulador)
        int suma = 0;

        // índice / condición / siguiente índice
        for (int i = 0; i < numeros.length; i++) {
            // cada elemento se suma a la variable suma
            suma += numeros[i];
        }

        // extraemos el promedio dividiendo entre la longitud del array
        // como los números del array son enteros,
        // se hace casting (double) para obtener un decimal.
        // Resultado: Promedio: 30.0
        double promedio = (double) suma /  numeros.length;

        System.out.println("Promedio: " + promedio);
    }

}
