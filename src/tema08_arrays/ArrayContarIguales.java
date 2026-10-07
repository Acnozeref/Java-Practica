package tema08_arrays;

public class ArrayContarIguales {
    public static void main(String[] args) {
        // Algoritmo de contador aplicado a dos arrays: cuenta en cuántas
        // posiciones los dos arrays tienen el mismo valor.
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30, 35, 50};
        // Contador: empieza en 0 y sube 1 cada vez que hay coincidencia.
        int iguales = 0;

        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] == numeros2[i]) {
                iguales++;
            }
        }
        // Coinciden las posiciones 0, 2 y 4 -> imprime 3.
        System.out.println("Cantidad de posiciones iguales: " + iguales);
    }
}
