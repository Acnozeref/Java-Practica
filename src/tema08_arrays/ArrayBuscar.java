package tema08_arrays;

public class ArrayBuscar {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int buscado = 30;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
            }
        }

        System.out.println("Encontrado: " + encontrado);

    }

}
