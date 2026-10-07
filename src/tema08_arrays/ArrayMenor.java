package tema08_arrays;

public class ArrayMenor {
    // Algoritmo: buscar el menor (igual que ArrayMayor, pero con < en la comparación).

    public static void main(String[] args) {

        int[] numeros = {15, 8, 42, 23, 10};

        // empezamos suponiendo que el primero es el menor
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            // Si el valor actual es menor que el menor encontrado
            if (numeros[i] < menor) {
                // lo reemplazamos
                menor = numeros[i];
            }
        }
        // Resultado: Numero menor: 8
        System.out.println("Numero menor: " + menor);
    }
}
