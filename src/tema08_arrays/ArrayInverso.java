package tema08_arrays;

public class ArrayInverso {
    // Concepto: recorrer un array al revés, empezando por el último índice
    // y bajando de uno en uno hasta llegar al 0 (i-- en lugar de i++).
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        // length -1 'empezamos desde la ultima posicion del array'
        // length → cantidad de elementos
        // length - 1 → último índice
        // i >= 0 → continúa hasta llegar al índice 0
        // numeros[i] → obtiene el valor actual
        // Resultado: 50, 40, 30, 20, 10 (uno por línea)
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
