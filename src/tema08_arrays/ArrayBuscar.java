package tema08_arrays;

public class ArrayBuscar {

    public static void main(String[] args) {

        // Búsqueda lineal: se recorre el array comparando cada elemento
        // con el valor buscado. Se usa un boolean como bandera.
        int[] numeros = {10, 20, 30, 40, 50};
        int buscado = 30;
        // false = todavía no se ha encontrado.
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            // numeros[i] es el elemento de la posición i.
            if (numeros[i] == buscado) {
                encontrado = true;
            }
        }

        // Resultado: "Encontrado: true" (30 está en el array).
        System.out.println("Encontrado: " + encontrado);

    }

}
