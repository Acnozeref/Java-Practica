package tema08_arrays;

public class ArraySuma {

    public static void main(String[] args) {

        // Objetivo: sumar todos los números del array.
        int[] numeros = {10, 20, 30, 40, 50};

        // Acumulador: variable que va guardando la suma. Empieza en 0.
        int suma = 0;

        // i es el índice de cada número dentro del array (i = 0 es el 10).
        // El bucle se detiene cuando i llega a la longitud del array.
        // i++ pasa al siguiente número.
        for (int i = 0; i < numeros.length; i++) {
            // En cada vuelta se suma el elemento actual al acumulador:
            // 0 + 10 = 10, 10 + 20 = 30, 30 + 30 = 60, 60 + 40 = 100, 100 + 50 = 150
            suma += numeros[i];
        }
        // fin del ejercicio
        System.out.println("Suma de todos los numeros: " + suma); // 150

    }
}
