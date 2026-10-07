package tema08_arrays;

public class ArrayContarMayores {

    public static void main(String[] args) {

        // Contador con una condición de comparación (>) en lugar de igualdad:
        // cuenta cuántos elementos superan un límite.
        int[] numeros = {10, 25, 8, 40, 15, 30};
        int limite = 20;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > limite) {
                contador++;
            }
        }
        // Mayores que 20: 25, 40 y 30 -> imprime 3.
        System.out.println("Cantidad de números mayores que " + limite + ": " + contador);
    }
}
