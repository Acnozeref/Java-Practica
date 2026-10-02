package tema08_arrays;

public class ArrayMenor {

    public static void main(String[] args) {

        int[] numeros = {15, 8, 42, 23, 10};

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            // Si el valor actual es menor que el menor encontrado
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Numero menor: " + menor);
    }
}