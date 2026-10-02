package tema08_arrays;

public class ArrayCompararSeguro {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30};
        int[] numeros2 = {10, 25, 30};

        boolean tamano = numeros1.length == numeros2.length;

        if (tamano) {
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
