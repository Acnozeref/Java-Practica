package tema08_arrays;

public class ArrayContarIguales {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30, 35, 50};
        int iguales = 0;

        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] == numeros2[i]) {
                iguales++;
            }
        }
        System.out.println("Cantidad de posiciones iguales: " + iguales);
    }
}
