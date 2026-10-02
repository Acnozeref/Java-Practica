package tema08_arrays;

public class ArrayComparar {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30, 35, 50};

        for (int i = 0; i < numeros1.length; i++) {
            // con [i] accedemos a los indices de cada array
            // numeros1.lenght es solo la longitud, no se toma muy en cuenta para idices
            if (numeros1[i] == numeros2[i]) {
                System.out.println("Posicion " + i + ": Iguales");
            } else {
                System.out.println("Posicion " + i + ": Diferentes");
            }
        }
    }
}
