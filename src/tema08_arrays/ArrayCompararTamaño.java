package tema08_arrays;

public class ArrayCompararTamaño {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {10, 25, 30};

        boolean mismoTamaño = numeros1.length == numeros2.length;

        if (mismoTamaño) {
            System.out.println("Los arrays tienen el mismo tamaño: " + mismoTamaño);
        } else {
            System.out.println("Los arrays tienen el mismo tamaño: " + mismoTamaño);
        }
    }
}
