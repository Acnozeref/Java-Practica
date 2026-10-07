package tema08_arrays;

public class ArrayCompararSeguro {
    public static void main(String[] args) {
        // Versión "segura" de ArrayComparar: antes de comparar elemento a
        // elemento se verifica que ambos arrays tengan la misma longitud.
        // Si no, al usar el mismo índice en el array más corto se saldría de
        // rango (ArrayIndexOutOfBoundsException).
        int[] numeros1 = {10, 20, 30};
        int[] numeros2 = {10, 25, 30};

        // La comparación de longitudes da un boolean (true o false).
        boolean tamano = numeros1.length == numeros2.length;

        if (tamano) {
            // Mismo tamaño: es seguro recorrer ambos con el mismo índice.
            for (int i = 0; i < numeros1.length; i++) {
                if (numeros1[i] == numeros2[i]) {
                    System.out.println("Posicion " + i + ": Iguales");
                } else {
                    System.out.println("Posicion " + i + ": Diferentes");
                }
            }
        } else {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }
}
