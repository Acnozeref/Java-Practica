package tema08_arrays;

public class ArrayContarMayores {

    public static void main(String[] args) {

        int[] numeros = {10, 25, 8, 40, 15, 30};
        int limite = 20;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > limite) {
                contador++;
            }
        }
        System.out.println("Cantidad de números mayores que " + limite + ": " + contador);
    }
}
