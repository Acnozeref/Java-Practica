package tema08_arrays;

public class ArrayCompararTamaño {
    public static void main(String[] args) {
        // Practica comparar la longitud (length) de dos arrays,
        // sin mirar sus elementos.
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30};

        // length == length da true si tienen la misma cantidad de elementos.
        boolean mismoTamaño = numeros1.length == numeros2.length;

        // Aquí 5 != 3, así que imprime false por el segundo bloque.
        if (mismoTamaño) {
            System.out.println("Los arrays tienen el mismo tamaño: " + mismoTamaño);
        } else {
            System.out.println("Los arrays tienen el mismo tamaño: " + mismoTamaño);
        }
    }
}
