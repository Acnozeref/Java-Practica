package tema08_arrays;

public class ArrayInverso {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        // length -1 'empezamos desde la ultima posicion del array'
        // length → cantidad de elementos
        // length - 1 → último índice
        // i >= 0 → continúa hasta llegar al índice 0
        // numeros[i] → obtiene el valor actual
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}