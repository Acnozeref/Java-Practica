package tema08_arrays;

public class ArrayCopiar {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        // int[] copia = new int[3];
        int[] copia = new int[5];

        // cambiamos la condicion del temano
        for (int i = 0; i < original.length; i++) {
            // aquí copiarás el elemento
            // cada indice de copia sera igual a cada indice de original
            // obtenemos el indice del original en orden inverso
            copia[i] = original[original.length - 1 - i];
        }
        // comprobamos que si se copiaron los valores recorriendo
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Comprobacion de copia: " + copia[i]);
        }
    }
}